package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class u31 implements j41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w31 f83351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f83352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s31 f83353c;

    @Override // yads.j41
    public final void a(i41 i41Var, boolean z10) {
        Bitmap bitmap = i41Var.f78482a;
        if (bitmap != null) {
            w31 w31Var = this.f83351a;
            String str = this.f83352b;
            s31 s31Var = this.f83353c;
            mi2 mi2Var = w31Var.f84088b;
            mi2Var.f80183b.putAll(nj.l0.g(mj.h.a(str, bitmap)));
            s31Var.a(bitmap);
        }
    }

    public u31(w31 w31Var, String str, s31 s31Var) {
        this.f83351a = w31Var;
        this.f83352b = str;
        this.f83353c = s31Var;
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        boolean z10 = ad1.f75480a;
    }
}
