package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.inmobi.media.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3144r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2995l1 f25217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2915hk f25218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f25221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f25222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f25223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f25224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f25225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C3120q1 f25226j;

    public C3144r1(AbstractC2995l1 abstractC2995l1) {
        ck.p.j(abstractC2995l1, "adUnit");
        this.f25217a = abstractC2995l1;
        this.f25218b = new C2915hk();
        this.f25226j = new C3120q1(this);
    }

    public final String a() {
        LinkedList<com.inmobi.media.ads.network.common.model.Ad> ads;
        com.inmobi.media.ads.network.common.model.Ad ad2;
        String telemetryMetadataBlob;
        AdSet adSetR = this.f25217a.r();
        return (adSetR == null || (ads = adSetR.getAds()) == null || (ad2 = (com.inmobi.media.ads.network.common.model.Ad) nj.b0.h0(ads)) == null || (telemetryMetadataBlob = ad2.getTelemetryMetadataBlob()) == null) ? "" : telemetryMetadataBlob;
    }
}
