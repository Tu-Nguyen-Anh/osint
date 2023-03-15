package com.ncsgroup.profiling.exception.base;


import static com.ncsgroup.profiling.constanst.ProfilingConstants.StatusException.BAD_REQUEST;

public class BadRequestException extends BaseException {
  public BadRequestException() {
    setCode("com.ncsgroup.profiling.exception.base.BadRequestException");
    setStatus(BAD_REQUEST);
  }
}
