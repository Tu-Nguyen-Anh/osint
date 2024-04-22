package com.ncsgroup.profiling.constanst;

public class ProfilingConstants {

    public static class CommonConstants {
        public static final String ENCODING_UTF_8 = "UTF-8";
        public static final String LANGUAGE = "Accept-Language";
        public static final String DEFAULT_LANGUAGE = "en";
        public static final String NOT_FOUND_MESSAGE = "Not found";
        public static final String BAD_REQUEST_MESSAGE = "Bad request";
        public static final String CONFLICT_MESSAGE = "Conflict occurred";
        public static final String BLANK_MESSAGE = "";
    }

    public static class AuditorConstant {
        public static final String ANONYMOUS = "anonymousUser";
        public static final String SYSTEM = "SYSTEM";
    }

    public static class StatusException {
        public static final Integer NOT_FOUND = 404;
        public static final Integer CONFLICT = 409;
        public static final Integer BAD_REQUEST = 400;
    }

    public static class MessageException {
        private MessageException() {
        }
        public static final String DEFAULT_CODE_BAD_REQUEST= "com.ncsgroup.profiling.exception.base.BadRequestException";
        public static final String DEFAULT_CODE_CONFLICT= "com.ncsgroup.profiling.exception.base.ConflictException";
        public static final String DEFAULT_CODE_NOTFOUND= "com.ncsgroup.profiling.exception.base.NotFoundException";
        public static final String DEFAULT_CODE_SERVER_ERROR= "com.ncsgroup.profiling.exception.base.InternalServerError";

    }


    public static class AuthConstant {
        public static String TYPE_TOKEN = "Bear ";
        public static String AUTHORIZATION = "Authorization";
    }
}
