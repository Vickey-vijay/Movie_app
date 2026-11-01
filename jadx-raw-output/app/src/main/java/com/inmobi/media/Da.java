package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Da {
    public static String a(String str) {
        ck.p.j(str, "fileKey");
        return "com.im.keyValueStore." + str;
    }

    public static Ea a(Context context, String str) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str, "fileKey");
        String strA = a(str);
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea ea2 = (Ea) concurrentHashMap.get(strA);
        if (ea2 == null) {
            ea2 = new Ea(context, strA);
            Ea ea3 = (Ea) concurrentHashMap.putIfAbsent(strA, ea2);
            if (ea3 != null) {
                return ea3;
            }
        }
        return ea2;
    }
}
