package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;

/* JADX INFO: renamed from: com.ironsource.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3752vc implements InterfaceC3735uc {
    @Override // com.ironsource.InterfaceC3735uc
    public void a(O9 o10, C3769wc c3769wc) throws Exception {
        ck.p.j(o10, C3426d4.i.f28559p0);
        ck.p.j(c3769wc, "loadParams");
        IronSourceNetwork.loadAd(o10, c3769wc.a());
    }

    @Override // com.ironsource.InterfaceC3735uc
    public String a() {
        String version = IronSourceNetwork.getVersion();
        ck.p.i(version, "getVersion()");
        return version;
    }
}
