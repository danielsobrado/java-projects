package com.jds.fpe;

import com.idealista.fpe.config.Alphabet;

public class CompleteAlphabet implements Alphabet{

  private static final char[] LOWER_CASE_CHARS = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
          'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

  @Override
  public char[] availableCharacters() {
      return LOWER_CASE_CHARS;
  }

  @Override
  public Integer radix() {
      return LOWER_CASE_CHARS.length;
  }
}