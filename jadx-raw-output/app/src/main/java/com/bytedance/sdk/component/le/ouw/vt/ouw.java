package com.bytedance.sdk.component.le.ouw.vt;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.ouw.fkw;
import com.bytedance.sdk.component.le.ouw.pno;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw {
    public static long ouw(int i10, Context context) {
        long jVt = vt(i10, context);
        "ad limit by memory:".concat(String.valueOf(jVt));
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        return jVt;
    }

    private static long vt(int i10, Context context) {
        if (context == null) {
            return i10;
        }
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        long jMaxMemory = (runtime.maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) - (runtime.totalMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            return jFreeMemory <= 10 ? Math.min(i10, 10) : Math.min((jFreeMemory / 2) * 10, i10);
        }
        long j10 = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j10 <= 2) {
            return 1L;
        }
        return j10 <= 10 ? Math.min(i10, 10) : Math.min(j10 * 10, i10);
    }

    public static boolean fkw() {
        fkw fkwVar = pno.vt().f11815ra;
        if (fkwVar != null && !TextUtils.isEmpty(fkwVar.lh())) {
            return true;
        }
        return false;
    }

    public static boolean le() {
        fkw fkwVar = pno.vt().f11815ra;
        if (fkwVar != null && !TextUtils.isEmpty(fkwVar.le())) {
            return true;
        }
        return false;
    }

    public static boolean lh() {
        fkw fkwVar = pno.vt().f11815ra;
        if (fkwVar != null && !TextUtils.isEmpty(fkwVar.yu())) {
            return true;
        }
        return false;
    }

    public static boolean ouw() {
        fkw fkwVar = pno.vt().f11815ra;
        return (fkwVar == null || TextUtils.isEmpty(fkwVar.ouw())) ? false : true;
    }

    public static boolean yu() {
        fkw fkwVar = pno.vt().f11815ra;
        if (fkwVar != null && !TextUtils.isEmpty(fkwVar.fkw())) {
            return true;
        }
        return false;
    }

    public static boolean vt() {
        fkw fkwVar = pno.vt().f11815ra;
        return (fkwVar == null || TextUtils.isEmpty(fkwVar.vt())) ? false : true;
    }
}
