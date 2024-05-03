package org.oplearn.project.utils;

import java.util.UUID;

public class GenerateIdUtils {
  private GenerateIdUtils() {
  }

  public static String generateId() {
    return UUID.randomUUID().toString();
  }
}
