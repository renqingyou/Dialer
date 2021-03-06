/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.dialer.smartdial;

public class LatinSmartDialMap implements SmartDialMap {

  private static final char[] LATIN_LETTERS_TO_DIGITS = {
    '2',
    '2',
    '2', // A,B,C -> 2
    '3',
    '3',
    '3', // D,E,F -> 3
    '4',
    '4',
    '4', // G,H,I -> 4
    '5',
    '5',
    '5', // J,K,L -> 5
    '6',
    '6',
    '6', // M,N,O -> 6
    '7',
    '7',
    '7',
    '7', // P,Q,R,S -> 7
    '8',
    '8',
    '8', // T,U,V -> 8
    '9',
    '9',
    '9',
    '9' // W,X,Y,Z -> 9
  };

  @Override
  public boolean isValidDialpadAlphabeticChar(char ch) {
    return (ch >= 'a' && ch <= 'z');
  }

  @Override
  public boolean isValidDialpadNumericChar(char ch) {
    return (ch >= '0' && ch <= '9');
  }

  @Override
  public boolean isValidDialpadCharacter(char ch) {
    return (isValidDialpadAlphabeticChar(ch) || isValidDialpadNumericChar(ch));
  }

  /*
   * The switch statement in this function was generated using the python code:
   * from unidecode import unidecode
   * for i in range(192, 564):
   *     char = unichr(i)
   *     decoded = unidecode(char)
   *     # Unicode characters that decompose into multiple characters i.e.
   *     #  into ss are not supported for now
   *     if (len(decoded) == 1 and decoded.isalpha()):
   *         print "case '" + char + "': return '" + unidecode(char) +  "';"
   *
   * This gives us a way to map characters containing accents/diacritics to their
   * alphabetic equivalents. The unidecode library can be found at:
   * http://pypi.python.org/pypi/Unidecode/0.04.1
   *
   * Also remaps all upper case latin characters to their lower case equivalents.
   */
  @Override
  public char normalizeCharacter(char ch) {
    switch (ch) {
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'c';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'd';
      case '??':
        return 'n';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'x';
      case '??':
        return 'o';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'c';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'd';
      case '??':
        return 'n';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'y';
      case '??':
        return 'y';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'c';
      case '??':
        return 'c';
      case '??':
        return 'c';
      case '??':
        return 'c';
      case '??':
        return 'c';
      case '??':
        return 'c';
      case '??':
        return 'c';
      case '??':
        return 'c';
      case '??':
        return 'd';
      case '??':
        return 'd';
      case '??':
        return 'd';
      case '??':
        return 'd';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'h';
      case '??':
        return 'h';
      case '??':
        return 'h';
      case '??':
        return 'h';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'j';
      case '??':
        return 'j';
      case '??':
        return 'k';
      case '??':
        return 'k';
      case '??':
        return 'k';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'n';
      case '??':
        return 'n';
      case '??':
        return 'n';
      case '??':
        return 'n';
      case '??':
        return 'n';
      case '??':
        return 'n';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'r';
      case '??':
        return 'r';
      case '??':
        return 'r';
      case '??':
        return 'r';
      case '??':
        return 'r';
      case '??':
        return 'r';
      case '??':
        return 's';
      case '??':
        return 's';
      case '??':
        return 's';
      case '??':
        return 's';
      case '??':
        return 's';
      case '??':
        return 's';
      case '??':
        return 's';
      case '??':
        return 's';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'w';
      case '??':
        return 'w';
      case '??':
        return 'y';
      case '??':
        return 'y';
      case '??':
        return 'y';
      case '??':
        return 'z';
      case '??':
        return 'z';
      case '??':
        return 'z';
      case '??':
        return 'z';
      case '??':
        return 'z';
      case '??':
        return 'z';
      case '??':
        return 's';
      case '??':
        return 'b';
      case '??':
        return 'b';
      case '??':
        return 'b';
      case '??':
        return 'b';
      case '??':
        return 'o';
      case '??':
        return 'c';
      case '??':
        return 'c';
      case '??':
        return 'd';
      case '??':
        return 'd';
      case '??':
        return 'd';
      case '??':
        return 'd';
      case '??':
        return 'd';
      case '??':
        return 'e';
      case '??':
        return 'f';
      case '??':
        return 'f';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'k';
      case '??':
        return 'k';
      case '??':
        return 'l';
      case '??':
        return 'l';
      case '??':
        return 'w';
      case '??':
        return 'n';
      case '??':
        return 'n';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'p';
      case '??':
        return 'p';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'y';
      case '??':
        return 'v';
      case '??':
        return 'y';
      case '??':
        return 'y';
      case '??':
        return 'z';
      case '??':
        return 'z';
      case '??':
        return 'w';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'k';
      case '??':
        return 'k';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'j';
      case '??':
        return 'd';
      case '??':
        return 'g';
      case '??':
        return 'g';
      case '??':
        return 'w';
      case '??':
        return 'n';
      case '??':
        return 'n';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'i';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'r';
      case '??':
        return 'r';
      case '??':
        return 'r';
      case '??':
        return 'r';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 'u';
      case '??':
        return 's';
      case '??':
        return 's';
      case '??':
        return 't';
      case '??':
        return 't';
      case '??':
        return 'y';
      case '??':
        return 'y';
      case '??':
        return 'h';
      case '??':
        return 'h';
      case '??':
        return 'z';
      case '??':
        return 'z';
      case '??':
        return 'a';
      case '??':
        return 'a';
      case '??':
        return 'e';
      case '??':
        return 'e';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'o';
      case '??':
        return 'y';
      case '??':
        return 'y';
      case 'A':
        return 'a';
      case 'B':
        return 'b';
      case 'C':
        return 'c';
      case 'D':
        return 'd';
      case 'E':
        return 'e';
      case 'F':
        return 'f';
      case 'G':
        return 'g';
      case 'H':
        return 'h';
      case 'I':
        return 'i';
      case 'J':
        return 'j';
      case 'K':
        return 'k';
      case 'L':
        return 'l';
      case 'M':
        return 'm';
      case 'N':
        return 'n';
      case 'O':
        return 'o';
      case 'P':
        return 'p';
      case 'Q':
        return 'q';
      case 'R':
        return 'r';
      case 'S':
        return 's';
      case 'T':
        return 't';
      case 'U':
        return 'u';
      case 'V':
        return 'v';
      case 'W':
        return 'w';
      case 'X':
        return 'x';
      case 'Y':
        return 'y';
      case 'Z':
        return 'z';
      default:
        return ch;
    }
  }

  @Override
  public byte getDialpadIndex(char ch) {
    if (ch >= '0' && ch <= '9') {
      return (byte) (ch - '0');
    } else if (ch >= 'a' && ch <= 'z') {
      return (byte) (LATIN_LETTERS_TO_DIGITS[ch - 'a'] - '0');
    } else {
      return -1;
    }
  }

  @Override
  public char getDialpadNumericCharacter(char ch) {
    if (ch >= 'a' && ch <= 'z') {
      return LATIN_LETTERS_TO_DIGITS[ch - 'a'];
    }
    return ch;
  }
}
