package com.inmobi.media;

import com.mbridge.msdk.MBridgeConstans;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2734aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2900h5 f24007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24008b;

    public C2734aj(C2900h5 c2900h5, List list) {
        ck.p.j(c2900h5, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(list, "friendlyViews");
        this.f24007a = c2900h5;
        this.f24008b = list;
    }
}
