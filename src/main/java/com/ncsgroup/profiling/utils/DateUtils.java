package com.ncsgroup.profiling.utils;

import java.time.LocalDate;

public class DateUtils {
  private DateUtils() {
  }

  public static String getCurrentDateString() {
    return LocalDate.now().toString();
  }

  public static Long currentTimeMillis() {
    return System.currentTimeMillis();
  }
}
