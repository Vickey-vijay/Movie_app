package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3196t3 implements InterfaceC2997l3 {
    @Override // com.inmobi.media.InterfaceC2997l3
    public final void a(S2 s10) {
        ck.p.j(s10, "click");
        C3271w3 c3271w3 = C3271w3.f25610a;
        ck.p.i("w3", "access$getTAG$p(...)");
        String str = s10.f23479b;
        LinkedHashMap linkedHashMap = C3271w3.f25619j;
        C2715a0 c2715a0 = (C2715a0) linkedHashMap.get(Integer.valueOf(s10.f23478a));
        if (c2715a0 != null) {
            ck.p.j(s10, "click");
            c2715a0.f23932a.a(c2715a0.f23933b);
        }
        linkedHashMap.remove(Integer.valueOf(s10.f23478a));
        nk.i.b(null, new C3171s3(s10, null), 1, null);
    }

    @Override // com.inmobi.media.InterfaceC2997l3
    public final void a(S2 s10, EnumC2721a6 enumC2721a6) {
        ck.p.j(s10, "click");
        ck.p.j(enumC2721a6, IronSourceConstants.EVENTS_ERROR_CODE);
        C3271w3 c3271w3 = C3271w3.f25610a;
        ck.p.i("w3", "access$getTAG$p(...)");
        String str = s10.f23479b;
        if (s10.f23483f == 0) {
            C3271w3.a(s10, enumC2721a6.name());
        }
        C3271w3.b(s10);
        C3271w3.f();
    }
}
