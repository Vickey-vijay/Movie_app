package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Y4> f27975a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Y4> f27976b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, Y4> f27977c = new LinkedHashMap();

    private Map<String, Y4> b(C3714t8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C3714t8.e.RewardedVideo.name())) {
            return this.f27975a;
        }
        if (eVar.name().equalsIgnoreCase(C3714t8.e.Interstitial.name())) {
            return this.f27976b;
        }
        if (eVar.name().equalsIgnoreCase(C3714t8.e.Banner.name())) {
            return this.f27977c;
        }
        return null;
    }

    public Collection<Y4> a(C3714t8.e eVar) {
        Map<String, Y4> mapB = b(eVar);
        return mapB != null ? mapB.values() : new ArrayList();
    }

    public Y4 a(C3714t8.e eVar, String str) {
        Map<String, Y4> mapB;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null) {
            return null;
        }
        return mapB.get(str);
    }

    private void a(C3714t8.e eVar, String str, Y4 y10) {
        Map<String, Y4> mapB;
        if (TextUtils.isEmpty(str) || y10 == null || (mapB = b(eVar)) == null) {
            return;
        }
        mapB.put(str, y10);
    }

    public void b(C3714t8.e eVar, String str) {
        Map<String, Y4> mapB;
        Y4 y4Remove;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null || (y4Remove = mapB.remove(str)) == null) {
            return;
        }
        y4Remove.a();
    }

    public Y4 a(C3714t8.e eVar, O9 o10) {
        Y4 y10 = new Y4(o10);
        a(eVar, o10.e(), y10);
        return y10;
    }

    public Y4 a(C3714t8.e eVar, String str, Map<String, String> map, Hc hc2) {
        Y4 y10 = new Y4(str, str, map, hc2);
        a(eVar, str, y10);
        return y10;
    }
}
