package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class l31 extends p31 {
    @Override // yads.p31
    public final o31 a(Context context, int i10, int i11, int i12) {
        int iG = ik.k.g(kl3.a(context, this.f81214a), i10);
        return new o31(iG, ek.b.c(i12 * (iG / i11)));
    }

    public l31(float f10) {
        super(f10);
    }

    @Override // yads.p31
    public final float a(float f10) {
        return ik.k.c(f10, 10.0f);
    }
}
