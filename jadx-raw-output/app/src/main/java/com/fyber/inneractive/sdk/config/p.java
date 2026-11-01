package com.fyber.inneractive.sdk.config;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements com.fyber.inneractive.sdk.network.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f15140a;

    public p(s sVar) {
        this.f15140a = sVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        o oVar = (o) obj;
        if (oVar != null) {
            s sVar = this.f15140a;
            if (oVar.equals(sVar.f15195b)) {
                return;
            }
            sVar.f15197d = true;
            sVar.f15195b = oVar;
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new q(sVar));
        }
    }
}
