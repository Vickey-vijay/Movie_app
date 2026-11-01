package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class n31 extends p31 {
    @Override // yads.p31
    public final o31 a(Context context, int i10, int i11, int i12) {
        int iA = kl3.a(context, 140);
        int iC = ek.b.c(i10 * this.f81214a);
        if (i11 > iC) {
            i12 = ek.b.c(i12 / (i11 / iC));
            i11 = iC;
        }
        if (i12 > iA) {
            i11 = ek.b.c(i11 / (i12 / iA));
        } else {
            iA = i12;
        }
        return new o31(i11, iA);
    }

    public n31(float f10) {
        super(f10);
    }

    @Override // yads.p31
    public final float a(float f10) {
        return ik.k.j(f10, 0.01f, 1.0f);
    }
}
