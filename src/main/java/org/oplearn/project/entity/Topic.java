package org.oplearn.project.entity;

import lombok.*;
import org.oplearn.project.entity.base.AuditEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("topics")
public class Topic extends AuditEntity {
  @Field("name")
  private String name;
  @Field("is_deleted")
  private boolean isDeleted;

}
