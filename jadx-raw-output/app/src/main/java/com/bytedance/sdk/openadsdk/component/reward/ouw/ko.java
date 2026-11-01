package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.R;
import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.internal.d;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ko {
    public boolean bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f12350cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12351cf;
    private FrameLayout ex;
    public final boolean fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public long f12352jg;
    private final vpp jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public String f12353ko;
    private long ksc;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f12356od;
    public long ouw;
    public long pno;
    public com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh f12357ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public final ouw f12358rn;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private final String f12359tc;
    public boolean tlj;
    private final Activity vpp;
    public boolean yu;
    public com.bytedance.sdk.openadsdk.yu.ra zin;
    public boolean vt = false;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f12355lh = false;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f12354le = false;
    public long ryl = -1;
    public int mwh = -1;
    public boolean zih = false;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f12361vm = 0;
    private float uq = 1.0f;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public boolean f12360th = false;
    private HashSet<String> jae = new HashSet<>();

    public final void le() {
        this.vt = true;
    }

    public final void ouw(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.yu.ra raVar) {
        if (this.f12356od) {
            return;
        }
        this.f12356od = true;
        this.ex = frameLayout;
        vpp vppVar = this.jqy;
        cd cdVar = vppVar.f12879tj;
        if (cdVar != null) {
            this.f12361vm = cdVar.vt;
            this.uq = cdVar.ouw;
        }
        this.zin = raVar;
        if (!vpp.fkw(vppVar)) {
            this.f12360th = false;
            com.bytedance.sdk.openadsdk.component.reward.lh lhVar = new com.bytedance.sdk.openadsdk.component.reward.lh(this.jqy, raVar);
            this.f12357ra = lhVar;
            com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw interfaceC0131ouw = this.qbp;
            if (interfaceC0131ouw != null) {
                lhVar.vt = interfaceC0131ouw;
                return;
            }
            return;
        }
        this.f12360th = true;
        this.f12357ra = new com.bytedance.sdk.openadsdk.core.mwh.yu.ouw(this.vpp, this.ex, this.jqy, raVar);
        ouw(this.f12350cd);
        com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0131ouw interfaceC0131ouw2 = this.qbp;
        if (interfaceC0131ouw2 != null) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.f12357ra).ucs = interfaceC0131ouw2;
        }
        ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.f12357ra).wp = this.f12351cf;
    }

    public final void vm() {
        this.zih = false;
        bly();
    }

    public final boolean vt() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        return lhVar != null && lhVar.jqy();
    }

    private boolean jae() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            if (lhVar.zin() != null) {
                com.bykv.vk.openvk.ouw.ouw.ouw.ouw ouwVarZin = this.f12357ra.zin();
                if (ouwVarZin.ra() || ouwVarZin.pno()) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar2 = this.f12357ra;
                    if (lhVar2 instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                        ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar2).rrs();
                    }
                    return true;
                }
            } else if (this.vt) {
                this.vt = false;
                com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar3 = this.f12357ra;
                if (lhVar3 instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
                    ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar3).rrs();
                }
                return true;
            }
        }
        return false;
    }

    private void ksc() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar == null || lhVar.zin() == null) {
            return;
        }
        this.ouw = this.f12357ra.rn();
        if (this.f12357ra.zin().lh() || !this.f12357ra.zin().vt()) {
            this.f12357ra.cf();
            this.f12357ra.mwh();
            this.vt = true;
        }
    }

    private void od() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).hun();
        }
    }

    private void vt(long j10, long j11) {
        int iAbs = (int) Math.abs(((long) this.mwh) - j10);
        int i10 = this.mwh;
        if (i10 < 0 || iAbs > 500 || i10 > j11 || iAbs >= 500 || this.jae.contains(this.f12353ko)) {
            return;
        }
        if (this.mwh > j10) {
            com.bytedance.sdk.openadsdk.core.jg.lh().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ko.1
                @Override // java.lang.Runnable
                public final void run() {
                    ko.this.th();
                    ko koVar = ko.this;
                    koVar.f12358rn.jae.ouw(koVar.mwh, koVar.f12353ko);
                }
            }, iAbs);
        } else {
            th();
            this.f12358rn.jae.ouw(this.mwh, this.f12353ko);
        }
        this.jae.add(this.f12353ko);
    }

    public final void bly() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar == null) {
            return;
        }
        lhVar.mwh();
        this.f12357ra = null;
    }

    public final void cf() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            lhVar.ryl();
        }
    }

    public final void ex() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).ux();
        }
    }

    public final long fkw() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        return lhVar != null ? lhVar.rn() : this.ouw;
    }

    public final int jg() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            return lhVar.vm();
        }
        return 0;
    }

    public final View jqy() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            return (View) ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).fqk();
        }
        return null;
    }

    public final long ko() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            return lhVar.th() + this.f12357ra.zih();
        }
        return 0L;
    }

    public final com.bykv.vk.openvk.ouw.ouw.ouw.vt.ouw lh() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            return lhVar instanceof com.bytedance.sdk.openadsdk.component.reward.lh ? ((com.bytedance.sdk.openadsdk.component.reward.lh) lhVar).ouw : lhVar.vpp();
        }
        return null;
    }

    public final int mwh() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            return lhVar.qbp();
        }
        return 0;
    }

    public final long pno() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            return lhVar.zih();
        }
        return 0L;
    }

    public final boolean qbp() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar == null || lhVar.zin() == null) {
            return false;
        }
        return this.f12357ra.zin().ouw();
    }

    public final long rn() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            return lhVar.th();
        }
        return 0L;
    }

    public final void ryl() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            lhVar.cf();
        }
    }

    public final void tc() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            lhVar.bly();
        }
    }

    public final void tlj() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            lhVar.ko();
        }
    }

    public final void vpp() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).ey();
        }
    }

    public final boolean yu() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        return (lhVar == null || lhVar.zin() == null || !this.f12357ra.zin().ra()) ? false : true;
    }

    public final void zih() {
        int i10 = this.f12361vm;
        if (i10 == 1 || i10 == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                ouw(jSONObject);
            } catch (Throwable th2) {
                qbp.ouw("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    public final double zin() {
        double d10;
        long j10;
        com.bytedance.sdk.openadsdk.component.reward.tlj tljVar;
        vpp vppVar = this.jqy;
        com.bytedance.sdk.openadsdk.core.model.qbp qbpVar = vppVar.kq;
        if (!th.yu(vppVar) || qbpVar == null) {
            if (!th.ra(this.jqy) || qbpVar == null) {
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = this.jqy.f12874sd;
                d10 = vtVar != null ? vtVar.yu * ((double) vtVar.f10461th) : 0.0d;
            } else {
                j10 = qbpVar.yu;
            }
            tljVar = this.f12358rn.ycd;
            if (tljVar != null) {
                tljVar.ouw((long) d10);
            }
            return d10;
        }
        j10 = qbpVar.vt;
        d10 = j10;
        tljVar = this.f12358rn.ycd;
        if (tljVar != null) {
            tljVar.ouw((long) d10);
        }
        return d10;
    }

    public ko(ouw ouwVar) {
        this.f12358rn = ouwVar;
        this.vpp = ouwVar.jvy;
        this.jqy = ouwVar.vt;
        this.fkw = ouwVar.yu;
        this.f12359tc = ouwVar.fkw;
    }

    public final void ra() {
        try {
            if (ouw()) {
                this.f12357ra.cf();
            }
        } catch (Throwable th2) {
            qbp.yu("RewardFullVideoPlayerManager onPause throw Exception :" + th2.getMessage(), new Object[0]);
        }
    }

    public final void th() {
        try {
            if (ouw()) {
                this.f12354le = true;
                ryl();
            }
        } catch (Exception e10) {
            qbp.lh("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e10.getMessage());
        }
    }

    private void vt(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        if (!jae() || vtVar == null) {
            return;
        }
        vtVar.ouw(this.ouw, true);
    }

    public final boolean ouw() {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        return (lhVar == null || lhVar.zin() == null || !this.f12357ra.zin().le()) ? false : true;
    }

    public final void ouw(long j10, long j11) {
        this.pno = j10;
        vt(j10, j11);
    }

    public final void ouw(int i10, int i11) {
        if (this.f12357ra != null) {
            com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.yu.fkw.vt.ko.ouw();
            ouwVar.vt = pno();
            ouwVar.vt(ko());
            ouwVar.ouw(fkw());
            ouwVar.pno = i10;
            ouwVar.bly = i11;
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.yu(this.f12357ra.vpp(), ouwVar);
        }
    }

    public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            lhVar.ouw(ouwVar);
        }
    }

    public final void ouw(boolean z10, String str) {
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar != null) {
            lhVar.ouw(z10, str);
        }
    }

    public final void ouw(String str, boolean z10) {
        if (this.f12357ra != null) {
            long jFkw = fkw();
            if (this.jqy.ryl()) {
                jFkw = this.f12358rn.ouw();
            }
            long j10 = jFkw;
            JSONObject jSONObjectOuw = uoy.ouw(this.jqy, this.f12357ra.zih(), this.f12357ra.zin());
            try {
                jSONObjectOuw.put("auto_click", z10);
                if (!z10) {
                    ouw ouwVar = this.f12358rn;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(jSONObjectOuw, ouwVar.yu ? ouwVar.vt.ng() : ouwVar.vt.myk(), (int) j10);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.jqy, this.f12359tc, str, j10, mwh(), jSONObjectOuw, this.zin);
            com.bytedance.sdk.component.utils.ko.vt("TTAD.RFVideoPlayerMag", "event tag:" + this.f12359tc + ", TotalPlayDuration=" + ko() + ",mBasevideoController.getPct()=" + mwh());
        }
        od();
    }

    public final void ouw(com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        if (this.f12358rn.tlj.get()) {
            return;
        }
        ouw ouwVar = this.f12358rn;
        if (!ouwVar.pv || od.lh(ouwVar.vt)) {
            return;
        }
        if (!vpp.fkw(this.f12358rn.vt)) {
            com.bytedance.sdk.openadsdk.core.zih.yu();
            if (com.bytedance.sdk.openadsdk.core.settings.cf.bly(String.valueOf(this.f12358rn.f12378le)) == 1 && this.f12358rn.jae.fkw) {
                return;
            }
        }
        if (th.yu(this.f12358rn.vt) || th.ra(this.f12358rn.vt) || this.f12354le || !vtVar.le()) {
            return;
        }
        this.f12358rn.ux.removeMessages(d.f44769a);
        Message messageObtain = Message.obtain();
        messageObtain.what = d.f44769a;
        this.f12358rn.ux.sendMessageDelayed(messageObtain, 5000L);
    }

    public final boolean ouw(JSONObject jSONObject) {
        int i10;
        cd cdVar;
        if (this.f12357ra != null && jSONObject != null && ((i10 = this.f12361vm) == 1 || i10 == 2)) {
            int iOptInt = jSONObject.optInt("switch", 0);
            float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
            this.uq = fOptDouble;
            if (fOptDouble <= 0.0f && (cdVar = this.f12358rn.vt.f12879tj) != null) {
                this.uq = cdVar.ouw;
            }
            if (iOptInt == 0) {
                this.uq = 1.0f;
                if (this.zih) {
                    long jCurrentTimeMillis = this.f12352jg + (System.currentTimeMillis() - this.ksc);
                    this.f12352jg = jCurrentTimeMillis;
                    com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
                    if (lhVar != null) {
                        lhVar.ouw(jCurrentTimeMillis);
                    }
                    com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = this.f12358rn.fqk;
                    if (vtVar != null) {
                        vtVar.lh(false);
                    }
                }
            } else if (iOptInt == 1 && !this.zih) {
                this.ksc = System.currentTimeMillis();
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar2 = this.f12358rn.fqk;
                if (vtVar2 != null) {
                    vtVar2.lh(true);
                }
            }
            this.zih = iOptInt == 1;
            if (this.f12361vm == 1) {
                return true;
            }
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar2 = this.f12357ra;
            if (lhVar2 == null) {
                return false;
            }
            return lhVar2.ouw(this.uq);
        }
        this.zih = false;
        return false;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        try {
            this.f12354le = false;
            if (this.vt) {
                ksc();
                vt(vtVar);
            } else if (yu()) {
                cf();
            }
        } catch (Throwable th2) {
            qbp.lh("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th2.getMessage());
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, boolean z10) {
        if (this.tlj || (z10 && !this.f12354le)) {
            if (yu()) {
                cf();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                ksc();
                vt(vtVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.tlj = false;
        }
    }

    public final void ouw(boolean z10) {
        this.f12350cd = z10;
        com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
        if (lhVar instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) {
            if (z10) {
                ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) lhVar).ey = this.jqy.f12874sd.f10461th;
            } else {
                this.jqy.f12874sd.ouw(1);
                ((com.bytedance.sdk.openadsdk.core.mwh.yu.ouw) this.f12357ra).ey = 1;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    public final boolean ouw(long j10, boolean z10, final Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar) {
        boolean z11;
        boolean zOuw;
        final View viewFindViewById;
        if (!(this.f12357ra != null)) {
            ouw ouwVar = this.f12358rn;
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar.vt, "show_ad_fail", ouwVar.fkw, "video_controller_not_ready");
            return false;
        }
        if (th.yu(this.f12358rn.vt) || th.ra(this.f12358rn.vt)) {
            return true;
        }
        if (z10) {
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = this.f12357ra;
            if (!(lhVar != null && lhVar.zin() == null)) {
                ouw(vtVar);
            }
        } else {
            ouw(vtVar);
        }
        try {
            boolean z12 = this.f12358rn.f12373cj;
            if (this.f12357ra != null) {
                vpp vppVar = this.jqy;
                if (vppVar.f12874sd != null) {
                    String strOuw = CacheDirFactory.getICacheDir(vppVar.f12875sm).ouw();
                    File file = new File(strOuw, this.jqy.f12874sd.ouw());
                    if (file.exists() && file.length() > 0) {
                        this.f12355lh = true;
                    }
                    com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(strOuw, this.jqy);
                    vtVarOuw.f10445le = this.jqy.pv;
                    vtVarOuw.f10448ra = this.ex.getWidth();
                    vtVarOuw.pno = this.ex.getHeight();
                    vtVarOuw.bly = this.jqy.yhj;
                    vtVarOuw.tlj = j10;
                    vtVarOuw.f10442cf = z12;
                    zOuw = this.f12357ra.ouw(vtVarOuw);
                } else {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.RFVideoPlayerMag", "playVideo controller is Empty");
                    zOuw = false;
                }
            } else {
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFVideoPlayerMag", "playVideo controller is Empty");
                zOuw = false;
            }
            try {
                this.bly = false;
            } catch (Exception e10) {
                z11 = zOuw;
                e = e10;
                Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
                zOuw = z11;
            }
        } catch (Exception e11) {
            e = e11;
            z11 = false;
        }
        if (zOuw && !z10) {
            final tlj tljVar = this.f12358rn.f12371cd;
            if (!tljVar.ouw.mwh.get()) {
                com.bytedance.sdk.openadsdk.activity.pno pnoVar = tljVar.ouw.f12374gh;
                if (pnoVar != null && (pnoVar.hun().tlj instanceof com.bytedance.sdk.openadsdk.activity.yu)) {
                    ouw ouwVar2 = tljVar.ouw;
                    if (ouwVar2.pv || ouwVar2.f12374gh.f12111th) {
                        if (tljVar.ouw.mwh.compareAndSet(false, true)) {
                            viewFindViewById = tljVar.ouw.jvy.findViewById(R.id.content);
                            if (viewFindViewById == null) {
                                viewFindViewById = tljVar.ouw.jvy.getWindow().getDecorView();
                            }
                            viewFindViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.tlj.2
                                public final /* synthetic */ Map ouw;
                                public final /* synthetic */ View vt;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean z13;
                                    int iFkw;
                                    Map map2;
                                    JSONObject jSONObject = null;
                                    try {
                                        jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("width", view.getWidth());
                                        jSONObject2.put("height", view.getHeight());
                                        jSONObject2.put("alpha", view.getAlpha());
                                        jSONObject.put("root_view", jSONObject2.toString());
                                    } catch (Throwable th2) {
                                        qbp.ouw("TTAD.RFReportManager", "run: ", th2);
                                    }
                                    JSONObject jSONObject3 = jSONObject;
                                    if (tlj.this.ouw.jae == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                                        z13 = false;
                                        iFkw = -1;
                                    } else {
                                        iFkw = tlj.this.ouw.jae.fkw();
                                        z13 = true;
                                    }
                                    tlj tljVar2 = tlj.this;
                                    tljVar2.ouw(jSONObject3, tljVar2.vt(), z13, iFkw, false);
                                }

                                public AnonymousClass2() {
                                    map = map;
                                    view = viewFindViewById;
                                }
                            });
                        }
                    }
                } else if (tljVar.ouw.mwh.compareAndSet(false, true)) {
                    viewFindViewById = tljVar.ouw.jvy.findViewById(R.id.content);
                    if (viewFindViewById == null) {
                        viewFindViewById = tljVar.ouw.jvy.getWindow().getDecorView();
                    }
                    viewFindViewById.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.tlj.2
                        public final /* synthetic */ Map ouw;
                        public final /* synthetic */ View vt;

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z13;
                            int iFkw;
                            Map map2;
                            JSONObject jSONObject = null;
                            try {
                                jSONObject = map != null ? new JSONObject(map) : new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("width", view.getWidth());
                                jSONObject2.put("height", view.getHeight());
                                jSONObject2.put("alpha", view.getAlpha());
                                jSONObject.put("root_view", jSONObject2.toString());
                            } catch (Throwable th2) {
                                qbp.ouw("TTAD.RFReportManager", "run: ", th2);
                            }
                            JSONObject jSONObject3 = jSONObject;
                            if (tlj.this.ouw.jae == null || (map2 = map) == null || !map2.containsKey("dynamic_show_type")) {
                                z13 = false;
                                iFkw = -1;
                            } else {
                                iFkw = tlj.this.ouw.jae.fkw();
                                z13 = true;
                            }
                            tlj tljVar2 = tlj.this;
                            tljVar2.ouw(jSONObject3, tljVar2.vt(), z13, iFkw, false);
                        }

                        public AnonymousClass2() {
                            map = map;
                            view = viewFindViewById;
                        }
                    });
                }
            }
        } else if (!zOuw) {
            ouw ouwVar3 = this.f12358rn;
            com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar3.vt, "show_ad_fail", ouwVar3.fkw, "video_play_fail");
        }
        return zOuw;
    }
}
