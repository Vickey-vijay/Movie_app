package yads;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class jo3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f79137c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f79138d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f79139a = new jb2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f79140b = new StringBuilder();

    public static String a(jb2 jb2Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = jb2Var.f78967b;
        int i11 = jb2Var.f78968c;
        while (i10 < i11 && !z10) {
            char c10 = (char) jb2Var.f78966a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        int i12 = jb2Var.f78967b;
        jb2Var.e((i10 - i12) + i12);
        return sb2.toString();
    }

    public static String b(jb2 jb2Var, StringBuilder sb2) {
        a(jb2Var);
        if (jb2Var.f78968c - jb2Var.f78967b == 0) {
            return null;
        }
        String strA = a(jb2Var, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) jb2Var.m());
    }

    public static void a(jb2 jb2Var) {
        while (true) {
            boolean z10 = true;
            while (true) {
                int i10 = jb2Var.f78968c;
                int i11 = jb2Var.f78967b;
                if (i10 - i11 <= 0 || !z10) {
                    return;
                }
                byte[] bArr = jb2Var.f78966a;
                byte b10 = bArr[i11];
                char c10 = (char) b10;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    jb2Var.e(i11 + 1);
                    break;
                }
                int i12 = i11 + 2;
                if (i12 <= i10) {
                    int i13 = i11 + 1;
                    if (b10 == 47 && bArr[i13] == 42) {
                        while (true) {
                            int i14 = i12 + 1;
                            if (i14 >= i10) {
                                break;
                            }
                            if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                i12 += 2;
                                i10 = i12;
                            } else {
                                i12 = i14;
                            }
                        }
                        int i15 = jb2Var.f78967b;
                        jb2Var.e((i10 - i15) + i15);
                        break;
                    }
                }
                z10 = false;
            }
        }
    }
}
