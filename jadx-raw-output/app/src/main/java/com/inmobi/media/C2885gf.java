package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2885gf extends AbstractC2996l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2833ef f24426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3053n9 f24427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2885gf(SignalsConfig.NovatiqConfig novatiqConfig, C2833ef c2833ef, C3053n9 c3053n9) {
        super(novatiqConfig.getBeaconUrl());
        ck.p.j(novatiqConfig, "mConfig");
        ck.p.j(c2833ef, "data");
        this.f24426b = c2833ef;
        this.f24427c = c3053n9;
    }

    public final Je a() {
        C3053n9 c3053n9 = this.f24427c;
        if (c3053n9 != null) {
            C2833ef c2833ef = this.f24426b;
            c3053n9.a("Novatiq", "preparing Novatiq request with data - hyperId - " + c2833ef.f24311a + " - sspHost - " + c2833ef.f24312b + " - pubId - inmobi");
        }
        String str = this.f24735a;
        Pair pairA = mj.h.a("sptoken", this.f24426b.f24311a);
        this.f24426b.getClass();
        Pair pairA2 = mj.h.a("sspid", "i6i");
        Pair pairA3 = mj.h.a("ssphost", this.f24426b.f24312b);
        this.f24426b.getClass();
        return new Je(str, null, null, kotlin.collections.a.m(pairA, pairA2, pairA3, mj.h.a("pubid", "inmobi")), null, false, 54);
    }
}
