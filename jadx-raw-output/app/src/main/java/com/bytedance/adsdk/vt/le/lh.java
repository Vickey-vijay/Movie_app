package com.bytedance.adsdk.vt.le;

import android.util.Log;
import com.bytedance.adsdk.vt.ryl;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class lh implements ryl {
    private static final Set<String> ouw = new HashSet();

    @Override // com.bytedance.adsdk.vt.ryl
    public final void ouw(String str, Throwable th2) {
        Set<String> set = ouw;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    @Override // com.bytedance.adsdk.vt.ryl
    public final void vt(String str) {
        ouw(str, null);
    }

    @Override // com.bytedance.adsdk.vt.ryl
    public final void vt(String str, Throwable th2) {
        if (com.bytedance.adsdk.vt.fkw.ouw) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // com.bytedance.adsdk.vt.ryl
    public final void ouw(String str) {
        if (com.bytedance.adsdk.vt.fkw.ouw) {
            Log.d("LOTTIE", str, null);
        }
    }
}
