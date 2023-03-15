package com.ncsgroup.profiling.exception.base;


import static com.ncsgroup.profiling.constanst.ProfilingConstants.StatusException.NOT_FOUND;

public class NotFoundException extends BaseException {
  public NotFoundException(String id, String objectName) {
    setCode("com.ncsgroup.profiling.exception.base.NotFoundException");
    setStatus(NOT_FOUND);
    addParam("id", id);
    addParam("objectName", objectName);
  }
}
