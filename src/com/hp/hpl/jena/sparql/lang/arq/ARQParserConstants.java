/* Generated By:JavaCC: Do not edit this line. ARQParserConstants.java */
/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hp.hpl.jena.sparql.lang.arq ;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ARQParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 6;
  /** RegularExpression Id. */
  int WS = 7;
  /** RegularExpression Id. */
  int WSC = 8;
  /** RegularExpression Id. */
  int IRIref = 9;
  /** RegularExpression Id. */
  int PNAME_NS = 10;
  /** RegularExpression Id. */
  int PNAME_LN = 11;
  /** RegularExpression Id. */
  int BLANK_NODE_LABEL = 12;
  /** RegularExpression Id. */
  int VAR1 = 13;
  /** RegularExpression Id. */
  int VAR2 = 14;
  /** RegularExpression Id. */
  int LANGTAG = 15;
  /** RegularExpression Id. */
  int A2Z = 16;
  /** RegularExpression Id. */
  int A2ZN = 17;
  /** RegularExpression Id. */
  int KW_A = 18;
  /** RegularExpression Id. */
  int BASE = 19;
  /** RegularExpression Id. */
  int PREFIX = 20;
  /** RegularExpression Id. */
  int SELECT = 21;
  /** RegularExpression Id. */
  int DISTINCT = 22;
  /** RegularExpression Id. */
  int REDUCED = 23;
  /** RegularExpression Id. */
  int DESCRIBE = 24;
  /** RegularExpression Id. */
  int CONSTRUCT = 25;
  /** RegularExpression Id. */
  int ASK = 26;
  /** RegularExpression Id. */
  int LIMIT = 27;
  /** RegularExpression Id. */
  int OFFSET = 28;
  /** RegularExpression Id. */
  int ORDER = 29;
  /** RegularExpression Id. */
  int BY = 30;
  /** RegularExpression Id. */
  int VALUES = 31;
  /** RegularExpression Id. */
  int UNDEF = 32;
  /** RegularExpression Id. */
  int ASC = 33;
  /** RegularExpression Id. */
  int DESC = 34;
  /** RegularExpression Id. */
  int NAMED = 35;
  /** RegularExpression Id. */
  int FROM = 36;
  /** RegularExpression Id. */
  int WINDOW = 37;
  /** RegularExpression Id. */
  int ON = 38;
  /** RegularExpression Id. */
  int RANGE = 39;
  /** RegularExpression Id. */
  int STEP = 40;
  /** RegularExpression Id. */
  int TIME = 41;
  /** RegularExpression Id. */
  int WHERE = 42;
  /** RegularExpression Id. */
  int AND = 43;
  /** RegularExpression Id. */
  int GRAPH = 44;
  /** RegularExpression Id. */
  int OPTIONAL = 45;
  /** RegularExpression Id. */
  int UNION = 46;
  /** RegularExpression Id. */
  int MINUS_P = 47;
  /** RegularExpression Id. */
  int BIND = 48;
  /** RegularExpression Id. */
  int SERVICE = 49;
  /** RegularExpression Id. */
  int LET = 50;
  /** RegularExpression Id. */
  int EXISTS = 51;
  /** RegularExpression Id. */
  int NOT = 52;
  /** RegularExpression Id. */
  int AS = 53;
  /** RegularExpression Id. */
  int GROUP = 54;
  /** RegularExpression Id. */
  int HAVING = 55;
  /** RegularExpression Id. */
  int SEPARATOR = 56;
  /** RegularExpression Id. */
  int AGG = 57;
  /** RegularExpression Id. */
  int COUNT = 58;
  /** RegularExpression Id. */
  int MIN = 59;
  /** RegularExpression Id. */
  int MAX = 60;
  /** RegularExpression Id. */
  int SUM = 61;
  /** RegularExpression Id. */
  int AVG = 62;
  /** RegularExpression Id. */
  int STDDEV = 63;
  /** RegularExpression Id. */
  int SAMPLE = 64;
  /** RegularExpression Id. */
  int GROUP_CONCAT = 65;
  /** RegularExpression Id. */
  int FILTER = 66;
  /** RegularExpression Id. */
  int BOUND = 67;
  /** RegularExpression Id. */
  int COALESCE = 68;
  /** RegularExpression Id. */
  int IN = 69;
  /** RegularExpression Id. */
  int IF = 70;
  /** RegularExpression Id. */
  int BNODE = 71;
  /** RegularExpression Id. */
  int IRI = 72;
  /** RegularExpression Id. */
  int URI = 73;
  /** RegularExpression Id. */
  int CAST = 74;
  /** RegularExpression Id. */
  int CALL = 75;
  /** RegularExpression Id. */
  int MULTI = 76;
  /** RegularExpression Id. */
  int SHORTEST = 77;
  /** RegularExpression Id. */
  int STR = 78;
  /** RegularExpression Id. */
  int STRLANG = 79;
  /** RegularExpression Id. */
  int STRDT = 80;
  /** RegularExpression Id. */
  int DTYPE = 81;
  /** RegularExpression Id. */
  int LANG = 82;
  /** RegularExpression Id. */
  int LANGMATCHES = 83;
  /** RegularExpression Id. */
  int IS_URI = 84;
  /** RegularExpression Id. */
  int IS_IRI = 85;
  /** RegularExpression Id. */
  int IS_BLANK = 86;
  /** RegularExpression Id. */
  int IS_LITERAL = 87;
  /** RegularExpression Id. */
  int IS_NUMERIC = 88;
  /** RegularExpression Id. */
  int REGEX = 89;
  /** RegularExpression Id. */
  int SAME_TERM = 90;
  /** RegularExpression Id. */
  int RAND = 91;
  /** RegularExpression Id. */
  int ABS = 92;
  /** RegularExpression Id. */
  int CEIL = 93;
  /** RegularExpression Id. */
  int FLOOR = 94;
  /** RegularExpression Id. */
  int ROUND = 95;
  /** RegularExpression Id. */
  int CONCAT = 96;
  /** RegularExpression Id. */
  int SUBSTR = 97;
  /** RegularExpression Id. */
  int STRLEN = 98;
  /** RegularExpression Id. */
  int REPLACE = 99;
  /** RegularExpression Id. */
  int UCASE = 100;
  /** RegularExpression Id. */
  int LCASE = 101;
  /** RegularExpression Id. */
  int ENCODE_FOR_URI = 102;
  /** RegularExpression Id. */
  int CONTAINS = 103;
  /** RegularExpression Id. */
  int STRSTARTS = 104;
  /** RegularExpression Id. */
  int STRENDS = 105;
  /** RegularExpression Id. */
  int STRBEFORE = 106;
  /** RegularExpression Id. */
  int STRAFTER = 107;
  /** RegularExpression Id. */
  int YEAR = 108;
  /** RegularExpression Id. */
  int MONTH = 109;
  /** RegularExpression Id. */
  int DAY = 110;
  /** RegularExpression Id. */
  int HOURS = 111;
  /** RegularExpression Id. */
  int MINUTES = 112;
  /** RegularExpression Id. */
  int SECONDS = 113;
  /** RegularExpression Id. */
  int TIMEZONE = 114;
  /** RegularExpression Id. */
  int TZ = 115;
  /** RegularExpression Id. */
  int NOW = 116;
  /** RegularExpression Id. */
  int UUID = 117;
  /** RegularExpression Id. */
  int STRUUID = 118;
  /** RegularExpression Id. */
  int VERSION = 119;
  /** RegularExpression Id. */
  int MD5 = 120;
  /** RegularExpression Id. */
  int SHA1 = 121;
  /** RegularExpression Id. */
  int SHA224 = 122;
  /** RegularExpression Id. */
  int SHA256 = 123;
  /** RegularExpression Id. */
  int SHA384 = 124;
  /** RegularExpression Id. */
  int SHA512 = 125;
  /** RegularExpression Id. */
  int TRUE = 126;
  /** RegularExpression Id. */
  int FALSE = 127;
  /** RegularExpression Id. */
  int DATA = 128;
  /** RegularExpression Id. */
  int INSERT = 129;
  /** RegularExpression Id. */
  int DELETE = 130;
  /** RegularExpression Id. */
  int INSERT_DATA = 131;
  /** RegularExpression Id. */
  int DELETE_DATA = 132;
  /** RegularExpression Id. */
  int DELETE_WHERE = 133;
  /** RegularExpression Id. */
  int LOAD = 134;
  /** RegularExpression Id. */
  int CLEAR = 135;
  /** RegularExpression Id. */
  int CREATE = 136;
  /** RegularExpression Id. */
  int ADD = 137;
  /** RegularExpression Id. */
  int MOVE = 138;
  /** RegularExpression Id. */
  int COPY = 139;
  /** RegularExpression Id. */
  int META = 140;
  /** RegularExpression Id. */
  int SILENT = 141;
  /** RegularExpression Id. */
  int DROP = 142;
  /** RegularExpression Id. */
  int INTO = 143;
  /** RegularExpression Id. */
  int TO = 144;
  /** RegularExpression Id. */
  int DFT = 145;
  /** RegularExpression Id. */
  int ALL = 146;
  /** RegularExpression Id. */
  int WITH = 147;
  /** RegularExpression Id. */
  int USING = 148;
  /** RegularExpression Id. */
  int DIGITS = 149;
  /** RegularExpression Id. */
  int INTEGER = 150;
  /** RegularExpression Id. */
  int DECIMAL = 151;
  /** RegularExpression Id. */
  int DOUBLE = 152;
  /** RegularExpression Id. */
  int INTEGER_POSITIVE = 153;
  /** RegularExpression Id. */
  int DECIMAL_POSITIVE = 154;
  /** RegularExpression Id. */
  int DOUBLE_POSITIVE = 155;
  /** RegularExpression Id. */
  int INTEGER_NEGATIVE = 156;
  /** RegularExpression Id. */
  int DECIMAL_NEGATIVE = 157;
  /** RegularExpression Id. */
  int DOUBLE_NEGATIVE = 158;
  /** RegularExpression Id. */
  int EXPONENT = 159;
  /** RegularExpression Id. */
  int QUOTE_3D = 160;
  /** RegularExpression Id. */
  int QUOTE_3S = 161;
  /** RegularExpression Id. */
  int ECHAR = 162;
  /** RegularExpression Id. */
  int STRING_LITERAL1 = 163;
  /** RegularExpression Id. */
  int STRING_LITERAL2 = 164;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG1 = 165;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG2 = 166;
  /** RegularExpression Id. */
  int LPAREN = 167;
  /** RegularExpression Id. */
  int RPAREN = 168;
  /** RegularExpression Id. */
  int NIL = 169;
  /** RegularExpression Id. */
  int LBRACE = 170;
  /** RegularExpression Id. */
  int RBRACE = 171;
  /** RegularExpression Id. */
  int LBRACKET = 172;
  /** RegularExpression Id. */
  int RBRACKET = 173;
  /** RegularExpression Id. */
  int ANON = 174;
  /** RegularExpression Id. */
  int SEMICOLON = 175;
  /** RegularExpression Id. */
  int COMMA = 176;
  /** RegularExpression Id. */
  int DOT = 177;
  /** RegularExpression Id. */
  int EQ = 178;
  /** RegularExpression Id. */
  int NE = 179;
  /** RegularExpression Id. */
  int GT = 180;
  /** RegularExpression Id. */
  int LT = 181;
  /** RegularExpression Id. */
  int LE = 182;
  /** RegularExpression Id. */
  int GE = 183;
  /** RegularExpression Id. */
  int BANG = 184;
  /** RegularExpression Id. */
  int TILDE = 185;
  /** RegularExpression Id. */
  int COLON = 186;
  /** RegularExpression Id. */
  int SC_OR = 187;
  /** RegularExpression Id. */
  int SC_AND = 188;
  /** RegularExpression Id. */
  int PLUS = 189;
  /** RegularExpression Id. */
  int MINUS = 190;
  /** RegularExpression Id. */
  int STAR = 191;
  /** RegularExpression Id. */
  int SLASH = 192;
  /** RegularExpression Id. */
  int DATATYPE = 193;
  /** RegularExpression Id. */
  int AT = 194;
  /** RegularExpression Id. */
  int ASSIGN = 195;
  /** RegularExpression Id. */
  int VBAR = 196;
  /** RegularExpression Id. */
  int CARAT = 197;
  /** RegularExpression Id. */
  int FPATH = 198;
  /** RegularExpression Id. */
  int RPATH = 199;
  /** RegularExpression Id. */
  int QMARK = 200;
  /** RegularExpression Id. */
  int PN_CHARS_BASE = 201;
  /** RegularExpression Id. */
  int PN_CHARS_U = 202;
  /** RegularExpression Id. */
  int PN_CHARS = 203;
  /** RegularExpression Id. */
  int PN_PREFIX = 204;
  /** RegularExpression Id. */
  int PN_LOCAL = 205;
  /** RegularExpression Id. */
  int VARNAME = 206;
  /** RegularExpression Id. */
  int PN_LOCAL_ESC = 207;
  /** RegularExpression Id. */
  int PLX = 208;
  /** RegularExpression Id. */
  int HEX = 209;
  /** RegularExpression Id. */
  int PERCENT = 210;
  /** RegularExpression Id. */
  int UNKNOWN = 211;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "<SINGLE_LINE_COMMENT>",
    "<WS>",
    "<WSC>",
    "<IRIref>",
    "<PNAME_NS>",
    "<PNAME_LN>",
    "<BLANK_NODE_LABEL>",
    "<VAR1>",
    "<VAR2>",
    "<LANGTAG>",
    "<A2Z>",
    "<A2ZN>",
    "\"a\"",
    "\"base\"",
    "\"prefix\"",
    "\"select\"",
    "\"distinct\"",
    "\"reduced\"",
    "\"describe\"",
    "\"construct\"",
    "\"ask\"",
    "\"limit\"",
    "\"offset\"",
    "\"order\"",
    "\"by\"",
    "\"values\"",
    "\"undef\"",
    "\"asc\"",
    "\"desc\"",
    "\"named\"",
    "\"from\"",
    "\"window\"",
    "\"on\"",
    "\"range\"",
    "\"step\"",
    "<TIME>",
    "\"where\"",
    "\"and\"",
    "\"graph\"",
    "\"optional\"",
    "\"union\"",
    "\"minus\"",
    "\"bind\"",
    "\"service\"",
    "\"let\"",
    "\"exists\"",
    "\"not\"",
    "\"as\"",
    "\"group\"",
    "\"having\"",
    "\"separator\"",
    "\"agg\"",
    "\"count\"",
    "\"min\"",
    "\"max\"",
    "\"sum\"",
    "\"avg\"",
    "\"stdev\"",
    "\"sample\"",
    "\"group_concat\"",
    "\"filter\"",
    "\"bound\"",
    "\"coalesce\"",
    "\"in\"",
    "\"if\"",
    "\"bnode\"",
    "\"iri\"",
    "\"uri\"",
    "\"cast\"",
    "\"call\"",
    "\"multi\"",
    "\"shortest\"",
    "\"str\"",
    "\"strlang\"",
    "\"strdt\"",
    "\"datatype\"",
    "\"lang\"",
    "\"langmatches\"",
    "\"isURI\"",
    "\"isIRI\"",
    "\"isBlank\"",
    "\"isLiteral\"",
    "\"isNumeric\"",
    "\"regex\"",
    "\"sameTerm\"",
    "\"RAND\"",
    "\"ABS\"",
    "\"CEIL\"",
    "\"FLOOR\"",
    "\"ROUND\"",
    "\"CONCAT\"",
    "\"SUBSTR\"",
    "\"STRLEN\"",
    "\"REPLACE\"",
    "\"UCASE\"",
    "\"LCASE\"",
    "\"ENCODE_FOR_URI\"",
    "\"CONTAINS\"",
    "\"STRSTARTS\"",
    "\"STRENDS\"",
    "\"STRBEFORE\"",
    "\"STRAFTER\"",
    "\"YEAR\"",
    "\"MONTH\"",
    "\"DAY\"",
    "\"HOURS\"",
    "\"MINUTES\"",
    "\"SECONDS\"",
    "\"TIMEZONE\"",
    "\"TZ\"",
    "\"NOW\"",
    "\"UUID\"",
    "\"STRUUID\"",
    "\"VERSION\"",
    "\"MD5\"",
    "\"SHA1\"",
    "\"SHA224\"",
    "\"SHA256\"",
    "\"SHA384\"",
    "\"SHA512\"",
    "\"true\"",
    "\"false\"",
    "\"data\"",
    "\"insert\"",
    "\"delete\"",
    "<INSERT_DATA>",
    "<DELETE_DATA>",
    "<DELETE_WHERE>",
    "\"load\"",
    "\"clear\"",
    "\"create\"",
    "\"add\"",
    "\"move\"",
    "\"copy\"",
    "\"meta\"",
    "\"silent\"",
    "\"drop\"",
    "\"into\"",
    "\"to\"",
    "\"default\"",
    "\"all\"",
    "\"with\"",
    "\"using\"",
    "<DIGITS>",
    "<INTEGER>",
    "<DECIMAL>",
    "<DOUBLE>",
    "<INTEGER_POSITIVE>",
    "<DECIMAL_POSITIVE>",
    "<DOUBLE_POSITIVE>",
    "<INTEGER_NEGATIVE>",
    "<DECIMAL_NEGATIVE>",
    "<DOUBLE_NEGATIVE>",
    "<EXPONENT>",
    "\"\\\"\\\"\\\"\"",
    "\"\\\'\\\'\\\'\"",
    "<ECHAR>",
    "<STRING_LITERAL1>",
    "<STRING_LITERAL2>",
    "<STRING_LITERAL_LONG1>",
    "<STRING_LITERAL_LONG2>",
    "\"(\"",
    "\")\"",
    "<NIL>",
    "\"{\"",
    "\"}\"",
    "\"[\"",
    "\"]\"",
    "<ANON>",
    "\";\"",
    "\",\"",
    "\".\"",
    "\"=\"",
    "\"!=\"",
    "\">\"",
    "\"<\"",
    "\"<=\"",
    "\">=\"",
    "\"!\"",
    "\"~\"",
    "\":\"",
    "\"||\"",
    "\"&&\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"^^\"",
    "\"@\"",
    "\":=\"",
    "\"|\"",
    "\"^\"",
    "\"->\"",
    "\"<-\"",
    "\"?\"",
    "<PN_CHARS_BASE>",
    "<PN_CHARS_U>",
    "<PN_CHARS>",
    "<PN_PREFIX>",
    "<PN_LOCAL>",
    "<VARNAME>",
    "<PN_LOCAL_ESC>",
    "<PLX>",
    "<HEX>",
    "<PERCENT>",
    "<UNKNOWN>",
  };

}
