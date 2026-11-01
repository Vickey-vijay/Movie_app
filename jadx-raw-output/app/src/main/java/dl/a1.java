package dl;

/* JADX INFO: compiled from: StringOps.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f52139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f52140b;

    public static final char e(int i10) {
        int i11 = i10 & 15;
        return (char) (i11 < 10 ? i11 + 48 : (i11 - 10) + 97);
    }

    static {
        String[] strArr = new String[93];
        for (int i10 = 0; i10 < 32; i10++) {
            strArr[i10] = "\\u" + e(i10 >> 12) + e(i10 >> 8) + e(i10 >> 4) + e(i10);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f52139a = strArr;
        byte[] bArr = new byte[93];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i11] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f52140b = bArr;
    }

    public static final byte[] a() {
        return f52140b;
    }

    public static final String[] b() {
        return f52139a;
    }

    public static final void c(StringBuilder sb2, String str) {
        ck.p.j(sb2, "<this>");
        ck.p.j(str, "value");
        sb2.append('\"');
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            String[] strArr = f52139a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb2.append((CharSequence) str, i10, i11);
                sb2.append(strArr[cCharAt]);
                i10 = i11 + 1;
            }
        }
        if (i10 != 0) {
            sb2.append((CharSequence) str, i10, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final Boolean d(String str) {
        ck.p.j(str, "<this>");
        if (lk.x.E(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (lk.x.E(str, com.ironsource.mediationsdk.metadata.a.f29886h, true)) {
            return Boolean.FALSE;
        }
        return null;
    }
}
