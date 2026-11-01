package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends com.fyber.inneractive.sdk.flow.k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f15483m = "Native";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f15484n;

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_native_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f15465c;
        if (xVar != null) {
            ((w0) xVar).destroy();
        }
        f fVar = this.f15484n;
        if (fVar != null) {
            fVar.f15491d.clear();
            fVar.f15493f = null;
            Iterator it = fVar.f15488a.iterator();
            while (it.hasNext()) {
                ((c) it.next()).destroy();
            }
            fVar.f15488a.clear();
            this.f15484n = null;
        }
        this.f15473k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.f18607b.removeCallbacks(this.f15474l);
        this.f15463a = null;
        this.f15464b = null;
        this.f15465c = null;
        this.f15466d = null;
        this.f15467e = null;
        this.f15468f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        com.fyber.inneractive.sdk.response.e eVar = this.f15464b;
        if (eVar == null || ((com.fyber.inneractive.sdk.response.nativead.j) eVar).T.N == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.f15469g;
        InneractiveAdRequest inneractiveAdRequest = this.f15463a;
        com.fyber.inneractive.sdk.response.nativead.j jVar = (com.fyber.inneractive.sdk.response.nativead.j) this.f15464b;
        f fVar = new f(rVar, inneractiveAdRequest, jVar, jVar.T.N, this, this.f15483m);
        this.f15484n = fVar;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.d dVarA = com.fyber.inneractive.sdk.flow.nativead.mainasset.e.a(fVar.f15496i, fVar.f15498k, fVar.f15495h, fVar.f15490c, fVar.f15497j, fVar);
        if (dVarA == null) {
            if (fVar.f15494g.compareAndSet(false, true)) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
                inneractiveInfrastructureError.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a("Could not start loading main media"));
                d dVar = fVar.f15493f;
                dVar.getClass();
                com.fyber.inneractive.sdk.util.r.f18606a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.f15464b, dVar.f15463a, "send_failed_native_creatives", dVar.f15469g.b()), inneractiveInfrastructureError));
                dVar.b(inneractiveInfrastructureError);
                return;
            }
            return;
        }
        fVar.f15488a.add(dVarA);
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.f15488a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = fVar.f15490c.f18479a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            for (com.fyber.inneractive.sdk.response.nativead.f fVar2 : fVar.f15490c.f18479a) {
                if (fVar2 != null && fVar2.f18466a != 2 && fVar2.f18469d != null) {
                    arrayList.add(fVar2);
                }
            }
        }
        copyOnWriteArrayList.add(new h(arrayList, fVar.f15499l));
        Iterator it = fVar.f15488a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b();
        }
    }
}
