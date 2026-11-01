package com.inmobi.media;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.inmobi.media.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2990kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24699d;

    public C2990kl(String str, String str2, int i10, ArrayList arrayList) {
        ck.p.j(str, "universalAdId");
        ck.p.j(str2, "adServingId");
        ck.p.j(arrayList, "trackers");
        this.f24696a = str;
        this.f24697b = str2;
        this.f24698c = i10;
        this.f24699d = arrayList;
    }
}
