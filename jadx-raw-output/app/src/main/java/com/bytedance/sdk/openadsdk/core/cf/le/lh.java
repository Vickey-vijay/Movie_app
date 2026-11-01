package com.bytedance.sdk.openadsdk.core.cf.le;

import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.yu.cf;
import com.bytedance.adsdk.ugeno.yu.mwh;

/* JADX INFO: loaded from: classes11.dex */
public final class lh implements mwh {
    @Override // com.bytedance.adsdk.ugeno.yu.mwh
    public final boolean ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, MotionEvent motionEvent, cf cfVar, com.bytedance.adsdk.ugeno.yu.yu.lh lhVar2) {
        boolean z10;
        int action = motionEvent.getAction();
        if (action == 1 || action == 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            T t10 = lhVar.fkw;
            if (x10 >= 0.0f && x10 < t10.getWidth() && y10 >= 0.0f && y10 < t10.getHeight()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && cfVar != null) {
                cfVar.ouw(lhVar2.f11068le, lhVar2.f11069lh.vt);
            }
        }
        return true;
    }
}
