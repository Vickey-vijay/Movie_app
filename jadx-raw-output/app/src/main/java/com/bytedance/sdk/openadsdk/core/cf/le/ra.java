package com.bytedance.sdk.openadsdk.core.cf.le;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.cf;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.core.bly.ko;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3605n2;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ra extends yu {
    private float bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private float f12613cd;
    private boolean fvf;
    private com.bytedance.adsdk.ugeno.vt.lh jae;
    private com.bytedance.adsdk.ugeno.vt.lh ksc;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.fkw f12614od;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private float f12615pd;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.vt.lh f12616tc;
    private boolean uq;

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public JSONObject ouw() {
        JSONObject jSONObjectOuw = this.f12625le.ouw();
        if (jSONObjectOuw != null) {
            return jSONObjectOuw.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setSoundMute(boolean z10) {
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        if (this.f12626lh == null) {
            return;
        }
        int i14 = 0;
        boolean z11 = i10 == 1;
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.jae;
        if (lhVar != null && (lhVar instanceof com.bytedance.sdk.openadsdk.core.cf.vt.lh.lh)) {
            try {
                i13 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                qbp.yu("UGenRender", "parse duration exception", charSequence);
                i13 = 0;
            }
            if (z10 || i13 <= 0 || z11) {
                ((com.bytedance.sdk.openadsdk.core.cf.vt.lh.lh) this.jae).vt(8);
            } else {
                if (this.fvf) {
                    this.f12615pd = i11;
                    this.fvf = false;
                }
                float f10 = (float) (((double) this.bs) + ((0.5d / ((double) this.f12615pd)) * 100.0d));
                this.bs = f10;
                this.ouw.vt(this.f12626lh, "ProgressBar://progress", Float.valueOf(f10), Float.valueOf(this.f12613cd));
                ((com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw) ((com.bytedance.sdk.openadsdk.core.cf.vt.lh.lh) this.jae).fkw).setAnimationDuration(500);
                ((com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw) ((com.bytedance.sdk.openadsdk.core.cf.vt.lh.lh) this.jae).fkw).setProgress((int) this.bs);
            }
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVar2 = this.f12616tc;
        if (lhVar2 != null && (lhVar2 instanceof com.bytedance.sdk.openadsdk.core.cf.vt.vt)) {
            try {
                i12 = Integer.parseInt((String) charSequence);
            } catch (Exception unused2) {
                qbp.yu("UGenRender", "parse duration exception", charSequence);
                i12 = 0;
            }
            if (z10 || i12 <= 0 || this.uq) {
                this.f12616tc.vt(8);
            } else {
                this.f12616tc.vt(0);
                if (!z11) {
                    ouw ouwVar = this.f12625le;
                    if (ouwVar.f11604vm && com.bytedance.sdk.component.adexpress.yu.le.ouw(ouwVar.ouw)) {
                        ((com.bytedance.sdk.openadsdk.core.cf.vt.vt) this.f12616tc).ryl(String.valueOf(i11));
                    } else if ("open_ad".equals(this.f12625le.ouw) && this.f12625le.f11604vm) {
                        this.uq = true;
                        this.f12616tc.vt(8);
                    } else {
                        ((com.bytedance.sdk.openadsdk.core.cf.vt.vt) this.f12616tc).ryl(String.valueOf(charSequence));
                    }
                } else if ("open_ad".equals(this.f12625le.ouw)) {
                    ((com.bytedance.sdk.openadsdk.core.cf.vt.vt) this.f12616tc).ryl(String.valueOf(charSequence));
                } else {
                    ((com.bytedance.sdk.openadsdk.core.cf.vt.vt) this.f12616tc).ryl(String.valueOf(charSequence));
                }
            }
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVar3 = this.ksc;
        if (lhVar3 == null || !(lhVar3 instanceof com.bytedance.sdk.openadsdk.core.cf.vt.le)) {
            return;
        }
        if (!z11 && !z10) {
            i14 = 8;
        }
        lhVar3.vt(i14);
    }

    private void jg() {
        cf cfVar = new cf();
        HashMap map = new HashMap();
        map.put("image_info", this.f12625le.f11600ra);
        map.put("cache_dir", this.f12625le.tlj);
        cfVar.yu = map;
        cfVar.ouw = this.vt;
        cfVar.vt = this.yu;
        cfVar.f10800lh = this.ex;
        this.ouw.ouw("ad", cfVar);
    }

    private void mwh() {
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.f12616tc;
        if (lhVar != null) {
            lhVar.vt(8);
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVar2 = this.ksc;
        if (lhVar2 != null) {
            lhVar2.vt(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("VideoV3");
    }

    public final void cf() {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f12626lh, C3605n2.f30216v, new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final int fkw() {
        if (!this.f12625le.fvf) {
            return ryl();
        }
        qbp.ouw("UGenRender", "renderWidget: only update data");
        return ko();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final com.bytedance.adsdk.ugeno.vt.lh pno() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("Playable");
    }

    public final void tlj() {
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f12626lh, "videoFail", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final JSONObject yu() {
        return this.f12625le.ouw();
    }

    public ra(Context context, vpp vppVar, boolean z10, ouw ouwVar, ViewGroup viewGroup) {
        super(context, vppVar, z10, ouwVar, viewGroup);
        this.uq = false;
        this.fvf = true;
        if (TextUtils.equals(this.vpp, "fullscreen_interstitial_ad")) {
            this.f12613cd = this.fkw.myk();
        } else if (TextUtils.equals(this.vpp, "rewarded_video")) {
            this.f12613cd = this.fkw.ng();
        }
    }

    private int ko() {
        jg();
        try {
            ryl rylVar = this.ouw;
            JSONObject jSONObject = this.ex;
            com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
            rylVar.ouw(jSONObject, lhVar);
            rylVar.ouw(lhVar);
            if (this.f12626lh != null) {
                if (TextUtils.equals(this.vpp, "rewarded_video")) {
                    this.f12616tc = this.f12626lh.le("RVCountdown");
                    this.ksc = this.f12626lh.le("RVSkipView");
                } else {
                    this.f12616tc = this.f12626lh.le("FVCountdown");
                    this.ksc = this.f12626lh.le("FVSkipView");
                }
                mwh();
            }
            if (!(this instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu)) {
                this.f12625le.f12608cd.vt();
                this.f12625le.f12608cd.lh();
                return 0;
            }
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    private int ryl() {
        JSONObject jSONObject;
        jg();
        this.ouw.ouw(this);
        this.ouw.ouw = this;
        vpp vppVar = this.fkw;
        boolean z10 = true;
        if (vppVar != null) {
            int iOptInt = vppVar.ptd;
            if (Integer.MIN_VALUE == iOptInt && (jSONObject = vppVar.jvj) != null) {
                iOptInt = jSONObject.optInt("click_trigger_type", 0);
            }
            if (iOptInt != 1) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10) {
            this.ouw.vt = new lh();
        }
        pd pdVar = this.fkw.lht;
        if (pdVar == null) {
            try {
                if (!com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu.ouw(this.vpp)) {
                    this.f12626lh = this.ouw.ouw(this.yu, this.ex, (JSONObject) null);
                } else {
                    this.f12626lh = this.ouw.ouw(this.yu, this.ex, ouw(pdVar));
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return 139;
            } catch (Throwable unused3) {
                return 141;
            }
        } else {
            this.f12626lh = this.ouw.ouw(this.yu, this.ex, ouw(pdVar));
        }
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
        if (lhVar != null) {
            com.bytedance.adsdk.ugeno.vt.lh<T> lhVarLe = lhVar.le("RVCountdown");
            this.f12616tc = lhVarLe;
            if (lhVarLe == 0) {
                this.f12616tc = this.f12626lh.le("FVCountdown");
            }
            com.bytedance.adsdk.ugeno.vt.lh<T> lhVarLe2 = this.f12626lh.le("RVSkipView");
            this.ksc = lhVarLe2;
            if (lhVarLe2 == 0) {
                this.ksc = this.f12626lh.le("FVSkipView");
            }
            this.jae = this.f12626lh.le("ProgressBar");
            mwh();
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu)) {
            this.f12625le.f12608cd.vt();
            this.f12625le.f12608cd.lh();
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final void ouw(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        this.f12614od = fkwVar;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x014e A[Catch: all -> 0x0165, TryCatch #0 {all -> 0x0165, blocks: (B:78:0x0117, B:96:0x0158, B:83:0x013a, B:85:0x0140, B:88:0x0147, B:91:0x014e), top: B:115:0x0117 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0154  */
    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, com.bytedance.adsdk.ugeno.yu.le.ouw ouwVar) {
        if (this.pno == null || ouwVar == null) {
            return;
        }
        String str = ouwVar.yu;
        str.hashCode();
        int i10 = 7;
        int i11 = -1;
        boolean z10 = true;
        switch (str) {
            case "sendLogExtra":
                new pno();
                pno.ouw("sendLogExtra", this.fkw, this.vpp, ouwVar.fkw);
                return;
            case "sendAdExtra":
                new pno();
                pno.ouw("sendAdExtra", this.fkw, this.vpp, ouwVar.fkw);
                return;
            case "openPrivacy":
                break;
            case "pauseVideo":
            case "videoControl":
                i10 = 4;
                break;
            case "skip":
                i10 = 6;
                break;
            case "openPlayable":
                ko koVar = this.bly;
                if (koVar != null) {
                    koVar.l_();
                    return;
                }
                return;
            case "convert":
                i10 = 2;
                break;
            case "muteVideo":
                i10 = 5;
                break;
            case "openLinks":
                T t10 = lhVar.fkw;
                Context contextOuw = t10 != 0 ? com.bytedance.sdk.component.utils.vt.ouw(t10) : null;
                if (contextOuw == null) {
                    contextOuw = this.vt;
                }
                Context context = contextOuw;
                boolean z11 = this.vt instanceof Activity;
                new le();
                vpp vppVar = this.fkw;
                String str2 = this.vpp;
                Map<String, String> map = ouwVar.fkw;
                com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar = this.f12614od;
                if (map == null || map.isEmpty()) {
                    return;
                }
                try {
                    int i12 = Integer.parseInt(map.get("landingStyle"));
                    String str3 = map.get("url");
                    String str4 = map.get("fallbackUrl");
                    if (i12 == 1) {
                        if (!vm.ouw(str3)) {
                            z10 = false;
                        }
                    } else if (i12 != 2) {
                        if (i12 == 3) {
                            if (!vm.ouw(str3)) {
                                z10 = false;
                            }
                        }
                    } else if ((TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) || !vm.ouw(str4)) {
                        z10 = false;
                    }
                    if (z10) {
                        com.bytedance.sdk.openadsdk.core.vm.ouw(context, z11, le.ouw(map), vppVar, str2, uoy.ouw(str2), null, fkwVar);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    qbp.lh("UGenV3OpenLinks", th2.getMessage());
                    return;
                }
            case "speedVideoOrTimer":
                i10 = 13;
                qbp.vt("UGenRender", "onUGenEvent: " + ouwVar.fkw);
                Map<String, String> map2 = ouwVar.fkw;
                if (map2 != null && !map2.isEmpty()) {
                    try {
                        i11 = Integer.parseInt(ouwVar.fkw.get("switch"));
                    } catch (Throwable th3) {
                        qbp.yu("UGenRender", th3);
                    }
                    break;
                }
                break;
            case "dislike":
                i10 = 3;
                break;
            default:
                i10 = 0;
                break;
        }
        com.bytedance.sdk.openadsdk.core.model.ko.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.core.model.ko.ouw();
        ouwVar2.f12771le = this.f12623jg;
        ouwVar2.fkw = this.f12624ko;
        ouwVar2.yu = this.f12628rn;
        ouwVar2.f12772lh = this.zih;
        ouwVar2.vt = this.f12631vm;
        ouwVar2.ouw = this.f12630th;
        ouwVar2.f12773ra = i11;
        com.bytedance.sdk.openadsdk.core.model.ko.ouw ouwVarOuw = ouwVar2.ouw(this.jqy);
        ouwVarOuw.f12770ko = true;
        ouwVarOuw.pno = lhVar.jae();
        ouwVarOuw.mwh = false;
        this.pno.ouw(lhVar.fkw, i10, ouwVarOuw.ouw());
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final void ouw(long j10, long j11) {
        super.ouw(j10, j11);
        ryl rylVar = this.ouw;
        if (rylVar != null) {
            rylVar.ouw(this.f12626lh, "videoProgress", Long.valueOf(j10), Long.valueOf(j11));
        }
    }

    public JSONObject ouw(pd pdVar) {
        if (pdVar != null) {
            return pdVar.fkw;
        }
        return null;
    }
}
