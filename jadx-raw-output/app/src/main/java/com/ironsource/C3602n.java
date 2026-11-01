package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3602n extends J5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f30200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f30201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30202c;

    public C3602n(IronSource.a aVar, UUID uuid, String str) {
        ck.p.j(aVar, "adFormat");
        ck.p.j(uuid, com.ironsource.sdk.controller.f.b.f30919c);
        ck.p.j(str, "adUnitId");
        this.f30200a = aVar;
        this.f30201b = uuid;
        this.f30202c = str;
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 b10) {
        return a(new C3476g0(this.f30200a, this.f30201b, this.f30202c, null, null, null, 56, null));
    }
}
