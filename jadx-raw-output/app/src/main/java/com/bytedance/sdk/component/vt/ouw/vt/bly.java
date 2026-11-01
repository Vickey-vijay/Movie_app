package com.bytedance.sdk.component.vt.ouw.vt;

import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class bly {
    public static final Charset ouw = Charset.forName("UTF-8");

    public static int ouw(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static void ouw(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private static boolean vt(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int ouw(String str, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i11;
            }
        }
        return i10;
    }

    public static int ouw(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    public static int ouw(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5 A[LOOP:1: B:59:0x00a8->B:62:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x00bb A[EDGE_INSN: B:89:0x00bb->B:63:0x00bb BREAK  A[LOOP:1: B:59:0x00a8->B:62:0x00b5], SYNTHETIC] */
    private static InetAddress vt(String str, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iOuw;
        int i16 = 16;
        byte[] bArr = new byte[16];
        int i17 = -1;
        int i18 = 0;
        int i19 = i10;
        int i20 = -1;
        int i21 = -1;
        int i22 = 0;
        while (true) {
            if (i19 >= i11) {
                i12 = i16;
                break;
            }
            if (i22 == i16) {
                return null;
            }
            int i23 = i19 + 2;
            if (i23 <= i11 && str.regionMatches(i19, "::", i18, 2)) {
                if (i20 != i17) {
                    return null;
                }
                i22 += 2;
                if (i23 == i11) {
                    i12 = i16;
                    i20 = i22;
                    break;
                }
                i20 = i22;
                i21 = i23;
                i19 = i21;
                i14 = 0;
                while (i19 < i11) {
                    iOuw = ouw(str.charAt(i19));
                    if (iOuw != -1) {
                        break;
                        break;
                    }
                    i14 = (i14 << 4) + iOuw;
                    i19++;
                }
                i15 = i19 - i21;
                if (i15 != 0) {
                }
                return null;
            }
            if (i22 != 0) {
                if (!str.regionMatches(i19, StringUtils.PROCESS_POSTFIX_DELIMITER, i18, 1)) {
                    if (!str.regionMatches(i19, ".", i18, 1)) {
                        return null;
                    }
                    int i24 = i22 - 2;
                    int i25 = i24;
                    loop2: while (true) {
                        if (i21 >= i11) {
                            if (i25 == i24 + 4) {
                                i13 = 1;
                                break;
                            }
                            i13 = 0;
                            break loop2;
                        }
                        if (i25 != i16) {
                            if (i25 != i24) {
                                if (str.charAt(i21) == '.') {
                                    i21++;
                                }
                            }
                            int i26 = i18;
                            int i27 = i21;
                            while (true) {
                                if (i27 < i11) {
                                    char cCharAt = str.charAt(i27);
                                    if (cCharAt >= '0' && cCharAt <= '9') {
                                        if ((i26 != 0 || i21 == i27) && (i26 = ((i26 * 10) + cCharAt) - 48) <= 255) {
                                            i27++;
                                        }
                                    }
                                    i13 = 0;
                                    break loop2;
                                }
                                if (i27 - i21 == 0) {
                                    i13 = 0;
                                    break loop2;
                                }
                                bArr[i25] = (byte) i26;
                                i25++;
                                i21 = i27;
                                i16 = 16;
                                i18 = 0;
                            }
                        }
                        i13 = i18;
                        break;
                    }
                    if (i13 != 0) {
                        i22 += 2;
                        i12 = 16;
                        break;
                    }
                    return null;
                }
                i19++;
            }
            i21 = i19;
            i19 = i21;
            i14 = 0;
            while (i19 < i11) {
                iOuw = ouw(str.charAt(i19));
                if (iOuw != -1) {
                    break;
                }
                i14 = (i14 << 4) + iOuw;
                i19++;
            }
            i15 = i19 - i21;
            if (i15 != 0 || i15 > 4) {
                return null;
            }
            int i28 = i22 + 1;
            bArr[i22] = (byte) ((i14 >>> 8) & 255);
            i22 = i28 + 1;
            bArr[i28] = (byte) (i14 & 255);
            i16 = 16;
            i17 = -1;
            i18 = 0;
        }
        if (i22 != i12) {
            if (i20 == -1) {
                return null;
            }
            int i29 = i22 - i20;
            System.arraycopy(bArr, i20, bArr, 16 - i29, i29);
            Arrays.fill(bArr, i20, (16 - i22) + i20, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int ouw(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static String ouw(String str) {
        InetAddress inetAddressVt;
        if (str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
            int i10 = 0;
            int i11 = 1;
            if (str.startsWith(C3426d4.j.f28586d) && str.endsWith(C3426d4.j.f28588e)) {
                inetAddressVt = vt(str, 1, str.length() - 1);
            } else {
                inetAddressVt = vt(str, 0, str.length());
            }
            if (inetAddressVt == null) {
                return null;
            }
            byte[] address = inetAddressVt.getAddress();
            int i12 = 16;
            if (address.length == 16) {
                int i13 = -1;
                int i14 = 0;
                int i15 = 0;
                while (i14 < address.length) {
                    int i16 = i14;
                    while (i16 < 16 && address[i16] == 0 && address[i16 + 1] == 0) {
                        i16 += 2;
                    }
                    int i17 = i16 - i14;
                    if (i17 > i15 && i17 >= 4) {
                        i13 = i14;
                        i15 = i17;
                    }
                    i14 = i16 + 2;
                }
                ouw ouwVar = new ouw();
                while (i10 < address.length) {
                    if (i10 == i13) {
                        ouwVar.vt(58);
                        i10 += i15;
                        if (i10 == i12) {
                            ouwVar.vt(58);
                        }
                    } else {
                        if (i10 > 0) {
                            ouwVar.vt(58);
                        }
                        long j10 = ((address[i10] & 255) << 8) | (address[i10 + 1] & 255);
                        if (j10 == 0) {
                            ouwVar.vt(48);
                        } else {
                            int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + i11;
                            fkw fkwVarLh = ouwVar.lh(iNumberOfTrailingZeros);
                            byte[] bArr = fkwVarLh.ouw;
                            int i18 = fkwVarLh.f11964lh;
                            for (int i19 = (i18 + iNumberOfTrailingZeros) - i11; i19 >= i18; i19--) {
                                bArr[i19] = ouw.ouw[(int) (j10 & 15)];
                                j10 >>>= 4;
                            }
                            fkwVarLh.f11964lh += iNumberOfTrailingZeros;
                            ouwVar.f11966lh += (long) iNumberOfTrailingZeros;
                        }
                        i10 += 2;
                        i11 = 1;
                        i12 = 16;
                    }
                }
                return ouwVar.lh();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty() || vt(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static boolean ouw(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }
}
