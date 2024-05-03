package org.oplearn.project.repository;

import org.oplearn.project.entity.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TopicRepository extends MongoRepository<Topic, String> {
}
