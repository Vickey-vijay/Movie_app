package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3140ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f25194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f25197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f25198g;

    public C3140ql(String str, String str2, ArrayList arrayList, String str3, String str4, ArrayList arrayList2, ArrayList arrayList3) {
        ck.p.j(str, "universalAdId");
        ck.p.j(str2, "adServingId");
        ck.p.j(arrayList, "trackers");
        ck.p.j(str3, "clickThroughUrl");
        ck.p.j(str4, "mediaDuration");
        ck.p.j(arrayList2, "companionAds");
        ck.p.j(arrayList3, "mediaFiles");
        this.f25192a = str;
        this.f25193b = str2;
        this.f25194c = arrayList;
        this.f25195d = str3;
        this.f25196e = str4;
        this.f25197f = arrayList2;
        this.f25198g = arrayList3;
    }
}
