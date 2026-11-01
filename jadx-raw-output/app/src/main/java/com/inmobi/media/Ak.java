package com.inmobi.media;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class Ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T9 f22376a;

    public Ak(T9 t10) {
        ck.p.j(t10, "mConfigIncludeIdMaskMap");
        this.f22376a = t10;
    }

    public final HashMap a() {
        C3194t1 c3194t1;
        String str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            if (this.f22376a.a() && (c3194t1 = AbstractC3363zk.f25867a) != null && (str = c3194t1.f25366b) != null) {
                ck.p.g(str);
                map2.put("GPID", str);
            }
        } catch (Exception unused) {
            ck.p.i(Ak.class.getSimpleName(), "getSimpleName(...)");
        }
        String string = new JSONObject(map2).toString();
        ck.p.i(string, "toString(...)");
        map.put("u-id-map", string);
        return map;
    }
}
