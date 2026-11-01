package com.bytedance.sdk.openadsdk.core.cf.fkw.ouw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.ugeno.yu.le;
import com.bytedance.sdk.openadsdk.core.cf.vt.ouw.vt;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw extends com.bytedance.adsdk.ugeno.yu.vt.ouw {
    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void vt() {
    }

    @Override // com.bytedance.adsdk.ugeno.yu.vt.ouw
    public final void ouw() {
        lh lhVarVt;
        Map<String, String> map = this.f11057le;
        if (map == null || map.isEmpty()) {
            return;
        }
        String str = this.f11057le.get("id");
        if (TextUtils.isEmpty(str) || (lhVarVt = lh.vt(this.f11058lh)) == null) {
            return;
        }
        lh lhVarFkw = lhVarVt.fkw(str);
        if (lhVarFkw instanceof com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw) {
            com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw ouwVar = (com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw) lhVarFkw;
            T t10 = ouwVar.fkw;
            if (t10 != 0) {
                ((vt) t10).ouw();
            }
            ouwVar.ouw(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.cf.fkw.ouw.ouw.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ouw.this.lh();
                }
            });
        }
    }

    public ouw(lh lhVar, String str, le.ouw ouwVar) {
        super(lhVar, str, ouwVar);
    }
}
