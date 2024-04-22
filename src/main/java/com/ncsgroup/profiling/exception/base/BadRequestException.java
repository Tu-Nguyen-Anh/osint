package com.ncsgroup.profiling.exception.base;


import static com.ncsgroup.profiling.constanst.ProfilingConstants.MessageException.DEFAULT_CODE_BAD_REQUEST;
import static com.ncsgroup.profiling.constanst.ProfilingConstants.StatusException.BAD_REQUEST;
import static com.ncsgroup.profiling.constanst.ProfilingConstants.CommonConstants.*;

public class BadRequestException extends BaseException {
  public BadRequestException() {
    super(DEFAULT_CODE_BAD_REQUEST, BAD_REQUEST_MESSAGE, BAD_REQUEST, null);
  }
}
