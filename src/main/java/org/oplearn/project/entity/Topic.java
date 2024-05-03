package org.oplearn.project.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;


@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Data
@Document("topics")
public class Topic {
  @Field("id")
  @JsonFormat
  private String id;
  @Field("name")
  private String name;
  @Field("is_deleted")
  private boolean isDeleted;

  public static Topic from (String name){
    return Topic.of(UUID.randomUUID().toString(), name, false);
  }

}
