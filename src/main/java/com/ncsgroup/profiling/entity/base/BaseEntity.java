package com.ncsgroup.profiling.entity.base;


import liquibase.repackaged.org.apache.commons.lang3.StringUtils;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
  @Id
  private String id;

  @CreatedBy
  private String createBy;

  @CreatedDate
  private Long createAt;

  @PrePersist
  public void ensureId() {
    this.id = StringUtils.isBlank(this.id) ? UUID.randomUUID().toString() : this.id;
  }

}

