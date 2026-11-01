package com.bytedance.sdk.openadsdk.core.cf.le;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class yu implements ko, rn, com.bytedance.sdk.component.adexpress.dynamic.yu, com.bytedance.sdk.component.adexpress.vt.yu<View> {

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private static float f12619cd = 0.0f;
    private static long jae = 0;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private static float f12620od = 0.0f;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private static float f12621pd = 0.0f;
    private static float uq = 0.0f;
    public static int zin = 24;
    public com.bytedance.sdk.openadsdk.core.bly.ko bly;
    private qbp bs;
    public JSONObject ex;
    public vpp fkw;
    private fkw fvf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public float f12623jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public float f12624ko;
    private boolean ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ouw f12625le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.vt.lh<View> f12626lh;
    public com.bytedance.adsdk.ugeno.vt.lh mwh;
    public ryl ouw;
    public com.bytedance.sdk.component.adexpress.vt.pno pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public FrameLayout f12627ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public float f12628rn;
    public com.bytedance.adsdk.ugeno.vt.lh ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.vt.ra f12629tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public long f12630th;
    public jg tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public long f12631vm;
    public String vpp;
    public Context vt;
    public JSONObject yu;
    public float zih;
    public boolean qbp = true;
    public SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> jqy = new SparseArray<>();
    private String fak = "";
    private final com.bytedance.sdk.component.pno.pno uoy = new com.bytedance.sdk.component.pno.pno("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.cf.le.yu.1
        @Override // java.lang.Runnable
        public final void run() {
            yu yuVar = yu.this;
            yuVar.yu = yuVar.ouw();
            if (yu.this.bs != null) {
                yu yuVar2 = yu.this;
                yuVar2.fak = yuVar2.bs.getUgenTemplateErrorReason();
            } else {
                yu.this.fak = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.jg.lh().post(yu.this.osn);
        }
    };
    private final Runnable osn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.le.yu.2
        @Override // java.lang.Runnable
        public final void run() {
            if (yu.this.f12629tc != null) {
                yu yuVar = yu.this;
                yu.ouw(yuVar, yuVar.f12629tc);
            }
        }
    };
    private boolean ey = false;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public AtomicBoolean f12622cf = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void onvideoComplate() {
    }

    public void ouw(long j10, long j11) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, com.bytedance.adsdk.ugeno.yu.le.ouw ouwVar) {
    }

    public com.bytedance.adsdk.ugeno.vt.lh pno() {
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.yu
    public void setTimeUpdate(int i10) {
    }

    public com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.fkw("video");
    }

    public int fkw() {
        this.ouw.ouw(this);
        ryl rylVar = this.ouw;
        rylVar.ouw = this;
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw = rylVar.ouw(this.yu);
        this.f12626lh = lhVarOuw;
        final fkw fkwVar = this.fvf;
        if (fkwVar != null && lhVarOuw != null) {
            com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw = lhVarOuw.fkw("swiperLayout");
            fkwVar.fkw = lhVarFkw;
            if (lhVarFkw instanceof com.bytedance.adsdk.ugeno.lh) {
                fkwVar.f12601jg = fkwVar.tlj.optJSONArray("dpa_data");
                fkwVar.f12604lh = lhVarOuw.fkw("swiperLeftArrow");
                fkwVar.yu = lhVarOuw.fkw("swiperRightArrow");
                com.bytedance.adsdk.ugeno.lh lhVar = (com.bytedance.adsdk.ugeno.lh) fkwVar.fkw;
                com.bytedance.adsdk.ugeno.le.lh lhVar2 = new com.bytedance.adsdk.ugeno.le.lh() { // from class: com.bytedance.sdk.openadsdk.core.cf.le.fkw.1
                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i10) {
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i10, float f10, int i11) {
                    }

                    @Override // com.bytedance.adsdk.ugeno.le.lh
                    public final void ouw(boolean z10, int i10, int i11, boolean z11, boolean z12) {
                        fkw fkwVar2 = fkw.this;
                        fkwVar2.vt = i10;
                        fkwVar2.ouw = i11;
                        fkwVar2.f12600cf = z10;
                        fkwVar2.ryl = z11;
                        fkwVar2.mwh = z12;
                        fkwVar2.ouw(z10, z11, z12);
                        fkw fkwVar3 = fkw.this;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("index", i10);
                        } catch (Throwable unused) {
                        }
                        com.bytedance.sdk.openadsdk.yu.lh.vt(fkwVar3.f12603le, fkwVar3.f12605ra, "carousel_show", jSONObject);
                    }
                };
                T t10 = lhVar.fkw;
                if (t10 != 0) {
                    ((com.bytedance.adsdk.ugeno.le.vt) t10).setOnPageChangeListener(lhVar2);
                }
            }
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu)) {
            this.f12625le.f12608cd.vt();
            this.f12625le.f12608cd.lh();
        }
        this.ouw.vt(this.ex);
        return 0;
    }

    public final void le() {
        this.f12622cf.set(true);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final View lh() {
        return this.f12627ra;
    }

    public final com.bytedance.adsdk.ugeno.vt.lh ra() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.le("PlayableComponent");
    }

    public void setSoundMute(boolean z10) {
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
        if (lhVar == null || (lhVarFkw = lhVar.fkw(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == 0) {
            return;
        }
        if (z10) {
            ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw).mwh("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw).mwh("local://tt_reward_full_unmute");
        }
        lhVarFkw.vt();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0085, please report this as an issue */
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z10) {
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        T t10;
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw2;
        int i12;
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
        if (lhVar == null) {
            return;
        }
        int i13 = 0;
        boolean z11 = i10 == 1;
        if (lhVar != null && (lhVarFkw2 = lhVar.fkw("countdown")) != 0) {
            T t11 = lhVarFkw2.fkw;
            if (t11 instanceof TextView) {
                try {
                    i12 = Integer.parseInt((String) charSequence);
                } catch (Exception unused) {
                    com.bytedance.sdk.component.utils.qbp.yu("UGenRender", "parse duration exception", charSequence);
                    i12 = 0;
                }
                if (z10 || i12 <= 0 || this.ey) {
                    t11.setVisibility(8);
                } else {
                    t11.setVisibility(0);
                    if (!z11) {
                        ouw ouwVar = this.f12625le;
                        if (ouwVar.f11604vm && com.bytedance.sdk.component.adexpress.yu.le.ouw(ouwVar.ouw)) {
                            ((TextView) t11).setText(String.format(com.bytedance.sdk.component.utils.vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_full_skip"), Integer.valueOf(i11)));
                        } else if ("open_ad".equals(this.f12625le.ouw) && this.f12625le.f11604vm) {
                            this.ey = true;
                            t11.setVisibility(8);
                        } else {
                            ((TextView) t11).setText(((Object) charSequence) + "s");
                        }
                    } else if ("open_ad".equals(this.f12625le.ouw)) {
                        ((TextView) t11).setText(((Object) charSequence) + "s");
                    } else {
                        ((TextView) t11).setText(((Object) charSequence) + "s");
                    }
                }
            }
        }
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar2 = this.f12626lh;
        if (lhVar2 == null || (lhVarFkw = lhVar2.fkw("skip")) == 0 || (t10 = lhVarFkw.fkw) == 0) {
            return;
        }
        if (!z11 && !z10) {
            i13 = 8;
        }
        t10.setVisibility(i13);
    }

    public int vt() {
        return this.fkw.kfa;
    }

    public JSONObject yu() {
        return this.f12625le.f12609od;
    }

    static {
        if (zih.ouw() != null) {
            zin = zih.vt();
        }
    }

    public yu(Context context, vpp vppVar, boolean z10, ouw ouwVar, ViewGroup viewGroup) {
        this.vt = context;
        this.ksc = z10;
        this.ouw = new ryl(context);
        this.fkw = vppVar;
        this.f12625le = ouwVar;
        this.f12627ra = new FrameLayout(context);
        if (viewGroup instanceof qbp) {
            this.bs = (qbp) viewGroup;
        }
        this.vpp = ouwVar.ouw;
        JSONObject jSONObjectYu = yu();
        this.ex = jSONObjectYu;
        this.fvf = new fkw(this.vt, this.fkw, this.vpp, jSONObjectYu);
    }

    public final void ouw(vpp vppVar, boolean z10, ouw ouwVar, ViewGroup viewGroup) {
        this.fkw = vppVar;
        this.f12625le = ouwVar;
        this.vpp = ouwVar.ouw;
        this.ex = yu();
        this.bs = (qbp) viewGroup;
        this.ksc = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.f12629tc = raVar;
        bs.vt(this.uoy);
    }

    public JSONObject ouw() {
        return this.f12625le.ouw();
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.vt.pno pnoVar) {
        this.pno = pnoVar;
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.ko koVar) {
        this.bly = koVar;
    }

    public void ouw(com.bytedance.sdk.openadsdk.core.widget.fkw fkwVar) {
        fkw fkwVar2 = this.fvf;
        if (fkwVar2 != null) {
            fkwVar2.pno = fkwVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af  */
    @Override // com.bytedance.adsdk.ugeno.core.rn
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, MotionEvent motionEvent) {
        int i10;
        int action = motionEvent.getAction();
        int i11 = 1;
        int i12 = -1;
        if (action != 0) {
            if (action == 1) {
                this.f12628rn = motionEvent.getRawX();
                this.zih = motionEvent.getRawY();
                if (Math.abs(this.f12628rn - this.f12623jg) < zin || Math.abs(this.zih - this.f12624ko) >= zin) {
                    this.qbp = false;
                }
                this.f12630th = System.currentTimeMillis();
            } else if (action == 2) {
                uq += Math.abs(motionEvent.getX() - f12620od);
                f12621pd += Math.abs(motionEvent.getY() - f12619cd);
                f12620od = motionEvent.getX();
                f12619cd = motionEvent.getY();
                if (System.currentTimeMillis() - jae > 200) {
                    float f10 = uq;
                    int i13 = zin;
                    if (f10 <= i13 && f12621pd <= i13) {
                        i11 = 2;
                    }
                } else {
                    i11 = 2;
                }
                if (Math.abs(motionEvent.getRawX() - this.f12623jg) >= zin || Math.abs(motionEvent.getRawY() - this.f12624ko) >= zin) {
                    this.qbp = false;
                }
                i12 = i11;
                this.f12628rn = motionEvent.getRawX();
                this.zih = motionEvent.getRawY();
                if (Math.abs(this.f12628rn - this.f12623jg) < zin) {
                    this.qbp = false;
                } else {
                    this.qbp = false;
                }
                this.f12630th = System.currentTimeMillis();
            }
            i10 = i12;
        } else {
            this.f12631vm = System.currentTimeMillis();
            this.f12623jg = motionEvent.getRawX();
            this.f12624ko = motionEvent.getRawY();
            this.qbp = true;
            jae = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(motionEvent);
            i10 = 0;
        }
        this.jqy.put(motionEvent.getActionMasked(), new com.bytedance.sdk.openadsdk.core.lh.lh.ouw(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(mwh mwhVar, ko.ouw ouwVar) {
        int i10;
        JSONObject jSONObject;
        boolean zOuw;
        String str;
        fkw fkwVar;
        fkw fkwVar2;
        int i11;
        fkw fkwVar3;
        int i12;
        mwh mwhVar2;
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        if (mwhVar == null) {
            return;
        }
        int i13 = mwhVar.vt;
        int i14 = 4;
        boolean z10 = true;
        if ((i13 == 1 || i13 == 4) && this.pno != null) {
            String strOptString = mwhVar.f10810lh.optString("type");
            if ("swiperLeft".equals(strOptString) && (fkwVar3 = this.fvf) != null) {
                com.bytedance.adsdk.ugeno.vt.lh lhVar = fkwVar3.fkw;
                if ((lhVar instanceof com.bytedance.adsdk.ugeno.lh) && (i12 = fkwVar3.ouw) != -1) {
                    ((com.bytedance.adsdk.ugeno.lh) lhVar).ouw(i12 - 1);
                }
            } else if ("swiperRight".equals(strOptString) && (fkwVar2 = this.fvf) != null) {
                com.bytedance.adsdk.ugeno.vt.lh lhVar2 = fkwVar2.fkw;
                if ((lhVar2 instanceof com.bytedance.adsdk.ugeno.lh) && (i11 = fkwVar2.ouw) != -1) {
                    ((com.bytedance.adsdk.ugeno.lh) lhVar2).ouw(i11 + 1);
                }
            } else {
                if (!"swiperClick".equals(strOptString) || (fkwVar = this.fvf) == null) {
                    i10 = 0;
                    jSONObject = null;
                    zOuw = false;
                } else {
                    zOuw = fkwVar.ouw(mwhVar);
                    jSONObject = this.fvf.bly;
                    i10 = 2;
                }
                strOptString.hashCode();
                switch (strOptString) {
                    case "privacy":
                        i14 = 7;
                        break;
                    case "feedback":
                        i14 = 3;
                        break;
                    case "mute":
                        i14 = 5;
                        break;
                    case "skip":
                        i14 = 6;
                        break;
                    case "video":
                        break;
                    case "creative":
                        i14 = 2;
                        break;
                    default:
                        i14 = i10;
                        break;
                }
                com.bytedance.adsdk.ugeno.vt.lh lhVar3 = mwhVar.ouw;
                com.bytedance.sdk.openadsdk.core.model.ko.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.core.model.ko.ouw();
                ouwVar2.f12771le = this.f12623jg;
                ouwVar2.fkw = this.f12624ko;
                ouwVar2.yu = this.f12628rn;
                ouwVar2.f12772lh = this.zih;
                ouwVar2.vt = this.f12631vm;
                ouwVar2.ouw = this.f12630th;
                com.bytedance.sdk.openadsdk.core.model.ko.ouw ouwVarOuw = ouwVar2.ouw(this.jqy);
                if (mwhVar.vt == 1 && !this.qbp) {
                    z10 = false;
                }
                ouwVarOuw.f12770ko = z10;
                if (lhVar3 == null) {
                    str = "";
                } else {
                    str = lhVar3.jae() + "_" + lhVar3.ksc();
                }
                ouwVarOuw.pno = str;
                ouwVarOuw.mwh = zOuw;
                ouwVarOuw.ryl = jSONObject;
                this.pno.ouw(mwhVar.ouw.fkw, i14, ouwVarOuw.ouw());
            }
        }
        if (mwhVar.vt == 10) {
            JSONObject jSONObject2 = mwhVar.f10810lh;
            if (this.f12626lh != null && jSONObject2 != null) {
                String strOptString2 = jSONObject2.optString("type");
                String strOptString3 = jSONObject2.optString("nodeId");
                if (!TextUtils.isEmpty(strOptString3) && (lhVarFkw = this.f12626lh.fkw(strOptString3)) != 0) {
                    if (TextUtils.equals(strOptString2, "onShow")) {
                        lhVarFkw.vt(0);
                    } else if (TextUtils.equals(strOptString2, "onDismiss")) {
                        lhVarFkw.vt(8);
                    }
                }
            }
        }
        if (ouwVar == null || (mwhVar2 = mwhVar.yu) == null) {
            return;
        }
        ouwVar.ouw(mwhVar2);
    }

    public static /* synthetic */ void ouw(yu yuVar, com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        vpp vppVar;
        int i10;
        com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw;
        if (yuVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.ouw.yu) {
            yuVar.f12625le.vt.ra();
        } else {
            yuVar.f12625le.f12608cd.ouw();
        }
        if (yuVar.yu == null) {
            raVar.ouw(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + yuVar.fak);
            return;
        }
        if (yuVar.ex == null) {
            raVar.ouw(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int iFkw = yuVar.fkw();
        ryl rylVar = yuVar.ouw;
        if (rylVar.f10826lh) {
            List<String> list = rylVar.yu;
            if (list == null) {
                raVar.ouw(138, "unknow widget");
                return;
            }
            raVar.ouw(138, "unknow widget;" + list.toString());
            return;
        }
        if (iFkw != 0) {
            raVar.ouw(iFkw, "ugen render fail");
            return;
        }
        if (yuVar.f12626lh != null) {
            vt vtVar = new vt();
            yuVar.tlj = vtVar;
            vtVar.vt = true;
            vtVar.ouw = yuVar.vt();
            yuVar.setSoundMute(yuVar.ksc);
            if (yuVar.f12626lh != null) {
                if (yuVar.fkw.osn() && (lhVarFkw = yuVar.f12626lh.fkw("tvskip")) != 0) {
                    lhVarFkw.vt(8);
                }
                com.bytedance.adsdk.ugeno.vt.lh<T> lhVarFkw2 = yuVar.f12626lh.fkw("skip");
                if (lhVarFkw2 != 0 && (lhVarFkw2 instanceof com.bytedance.adsdk.ugeno.bly.yu.lh)) {
                    cf.vt();
                    if (!cf.tlj(String.valueOf(yuVar.fkw.fqk())) || (i10 = (vppVar = yuVar.fkw).fvf) == 5 || i10 == 6 || vppVar.lna == 3) {
                        ((com.bytedance.adsdk.ugeno.bly.yu.lh) lhVarFkw2).mwh("local://tt_close_btn");
                        lhVarFkw2.vt();
                    }
                }
            }
            com.bytedance.adsdk.ugeno.vt.lh lhVarBly = yuVar.bly();
            yuVar.ryl = lhVarBly;
            if (lhVarBly != null && (lhVarBly instanceof com.bytedance.sdk.openadsdk.core.cf.vt.fkw.vt)) {
                ((vt) yuVar.tlj).zih = ((com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw) ((com.bytedance.sdk.openadsdk.core.cf.vt.fkw.vt) lhVarBly).fkw).getVideoView();
            }
            fkw fkwVar = yuVar.fvf;
            if (fkwVar != null) {
                fkwVar.ouw(fkwVar.f12600cf, fkwVar.ryl, fkwVar.mwh);
            }
            com.bytedance.adsdk.ugeno.vt.lh lhVarRa = yuVar.ra();
            yuVar.mwh = lhVarRa;
            if (lhVarRa != null && (lhVarRa instanceof com.bytedance.adsdk.ugeno.bly.vt.vt)) {
                ((vt) yuVar.tlj).f12618vm = (FrameLayout) lhVarRa.fkw;
            }
            if (od.lh(yuVar.fkw)) {
                com.bytedance.adsdk.ugeno.vt.lh lhVarPno = yuVar.pno();
                if (lhVarPno instanceof com.bytedance.sdk.openadsdk.core.cf.vt.vt.vt) {
                    ((vt) yuVar.tlj).f12617th = ((com.bytedance.sdk.openadsdk.core.cf.vt.vt.ouw) ((com.bytedance.sdk.openadsdk.core.cf.vt.vt.vt) lhVarPno).fkw).getPlayableView();
                }
            }
            int iOd = yuVar.f12626lh.od();
            int iCd = yuVar.f12626lh.cd();
            com.bytedance.sdk.component.utils.ko.vt("UGenRender", "render: width=" + iOd + "; height=" + iCd);
            yuVar.f12627ra.removeAllViews();
            yuVar.f12627ra.addView(yuVar.f12626lh.fkw, new FrameLayout.LayoutParams(iOd, iCd));
            ouw ouwVar = yuVar.f12625le;
            float f10 = ouwVar.uq;
            float f11 = ouwVar.f12610pd;
            com.bytedance.sdk.component.utils.ko.vt("UGenRender", "render: adWidth = " + f10 + "; adHeight = " + f11);
            float fOuw = (float) osn.ouw(yuVar.vt, f10);
            float fOuw2 = (float) osn.ouw(yuVar.vt, f11);
            if (yuVar.vt() != 7) {
                yuVar.f12627ra.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            } else if (f11 <= 0.0f) {
                yuVar.f12627ra.setLayoutParams(new FrameLayout.LayoutParams((int) fOuw, -2));
            } else {
                yuVar.f12627ra.setLayoutParams(new FrameLayout.LayoutParams((int) fOuw, (int) fOuw2));
            }
            if (f11 > 0.0f && f10 > 0.0f) {
                jg jgVar = yuVar.tlj;
                jgVar.f11588lh = f10;
                jgVar.yu = f11;
            } else {
                yuVar.f12627ra.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int iVt = osn.vt(yuVar.vt, yuVar.f12627ra.getMeasuredWidth());
                int iVt2 = osn.vt(yuVar.vt, yuVar.f12627ra.getMeasuredHeight());
                jg jgVar2 = yuVar.tlj;
                jgVar2.f11588lh = iVt;
                jgVar2.yu = iVt2;
            }
            if (yuVar.f12622cf.get()) {
                raVar.ouw(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
                return;
            } else {
                yuVar.ouw.ouw(yuVar.f12626lh, "renderDidFinish", new Object[0]);
                raVar.ouw(yuVar.f12627ra, yuVar.tlj);
                return;
            }
        }
        raVar.ouw(138, "ugen render error");
    }
}
