package com.ncsgroup.profiling.entity.base;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public abstract class BaseEntityWithUpdater extends BaseEntity {
  @LastModifiedBy
  private String lastUpdatedBy;
  @LastModifiedDate
  private Long lasUpdatedAt;

}
