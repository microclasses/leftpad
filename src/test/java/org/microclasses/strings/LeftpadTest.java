package org.microclasses.strings;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.microclasses.strings.Leftpad.leftpad;

public class LeftpadTest {
  @Test
  public void appendsSpacesToLeft() {
    assertThat(leftpad("foo", 5), equalTo("  foo"));
  }

  @Test
  public void doesNothingIfStringIsAlreadyOfGivenLength() {
    assertThat(leftpad("foobar", 6), equalTo("foobar"));
    assertThat(leftpad(" ", 2), equalTo("  "));
  }

  @Test
  public void doesNothingIfStringIsLongerThanGivenLength() {
    assertThat(leftpad("foobar", 5), equalTo("foobar"));
    assertThat(leftpad("foobar", 1), equalTo("foobar"));
    assertThat(leftpad("foobar", 0), equalTo("foobar"));
    assertThat(leftpad("foobar", -1), equalTo("foobar"));
  }
}
