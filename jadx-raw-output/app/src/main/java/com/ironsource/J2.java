package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class J2 extends C3476g0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LevelPlayAdSize f26852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Boolean f26853h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Long f26854i;

    public /* synthetic */ J2(UUID uuid, String str, C3489gd c3489gd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l10, Hf hf2, Double d10, int i10, ck.i iVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : c3489gd, (i10 & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : l10, (i10 & 64) != 0 ? null : hf2, (i10 & 128) != 0 ? null : d10);
    }

    public final LevelPlayAdSize h() {
        return this.f26852g;
    }

    public final Boolean i() {
        return this.f26853h;
    }

    public final Long j() {
        return this.f26854i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(UUID uuid, String str, C3489gd c3489gd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l10, Hf hf2, Double d10) {
        super(IronSource.a.BANNER, uuid, str, c3489gd, hf2, d10);
        ck.p.j(uuid, com.ironsource.sdk.controller.f.b.f30919c);
        ck.p.j(str, "adUnitId");
        ck.p.j(levelPlayAdSize, C3426d4.i.O);
        this.f26852g = levelPlayAdSize;
        this.f26853h = bool;
        this.f26854i = l10;
    }

    public J2() {
        this(C3815z7.f31705a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
