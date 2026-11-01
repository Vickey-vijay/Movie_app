package com.bytedance.adsdk.ugeno.yu.vt;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.le;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class yu extends ouw {
    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void vt() {
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVarCf;
        Map<String, String> map = this.f11057le;
        if (map == null || map.size() <= 0) {
            return;
        }
        String str = this.f11057le.get("name");
        if (TextUtils.isEmpty(str) || (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.f11058lh)) == null || (ouwVarCf = lhVarVt.pno(str).cf(str)) == null) {
            return;
        }
        ValueAnimator valueAnimator = ouwVarCf.ouw;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        ouwVarCf.f10911lh = new com.bytedance.adsdk.ugeno.ouw.vt() { // from class: com.bytedance.adsdk.ugeno.yu.vt.yu.1
            @Override // com.bytedance.adsdk.ugeno.ouw.vt
            public final void ouw() {
            }

            @Override // com.bytedance.adsdk.ugeno.ouw.vt
            public final void vt() {
                yu.this.lh();
            }
        };
    }

    public yu(com.bytedance.adsdk.ugeno.vt.lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }
}
