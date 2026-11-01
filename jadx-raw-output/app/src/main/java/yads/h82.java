package yads;

import android.util.Base64;

/* JADX INFO: loaded from: classes8.dex */
public final class h82 implements g82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hn f78096a;

    public /* synthetic */ h82() {
        this(new hn());
    }

    public final String a(wp2 wp2Var) {
        byte[] bArr = wp2Var.f84290b.f84671a;
        if (bArr == null) {
            return null;
        }
        String strC = t01.c(wp2Var.f84291c, u11.T);
        if (strC != null && !Boolean.parseBoolean(strC)) {
            return new String(bArr, lk.c.f63591b);
        }
        this.f78096a.getClass();
        try {
            return new String(Base64.decode(bArr, 0), lk.c.f63591b);
        } catch (Exception unused) {
            String str = new String(bArr, lk.c.f63591b);
            boolean z10 = ad1.f75480a;
            return str;
        }
    }

    public h82(hn hnVar) {
        this.f78096a = hnVar;
    }
}
