package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class m31 extends p31 {
    @Override // yads.p31
    public final o31 a(Context context, int i10, int i11, int i12) {
        int iC = ek.b.c(i10 * this.f81214a);
        return new o31(iC, ek.b.c(i12 * (iC / i11)));
    }

    public m31(float f10) {
        super(f10);
    }

    @Override // yads.p31
    public final float a(float f10) {
        return ik.k.j(f10, 0.01f, 1.0f);
    }
}
