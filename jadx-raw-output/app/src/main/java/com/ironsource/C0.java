package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class C0 extends J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3621o0 f26071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3476g0 f26072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26073c;

    public /* synthetic */ C0(C3621o0 c3621o0, C3476g0 c3476g0, String str, int i10, ck.i iVar) {
        this(c3621o0, c3476g0, (i10 & 4) != 0 ? null : str);
    }

    public C0(C3621o0 c3621o0, C3476g0 c3476g0, String str) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(c3476g0, "adProperties");
        this.f26071a = c3621o0;
        this.f26072b = c3476g0;
        this.f26073c = str;
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        Map<String, Object> mapA = a(this.f26072b);
        mapA.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapA.put("sessionDepth", Integer.valueOf(this.f26071a.f()));
        String str = this.f26073c;
        if (str != null) {
            mapA.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapA;
    }
}
