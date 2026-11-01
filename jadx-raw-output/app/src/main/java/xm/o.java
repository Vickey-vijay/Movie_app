package xm;

import com.ironsource.G5;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StringUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zm.c f75059a = zm.b.a(o.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f75060b = System.getProperty("line.separator", "\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f75061c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f75062d = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static char[] f75063e = {0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', '\r', 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', G5.T, '>', '?', '@', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127};

    public static String f(String str, String str2, String str3) {
        int length = 0;
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf == -1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + str3.length());
        do {
            sb2.append(str.substring(length, iIndexOf));
            sb2.append(str3);
            length = str2.length() + iIndexOf;
            iIndexOf = str.indexOf(str2, length);
        } while (iIndexOf != -1);
        if (length < str.length()) {
            sb2.append(str.substring(length, str.length()));
        }
        return sb2.toString();
    }

    public static boolean g(String str, String str2) {
        if (str2 == null) {
            return true;
        }
        if (str == null || str.length() < str2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < str2.length(); i10++) {
            char cCharAt = str.charAt(i10);
            char cCharAt2 = str2.charAt(i10);
            if (cCharAt != cCharAt2) {
                if (cCharAt <= 127) {
                    cCharAt = f75063e[cCharAt];
                }
                if (cCharAt2 <= 127) {
                    cCharAt2 = f75063e[cCharAt2];
                }
                if (cCharAt != cCharAt2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void a(StringBuilder sb2, int i10) {
        if (i10 < 100) {
            sb2.append((char) ((i10 / 10) + 48));
            sb2.append((char) ((i10 % 10) + 48));
        }
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (Exception e10) {
            f75059a.e(e10);
            return str.getBytes();
        }
    }

    public static boolean d(String str) {
        return "UTF-8".equalsIgnoreCase(str) || "UTF8".equalsIgnoreCase(str);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isISOControl(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public static String h(byte[] bArr, int i10, int i11, String str) {
        try {
            return new String(bArr, i10, i11, str);
        } catch (UnsupportedEncodingException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static String b(String str) {
        int i10;
        char[] charArray;
        char c10;
        int length = str.length();
        while (true) {
            i10 = length - 1;
            if (length > 0) {
                char cCharAt = str.charAt(i10);
                if (cCharAt <= 127 && cCharAt != (c10 = f75063e[cCharAt])) {
                    charArray = str.toCharArray();
                    charArray[i10] = c10;
                    break;
                }
                length = i10;
            } else {
                charArray = null;
                break;
            }
        }
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                break;
            }
            char c11 = charArray[i11];
            if (c11 <= 127) {
                charArray[i11] = f75063e[c11];
            }
            i10 = i11;
        }
        if (charArray != null) {
            return new String(charArray);
        }
        return str;
    }

    public static String i(String str) {
        return m.e(str);
    }
}
