package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.osn;
import com.bytedance.sdk.openadsdk.yu.tlj;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class TTAdActivity extends TTBaseActivity {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f11995lh;
    public long ouw;
    private vt vt;
    private int yu = -1;
    private final AtomicBoolean fkw = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar;
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar;
        super.onCreate(bundle);
        qbp.ouw("BVA", "onCreate: isEnableNewArch = " + this.f11995lh + ",listenerKey=" + this.f12008jg);
        vpp vppVarOuw = com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.mwh.yu.vt) null);
        boolean z10 = false;
        if (bundle != null) {
            this.f12008jg = bundle.getString("single_process_listener_key");
            this.f11995lh = bundle.getBoolean("enable_new_arch", false);
            tlj.ouw(vppVarOuw, "activity_recreate", vppVarOuw != null ? vppVarOuw.vt() : null, "activity_recreate", null);
        } else {
            this.f12008jg = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
                z10 = true;
            }
            this.f11995lh = z10;
        }
        String str = this.f12008jg;
        if (this.f11995lh) {
            ouwVar = TextUtils.isEmpty(str) ? null : (com.bytedance.sdk.openadsdk.ouw.fkw.ouw) od.ouw().ouw(str, com.bytedance.sdk.openadsdk.ouw.fkw.ouw.class);
        } else {
            ouwVar = od.ouw().vt;
        }
        String str2 = this.f12008jg;
        if (this.f11995lh) {
            vtVar = TextUtils.isEmpty(str2) ? null : (com.bytedance.sdk.openadsdk.ouw.lh.vt) od.ouw().ouw(str2, com.bytedance.sdk.openadsdk.ouw.lh.vt.class);
        } else {
            vtVar = od.ouw().f12974lh;
        }
        this.ouw = SystemClock.elapsedRealtime();
        if (vppVarOuw == null) {
            finish();
            return;
        }
        vt vtVar2 = new vt(this, vppVarOuw, this.f11995lh);
        this.vt = vtVar2;
        vtVar2.f12121jg = bundle;
        vtVar2.mwh = 1;
        vtVar2.f12125ra = ouwVar;
        vtVar2.pno = vtVar;
        if (!vtVar2.qbp && bundle != null) {
            if (ouwVar == null) {
                vtVar2.f12125ra = vt.ouw;
                vt.ouw = null;
            }
            if (vtVar == null) {
                vtVar2.pno = vt.vt;
                vt.vt = null;
            }
        }
        vtVar2.tlj.ouw(bundle);
        com.bytedance.sdk.openadsdk.utils.vt.ouw(vppVarOuw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    private void lh() {
        vt vtVar = this.vt;
        if (vtVar == null) {
            super.onBackPressed();
        } else {
            vtVar.tlj.bly();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        ko.vt("TTAdActivity", "onSaveInstanceState: isEnableNewArch = " + this.f11995lh + ",listenerKey=" + this.f12008jg);
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.f12008jg)) {
            bundle.putString("single_process_listener_key", this.f12008jg);
        }
        bundle.putBoolean("enable_new_arch", this.f11995lh);
        vt vtVar = this.vt;
        if (vtVar != null) {
            int iOuw = od.ouw().ouw(vtVar.f12124lh);
            this.yu = iOuw;
            vt vtVar2 = this.vt;
            Intent intent = getIntent();
            vpp vppVar = vtVar2.f12124lh;
            if (vppVar != null) {
                try {
                    bundle.putInt("meta_index", iOuw);
                    ko.vt("BVA", "onSaveInstanceStateForOneMoreAd metaIndex =" + iOuw + ",materialMeta =" + vppVar);
                    if (intent != null) {
                        bundle.putString("multi_process_listener_key", intent.getStringExtra("multi_process_listener_key"));
                        bundle.putBoolean("video_is_cached", intent.getBooleanExtra("video_is_cached", false));
                    }
                } catch (Throwable th2) {
                    qbp.ouw("TTAD.RFDM", "onSaveInstanceState: ", th2);
                }
            }
            if (vtVar2.qbp) {
                return;
            }
            com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = vtVar2.f12125ra;
            if (ouwVar != null) {
                vt.ouw = ouwVar;
                return;
            }
            com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar3 = vtVar2.pno;
            if (vtVar3 != null) {
                vt.vt = vtVar3;
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.tlj.vt(this);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        lh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        vpp vppVar;
        super.onDestroy();
        if (this.fkw.compareAndSet(false, true) && this.vt != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.ouw;
            if (jElapsedRealtime > 0 && (vppVar = this.vt.f12124lh) != null) {
                vppVar.vby = jElapsedRealtime;
            }
            vt vtVar = this.vt;
            vtVar.mwh = 6;
            vtVar.tlj.ouw(this);
            vtVar.f12128vm.ouw(this);
            vtVar.ryl = null;
        }
        if (this.f11995lh) {
            if (!TextUtils.isEmpty(this.f12008jg)) {
                od.ouw().ouw(this.f12008jg, isFinishing(), isChangingConfigurations());
            }
        } else {
            od.ouw().vt = null;
            od.ouw().f12974lh = null;
        }
        com.bytedance.sdk.openadsdk.utils.ko.ouw();
        osn.ouw().ouw(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.mwh = 4;
            vtVar.tlj.lh();
            com.bytedance.sdk.openadsdk.component.reward.tlj tljVar = vtVar.f12123le;
            if (tljVar != null) {
                tljVar.ouw();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.mwh = 3;
            vtVar.tlj.vt();
            com.bytedance.sdk.openadsdk.component.reward.tlj tljVar = vtVar.f12123le;
            if (tljVar != null) {
                tljVar.vt();
            }
            vtVar.f12128vm.ouw(this, vtVar.f12124lh.jqy(), vtVar.f12124lh.ex(), vtVar.zin);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.yu >= 0) {
            od.ouw().vt(this.yu);
            this.yu = -1;
        }
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.mwh = 2;
            vtVar.tlj.le();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.mwh = 5;
            vtVar.tlj.ra();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.tlj.ouw(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        lh();
    }
}
