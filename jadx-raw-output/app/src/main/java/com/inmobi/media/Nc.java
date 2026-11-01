package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Nc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f23237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lc f23238b;

    public Nc(C2990kl c2990kl, C2767c0 c2767c0, C3286wi c3286wi) {
        ck.p.j(c2767c0, "adLifecycleData");
        ck.p.j(c3286wi, "responseBeaconData");
        ArrayList arrayList = null;
        this.f23237a = new Mc(c2767c0, c2990kl != null ? c2990kl.f24696a : null, c2990kl != null ? c2990kl.f24697b : null);
        if (c2990kl != null) {
            ArrayList arrayList2 = c2990kl.f24699d;
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                String str = ((C3257ve) obj).f25569b;
                ck.p.j(str, "type");
                if (ck.p.e(str, VastTagName.IMPRESSION)) {
                    arrayList.add(obj);
                }
            }
        }
        this.f23238b = new Lc(this.f23237a, new Pc(c3286wi, arrayList));
    }

    public final void a(short s10, List list) {
        ck.p.j(list, "trackers");
        this.f23238b.f23073c.a(new Fo(nj.l0.g(mj.h.a("[EVENTTYPE]", String.valueOf((int) s10))), list));
    }
}
