package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f15540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f15541c;

    public o(p pVar, i iVar, com.fyber.inneractive.sdk.util.g gVar) {
        this.f15541c = pVar;
        this.f15539a = iVar;
        this.f15540b = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f14960a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f15541c;
            i iVar = this.f15539a;
            String str = bVar.f14963d;
            com.fyber.inneractive.sdk.util.g gVar = this.f15540b;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f15542b, str);
            j jVar = (j) pVar.f15543a;
            i iVar2 = jVar.f15513a;
            if (iVar2 == null || iVar2.equals(iVar)) {
                IAlog.a("%s : No valid link object, origin: %s", j.f15512d, gVar);
                return;
            }
            p pVar2 = jVar.f15515c;
            i iVar3 = jVar.f15513a;
            pVar2.getClass();
            com.fyber.inneractive.sdk.util.r.f18606a.execute(new m(pVar2, iVar3, true, gVar));
        }
    }
}
