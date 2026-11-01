package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void bly() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean jqy() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean vpp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final FrameLayout od() {
        return this.vt.jae.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        int iNg = this.vt.vt.ng();
        boolean z10 = this.vt.jae.yu() && iNg >= 0;
        int i10 = (int) (j10 / 1000);
        vt(j10, j11);
        tlj tljVar = this.vt.jae;
        if (tljVar != null && (yuVar = tljVar.ouw) != null) {
            yuVar.setTime(String.valueOf(this.f12011le), i10, 0, false);
            this.vt.jae.ouw.ouw(j10, j11);
        }
        int i11 = this.f12011le;
        if (i11 > 0) {
            if (!z10) {
                this.vt.uoy.ouw(String.valueOf(i11), null);
                return;
            }
            if (i10 < iNg) {
                this.vt.uoy.ouw(String.valueOf(i11), null);
                return;
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
            int i12 = ouwVar.vt.fvf;
            if (i12 == 5 || i12 == 33) {
                ouwVar.uoy.ouw(String.valueOf(i11), null);
                return;
            }
            ouwVar.ouw(true);
            this.vt.uoy.ouw(String.valueOf(this.f12011le), TTAdDislikeToast.getSkipText());
            this.vt.uoy.fkw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final Map<String, Object> uq() {
        return this.vt.lh();
    }
}
