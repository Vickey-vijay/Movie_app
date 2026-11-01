package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends f {
    @Override // com.fyber.inneractive.sdk.mraid.f
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        Map map = this.f15974b;
        this.f15975c.setOrientationProperties((map != null && map.containsKey("allowOrientationChange") && com.ironsource.mediationsdk.metadata.a.f29886h.equals(this.f15974b.get("allowOrientationChange"))) ? false : true, (String) this.f15974b.get("forceOrientation"));
    }

    public t(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }
}
