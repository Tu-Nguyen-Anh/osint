package org.oplearn.project.entity;

import lombok.*;
import org.oplearn.project.entity.base.AuditEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.lang.annotation.Documented;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("departments")
public class Department extends AuditEntity {
  @Field("name")
  private String name;
  @Field("admin")
  private List<String> adminId;
  @Field("member_id")
  private List<String> memberId;
  @Field("total_member")
  private Integer totalMember;



}
