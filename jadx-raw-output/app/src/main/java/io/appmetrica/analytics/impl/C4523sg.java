package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4523sg {
    public static HashMap b(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            int iLastIndexOf = str.lastIndexOf(63);
            if (iLastIndexOf >= 0) {
                str = str.substring(iLastIndexOf + 1);
            }
            if (str.contains("=")) {
                for (String str2 : str.split(C3426d4.j.f28584c)) {
                    int iIndexOf = str2.indexOf("=");
                    if (iIndexOf >= 0) {
                        map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                    } else {
                        map.put(str2, "");
                    }
                }
            }
        }
        return map;
    }

    public static K7 a(String str) {
        HashMap mapB = b(str);
        if (mapB.isEmpty()) {
            mapB = b(Uri.decode(str));
        }
        String strDecode = Uri.decode((String) mapB.get("appmetrica_deep_link"));
        HashMap map = null;
        if (!TextUtils.isEmpty(strDecode)) {
            HashMap mapB2 = b(strDecode);
            HashMap map2 = new HashMap(mapB2.size());
            for (Map.Entry entry : mapB2.entrySet()) {
                map2.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
            map = map2;
        }
        return new K7(strDecode, map, str);
    }
}
