package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3341yn implements qk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nk.l0 f25815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bn f25816b;

    public C3341yn(nk.l0 l0Var, Bn bn2) {
        this.f25816b = bn2;
        this.f25815a = l0Var;
    }

    @Override // qk.d
    public final Object emit(Object obj, rj.c cVar) {
        nk.l0 l0Var = this.f25815a;
        boolean z10 = true;
        if (((Mn) obj) == Mn.VISIBLE) {
            Cn cn2 = this.f25816b.f22438d;
            if (!cn2.f22481b) {
                kotlinx.coroutines.g gVar = cn2.f22480a;
                if (!(gVar != null ? gVar.isActive() : false)) {
                    z10 = false;
                }
            }
            if (!z10) {
                Bn bn2 = this.f25816b;
                bn2.f22438d.f22480a = nk.j.d(l0Var, null, null, new An(bn2, null), 3, null);
            }
        } else {
            Bn bn3 = this.f25816b;
            kotlinx.coroutines.g gVar2 = bn3.f22438d.f22480a;
            if (gVar2 != null) {
                kotlinx.coroutines.g.a.a(gVar2, null, 1, null);
            }
            bn3.f22438d.f22480a = null;
        }
        return mj.r.f64562a;
    }
}
