package org.oplearn.project.entity;

import lombok.*;
import org.oplearn.project.entity.base.AuditEntity;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("topics")
public class Topic extends AuditEntity {
  private String name;

}
