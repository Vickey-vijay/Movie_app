package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;

/* JADX INFO: renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3416cc extends C3476g0 {
    public /* synthetic */ C3416cc(UUID uuid, String str, C3489gd c3489gd, int i10, ck.i iVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : c3489gd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3416cc(UUID uuid, String str, C3489gd c3489gd) {
        super(IronSource.a.NATIVE_AD, uuid, str, c3489gd, null, null, 48, null);
        ck.p.j(uuid, com.ironsource.sdk.controller.f.b.f30919c);
        ck.p.j(str, "adUnitId");
    }

    public C3416cc() {
        this(C3815z7.f31705a.a(), "", null, 4, null);
    }
}
