package org.oplearn.project.base;


import static org.oplearn.project.constanst.OpLearnConstants.MessageException.DEFAULT_CODE_BAD_REQUEST;
import static org.oplearn.project.constanst.OpLearnConstants.StatusException.BAD_REQUEST;
import static org.oplearn.project.constanst.OpLearnConstants.CommonConstants.*;

public class BadRequestException extends BaseException {
  public BadRequestException() {
    super(DEFAULT_CODE_BAD_REQUEST, BAD_REQUEST_MESSAGE, BAD_REQUEST, null);
  }
}
