package okhttp3.internal;

import ck.p;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Locale;
import lk.a0;
import lk.x;
import okio.Buffer;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HostnamesKt {
    private static final boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (p.l(cCharAt, 48) < 0 || p.l(cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        Buffer buffer = new Buffer();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                buffer.writeByte(58);
                i10 += i13;
                if (i10 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i10 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i10], 255) << 8) | Util.and(bArr[i10 + 1], 255));
                i10 += 2;
            }
        }
        return buffer.readUtf8();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:1: B:30:0x0069->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007b A[EDGE_INSN: B:54:0x007b->B:34:0x007b BREAK  A[LOOP:1: B:30:0x0069->B:33:0x0075], SYNTHETIC] */
    private static final InetAddress decodeIpv6(String str, int i10, int i11) {
        int i12;
        int i13;
        int hexDigit;
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        while (i14 < i11) {
            if (i17 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && x.Q(str, "::", i14, false, 4, null)) {
                if (i15 != -1) {
                    return null;
                }
                i17 += 2;
                if (i18 == i11) {
                    i15 = i17;
                    break;
                }
                i16 = i18;
                i15 = i17;
                i14 = i16;
                i12 = 0;
                while (i14 < i11) {
                    hexDigit = Util.parseHexDigit(str.charAt(i14));
                    if (hexDigit != -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + hexDigit;
                    i14++;
                }
                i13 = i14 - i16;
                if (i13 != 0) {
                }
                return null;
            }
            if (i17 != 0) {
                if (!x.Q(str, StringUtils.PROCESS_POSTFIX_DELIMITER, i14, false, 4, null)) {
                    if (!x.Q(str, ".", i14, false, 4, null) || !decodeIpv4Suffix(str, i16, i11, bArr, i17 - 2)) {
                        return null;
                    }
                    i17 += 2;
                    break;
                }
                i14++;
            }
            i16 = i14;
            i14 = i16;
            i12 = 0;
            while (i14 < i11) {
                hexDigit = Util.parseHexDigit(str.charAt(i14));
                if (hexDigit != -1) {
                    break;
                }
                i12 = (i12 << 4) + hexDigit;
                i14++;
            }
            i13 = i14 - i16;
            if (i13 != 0 || i13 > 4) {
                return null;
            }
            int i19 = i17 + 1;
            bArr[i17] = (byte) ((i12 >>> 8) & 255);
            i17 = i19 + 1;
            bArr[i19] = (byte) (i12 & 255);
        }
        if (i17 != 16) {
            if (i15 == -1) {
                return null;
            }
            int i20 = i17 - i15;
            System.arraycopy(bArr, i15, bArr, 16 - i20, i20);
            Arrays.fill(bArr, i15, (16 - i17) + i15, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final String toCanonicalHost(String str) {
        p.j(str, "<this>");
        if (!a0.X(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                p.i(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                p.i(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if ((lowerCase.length() == 0) || containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (x.R(str, C3426d4.j.f28586d, false, 2, null) && x.D(str, C3426d4.j.f28588e, false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            p.i(address, "address");
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }

    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (p.l(cCharAt, 31) <= 0 || p.l(cCharAt, 127) >= 0 || a0.k0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }
}
