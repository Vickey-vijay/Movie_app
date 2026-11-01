package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends e {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        int iA = a("w");
        int iA2 = a("h");
        this.f15975c.a((String) this.f15974b.get("url"), iA <= 0 ? -1 : iA, iA2 <= 0 ? -1 : iA2, "true".equals(this.f15974b.get("shouldUseCustomClose")), "true".equals(this.f15974b.get("lockOrientation")));
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.f15974b.get("url");
    }

    public i(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}
