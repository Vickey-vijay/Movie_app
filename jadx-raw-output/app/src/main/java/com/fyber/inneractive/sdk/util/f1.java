package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.ironsource.C3426d4;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f1 {
    public static String a(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder(str);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            sb2.append(z10 ? "?" : C3426d4.j.f28584c);
            sb2.append((String) entry.getKey());
            sb2.append("=");
            sb2.append(Uri.encode((String) entry.getValue()));
            z10 = false;
        }
        return sb2.toString();
    }
}
