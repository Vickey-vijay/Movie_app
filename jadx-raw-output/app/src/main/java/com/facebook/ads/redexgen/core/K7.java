package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class K7 {
    public static byte[] A04;
    public static String[] A05 = {"Tlnn5cKjLaIjRpnStB3TtMXpCr", "3ektkjDKhO", "UADsPGxQMgbdHUVZTw2T7TudB6ybNpUs", "wMkteQxfp4DsqI2DXiVAWfh1RT3", "vTGkM2prP14EX1TDx6P9XqiD0Fmww", "sal8paYv5RRrD9uY6TWNX8GISo", "qTpYd1bjPJIA7eigqjtgMToqdlzi", "UsOSpCey7qyyyJdYXs2GK2q4qSEth0kx"};
    public final int A00;
    public final String A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{2, 73, 59};
        if (A05[2].charAt(0) == 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[6] = "WMYi1W8Xbtf0WzjxHgJrZE6ARrtq";
        strArr[1] = "r4jVis15Qe";
    }

    static {
        A03();
    }

    public K7(String str, int i10, String str2, Set<String> classes) {
        this.A00 = i10;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = classes;
    }

    public static K7 A00() {
        Set setEmptySet = Collections.emptySet();
        String strA02 = A02(0, 0, 5);
        return new K7(strA02, 0, strA02, setEmptySet);
    }

    public static K7 A01(String str, int i10) {
        String strTrim;
        String strTrim2 = str.trim();
        C3M.A07(!strTrim2.isEmpty());
        int iIndexOf = strTrim2.indexOf(A02(0, 1, 24));
        if (iIndexOf == -1) {
            strTrim = A02(0, 0, 5);
        } else {
            strTrim = strTrim2.substring(iIndexOf).trim();
            strTrim2 = strTrim2.substring(0, iIndexOf);
        }
        String[] strArrA1O = AbstractC09664a.A1O(strTrim2, A02(1, 2, 47));
        String str2 = strArrA1O[0];
        HashSet hashSet = new HashSet();
        for (int i11 = 1; i11 < voiceStartIndex; i11++) {
            hashSet.add(strArrA1O[i11]);
        }
        return new K7(str2, i10, strTrim, hashSet);
    }
}
