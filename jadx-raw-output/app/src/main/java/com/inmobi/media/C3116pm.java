package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3116pm extends AbstractC3324y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f25097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f25099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Qm f25100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ml f25101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3142qn f25102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V3 f25103h;

    public C3116pm(String str, ArrayList arrayList, ArrayList arrayList2, AdConfig.VastVideoConfig vastVideoConfig, Qm qm2, Ml ml2, C3142qn c3142qn, V3 v10) {
        ck.p.j(str, "mediaDuration");
        ck.p.j(arrayList, "companionAds");
        ck.p.j(arrayList2, "mediaFiles");
        ck.p.j(vastVideoConfig, "vastVideoConfig");
        ck.p.j(qm2, "videoPlayerConfig");
        ck.p.j(ml2, "videoBeaconProcessor");
        ck.p.j(c3142qn, "videoTelemetryHelper");
        ck.p.j(v10, "companionTelemetryHelper");
        this.f25096a = str;
        this.f25097b = arrayList;
        this.f25098c = arrayList2;
        this.f25099d = vastVideoConfig;
        this.f25100e = qm2;
        this.f25101f = ml2;
        this.f25102g = c3142qn;
        this.f25103h = v10;
    }
}
