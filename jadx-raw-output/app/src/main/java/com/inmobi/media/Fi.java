package com.inmobi.media;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Fi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yj f22660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f22661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22662c;

    public final boolean a(String str, Map map) {
        ck.p.j(map, "keyValueMap");
        ck.p.j(str, "eventType");
        Yj yj2 = this.f22660a;
        if (yj2.f23862e && !yj2.f23863f.contains(str)) {
            return false;
        }
        if (map.isEmpty() || !ck.p.e(str, "AssetDownloaded") || !map.containsKey("assetType")) {
            return true;
        }
        if (ck.p.e("image", map.get("assetType")) && !this.f22660a.f23859b) {
            Wj wj2 = Wj.f23753a;
            return false;
        }
        if (ck.p.e("gif", map.get("assetType")) && !this.f22660a.f23860c) {
            Wj wj3 = Wj.f23753a;
            return false;
        }
        if (!ck.p.e("video", map.get("assetType")) || this.f22660a.f23861d) {
            return true;
        }
        Wj wj4 = Wj.f23753a;
        return false;
    }

    public Fi(Yj yj2, double d10, List list) {
        ck.p.j(yj2, "telemetryConfigMetaData");
        ck.p.j(list, "samplingEvents");
        this.f22660a = yj2;
        this.f22661b = d10;
        this.f22662c = list;
        ck.p.i(Fi.class.getSimpleName(), "getSimpleName(...)");
    }

    public final int a(String str) {
        ck.p.j(str, "eventType");
        if (!this.f22662c.contains(str)) {
            return 1;
        }
        if (this.f22661b < this.f22660a.f23864g) {
            Wj wj2 = Wj.f23753a;
            return 2;
        }
        Wj wj3 = Wj.f23753a;
        return 0;
    }
}
