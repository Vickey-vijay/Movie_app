package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void bly() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean jqy() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final boolean vpp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void cd() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (vpp.fkw(this.vt.vt)) {
            finish();
            return;
        }
        tlj tljVar = this.vt.jae;
        if (tljVar == null || (yuVar = tljVar.ouw) == null) {
            return;
        }
        yuVar.setTime("0", 0, 0, false);
        if (this.vt.jae.yu()) {
            this.vt.uoy.ouw("0", "X");
            this.vt.uoy.fkw(true);
            this.vt.uoy.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final FrameLayout od() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12012lh;
        return (vtVar == null || !(vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.pno) || this.vt.f12376kn) ? this.vt.jae.ouw() : ((com.bytedance.sdk.openadsdk.component.reward.vt.pno) vtVar).ex();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final void ouw(long j10, long j11) {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        int i10 = (int) (j10 / 1000);
        tlj tljVar = this.vt.jae;
        if (tljVar != null && (yuVar = tljVar.ouw) != null) {
            yuVar.setTime(String.valueOf(this.f12011le), i10, 0, false);
            this.vt.jae.ouw.ouw(j10, j11);
        }
        tlj tljVar2 = this.vt.jae;
        if ((tljVar2 == null || !tljVar2.yu()) && !this.vt.vt.lso()) {
            return;
        }
        vt(i10);
        if (this.f12011le >= 0) {
            this.vt.uoy.yu(true);
            this.vt.uoy.ouw(String.valueOf(this.f12011le), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public final Map<String, Object> uq() {
        return this.vt.lh();
    }
}
