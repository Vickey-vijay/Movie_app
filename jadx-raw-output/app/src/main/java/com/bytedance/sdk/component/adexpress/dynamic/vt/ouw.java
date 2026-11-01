package com.bytedance.sdk.component.adexpress.dynamic.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.yu.le;
import com.bytedance.sdk.component.adexpress.dynamic.yu.ra;

/* JADX INFO: loaded from: classes6.dex */
public final class ouw {
    public static int ouw(ra raVar) {
        if (raVar == null) {
            return 0;
        }
        le leVar = raVar.yu;
        String str = leVar.jae;
        String str2 = leVar.ksc;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !str2.equals("creative")) {
            return 0;
        }
        if (str.equals("shake")) {
            return 2;
        }
        if (str.equals("twist")) {
            return 3;
        }
        return str.equals("slide") ? 1 : 0;
    }
}
