package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class i43 implements dq2 {
    @Override // yads.dq2
    public final Object a(wp2 wp2Var) {
        byte[] bArr = wp2Var.f84290b.f84671a;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, t01.a(wp2Var.f84291c));
        } catch (Exception unused) {
            return new String(bArr, lk.c.f63591b);
        }
    }
}
