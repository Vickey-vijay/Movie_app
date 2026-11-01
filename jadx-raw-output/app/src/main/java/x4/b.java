package x4;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import g5.k0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: SsaDialogueFormat.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f74345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f74346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f74347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f74348e;

    @Nullable
    public static b a(String str) {
        g5.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), StringUtils.COMMA);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strK0 = k0.K0(strArrSplit[i14].trim());
            strK0.hashCode();
            switch (strK0) {
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
        if (i10 == -1 || i11 == -1) {
            return null;
        }
        return new b(i10, i11, i12, i13, strArrSplit.length);
    }

    public b(int i10, int i11, int i12, int i13, int i14) {
        this.f74344a = i10;
        this.f74345b = i11;
        this.f74346c = i12;
        this.f74347d = i13;
        this.f74348e = i14;
    }
}
