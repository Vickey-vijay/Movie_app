package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.MainLink;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3311xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f25733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MainLink f25734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25735c;

    public C3311xi(LinkedHashMap linkedHashMap, MainLink mainLink, List list) {
        ck.p.j(linkedHashMap, "assetIdToLinkMap");
        ck.p.j(list, "responseClickTrackers");
        this.f25733a = linkedHashMap;
        this.f25734b = mainLink;
        this.f25735c = list;
    }
}
