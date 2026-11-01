package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class vm {
    public static boolean ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean vt(Context context) {
        if (context == null) {
            return false;
        }
        int iOuw = ksc.ouw(context, 60000L);
        char c10 = 5;
        if (iOuw == 2) {
            c10 = 2;
        } else if (iOuw == 3) {
            c10 = 3;
        } else if (iOuw == 4) {
            c10 = 1;
        } else if (iOuw == 5) {
            c10 = 4;
        } else if (iOuw != 6) {
            c10 = 0;
        }
        return c10 != 0;
    }

    public static boolean ouw(Context context) {
        return ksc.ouw(context, 60000L) == 4;
    }
}
