package yads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class c33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f76148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f76151e;

    public static c33 a(String str) {
        if (!str.startsWith("Format:")) {
            throw new IllegalArgumentException();
        }
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strA = ki.a(strArrSplit[i14].trim());
            strA.getClass();
            switch (strA) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i13 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i12 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i13 == -1) {
            return null;
        }
        return new c33(i10, i11, i12, i13, strArrSplit.length);
    }

    public c33(int i10, int i11, int i12, int i13, int i14) {
        this.f76147a = i10;
        this.f76148b = i11;
        this.f76149c = i12;
        this.f76150d = i13;
        this.f76151e = i14;
    }
}
