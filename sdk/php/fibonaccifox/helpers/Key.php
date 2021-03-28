<?php

namespace fibonaccifox\helpers;
/**
 * Класс Key - коды клавиш клавиатуры.
 *
 * @author FibonacciFox
 * @version 1.0.0
 */
class Key
{

    //список всех кодов клавиш стандартной клавиатуры на Windows и MacOS:

    /*##############################*/
    const F1 = 112;
    const F2 = 113;
    const F3 = 114;
    const F4 = 115;
    const F5 = 116;
    const F6 = 117;
    const F7 = 118;
    const F8 = 119;
    const F9 = 120;
    const F10 = 121;
    const F11 = 122;
    const F12 = 123;
    /*##############################*/

    const KEY0 = 48;
    const KEY1 = 49;
    const KEY2 = 50;
    const KEY3 = 51;
    const KEY4 = 52;
    const KEY5 = 53;
    const KEY6 = 54;
    const KEY7 = 55;
    const KEY8 = 56;
    const KEY9 = 57;
    /*##############################*/

    /*##############################*/
    const ESC = 27;
    const BACKSPACE = 8;
    const TAB = 9;
    const CAPSLOCK = 20;
    const SHIFT = 16;
    const SHIFT_LEFT = 160;
    const SHIFT_RIGHT = 161;
    const CTRL = 17;
    const CTRL_LEFT = 162;
    const CTRL_RIGHT = 163;
    const WIN_LEFT = 91;
    const WIN_RIGHT = 93;
    const ALT = 18;
    const ALT_LEFT = 164;
    const ALT_RIGHT = 162;
    const SPACE = 32;
    const ENTER = 13;
    const MENU = 93;
    const PRINT_SCREEN = 44;
    const SCROLL_LOCK = 145;
    const PAUSE_BREACK = 19;
    const INSERT = 45;
    const HOME = 36;
    const PAGE_UP = 33;
    const PAGE_DOWN = 34;
    const DELETE = 46;
    const END = 35;
    /*##############################*/

    /*##############################*/
    const LEFT = 37;
    const RIGHT = 39;
    const UP = 38;
    const DOWN = 40;
    /*##############################*/

    /*##############################*/
    const A = 65;
    const B = 66;
    const C = 67;
    const D = 68;
    const E = 69;
    const F = 70;
    const G = 71;
    const H = 72;
    const I = 73;
    const J = 74;
    const K = 75;
    const L = 76;
    const M = 77;
    const N = 78;
    const O = 79;
    const P = 80;
    const Q = 81;
    const R = 82;
    const S = 83;
    const T = 84;
    const U = 85;
    const V = 86;
    const W = 87;
    const X = 88;
    const Y = 89;
    const Z = 90;
    /*##############################*/

    //Цифровая клавиатура с включенным Num Lock

    /*##############################*/
    const NUM_LOCK = 144;
    const NUM_PAD0 = 96;
    const NUM_PAD1 = 97;
    const NUM_PAD2 = 98;
    const NUM_PAD3 = 99;
    const NUM_PAD4 = 100;
    const NUM_PAD5 = 101;
    const NUM_PAD6 = 102;
    const NUM_PAD7 = 103;
    const NUM_PAD8 = 104;
    const NUM_PAD9 = 105;
    const NUM_PAD_STAR = 106;

    /**
     * Возвращает номер клавишы на NumPad "+"
     */
    const NUM_PAD_PLUS = 107;

    /**
     * Возвращает номер клавишы на NumPad "-"
     */
    const NUM_PAD_MINUS = 109;

    /**
     * Возвращает номер клавишы на NumPad "."
     */
    const NUM_PAD_POINT = 110;

    /**
     * Возвращает номер клавишы на NumPad "/"
     */
    const NUM_PAD_SEPARATOR = 111;
    /*##############################*/

    /*##############################*/
    /**
     * @return int Возвращает номер клавишы ";"
     */
    const SEMICOLON = 186;

    /**
     * @return int Возвращает номер клавишы ":"
     */
    const COLON = 186;

    /**
     * @return int Возвращает номер клавишы " = "
     */
    const EQUALLY = 187;

    /**
     * @return int Возвращает номер клавишы "+"
     */
    const PLUS = 187;

    /**
     * @return int Возвращает номер клавишы ","
     */
    const COMMA = 188;

    /**
     * @return int Возвращает номер клавишы "<"
     */
    const ANGLE_BRACKET_OPEN = 188;

    /**
     * @return int Возвращает номер клавишы "-"
     */
    const MINUS = 189;

    /**
     * @return int Возвращает номер клавишы "_"
     */
    const UNDERLINE = 189;

    /**
     * @return int Возвращает номер клавишы ">"
     */
    const ANGLE_BRACKET_CLOSE = 190;

    /**
     * @return int Возвращает номер клавишы "."
     */
    const POINT = 190;

    /**
     * @return int Возвращает номер клавишы "/"
     */
    const SLASH = 191;

    /**
     * @return int Возвращает номер клавишы "?"
     */
    const QUESTION = 191;

    /**
     * @return int Возвращает номер клавишы "`"
     */
    const TILDE = 192;

    /**
     * @return int Возвращает номер клавишы "[ {"
     */
    const SQUARE_BRACKET_OPEN = 219;

    /**
     * @return int Возвращает номер клавишы "] "
     */
    const SQUARE_BRACKET_CLOSE = 221;

    /**
     * @return int Возвращает номер клавишы "\ |"
     */
    const BACK_SLASH = 229;
    /*##############################*/

}