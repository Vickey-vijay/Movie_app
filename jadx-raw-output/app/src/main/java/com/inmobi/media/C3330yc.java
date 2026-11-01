package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3330yc implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f25782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.a f25783b;

    public C3330yc(Mc mc2, bk.a aVar) {
        ck.p.j(mc2, "nativeBeaconMacroData");
        ck.p.j(aVar, "getBeacons");
        this.f25782a = mc2;
        this.f25783b = aVar;
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c10) {
        ck.p.j(c10, "beaconExtras");
        boolean z10 = c10 instanceof Fo;
        List listY0 = nj.b0.y0((Collection) this.f25783b.invoke(), z10 ? ((Fo) c10).f22691b : nj.s.k());
        if (listY0.isEmpty()) {
            return;
        }
        Map mapJ = z10 ? ((Fo) c10).f22690a : kotlin.collections.a.j();
        Iterator it = listY0.iterator();
        while (it.hasNext()) {
            String strA = Oc.a((String) it.next(), this.f25782a, mapJ);
            C3271w3 c3271w3 = C3271w3.f25610a;
            ck.p.j(strA, "url");
            C3271w3.a(strA, false, null);
        }
    }
}
