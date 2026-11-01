package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class N5 implements B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f23191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Nl f23192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2760bj f23193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f23194d;

    public N5(Mc mc2, Nl nl2, C2760bj c2760bj, C2760bj c2760bj2) {
        ck.p.j(mc2, "nativeBeaconMacroData");
        ck.p.j(nl2, "nativeBeaconTrackerData");
        ck.p.j(c2760bj, "progressReceivedBeacons");
        ck.p.j(c2760bj2, "progressTriggeredBeacons");
        this.f23191a = mc2;
        this.f23192b = nl2;
        this.f23193c = c2760bj2;
        this.f23194d = new AtomicInteger(-1);
        if (nl2.f23257c.isEmpty()) {
            return;
        }
        c2760bj.a(Te.f23560a);
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c10) {
        ck.p.j(Te.f23560a, "beaconExtras");
        int i10 = this.f23191a.f23159e;
        int i11 = this.f23194d.get();
        if (i10 <= this.f23194d.getAndSet(i10)) {
            return;
        }
        ArrayList arrayList = this.f23192b.f23257c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            int i13 = ((M5) obj).f23134a;
            if (i12 <= i13 && i13 <= i10) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        this.f23193c.a(Te.f23560a);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String strA = Oc.a(((M5) it.next()).f23135b, this.f23191a, kotlin.collections.a.j());
            C3271w3 c3271w3 = C3271w3.f25610a;
            ck.p.j(strA, "url");
            C3271w3.a(strA, false, null);
        }
    }
}
