package com.ncsgroup.profiling.utils;

import java.time.LocalDate;

public class DateUtils {
  public static String getCurrentDateString() {
    return LocalDate.now().toString();
  }
}
