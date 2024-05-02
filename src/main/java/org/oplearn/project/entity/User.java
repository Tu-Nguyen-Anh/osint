package org.oplearn.project.entity;

import lombok.*;
import org.oplearn.project.entity.base.AuditEntity;
import org.oplearn.project.entity.enums.Role;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("users")
public class User extends AuditEntity {
  @Field("username")
  private String username;
  @Field("full_name")
  private String fullName;
  private String email;
  @Field("phone_number")
  private String phoneNumber;
  @Field("role")
  private Role role;
  @Field("topic_ids")
  private List<String> topicIds;
  @Field("department_ids")
  private List<String> departmentIds;

}
