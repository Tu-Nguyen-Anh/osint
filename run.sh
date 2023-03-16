#!/bin/bash
mvn clean package -DtestSkip=true
release="release"
cd $release
mkdir "log"
nohup java -jar profiling-0.0.1-SNAPSHOT.jar > ./log/profiling.log 2>&1 &

#check process run
if [ $? -eq 0 ];
then
    echo "Profiling start success"
else
    echo "Profiling start fail"
fi
echo $! > profiling.pid

