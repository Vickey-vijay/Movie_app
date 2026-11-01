package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.fak;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.ironsource.C3426d4;
import com.ironsource.Mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.PangleVideoBridge;
import com.safedk.android.utils.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements jae.ouw, com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw {

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.ouw.yu.vt f11996ko;
    public IListenerManager bly;
    private AdSlot bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private int f11997cd;
    private int ex;
    private com.bytedance.sdk.openadsdk.component.lh fvf;
    private boolean jqy;
    private com.bytedance.sdk.openadsdk.ouw.yu.vt ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public vm f11999le;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private int f12001od;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private boolean f12002pd;
    public vpp pno;
    private com.bytedance.sdk.openadsdk.yu.ra qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public TTAdDislikeToast f12003ra;
    public boolean ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private String f12005tc;
    private boolean uoy;
    private FrameLayout uq;
    private float vpp;
    private com.bytedance.sdk.openadsdk.component.le.vt zih;
    private float zin;
    public final AtomicBoolean ouw = new AtomicBoolean(false);
    public final jae vt = new jae(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final AtomicBoolean f12000lh = new AtomicBoolean(false);
    public final AtomicBoolean yu = new AtomicBoolean(false);

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.pno.ouw f12004rn = new com.bytedance.sdk.openadsdk.component.pno.ouw();
    public boolean fkw = false;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final AtomicBoolean f12007vm = new AtomicBoolean(false);

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private fak f12006th = fak.vt();
    private final AtomicBoolean jae = new AtomicBoolean(false);
    public long tlj = 0;
    private volatile boolean fak = false;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f11998cf = -1;
    private final com.bytedance.sdk.openadsdk.component.ouw osn = new com.bytedance.sdk.openadsdk.component.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
        public final void ouw() {
            ko.ouw("TTAppOpenAdActivity", "open_ad", "onTimeOut");
            TTAppOpenAdActivity.this.jg();
            TTAppOpenAdActivity.this.ryl();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
        public final void vt(long j10, int i10) {
            com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
            ko.ouw("TTAppOpenAdActivity", "open_ad", "onError() called with: totalPlayTime = [" + j10 + "], percent = [" + i10 + C3426d4.j.f28588e);
            if (TTAppOpenAdActivity.this.fvf != null && (lhVar = TTAppOpenAdActivity.this.fvf.f12291rn) != null) {
                TTAppOpenAdActivity.this.jg();
                lhVar.f12297lh = true;
            }
            TTAppOpenAdActivity.this.ryl();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw
        public final void fkw() {
            TTAppOpenAdActivity.bly(TTAppOpenAdActivity.this);
            TTAppOpenAdActivity.this.f12006th.yu();
            TTAppOpenAdActivity.cf(TTAppOpenAdActivity.this);
            if (TTAppOpenAdActivity.this.jqy) {
                TTAppOpenAdActivity.this.pno();
            }
            if (TTAppOpenAdActivity.this.fvf.f12291rn == null || TTAppOpenAdActivity.this.fvf.f12291rn.vt == null) {
                return;
            }
            TTAppOpenAdActivity.this.fvf.f12291rn.vt.ucs = TTAppOpenAdActivity.this;
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw
        public final void le() {
            TTAppOpenAdActivity.this.finish();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004a A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:11:0x0020, B:12:0x0038, B:14:0x004a), top: B:22:0x0020 }] */
        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bytedance.sdk.openadsdk.component.le.ouw
        public final void lh() {
            FrameLayout frameLayout;
            final TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (tTAppOpenAdActivity.isFinishing()) {
                return;
            }
            if (tTAppOpenAdActivity.yu.get()) {
                tTAppOpenAdActivity.f12003ra.show(TTAdDislikeToast.getDislikeTip());
                return;
            }
            vm vmVar = tTAppOpenAdActivity.f11999le;
            if (vmVar == null) {
                if (vmVar == null) {
                    try {
                        vm vmVar2 = new vm(tTAppOpenAdActivity, tTAppOpenAdActivity.pno);
                        tTAppOpenAdActivity.f11999le = vmVar2;
                        vmVar2.setDislikeSource("video_player");
                        tTAppOpenAdActivity.f11999le.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                            @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                            public final void ouw() {
                                TTAppOpenAdActivity.this.f12000lh.set(true);
                                TTAppOpenAdActivity.this.yu();
                                com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(TTAppOpenAdActivity.this.pno, 8);
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                            public final void vt() {
                                TTAppOpenAdActivity.this.f12000lh.set(false);
                                TTAppOpenAdActivity.this.lh();
                                com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(TTAppOpenAdActivity.this.pno, 4);
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                            public final void ouw(FilterWord filterWord) {
                                if (TTAppOpenAdActivity.this.yu.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                    return;
                                }
                                TTAppOpenAdActivity.this.yu.set(true);
                                TTAppOpenAdActivity.jqy(TTAppOpenAdActivity.this);
                            }
                        });
                        frameLayout = (FrameLayout) tTAppOpenAdActivity.findViewById(R.id.content);
                        frameLayout.addView(tTAppOpenAdActivity.f11999le);
                        if (tTAppOpenAdActivity.f12003ra == null) {
                            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(tTAppOpenAdActivity);
                            tTAppOpenAdActivity.f12003ra = tTAdDislikeToast;
                            frameLayout.addView(tTAdDislikeToast);
                        }
                    } catch (Throwable th2) {
                        ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th2);
                    }
                } else {
                    frameLayout = (FrameLayout) tTAppOpenAdActivity.findViewById(R.id.content);
                    frameLayout.addView(tTAppOpenAdActivity.f11999le);
                    if (tTAppOpenAdActivity.f12003ra == null) {
                        TTAdDislikeToast tTAdDislikeToast2 = new TTAdDislikeToast(tTAppOpenAdActivity);
                        tTAppOpenAdActivity.f12003ra = tTAdDislikeToast2;
                        frameLayout.addView(tTAdDislikeToast2);
                    }
                }
            }
            vm vmVar3 = tTAppOpenAdActivity.f11999le;
            if (vmVar3 != null) {
                vmVar3.ouw();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw
        public final void ra() {
            TTAppOpenAdActivity.jg(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bytedance.sdk.openadsdk.component.le.ouw
        public final void yu() {
            TTAppOpenAdActivity.ra(TTAppOpenAdActivity.this);
            ko.ouw("TTAppOpenAdActivity", "open_ad", "onCountDownFinish() called");
            if (com.bytedance.sdk.openadsdk.vpp.ouw.ouw("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.le();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
        public final void ouw(long j10, long j11) {
            com.bytedance.sdk.openadsdk.component.bly.vt vtVar;
            TTAppOpenAdActivity.this.f12004rn.vt = j10;
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.fkw && tTAppOpenAdActivity.fvf != null && TTAppOpenAdActivity.this.fvf.f12291rn != null && TTAppOpenAdActivity.this.fvf.f12291rn.ouw()) {
                TTAppOpenAdActivity.this.fvf.f12291rn.lh();
            }
            TTAppOpenAdActivity.this.bly();
            if (!(TTAppOpenAdActivity.this.fvf instanceof com.bytedance.sdk.openadsdk.component.vt) || (vtVar = ((com.bytedance.sdk.openadsdk.component.vt) TTAppOpenAdActivity.this.fvf).ouw) == null) {
                return;
            }
            com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar = vtVar.fvf;
            if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.yu) {
                ((com.bytedance.sdk.openadsdk.core.cf.le.yu) yuVar).ouw(j10, j11);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bytedance.sdk.openadsdk.component.le.ouw
        public final void vt() {
            TTAppOpenAdActivity.this.mwh();
        }

        @Override // com.bytedance.sdk.openadsdk.component.ouw, com.bytedance.sdk.openadsdk.component.le.ouw
        public final void ouw(int i10, boolean z10) {
            if (TTAppOpenAdActivity.this.fvf != null) {
                TTAppOpenAdActivity.this.fvf.ouw(i10, z10);
            }
        }
    };
    private final Runnable ey = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public final void run() {
            com.bytedance.sdk.openadsdk.component.le.vt vtVar;
            Handler handler;
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
            if (TTAppOpenAdActivity.this.f12007vm.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.pno != null && (yuVarSd = TTAppOpenAdActivity.this.pno.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.ouw();
            }
            TTAppOpenAdActivity.this.qbp = new com.bytedance.sdk.openadsdk.yu.ra();
            TTAppOpenAdActivity.this.qbp.ouw(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.f12006th.yu();
            if (TTAppOpenAdActivity.this.zih != null && (handler = (vtVar = TTAppOpenAdActivity.this.zih).ouw) != null) {
                handler.sendMessage(handler.obtainMessage(100, vtVar.f12282lh, 0));
            }
            if (TTAppOpenAdActivity.this.fvf != null) {
                TTAppOpenAdActivity.this.fvf.fkw();
            }
            TTAppOpenAdActivity.ksc(TTAppOpenAdActivity.this);
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException e10) {
                    Log.e("TTAppOpenAdActivity", "run: ", e10);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.f12001od);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.jqy ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.bly.pno.vt == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.f12002pd || TTAppOpenAdActivity.this.pno.pd()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.cf());
                TTAppOpenAdActivity.ouw(TTAppOpenAdActivity.this, jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.pno.ra() ? 1 : 0);
            com.bytedance.sdk.openadsdk.yu.lh.ouw(TTAppOpenAdActivity.this.pno, "open_ad", jSONObject2, (JSONObject) null);
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.pno, new com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(TTAppOpenAdActivity.this.cf()));
            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(TTAppOpenAdActivity.this.pno);
            TTAppOpenAdActivity.this.f12007vm.set(true);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void bly() {
        if (!this.jqy || this.pno.ra()) {
            return;
        }
        this.vt.removeMessages(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int cf() {
        if (this.pno.pd()) {
            return 5;
        }
        if (this.f12002pd) {
            return this.fvf.yu();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jg() {
        vpp vppVar;
        cd cdVar;
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
        try {
            com.bytedance.sdk.openadsdk.component.le.vt vtVar = this.zih;
            if (vtVar == null || (vppVar = this.pno) == null || (cdVar = vppVar.f12879tj) == null) {
                return;
            }
            int i10 = cdVar.vt;
            if (i10 == 1 || i10 == 2) {
                vtVar.ouw(i10, cdVar.ouw, false);
                com.bytedance.sdk.openadsdk.component.lh lhVar2 = this.fvf;
                if (lhVar2 == null || (lhVar = lhVar2.f12291rn) == null) {
                    return;
                }
                lhVar.vt.ouw(this.f12004rn.yu);
                this.fvf.f12291rn.vt.ouw(1.0f);
            }
        } catch (Throwable th2) {
            qbp.lh("TTAppOpenAdActivity", th2.getMessage());
        }
    }

    public static /* synthetic */ void ksc(TTAppOpenAdActivity tTAppOpenAdActivity) {
        ko.ouw("TTAppOpenAdActivity", "open_ad", "callbackAdShow() called");
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            tTAppOpenAdActivity.ouw("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = tTAppOpenAdActivity.ksc;
        if (vtVar != null) {
            vtVar.ouw();
        }
    }

    public static /* synthetic */ boolean ra(TTAppOpenAdActivity tTAppOpenAdActivity) {
        tTAppOpenAdActivity.fak = true;
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0137  */
    /* JADX WARN: Code duplicated, block: B:48:0x016f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0173  */
    /* JADX WARN: Code duplicated, block: B:51:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x017b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0184  */
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean z10;
        Pair<Integer, Integer> pairRyl;
        int iMin;
        int iMax;
        float fOuw;
        com.bytedance.sdk.openadsdk.component.lh lhVar;
        int i10;
        super.onCreate(bundle);
        zih.vt(getApplicationContext());
        if (bundle != null) {
            z10 = bundle.getBoolean("enable_new_arch", false);
        } else {
            z10 = getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        }
        this.uoy = z10;
        qbp.ouw("BVA", "onCreate: isEnableNewArch = " + this.uoy);
        if (!ouw(bundle)) {
            finish();
            return;
        }
        if (!jg.fkw()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.yu.lh.vt(this.pno, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.jqy = vpp.fkw(this.pno);
        ko.ouw("TTAppOpenAdActivity", "open_ad", "onCreate: isVideo is " + this.jqy);
        if (this.jqy) {
            this.f12004rn.ouw((float) this.pno.f12874sd.yu);
        } else {
            com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar = this.f12004rn;
            zih.yu();
            ouwVar.ouw(cf.vm(String.valueOf(this.ex)));
        }
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = new com.bytedance.sdk.openadsdk.component.le.vt(this.f12004rn);
        this.zih = vtVar;
        vtVar.vt = this.osn;
        int i11 = Build.VERSION.SDK_INT;
        if (26 != i11) {
            this.f11997cd = this.pno.jqy();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.f11997cd = 1;
        } else {
            this.f11997cd = 2;
        }
        ko.ouw("TTAppOpenAdActivity", "open_ad", "changeScreenOrientation: mOrientation=" + this.f11997cd);
        if (i11 == 26) {
            pairRyl = osn.ryl(getApplicationContext());
            if (this.f11997cd == 2) {
                iMin = Math.max(((Integer) pairRyl.first).intValue(), ((Integer) pairRyl.second).intValue());
                iMax = Math.min(((Integer) pairRyl.first).intValue(), ((Integer) pairRyl.second).intValue());
            } else {
                iMin = Math.min(((Integer) pairRyl.first).intValue(), ((Integer) pairRyl.second).intValue());
                iMax = Math.max(((Integer) pairRyl.first).intValue(), ((Integer) pairRyl.second).intValue());
            }
            this.zin = iMax;
            this.vpp = iMin;
            fOuw = osn.ouw();
            if (osn.lh((Activity) this)) {
                i10 = this.f11997cd;
                if (i10 == 1) {
                    this.zin -= fOuw;
                } else if (i10 == 2) {
                    this.vpp -= fOuw;
                }
            }
            lhVar = this.fvf;
            if (lhVar != null) {
                lhVar.ouw(this.vpp, this.zin);
            }
        } else {
            if (i11 == 27) {
                try {
                    ra();
                } catch (Throwable th2) {
                    qbp.lh("TTAppOpenAdActivity", th2.getMessage());
                }
            } else {
                ra();
            }
            pairRyl = osn.ryl(getApplicationContext());
            if (this.f11997cd == 2) {
                iMin = Math.max(((Integer) pairRyl.first).intValue(), ((Integer) pairRyl.second).intValue());
                iMax = Math.min(((Integer) pairRyl.first).intValue(), ((Integer) pairRyl.second).intValue());
            } else {
                iMin = Math.min(((Integer) pairRyl.first).intValue(), ((Integer) pairRyl.second).intValue());
                iMax = Math.max(((Integer) pairRyl.first).intValue(), ((Integer) pairRyl.second).intValue());
            }
            this.zin = iMax;
            this.vpp = iMin;
            fOuw = osn.ouw();
            if (osn.lh((Activity) this)) {
                i10 = this.f11997cd;
                if (i10 == 1) {
                    this.zin -= fOuw;
                } else if (i10 == 2) {
                    this.vpp -= fOuw;
                }
            }
            lhVar = this.fvf;
            if (lhVar != null) {
                lhVar.ouw(this.vpp, this.zin);
            }
        }
        FrameLayout frameLayout = new FrameLayout(this);
        this.uq = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.uq);
            this.uq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        int i12 = TTAppOpenAdActivity.this.pno.kfa;
                        TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                        boolean z11 = true;
                        if (tTAppOpenAdActivity.pno == null || TTAppOpenAdActivity.this.pno.rn() != 2 || i12 == 1) {
                            z11 = false;
                        }
                        tTAppOpenAdActivity.f12002pd = z11;
                        if (TTAppOpenAdActivity.this.f12002pd) {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity2.fvf = new com.bytedance.sdk.openadsdk.component.vt(tTAppOpenAdActivity2, tTAppOpenAdActivity2.pno, TTAppOpenAdActivity.this.uq, TTAppOpenAdActivity.this.osn, TTAppOpenAdActivity.this.f11997cd, TTAppOpenAdActivity.this.jqy, TTAppOpenAdActivity.this.f12004rn, TTAppOpenAdActivity.this.zih);
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity3.fvf = new com.bytedance.sdk.openadsdk.component.lh(tTAppOpenAdActivity3, tTAppOpenAdActivity3.pno, TTAppOpenAdActivity.this.uq, TTAppOpenAdActivity.this.osn, TTAppOpenAdActivity.this.f11997cd, TTAppOpenAdActivity.this.jqy, TTAppOpenAdActivity.this.f12004rn);
                            TTAppOpenAdActivity.this.fvf.ouw(TTAppOpenAdActivity.this.vpp, TTAppOpenAdActivity.this.zin);
                        }
                        TTAppOpenAdActivity.this.fvf.ouw((ViewGroup) TTAppOpenAdActivity.this.uq);
                        TTAppOpenAdActivity.this.fvf.ouw();
                        TTAppOpenAdActivity.this.fvf.vt();
                    } catch (Throwable th3) {
                        TTAppOpenAdActivity.this.finish();
                        qbp.lh("TTAppOpenAdActivity", th3.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    this.ryl = true;
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List<Rect> boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.rn.lh.vt();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    public static /* synthetic */ void jqy(TTAppOpenAdActivity tTAppOpenAdActivity) {
        tTAppOpenAdActivity.f12003ra.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private boolean ko() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e10) {
            qbp.lh("TTAppOpenAdActivity", e10.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void le() {
        qbp.ouw("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdTimeOver");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = this.ksc;
        if (vtVar != null) {
            vtVar.lh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mwh() {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
        com.bytedance.sdk.openadsdk.component.lh lhVar2;
        ko.ouw("TTAppOpenAdActivity", "open_ad", "onUserWantSkip() called");
        com.bytedance.sdk.openadsdk.core.jae.ouw(this.ex);
        ryl();
        if (this.jqy && (lhVar2 = this.fvf) != null && lhVar2.f12291rn != null) {
            jg();
            this.fvf.f12291rn.ouw(4);
        }
        vpp vppVar = this.pno;
        com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar = this.f12004rn;
        com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vppVar, (int) ouwVar.vt, this.zih.yu, ouwVar.ouw);
        vpp vppVar2 = this.pno;
        if (vppVar2 != null && (yuVarSd = vppVar2.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
            long jFkw = 0;
            com.bytedance.sdk.openadsdk.component.lh lhVar3 = this.fvf;
            if (lhVar3 != null && (lhVar = lhVar3.f12291rn) != null) {
                jFkw = lhVar.fkw();
            }
            yuVar.fkw(jFkw);
            yuVar.yu(jFkw);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pno() {
        if (!this.jqy || this.pno.ra() || this.fak) {
            return;
        }
        this.vt.sendEmptyMessageDelayed(100, 5000L);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void ra() {
        if (this.f11997cd != 2) {
            setRequestedOrientation(1);
        } else if (ko()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.f11997cd == 2 || !osn.lh((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ryl() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = this.ksc;
        if (vtVar != null) {
            vtVar.vt();
        }
    }

    private void tlj() {
        zih.yu();
        if (cf.rn(String.valueOf(this.ex)) == 1) {
            zih.yu();
            if (this.f12004rn.vt >= ((long) cf.zih(String.valueOf(this.ex))) * 1000) {
                mwh();
            }
        }
    }

    public final void lh() {
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
        if (this.f12000lh.get()) {
            return;
        }
        if (this.jqy) {
            com.bytedance.sdk.openadsdk.component.lh lhVar2 = this.fvf;
            if (lhVar2 != null && (lhVar = lhVar2.f12291rn) != null && lhVar.vt()) {
                this.fvf.f12291rn.yu();
            }
            pno();
        }
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.ouw();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            this.f11998cf = this.pno != null ? od.ouw().ouw(this.pno) : -1;
            if (!TextUtils.isEmpty(this.f12008jg)) {
                bundle.putString("single_process_listener_key", this.f12008jg);
            }
            bundle.putBoolean("enable_new_arch", this.uoy);
            bundle.putInt("meta_index", this.f11998cf);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f12005tc);
            bundle.putInt("ad_source", this.f12001od);
            bundle.putLong("start_show_time", this.tlj);
        } catch (Throwable th2) {
            qbp.lh("TTAppOpenAdActivity", th2.getMessage());
        }
        if (!this.uoy) {
            f11996ko = this.ksc;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        tlj();
    }

    public final void yu() {
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar;
        if (this.jqy) {
            com.bytedance.sdk.openadsdk.component.lh lhVar2 = this.fvf;
            if (lhVar2 != null && (lhVar = lhVar2.f12291rn) != null && lhVar.ouw()) {
                this.fvf.f12291rn.lh();
            }
            bly();
        }
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.vt();
        }
    }

    public static /* synthetic */ void bly(TTAppOpenAdActivity tTAppOpenAdActivity) {
        int iZih;
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        vpp vppVar = tTAppOpenAdActivity.pno;
        if (vppVar != null && vppVar.ouw() >= 0) {
            iZih = tTAppOpenAdActivity.pno.ouw();
        } else {
            zih.yu();
            iZih = cf.zih(String.valueOf(tTAppOpenAdActivity.ex));
        }
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = tTAppOpenAdActivity.zih;
        int i10 = (int) tTAppOpenAdActivity.f12004rn.ouw;
        vtVar.f12282lh = i10;
        if (i10 <= 0) {
            vtVar.f12282lh = 5;
        }
        vtVar.yu = Math.min(iZih, vtVar.f12282lh);
    }

    public static /* synthetic */ void cf(TTAppOpenAdActivity tTAppOpenAdActivity) {
        if (tTAppOpenAdActivity.f12007vm.get()) {
            return;
        }
        try {
            tTAppOpenAdActivity.getWindow().getDecorView().post(tTAppOpenAdActivity.ey);
        } catch (Throwable unused) {
            tTAppOpenAdActivity.finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        osn.ouw((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                osn.ouw((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        qbp.lh("TTAppOpenAdActivity", e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        tlj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.pno != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.pno);
        }
        this.vt.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.le.vt vtVar = this.zih;
        if (vtVar != null) {
            vtVar.ouw.removeCallbacksAndMessages(null);
            vtVar.ouw = null;
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(this.pno);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(this.pno);
        if (this.jqy) {
            vpp vppVar = this.pno;
            com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar = this.f12004rn;
            com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(vppVar, ouwVar.vt, ouwVar.ouw, true);
        } else {
            com.bytedance.sdk.openadsdk.component.yu.ouw.ouw(this.pno, -1L, this.f12004rn.ouw, false);
        }
        if (this.f12006th.fkw() && this.f12007vm.get()) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(String.valueOf(this.f12006th.lh()), this.pno, "open_ad", this.qbp);
            this.f12006th = fak.vt();
        }
        com.bytedance.sdk.openadsdk.component.lh lhVar = this.fvf;
        if (lhVar != null) {
            lhVar.lh();
        }
        le();
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("recycleRes");
        }
        f11996ko = null;
        if (this.uoy && !TextUtils.isEmpty(this.f12008jg)) {
            od.ouw().ouw(this.f12008jg, isFinishing(), isChangingConfigurations());
        }
        this.ksc = null;
        vm vmVar = this.f11999le;
        if (vmVar != null) {
            vmVar.setCallback(null);
        }
        vpp vppVar2 = this.pno;
        if (vppVar2 != null && !vpp.ra(vppVar2) && !this.pno.f12887zn) {
            com.bytedance.sdk.openadsdk.component.le.ouw(zih.ouw()).ouw(this.bs);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.fkw = false;
        yu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.lh lhVar;
        super.onResume();
        this.fkw = true;
        if (this.ouw.getAndSet(true)) {
            if (this.jae.get()) {
                ryl();
                if (this.jqy && (lhVar = this.fvf) != null && lhVar.f12291rn != null) {
                    jg();
                    this.fvf.f12291rn.ouw(3);
                }
                finish();
                return;
            }
            lh();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f11998cf >= 0) {
            od.ouw().vt(this.f11998cf);
            this.f11998cf = -1;
        }
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.pno);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        int i10;
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (!this.f12002pd) {
                this.f12006th.yu();
            }
            vpp vppVar = this.pno;
            if (vppVar != null && vppVar.cj()) {
                vpp vppVar2 = this.pno;
                if (!vppVar2.vr) {
                    vppVar2.vr = true;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(vppVar2, "open_ad", vppVar2.f12867od);
                }
            }
        } else if (this.f12007vm.get()) {
            if (this.f12006th.fkw()) {
                com.bytedance.sdk.openadsdk.yu.lh.ouw(String.valueOf(this.f12006th.lh()), this.pno, "open_ad", this.qbp);
            }
            this.f12006th = fak.vt();
        }
        vpp vppVar3 = this.pno;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 8;
        }
        com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(vppVar3, i10);
        com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(this.pno, z10);
    }

    private void ouw(final String str) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                    if (tTAppOpenAdActivity.bly == null) {
                        tTAppOpenAdActivity.bly = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(7));
                    }
                    tTAppOpenAdActivity.bly.executeAppOpenAdCallback(TTAppOpenAdActivity.this.f12005tc, str);
                } catch (Throwable th2) {
                    qbp.yu("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    private boolean ouw(Bundle bundle) {
        String stringExtra;
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra2 != null) {
                    try {
                        this.pno = com.bytedance.sdk.openadsdk.core.vt.ouw(PangleVideoBridge.jsonObjectInit(stringExtra2));
                    } catch (Exception e10) {
                        qbp.yu("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e10);
                    }
                }
                this.f12005tc = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.pno = od.ouw().ouw(od.ouw(getIntent()));
            if (this.uoy) {
                if (bundle != null) {
                    stringExtra = bundle.getString("single_process_listener_key");
                } else {
                    stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
                }
                this.f12008jg = stringExtra;
                this.ksc = (com.bytedance.sdk.openadsdk.ouw.yu.vt) od.ouw().ouw(this.f12008jg, com.bytedance.sdk.openadsdk.ouw.yu.vt.class);
            } else {
                this.ksc = od.ouw().yu;
            }
            od.ouw().vt();
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            this.f12001od = intent2.getIntExtra("ad_source", 0);
            this.tlj = intent2.getLongExtra("start_show_time", 0L);
        }
        if (bundle != null) {
            if (!this.uoy && this.ksc == null) {
                this.ksc = f11996ko;
                f11996ko = null;
            }
            try {
                int i10 = bundle.getInt("meta_index", -1);
                this.f12005tc = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.f12001od = bundle.getInt("ad_source", 0);
                this.tlj = bundle.getLong("start_show_time", 0L);
                this.pno = od.ouw().ouw(i10);
            } catch (Throwable th2) {
                qbp.lh("TTAppOpenAdActivity", th2.getMessage());
            }
        }
        vpp vppVar = this.pno;
        if (vppVar == null) {
            ko.ouw("TTAppOpenAdActivity", "open_ad", "mMaterialMeta is null , no data to display ,the TTOpenAdActivity finished !!");
            finish();
            return false;
        }
        this.bs = vppVar.yiz;
        vppVar.ouw = this.tlj;
        this.ex = vppVar.fqk();
        com.bytedance.sdk.openadsdk.utils.vt.ouw(this.pno);
        return true;
    }

    public static /* synthetic */ void jg(TTAppOpenAdActivity tTAppOpenAdActivity) {
        ko.ouw("TTAppOpenAdActivity", "open_ad", "callbackAdClick() called");
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            tTAppOpenAdActivity.ouw(Mf.f27056f);
        } else {
            com.bytedance.sdk.openadsdk.ouw.yu.vt vtVar = tTAppOpenAdActivity.ksc;
            if (vtVar != null) {
                vtVar.onAdClicked();
            }
        }
        cf.vt();
        if (cf.qbp(String.valueOf(tTAppOpenAdActivity.ex)).uq) {
            tTAppOpenAdActivity.jae.set(true);
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd;
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        com.bytedance.sdk.openadsdk.component.lh lhVar;
        if (message.what == 100) {
            if (this.jqy && (lhVar = this.fvf) != null && lhVar.f12291rn != null) {
                jg();
                this.fvf.f12291rn.ouw(1);
            }
            vpp vppVar = this.pno;
            if (vppVar != null && (yuVarSd = vppVar.sd()) != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.GENERAL_LINEAR_AD_ERROR);
            }
            ryl();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw
    public final void ouw(int i10) {
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            jg();
        }
    }

    public static /* synthetic */ JSONObject ouw(TTAppOpenAdActivity tTAppOpenAdActivity, JSONObject jSONObject) {
        if (tTAppOpenAdActivity.cf() == 0) {
            return tTAppOpenAdActivity.fvf.ouw(jSONObject);
        }
        return null;
    }
}
