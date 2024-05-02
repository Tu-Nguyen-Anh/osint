package org.oplearn.project.dto.response;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentResponse {
  private String id;
  private String name;
  private String admin;
  private Integer totalMember;
}
