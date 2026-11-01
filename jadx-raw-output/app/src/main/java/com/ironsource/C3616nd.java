package com.ironsource;

import com.unity3d.mediation.LevelPlay;

/* JADX INFO: renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3616nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LevelPlay.AdFormat f30309b;

    public C3616nd(String str, LevelPlay.AdFormat adFormat) {
        ck.p.j(str, "placementName");
        ck.p.j(adFormat, "adFormat");
        this.f30308a = str;
        this.f30309b = adFormat;
    }

    public final String a() {
        return this.f30308a + "_" + this.f30309b;
    }
}
