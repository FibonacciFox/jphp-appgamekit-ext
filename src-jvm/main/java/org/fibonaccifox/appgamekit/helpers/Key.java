package org.fibonaccifox.appgamekit.helpers;

import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

import static php.runtime.annotation.Reflection.Final;
import static php.runtime.annotation.Reflection.Name;


@Final
@Name("fibonaccifox\\helpers\\Key")
public class Key extends BaseObject {
    public Key(Environment env) {
        super(env);
    }

    public Key(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    //список всех кодов клавиш стандартной клавиатуры на Windows и MacOS:

    /*##############################*/
    final public static int F1 = 112;
    final public static int F2 = 113;
    final public static int F3 = 114;
    final public static int F4 = 115;
    final public static int F5 = 116;
    final public static int F6 = 117;
    final public static int F7 = 118;
    final public static int F8 = 119;
    final public static int F9 = 120;
    final public static int F10 = 121;
    final public static int F11 = 122;
    final public static int F12 = 123;
    /*##############################*/

    final public static int KEY0 = 48;
    final public static int KEY1 = 49;
    final public static int KEY2 = 50;
    final public static int KEY3 = 51;
    final public static int KEY4 = 52;
    final public static int KEY5 = 53;
    final public static int KEY6 = 54;
    final public static int KEY7 = 55;
    final public static int KEY8 = 56;
    final public static int KEY9 = 57;
    /*##############################*/

    /*##############################*/
    final public static int ESC = 27;
    final public static int BACKSPACE = 8;
    final public static int TAB = 9;
    final public static int CAPSLOCK = 20;
    final public static int SHIFT = 16;
    final public static int SHIFT_LEFT = 160;
    final public static int SHIFT_RIGHT = 161;
    final public static int CTRL = 17;
    final public static int CTRL_LEFT = 162;
    final public static int CTRL_RIGHT = 163;
    final public static int WIN_LEFT = 91;
    final public static int WIN_RIGHT = 93;
    final public static int ALT = 18;
    final public static int ALT_LEFT = 164;
    final public static int ALT_RIGHT = 162;
    final public static int SPACE = 32;
    final public static int ENTER = 13;
    final public static int MENU = 93;
    final public static int PRINT_SCREEN = 44;
    final public static int SCROLL_LOCK = 145;
    final public static int PAUSE_BREACK = 19;
    final public static int INSERT = 45;
    final public static int HOME = 36;
    final public static int PAGE_UP = 33;
    final public static int PAGE_DOWN = 34;
    final public static int DELETE = 46;
    final public static int END = 35;
    /*##############################*/

    /*##############################*/
    final public static int LEFT = 37;
    final public static int RIGHT = 39;
    final public static int UP = 38;
    final public static int DOWN = 40;
    /*##############################*/

    /*##############################*/
    final public static int A = 65;
    final public static int B = 66;
    final public static int C = 67;
    final public static int D = 68;
    final public static int E = 69;
    final public static int F = 70;
    final public static int G = 71;
    final public static int H = 72;
    final public static int I = 73;
    final public static int J = 74;
    final public static int K = 75;
    final public static int L = 76;
    final public static int M = 77;
    final public static int N = 78;
    final public static int O = 79;
    final public static int P = 80;
    final public static int Q = 81;
    final public static int R = 82;
    final public static int S = 83;
    final public static int T = 84;
    final public static int U = 85;
    final public static int V = 86;
    final public static int W = 87;
    final public static int X = 88;
    final public static int Y = 89;
    final public static int Z = 90;
    /*##############################*/

    //Цифровая клавиатура с включенным Num Lock

    /*##############################*/
    final public static int NUM_LOCK = 144;
    final public static int NUM_PAD0 = 96;
    final public static int NUM_PAD1 = 97;
    final public static int NUM_PAD2 = 98;
    final public static int NUM_PAD3 = 99;
    final public static int NUM_PAD4 = 100;
    final public static int NUM_PAD5 = 101;
    final public static int NUM_PAD6 = 102;
    final public static int NUM_PAD7 = 103;
    final public static int NUM_PAD8 = 104;
    final public static int NUM_PAD9 = 105;
    final public static int NUM_PAD_STAR = 106;

    /**
     * Возвращает номер клавишы на NumPad "+"
     */
    final public static int NUM_PAD_PLUS = 107;

    /**
     * Возвращает номер клавишы на NumPad "-"
     */
    final public static int NUM_PAD_MINUS = 109;

    /**
     * Возвращает номер клавишы на NumPad "."
     */
    final public static int NUM_PAD_POINT = 110;

    /**
     * Возвращает номер клавишы на NumPad "/"
     */
    final public static int NUM_PAD_SEPARATOR = 111;
    /*##############################*/

    /*##############################*/
    /**
     * @return int Возвращает номер клавишы ";"
     */
    final public static int SEMICOLON = 186;

    /**
     * @return int Возвращает номер клавишы ":"
     */
    final public static int COLON = 186;

    /**
     * @return int Возвращает номер клавишы " = "
     */
    final public static int EQUALLY = 187;

    /**
     * @return int Возвращает номер клавишы "+"
     */
    final public static int PLUS = 187;

    /**
     * @return int Возвращает номер клавишы ","
     */
    final public static int COMMA = 188;

    /**
     * @return int Возвращает номер клавишы "<"
     */
    final public static int ANGLE_BRACKET_OPEN = 188;

    /**
     * @return int Возвращает номер клавишы "-"
     */
    final public static int MINUS = 189;

    /**
     * @return int Возвращает номер клавишы "_"
     */
    final public static int UNDERLINE = 189;

    /**
     * @return int Возвращает номер клавишы ">"
     */
    final public static int ANGLE_BRACKET_CLOSE = 190;

    /**
     * @return int Возвращает номер клавишы "."
     */
    final public static int POINT = 190;

    /**
     * @return int Возвращает номер клавишы "/"
     */
    final public static int SLASH = 191;

    /**
     * @return int Возвращает номер клавишы "?"
     */
    final public static int QUESTION = 191;

    /**
     * @return int Возвращает номер клавишы "`"
     */
    final public static int TILDE = 192;

    /**
     * @return int Возвращает номер клавишы "[ {"
     */
    final public static int SQUARE_BRACKET_OPEN = 219;

    /**
     * @return int Возвращает номер клавишы "] "
     */
    final public static int SQUARE_BRACKET_CLOSE = 221;

    /**
     * @return int Возвращает номер клавишы "\ |"
     */
    final public static int BACK_SLASH = 229;
    /*##############################*/


}