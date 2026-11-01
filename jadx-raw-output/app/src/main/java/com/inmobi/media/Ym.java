package com.inmobi.media;

import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public final class Ym implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2764bn f23872a;

    public Ym(nk.l0 l0Var, C2764bn c2764bn) {
        this.f23872a = c2764bn;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        ProgressBar progressBar;
        Rl rl2 = (Rl) obj;
        C2764bn c2764bn = this.f23872a;
        c2764bn.getClass();
        if (rl2 instanceof C2992kn) {
            ProgressBar progressBar2 = c2764bn.f24092e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (rl2 instanceof Xm) {
            int i10 = ((Xm) rl2).f23807b;
            ProgressBar progressBar3 = c2764bn.f24092e;
            if (progressBar3 != null) {
                H6.a(c2764bn.f24093f);
                c2764bn.f24093f = P4.a(c2764bn.f24088a, new C2738an(progressBar3, c2764bn, i10, null));
            }
        } else if ((rl2 instanceof Pl) && c2764bn.f24090c.f22649b && (progressBar = c2764bn.f24092e) != null) {
            progressBar.setVisibility(8);
        }
        return mj.r.f64562a;
    }
}
