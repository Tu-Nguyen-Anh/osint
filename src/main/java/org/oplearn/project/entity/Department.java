package org.oplearn.project.entity;

import lombok.*;
import org.oplearn.project.entity.base.AuditEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department extends AuditEntity {
  private String name;
  private String admin;
  private Integer totalMember;
}
