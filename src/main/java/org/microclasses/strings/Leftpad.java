package org.microclasses.strings;

public class Leftpad {

  public static String leftpad(String text, int length) {
    if (text.length() >= length) {
      return text;
    }
    
    StringBuilder sb = new StringBuilder(length);
    for (int i = text.length(); i < length; i++) {
      sb.append(' ');
    }
    sb.append(text);
    return sb.toString();
  }
}
