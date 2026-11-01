package okio;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i10) {
        if (i10 >= 0 && i10 < 32) {
            return true;
        }
        return 127 <= i10 && i10 < 160;
    }

    public static final boolean isUtf8Continuation(byte b10) {
        return (b10 & 192) == 128;
    }

    public static final long size(String str) {
        p.j(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static final long size(String str, int i10) {
        p.j(str, "<this>");
        return size$default(str, i10, 0, 2, null);
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i10, int i11, l<? super Integer, r> lVar) {
        p.j(bArr, "<this>");
        p.j(lVar, "yield");
        int i12 = i10 + 1;
        if (i11 <= i12) {
            lVar.invoke(65533);
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i12];
        if (!((b11 & 192) == 128)) {
            lVar.invoke(65533);
            return 1;
        }
        int i13 = (b11 ^ 3968) ^ (b10 << 6);
        if (i13 < 128) {
            lVar.invoke(65533);
            return 2;
        }
        lVar.invoke(Integer.valueOf(i13));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i10, int i11, l<? super Integer, r> lVar) {
        p.j(bArr, "<this>");
        p.j(lVar, "yield");
        int i12 = i10 + 2;
        boolean z10 = false;
        if (i11 <= i12) {
            lVar.invoke(65533);
            int i13 = i10 + 1;
            if (i11 > i13) {
                if ((bArr[i13] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (!((b11 & 192) == 128)) {
            lVar.invoke(65533);
            return 1;
        }
        byte b12 = bArr[i12];
        if (!((b12 & 192) == 128)) {
            lVar.invoke(65533);
            return 2;
        }
        int i14 = ((b12 ^ (-123008)) ^ (b11 << 6)) ^ (b10 << 12);
        if (i14 < 2048) {
            lVar.invoke(65533);
            return 3;
        }
        if (55296 <= i14 && i14 < 57344) {
            z10 = true;
        }
        if (z10) {
            lVar.invoke(65533);
            return 3;
        }
        lVar.invoke(Integer.valueOf(i14));
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i10, int i11, l<? super Integer, r> lVar) {
        p.j(bArr, "<this>");
        p.j(lVar, "yield");
        int i12 = i10 + 3;
        boolean z10 = false;
        if (i11 <= i12) {
            lVar.invoke(65533);
            int i13 = i10 + 1;
            if (i11 > i13) {
                if ((bArr[i13] & 192) == 128) {
                    int i14 = i10 + 2;
                    if (i11 > i14) {
                        if ((bArr[i14] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b10 = bArr[i10];
        byte b11 = bArr[i10 + 1];
        if (!((b11 & 192) == 128)) {
            lVar.invoke(65533);
            return 1;
        }
        byte b12 = bArr[i10 + 2];
        if (!((b12 & 192) == 128)) {
            lVar.invoke(65533);
            return 2;
        }
        byte b13 = bArr[i12];
        if (!((b13 & 192) == 128)) {
            lVar.invoke(65533);
            return 3;
        }
        int i15 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
        if (i15 > 1114111) {
            lVar.invoke(65533);
            return 4;
        }
        if (55296 <= i15 && i15 < 57344) {
            z10 = true;
        }
        if (z10) {
            lVar.invoke(65533);
            return 4;
        }
        if (i15 < 65536) {
            lVar.invoke(65533);
            return 4;
        }
        lVar.invoke(Integer.valueOf(i15));
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    public static final void processUtf16Chars(byte[] bArr, int i10, int i11, l<? super Character, r> lVar) {
        int i12;
        char c10;
        p.j(bArr, "<this>");
        p.j(lVar, "yield");
        int i13 = i10;
        while (i13 < i11) {
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                lVar.invoke(Character.valueOf((char) b10));
                i13++;
                while (i13 < i11) {
                    byte b11 = bArr[i13];
                    if (b11 < 0) {
                        break;
                    }
                    i13++;
                    lVar.invoke(Character.valueOf((char) b11));
                }
            } else {
                boolean z10 = false;
                if ((b10 >> 5) == -2) {
                    int i14 = i13 + 1;
                    if (i11 > i14) {
                        byte b12 = bArr[i14];
                        if ((b12 & 192) == 128) {
                            int i15 = (b10 << 6) ^ (b12 ^ 3968);
                            lVar.invoke(Character.valueOf(i15 < 128 ? (char) 65533 : (char) i15));
                            r rVar = r.f64562a;
                            i12 = 2;
                            i13 += i12;
                        }
                    }
                    lVar.invoke(Character.valueOf((char) 65533));
                    r rVar2 = r.f64562a;
                    i12 = 1;
                    i13 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i16 = i13 + 2;
                    if (i11 <= i16) {
                        lVar.invoke(Character.valueOf((char) 65533));
                        r rVar3 = r.f64562a;
                        int i17 = i13 + 1;
                        if (i11 > i17) {
                            if ((bArr[i17] & 192) == 128) {
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b13 = bArr[i13 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i16];
                            if ((b14 & 192) == 128) {
                                int i18 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i18 >= 2048) {
                                    if (55296 <= i18 && i18 < 57344) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        c10 = (char) 65533;
                                    } else {
                                        c10 = (char) i18;
                                    }
                                } else {
                                    c10 = (char) 65533;
                                }
                                lVar.invoke(Character.valueOf(c10));
                                r rVar4 = r.f64562a;
                                i12 = 3;
                            } else {
                                lVar.invoke(Character.valueOf((char) 65533));
                                r rVar5 = r.f64562a;
                                i12 = 2;
                            }
                        } else {
                            lVar.invoke(Character.valueOf((char) 65533));
                            r rVar6 = r.f64562a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i19 = i13 + 3;
                    if (i11 <= i19) {
                        lVar.invoke((char) 65533);
                        r rVar7 = r.f64562a;
                        int i20 = i13 + 1;
                        if (i11 > i20) {
                            if ((bArr[i20] & 192) == 128) {
                                int i21 = i13 + 2;
                                if (i11 > i21) {
                                    if ((bArr[i21] & 192) == 128) {
                                        i12 = 3;
                                    }
                                }
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b15 = bArr[i13 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i13 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = bArr[i19];
                                if ((b17 & 192) == 128) {
                                    int i22 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i22 <= 1114111) {
                                        if (55296 <= i22 && i22 < 57344) {
                                            z10 = true;
                                        }
                                        if (z10 || i22 < 65536 || i22 == 65533) {
                                            lVar.invoke((char) 65533);
                                        } else {
                                            lVar.invoke(Character.valueOf((char) ((i22 >>> 10) + 55232)));
                                            lVar.invoke(Character.valueOf((char) ((i22 & 1023) + 56320)));
                                        }
                                    } else {
                                        lVar.invoke((char) 65533);
                                    }
                                    r rVar8 = r.f64562a;
                                    i12 = 4;
                                } else {
                                    lVar.invoke((char) 65533);
                                    r rVar9 = r.f64562a;
                                    i12 = 3;
                                }
                            } else {
                                lVar.invoke((char) 65533);
                                r rVar10 = r.f64562a;
                                i12 = 2;
                            }
                        } else {
                            lVar.invoke((char) 65533);
                            r rVar11 = r.f64562a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else {
                    lVar.invoke((char) 65533);
                    i13++;
                }
            }
        }
    }

    public static final void processUtf8Bytes(String str, int i10, int i11, l<? super Byte, r> lVar) {
        int i12;
        p.j(str, "<this>");
        p.j(lVar, "yield");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (p.l(cCharAt, 128) < 0) {
                lVar.invoke(Byte.valueOf((byte) cCharAt));
                i10++;
                while (i10 < i11 && p.l(str.charAt(i10), 128) < 0) {
                    lVar.invoke(Byte.valueOf((byte) str.charAt(i10)));
                    i10++;
                }
            } else {
                if (p.l(cCharAt, 2048) < 0) {
                    lVar.invoke(Byte.valueOf((byte) ((cCharAt >> 6) | 192)));
                    lVar.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                } else {
                    boolean z10 = false;
                    if (55296 <= cCharAt && cCharAt < 57344) {
                        if (p.l(cCharAt, 56319) <= 0 && i11 > (i12 = i10 + 1)) {
                            char cCharAt2 = str.charAt(i12);
                            if (56320 <= cCharAt2 && cCharAt2 < 57344) {
                                z10 = true;
                            }
                            if (z10) {
                                int iCharAt = ((cCharAt << '\n') + str.charAt(i12)) - 56613888;
                                lVar.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                                lVar.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                                lVar.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                                lVar.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                                i10 += 2;
                            }
                        }
                        lVar.invoke((byte) 63);
                    } else {
                        lVar.invoke(Byte.valueOf((byte) ((cCharAt >> '\f') | 224)));
                        lVar.invoke(Byte.valueOf((byte) (((cCharAt >> 6) & 63) | 128)));
                        lVar.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                    }
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x016f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    public static final void processUtf8CodePoints(byte[] bArr, int i10, int i11, l<? super Integer, r> lVar) {
        int i12;
        int iValueOf;
        int iValueOf2;
        p.j(bArr, "<this>");
        p.j(lVar, "yield");
        int i13 = i10;
        while (i13 < i11) {
            byte b10 = bArr[i13];
            if (b10 >= 0) {
                lVar.invoke(Integer.valueOf(b10));
                i13++;
                while (i13 < i11) {
                    byte b11 = bArr[i13];
                    if (b11 < 0) {
                        break;
                    }
                    i13++;
                    lVar.invoke(Integer.valueOf(b11));
                }
            } else {
                boolean z10 = false;
                if ((b10 >> 5) == -2) {
                    int i14 = i13 + 1;
                    if (i11 > i14) {
                        byte b12 = bArr[i14];
                        if ((b12 & 192) == 128) {
                            int i15 = (b10 << 6) ^ (b12 ^ 3968);
                            lVar.invoke(i15 < 128 ? 65533 : Integer.valueOf(i15));
                            r rVar = r.f64562a;
                            i12 = 2;
                            i13 += i12;
                        }
                    }
                    lVar.invoke(65533);
                    r rVar2 = r.f64562a;
                    i12 = 1;
                    i13 += i12;
                } else if ((b10 >> 4) == -2) {
                    int i16 = i13 + 2;
                    if (i11 <= i16) {
                        lVar.invoke(65533);
                        r rVar3 = r.f64562a;
                        int i17 = i13 + 1;
                        if (i11 > i17) {
                            if ((bArr[i17] & 192) == 128) {
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b13 = bArr[i13 + 1];
                        if ((b13 & 192) == 128) {
                            byte b14 = bArr[i16];
                            if ((b14 & 192) == 128) {
                                int i18 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i18 >= 2048) {
                                    if (55296 <= i18 && i18 < 57344) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        iValueOf = 65533;
                                    } else {
                                        iValueOf = Integer.valueOf(i18);
                                    }
                                } else {
                                    iValueOf = 65533;
                                }
                                lVar.invoke(iValueOf);
                                r rVar4 = r.f64562a;
                                i12 = 3;
                            } else {
                                lVar.invoke(65533);
                                r rVar5 = r.f64562a;
                                i12 = 2;
                            }
                        } else {
                            lVar.invoke(65533);
                            r rVar6 = r.f64562a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else if ((b10 >> 3) == -2) {
                    int i19 = i13 + 3;
                    if (i11 <= i19) {
                        lVar.invoke(65533);
                        r rVar7 = r.f64562a;
                        int i20 = i13 + 1;
                        if (i11 > i20) {
                            if ((bArr[i20] & 192) == 128) {
                                int i21 = i13 + 2;
                                if (i11 > i21) {
                                    if ((bArr[i21] & 192) == 128) {
                                        i12 = 3;
                                    }
                                }
                                i12 = 2;
                            }
                        }
                        i12 = 1;
                    } else {
                        byte b15 = bArr[i13 + 1];
                        if ((b15 & 192) == 128) {
                            byte b16 = bArr[i13 + 2];
                            if ((b16 & 192) == 128) {
                                byte b17 = bArr[i19];
                                if ((b17 & 192) == 128) {
                                    int i22 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                    if (i22 <= 1114111) {
                                        if (55296 <= i22 && i22 < 57344) {
                                            z10 = true;
                                        }
                                        if (!z10 && i22 >= 65536) {
                                            iValueOf2 = Integer.valueOf(i22);
                                        } else {
                                            iValueOf2 = 65533;
                                        }
                                    } else {
                                        iValueOf2 = 65533;
                                    }
                                    lVar.invoke(iValueOf2);
                                    r rVar8 = r.f64562a;
                                    i12 = 4;
                                } else {
                                    lVar.invoke(65533);
                                    r rVar9 = r.f64562a;
                                    i12 = 3;
                                }
                            } else {
                                lVar.invoke(65533);
                                r rVar10 = r.f64562a;
                                i12 = 2;
                            }
                        } else {
                            lVar.invoke(65533);
                            r rVar11 = r.f64562a;
                            i12 = 1;
                        }
                    }
                    i13 += i12;
                } else {
                    lVar.invoke(65533);
                    i13++;
                }
            }
        }
    }

    public static final long size(String str, int i10, int i11) {
        int i12;
        p.j(str, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (!(i11 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        long j10 = 0;
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i12 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i12 = 3;
                } else {
                    int i13 = i10 + 1;
                    char cCharAt2 = i13 < i11 ? str.charAt(i13) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i10 = i13;
                    } else {
                        j10 += (long) 4;
                        i10 += 2;
                    }
                }
                j10 += (long) i12;
            }
            i10++;
        }
        return j10;
    }

    public static /* synthetic */ long size$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return size(str, i10, i11);
    }
}
