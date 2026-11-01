package com.google.zxing.common;

import com.google.zxing.FormatException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public enum CharacterSetECI {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, C.ASCII_NAME),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, CharacterSetECI> f20862b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<String, CharacterSetECI> f20863c = new HashMap();
    private final String[] otherEncodingNames;
    private final int[] values;

    CharacterSetECI(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    static {
        for (CharacterSetECI characterSetECI : values()) {
            for (int i10 : characterSetECI.values) {
                f20862b.put(Integer.valueOf(i10), characterSetECI);
            }
            f20863c.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.otherEncodingNames) {
                f20863c.put(str, characterSetECI);
            }
        }
    }

    CharacterSetECI(int i10, String... strArr) {
        this.values = new int[]{i10};
        this.otherEncodingNames = strArr;
    }

    public static CharacterSetECI getCharacterSetECIByName(String str) {
        return f20863c.get(str);
    }

    public static CharacterSetECI getCharacterSetECIByValue(int i10) throws FormatException {
        if (i10 < 0 || i10 >= 900) {
            throw FormatException.getFormatInstance();
        }
        return f20862b.get(Integer.valueOf(i10));
    }

    public int getValue() {
        return this.values[0];
    }

    CharacterSetECI(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }
}
