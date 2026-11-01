package io.appmetrica.analytics.impl;

import com.ironsource.C3444e4;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4244he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f56902a;

    public final String a(String str) {
        return this.f56902a.containsKey(str) ? (String) this.f56902a.get(str) : str;
    }

    public C4244he() {
        HashMap map = new HashMap();
        this.f56902a = map;
        map.put("google_aid", "g");
        map.put("huawei_oaid", "h");
        map.put("sim_info", "si");
        map.put("features_collecting", "fc");
        map.put("permissions_collecting", "pc");
        map.put("retry_policy", "rp");
        map.put("cache_control", "cc");
        map.put(C3444e4.f28728c, "at");
        map.put("startup_update", "su");
        map.put("ssl_pinning", "sp");
        map.put("external_attribution", "exta");
    }
}
