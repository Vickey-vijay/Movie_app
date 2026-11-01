package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements com.fyber.inneractive.sdk.click.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f15535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f15536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f15537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f15538d;

    public n(p pVar, i iVar, String str, com.fyber.inneractive.sdk.util.g gVar) {
        this.f15538d = pVar;
        this.f15535a = iVar;
        this.f15536b = str;
        this.f15537c = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.o
    public final void a(com.fyber.inneractive.sdk.click.b bVar) {
        if (bVar.f14960a == com.fyber.inneractive.sdk.click.q.FAILED) {
            p pVar = this.f15538d;
            i iVar = this.f15535a;
            String str = this.f15536b;
            com.fyber.inneractive.sdk.util.g gVar = this.f15537c;
            pVar.getClass();
            IAlog.f("%s : Trying to resolve fallback Link: %s", p.f15542b, str);
            if (v.a(str)) {
                o oVar = new o(pVar, iVar, gVar);
                k kVar = ((j) pVar.f15543a).f15514b;
                if (kVar != null) {
                    kVar.a(str, true, gVar, oVar);
                    return;
                }
                return;
            }
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
