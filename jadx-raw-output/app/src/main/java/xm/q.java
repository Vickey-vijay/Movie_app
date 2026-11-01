package xm;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: URIUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class q implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f75070b = System.getProperty("org.eclipse.jetty.util.URI.charset", "UTF-8");

    public static String d(String str) {
        String str2;
        String str3;
        int i10;
        char[] cArr = null;
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = null;
        int length2 = 0;
        int i11 = 0;
        int length3 = 0;
        while (true) {
            if (length2 < length) {
                char cCharAt = str.charAt(length2);
                if (cCharAt == '%' && (i10 = length2 + 2) < length) {
                    if (cArr == null) {
                        cArr = new char[length];
                        bArr = new byte[length];
                        str.getChars(0, length2, cArr, 0);
                    }
                    bArr[i11] = (byte) (p.e(str, length2 + 1, 2, 16) & 255);
                    i11++;
                    length2 = i10;
                } else if (cCharAt == ';') {
                    if (cArr == null) {
                        cArr = new char[length];
                        str.getChars(0, length2, cArr, 0);
                        break;
                    }
                } else if (bArr == null) {
                    length3++;
                } else {
                    if (i11 > 0) {
                        try {
                            str3 = new String(bArr, 0, i11, f75070b);
                        } catch (UnsupportedEncodingException unused) {
                            str3 = new String(bArr, 0, i11);
                        }
                        str3.getChars(0, str3.length(), cArr, length3);
                        length3 += str3.length();
                        i11 = 0;
                    }
                    cArr[length3] = cCharAt;
                    length3++;
                }
                length2++;
            }
            length2 = length3;
            break;
        }
        if (cArr == null) {
            return str;
        }
        if (i11 > 0) {
            try {
                str2 = new String(bArr, 0, i11, f75070b);
            } catch (UnsupportedEncodingException unused2) {
                str2 = new String(bArr, 0, i11);
            }
            str2.getChars(0, str2.length(), cArr, length2);
            length2 += str2.length();
        }
        return new String(cArr, 0, length2);
    }

    public static String e(byte[] bArr, int i10, int i11) {
        int i12;
        byte[] bArr2 = null;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            int i15 = i13 + i10;
            byte bF = bArr[i15];
            if (bF == 37 && (i12 = i13 + 2) < i11) {
                bF = (byte) (p.f(bArr, i15 + 1, 2, 16) & 255);
                i13 = i12;
            } else {
                if (bF == 59) {
                    i11 = i13;
                    break;
                }
                if (bArr2 == null) {
                    i14++;
                }
                i13++;
            }
            if (bArr2 == null) {
                bArr2 = new byte[i11];
                for (int i16 = 0; i16 < i14; i16++) {
                    bArr2[i16] = bArr[i16 + i10];
                }
            }
            bArr2[i14] = bF;
            i14++;
            i13++;
        }
        return bArr2 == null ? o.h(bArr, i10, i11, f75070b) : o.h(bArr2, 0, i14, f75070b);
    }

    public static boolean h(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == ':') {
                return true;
            }
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && (i10 <= 0 || !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '+' || cCharAt == '-')))) {
                break;
            }
        }
        return false;
    }

    public static String i(String str) {
        int iLastIndexOf;
        if (str == null || "/".equals(str) || (iLastIndexOf = str.lastIndexOf(47, str.length() - 2)) < 0) {
            return null;
        }
        return str.substring(0, iLastIndexOf + 1);
    }

    public static String a(String str, String str2) {
        if (str == null || str.length() == 0) {
            return (str == null || str2 != null) ? str2 : str;
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        int iIndexOf = str.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(63);
        }
        if (iIndexOf == 0) {
            return str2 + str;
        }
        if (iIndexOf < 0) {
            iIndexOf = str.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str2.length() + 2);
        sb2.append(str);
        int i10 = iIndexOf - 1;
        if (sb2.charAt(i10) == '/') {
            if (str2.startsWith("/")) {
                sb2.deleteCharAt(i10);
                sb2.insert(i10, str2);
            } else {
                sb2.insert(iIndexOf, str2);
            }
        } else if (str2.startsWith("/")) {
            sb2.insert(iIndexOf, str2);
        } else {
            sb2.insert(iIndexOf, '/');
            sb2.insert(iIndexOf + 1, str2);
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0131  */
    /* JADX WARN: Code duplicated, block: B:114:0x0134  */
    /* JADX WARN: Code duplicated, block: B:117:0x013a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072 A[PHI: r8 r10
  0x0072: PHI (r8v5 int) = (r8v2 int), (r8v7 int), (r8v8 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]
  0x0072: PHI (r10v18 int) = (r10v11 int), (r10v22 int), (r10v25 int) binds: [B:76:0x00da, B:37:0x0070, B:62:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    public static String b(String str) {
        int i10;
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        int iLastIndexOf = str.lastIndexOf(47, length);
        while (length > 0) {
            int i11 = length - iLastIndexOf;
            if (i11 == 2) {
                if (str.charAt(iLastIndexOf + 1) == '.') {
                    break;
                }
                int i12 = iLastIndexOf;
                iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
                length = i12;
            } else {
                if (i11 == 3 && str.charAt(iLastIndexOf + 1) == '.' && str.charAt(iLastIndexOf + 2) == '.') {
                    break;
                }
                int i13 = iLastIndexOf;
                iLastIndexOf = str.lastIndexOf(47, iLastIndexOf - 1);
                length = i13;
            }
        }
        if (iLastIndexOf >= length) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        while (length > 0) {
            int i17 = length - iLastIndexOf;
            if (i17 == 2) {
                int i18 = iLastIndexOf + 1;
                if (sb2.charAt(i18) == '.') {
                    if (iLastIndexOf >= 0 || sb2.length() <= 2 || sb2.charAt(1) != '/' || sb2.charAt(2) != '/') {
                        if (i15 < 0) {
                            i15 = length;
                        }
                        if (iLastIndexOf < 0 || (iLastIndexOf == 0 && sb2.charAt(iLastIndexOf) == '/')) {
                            if (i15 < sb2.length() && sb2.charAt(i15) == '/') {
                                i15++;
                            }
                            i16 = i18;
                        } else {
                            i16 = length == sb2.length() ? i18 : iLastIndexOf;
                            i10 = iLastIndexOf - 1;
                            while (i10 >= 0 && sb2.charAt(i10) != '/') {
                                i10--;
                            }
                        }
                    }
                    int i19 = iLastIndexOf;
                    iLastIndexOf = i10;
                    length = i19;
                } else if (i14 > 0 && (i14 = i14 - 1) == 0) {
                    i16 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i16 > 0 && i15 == sb2.length() && sb2.charAt(i15 - 1) == '.') {
                        i16++;
                    }
                }
                if (i14 <= 0) {
                    sb2.delete(i16, i15);
                    if (i14 > 0) {
                        i15 = length;
                        i16 = -1;
                    } else {
                        i15 = -1;
                        i16 = -1;
                    }
                }
                i10 = iLastIndexOf - 1;
                while (i10 >= 0) {
                    i10--;
                }
                int i110 = iLastIndexOf;
                iLastIndexOf = i10;
                length = i110;
            } else if (i17 != 3) {
                if (i14 > 0 && (i14 = i14 - 1) == 0) {
                    i16 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i15 == sb2.length() && sb2.charAt(i15 - 1) == '.') {
                        i16++;
                    }
                }
                if (i14 <= 0 && i16 >= 0 && i15 >= i16) {
                    sb2.delete(i16, i15);
                    if (i14 > 0) {
                        i15 = length;
                        i16 = -1;
                    } else {
                        i15 = -1;
                        i16 = -1;
                    }
                }
                i10 = iLastIndexOf - 1;
                while (i10 >= 0 && sb2.charAt(i10) != '/') {
                    i10--;
                }
                int i111 = iLastIndexOf;
                iLastIndexOf = i10;
                length = i111;
            } else if (sb2.charAt(iLastIndexOf + 1) == '.' && sb2.charAt(iLastIndexOf + 2) == '.') {
                if (i15 < 0) {
                    i15 = length;
                }
                i14++;
                int i20 = iLastIndexOf - 1;
                while (i20 >= 0 && sb2.charAt(i20) != '/') {
                    i20--;
                }
                i16 = iLastIndexOf;
                iLastIndexOf = i20;
                length = i16;
            } else {
                if (i14 > 0 && (i14 = i14 - 1) == 0) {
                    i16 = iLastIndexOf >= 0 ? iLastIndexOf : 0;
                    if (i16 > 0 && i15 == sb2.length() && sb2.charAt(i15 - 1) == '.') {
                        i16++;
                    }
                }
                if (i14 <= 0) {
                    sb2.delete(i16, i15);
                    if (i14 > 0) {
                        i15 = length;
                        i16 = -1;
                    } else {
                        i15 = -1;
                        i16 = -1;
                    }
                }
                i10 = iLastIndexOf - 1;
                while (i10 >= 0) {
                    i10--;
                }
                int i112 = iLastIndexOf;
                iLastIndexOf = i10;
                length = i112;
            }
        }
        if (i14 > 0) {
            return null;
        }
        if (i15 >= 0) {
            sb2.delete(i16, i15);
        }
        return sb2.toString();
    }

    public static String c(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/') {
                i11++;
                if (i11 == 2) {
                    break;
                }
            } else {
                if (cCharAt == '?') {
                    return str;
                }
                i11 = 0;
            }
            i10++;
        }
        if (i11 < 2) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.length());
        stringBuffer.append((CharSequence) str, 0, i10);
        while (i10 < length) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 == '/') {
                int i12 = i11 + 1;
                if (i11 == 0) {
                    stringBuffer.append(cCharAt2);
                }
                i11 = i12;
            } else {
                if (cCharAt2 == '?') {
                    stringBuffer.append((CharSequence) str, i10, length);
                    break;
                }
                stringBuffer.append(cCharAt2);
                i11 = 0;
            }
            i10++;
        }
        return stringBuffer.toString();
    }

    public static String f(String str) {
        StringBuilder sbG;
        return (str == null || str.length() == 0 || (sbG = g(null, str)) == null) ? str : sbG.toString();
    }

    public static StringBuilder g(StringBuilder sb2, String str) {
        StringBuilder sb3;
        byte[] bytes;
        byte[] bArr = null;
        int i10 = 0;
        if (sb2 == null) {
            int i11 = 0;
            while (true) {
                if (i11 < str.length()) {
                    char cCharAt = str.charAt(i11);
                    if (cCharAt == ' ' || cCharAt == '%' || cCharAt == '\'' || cCharAt == '\"' || cCharAt == '#' || cCharAt == ';' || cCharAt == '<' || cCharAt == '>' || cCharAt == '?') {
                        sb3 = new StringBuilder(str.length() * 2);
                    } else {
                        if (cCharAt > 127) {
                            try {
                                bytes = str.getBytes(f75070b);
                                sb3 = new StringBuilder(str.length() * 2);
                                break;
                            } catch (UnsupportedEncodingException e10) {
                                throw new IllegalStateException(e10);
                            }
                        }
                        i11++;
                    }
                } else {
                    sb3 = sb2;
                }
                bytes = null;
                break;
            }
            if (sb3 == null) {
                return null;
            }
            bArr = bytes;
        } else {
            sb3 = sb2;
        }
        synchronized (sb3) {
            try {
                if (bArr != null) {
                    while (i10 < bArr.length) {
                        byte b10 = bArr[i10];
                        if (b10 == 32) {
                            sb3.append("%20");
                        } else if (b10 == 37) {
                            sb3.append("%25");
                        } else if (b10 == 39) {
                            sb3.append("%27");
                        } else if (b10 == 34) {
                            sb3.append("%22");
                        } else if (b10 == 35) {
                            sb3.append("%23");
                        } else if (b10 == 59) {
                            sb3.append("%3B");
                        } else if (b10 == 60) {
                            sb3.append("%3C");
                        } else if (b10 == 62) {
                            sb3.append("%3E");
                        } else if (b10 == 63) {
                            sb3.append("%3F");
                        } else if (b10 < 0) {
                            sb3.append('%');
                            p.g(b10, sb3);
                        } else {
                            sb3.append((char) b10);
                        }
                        i10++;
                    }
                } else {
                    while (i10 < str.length()) {
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 == ' ') {
                            sb3.append("%20");
                        } else if (cCharAt2 == '%') {
                            sb3.append("%25");
                        } else if (cCharAt2 == '\'') {
                            sb3.append("%27");
                        } else if (cCharAt2 == '\"') {
                            sb3.append("%22");
                        } else if (cCharAt2 == '#') {
                            sb3.append("%23");
                        } else if (cCharAt2 == ';') {
                            sb3.append("%3B");
                        } else if (cCharAt2 == '<') {
                            sb3.append("%3C");
                        } else if (cCharAt2 == '>') {
                            sb3.append("%3E");
                        } else if (cCharAt2 != '?') {
                            sb3.append(cCharAt2);
                        } else {
                            sb3.append("%3F");
                        }
                        i10++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sb3;
    }
}
