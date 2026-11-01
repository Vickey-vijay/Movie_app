package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.component.reward.ouw.cf;
import com.bytedance.sdk.openadsdk.component.reward.ryl;
import com.bytedance.sdk.openadsdk.component.reward.tlj;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.ex;
import com.bytedance.sdk.openadsdk.core.model.jqy;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.ironsource.C3426d4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vt {
    public static com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouw;
    public static com.bytedance.sdk.openadsdk.ouw.lh.vt vt;
    public final boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final boolean f12120cf;
    public final com.bytedance.sdk.openadsdk.mwh.bly fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public Bundle f12121jg;
    private final boolean jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f12122ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public tlj f12123le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final vpp f12124lh;
    public int mwh;
    public com.bytedance.sdk.openadsdk.ouw.lh.vt pno;
    public boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.ouw.fkw.ouw f12125ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f12126rn;
    public Activity ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f12127th;
    public com.bytedance.sdk.openadsdk.activity.lh tlj;
    public final boolean vpp;
    public Runnable zih;
    public final boolean zin;
    public final Bundle yu = new Bundle();

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public final cf.vt f12128vm = new cf.vt();

    public static class lh implements Runnable {
        private final vpp ouw;

        @Override // java.lang.Runnable
        public final void run() {
            vpp vppVar = this.ouw;
            if (vppVar.f12887zn) {
                return;
            }
            if (vppVar.ey()) {
                ryl.ouw(zih.ouw()).ouw(this.ouw.yiz);
            } else {
                com.bytedance.sdk.openadsdk.component.reward.fkw.ouw(zih.ouw()).ouw(this.ouw.yiz);
            }
        }

        public lh(vpp vppVar) {
            this.ouw = vppVar;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.vt$vt, reason: collision with other inner class name */
    public static abstract class AbstractC0104vt implements Handler.Callback {
        private int bs;

        /* JADX INFO: renamed from: cd, reason: collision with root package name */
        private int f12135cd;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public int f12136cf;
        private boolean ey;
        public int fkw;
        private int fqk;
        private boolean fvf;
        private int hun;
        private boolean jae;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public int f12137jg;
        private final Context jqy;
        private boolean jvy;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public boolean f12138ko;
        private boolean ksc;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public int f12139le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f12140lh;
        private boolean lso;
        public int mwh;

        /* JADX INFO: renamed from: od, reason: collision with root package name */
        private boolean f12141od;
        private int osn;
        public final vt ouw;

        /* JADX INFO: renamed from: pd, reason: collision with root package name */
        private int f12142pd;
        public float pno;
        public boolean qbp;
        private boolean rrs;
        public int ryl;

        /* JADX INFO: renamed from: tc, reason: collision with root package name */
        private boolean f12145tc;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        public boolean f12146th;
        public int tlj;
        private int uoy;
        private boolean uq;
        private int ux;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public int f12147vm;
        private final com.bytedance.sdk.openadsdk.component.reward.top.lh vpp;
        public vpp vt;
        public int yu;
        private final Handler zin = new Handler(Looper.getMainLooper(), this);
        private final int ex = 1000;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public int f12143ra = -1;
        public int bly = 1000;
        private boolean fak = false;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public boolean f12144rn = false;
        public int zih = -1;

        private void ko() {
            pno pnoVarCf;
            this.qbp = true;
            this.f12147vm = 0;
            vt vtVar = this.ouw;
            if (vtVar == null || (pnoVarCf = vtVar.tlj.cf()) == null || pnoVarCf.ucs()) {
                return;
            }
            mwh();
        }

        public final void lh() {
            this.zin.removeMessages(this.f12139le);
        }

        public final int ouw() {
            return this.yu;
        }

        public abstract int ouw(vpp vppVar);

        public final void vt() {
            this.lso = false;
            this.f12146th = false;
            this.f12144rn = false;
            this.bs = 0;
            this.zih = -1;
            this.qbp = false;
            this.hun = 0;
            this.f12147vm = 0;
            this.uoy = 0;
            this.f12138ko = false;
            this.ux = 0;
            this.fak = false;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setShowPlayableNextAd(false, this.vt);
            }
            ko.vt("TTAD.AdSceneManager", "resetPlayableStatus: lastPlayState=" + this.zih);
        }

        private void bly() {
            ko.vt("TTAD.AdSceneManager", "sendPlayableCountDownMessage: startPlayableCountDown=" + this.lso + ",isPlayableLoadingDismiss=" + this.uq + ",isHappenInteraction=" + this.f12138ko);
            if (this.lso) {
                this.f12139le = 4;
                ouw(4, 1000);
            }
        }

        private void cf() {
            if (this.uq && this.lso) {
                if (this.jae) {
                    this.lso = false;
                }
                if (this.fvf) {
                    return;
                }
                ko.vt("TTAD.AdSceneManager", "onPlayableCountDown: playableCountDown=" + this.f12142pd + ",isPlayableLoadingDismiss=" + this.uq + ",isHappenInteraction=" + this.f12138ko + ",isLastAd=" + this.fvf);
                int i10 = this.f12142pd + 1;
                this.f12142pd = i10;
                if (this.f12138ko) {
                    this.mwh = this.ryl;
                } else {
                    this.mwh = this.tlj + this.f12136cf;
                }
                if (i10 >= this.tlj) {
                    if (!this.f12144rn) {
                        this.bs++;
                        this.f12144rn = true;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("click_countdown_remaining", this.yu);
                            jSONObject.put("hint_sequence", this.bs);
                            com.bytedance.sdk.openadsdk.yu.lh.yu(this.vt, this.ouw.tlj.cf().e_(), jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                    com.bytedance.sdk.openadsdk.activity.lh lhVar = this.ouw.tlj;
                    int i11 = this.f12137jg;
                    this.f12137jg = i11 - 1;
                    lhVar.ouw(i11, this.yu);
                    ko.vt("TTAD.AdSceneManager", "wait tips show time = " + this.f12137jg + ",hitSequence =" + this.bs + ",hasHitSequenceAssigned=" + this.f12144rn);
                } else {
                    this.f12144rn = false;
                    this.ouw.tlj.ouw(-1, this.yu);
                }
                if (this.f12138ko && this.f12142pd >= this.f12135cd) {
                    ko.vt("TTAD.AdSceneManager", "next ad  show  = " + this.f12142pd + ",hasShowSkip=" + this.ksc + ",hasShowClose=" + this.jae);
                    if (!this.ksc && !this.jae) {
                        this.vpp.setShowPlayableNextAd(true, this.vt);
                    }
                }
                if (this.f12142pd >= this.mwh) {
                    ko.vt("TTAD.AdSceneManager", "prepare skip to next  ad " + this.f12137jg);
                    if (this.ouw.tlj.cf() != null) {
                        pno pnoVarCf = this.ouw.tlj.cf();
                        if (pnoVarCf instanceof com.bytedance.sdk.openadsdk.activity.fkw) {
                            this.zin.removeMessages(4);
                            ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVarCf).tc();
                        }
                    }
                }
            }
        }

        private void jg() {
            ko.vt("TTAD.AdSceneManager", "onLandingPageCountDownForDialogStyle: lastInteractionTime=" + this.f12147vm + ",showAfterInactivityMs=" + this.fqk + ",hasShowDialog=" + this.qbp + ",popupCount =" + this.ux + ",maxTime =" + this.hun);
            if (this.f12147vm < this.fqk || this.qbp) {
                return;
            }
            int i10 = this.ux;
            if (i10 >= this.hun) {
                this.f12146th = false;
            } else {
                this.ux = i10 + 1;
                ko();
            }
        }

        private void mwh() {
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
            if (this.fvf || this.ksc || this.jae || (lhVar = this.vpp) == null) {
                return;
            }
            lhVar.setShowEndCardNextAd(true, this.vt);
        }

        private void pno() {
            if (this.f12143ra <= 0 || !this.f12141od) {
                return;
            }
            this.f12139le = 3;
            ouw(3, 1000);
        }

        private void ra() {
            int i10 = this.f12143ra;
            if (i10 > 0) {
                this.f12143ra = i10 - 1;
                ko.vt("TTAD.AdSceneManager", "onEndCardCountDownloadFinish: ,endCardTime " + this.f12143ra);
            }
            if (this.f12143ra == 0 && this.f12141od) {
                this.f12141od = false;
                vt vtVar = this.ouw;
                if (vtVar == null || vtVar.tlj.cf() == null) {
                    return;
                }
                pno pnoVarCf = this.ouw.tlj.cf();
                if (pnoVarCf instanceof com.bytedance.sdk.openadsdk.activity.fkw) {
                    ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVarCf).tc();
                }
            }
        }

        private void ryl() {
            if (this.uq && this.f12146th && !this.fvf) {
                ko.vt("TTAD.AdSceneManager", "onCountDownLPStart: countDownNew=" + this.uoy + ",lastInteractionTime=" + this.f12147vm + ",countDown=" + this.yu + ",isHappenInteraction =" + this.f12138ko);
                int i10 = this.uoy + 1;
                this.uoy = i10;
                this.f12147vm = this.f12147vm + 1;
                if (this.f12138ko && i10 >= this.osn) {
                    mwh();
                }
                if (this.rrs || this.ey) {
                    jg();
                }
            }
        }

        private void tlj() {
            if (this.ouw.tlj.yu()) {
                this.vpp.showSkipButton();
                this.ksc = true;
            } else {
                this.jae = true;
                this.vpp.showCloseButton();
            }
            this.vpp.setShowPlayableNextAd(false, this.vt);
            ko.vt("TTAD.AdSceneManager", "onCountDownFinish: hasShowSkip=" + this.ksc + ", hasShowClose=" + this.jae);
        }

        public final void fkw() {
            ko.vt("TTAD.AdSceneManager", "onPlaybleLoadingDismiss countDownload =" + this.yu + ",waitTipsTime=" + this.tlj + ",changeToNextTime=" + this.f12136cf + ",nextAdTipsShowTime=" + this.f12135cd + ",maxShowTime=" + this.ryl);
            this.uq = true;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i10 = message.what;
            if (i10 == 1 || i10 == 2) {
                ouw(message);
            } else if (i10 == 3) {
                if (this.f12143ra > 0) {
                    ra();
                    if (this.f12143ra >= 0) {
                        ouw(message.what, 1000);
                    }
                }
            } else if (i10 == 4) {
                if (this.lso) {
                    cf();
                    if (this.lso && !this.fvf) {
                        ouw(message.what, 1000);
                    }
                }
            } else if (i10 == 5 && this.f12146th) {
                ryl();
                if (this.f12146th && !this.fvf) {
                    ouw(message.what, 1000);
                }
            }
            return true;
        }

        public final void le() {
            ko.vt("TTAD.AdSceneManager", "onDialogHide: ");
            if (this.f12146th) {
                mwh();
                this.qbp = false;
            }
        }

        public final void lh(int i10) {
            this.f12143ra = i10;
            if (i10 > 0) {
                this.f12141od = true;
                if (this.yu <= 0 || this.ksc) {
                    pno();
                }
            }
        }

        public final void ouw(int i10) {
            ko.vt("TTAD.AdSceneManager", "pause: " + this.yu + ",hasShowSkip =" + this.ksc + ",hasShowClose=" + this.jae + ",msgType =" + this.f12139le + ",playState=" + i10);
            if (i10 != -1) {
                this.zih = i10;
            }
            this.zin.removeMessages(this.f12139le);
        }

        public final void yu() {
            if (this.ksc || this.jae) {
                return;
            }
            ouw(-1);
            this.fak = true;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setCountDownFor1InN("", -1);
                this.vpp.setShowEndCardNextAd(true, this.vt);
            }
        }

        public AbstractC0104vt(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            this.ouw = vtVar;
            this.vt = vppVar;
            this.vpp = lhVar;
            this.jqy = lhVar.getContext();
            this.yu = ouw(vppVar);
        }

        private void ouw(@NonNull Message message) {
            int i10 = this.yu;
            if (i10 > 0) {
                int i11 = this.fkw;
                int i12 = (int) ((((double) (i11 - i10)) * 100.0d) / ((double) i11));
                com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
                StringBuilder sb2 = new StringBuilder();
                int i13 = this.yu;
                this.yu = i13 - 1;
                sb2.append(i13);
                sb2.append("s");
                lhVar.setCountDownFor1InN(sb2.toString(), i12);
                ra();
                cf();
                if (this.yu >= 0) {
                    ouw(message.what, this.bly);
                }
                ryl();
                return;
            }
            pno();
            bly();
            ouw(true);
            tlj();
        }

        public final void vt(int i10) {
            if (this.zih == 2 && i10 != 1) {
                ko.vt("TTAD.AdSceneManager", "resume: pause by state is pause ,but resume is not by play");
                return;
            }
            if (i10 != -1) {
                this.zih = i10;
            }
            if (this.zin.hasMessages(this.f12139le)) {
                ko.vt("TTAD.AdSceneManager", "resume: has already msgType =" + this.f12139le);
                return;
            }
            if (this.fak) {
                ko.vt("TTAD.AdSceneManager", "resume: pause by endcard show,need not resume ");
                return;
            }
            vt vtVar = this.ouw;
            if (vtVar == null || vtVar.tlj.cf() == null || this.ouw.tlj.cf().ksc() == null || !this.ouw.tlj.cf().ksc().f12372cf.get()) {
                ko.vt("TTAD.AdSceneManager", "resume: countDownSeconds =" + this.yu + ",hasShowSkip =" + this.ksc + ",newState=" + i10 + ",msgType =" + this.f12139le + ",lastPlayState =" + this.zih);
                int i11 = this.f12139le;
                if (i11 == 1 || i11 == 2) {
                    if (this.yu < 0 || this.ksc || this.jae) {
                        return;
                    }
                    this.zin.sendEmptyMessageDelayed(i11, this.bly);
                    return;
                }
                if (i11 == 3) {
                    pno();
                } else if (i11 == 4) {
                    bly();
                } else if (i11 == 5) {
                    ouw(true);
                }
            }
        }

        private void ouw(int i10, int i11) {
            if (this.fak) {
                ko.vt("TTAD.AdSceneManager", "sendNextMessageDelayInterval: isPause=" + this.fak);
            } else {
                this.zin.removeMessages(i10);
                this.zin.sendEmptyMessageDelayed(i10, i11);
            }
        }

        private void ouw(boolean z10) {
            if (this.f12146th) {
                this.f12139le = 5;
                if (z10) {
                    ouw(5, 1000);
                } else {
                    this.zin.sendEmptyMessage(5);
                }
            }
        }

        public final void ouw(vpp vppVar, boolean z10) {
            this.tlj = od.mwh(vppVar);
            this.f12136cf = od.rn(vppVar);
            od odVarOuw = od.ouw(vppVar);
            this.f12135cd = odVarOuw == null ? 0 : odVarOuw.f12785jg;
            od odVarOuw2 = od.ouw(vppVar);
            this.ryl = odVarOuw2 == null ? 0 : odVarOuw2.f12786ko;
            this.f12137jg = this.f12136cf;
            this.uq = false;
            this.f12138ko = false;
            this.f12142pd = 0;
            this.lso = true;
            com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = this.vpp;
            if (lhVar != null) {
                lhVar.setShowPlayableNextAd(false, vppVar);
            }
            this.fvf = z10;
            if (this.yu <= 0 || this.ksc) {
                bly();
            }
            ko.vt("TTAD.AdSceneManager", "onCountDownPlayable: waitTipsTime=" + this.tlj + ",changeToNextTime=" + this.f12136cf + ",nextAdTipsShowTime=" + this.f12135cd + ",maxShowTime=" + this.ryl);
        }

        public final void ouw(pno pnoVar) {
            vpp vppVar;
            jqy jqyVar;
            if (pnoVar == null || (vppVar = pnoVar.f12108le) == null || (jqyVar = vppVar.f12854jg) == null) {
                return;
            }
            this.osn = jqyVar.f12761lh;
            this.fvf = pnoVar.zih;
            this.hun = jqyVar.ouw;
            this.jvy = pnoVar.f12110rn;
            this.fqk = jqyVar.vt;
            this.ey = th.le(vppVar);
            this.rrs = th.fkw(pnoVar.f12108le);
            this.f12146th = true;
            if ((this.yu <= 0 || this.ksc) && !this.zin.hasMessages(5)) {
                ouw(false);
            }
        }

        public void ouw(int i10, vpp vppVar) {
            cd cdVar;
            if (vppVar != null && (cdVar = vppVar.f12879tj) != null) {
                this.pno = cdVar.ouw;
                this.vt = vppVar;
            }
            ko.vt("TTAD.AdSceneManager", "onSceneChanged: newTotalVideoDuration=" + i10 + ", countDownSeconds=" + this.yu + ", hasShowSkip=" + this.ksc + ", hasShowClose=" + this.jae + ", msgType=" + this.f12139le);
            if (this.ksc || this.jae) {
                return;
            }
            float f10 = i10;
            this.f12140lh = f10;
            int i11 = this.f12139le;
            if (f10 <= this.yu) {
                this.f12139le = 2;
                this.yu = (int) f10;
            } else if (i11 == 0) {
                this.f12139le = 1;
            }
            if (!this.f12145tc) {
                this.fkw = this.yu;
                this.f12145tc = true;
            }
            int i12 = this.f12139le;
            if (i11 == i12 && this.zin.hasMessages(i12)) {
                return;
            }
            this.zin.removeCallbacksAndMessages(null);
            this.zin.sendEmptyMessage(this.f12139le);
        }
    }

    public static class yu extends AbstractC0104vt {
        private boolean jqy;
        private int vpp;
        private final int zin;

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0104vt
        public final void ouw(int i10, vpp vppVar) {
            boolean z10 = this.f12139le == 0;
            int i11 = this.yu;
            super.ouw(i10, vppVar);
            if (!z10) {
                if (this.f12140lh < i11) {
                    this.vpp = (int) ((1.0f - (this.zin / 100.0f)) * this.yu);
                    return;
                }
                return;
            }
            if (this.f12139le == 1) {
                this.vpp = 3;
            } else {
                this.vpp = (int) ((1.0f - (this.zin / 100.0f)) * this.f12140lh);
            }
            tlj tljVar = this.ouw.f12123le;
            if (tljVar != null) {
                tljVar.ouw(this.yu);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0104vt, android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            if (!this.jqy && this.yu <= this.vpp) {
                this.jqy = true;
                pno pnoVarCf = this.ouw.tlj.cf();
                if (pnoVarCf != null) {
                    pnoVarCf.ub();
                }
            }
            super.handleMessage(message);
            return true;
        }

        public yu(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            super(vtVar, vppVar, lhVar);
            if (vppVar != null) {
                int i10 = vppVar.myk;
                if (i10 >= 0) {
                    this.zin = Math.min(100, i10);
                    return;
                } else {
                    zih.yu();
                    this.zin = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(vppVar.fqk())).f13074le;
                    return;
                }
            }
            this.zin = 100;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0104vt
        public final int ouw(vpp vppVar) {
            ex exVar;
            if (vppVar != null) {
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = vppVar.f12885vm;
                if (ouwVar != null && (exVar = ouwVar.f12793le) != null) {
                    return exVar.f12747le;
                }
                String strValueOf = null;
                AdSlot adSlot = vppVar.yiz;
                if (adSlot != null) {
                    strValueOf = adSlot.getCodeId();
                } else {
                    int iFqk = vppVar.fqk();
                    if (iFqk != 0) {
                        strValueOf = String.valueOf(iFqk);
                    }
                }
                if (strValueOf != null) {
                    zih.yu();
                    return com.bytedance.sdk.openadsdk.core.settings.cf.qbp(strValueOf).ryl;
                }
            }
            return 30;
        }
    }

    public final void fkw() {
        this.f12122ko = true;
        this.tlj.rn();
    }

    public final Activity lh() {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        return lhVar == null ? this.ryl : lhVar.ouw;
    }

    public final boolean ouw() {
        if (this.f12124lh != null && this.bly) {
            return this.jqy || this.f12120cf;
        }
        return false;
    }

    public final void vt() {
        Activity activity = this.ryl;
        if (activity != null) {
            activity.finish();
        }
    }

    public static class fkw {
        public boolean fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f12134lh;
        public final Bundle ouw = new Bundle();
        public final int vt;
        public boolean yu;

        public fkw(int i10, com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
            this.vt = i10;
            this.f12134lh = ouwVar;
        }

        public final String toString() {
            return super.toString();
        }
    }

    public static class ouw extends AbstractC0104vt {
        @Override // com.bytedance.sdk.openadsdk.activity.vt.AbstractC0104vt
        public final int ouw(vpp vppVar) {
            ex exVar;
            if (vppVar != null) {
                com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = vppVar.f12885vm;
                if (ouwVar != null && (exVar = ouwVar.f12793le) != null) {
                    return exVar.f12747le;
                }
                String strValueOf = null;
                AdSlot adSlot = vppVar.yiz;
                if (adSlot != null) {
                    strValueOf = adSlot.getCodeId();
                } else {
                    int iFqk = vppVar.fqk();
                    if (iFqk != 0) {
                        strValueOf = String.valueOf(iFqk);
                    }
                }
                if (strValueOf != null) {
                    zih.yu();
                    return com.bytedance.sdk.openadsdk.core.settings.cf.jg(strValueOf);
                }
            }
            return 5;
        }

        public ouw(vt vtVar, vpp vppVar, com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar) {
            super(vtVar, vppVar, lhVar);
        }
    }

    public final void yu() {
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = this.f12125ra;
        if (ouwVar != null) {
            ouwVar.onAdClicked();
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar = this.pno;
        if (vtVar != null) {
            vtVar.onAdClicked();
        }
    }

    public vt(Activity activity, vpp vppVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f12124lh = vppVar;
        this.qbp = z10;
        this.ryl = activity;
        boolean zBly = com.bytedance.sdk.openadsdk.vpp.ouw.bly();
        this.vpp = zBly;
        qbp.ouw("BVA", "AdSceneManager() called with: enableIvRvTopBarNewArch = [" + zBly + C3426d4.j.f28588e);
        this.fkw = new com.bytedance.sdk.openadsdk.mwh.bly(activity.getApplicationContext());
        boolean z13 = vppVar.tpk;
        this.bly = z13;
        if (z13 && 39 == vppVar.fvf) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.jqy = z11;
        if (z13 && 40 == vppVar.fvf) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f12120cf = z12;
        int i10 = vppVar.fvf;
        if (i10 != 43 && i10 != 44) {
            this.tlj = new bly(this.ryl, vppVar, this);
        } else {
            this.tlj = new com.bytedance.sdk.openadsdk.activity.yu(this.ryl, vppVar, this);
        }
        boolean z14 = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("adapt_decor_size", 0) == 1;
        this.zin = z14;
        qbp.ouw("BVA", "scene manager isAdaptDecorSize =" + z14);
        this.tlj.ouw();
        if (vppVar.ey()) {
            this.f12123le = new tlj(new tlj.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.vt.1
                @Override // com.bytedance.sdk.openadsdk.component.reward.tlj.ouw
                public final void ouw() {
                    pno pnoVarCf;
                    if (vt.this.yu.getBoolean("reward_verify", false)) {
                        return;
                    }
                    vt vtVar = vt.this;
                    if (vtVar.f12126rn || vtVar.yu.getBoolean("user_has_give_up_reward", false) || (pnoVarCf = vt.this.tlj.cf()) == null) {
                        return;
                    }
                    pnoVarCf.lh(1);
                }
            });
        }
    }

    public final void vt(pno pnoVar) {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(pnoVar, true);
    }

    public final void lh(pno pnoVar) {
        pnoVar.ouw(this.ryl, this.f12121jg);
        int i10 = this.mwh;
        if (i10 == 2) {
            pnoVar.mwh();
            return;
        }
        if (i10 == 3) {
            pnoVar.mwh();
            pnoVar.lh();
            pnoVar.vt(true);
        } else if (i10 == 4) {
            pnoVar.vt(false);
            pnoVar.jg();
        } else {
            if (i10 != 5) {
                return;
            }
            pnoVar.yu();
        }
    }

    public final void ouw(pno pnoVar, fkw fkwVar) {
        this.tlj.ouw(pnoVar, null, fkwVar);
    }

    public final void ouw(final pno pnoVar, final boolean z10, final int i10, final String str, final int i11, final String str2) {
        Activity activity;
        if (!this.f12122ko) {
            this.zih = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    vt.this.ouw(pnoVar, z10, i10, str, i11, str2);
                }
            };
            return;
        }
        if (this.f12126rn) {
            return;
        }
        this.f12126rn = true;
        tlj tljVar = this.f12123le;
        if (tljVar != null) {
            tljVar.ouw = true;
        }
        if (this.f12125ra == null || (activity = this.ryl) == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.vt.3
            @Override // java.lang.Runnable
            public final void run() {
                vt.this.f12125ra.ouw(z10, i10, str, i11, str2);
            }
        });
        if (this.bly) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), pnoVar.f12108le, pnoVar.e_(), z10 ? "reward_success" : "reward_fail");
        }
    }

    public final void vt(pno pnoVar, fkw fkwVar) {
        this.tlj.ouw(pnoVar, fkwVar);
    }

    public final void ouw(pno pnoVar) {
        com.bytedance.sdk.openadsdk.activity.lh lhVar = this.tlj;
        if (lhVar == null) {
            return;
        }
        lhVar.ouw(pnoVar);
    }

    public final void ouw(View view) {
        this.tlj.ouw(view);
    }

    public final void ouw(View view, boolean z10) {
        this.tlj.ouw(view, z10);
    }

    public final void ouw(int i10) {
        this.tlj.ouw(i10);
    }

    public final void ouw(pno pnoVar, int i10) {
        this.tlj.vt(pnoVar, i10);
    }

    public final void ouw(pno pnoVar, boolean z10, boolean z11, boolean z12, int i10) {
        this.tlj.ouw(pnoVar, z10, z11, z12, i10);
    }
}
