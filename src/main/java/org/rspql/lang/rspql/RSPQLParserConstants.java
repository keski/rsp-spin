/* Generated By:JavaCC: Do not edit this line. RSPQLParserConstants.java */
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
package org.rspql.lang.rspql;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface RSPQLParserConstants {

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
  int REGISTER = 37;
  /** RegularExpression Id. */
  int WINDOW = 38;
  /** RegularExpression Id. */
  int ON = 39;
  /** RegularExpression Id. */
  int RANGE = 40;
  /** RegularExpression Id. */
  int ITEM = 41;
  /** RegularExpression Id. */
  int STEP = 42;
  /** RegularExpression Id. */
  int TIME = 43;
  /** RegularExpression Id. */
  int PASTTIME = 44;
  /** RegularExpression Id. */
  int RSTREAM = 45;
  /** RegularExpression Id. */
  int ISTREAM = 46;
  /** RegularExpression Id. */
  int DSTREAM = 47;
  /** RegularExpression Id. */
  int WHERE = 48;
  /** RegularExpression Id. */
  int AND = 49;
  /** RegularExpression Id. */
  int GRAPH = 50;
  /** RegularExpression Id. */
  int OPTIONAL = 51;
  /** RegularExpression Id. */
  int UNION = 52;
  /** RegularExpression Id. */
  int MINUS_P = 53;
  /** RegularExpression Id. */
  int BIND = 54;
  /** RegularExpression Id. */
  int SERVICE = 55;
  /** RegularExpression Id. */
  int LET = 56;
  /** RegularExpression Id. */
  int EXISTS = 57;
  /** RegularExpression Id. */
  int NOT = 58;
  /** RegularExpression Id. */
  int AS = 59;
  /** RegularExpression Id. */
  int GROUP = 60;
  /** RegularExpression Id. */
  int HAVING = 61;
  /** RegularExpression Id. */
  int SEPARATOR = 62;
  /** RegularExpression Id. */
  int AGG = 63;
  /** RegularExpression Id. */
  int COUNT = 64;
  /** RegularExpression Id. */
  int MIN = 65;
  /** RegularExpression Id. */
  int MAX = 66;
  /** RegularExpression Id. */
  int SUM = 67;
  /** RegularExpression Id. */
  int AVG = 68;
  /** RegularExpression Id. */
  int STDDEV = 69;
  /** RegularExpression Id. */
  int SAMPLE = 70;
  /** RegularExpression Id. */
  int GROUP_CONCAT = 71;
  /** RegularExpression Id. */
  int FILTER = 72;
  /** RegularExpression Id. */
  int BOUND = 73;
  /** RegularExpression Id. */
  int COALESCE = 74;
  /** RegularExpression Id. */
  int IN = 75;
  /** RegularExpression Id. */
  int IF = 76;
  /** RegularExpression Id. */
  int BNODE = 77;
  /** RegularExpression Id. */
  int IRI = 78;
  /** RegularExpression Id. */
  int URI = 79;
  /** RegularExpression Id. */
  int CAST = 80;
  /** RegularExpression Id. */
  int CALL = 81;
  /** RegularExpression Id. */
  int MULTI = 82;
  /** RegularExpression Id. */
  int SHORTEST = 83;
  /** RegularExpression Id. */
  int STR = 84;
  /** RegularExpression Id. */
  int STRLANG = 85;
  /** RegularExpression Id. */
  int STRDT = 86;
  /** RegularExpression Id. */
  int DTYPE = 87;
  /** RegularExpression Id. */
  int LANG = 88;
  /** RegularExpression Id. */
  int LANGMATCHES = 89;
  /** RegularExpression Id. */
  int IS_URI = 90;
  /** RegularExpression Id. */
  int IS_IRI = 91;
  /** RegularExpression Id. */
  int IS_BLANK = 92;
  /** RegularExpression Id. */
  int IS_LITERAL = 93;
  /** RegularExpression Id. */
  int IS_NUMERIC = 94;
  /** RegularExpression Id. */
  int REGEX = 95;
  /** RegularExpression Id. */
  int SAME_TERM = 96;
  /** RegularExpression Id. */
  int RAND = 97;
  /** RegularExpression Id. */
  int ABS = 98;
  /** RegularExpression Id. */
  int CEIL = 99;
  /** RegularExpression Id. */
  int FLOOR = 100;
  /** RegularExpression Id. */
  int ROUND = 101;
  /** RegularExpression Id. */
  int CONCAT = 102;
  /** RegularExpression Id. */
  int SUBSTR = 103;
  /** RegularExpression Id. */
  int STRLEN = 104;
  /** RegularExpression Id. */
  int REPLACE = 105;
  /** RegularExpression Id. */
  int UCASE = 106;
  /** RegularExpression Id. */
  int LCASE = 107;
  /** RegularExpression Id. */
  int ENCODE_FOR_URI = 108;
  /** RegularExpression Id. */
  int CONTAINS = 109;
  /** RegularExpression Id. */
  int STRSTARTS = 110;
  /** RegularExpression Id. */
  int STRENDS = 111;
  /** RegularExpression Id. */
  int STRBEFORE = 112;
  /** RegularExpression Id. */
  int STRAFTER = 113;
  /** RegularExpression Id. */
  int YEAR = 114;
  /** RegularExpression Id. */
  int MONTH = 115;
  /** RegularExpression Id. */
  int DAY = 116;
  /** RegularExpression Id. */
  int HOURS = 117;
  /** RegularExpression Id. */
  int MINUTES = 118;
  /** RegularExpression Id. */
  int SECONDS = 119;
  /** RegularExpression Id. */
  int TIMEZONE = 120;
  /** RegularExpression Id. */
  int TZ = 121;
  /** RegularExpression Id. */
  int NOW = 122;
  /** RegularExpression Id. */
  int UUID = 123;
  /** RegularExpression Id. */
  int STRUUID = 124;
  /** RegularExpression Id. */
  int VERSION = 125;
  /** RegularExpression Id. */
  int MD5 = 126;
  /** RegularExpression Id. */
  int SHA1 = 127;
  /** RegularExpression Id. */
  int SHA224 = 128;
  /** RegularExpression Id. */
  int SHA256 = 129;
  /** RegularExpression Id. */
  int SHA384 = 130;
  /** RegularExpression Id. */
  int SHA512 = 131;
  /** RegularExpression Id. */
  int TRUE = 132;
  /** RegularExpression Id. */
  int FALSE = 133;
  /** RegularExpression Id. */
  int DATA = 134;
  /** RegularExpression Id. */
  int INSERT = 135;
  /** RegularExpression Id. */
  int DELETE = 136;
  /** RegularExpression Id. */
  int INSERT_DATA = 137;
  /** RegularExpression Id. */
  int DELETE_DATA = 138;
  /** RegularExpression Id. */
  int DELETE_WHERE = 139;
  /** RegularExpression Id. */
  int LOAD = 140;
  /** RegularExpression Id. */
  int CLEAR = 141;
  /** RegularExpression Id. */
  int CREATE = 142;
  /** RegularExpression Id. */
  int ADD = 143;
  /** RegularExpression Id. */
  int MOVE = 144;
  /** RegularExpression Id. */
  int COPY = 145;
  /** RegularExpression Id. */
  int META = 146;
  /** RegularExpression Id. */
  int SILENT = 147;
  /** RegularExpression Id. */
  int DROP = 148;
  /** RegularExpression Id. */
  int INTO = 149;
  /** RegularExpression Id. */
  int TO = 150;
  /** RegularExpression Id. */
  int DFT = 151;
  /** RegularExpression Id. */
  int ALL = 152;
  /** RegularExpression Id. */
  int WITH = 153;
  /** RegularExpression Id. */
  int USING = 154;
  /** RegularExpression Id. */
  int DIGITS = 155;
  /** RegularExpression Id. */
  int INTEGER = 156;
  /** RegularExpression Id. */
  int DECIMAL = 157;
  /** RegularExpression Id. */
  int DOUBLE = 158;
  /** RegularExpression Id. */
  int INTEGER_POSITIVE = 159;
  /** RegularExpression Id. */
  int DECIMAL_POSITIVE = 160;
  /** RegularExpression Id. */
  int DOUBLE_POSITIVE = 161;
  /** RegularExpression Id. */
  int INTEGER_NEGATIVE = 162;
  /** RegularExpression Id. */
  int DECIMAL_NEGATIVE = 163;
  /** RegularExpression Id. */
  int DOUBLE_NEGATIVE = 164;
  /** RegularExpression Id. */
  int EXPONENT = 165;
  /** RegularExpression Id. */
  int QUOTE_3D = 166;
  /** RegularExpression Id. */
  int QUOTE_3S = 167;
  /** RegularExpression Id. */
  int ECHAR = 168;
  /** RegularExpression Id. */
  int STRING_LITERAL1 = 169;
  /** RegularExpression Id. */
  int STRING_LITERAL2 = 170;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG1 = 171;
  /** RegularExpression Id. */
  int STRING_LITERAL_LONG2 = 172;
  /** RegularExpression Id. */
  int LPAREN = 173;
  /** RegularExpression Id. */
  int RPAREN = 174;
  /** RegularExpression Id. */
  int NIL = 175;
  /** RegularExpression Id. */
  int LBRACE = 176;
  /** RegularExpression Id. */
  int RBRACE = 177;
  /** RegularExpression Id. */
  int LBRACKET = 178;
  /** RegularExpression Id. */
  int RBRACKET = 179;
  /** RegularExpression Id. */
  int ANON = 180;
  /** RegularExpression Id. */
  int SEMICOLON = 181;
  /** RegularExpression Id. */
  int COMMA = 182;
  /** RegularExpression Id. */
  int DOT = 183;
  /** RegularExpression Id. */
  int EQ = 184;
  /** RegularExpression Id. */
  int NE = 185;
  /** RegularExpression Id. */
  int GT = 186;
  /** RegularExpression Id. */
  int LT = 187;
  /** RegularExpression Id. */
  int LE = 188;
  /** RegularExpression Id. */
  int GE = 189;
  /** RegularExpression Id. */
  int BANG = 190;
  /** RegularExpression Id. */
  int TILDE = 191;
  /** RegularExpression Id. */
  int COLON = 192;
  /** RegularExpression Id. */
  int SC_OR = 193;
  /** RegularExpression Id. */
  int SC_AND = 194;
  /** RegularExpression Id. */
  int PLUS = 195;
  /** RegularExpression Id. */
  int MINUS = 196;
  /** RegularExpression Id. */
  int STAR = 197;
  /** RegularExpression Id. */
  int SLASH = 198;
  /** RegularExpression Id. */
  int DATATYPE = 199;
  /** RegularExpression Id. */
  int AT = 200;
  /** RegularExpression Id. */
  int ASSIGN = 201;
  /** RegularExpression Id. */
  int VBAR = 202;
  /** RegularExpression Id. */
  int CARAT = 203;
  /** RegularExpression Id. */
  int FPATH = 204;
  /** RegularExpression Id. */
  int RPATH = 205;
  /** RegularExpression Id. */
  int QMARK = 206;
  /** RegularExpression Id. */
  int PN_CHARS_BASE = 207;
  /** RegularExpression Id. */
  int PN_CHARS_U = 208;
  /** RegularExpression Id. */
  int PN_CHARS = 209;
  /** RegularExpression Id. */
  int PN_PREFIX = 210;
  /** RegularExpression Id. */
  int PN_LOCAL = 211;
  /** RegularExpression Id. */
  int VARNAME = 212;
  /** RegularExpression Id. */
  int PN_LOCAL_ESC = 213;
  /** RegularExpression Id. */
  int PLX = 214;
  /** RegularExpression Id. */
  int HEX = 215;
  /** RegularExpression Id. */
  int PERCENT = 216;
  /** RegularExpression Id. */
  int UNKNOWN = 217;

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
    "\"register stream\"",
    "\"window\"",
    "\"on\"",
    "\"range\"",
    "\"item\"",
    "\"step\"",
    "<TIME>",
    "<PASTTIME>",
    "\"rstream\"",
    "\"istream\"",
    "\"dstream\"",
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