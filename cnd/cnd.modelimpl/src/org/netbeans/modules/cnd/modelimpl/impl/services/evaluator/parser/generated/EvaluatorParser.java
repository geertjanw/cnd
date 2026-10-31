// $ANTLR 3.4 /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g 2026-10-30 23:49:20

package org.netbeans.modules.cnd.modelimpl.impl.services.evaluator.parser.generated;

import java.util.HashMap;
import org.netbeans.modules.cnd.modelimpl.impl.services.evaluator.VariableProvider;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked", "cast", "fallthrough"})
public class EvaluatorParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ELLIPSIS", "DOT", "ASSIGNEQUAL", "COLON", "COMMA", "QUESTIONMARK", "SEMICOLON", "POINTERTO", "LPAREN", "RPAREN", "LSQUARE", "RSQUARE", "LCURLY", "RCURLY", "EQUAL", "NOTEQUAL", "LESSTHANOREQUALTO", "LESSTHAN", "GREATERTHANOREQUALTO", "GREATERTHAN", "DIVIDE", "DIVIDEEQUAL", "PLUS", "PLUSEQUAL", "PLUSPLUS", "MINUS", "MINUSEQUAL", "MINUSMINUS", "STAR", "TIMESEQUAL", "MOD", "MODEQUAL", "SHIFTRIGHT", "SHIFTRIGHTEQUAL", "SHIFTLEFT", "SHIFTLEFTEQUAL", "AND", "NOT", "OR", "AMPERSAND", "BITWISEANDEQUAL", "TILDE", "BITWISEOR", "BITWISEOREQUAL", "BITWISEXOR", "BITWISEXOREQUAL", "POINTERTOMBR", "DOTMBR", "SCOPE", "AT", "DOLLAR", "BACK_SLASH", "DEFINED", "DBL_SHARP", "SHARP", "FUN_LIKE_MACRO_LPAREN", "GRAVE_ACCENT", "END_PREPROC_DIRECTIVE", "LAST_CONST_TEXT_TOKEN", "FLOATONE", "FLOATTWO", "HEXADECIMALINT", "OCTALINT", "DECIMALINT", "Whitespace", "EndOfLine", "Skip", "PreProcComment", "PPLiterals", "Space", "PreProcBlockComment", "PreProcLineComment", "Comment", "CPPComment", "CHAR_LITERAL", "STRING_LITERAL", "InterStringWhitespace", "StringPart", "Escape", "Digit", "Decimal", "LongSuffix", "UnsignedSuffix", "FloatSuffix", "Exponent", "Vocabulary", "NUMBER", "IDENT", "BINARYINT", "INCLUDE_STRING", "SYS_INCLUDE_STRING", "INCLUDE", "INCLUDE_NEXT", "DEFINE", "UNDEF", "IFDEF", "IFNDEF", "IF", "ELIF", "ELSE", "ENDIF", "PRAGMA", "LINE", "ERROR", "PREPROC_DIRECTIVE", "FIRST_LITERAL_TOKEN", "LITERAL_OPERATOR", "LITERAL_alignof", "LITERAL__Alignof", "LITERAL___alignof__", "LITERAL_typeof", "LITERAL___typeof__", "LITERAL___typeof", "LITERAL_template", "LITERAL_typedef", "LITERAL_enum", "LITERAL_namespace", "LITERAL_extern", "LITERAL_inline", "LITERAL__inline", "LITERAL___inline__", "LITERAL___inline", "LITERAL_virtual", "LITERAL_explicit", "LITERAL_friend", "LITERAL__stdcall", "LITERAL___stdcall", "LITERAL_typename", "LITERAL_auto", "LITERAL_register", "LITERAL_static", "LITERAL_mutable", "LITERAL_const", "LITERAL___const__", "LITERAL___const", "LITERAL_const_cast", "LITERAL_volatile", "LITERAL___volatile__", "LITERAL___volatile", "LITERAL_char", "LITERAL_wchar_t", "LITERAL_bool", "LITERAL_short", "LITERAL_int", "LITERAL_long", "LITERAL_signed", "LITERAL___signed__", "LITERAL___signed", "LITERAL_unsigned", "LITERAL___unsigned__", "LITERAL_float", "LITERAL_double", "LITERAL_void", "LITERAL__declspec", "LITERAL___declspec", "LITERAL_class", "LITERAL_struct", "LITERAL_union", "LITERAL_this", "LITERAL_true", "LITERAL_false", "LITERAL_public", "LITERAL_protected", "LITERAL_private", "LITERAL_throw", "LITERAL_case", "LITERAL_default", "LITERAL_if", "LITERAL_else", "LITERAL_switch", "LITERAL_while", "LITERAL_do", "LITERAL_for", "LITERAL_goto", "LITERAL_continue", "LITERAL_break", "LITERAL_return", "LITERAL_try", "LITERAL_catch", "LITERAL_using", "LITERAL_export", "LITERAL_asm", "LITERAL__asm", "LITERAL___asm__", "LITERAL___asm", "LITERAL__endasm", "LITERAL_sizeof", "LITERAL_dynamic_cast", "LITERAL_static_cast", "LITERAL_reinterpret_cast", "LITERAL_new", "LITERAL__cdecl", "LITERAL___cdecl", "LITERAL__near", "LITERAL___near", "LITERAL__far", "LITERAL___far", "LITERAL___interrupt", "LITERAL_pascal", "LITERAL__pascal", "LITERAL___pascal", "LITERAL_delete", "LITERAL__int64", "LITERAL___int64", "LITERAL___w64", "LITERAL___extension__", "LITERAL___attribute__", "LITERAL_restrict", "LITERAL___restrict", "LITERAL___complex__", "LITERAL___imag", "LITERAL___real", "LITERAL___global", "LITERAL__Bool", "LITERAL__Complex", "LITERAL___thread", "LITERAL___attribute", "LITERAL__Imaginary", "LITERAL_bit", "LITERAL___symbolic", "LITERAL___hidden", "LITERAL_final", "LITERAL_override", "LITERAL_constexpr", "LITERAL_decltype", "LITERAL_nullptr", "LITERAL_thread_local", "LITERAL__Thread_local", "LITERAL_static_assert", "LITERAL__Static_assert", "LITERAL_alignas", "LITERAL__Alignas", "LITERAL_char16_t", "LITERAL_char32_t", "LITERAL_noexcept", "LITERAL___decltype", "LITERAL___complex", "LITERAL___forceinline", "LITERAL___clrcall", "LITERAL___try", "LITERAL___finally", "LITERAL___null", "LITERAL___alignof", "LITERAL___is_class", "LITERAL___is_enum", "LITERAL___is_pod", "LITERAL___is_base_of", "LITERAL___has_trivial_constructor", "LITERAL___restrict__", "LITERAL__Noreturn", "LITERAL__Atomic", "LITERAL___has_nothrow_assign", "LITERAL___has_nothrow_copy", "LITERAL___has_nothrow_constructor", "LITERAL___has_trivial_assign", "LITERAL___has_trivial_copy", "LITERAL___has_trivial_destructor", "LITERAL___has_virtual_destructor", "LITERAL___is_abstract", "LITERAL___is_empty", "LITERAL___is_literal_type", "LITERAL___is_polymorphic", "LITERAL___is_standard_layout", "LITERAL___is_trivial", "LITERAL___is_union", "LITERAL___underlying_type", "LITERAL___builtin_va_list", "LITERAL_concept", "LITERAL_requires", "LITERAL_co_await", "LITERAL_co_return", "LITERAL_co_yield", "LAST_LITERAL_TOKEN", "LITERAL__BUILT_IN_TYPE__", "LITERAL__TYPE_QUALIFIER__", "LITERAL__STORAGE_CLASS_SPECIFIER__", "T_CLOSE", "T_BLOCK", "T_GE", "T_CONTAINS", "T_ABSTRACT", "T_CLASS", "T_NOPASS", "T_UNFORMATTED", "T_LESSTHAN", "T_ENDSUBROUTINE", "T_GT", "T_IDENT", "T_INTERFACE", "T_RETURN", "T_XYZ", "T_EOF", "T_CALL", "T_EOS", "T_GO", "T_AND", "T_PERCENT", "T_PRINT", "T_ALLOCATE_STMT_1", "T_SUBROUTINE", "T_CONTROL_EDIT_DESC", "T_ENUMERATOR", "Alphanumeric_Character", "T_DEFINED_OP", "T_KIND", "T_STOP", "T_GREATERTHAN_EQ", "T_CHAR_STRING_EDIT_DESC", "T_ALLOCATABLE", "T_ENDINTERFACE", "T_END", "T_ASTERISK", "T_PRIVATE", "T_DOUBLEPRECISION", "T_CASE", "T_IMPLICIT", "T_IF", "T_THEN", "T_DIMENSION", "T_GOTO", "T_ENDMODULE", "T_IN", "T_WRITE", "T_FORMATTED", "WS", "T_DATA", "T_FALSE", "T_WHERE", "T_ENDIF", "T_SLASH", "SQ_Rep_Char", "T_GENERIC", "T_RECURSIVE", "DQ_Rep_Char", "T_ELSEIF", "T_BLOCKDATA", "OCTAL_CONSTANT", "T_SELECTTYPE", "T_MINUS", "T_SELECT", "T_FINAL", "T_UNDERSCORE", "T_IMPORT", "T_USE", "T_FILE", "T_RPAREN", "T_INTENT", "T_ENDBLOCK", "T_ASSIGNMENT_STMT", "T_PAUSE", "T_BACKSPACE", "T_ENDFILE", "T_EQUALS", "T_NON_INTRINSIC", "T_SELECTCASE", "T_DIGIT_STRING", "T_COLON_COLON", "T_NON_OVERRIDABLE", "Special_Character", "T_INCLUDE", "T_OPEN", "T_POWER", "T_ASSOCIATE", "T_CHAR_CONSTANT", "T_OPERATOR", "T_TO", "T_ENDASSOCIATE", "T_EQ", "T_GREATERTHAN", "T_DATA_EDIT_DESC", "T_INQUIRE_STMT_2", "T_EQV", "HEX_CONSTANT", "Digit_String", "T_ELEMENTAL", "T_CHARACTER", "PREPROCESS_LINE", "T_NULLIFY", "T_REWIND", "T_ARITHMETIC_IF_STMT", "T_FORALL_CONSTRUCT_STMT", "T_BIND", "T_ENDFORALL", "T_DO", "T_WHERE_STMT", "T_POINTER", "T_PROGRAM", "T_ENDTYPE", "T_WAIT", "T_ELSE", "T_IF_STMT", "T_RBRACKET", "T_LPAREN", "T_EXTENDS", "T_OPTIONAL", "T_DOUBLE", "T_MODULE", "T_READ", "T_ALLOCATE", "T_INTEGER", "T_OR", "T_EQUIVALENCE", "T_PERIOD", "T_ENTRY", "T_LABEL_DO_TERMINAL", "T_REAL", "T_CYCLE", "T_PROCEDURE", "T_EQ_EQ", "T_SLASH_EQ", "T_ENDSELECT", "T_PURE", "T_TRUE", "T_NE", "T_INTRINSIC", "T_PASS", "T_REAL_CONSTANT", "LINE_COMMENT", "T_PERIOD_EXPONENT", "T_ENDWHERE", "MISC_CHAR", "T_FORMAT", "T_DEFAULT", "T_SLASH_SLASH", "T_NONE", "T_NAMELIST", "T_SEQUENCE", "T_PRECISION", "T_ASYNCHRONOUS", "T_COMMA", "T_RESULT", "T_ENDBLOCKDATA", "T_LOGICAL", "T_VALUE", "Letter", "T_FORALL", "T_SAVE", "T_HOLLERITH", "T_FLUSH", "T_WHILE", "T_INQUIRE", "T_DEFERRED", "T_FORALL_STMT", "T_ASSIGN", "T_LBRACKET", "T_EXTERNAL", "T_VOLATILE", "T_OUT", "CONTINUE_CHAR", "T_COLON", "T_COMPLEX", "T_PLUS", "T_STMT_FUNCTION", "T_ONLY", "T_PROTECTED", "T_COMMON", "T_INOUT", "T_NEQV", "T_PUBLIC", "T_ENDDO", "T_ENDPROGRAM", "T_ENDFUNCTION", "T_WHERE_CONSTRUCT_STMT", "T_ELSEWHERE", "T_ENUM", "T_PARAMETER", "T_TARGET", "T_DOUBLECOMPLEX", "T_PTR_ASSIGNMENT_STMT", "T_TYPE", "T_LESSTHAN_EQ", "T_DEALLOCATE", "T_LT", "T_FUNCTION", "T_EQ_GT", "T_ENDENUM", "BINARY_CONSTANT", "T_LE", "T_LEN", "T_CONTINUE", "T_NOT", "Rep_Char", "T_ASSIGNMENT", "T_EXIT", "FORTRAN_COMMENT", "FIRST_ASSIGN", "FIRST_DIVIDE", "FIRST_STAR", "FIRST_MOD", "FIRST_NOT", "FIRST_AMPERSAND", "COMMENT", "CPP_COMMENT", "FIRST_OR", "FIRST_BITWISEXOR", "FIRST_COLON", "FIRST_LESS", "FIRST_GREATER", "FIRST_MINUS", "FIRST_PLUS", "FIRST_QUOTATION", "H_char_sequence", "Q_char_sequence", "DirectiveBody", "CHAR_LITERAL_BODY", "STRING_LITERAL_BODY", "RAW_STRING_LITERAL", "RAW_STRING_LITERAL_BODY", "Suffix", "ID_LIKE", "ID_DEFINED", "Identifier", "PostPPKwdChar", "PostInclChar", "PostIfChar", "LAST_LEXER_FAKE_RULE"
    };

    public static final int EOF=-1;
    public static final int ELLIPSIS=4;
    public static final int DOT=5;
    public static final int ASSIGNEQUAL=6;
    public static final int COLON=7;
    public static final int COMMA=8;
    public static final int QUESTIONMARK=9;
    public static final int SEMICOLON=10;
    public static final int POINTERTO=11;
    public static final int LPAREN=12;
    public static final int RPAREN=13;
    public static final int LSQUARE=14;
    public static final int RSQUARE=15;
    public static final int LCURLY=16;
    public static final int RCURLY=17;
    public static final int EQUAL=18;
    public static final int NOTEQUAL=19;
    public static final int LESSTHANOREQUALTO=20;
    public static final int LESSTHAN=21;
    public static final int GREATERTHANOREQUALTO=22;
    public static final int GREATERTHAN=23;
    public static final int DIVIDE=24;
    public static final int DIVIDEEQUAL=25;
    public static final int PLUS=26;
    public static final int PLUSEQUAL=27;
    public static final int PLUSPLUS=28;
    public static final int MINUS=29;
    public static final int MINUSEQUAL=30;
    public static final int MINUSMINUS=31;
    public static final int STAR=32;
    public static final int TIMESEQUAL=33;
    public static final int MOD=34;
    public static final int MODEQUAL=35;
    public static final int SHIFTRIGHT=36;
    public static final int SHIFTRIGHTEQUAL=37;
    public static final int SHIFTLEFT=38;
    public static final int SHIFTLEFTEQUAL=39;
    public static final int AND=40;
    public static final int NOT=41;
    public static final int OR=42;
    public static final int AMPERSAND=43;
    public static final int BITWISEANDEQUAL=44;
    public static final int TILDE=45;
    public static final int BITWISEOR=46;
    public static final int BITWISEOREQUAL=47;
    public static final int BITWISEXOR=48;
    public static final int BITWISEXOREQUAL=49;
    public static final int POINTERTOMBR=50;
    public static final int DOTMBR=51;
    public static final int SCOPE=52;
    public static final int AT=53;
    public static final int DOLLAR=54;
    public static final int BACK_SLASH=55;
    public static final int DEFINED=56;
    public static final int DBL_SHARP=57;
    public static final int SHARP=58;
    public static final int FUN_LIKE_MACRO_LPAREN=59;
    public static final int GRAVE_ACCENT=60;
    public static final int END_PREPROC_DIRECTIVE=61;
    public static final int LAST_CONST_TEXT_TOKEN=62;
    public static final int FLOATONE=63;
    public static final int FLOATTWO=64;
    public static final int HEXADECIMALINT=65;
    public static final int OCTALINT=66;
    public static final int DECIMALINT=67;
    public static final int Whitespace=68;
    public static final int EndOfLine=69;
    public static final int Skip=70;
    public static final int PreProcComment=71;
    public static final int PPLiterals=72;
    public static final int Space=73;
    public static final int PreProcBlockComment=74;
    public static final int PreProcLineComment=75;
    public static final int Comment=76;
    public static final int CPPComment=77;
    public static final int CHAR_LITERAL=78;
    public static final int STRING_LITERAL=79;
    public static final int InterStringWhitespace=80;
    public static final int StringPart=81;
    public static final int Escape=82;
    public static final int Digit=83;
    public static final int Decimal=84;
    public static final int LongSuffix=85;
    public static final int UnsignedSuffix=86;
    public static final int FloatSuffix=87;
    public static final int Exponent=88;
    public static final int Vocabulary=89;
    public static final int NUMBER=90;
    public static final int IDENT=91;
    public static final int BINARYINT=92;
    public static final int INCLUDE_STRING=93;
    public static final int SYS_INCLUDE_STRING=94;
    public static final int INCLUDE=95;
    public static final int INCLUDE_NEXT=96;
    public static final int DEFINE=97;
    public static final int UNDEF=98;
    public static final int IFDEF=99;
    public static final int IFNDEF=100;
    public static final int IF=101;
    public static final int ELIF=102;
    public static final int ELSE=103;
    public static final int ENDIF=104;
    public static final int PRAGMA=105;
    public static final int LINE=106;
    public static final int ERROR=107;
    public static final int PREPROC_DIRECTIVE=108;
    public static final int FIRST_LITERAL_TOKEN=109;
    public static final int LITERAL_OPERATOR=110;
    public static final int LITERAL_alignof=111;
    public static final int LITERAL__Alignof=112;
    public static final int LITERAL___alignof__=113;
    public static final int LITERAL_typeof=114;
    public static final int LITERAL___typeof__=115;
    public static final int LITERAL___typeof=116;
    public static final int LITERAL_template=117;
    public static final int LITERAL_typedef=118;
    public static final int LITERAL_enum=119;
    public static final int LITERAL_namespace=120;
    public static final int LITERAL_extern=121;
    public static final int LITERAL_inline=122;
    public static final int LITERAL__inline=123;
    public static final int LITERAL___inline__=124;
    public static final int LITERAL___inline=125;
    public static final int LITERAL_virtual=126;
    public static final int LITERAL_explicit=127;
    public static final int LITERAL_friend=128;
    public static final int LITERAL__stdcall=129;
    public static final int LITERAL___stdcall=130;
    public static final int LITERAL_typename=131;
    public static final int LITERAL_auto=132;
    public static final int LITERAL_register=133;
    public static final int LITERAL_static=134;
    public static final int LITERAL_mutable=135;
    public static final int LITERAL_const=136;
    public static final int LITERAL___const__=137;
    public static final int LITERAL___const=138;
    public static final int LITERAL_const_cast=139;
    public static final int LITERAL_volatile=140;
    public static final int LITERAL___volatile__=141;
    public static final int LITERAL___volatile=142;
    public static final int LITERAL_char=143;
    public static final int LITERAL_wchar_t=144;
    public static final int LITERAL_bool=145;
    public static final int LITERAL_short=146;
    public static final int LITERAL_int=147;
    public static final int LITERAL_long=148;
    public static final int LITERAL_signed=149;
    public static final int LITERAL___signed__=150;
    public static final int LITERAL___signed=151;
    public static final int LITERAL_unsigned=152;
    public static final int LITERAL___unsigned__=153;
    public static final int LITERAL_float=154;
    public static final int LITERAL_double=155;
    public static final int LITERAL_void=156;
    public static final int LITERAL__declspec=157;
    public static final int LITERAL___declspec=158;
    public static final int LITERAL_class=159;
    public static final int LITERAL_struct=160;
    public static final int LITERAL_union=161;
    public static final int LITERAL_this=162;
    public static final int LITERAL_true=163;
    public static final int LITERAL_false=164;
    public static final int LITERAL_public=165;
    public static final int LITERAL_protected=166;
    public static final int LITERAL_private=167;
    public static final int LITERAL_throw=168;
    public static final int LITERAL_case=169;
    public static final int LITERAL_default=170;
    public static final int LITERAL_if=171;
    public static final int LITERAL_else=172;
    public static final int LITERAL_switch=173;
    public static final int LITERAL_while=174;
    public static final int LITERAL_do=175;
    public static final int LITERAL_for=176;
    public static final int LITERAL_goto=177;
    public static final int LITERAL_continue=178;
    public static final int LITERAL_break=179;
    public static final int LITERAL_return=180;
    public static final int LITERAL_try=181;
    public static final int LITERAL_catch=182;
    public static final int LITERAL_using=183;
    public static final int LITERAL_export=184;
    public static final int LITERAL_asm=185;
    public static final int LITERAL__asm=186;
    public static final int LITERAL___asm__=187;
    public static final int LITERAL___asm=188;
    public static final int LITERAL__endasm=189;
    public static final int LITERAL_sizeof=190;
    public static final int LITERAL_dynamic_cast=191;
    public static final int LITERAL_static_cast=192;
    public static final int LITERAL_reinterpret_cast=193;
    public static final int LITERAL_new=194;
    public static final int LITERAL__cdecl=195;
    public static final int LITERAL___cdecl=196;
    public static final int LITERAL__near=197;
    public static final int LITERAL___near=198;
    public static final int LITERAL__far=199;
    public static final int LITERAL___far=200;
    public static final int LITERAL___interrupt=201;
    public static final int LITERAL_pascal=202;
    public static final int LITERAL__pascal=203;
    public static final int LITERAL___pascal=204;
    public static final int LITERAL_delete=205;
    public static final int LITERAL__int64=206;
    public static final int LITERAL___int64=207;
    public static final int LITERAL___w64=208;
    public static final int LITERAL___extension__=209;
    public static final int LITERAL___attribute__=210;
    public static final int LITERAL_restrict=211;
    public static final int LITERAL___restrict=212;
    public static final int LITERAL___complex__=213;
    public static final int LITERAL___imag=214;
    public static final int LITERAL___real=215;
    public static final int LITERAL___global=216;
    public static final int LITERAL__Bool=217;
    public static final int LITERAL__Complex=218;
    public static final int LITERAL___thread=219;
    public static final int LITERAL___attribute=220;
    public static final int LITERAL__Imaginary=221;
    public static final int LITERAL_bit=222;
    public static final int LITERAL___symbolic=223;
    public static final int LITERAL___hidden=224;
    public static final int LITERAL_final=225;
    public static final int LITERAL_override=226;
    public static final int LITERAL_constexpr=227;
    public static final int LITERAL_decltype=228;
    public static final int LITERAL_nullptr=229;
    public static final int LITERAL_thread_local=230;
    public static final int LITERAL__Thread_local=231;
    public static final int LITERAL_static_assert=232;
    public static final int LITERAL__Static_assert=233;
    public static final int LITERAL_alignas=234;
    public static final int LITERAL__Alignas=235;
    public static final int LITERAL_char16_t=236;
    public static final int LITERAL_char32_t=237;
    public static final int LITERAL_noexcept=238;
    public static final int LITERAL___decltype=239;
    public static final int LITERAL___complex=240;
    public static final int LITERAL___forceinline=241;
    public static final int LITERAL___clrcall=242;
    public static final int LITERAL___try=243;
    public static final int LITERAL___finally=244;
    public static final int LITERAL___null=245;
    public static final int LITERAL___alignof=246;
    public static final int LITERAL___is_class=247;
    public static final int LITERAL___is_enum=248;
    public static final int LITERAL___is_pod=249;
    public static final int LITERAL___is_base_of=250;
    public static final int LITERAL___has_trivial_constructor=251;
    public static final int LITERAL___restrict__=252;
    public static final int LITERAL__Noreturn=253;
    public static final int LITERAL__Atomic=254;
    public static final int LITERAL___has_nothrow_assign=255;
    public static final int LITERAL___has_nothrow_copy=256;
    public static final int LITERAL___has_nothrow_constructor=257;
    public static final int LITERAL___has_trivial_assign=258;
    public static final int LITERAL___has_trivial_copy=259;
    public static final int LITERAL___has_trivial_destructor=260;
    public static final int LITERAL___has_virtual_destructor=261;
    public static final int LITERAL___is_abstract=262;
    public static final int LITERAL___is_empty=263;
    public static final int LITERAL___is_literal_type=264;
    public static final int LITERAL___is_polymorphic=265;
    public static final int LITERAL___is_standard_layout=266;
    public static final int LITERAL___is_trivial=267;
    public static final int LITERAL___is_union=268;
    public static final int LITERAL___underlying_type=269;
    public static final int LITERAL___builtin_va_list=270;
    public static final int LITERAL_concept=271;
    public static final int LITERAL_requires=272;
    public static final int LITERAL_co_await=273;
    public static final int LITERAL_co_return=274;
    public static final int LITERAL_co_yield=275;
    public static final int LAST_LITERAL_TOKEN=276;
    public static final int LITERAL__BUILT_IN_TYPE__=277;
    public static final int LITERAL__TYPE_QUALIFIER__=278;
    public static final int LITERAL__STORAGE_CLASS_SPECIFIER__=279;
    public static final int T_CLOSE=280;
    public static final int T_BLOCK=281;
    public static final int T_GE=282;
    public static final int T_CONTAINS=283;
    public static final int T_ABSTRACT=284;
    public static final int T_CLASS=285;
    public static final int T_NOPASS=286;
    public static final int T_UNFORMATTED=287;
    public static final int T_LESSTHAN=288;
    public static final int T_ENDSUBROUTINE=289;
    public static final int T_GT=290;
    public static final int T_IDENT=291;
    public static final int T_INTERFACE=292;
    public static final int T_RETURN=293;
    public static final int T_XYZ=294;
    public static final int T_EOF=295;
    public static final int T_CALL=296;
    public static final int T_EOS=297;
    public static final int T_GO=298;
    public static final int T_AND=299;
    public static final int T_PERCENT=300;
    public static final int T_PRINT=301;
    public static final int T_ALLOCATE_STMT_1=302;
    public static final int T_SUBROUTINE=303;
    public static final int T_CONTROL_EDIT_DESC=304;
    public static final int T_ENUMERATOR=305;
    public static final int Alphanumeric_Character=306;
    public static final int T_DEFINED_OP=307;
    public static final int T_KIND=308;
    public static final int T_STOP=309;
    public static final int T_GREATERTHAN_EQ=310;
    public static final int T_CHAR_STRING_EDIT_DESC=311;
    public static final int T_ALLOCATABLE=312;
    public static final int T_ENDINTERFACE=313;
    public static final int T_END=314;
    public static final int T_ASTERISK=315;
    public static final int T_PRIVATE=316;
    public static final int T_DOUBLEPRECISION=317;
    public static final int T_CASE=318;
    public static final int T_IMPLICIT=319;
    public static final int T_IF=320;
    public static final int T_THEN=321;
    public static final int T_DIMENSION=322;
    public static final int T_GOTO=323;
    public static final int T_ENDMODULE=324;
    public static final int T_IN=325;
    public static final int T_WRITE=326;
    public static final int T_FORMATTED=327;
    public static final int WS=328;
    public static final int T_DATA=329;
    public static final int T_FALSE=330;
    public static final int T_WHERE=331;
    public static final int T_ENDIF=332;
    public static final int T_SLASH=333;
    public static final int SQ_Rep_Char=334;
    public static final int T_GENERIC=335;
    public static final int T_RECURSIVE=336;
    public static final int DQ_Rep_Char=337;
    public static final int T_ELSEIF=338;
    public static final int T_BLOCKDATA=339;
    public static final int OCTAL_CONSTANT=340;
    public static final int T_SELECTTYPE=341;
    public static final int T_MINUS=342;
    public static final int T_SELECT=343;
    public static final int T_FINAL=344;
    public static final int T_UNDERSCORE=345;
    public static final int T_IMPORT=346;
    public static final int T_USE=347;
    public static final int T_FILE=348;
    public static final int T_RPAREN=349;
    public static final int T_INTENT=350;
    public static final int T_ENDBLOCK=351;
    public static final int T_ASSIGNMENT_STMT=352;
    public static final int T_PAUSE=353;
    public static final int T_BACKSPACE=354;
    public static final int T_ENDFILE=355;
    public static final int T_EQUALS=356;
    public static final int T_NON_INTRINSIC=357;
    public static final int T_SELECTCASE=358;
    public static final int T_DIGIT_STRING=359;
    public static final int T_COLON_COLON=360;
    public static final int T_NON_OVERRIDABLE=361;
    public static final int Special_Character=362;
    public static final int T_INCLUDE=363;
    public static final int T_OPEN=364;
    public static final int T_POWER=365;
    public static final int T_ASSOCIATE=366;
    public static final int T_CHAR_CONSTANT=367;
    public static final int T_OPERATOR=368;
    public static final int T_TO=369;
    public static final int T_ENDASSOCIATE=370;
    public static final int T_EQ=371;
    public static final int T_GREATERTHAN=372;
    public static final int T_DATA_EDIT_DESC=373;
    public static final int T_INQUIRE_STMT_2=374;
    public static final int T_EQV=375;
    public static final int HEX_CONSTANT=376;
    public static final int Digit_String=377;
    public static final int T_ELEMENTAL=378;
    public static final int T_CHARACTER=379;
    public static final int PREPROCESS_LINE=380;
    public static final int T_NULLIFY=381;
    public static final int T_REWIND=382;
    public static final int T_ARITHMETIC_IF_STMT=383;
    public static final int T_FORALL_CONSTRUCT_STMT=384;
    public static final int T_BIND=385;
    public static final int T_ENDFORALL=386;
    public static final int T_DO=387;
    public static final int T_WHERE_STMT=388;
    public static final int T_POINTER=389;
    public static final int T_PROGRAM=390;
    public static final int T_ENDTYPE=391;
    public static final int T_WAIT=392;
    public static final int T_ELSE=393;
    public static final int T_IF_STMT=394;
    public static final int T_RBRACKET=395;
    public static final int T_LPAREN=396;
    public static final int T_EXTENDS=397;
    public static final int T_OPTIONAL=398;
    public static final int T_DOUBLE=399;
    public static final int T_MODULE=400;
    public static final int T_READ=401;
    public static final int T_ALLOCATE=402;
    public static final int T_INTEGER=403;
    public static final int T_OR=404;
    public static final int T_EQUIVALENCE=405;
    public static final int T_PERIOD=406;
    public static final int T_ENTRY=407;
    public static final int T_LABEL_DO_TERMINAL=408;
    public static final int T_REAL=409;
    public static final int T_CYCLE=410;
    public static final int T_PROCEDURE=411;
    public static final int T_EQ_EQ=412;
    public static final int T_SLASH_EQ=413;
    public static final int T_ENDSELECT=414;
    public static final int T_PURE=415;
    public static final int T_TRUE=416;
    public static final int T_NE=417;
    public static final int T_INTRINSIC=418;
    public static final int T_PASS=419;
    public static final int T_REAL_CONSTANT=420;
    public static final int LINE_COMMENT=421;
    public static final int T_PERIOD_EXPONENT=422;
    public static final int T_ENDWHERE=423;
    public static final int MISC_CHAR=424;
    public static final int T_FORMAT=425;
    public static final int T_DEFAULT=426;
    public static final int T_SLASH_SLASH=427;
    public static final int T_NONE=428;
    public static final int T_NAMELIST=429;
    public static final int T_SEQUENCE=430;
    public static final int T_PRECISION=431;
    public static final int T_ASYNCHRONOUS=432;
    public static final int T_COMMA=433;
    public static final int T_RESULT=434;
    public static final int T_ENDBLOCKDATA=435;
    public static final int T_LOGICAL=436;
    public static final int T_VALUE=437;
    public static final int Letter=438;
    public static final int T_FORALL=439;
    public static final int T_SAVE=440;
    public static final int T_HOLLERITH=441;
    public static final int T_FLUSH=442;
    public static final int T_WHILE=443;
    public static final int T_INQUIRE=444;
    public static final int T_DEFERRED=445;
    public static final int T_FORALL_STMT=446;
    public static final int T_ASSIGN=447;
    public static final int T_LBRACKET=448;
    public static final int T_EXTERNAL=449;
    public static final int T_VOLATILE=450;
    public static final int T_OUT=451;
    public static final int CONTINUE_CHAR=452;
    public static final int T_COLON=453;
    public static final int T_COMPLEX=454;
    public static final int T_PLUS=455;
    public static final int T_STMT_FUNCTION=456;
    public static final int T_ONLY=457;
    public static final int T_PROTECTED=458;
    public static final int T_COMMON=459;
    public static final int T_INOUT=460;
    public static final int T_NEQV=461;
    public static final int T_PUBLIC=462;
    public static final int T_ENDDO=463;
    public static final int T_ENDPROGRAM=464;
    public static final int T_ENDFUNCTION=465;
    public static final int T_WHERE_CONSTRUCT_STMT=466;
    public static final int T_ELSEWHERE=467;
    public static final int T_ENUM=468;
    public static final int T_PARAMETER=469;
    public static final int T_TARGET=470;
    public static final int T_DOUBLECOMPLEX=471;
    public static final int T_PTR_ASSIGNMENT_STMT=472;
    public static final int T_TYPE=473;
    public static final int T_LESSTHAN_EQ=474;
    public static final int T_DEALLOCATE=475;
    public static final int T_LT=476;
    public static final int T_FUNCTION=477;
    public static final int T_EQ_GT=478;
    public static final int T_ENDENUM=479;
    public static final int BINARY_CONSTANT=480;
    public static final int T_LE=481;
    public static final int T_LEN=482;
    public static final int T_CONTINUE=483;
    public static final int T_NOT=484;
    public static final int Rep_Char=485;
    public static final int T_ASSIGNMENT=486;
    public static final int T_EXIT=487;
    public static final int FORTRAN_COMMENT=488;
    public static final int FIRST_ASSIGN=489;
    public static final int FIRST_DIVIDE=490;
    public static final int FIRST_STAR=491;
    public static final int FIRST_MOD=492;
    public static final int FIRST_NOT=493;
    public static final int FIRST_AMPERSAND=494;
    public static final int COMMENT=495;
    public static final int CPP_COMMENT=496;
    public static final int FIRST_OR=497;
    public static final int FIRST_BITWISEXOR=498;
    public static final int FIRST_COLON=499;
    public static final int FIRST_LESS=500;
    public static final int FIRST_GREATER=501;
    public static final int FIRST_MINUS=502;
    public static final int FIRST_PLUS=503;
    public static final int FIRST_QUOTATION=504;
    public static final int H_char_sequence=505;
    public static final int Q_char_sequence=506;
    public static final int DirectiveBody=507;
    public static final int CHAR_LITERAL_BODY=508;
    public static final int STRING_LITERAL_BODY=509;
    public static final int RAW_STRING_LITERAL=510;
    public static final int RAW_STRING_LITERAL_BODY=511;
    public static final int Suffix=512;
    public static final int ID_LIKE=513;
    public static final int ID_DEFINED=514;
    public static final int Identifier=515;
    public static final int PostPPKwdChar=516;
    public static final int PostInclChar=517;
    public static final int PostIfChar=518;
    public static final int LAST_LEXER_FAKE_RULE=519;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public EvaluatorParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public EvaluatorParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return EvaluatorParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g"; }


        /** Map variable name to Integer object holding value */
        HashMap memory = new HashMap();

        VariableProvider vp;

        public void setVariableProvider(VariableProvider vp) {
            this.vp = vp;
        }

        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            // do nothing
        }

        private boolean checkParams(int...params) {
            for (int param : params) {
                if (param == Integer.MAX_VALUE) {
                    return false;
                }
            }
            return true;
        }

        private int safePlus(int first, int second) {
            return checkParams(first, second) ? first + second : Integer.MAX_VALUE;
        }

        private int safeMinus(int first, int second) {
            return checkParams(first, second) ? first - second : Integer.MAX_VALUE;
        }

        private int safeMul(int first, int second) {
            return checkParams(first, second) ? first * second : Integer.MAX_VALUE;
        }

        private int safeParseInt(String text) {
            if (text != null) {
                try {
                  return Integer.parseInt(text.replaceAll("[a-z,A-Z,_].*", ""));
                } catch (NumberFormatException ex) {
                  return Integer.MAX_VALUE;
                }
            }
            return 0;
        }



    // $ANTLR start "prog"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:102:1: prog : expr ;
    public final void prog() throws RecognitionException {
        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:102:5: ( expr )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:102:7: expr
            {
            pushFollow(FOLLOW_expr_in_prog40);
            expr();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"



    // $ANTLR start "expr"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:104:1: expr returns [int value] : e= equalityExpr ( PLUS e= equalityExpr | MINUS e= equalityExpr )* ;
    public final int expr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:105:5: (e= equalityExpr ( PLUS e= equalityExpr | MINUS e= equalityExpr )* )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:105:9: e= equalityExpr ( PLUS e= equalityExpr | MINUS e= equalityExpr )*
            {
            pushFollow(FOLLOW_equalityExpr_in_expr60);
            e=equalityExpr();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value = e;}

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:106:9: ( PLUS e= equalityExpr | MINUS e= equalityExpr )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PLUS) ) {
                    alt1=1;
                }
                else if ( (LA1_0==MINUS) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:106:13: PLUS e= equalityExpr
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_expr76); if (state.failed) return value;

            	    pushFollow(FOLLOW_equalityExpr_in_expr80);
            	    e=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = safePlus(value, e);}

            	    }
            	    break;
            	case 2 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:107:13: MINUS e= equalityExpr
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_expr96); if (state.failed) return value;

            	    pushFollow(FOLLOW_equalityExpr_in_expr100);
            	    e=equalityExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = safeMinus(value, e);}

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "expr"



    // $ANTLR start "equalityExpr"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:111:1: equalityExpr returns [int value] : e= multExpr ( EQUAL e= multExpr | NOTEQUAL e= multExpr )* ;
    public final int equalityExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:112:5: (e= multExpr ( EQUAL e= multExpr | NOTEQUAL e= multExpr )* )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:113:9: e= multExpr ( EQUAL e= multExpr | NOTEQUAL e= multExpr )*
            {
            pushFollow(FOLLOW_multExpr_in_equalityExpr146);
            e=multExpr();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value = e;}

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:114:9: ( EQUAL e= multExpr | NOTEQUAL e= multExpr )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==EQUAL) ) {
                    alt2=1;
                }
                else if ( (LA2_0==NOTEQUAL) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:114:11: EQUAL e= multExpr
            	    {
            	    match(input,EQUAL,FOLLOW_EQUAL_in_equalityExpr160); if (state.failed) return value;

            	    pushFollow(FOLLOW_multExpr_in_equalityExpr166);
            	    e=multExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = (value == e) ? 1 : 0;}

            	    }
            	    break;
            	case 2 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:115:11: NOTEQUAL e= multExpr
            	    {
            	    match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_equalityExpr180); if (state.failed) return value;

            	    pushFollow(FOLLOW_multExpr_in_equalityExpr186);
            	    e=multExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = (value != e) ? 1 : 0;}

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "equalityExpr"



    // $ANTLR start "multExpr"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:119:1: multExpr returns [int value] : e= unaryExpr ( STAR e= unaryExpr )* ;
    public final int multExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:120:5: (e= unaryExpr ( STAR e= unaryExpr )* )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:120:9: e= unaryExpr ( STAR e= unaryExpr )*
            {
            pushFollow(FOLLOW_unaryExpr_in_multExpr224);
            e=unaryExpr();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value = e;}

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:120:42: ( STAR e= unaryExpr )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==STAR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:120:43: STAR e= unaryExpr
            	    {
            	    match(input,STAR,FOLLOW_STAR_in_multExpr229); if (state.failed) return value;

            	    pushFollow(FOLLOW_unaryExpr_in_multExpr233);
            	    e=unaryExpr();

            	    state._fsp--;
            	    if (state.failed) return value;

            	    if ( state.backtracking==0 ) {value = safeMul(value, e);}

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "multExpr"



    // $ANTLR start "unaryExpr"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:123:1: unaryExpr returns [int value] : (e= atom | NOT e= unaryExpr );
    public final int unaryExpr() throws RecognitionException {
        int value = 0;


        int e =0;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:124:5: (e= atom | NOT e= unaryExpr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==LPAREN||LA4_0==SCOPE||LA4_0==DECIMALINT||LA4_0==IDENT||LA4_0==LITERAL_const||(LA4_0 >= LITERAL_true && LA4_0 <= LITERAL_false)||LA4_0==LITERAL_sizeof||LA4_0==LITERAL_static_cast) ) {
                alt4=1;
            }
            else if ( (LA4_0==NOT) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:124:9: e= atom
                    {
                    pushFollow(FOLLOW_atom_in_unaryExpr262);
                    e=atom();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = e;}

                    }
                    break;
                case 2 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:125:9: NOT e= unaryExpr
                    {
                    match(input,NOT,FOLLOW_NOT_in_unaryExpr274); if (state.failed) return value;

                    pushFollow(FOLLOW_unaryExpr_in_unaryExpr278);
                    e=unaryExpr();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = (e == 0 ? 1 : 0);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "unaryExpr"



    // $ANTLR start "atom"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:128:1: atom returns [int value] : ( DECIMALINT | ( function_call )=> function_call | variable | LPAREN expr RPAREN | LITERAL_sizeof balance_lparen_rparen | LITERAL_static_cast LESSTHAN (~ GREATERTHAN )* GREATERTHAN LPAREN expr RPAREN | LITERAL_true | LITERAL_false );
    public final int atom() throws RecognitionException {
        int value = 0;


        Token DECIMALINT1=null;
        Token LITERAL_true7=null;
        Token LITERAL_false8=null;
        int function_call2 =0;

        int variable3 =0;

        int expr4 =0;

        String balance_lparen_rparen5 =null;

        int expr6 =0;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:129:5: ( DECIMALINT | ( function_call )=> function_call | variable | LPAREN expr RPAREN | LITERAL_sizeof balance_lparen_rparen | LITERAL_static_cast LESSTHAN (~ GREATERTHAN )* GREATERTHAN LPAREN expr RPAREN | LITERAL_true | LITERAL_false )
            int alt6=8;
            switch ( input.LA(1) ) {
            case DECIMALINT:
                {
                alt6=1;
                }
                break;
            case SCOPE:
                {
                int LA6_2 = input.LA(2);

                if ( (synpred1_Evaluator()) ) {
                    alt6=2;
                }
                else if ( (true) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case IDENT:
                {
                int LA6_3 = input.LA(2);

                if ( (synpred1_Evaluator()) ) {
                    alt6=2;
                }
                else if ( (true) ) {
                    alt6=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case LITERAL_const:
                {
                alt6=3;
                }
                break;
            case LPAREN:
                {
                alt6=4;
                }
                break;
            case LITERAL_sizeof:
                {
                alt6=5;
                }
                break;
            case LITERAL_static_cast:
                {
                alt6=6;
                }
                break;
            case LITERAL_true:
                {
                alt6=7;
                }
                break;
            case LITERAL_false:
                {
                alt6=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:130:9: DECIMALINT
                    {
                    DECIMALINT1=(Token)match(input,DECIMALINT,FOLLOW_DECIMALINT_in_atom312); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = safeParseInt((DECIMALINT1!=null?DECIMALINT1.getText():null)); }

                    }
                    break;
                case 2 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:131:9: ( function_call )=> function_call
                    {
                    pushFollow(FOLLOW_function_call_in_atom330);
                    function_call2=function_call();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = function_call2;}

                    }
                    break;
                case 3 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:132:9: variable
                    {
                    pushFollow(FOLLOW_variable_in_atom342);
                    variable3=variable();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = variable3;}

                    }
                    break;
                case 4 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:133:9: LPAREN expr RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_atom354); if (state.failed) return value;

                    pushFollow(FOLLOW_expr_in_atom356);
                    expr4=expr();

                    state._fsp--;
                    if (state.failed) return value;

                    match(input,RPAREN,FOLLOW_RPAREN_in_atom358); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = expr4;}

                    }
                    break;
                case 5 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:134:9: LITERAL_sizeof balance_lparen_rparen
                    {
                    match(input,LITERAL_sizeof,FOLLOW_LITERAL_sizeof_in_atom370); if (state.failed) return value;

                    pushFollow(FOLLOW_balance_lparen_rparen_in_atom372);
                    balance_lparen_rparen5=balance_lparen_rparen();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = vp==null ? 0 : vp.getSizeOfValue(balance_lparen_rparen5);}

                    }
                    break;
                case 6 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:135:9: LITERAL_static_cast LESSTHAN (~ GREATERTHAN )* GREATERTHAN LPAREN expr RPAREN
                    {
                    match(input,LITERAL_static_cast,FOLLOW_LITERAL_static_cast_in_atom384); if (state.failed) return value;

                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_atom386); if (state.failed) return value;

                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:135:38: (~ GREATERTHAN )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= ELLIPSIS && LA5_0 <= GREATERTHANOREQUALTO)||(LA5_0 >= DIVIDE && LA5_0 <= LAST_LEXER_FAKE_RULE)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:
                    	    {
                    	    if ( (input.LA(1) >= ELLIPSIS && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= DIVIDE && input.LA(1) <= LAST_LEXER_FAKE_RULE) ) {
                    	        input.consume();
                    	        state.errorRecovery=false;
                    	        state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return value;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_atom394); if (state.failed) return value;

                    match(input,LPAREN,FOLLOW_LPAREN_in_atom396); if (state.failed) return value;

                    pushFollow(FOLLOW_expr_in_atom398);
                    expr6=expr();

                    state._fsp--;
                    if (state.failed) return value;

                    match(input,RPAREN,FOLLOW_RPAREN_in_atom400); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = expr6;}

                    }
                    break;
                case 7 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:136:9: LITERAL_true
                    {
                    LITERAL_true7=(Token)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_atom412); if (state.failed) return value;

                    if ( state.backtracking==0 ) {
                                value = vp==null?0:vp.getValue((LITERAL_true7!=null?LITERAL_true7.getText():null));
                            }

                    }
                    break;
                case 8 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:140:9: LITERAL_false
                    {
                    LITERAL_false8=(Token)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_atom432); if (state.failed) return value;

                    if ( state.backtracking==0 ) {
                                value = vp==null?0:vp.getValue((LITERAL_false8!=null?LITERAL_false8.getText():null));
                            }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "atom"



    // $ANTLR start "function_call"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:146:1: function_call returns [int value] : id= qualified_id args= balance_lparen_rparen ;
    public final int function_call() throws RecognitionException {
        int value = 0;


        String id =null;

        String args =null;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:147:5: (id= qualified_id args= balance_lparen_rparen )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:148:9: id= qualified_id args= balance_lparen_rparen
            {
            pushFollow(FOLLOW_qualified_id_in_function_call475);
            id=qualified_id();

            state._fsp--;
            if (state.failed) return value;

            pushFollow(FOLLOW_balance_lparen_rparen_in_function_call490);
            args=balance_lparen_rparen();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) { value = vp==null ? 0 : vp.getFunCallValue(id + args); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "function_call"



    // $ANTLR start "variable"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:153:1: variable returns [int value] : ( LITERAL_const )* id= qualified_id ;
    public final int variable() throws RecognitionException {
        int value = 0;


        String id =null;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:154:5: ( ( LITERAL_const )* id= qualified_id )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:155:9: ( LITERAL_const )* id= qualified_id
            {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:155:9: ( LITERAL_const )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LITERAL_const) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:155:10: LITERAL_const
            	    {
            	    match(input,LITERAL_const,FOLLOW_LITERAL_const_in_variable530); if (state.failed) return value;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            pushFollow(FOLLOW_qualified_id_in_variable546);
            id=qualified_id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) { value = vp==null ? 0 : vp.getValue(id); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "variable"



    // $ANTLR start "qualified_id"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:160:1: qualified_id returns [String q = \"\"] : so= scope_override ( IDENT (inner= balance_less_greater )? ) ;
    public final String qualified_id() throws RecognitionException {
        String q =  "";


        Token IDENT9=null;
        String so =null;

        String inner =null;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:161:5: (so= scope_override ( IDENT (inner= balance_less_greater )? ) )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:162:9: so= scope_override ( IDENT (inner= balance_less_greater )? )
            {
            pushFollow(FOLLOW_scope_override_in_qualified_id590);
            so=scope_override();

            state._fsp--;
            if (state.failed) return q;

            if ( state.backtracking==0 ) { q += (so != null)? so : ""; }

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:164:9: ( IDENT (inner= balance_less_greater )? )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:165:13: IDENT (inner= balance_less_greater )?
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_id624); if (state.failed) return q;

            if ( state.backtracking==0 ) {q += (IDENT9!=null?IDENT9.getText():null);}

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:167:13: (inner= balance_less_greater )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LESSTHAN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:168:17: inner= balance_less_greater
                    {
                    pushFollow(FOLLOW_balance_less_greater_in_qualified_id674);
                    inner=balance_less_greater();

                    state._fsp--;
                    if (state.failed) return q;

                    if ( state.backtracking==0 ) {q += inner;}

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return q;
    }
    // $ANTLR end "qualified_id"



    // $ANTLR start "scope_override"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:173:1: scope_override returns [String s = \"\"] : ( SCOPE )? ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )? ;
    public final String scope_override() throws RecognitionException {
        String s =  "";


        String sp =null;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:174:5: ( ( SCOPE )? ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )? )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:175:9: ( SCOPE )? ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )?
            {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:175:9: ( SCOPE )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==SCOPE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:176:13: SCOPE
                    {
                    match(input,SCOPE,FOLLOW_SCOPE_in_scope_override744); if (state.failed) return s;

                    if ( state.backtracking==0 ) { s += "::";}

                    }
                    break;

            }


            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:178:9: ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IDENT) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred2_Evaluator()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:179:13: ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part
                    {
                    pushFollow(FOLLOW_scope_override_part_in_scope_override797);
                    sp=scope_override_part();

                    state._fsp--;
                    if (state.failed) return s;

                    if ( state.backtracking==0 ) {
                                        s += (sp != null) ? sp : "";
                                }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "scope_override"



    // $ANTLR start "scope_override_part"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:186:1: scope_override_part returns [String s = \"\"] : IDENT (inner= balance_less_greater )? SCOPE ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )? ;
    public final String scope_override_part() throws RecognitionException {
        String s =  "";


        Token IDENT10=null;
        String inner =null;

        String sp =null;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:187:5: ( IDENT (inner= balance_less_greater )? SCOPE ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )? )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:188:9: IDENT (inner= balance_less_greater )? SCOPE ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )?
            {
            IDENT10=(Token)match(input,IDENT,FOLLOW_IDENT_in_scope_override_part851); if (state.failed) return s;

            if ( state.backtracking==0 ) {
                        s += (IDENT10!=null?IDENT10.getText():null);
                    }

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:192:9: (inner= balance_less_greater )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LESSTHAN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:193:13: inner= balance_less_greater
                    {
                    pushFollow(FOLLOW_balance_less_greater_in_scope_override_part889);
                    inner=balance_less_greater();

                    state._fsp--;
                    if (state.failed) return s;

                    if ( state.backtracking==0 ) {s += inner;}

                    }
                    break;

            }


            match(input,SCOPE,FOLLOW_SCOPE_in_scope_override_part912); if (state.failed) return s;

            if ( state.backtracking==0 ) {
                        s += "::";
                    }

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:200:9: ( ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred3_Evaluator()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:200:10: ( IDENT ( balance_less_greater )? SCOPE )=>sp= scope_override_part
                    {
                    pushFollow(FOLLOW_scope_override_part_in_scope_override_part950);
                    sp=scope_override_part();

                    state._fsp--;
                    if (state.failed) return s;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                        s += (sp != null) ? sp : "";
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "scope_override_part"



    // $ANTLR start "balance_less_greater"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:206:1: balance_less_greater returns [String s = \"\"] : LESSTHAN ( ( LESSTHAN )=>inner= balance_less_greater |other= (~ GREATERTHAN ) )* GREATERTHAN ;
    public final String balance_less_greater() throws RecognitionException {
        String s =  "";


        Token other=null;
        String inner =null;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:207:5: ( LESSTHAN ( ( LESSTHAN )=>inner= balance_less_greater |other= (~ GREATERTHAN ) )* GREATERTHAN )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:208:9: LESSTHAN ( ( LESSTHAN )=>inner= balance_less_greater |other= (~ GREATERTHAN ) )* GREATERTHAN
            {
            match(input,LESSTHAN,FOLLOW_LESSTHAN_in_balance_less_greater991); if (state.failed) return s;

            if ( state.backtracking==0 ) {s += "<";}

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:209:9: ( ( LESSTHAN )=>inner= balance_less_greater |other= (~ GREATERTHAN ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==LESSTHAN) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred4_Evaluator()) ) {
                        alt13=1;
                    }
                    else if ( (true) ) {
                        alt13=2;
                    }


                }
                else if ( ((LA13_0 >= ELLIPSIS && LA13_0 <= LESSTHANOREQUALTO)||LA13_0==GREATERTHANOREQUALTO||(LA13_0 >= DIVIDE && LA13_0 <= LAST_LEXER_FAKE_RULE)) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:210:13: ( LESSTHAN )=>inner= balance_less_greater
            	    {
            	    pushFollow(FOLLOW_balance_less_greater_in_balance_less_greater1026);
            	    inner=balance_less_greater();

            	    state._fsp--;
            	    if (state.failed) return s;

            	    if ( state.backtracking==0 ) {s += inner;}

            	    }
            	    break;
            	case 2 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:212:13: other= (~ GREATERTHAN )
            	    {
            	    other=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ELLIPSIS && input.LA(1) <= GREATERTHANOREQUALTO)||(input.LA(1) >= DIVIDE && input.LA(1) <= LAST_LEXER_FAKE_RULE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return s;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    if ( state.backtracking==0 ) {s += (other!=null?other.getText():null);}

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_balance_less_greater1082); if (state.failed) return s;

            if ( state.backtracking==0 ) {s += "> ";}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "balance_less_greater"



    // $ANTLR start "balance_lparen_rparen"
    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:217:1: balance_lparen_rparen returns [String s = \"\"] : LPAREN ( ( LPAREN )=>inner= balance_lparen_rparen | ( GREATERTHAN )=> GREATERTHAN |other= (~ RPAREN ) )* RPAREN ;
    public final String balance_lparen_rparen() throws RecognitionException {
        String s =  "";


        Token other=null;
        String inner =null;


        try {
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:218:5: ( LPAREN ( ( LPAREN )=>inner= balance_lparen_rparen | ( GREATERTHAN )=> GREATERTHAN |other= (~ RPAREN ) )* RPAREN )
            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:219:9: LPAREN ( ( LPAREN )=>inner= balance_lparen_rparen | ( GREATERTHAN )=> GREATERTHAN |other= (~ RPAREN ) )* RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_balance_lparen_rparen1113); if (state.failed) return s;

            if ( state.backtracking==0 ) {s += "(";}

            // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:220:9: ( ( LPAREN )=>inner= balance_lparen_rparen | ( GREATERTHAN )=> GREATERTHAN |other= (~ RPAREN ) )*
            loop14:
            do {
                int alt14=4;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LPAREN) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred5_Evaluator()) ) {
                        alt14=1;
                    }
                    else if ( (true) ) {
                        alt14=3;
                    }


                }
                else if ( (LA14_0==GREATERTHAN) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred6_Evaluator()) ) {
                        alt14=2;
                    }
                    else if ( (true) ) {
                        alt14=3;
                    }


                }
                else if ( ((LA14_0 >= ELLIPSIS && LA14_0 <= POINTERTO)||(LA14_0 >= LSQUARE && LA14_0 <= GREATERTHANOREQUALTO)||(LA14_0 >= DIVIDE && LA14_0 <= LAST_LEXER_FAKE_RULE)) ) {
                    alt14=3;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:221:13: ( LPAREN )=>inner= balance_lparen_rparen
            	    {
            	    pushFollow(FOLLOW_balance_lparen_rparen_in_balance_lparen_rparen1148);
            	    inner=balance_lparen_rparen();

            	    state._fsp--;
            	    if (state.failed) return s;

            	    if ( state.backtracking==0 ) {s += inner;}

            	    }
            	    break;
            	case 2 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:225:13: ( GREATERTHAN )=> GREATERTHAN
            	    {
            	    match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_balance_lparen_rparen1205); if (state.failed) return s;

            	    if ( state.backtracking==0 ) {s += "> ";}

            	    }
            	    break;
            	case 3 :
            	    // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:227:13: other= (~ RPAREN )
            	    {
            	    other=(Token)input.LT(1);

            	    if ( (input.LA(1) >= ELLIPSIS && input.LA(1) <= LPAREN)||(input.LA(1) >= LSQUARE && input.LA(1) <= LAST_LEXER_FAKE_RULE) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return s;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    if ( state.backtracking==0 ) {s += (other!=null?other.getText():null);}

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_balance_lparen_rparen1261); if (state.failed) return s;

            if ( state.backtracking==0 ) {s += ")";}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "balance_lparen_rparen"

    // $ANTLR start synpred1_Evaluator
    public final void synpred1_Evaluator_fragment() throws RecognitionException {
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:131:9: ( function_call )
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:131:10: function_call
        {
        pushFollow(FOLLOW_function_call_in_synpred1_Evaluator325);
        function_call();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Evaluator

    // $ANTLR start synpred2_Evaluator
    public final void synpred2_Evaluator_fragment() throws RecognitionException {
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:179:13: ( IDENT ( balance_less_greater )? SCOPE )
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:179:14: IDENT ( balance_less_greater )? SCOPE
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred2_Evaluator782); if (state.failed) return ;

        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:179:20: ( balance_less_greater )?
        int alt15=2;
        int LA15_0 = input.LA(1);

        if ( (LA15_0==LESSTHAN) ) {
            alt15=1;
        }
        switch (alt15) {
            case 1 :
                // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:179:21: balance_less_greater
                {
                pushFollow(FOLLOW_balance_less_greater_in_synpred2_Evaluator785);
                balance_less_greater();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SCOPE,FOLLOW_SCOPE_in_synpred2_Evaluator789); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Evaluator

    // $ANTLR start synpred3_Evaluator
    public final void synpred3_Evaluator_fragment() throws RecognitionException {
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:200:10: ( IDENT ( balance_less_greater )? SCOPE )
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:200:11: IDENT ( balance_less_greater )? SCOPE
        {
        match(input,IDENT,FOLLOW_IDENT_in_synpred3_Evaluator935); if (state.failed) return ;

        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:200:17: ( balance_less_greater )?
        int alt16=2;
        int LA16_0 = input.LA(1);

        if ( (LA16_0==LESSTHAN) ) {
            alt16=1;
        }
        switch (alt16) {
            case 1 :
                // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:200:18: balance_less_greater
                {
                pushFollow(FOLLOW_balance_less_greater_in_synpred3_Evaluator938);
                balance_less_greater();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        match(input,SCOPE,FOLLOW_SCOPE_in_synpred3_Evaluator942); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Evaluator

    // $ANTLR start synpred4_Evaluator
    public final void synpred4_Evaluator_fragment() throws RecognitionException {
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:210:13: ( LESSTHAN )
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:210:14: LESSTHAN
        {
        match(input,LESSTHAN,FOLLOW_LESSTHAN_in_synpred4_Evaluator1018); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Evaluator

    // $ANTLR start synpred5_Evaluator
    public final void synpred5_Evaluator_fragment() throws RecognitionException {
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:221:13: ( LPAREN )
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:221:14: LPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred5_Evaluator1140); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Evaluator

    // $ANTLR start synpred6_Evaluator
    public final void synpred6_Evaluator_fragment() throws RecognitionException {
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:225:13: ( GREATERTHAN )
        // /Users/geertjan/Documents/GitHub/netbeans/cnd/cnd.modelimpl/src/org/netbeans/modules/cnd/modelimpl/impl/services/evaluator/parser/Evaluator.g:225:14: GREATERTHAN
        {
        match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_synpred6_Evaluator1201); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Evaluator

    // Delegated rules

    public final boolean synpred3_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Evaluator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Evaluator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_expr_in_prog40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpr_in_expr60 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_PLUS_in_expr76 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0x4000001800000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpr_in_expr80 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_MINUS_in_expr96 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0x4000001800000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_equalityExpr_in_expr100 = new BitSet(new long[]{0x0000000024000002L});
    public static final BitSet FOLLOW_multExpr_in_equalityExpr146 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_EQUAL_in_equalityExpr160 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0x4000001800000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_multExpr_in_equalityExpr166 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_equalityExpr180 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0x4000001800000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_multExpr_in_equalityExpr186 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr224 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_STAR_in_multExpr229 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0x4000001800000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpr_in_multExpr233 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_atom_in_unaryExpr262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpr274 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0x4000001800000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpr_in_unaryExpr278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMALINT_in_atom312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_atom330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_atom342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_atom354 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0x4000001800000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom356 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_atom358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_sizeof_in_atom370 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_balance_lparen_rparen_in_atom372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_static_cast_in_atom384 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LESSTHAN_in_atom386 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_GREATERTHAN_in_atom394 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAREN_in_atom396 = new BitSet(new long[]{0x0010020000001000L,0x0000000008000008L,0x4000001800000100L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_atom398 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_atom400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_true_in_atom412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_false_in_atom432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_id_in_function_call475 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_balance_lparen_rparen_in_function_call490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_const_in_variable530 = new BitSet(new long[]{0x0010000000000000L,0x0000000008000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_qualified_id_in_variable546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scope_override_in_qualified_id590 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_IDENT_in_qualified_id624 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_balance_less_greater_in_qualified_id674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_scope_override744 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_scope_override_part_in_scope_override797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_scope_override_part851 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_balance_less_greater_in_scope_override_part889 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_scope_override_part912 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_scope_override_part_in_scope_override_part950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_balance_less_greater991 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_balance_less_greater_in_balance_less_greater1026 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_set_in_balance_less_greater1056 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_GREATERTHAN_in_balance_less_greater1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_balance_lparen_rparen1113 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_balance_lparen_rparen_in_balance_lparen_rparen1148 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_GREATERTHAN_in_balance_lparen_rparen1205 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_set_in_balance_lparen_rparen1235 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x00000000000000FFL});
    public static final BitSet FOLLOW_RPAREN_in_balance_lparen_rparen1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_call_in_synpred1_Evaluator325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred2_Evaluator782 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_balance_less_greater_in_synpred2_Evaluator785 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_synpred2_Evaluator789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_synpred3_Evaluator935 = new BitSet(new long[]{0x0010000000200000L});
    public static final BitSet FOLLOW_balance_less_greater_in_synpred3_Evaluator938 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_SCOPE_in_synpred3_Evaluator942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_synpred4_Evaluator1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred5_Evaluator1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_synpred6_Evaluator1201 = new BitSet(new long[]{0x0000000000000002L});

}