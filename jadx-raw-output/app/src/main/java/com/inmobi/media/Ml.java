package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc f23179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ll f23180b;

    public Ml(C2990kl c2990kl, C2767c0 c2767c0, C2893gn c2893gn) {
        int iA;
        ck.p.j(c2990kl, "vastBeaconData");
        ck.p.j(c2767c0, "adLifecycleData");
        ck.p.j(c2893gn, "responseBeaconData");
        this.f23179a = new Mc(c2767c0, c2990kl.f24696a, c2990kl.f24697b);
        ArrayList arrayList = c2990kl.f24699d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C3257ve c3257ve = (C3257ve) obj;
            if (!(c3257ve instanceof O5)) {
                String str = c3257ve.f25569b;
                ck.p.j(str, "type");
                if (!ck.p.e(str, VastTagName.IMPRESSION) && !ck.p.e(str, "click")) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = c2990kl.f24699d;
        ArrayList<O5> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (obj2 instanceof O5) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(nj.t.v(arrayList4, 10));
        for (O5 o10 : arrayList4) {
            int i10 = c2990kl.f24698c;
            ck.p.j(o10, "<this>");
            int i11 = 0;
            if (lk.x.D(o10.f23270c, "%", false, 2, null)) {
                try {
                    i11 = Integer.parseInt(lk.c0.q1(o10.f23270c, 1));
                } catch (Exception unused) {
                }
                iA = (i10 * i11) / 100;
            } else {
                iA = Jl.a(o10.f23270c);
            }
            arrayList5.add(new M5(o10.f25568a, iA));
        }
        this.f23180b = new Ll(this.f23179a, new Nl(c2893gn, arrayList2, arrayList5));
    }
}
