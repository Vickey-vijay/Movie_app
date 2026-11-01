package com.google.zxing.datamatrix.decoder;

import c6.c;
import c6.d;
import com.google.zxing.FormatException;
import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f20865a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f20866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f20867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f20868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f20869e;

    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    public static void b(c cVar, StringBuilder sb2) throws FormatException {
        int iD;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            h(iD, cVar.d(8), iArr);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (i11 == 0) {
                    sb2.append('\r');
                } else if (i11 == 1) {
                    sb2.append('*');
                } else if (i11 == 2) {
                    sb2.append('>');
                } else if (i11 == 3) {
                    sb2.append(' ');
                } else if (i11 < 14) {
                    sb2.append((char) (i11 + 44));
                } else {
                    if (i11 >= 40) {
                        throw FormatException.getFormatInstance();
                    }
                    sb2.append((char) (i11 + 51));
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static Mode c(c cVar, StringBuilder sb2, StringBuilder sb3) throws FormatException {
        boolean z10 = false;
        do {
            int iD = cVar.d(8);
            if (iD == 0) {
                throw FormatException.getFormatInstance();
            }
            if (iD > 128) {
                if (iD != 129) {
                    if (iD > 229) {
                        switch (iD) {
                            case 230:
                                return Mode.C40_ENCODE;
                            case 231:
                                return Mode.BASE256_ENCODE;
                            case 232:
                                sb2.append((char) 29);
                                break;
                            case 233:
                            case 234:
                            case 241:
                                break;
                            case 235:
                                z10 = true;
                                break;
                            case 236:
                                sb2.append("[)>\u001e05\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 237:
                                sb2.append("[)>\u001e06\u001d");
                                sb3.insert(0, "\u001e\u0004");
                                break;
                            case 238:
                                return Mode.ANSIX12_ENCODE;
                            case 239:
                                return Mode.TEXT_ENCODE;
                            case 240:
                                return Mode.EDIFACT_ENCODE;
                            default:
                                if (iD != 254 || cVar.a() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    } else {
                        int i10 = iD - 130;
                        if (i10 < 10) {
                            sb2.append('0');
                        }
                        sb2.append(i10);
                    }
                } else {
                    return Mode.PAD_ENCODE;
                }
            } else {
                if (z10) {
                    iD += 128;
                }
                sb2.append((char) (iD - 1));
                return Mode.ASCII_ENCODE;
            }
        } while (cVar.a() > 0);
        return Mode.ASCII_ENCODE;
    }

    public static void e(c cVar, StringBuilder sb2) throws FormatException {
        int iD;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            h(iD, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f20866b;
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (z10) {
                                    sb2.append((char) (c10 + 128));
                                    z10 = false;
                                } else {
                                    sb2.append(c10);
                                }
                            } else if (i12 == 27) {
                                sb2.append((char) 29);
                            } else {
                                if (i12 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z10 = true;
                            }
                        } else {
                            if (i10 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            if (z10) {
                                sb2.append((char) (i12 + 224));
                                z10 = false;
                            } else {
                                sb2.append((char) (i12 + 96));
                            }
                        }
                    } else if (z10) {
                        sb2.append((char) (i12 + 128));
                        z10 = false;
                    } else {
                        sb2.append((char) i12);
                    }
                    i10 = 0;
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr2 = f20865a;
                    if (i12 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c11 = cArr2[i12];
                    if (z10) {
                        sb2.append((char) (c11 + 128));
                        z10 = false;
                    } else {
                        sb2.append(c11);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static void g(c cVar, StringBuilder sb2) throws FormatException {
        int iD;
        int[] iArr = new int[3];
        boolean z10 = false;
        int i10 = 0;
        while (cVar.a() != 8 && (iD = cVar.d(8)) != 254) {
            h(iD, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            char[] cArr = f20868d;
                            if (i12 < cArr.length) {
                                char c10 = cArr[i12];
                                if (z10) {
                                    sb2.append((char) (c10 + 128));
                                    z10 = false;
                                } else {
                                    sb2.append(c10);
                                }
                            } else if (i12 == 27) {
                                sb2.append((char) 29);
                            } else {
                                if (i12 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z10 = true;
                            }
                        } else {
                            if (i10 != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            char[] cArr2 = f20869e;
                            if (i12 >= cArr2.length) {
                                throw FormatException.getFormatInstance();
                            }
                            char c11 = cArr2[i12];
                            if (z10) {
                                sb2.append((char) (c11 + 128));
                                z10 = false;
                            } else {
                                sb2.append(c11);
                            }
                        }
                    } else if (z10) {
                        sb2.append((char) (i12 + 128));
                        z10 = false;
                    } else {
                        sb2.append((char) i12);
                    }
                    i10 = 0;
                } else if (i12 < 3) {
                    i10 = i12 + 1;
                } else {
                    char[] cArr3 = f20867c;
                    if (i12 >= cArr3.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c12 = cArr3[i12];
                    if (z10) {
                        sb2.append((char) (c12 + 128));
                        z10 = false;
                    } else {
                        sb2.append(c12);
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20871a;

        static {
            int[] iArr = new int[Mode.values().length];
            f20871a = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20871a[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20871a[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20871a[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20871a[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', G5.T, '>', '?', '@', '[', '\\', ']', '^', '_'};
        f20866b = cArr;
        f20867c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f20868d = cArr;
        f20869e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
    }

    public static d a(byte[] bArr) throws FormatException {
        c cVar = new c(bArr);
        StringBuilder sb2 = new StringBuilder(100);
        StringBuilder sb3 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        Mode modeC = Mode.ASCII_ENCODE;
        do {
            Mode mode = Mode.ASCII_ENCODE;
            if (modeC == mode) {
                modeC = c(cVar, sb2, sb3);
            } else {
                int i10 = a.f20871a[modeC.ordinal()];
                if (i10 == 1) {
                    e(cVar, sb2);
                } else if (i10 == 2) {
                    g(cVar, sb2);
                } else if (i10 == 3) {
                    b(cVar, sb2);
                } else if (i10 == 4) {
                    f(cVar, sb2);
                } else {
                    if (i10 != 5) {
                        throw FormatException.getFormatInstance();
                    }
                    d(cVar, sb2, arrayList);
                }
                modeC = mode;
            }
            if (modeC == Mode.PAD_ENCODE) {
                break;
            }
        } while (cVar.a() > 0);
        if (sb3.length() > 0) {
            sb2.append((CharSequence) sb3);
        }
        String string = sb2.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new d(bArr, string, arrayList, null);
    }

    public static void h(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    public static int i(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }

    public static void d(c cVar, StringBuilder sb2, Collection<byte[]> collection) throws FormatException {
        int iC = cVar.c() + 1;
        int i10 = iC + 1;
        int i11 = i(cVar.d(8), iC);
        if (i11 == 0) {
            i11 = cVar.a() / 8;
        } else if (i11 >= 250) {
            i11 = ((i11 - 249) * 250) + i(cVar.d(8), i10);
            i10++;
        }
        if (i11 >= 0) {
            byte[] bArr = new byte[i11];
            int i12 = 0;
            while (i12 < i11) {
                if (cVar.a() >= 8) {
                    bArr[i12] = (byte) i(cVar.d(8), i10);
                    i12++;
                    i10++;
                } else {
                    throw FormatException.getFormatInstance();
                }
            }
            collection.add(bArr);
            try {
                sb2.append(new String(bArr, "ISO8859_1"));
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e10)));
            }
        }
        throw FormatException.getFormatInstance();
    }

    public static void f(c cVar, StringBuilder sb2) {
        while (cVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int iD = cVar.d(6);
                if (iD == 31) {
                    int iB = 8 - cVar.b();
                    if (iB != 8) {
                        cVar.d(iB);
                        return;
                    }
                    return;
                }
                if ((iD & 32) == 0) {
                    iD |= 64;
                }
                sb2.append((char) iD);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }
}
