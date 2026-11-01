package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.ouw.cf;
import com.bytedance.sdk.openadsdk.component.reward.ryl;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cd;
import com.bytedance.sdk.openadsdk.utils.ko;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.tc;
import com.bytedance.sdk.openadsdk.yu.tlj;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.d;
import com.safedk.android.utils.g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements jae.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.vt {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12009cf;
    public IListenerManager fkw;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public long f12010ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f12011le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    @Nullable
    public com.bytedance.sdk.openadsdk.component.reward.vt.vt f12012lh;
    public final String ouw;
    public cd pno;
    private final cf.vt qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f12013ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f12014rn;
    public boolean ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private int f12015th;
    public boolean tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private boolean f12016vm;
    private final AtomicBoolean vpp;
    public com.bytedance.sdk.openadsdk.component.reward.ouw.ouw vt;
    public final jae yu;
    private final AtomicBoolean zih;
    private int zin;

    public static class ouw implements Runnable {
        public boolean ouw;
        public AdSlot vt;

        @Override // java.lang.Runnable
        public final void run() {
            if (this.ouw) {
                ryl.ouw(zih.ouw()).ouw(this.vt);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.fkw.ouw(zih.ouw()).ouw(this.vt);
            }
        }

        public ouw(boolean z10, AdSlot adSlot) {
            this.ouw = z10;
            this.vt = adSlot;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void bs() {
        this.tlj = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    public void jae() {
    }

    public void jg() {
    }

    public boolean jqy() {
        return false;
    }

    public void ksc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void le() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void lh(boolean z10) {
    }

    public abstract void mwh();

    public abstract FrameLayout od();

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        boolean z10;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        super.onCreate(bundle);
        if (bundle != null) {
            z10 = bundle.getBoolean("enable_new_arch", false);
        } else {
            z10 = getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        }
        this.f12009cf = z10;
        this.f12010ko = SystemClock.elapsedRealtime();
        qbp.ouw("BVA", "onCreate enableIvRvNewArch->" + this.f12009cf + ",activity ->");
        zih.vt(getApplicationContext());
        if (!jg.fkw()) {
            finish();
            return;
        }
        vpp vppVarOuw = com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(getIntent(), bundle, this);
        if (vppVarOuw == null) {
            finish();
            return;
        }
        this.f12014rn = com.bytedance.sdk.openadsdk.vpp.ouw.bly();
        qbp.ouw("BVA", "onCreate enableIvRvTopBarNewArch->" + this.f12014rn);
        com.bytedance.sdk.openadsdk.utils.vt.ouw(vppVarOuw);
        this.ryl = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("adapt_decor_size", 0) == 1;
        qbp.ouw("BVA", "activity onCreate isAdaptDecorSize =" + this.ryl);
        vppVarOuw.f12873rn = String.valueOf(hashCode());
        this.bly = vppVarOuw.jqy();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(this, this.yu, vppVarOuw, this, 0, this.ryl);
        this.vt = ouwVar2;
        com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(ouwVar2, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            ouw(intent);
            vppVarOuw.ouw = intent.getLongExtra("start_show_time", 0L);
        }
        if (bundle != null && this.vt.xdk) {
            pno();
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVarOuw = com.bytedance.sdk.openadsdk.component.reward.vt.le.ouw(this.vt);
        this.f12012lh = vtVarOuw;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.vt;
        ouwVar3.coz = vtVarOuw;
        ko.ouw(ouwVar3);
        com.bytedance.sdk.component.utils.ko.vt("TTAD.BVA", "init: mAdType = " + this.f12012lh);
        if (bundle != null) {
            com.bytedance.sdk.component.utils.ko.vt("TTAD.BVA", "onCreate: rebuild back");
            if (vppVarOuw.elx) {
                this.vpp.set(true);
            }
            if (vppVarOuw.bu && (ouwVar = this.vt) != null) {
                ouwVar.mwh.set(true);
            }
            tlj.ouw(vppVarOuw, "activity_recreate", vppVarOuw.vt(), "activity_recreate", null);
        }
        try {
            lh();
            this.f12012lh.jqy();
            this.f12011le = (int) this.vt.ex.zin();
            if (this.f12014rn) {
                com.bytedance.sdk.openadsdk.common.ko.ouw ouwVar4 = new com.bytedance.sdk.openadsdk.common.ko.ouw(this.vt, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TTBaseVideoActivity.this.finish();
                    }
                }, new com.bytedance.sdk.openadsdk.common.ouw.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.2
                    @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                    public final void ouw() {
                        TTBaseVideoActivity.this.ouw(true, 4);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                    public final void vt() {
                        TTBaseVideoActivity.this.finish();
                    }
                });
                ouwVar4.fkw = !zin();
                ouwVar4.f12212le = yu();
                com.bytedance.sdk.openadsdk.common.ouw.ouw(ouwVar4.ouw());
            } else {
                qbp();
            }
            bly();
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.vt.vt.sd();
            if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
                return;
            }
            yuVar.ouw();
        } catch (Throwable th2) {
            qbp.ouw("TTAD.BVA", "onCreate: ", th2);
            tlj.ouw(vppVarOuw, "show_ad_fail", this.ouw, "init_view_crash");
            finish();
        }
    }

    public abstract void ouw(long j10, long j11);

    public void ouw(@NonNull Intent intent) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    public abstract void pno();

    public abstract void qbp();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ra() {
    }

    public void tc() {
    }

    public Map<String, Object> uq() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void vm() {
    }

    public abstract boolean vpp();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void wp() {
    }

    public abstract com.bytedance.sdk.openadsdk.common.zih yu();

    public abstract boolean zin();

    private void pd() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        if (this.vt == null || (vtVar = this.f12012lh) == null) {
            super.onBackPressed();
        } else {
            vtVar.qbp();
        }
    }

    public void bly() {
        if (od.lh(this.vt.vt)) {
            ouw(false, false, com.bytedance.sdk.openadsdk.yu.vt.C0161vt.f13589lh);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12012lh;
        if (vtVar != null) {
            vtVar.ouw(this.vt.ey.le());
            this.f12012lh.vpp();
        }
    }

    public void cd() {
        if (!this.vt.vt.ryl()) {
            if (!vpp.fkw(this.vt.vt)) {
                this.vt.ex.ouw("skip", true);
            }
            finish();
        } else if (!this.vt.vt.lh()) {
            this.vt.uoy.vt();
        } else if (this.vt.jae.fkw() == 1) {
            this.vt.uoy.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void cf() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12012lh;
        if (vtVar == null) {
            return;
        }
        vtVar.ryl();
    }

    public final void ex() {
        vpp vppVar;
        com.bytedance.sdk.openadsdk.core.model.cd cdVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null || (vppVar = ouwVar.vt) == null || (cdVar = vppVar.f12879tj) == null) {
            return;
        }
        int i10 = cdVar.vt;
        if (i10 == 1 || i10 == 2) {
            cd cdVar2 = new cd(ouwVar, vppVar);
            this.pno = cdVar2;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = this.vt.ex;
            if (koVar != null) {
                koVar.qbp = cdVar2;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ko() {
        this.vt.ex.vpp();
    }

    public void lh() {
        setContentView(this.vt.rrs);
        this.vt.rrs.ouw(this.f12012lh);
        this.f12012lh.ouw(this, this.yu);
        this.f12012lh.cf();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (ouwVar.mwh.get()) {
            this.vt.vt.bu = true;
        }
        if (this.vpp.get()) {
            this.vt.vt.elx = true;
        }
        if (!TextUtils.isEmpty(this.f12008jg)) {
            bundle.putString("single_process_listener_key", this.f12008jg);
        }
        bundle.putBoolean("enable_new_arch", this.f12009cf);
        vpp vppVar = this.vt.vt;
        int iOuw = vppVar != null ? com.bytedance.sdk.openadsdk.core.od.ouw().ouw(vppVar) : -1;
        this.zin = iOuw;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
        try {
            com.bytedance.sdk.component.utils.ko.vt("BVA", "onSaveInstanceState metaIndex =".concat(String.valueOf(iOuw)));
            bundle.putInt("meta_index", iOuw);
            bundle.putString("multi_process_listener_key", ouwVar2.f12388ub);
            bundle.putBoolean("video_is_cached", ouwVar2.ex.yu);
            bundle.putLong("video_current", ouwVar2.ex.fkw());
            bundle.putBoolean("is_mute", ouwVar2.f12373cj);
            bundle.putBoolean("has_show_skip_btn", ouwVar2.xdk);
        } catch (Throwable th2) {
            qbp.ouw("TTAD.RFDM", "onSaveInstanceState: ", th2);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void ouw(Bundle bundle) {
        if (!this.f12009cf || com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            return;
        }
        if (bundle != null) {
            this.f12008jg = bundle.getString("single_process_listener_key");
        } else if (getIntent() != null) {
            this.f12008jg = getIntent().getStringExtra("single_process_listener_key");
        } else {
            this.f12008jg = "";
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final List<vpp> pv() {
        return this.vt.vt.f12885vm.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final View rn() {
        return this.vt.ex.jqy();
    }

    public final void th() {
        this.yu.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void tlj() {
        if (this.vpp.compareAndSet(false, true)) {
            qbp.ouw("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            mwh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void zih() {
        if (!this.vt.f12375jg.getAndSet(true) || od.lh(this.vt.vt)) {
            this.vt.f12371cd.ouw();
        }
    }

    public TTBaseVideoActivity() {
        String str;
        if (zin()) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        this.ouw = str;
        this.zih = new AtomicBoolean(false);
        this.yu = new jae(Looper.getMainLooper(), this);
        this.f12016vm = false;
        this.f12015th = 0;
        this.bly = 1;
        this.qbp = new cf.vt();
        this.tlj = false;
        this.zin = -1;
        this.vpp = new AtomicBoolean(false);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.vt == null) {
            return;
        }
        if (tc.lh()) {
            osn.vt((Activity) this);
        }
        if (od.fkw(this.vt.vt) && !this.vt.ksc.lh(com.bytedance.sdk.openadsdk.component.reward.ouw.pno.f12393lh)) {
            ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return;
        }
        ouwVar.f12381od.ouw();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        pd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        qbp.ouw("BVA", "onDestroy ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar != null && this.f12012lh != null) {
            if (ouwVar.myk > 0 && ouwVar.mwh.get()) {
                String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.vt.myk);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(strValueOf, ouwVar2.vt, this.ouw, ouwVar2.ex.zin);
                this.vt.myk = 0L;
            }
            TTAdDislikeToast tTAdDislikeToast = this.vt.f12382pd.f12362lh;
            if (tTAdDislikeToast != null) {
                tTAdDislikeToast.onDestroy();
            }
            this.yu.removeCallbacksAndMessages(null);
            this.f12012lh.th();
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.vt.vt);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(this.vt.vt);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.vt;
            AdSlot adSlot = ouwVar3.vt.yiz;
            if (!ouwVar3.ex.yu && adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm()) && !this.vt.vt.f12887zn) {
                jg.vt().post(new ouw(zin(), adSlot));
            }
            ko.ouw();
            cd cdVar = this.pno;
            if (cdVar != null) {
                cdVar.vt();
                this.pno = null;
            }
            this.qbp.ouw(this);
            com.bytedance.sdk.openadsdk.core.osn.ouw().ouw(String.valueOf(hashCode()));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        qbp.ouw("BVA", "onPause ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12012lh;
        if (vtVar == null) {
            return;
        }
        vtVar.zih();
    }

    @Override // android.app.Activity
    public void onRestart() {
        vpp vppVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar != null && (vppVar = ouwVar.vt) != null) {
            if (this.mwh && !vppVar.f12847cp && !TextUtils.isEmpty(vpp.ouw(this, vppVar))) {
                finish();
            }
            if (vppVar.f12847cp) {
                vppVar.f12847cp = false;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        boolean z10;
        super.onResume();
        qbp.ouw("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.vt != null && (vtVar = this.f12012lh) != null) {
            vtVar.rn();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
            ouwVar.pv = true;
            this.qbp.ouw(this, ouwVar.ucs, ouwVar.f12389vh, this.ryl);
            boolean z11 = false;
            if (this.vt.tlj.get() && this.vt.f12383ra) {
                z10 = false;
            } else if (!(this instanceof TTFullScreenExpressVideoActivity) && !(this instanceof TTRewardExpressVideoActivity)) {
                z10 = true;
            } else {
                z10 = this.vt.tlj.get();
            }
            if (z10) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.vt;
                ouwVar2.uoy.ouw(ouwVar2.vt.ksc());
            }
            this.vt.ey.ko();
            this.vt.bs.tlj();
            this.vt.ksc.lh();
            if (this.f12012lh.vt()) {
                this.vt.ex.ouw(this.f12012lh);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = this.vt.ex;
                if (this.f12015th != 0) {
                    z11 = true;
                }
                koVar.ouw(this, z11);
            }
            this.f12015th++;
            if (jqy() && !this.f12016vm) {
                this.f12016vm = true;
                getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = tTBaseVideoActivity.vt;
                        ouwVar3.uq.ouw(ouwVar3.f12381od.ouw(tTBaseVideoActivity.bly));
                        TTBaseVideoActivity.this.jg();
                    }
                });
            }
            com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = this.vt.jae;
            if (tljVar != null) {
                tljVar.lh();
            }
            this.vt.f12381od.ouw(this.yu);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        qbp.ouw("BVA", "onStart mMetaIndex =" + this.zin + " this =" + this);
        if (this.zin >= 0) {
            com.bytedance.sdk.openadsdk.core.od.ouw().vt(this.zin);
            this.zin = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar == null) {
            return;
        }
        ouwVar.bs.rn();
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.vt.vt);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        qbp.ouw("BVA", "onStop ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12012lh;
        if (vtVar == null) {
            return;
        }
        vtVar.vm();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.tlj tljVar;
        super.onWindowFocusChanged(z10);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar != null && (tljVar = ouwVar.f12371cd) != null) {
            tljVar.vt(z10);
            this.vt.f12371cd.lh(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ryl() {
        cf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        pd();
    }

    public final void ouw(boolean z10, int i10) {
        ouw(z10, false, i10);
    }

    public final void ouw(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12012lh;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(z10, z11, false, i10);
    }

    public final void ouw(boolean z10, boolean z11) {
        if (!this.f12009cf || TextUtils.isEmpty(this.f12008jg)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.od.ouw().ouw(this.f12008jg, z10, z11);
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f12012lh;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(message);
    }

    public final IListenerManager ouw(int i10) {
        if (this.fkw == null) {
            this.fkw = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(i10));
        }
        return this.fkw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final boolean ouw(long j10, boolean z10) {
        com.bytedance.sdk.openadsdk.yu.ra raVar;
        com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar;
        th thVar;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (this.vt == null) {
            return false;
        }
        this.zih.set(false);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.vt;
        if (ouwVar.vt.lh()) {
            com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar.jae;
            if (tljVar != null && (yuVar = tljVar.ouw) != null) {
                raVar = yuVar.getAdShowTime();
            } else {
                raVar = new com.bytedance.sdk.openadsdk.yu.ra();
                raVar.ouw(System.currentTimeMillis(), 1.0f);
            }
        } else {
            raVar = new com.bytedance.sdk.openadsdk.yu.ra();
            raVar.ouw(System.currentTimeMillis(), 1.0f);
        }
        FrameLayout frameLayoutOd = od();
        if (frameLayoutOd == null) {
            return false;
        }
        this.vt.ex.ouw(frameLayoutOd, raVar);
        Map<String, Object> mapUq = uq();
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar2 = new com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity.4
            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
            public final void ouw(long j11, int i10) {
                com.bytedance.sdk.openadsdk.utils.jg jgVar;
                com.bytedance.sdk.openadsdk.utils.jg jgVar2;
                qbp.ouw("TTAD.BVA", "onComplete() called with: totalPlayTime = [" + j11 + "], percent = [" + i10 + "], mVideoHasCompleted=" + TTBaseVideoActivity.this.zih.get());
                if (TTBaseVideoActivity.this.zih.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.zih.set(true);
                TTBaseVideoActivity.this.yu.removeMessages(d.f44769a);
                TTBaseVideoActivity.this.th();
                TTBaseVideoActivity.this.tc();
                TTBaseVideoActivity.this.vt.ex.ouw(j11, j11);
                if (TTBaseVideoActivity.this.jqy()) {
                    TTBaseVideoActivity.this.vt.jae.fkw = true;
                } else {
                    TTBaseVideoActivity.this.vt.f12387th.set(true);
                }
                TTBaseVideoActivity.this.jae();
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = TTBaseVideoActivity.this.vt;
                vpp vppVar = ouwVar3.vt;
                if (vppVar.fvf == 36 && ouwVar3.f12379lh) {
                    ouwVar3.f12386tc.f12423lh.ouw(vppVar);
                    ko.vt();
                }
                if (!TTBaseVideoActivity.this.jqy() && TTBaseVideoActivity.this.vt.vt.ub()) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = TTBaseVideoActivity.this.vt;
                    ouwVar4.vt.ycd = 1;
                    ouwVar4.ey.zih();
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = TTBaseVideoActivity.this.vt;
                vpp vppVar2 = ouwVar5.vt;
                if (vppVar2.fvf == 21 && !vppVar2.mq) {
                    vppVar2.f12842an = true;
                    ouwVar5.ey.zih();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.tlj) {
                    com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2 = tTBaseVideoActivity.vt.jae.ouw;
                    if (yuVar2 != null ? yuVar2.fvf instanceof com.bytedance.sdk.component.adexpress.fkw.ouw : false) {
                        return;
                    }
                }
                if (!tTBaseVideoActivity.jqy()) {
                    if (th.yu(TTBaseVideoActivity.this.vt.vt) || th.vt(TTBaseVideoActivity.this.vt.vt) || th.ra(TTBaseVideoActivity.this.vt.vt)) {
                        TTBaseVideoActivity.this.ouw(false, 5);
                        if (!th.vt(TTBaseVideoActivity.this.vt.vt) || (jgVar2 = TTBaseVideoActivity.this.vt.f12385sd) == null) {
                            return;
                        }
                        jgVar2.ouw(0L);
                        return;
                    }
                    if (th.ouw(TTBaseVideoActivity.this.vt.vt) && !TTBaseVideoActivity.this.vt.f12384rn.get()) {
                        TTBaseVideoActivity.this.vt.ouw(true);
                        TTBaseVideoActivity.this.vt.uoy.fkw(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar6 = tTBaseVideoActivity2.vt;
                if (!ouwVar6.f12379lh) {
                    tTBaseVideoActivity2.cd();
                    return;
                }
                if (ouwVar6.vt.ryl()) {
                    if (!TTBaseVideoActivity.this.jqy()) {
                        TTBaseVideoActivity.this.vt.uoy.vt();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.vt.jae.fkw() == 1) {
                            TTBaseVideoActivity.this.vt.uoy.vt();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.ouw(false, 5);
                if (!TTBaseVideoActivity.this.jqy() && th.vt(TTBaseVideoActivity.this.vt.vt) && (jgVar = TTBaseVideoActivity.this.vt.f12385sd) != null) {
                    jgVar.ouw(0L);
                }
                if (vpp.fkw(TTBaseVideoActivity.this.vt.vt)) {
                    return;
                }
                TTBaseVideoActivity.this.vt.ex.ouw("skip", true);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
            public final void vt(long j11, int i10) {
                th thVar2;
                TTBaseVideoActivity.this.yu.removeMessages(d.f44769a);
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = TTBaseVideoActivity.this.vt.ey;
                if (rylVar2 != null && (thVar2 = rylVar2.f12468rn) != null) {
                    thVar2.le();
                }
                if (TTBaseVideoActivity.this.vt.ex.ouw()) {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    Message message = new Message();
                    message.what = 400;
                    if (tTBaseVideoActivity.zin()) {
                        tTBaseVideoActivity.jvy();
                    }
                    tTBaseVideoActivity.yu.sendMessageDelayed(message, 2000L);
                    return;
                }
                TTBaseVideoActivity.this.vt.ex.tlj();
                TTBaseVideoActivity.this.tc();
                if (TTBaseVideoActivity.this.vt.vt.lh()) {
                    TTBaseVideoActivity.this.vt.jae.yu = true;
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity2.vt.f12379lh) {
                    tTBaseVideoActivity2.finish();
                    return;
                }
                tTBaseVideoActivity2.ouw(false, true, 3);
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = TTBaseVideoActivity.this.vt.ex;
                koVar.ouw(1 ^ (koVar.qbp() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
            public final void ouw() {
                TTBaseVideoActivity.this.yu.removeMessages(d.f44769a);
                TTBaseVideoActivity.this.th();
                TTBaseVideoActivity.this.tc();
                com.bytedance.sdk.component.utils.ko.ouw("TTAD.BVA", "fullscreen_interstitial_ad", "onTimeOut、、、、、、、、");
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.vt.f12379lh) {
                    tTBaseVideoActivity.ouw(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = TTBaseVideoActivity.this.vt.ex;
                koVar.ouw(!koVar.qbp() ? 1 : 0, !TTBaseVideoActivity.this.vt.ex.qbp() ? 1 : 0);
                TTBaseVideoActivity.this.vt.ex.tlj();
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
            public final void ouw(long j11, long j12) {
                int i10;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = TTBaseVideoActivity.this.vt;
                if (!ouwVar3.pv && ouwVar3.ex.ouw()) {
                    TTBaseVideoActivity.this.vt.ex.ryl();
                }
                if (TTBaseVideoActivity.this.vt.tlj.get()) {
                    return;
                }
                TTBaseVideoActivity.this.yu.removeMessages(d.f44769a);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (j11 != tTBaseVideoActivity.vt.ex.pno) {
                    tTBaseVideoActivity.th();
                }
                if (!TTBaseVideoActivity.this.jqy() || TTBaseVideoActivity.this.vt.ex.ouw()) {
                    TTBaseVideoActivity.this.vt.ex.ouw(j11, j12);
                    TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                    long j13 = j11 / 1000;
                    tTBaseVideoActivity2.f12011le = (int) (tTBaseVideoActivity2.vt.ex.zin() - j13);
                    int i11 = (int) j13;
                    if ((TTBaseVideoActivity.this.vt.qbp.get() || TTBaseVideoActivity.this.vt.f12372cf.get()) && TTBaseVideoActivity.this.vt.ex.ouw()) {
                        TTBaseVideoActivity.this.vt.ex.ryl();
                    }
                    if (TTBaseVideoActivity.this.zin()) {
                        TTBaseVideoActivity.this.vt.ey.fkw(i11);
                    }
                    if (TTBaseVideoActivity.this.vpp()) {
                        TTBaseVideoActivity tTBaseVideoActivity3 = TTBaseVideoActivity.this;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ko koVar = tTBaseVideoActivity3.vt.ex;
                        if (!koVar.f12360th ? !(koVar.zih && ((i10 = koVar.f12361vm) == 2 || i10 == 1)) : !(koVar.zih && koVar.f12361vm == 1)) {
                            com.bytedance.sdk.component.utils.ko.vt("TTAD.BVA", "onProgressUpdate() called with: current = [" + j11 + "], duration = [" + j12 + C3426d4.j.f28588e);
                            cd cdVar = TTBaseVideoActivity.this.pno;
                            if (cdVar != null) {
                                int iCeil = (int) Math.ceil(j11 / 1000.0d);
                                if (cdVar.f13383lh && !cdVar.yu) {
                                    cdVar.fkw = iCeil;
                                    cdVar.ouw();
                                    return;
                                } else {
                                    if (cdVar.vt || cdVar.yu) {
                                        return;
                                    }
                                    cdVar.fkw = iCeil;
                                    cdVar.vt = true;
                                    cdVar.ouw.sendEmptyMessage(1024);
                                    cdVar.f13383lh = false;
                                    return;
                                }
                            }
                            return;
                        }
                        cd cdVar2 = tTBaseVideoActivity3.pno;
                        if (cdVar2 == null || !cdVar2.vt) {
                            tTBaseVideoActivity3.ouw(j11, j12);
                            return;
                        }
                        return;
                    }
                    TTBaseVideoActivity.this.ouw(j11, j12);
                }
            }
        };
        this.vt.ex.ouw(ouwVar2);
        if (!this.vt.vt.lh() && (rylVar = this.vt.ey) != null && (thVar = rylVar.f12468rn) != null) {
            thVar.uoy = ouwVar2;
        }
        boolean zOuw = this.vt.ex.ouw(j10, z10, mapUq, this.f12012lh);
        ksc();
        return zOuw;
    }
}
