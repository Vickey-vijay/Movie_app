package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3596md implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29509a;

    public C3596md(String str) {
        ck.p.j(str, "placementName");
        this.f29509a = str;
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        HashMap map = new HashMap();
        map.put("placement", this.f29509a);
        return map;
    }
}
