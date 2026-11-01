package b1;

import j1.c;

/* JADX INFO: compiled from: DefaultBorderFormatter.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements a {
    public static String b(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 10);
        String[] strArrSplit = str.split(c.f61690a);
        int length = strArrSplit.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(c.f61690a);
            }
            String str2 = strArrSplit[i10];
            sb2.append((char) 9553);
            sb2.append(str2);
        }
        return sb2.toString();
    }

    @Override // a1.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i10 = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i10] = str;
                i10++;
            }
        }
        if (i10 == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════");
        sb2.append(c.f61690a);
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(b(strArr2[i11]));
            if (i11 != i10 - 1) {
                sb2.append(c.f61690a);
                sb2.append("╟───────────────────────────────────────────────────────────────────────────────────────────────────");
                sb2.append(c.f61690a);
            } else {
                sb2.append(c.f61690a);
                sb2.append("╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb2.toString();
    }
}
