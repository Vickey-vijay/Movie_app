package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3042mn implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3117pn f24849a;

    public C3042mn(nk.l0 l0Var, C3117pn c3117pn) {
        this.f24849a = c3117pn;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3053n9 c3053n9 = this.f24849a.f25106c;
        if (c3053n9 != null) {
            c3053n9.a("VideoSurfaceViewabilityController", "Viewability " + zBooleanValue);
        }
        if (zBooleanValue) {
            Ij ij2 = this.f24849a.f25111h;
            if (ij2 != null) {
                ij2.a();
            }
        } else {
            Ij ij3 = this.f24849a.f25111h;
            if (ij3 != null) {
                ij3.b();
            }
        }
        return mj.r.f64562a;
    }
}
