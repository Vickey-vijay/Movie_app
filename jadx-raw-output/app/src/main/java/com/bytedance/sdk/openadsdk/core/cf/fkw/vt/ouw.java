package com.bytedance.sdk.openadsdk.core.cf.fkw.vt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.yu.cf;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ouw extends com.bytedance.adsdk.ugeno.yu.yu.lh {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f12599cf;

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        Map<String, String> map = this.fkw;
        if (map != null && map.size() > 0) {
            String str = this.fkw.get("id");
            this.f12599cf = this.fkw.get("state");
            if (TextUtils.isEmpty(str) || (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.vt)) == null) {
                return false;
            }
            com.bytedance.adsdk.ugeno.vt.lh lhVarFkw = lhVarVt.fkw(str);
            if (lhVarFkw instanceof com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw) {
                ((com.bytedance.sdk.openadsdk.core.cf.vt.ouw.ouw) lhVarFkw).ouw(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.core.cf.fkw.vt.ouw.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        ouw ouwVar;
                        cf cfVar;
                        super.onAnimationEnd(animator);
                        if (TextUtils.equals(ouw.this.f12599cf, "complete") && (cfVar = (ouwVar = ouw.this).ouw) != null) {
                            cfVar.ouw(ouwVar.f11068le, ouwVar.f11069lh.vt);
                        }
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        ouw ouwVar;
                        cf cfVar;
                        super.onAnimationStart(animator);
                        if (TextUtils.equals(ouw.this.f12599cf, "start") && (cfVar = (ouwVar = ouw.this).ouw) != null) {
                            cfVar.ouw(ouwVar.f11068le, ouwVar.f11069lh.vt);
                        }
                    }
                });
            }
        }
        return false;
    }

    public ouw(Context context) {
        super(context);
    }
}
