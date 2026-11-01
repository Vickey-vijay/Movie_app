package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.ironsource.C3426d4;
import com.safedk.android.internal.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ouw extends pno implements jae.ouw, com.bytedance.sdk.openadsdk.component.reward.ouw.fkw.ouw {

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f12100cd;
    private int ex;
    public boolean fkw;
    private long jae;
    private Bundle jqy;
    private boolean ksc;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12101lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private long f12102od;
    public final jae ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private boolean f12103pd;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private boolean f12104tc;
    private CountDownTimer uq;
    private int vpp;

    @Nullable
    public com.bytedance.sdk.openadsdk.component.reward.vt.vt vt;
    public boolean yu;

    public abstract FrameLayout bly();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void bs() {
        this.yu = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void lh() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        boolean z10;
        super.lh();
        if (this.bly == null || (vtVar = this.vt) == null) {
            return;
        }
        vtVar.rn();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.pv = true;
        if (ouwVar.tlj.get() && this.bly.f12383ra) {
            z10 = false;
        } else {
            z10 = this.f12108le.lh() ? this.bly.tlj.get() : true;
        }
        if (z10) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            ouwVar2.uoy.ouw(ouwVar2.vt.ksc());
        }
        this.bly.ey.ko();
        this.bly.bs.tlj();
        this.bly.ksc.lh();
        if (this.vt.vt()) {
            this.bly.ex.ouw(this.vt);
            ko koVar = this.bly.ex;
            if (koVar.bly) {
                ouw(koVar.ouw, true);
            } else if (koVar.vt() && (this.f12109ra.tlj instanceof yu)) {
                rrs();
            } else {
                this.bly.ex.ouw(this, this.ex != 0);
            }
        }
        this.ex++;
        yhj();
        tlj tljVar = this.bly.jae;
        if (tljVar != null) {
            tljVar.lh();
        }
        this.bly.f12381od.ouw(this.ouw);
        if (this.f12109ra.tlj instanceof yu) {
            this.bly.jae.ouw(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f12100cd) {
            long j10 = this.jae;
            if (j10 != 0 && jCurrentTimeMillis - j10 > this.f12102od) {
                qbp.ouw("TTAD.AdScene", "onResume: Exceed playable_duration_time, switch to next ad");
                hun().ouw(this, ouw(8));
                return;
            }
            if (j10 != 0) {
                this.f12102od -= jCurrentTimeMillis - j10;
            }
            qbp.ouw("TTAD.AdScene", "onResume: The playable display time has not yet arrived, continue the countdown -> remainingTime = " + this.f12102od);
            this.uq = new CountDownTimer(this.f12102od) { // from class: com.bytedance.sdk.openadsdk.activity.ouw.2
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    qbp.ouw("TTAD.AdScene", "onFinish: remainingTime = " + ouw.this.f12102od);
                    vt vtVarHun = ouw.this.hun();
                    ouw ouwVar3 = ouw.this;
                    vtVarHun.ouw(ouwVar3, ouwVar3.ouw(8));
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j11) {
                    ouw.this.f12102od = j11;
                    qbp.ouw("TTAD.AdScene", "onTick: remainingTime = " + ouw.this.f12102od);
                }
            }.start();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void vm() {
    }

    public abstract void vt();

    private Map<String, Object> mt() {
        vpp vppVar;
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && ouwVar.jae != null && (vppVar = this.f12108le) != null && vppVar.rn() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.bly.jae.fkw()));
            JSONObject jSONObjectOuw = this.bly.jae.ouw((JSONObject) null);
            if (jSONObjectOuw != null) {
                Iterator<String> itKeys = jSONObjectOuw.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectOuw.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    private com.bytedance.sdk.openadsdk.yu.ra xdk() {
        tlj tljVar;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (!this.f12108le.lh()) {
            com.bytedance.sdk.openadsdk.yu.ra raVar = new com.bytedance.sdk.openadsdk.yu.ra();
            raVar.ouw(System.currentTimeMillis(), 1.0f);
            return raVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && (tljVar = ouwVar.jae) != null && (yuVar = tljVar.ouw) != null) {
            return yuVar.getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.yu.ra raVar2 = new com.bytedance.sdk.openadsdk.yu.ra();
        raVar2.ouw(System.currentTimeMillis(), 1.0f);
        return raVar2;
    }

    private void yhj() {
        if (this.f12108le.lh() && !this.f12104tc) {
            this.f12104tc = true;
            this.bly.rrs.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ouw.3
                @Override // java.lang.Runnable
                public final void run() {
                    float[] fArrOuw;
                    ouw ouwVar = ouw.this;
                    if (ouwVar.f12109ra.tlj instanceof yu) {
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar.bly;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = ouw.this.bly;
                        fArrOuw = new float[]{osn.vt(ouwVar2.jvy, ouwVar2.rrs.getWidth()), osn.vt(ouwVar3.jvy, ouwVar3.rrs.getHeight())};
                    } else {
                        fArrOuw = ouwVar.bly.f12381od.ouw(ouwVar.vpp);
                    }
                    ouw ouwVar4 = ouw.this;
                    com.bytedance.sdk.openadsdk.component.reward.ouw.le leVar = ouwVar4.bly.uq;
                    if (!leVar.vt) {
                        leVar.ouw(fArrOuw);
                        return;
                    }
                    vpp vppVar = ouwVar4.f12108le;
                    tlj tljVar = leVar.ouw.jae;
                    if (tljVar != null) {
                        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar = tljVar.ouw;
                        ViewParent parent = yuVar.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(yuVar);
                        }
                        leVar.ouw.ey.le().addView(yuVar);
                        if (!leVar.ouw.jae.yu()) {
                            leVar.ouw.coz.ouw(false);
                        }
                        tlj tljVar2 = leVar.ouw.jae;
                        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2 = tljVar2.ouw;
                        if (yuVar2 != null) {
                            AdSlot adSlot = vppVar.yiz;
                            String strVt = vppVar.vt();
                            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = tljVar2.f12474ra;
                            yuVar2.ouw(vppVar, adSlot, strVt, ouwVar5.f12373cj, !ouwVar5.euf);
                        }
                        leVar.ouw();
                    }
                }
            });
        }
    }

    private void yib() {
        this.f12100cd = od.lh(this.f12108le) && this.f12108le.an();
        qbp.ouw("TTAD.AdScene", "current scene is isOnlyPlayable -> " + this.f12100cd);
        if (this.f12100cd) {
            this.f12102od = ((long) this.f12108le.od()) * 1000;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void cf() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.ryl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String ex() {
        return this.bly.f12388ub;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean fak() {
        return this.f12108le.kfa == 10 && !jae();
    }

    public final void fkw() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.osn.ouw(true, false, false, ouwVar.coz, 4);
    }

    public final void fvf() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && ouwVar.ex.yu()) {
            this.bly.ex.cf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean jae() {
        return this.bly.jae.yu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean jqy() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        return ouwVar != null && ouwVar.ex.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ko() {
        this.bly.ex.vpp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ksc() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void le() {
        qbp.ouw("TTAD.AdScene", "onPlayableLoadingDismiss()---" + this.tlj);
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            vtVar.ouw(this);
        }
    }

    public final void od() {
        this.bly.f12371cd.ouw();
    }

    public final void pd() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return;
        }
        ouwVar.ex.ra();
    }

    public final void pno() {
        Message message = new Message();
        message.what = 400;
        if (this.f12108le.ey()) {
            jvy();
        }
        this.ouw.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ra() {
        qbp.ouw("TTAD.AdScene", "onPlayableHappenInteraction()---" + this.tlj + " isHappenInteraction:true");
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final View rn() {
        return this.bly.ex.jqy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ryl() {
        vt vtVar = this.f12109ra;
        if (vtVar == null) {
            return;
        }
        vtVar.vt(this, ouw(10));
    }

    public final void tc() {
        this.f12109ra.ouw(this, ouw(com.bytedance.sdk.openadsdk.yu.vt.C0161vt.vt));
    }

    public final void th() {
        this.ouw.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean uoy() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar = this.bly.jae.ouw;
        return (yuVar != null && yuVar.uq.get()) && !jae();
    }

    public final void vpp() {
        if (this.ksc) {
            qbp.ouw("TTAD.AdScene", "tryPreloadNextAdVideo: Already tried preloading the video");
        } else {
            this.ksc = true;
            cj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void vt(boolean z10) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.tlj tljVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null || (tljVar = ouwVar.f12371cd) == null) {
            return;
        }
        tljVar.vt(z10);
        this.bly.f12371cd.lh(z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void zih() {
        if (!this.bly.f12375jg.getAndSet(true) || od.lh(this.bly.vt)) {
            this.bly.f12371cd.ouw();
        }
    }

    public ouw(vt vtVar, vpp vppVar, int i10, int i11, boolean z10) {
        super(vtVar, vppVar, i10, i11, z10);
        this.ouw = new jae(Looper.getMainLooper(), this);
        this.vpp = 1;
        this.ex = 0;
        this.f12104tc = false;
        this.yu = false;
        yib();
    }

    public final void cd() {
        yhj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.jg();
        if (this.f12100cd) {
            this.jae = System.currentTimeMillis();
            qbp.ouw("TTAD.AdScene", "onPause: remainingTime = " + this.f12102od);
            CountDownTimer countDownTimer = this.uq;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.zih();
        tlj tljVar = this.bly.jae;
        if (tljVar != null && (yuVar = tljVar.ouw) != null) {
            yuVar.ryl();
        }
        if (this.f12109ra.tlj instanceof yu) {
            this.bly.jae.ouw(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void mwh() {
        super.mwh();
        if (this.bly != null && !com.bytedance.sdk.component.utils.vt.ouw(ux())) {
            this.bly.bs.rn();
            com.bytedance.sdk.openadsdk.utils.yu.ouw(ux(), this.bly.vt);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, Bundle bundle) {
        this.jqy = bundle;
        super.ouw(activity, bundle);
        ouw(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void qbp() {
        super.qbp();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.vt(this.qbp);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void tlj() {
        super.tlj();
        if (this.f12108le.lh()) {
            this.bly.jae.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void uq() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.uq();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && (yuVar = ouwVar.jae.ouw) != null && yuVar.uq.get()) {
            od();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public void yu() {
        super.yu();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.vm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void zin() {
        super.zin();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.qbp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final com.bytedance.sdk.openadsdk.component.reward.view.bly ouw() {
        return this.bly.rrs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public void ouw(Activity activity, vt.fkw fkwVar) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        try {
            this.vpp = this.f12108le.jqy();
            vpp vppVar = this.f12108le;
            Bundle bundle = this.jqy;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(activity, this.ouw, vppVar, this, 1, this.f12109ra.zin, this.bly);
            this.bly = ouwVar;
            boolean z10 = this.f12109ra.bly;
            ouwVar.euf = z10;
            ouwVar.njr = this.mwh;
            ouwVar.f12392xn = z10 && th.fkw(vppVar);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            vt vtVar2 = this.f12109ra;
            ouwVar2.mq = vtVar2.f12120cf;
            ouwVar2.f12370an = vtVar2.tlj.ryl();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
            ouwVar3.f12374gh = this;
            ouwVar3.fvf = this.f12109ra.fkw;
            Intent intent = activity.getIntent();
            com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(this.bly, intent, bundle);
            if (intent != null) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(intent, this.bly);
                vppVar.ouw = intent.getLongExtra("start_show_time", 0L);
            }
            if (bundle != null && this.bly.xdk) {
                vt();
            }
            com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVarOuw = com.bytedance.sdk.openadsdk.component.reward.vt.le.ouw(this.bly);
            this.vt = vtVarOuw;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.bly;
            ouwVar4.coz = vtVarOuw;
            ouwVar4.osn.vt = this;
            if (ouwVar4.euf) {
                ouwVar4.ex.qbp = new com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw() { // from class: com.bytedance.sdk.openadsdk.activity.ouw.1
                    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw
                    public final void ouw(int i10) {
                        ouw ouwVar5 = ouw.this;
                        vt vtVar3 = ouwVar5.f12109ra;
                        if (vtVar3 == null) {
                            return;
                        }
                        vtVar3.ouw(ouwVar5, i10);
                    }
                };
                lh lhVar = this.f12109ra.tlj;
                if (!(lhVar instanceof yu)) {
                    lhVar.ryl().setShowSound(vpp.fkw(vppVar));
                }
            }
            com.bytedance.sdk.openadsdk.utils.ko.ouw(this.bly);
            com.bytedance.sdk.component.utils.ko.vt("TTAD.AdScene", "init: mAdType = " + this.vt);
            if (this.bly.euf && this.f12108le.an()) {
                this.bly.f12373cj = fkwVar.yu;
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.bly;
            if (ouwVar5.euf && this.tlj > 0) {
                ouwVar5.f12373cj = fkwVar.yu;
            }
            ouwVar5.rrs.ouw(this.vt);
            this.vt.ouw(this, this.ouw);
            this.vt.cf();
            this.vt.jqy();
            this.f12101lh = (int) this.bly.ex.zin();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar6 = this.bly;
            if (ouwVar6.euf) {
                ouw(ouwVar6.f12371cd.f12420lh);
                ouw(this.bly.f12371cd.vt);
            }
            b_();
            if (!this.f12108le.lh() && (vtVar = this.vt) != null) {
                vtVar.ouw(this.bly.ey.le());
                this.vt.vpp();
            }
            if (th.fkw(this.f12108le)) {
                vh();
            }
        } catch (Throwable th2) {
            qbp.ouw("TTAD.AdScene", "onCreate: ", th2);
            com.bytedance.sdk.openadsdk.rn.lh.vt();
            lso();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void lh(boolean z10) {
        vt vtVar = this.f12109ra;
        if (vtVar != null) {
            vtVar.tlj.ouw(this, z10);
        }
    }

    private void ouw(com.bytedance.sdk.openadsdk.core.lh.vt vtVar) {
        if (vtVar != null) {
            HashMap map = new HashMap();
            try {
                int i10 = this.f12105cf + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            vtVar.ouw(map);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity) {
        super.ouw(activity);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return;
        }
        ouwVar.f12381od.ouw();
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void ouw(String str, JSONObject jSONObject) {
        vt vtVar;
        if (str == null || !"skipToNextAd".equals(str) || (vtVar = this.f12109ra) == null) {
            return;
        }
        vtVar.vt(this, ouw(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final boolean ouw(long j10, boolean z10) {
        th thVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return false;
        }
        ouwVar.jae.fkw = false;
        this.fkw = false;
        com.bytedance.sdk.openadsdk.yu.ra raVarXdk = xdk();
        if (bly() == null) {
            return false;
        }
        this.bly.ex.ouw(bly(), raVarXdk);
        Map<String, Object> mapMt = this.f12108le.lh() ? mt() : null;
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar2 = new com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.ouw.4
            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
            public final void ouw(long j11, int i10) {
                qbp.ouw("TTAD.AdScene", "onComplete() called with: totalPlayTime = [" + j11 + "], percent = [" + i10 + "], mVideoHasCompleted=" + ouw.this.fkw);
                ouw ouwVar3 = ouw.this;
                if (ouwVar3.fkw) {
                    return;
                }
                ouwVar3.fkw = true;
                boolean zLh = ouwVar3.f12108le.lh();
                ouw.this.ouw.removeMessages(d.f44769a);
                ouw.this.th();
                ouw.this.bly.ex.ouw(j11, j11);
                if (zLh) {
                    ouw.this.bly.jae.fkw = true;
                } else {
                    ouw.this.bly.f12387th.set(true);
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = ouw.this.bly;
                vpp vppVar = ouwVar4.vt;
                if (vppVar.fvf == 36 && ouwVar4.f12379lh) {
                    ouwVar4.f12386tc.f12423lh.ouw(vppVar);
                    com.bytedance.sdk.openadsdk.utils.ko.vt();
                }
                if (!zLh && ouw.this.bly.vt.ub()) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = ouw.this.bly;
                    ouwVar5.vt.ycd = 1;
                    ouwVar5.ey.zih();
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar6 = ouw.this.bly;
                vpp vppVar2 = ouwVar6.vt;
                if (vppVar2.fvf == 21 && !vppVar2.mq) {
                    vppVar2.f12842an = true;
                    ouwVar6.ey.zih();
                }
                vt.fkw fkwVarOuw = ouw.this.ouw(5);
                fkwVarOuw.fkw = true;
                ouw ouwVar7 = ouw.this;
                ouwVar7.f12109ra.ouw(ouwVar7, fkwVarOuw);
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
            public final void vt(long j11, int i10) {
                qbp.ouw("TTAD.AdScene", "onError() called with: totalPlayTime = [" + j11 + "], percent = [" + i10 + C3426d4.j.f28588e);
                ouw.this.ouw.removeMessages(d.f44769a);
                th thVar2 = ouw.this.bly.ey.f12468rn;
                if (thVar2 != null) {
                    thVar2.le();
                }
                if (ouw.this.bly.ex.ouw()) {
                    ouw.this.pno();
                    return;
                }
                ouw.this.bly.ex.tlj();
                if (ouw.this.f12108le.lh()) {
                    ouw.this.bly.jae.yu = true;
                }
                ouw ouwVar3 = ouw.this;
                ouwVar3.f12109ra.ouw(ouwVar3, ouwVar3.ouw(3));
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
            public final void ouw() {
                qbp.ouw("TTAD.AdScene", "onTimeOut() called with: ");
                ouw.this.ouw.removeMessages(d.f44769a);
                ouw.this.th();
                ouw ouwVar3 = ouw.this;
                ouwVar3.f12109ra.ouw(ouwVar3, ouwVar3.ouw(6));
            }

            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw
            public final void ouw(long j11, long j12) {
                com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
                ko koVar;
                com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = ouw.this.bly;
                if (!ouwVar3.pv && ouwVar3.ex.ouw() && (lhVar = (koVar = ouw.this.bly.ex).f12357ra) != null) {
                    lhVar.cf();
                    koVar.tlj = true;
                }
                if (ouw.this.bly.tlj.get()) {
                    return;
                }
                ouw.this.ouw.removeMessages(d.f44769a);
                ouw ouwVar4 = ouw.this;
                if (j11 != ouwVar4.bly.ex.pno) {
                    ouwVar4.th();
                }
                if (ouw.this.bly.ex.ouw()) {
                    ouw.this.bly.ex.ouw(j11, j12);
                    int i10 = (int) (j11 / 1000);
                    if ((ouw.this.bly.qbp.get() || ouw.this.bly.f12372cf.get()) && ouw.this.bly.ex.ouw()) {
                        ouw.this.bly.ex.ryl();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = ouw.this.bly;
                    if (ouwVar5.yu) {
                        ouwVar5.ey.fkw(i10);
                    }
                    if (ouw.this.f12108le.lh()) {
                        ouw ouwVar6 = ouw.this;
                        tlj tljVar = ouwVar6.bly.jae;
                        if (tljVar != null && (yuVar = tljVar.ouw) != null) {
                            yuVar.setTime(String.valueOf(ouwVar6.f12101lh), i10, 0, false);
                            ouw.this.bly.jae.ouw.ouw(j11, j12);
                        }
                    }
                    ouw.this.ouw((j11 * 1.0f) / j12);
                    ouw.this.bly.ouw(true);
                }
            }
        };
        this.bly.ex.ouw(ouwVar2);
        if (!this.f12108le.lh() && (thVar = this.bly.ey.f12468rn) != null) {
            thVar.uoy = ouwVar2;
        }
        return this.bly.ex.ouw(j10, z10, mapMt, this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.fkw.ouw
    public final void ouw(boolean z10, boolean z11, boolean z12, int i10) {
        vt(z10, z11, z12, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
        super.ouw(pnoVar, pnoVar2, fkwVar);
        if (pnoVar == this && (pnoVar2 instanceof fkw)) {
            int i10 = fkwVar.vt;
            if (i10 == 3) {
                ko koVar = this.bly.ex;
                koVar.ouw(!koVar.qbp() ? 1 : 0, 2);
            } else if (i10 == 6) {
                ko koVar2 = this.bly.ex;
                koVar2.ouw(!koVar2.qbp() ? 1 : 0, !this.bly.ex.qbp() ? 1 : 0);
            } else if (i10 == 5 && !vpp.fkw(this.bly.vt) && fkwVar.fkw) {
                this.bly.ex.ouw("skip", true);
            }
            this.bly.uoy.ouw(false);
            this.bly.uoy.yu(false);
        }
    }

    public final void ouw(float f10) {
        vt vtVar = this.f12109ra;
        if (vtVar == null) {
            return;
        }
        vtVar.tlj.ouw(f10);
        if (this.ksc) {
            return;
        }
        vpp vppVar = this.f12108le;
        if (vppVar.fvf == 43 || f10 < vppVar.f12866ob / 100.0f) {
            return;
        }
        pno pnoVarMwh = this.f12109ra.tlj.mwh();
        if (pnoVarMwh instanceof ouw) {
            ((ouw) pnoVarMwh).vpp();
        }
    }

    public final vt.fkw ouw(int i10) {
        vt.fkw fkwVar = new vt.fkw(i10, this.bly);
        fkwVar.yu = this.bly.f12373cj;
        return fkwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Map<String, Object> map, float f10, float f11) {
        super.ouw(map, f10, f11);
        this.f12109ra.tlj.ouw(map, this);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(vpp vppVar, int i10, int i11) {
        super.ouw(vppVar, i10, i11);
        yib();
        this.f12104tc = false;
        this.f12103pd = true;
    }
}
