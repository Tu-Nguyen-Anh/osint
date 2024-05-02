package org.oplearn.project.dto.request;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageRequest {
  private Integer page;
  private Integer size;
  private String keyword;
}
