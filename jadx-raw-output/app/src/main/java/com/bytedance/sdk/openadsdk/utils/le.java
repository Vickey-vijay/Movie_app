package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class le {
    public static String ouw(String str) {
        if (!com.bytedance.sdk.component.utils.ko.yu() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.bly blyVar = new com.bytedance.sdk.openadsdk.core.model.bly(com.bytedance.sdk.openadsdk.core.bly.ouw().ryl());
        StringBuilder sb2 = new StringBuilder(str);
        Iterator<String> it = blyVar.vt.iterator();
        while (it.hasNext()) {
            if (sb2.toString().contains(it.next())) {
                if (sb2.toString().contains("?")) {
                    sb2.append(C3426d4.j.f28584c);
                    sb2.append(blyVar.ouw);
                } else {
                    sb2.append("?");
                    sb2.append(blyVar.ouw);
                }
            }
        }
        return sb2.toString();
    }
}
