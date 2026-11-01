package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SameBase64Tool.java */
/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Character, Character> f35316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Character, Character> f35317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static byte[] f35318c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f35319d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    static {
        HashMap map = new HashMap();
        f35316a = map;
        map.put('v', 'A');
        f35316a.put('S', 'B');
        f35316a.put('o', 'C');
        f35316a.put('a', 'D');
        f35316a.put('j', 'E');
        f35316a.put('c', 'F');
        f35316a.put('7', 'G');
        f35316a.put('d', 'H');
        f35316a.put('R', 'I');
        f35316a.put('z', 'J');
        f35316a.put('p', 'K');
        f35316a.put('W', 'L');
        f35316a.put('i', 'M');
        f35316a.put('f', 'N');
        f35316a.put('G', 'O');
        f35316a.put('y', 'P');
        f35316a.put('N', 'Q');
        f35316a.put('x', 'R');
        f35316a.put('Z', 'S');
        f35316a.put('n', 'T');
        f35316a.put('V', 'U');
        f35316a.put('5', 'V');
        f35316a.put('k', 'W');
        f35316a.put('+', 'X');
        f35316a.put('D', 'Y');
        f35316a.put('H', 'Z');
        f35316a.put('L', 'a');
        f35316a.put('Y', 'b');
        f35316a.put('h', 'c');
        f35316a.put('J', 'd');
        f35316a.put('4', 'e');
        f35316a.put('6', 'f');
        f35316a.put('l', 'g');
        f35316a.put('t', 'h');
        f35316a.put('0', 'i');
        f35316a.put('U', 'j');
        f35316a.put('3', 'k');
        f35316a.put('Q', 'l');
        f35316a.put('r', 'm');
        f35316a.put('g', 'n');
        f35316a.put('E', 'o');
        f35316a.put('u', 'p');
        f35316a.put('q', 'q');
        f35316a.put('8', 'r');
        f35316a.put('s', 's');
        f35316a.put('w', 't');
        f35316a.put('/', 'u');
        f35316a.put('X', 'v');
        f35316a.put('M', 'w');
        f35316a.put('e', 'x');
        f35316a.put('B', 'y');
        f35316a.put('A', 'z');
        f35316a.put('T', '0');
        f35316a.put('2', '1');
        f35316a.put('F', '2');
        f35316a.put('b', '3');
        f35316a.put('9', '4');
        f35316a.put('P', '5');
        f35316a.put('1', '6');
        f35316a.put('O', '7');
        f35316a.put('I', '8');
        f35316a.put('K', '9');
        f35316a.put('m', '+');
        f35316a.put('C', '/');
        HashMap map2 = new HashMap();
        f35317b = map2;
        map2.put('A', 'v');
        f35317b.put('B', 'S');
        f35317b.put('C', 'o');
        f35317b.put('D', 'a');
        f35317b.put('E', 'j');
        f35317b.put('F', 'c');
        f35317b.put('G', '7');
        f35317b.put('H', 'd');
        f35317b.put('I', 'R');
        f35317b.put('J', 'z');
        f35317b.put('K', 'p');
        f35317b.put('L', 'W');
        f35317b.put('M', 'i');
        f35317b.put('N', 'f');
        f35317b.put('O', 'G');
        f35317b.put('P', 'y');
        f35317b.put('Q', 'N');
        f35317b.put('R', 'x');
        f35317b.put('S', 'Z');
        f35317b.put('T', 'n');
        f35317b.put('U', 'V');
        f35317b.put('V', '5');
        f35317b.put('W', 'k');
        f35317b.put('X', '+');
        f35317b.put('Y', 'D');
        f35317b.put('Z', 'H');
        f35317b.put('a', 'L');
        f35317b.put('b', 'Y');
        f35317b.put('c', 'h');
        f35317b.put('d', 'J');
        f35317b.put('e', '4');
        f35317b.put('f', '6');
        f35317b.put('g', 'l');
        f35317b.put('h', 't');
        f35317b.put('i', '0');
        f35317b.put('j', 'U');
        f35317b.put('k', '3');
        f35317b.put('l', 'Q');
        f35317b.put('m', 'r');
        f35317b.put('n', 'g');
        f35317b.put('o', 'E');
        f35317b.put('p', 'u');
        f35317b.put('q', 'q');
        f35317b.put('r', '8');
        f35317b.put('s', 's');
        f35317b.put('t', 'w');
        f35317b.put('u', '/');
        f35317b.put('v', 'X');
        f35317b.put('w', 'M');
        f35317b.put('x', 'e');
        f35317b.put('y', 'B');
        f35317b.put('z', 'A');
        f35317b.put('0', 'T');
        f35317b.put('1', '2');
        f35317b.put('2', 'F');
        f35317b.put('3', 'b');
        f35317b.put('4', '9');
        f35317b.put('5', 'P');
        f35317b.put('6', '1');
        f35317b.put('7', 'O');
        f35317b.put('8', 'I');
        f35317b.put('9', 'K');
        f35317b.put('+', 'm');
        f35317b.put('/', 'C');
    }

    public static String a(String str) {
        return r0.b(str);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return r0.c(str);
    }
}
