package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2714a extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f23930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23931c;

    @Override // com.inmobi.media.R0
    public final mj.r a(AdResponse adResponse, bk.l lVar) {
        C3053n9 c3053n9 = this.f23419a;
        if (c3053n9 != null) {
            c3053n9.a("ABAdResponseManager", "Instance PLId: " + this.f23931c + ", Response PLId: " + adResponse.getPlacementId());
        }
        V0.a(adResponse, this.f23419a, lVar);
        return mj.r.f64562a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2714a(byte[] bArr, long j10, C3053n9 c3053n9) {
        super(c3053n9);
        ck.p.j(bArr, "response");
        this.f23930b = bArr;
        this.f23931c = j10;
    }

    @Override // com.inmobi.media.R0
    public final Object a(rj.c cVar) {
        return new String(this.f23930b, lk.c.f63591b);
    }
}
