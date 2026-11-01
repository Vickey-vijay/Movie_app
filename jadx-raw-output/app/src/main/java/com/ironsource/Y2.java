package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Y2 extends C3596md {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3621o0 f27895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ISBannerSize f27896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(C3621o0 c3621o0, ISBannerSize iSBannerSize, String str) {
        super(str);
        ck.p.j(c3621o0, "adTools");
        ck.p.j(iSBannerSize, "size");
        ck.p.j(str, "placement");
        this.f27895b = c3621o0;
        this.f27896c = iSBannerSize;
    }

    @Override // com.ironsource.C3596md, com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        Map<String, Object> mapB = kotlin.collections.a.B(super.a(b10));
        this.f27895b.a(mapB, this.f27896c);
        return mapB;
    }
}
