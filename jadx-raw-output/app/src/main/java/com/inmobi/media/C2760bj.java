package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2760bj implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f24076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.a f24077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f24078c;

    public C2760bj(Mc mc2, bk.a aVar) {
        ck.p.j(mc2, "vastBeaconDataModel");
        ck.p.j(aVar, "getBeacons");
        this.f24076a = mc2;
        this.f24077b = aVar;
        this.f24078c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c10) {
        Object obj = Te.f23560a;
        ck.p.j(obj, "beaconExtras");
        if (this.f24078c.getAndSet(true)) {
            return;
        }
        boolean z10 = obj instanceof Fo;
        Map mapJ = z10 ? ((Fo) obj).f22690a : kotlin.collections.a.j();
        List listY0 = nj.b0.y0((Collection) this.f24077b.invoke(), z10 ? ((Fo) obj).f22691b : nj.s.k());
        if (listY0.isEmpty()) {
            return;
        }
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            String strA = Oc.a((String) it.next(), this.f24076a, mapJ);
            C3271w3 c3271w3 = C3271w3.f25610a;
            ck.p.j(strA, "url");
            C3271w3.a(strA, false, null);
        }
    }
}
