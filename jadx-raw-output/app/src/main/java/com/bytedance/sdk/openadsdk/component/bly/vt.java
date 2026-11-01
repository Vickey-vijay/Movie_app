package com.bytedance.sdk.openadsdk.component.bly;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.cd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class vt extends qbp {
    private com.bytedance.sdk.openadsdk.component.le.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw f12251cf;
    private final com.bytedance.sdk.openadsdk.component.ouw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.le.vt f12252le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f12253lh;
    public boolean ouw;
    private com.bytedance.sdk.openadsdk.component.pno.lh pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.pno.ouw f12254ra;
    private FrameLayout tlj;
    public boolean vt;
    public float yu;

    public vt(@NonNull Context context, vpp vppVar, AdSlot adSlot, String str, com.bytedance.sdk.openadsdk.component.ouw ouwVar, com.bytedance.sdk.openadsdk.component.le.vt vtVar, com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2) {
        cd cdVar;
        super(context, vppVar, adSlot, str, true, true);
        this.ouw = true;
        this.vt = false;
        this.f12253lh = 0;
        this.yu = 1.0f;
        this.fkw = ouwVar;
        this.f12252le = vtVar;
        this.f12254ra = ouwVar2;
        if (vppVar == null || (cdVar = vppVar.f12879tj) == null) {
            return;
        }
        this.f12253lh = cdVar.vt;
        this.yu = cdVar.ouw;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10, String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.ko
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.yu<? extends View> yuVar, jg jgVar) {
        bs bsVar;
        this.fvf = yuVar;
        if ((yuVar instanceof ex) && (bsVar = ((ex) yuVar).f12507jg) != null) {
            bsVar.f12579cf = this;
        }
        if (jgVar != null && jgVar.vt) {
            ouw(jgVar);
        }
        super.ouw(yuVar, jgVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void pno() {
        this.f12554vm = true;
        this.tlj = new FrameLayout(this.ryl);
        if (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.f12541ko) && !com.bytedance.sdk.openadsdk.core.cf.yu.vt(this.f12541ko)) {
            addView(this.tlj, new FrameLayout.LayoutParams(-1, -1));
        }
        super.pno();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.mwh.ra() { // from class: com.bytedance.sdk.openadsdk.component.bly.vt.1
            @Override // com.bytedance.sdk.openadsdk.mwh.ra
            public final void ouw(jg jgVar) {
                vt.this.ouw(jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long fkw() {
        return this.f12254ra.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final int getDynamicShowType() {
        if (this.fvf == null) {
            return 1;
        }
        return super.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final int getRenderTimeout() {
        vpp vppVar = this.f12541ko;
        zih.yu();
        return cf.qbp(String.valueOf(this.f12541ko.fqk())).f13082vm - vppVar.f12881uj;
    }

    public final FrameLayout getVideoFrameLayout() {
        return this.tlj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final int le() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar2 = this.pno;
        boolean z10 = false;
        if (lhVar2 != null) {
            com.bytedance.sdk.openadsdk.component.pno.vt vtVar = lhVar2.vt;
            if (vtVar != null && vtVar.f12917tc) {
                return 1;
            }
        }
        if (lhVar2 != null && lhVar2.vt()) {
            return 3;
        }
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar3 = this.pno;
        if (lhVar3 != null && lhVar3.ouw()) {
            return 2;
        }
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar4 = this.pno;
        if (lhVar4 != null && lhVar4.f12297lh) {
            le(4);
            return 4;
        }
        if (lhVar4 != null) {
            com.bytedance.sdk.openadsdk.component.pno.vt vtVar2 = lhVar4.vt;
            if (vtVar2 != null && (lhVar = vtVar2.f12911le) != null && lhVar.vt()) {
                z10 = true;
            }
            if (z10) {
                return 5;
            }
        }
        return 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ra() {
        com.bytedance.sdk.openadsdk.component.le.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.lh();
        }
    }

    public final void setExpressVideoListenerProxy(com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.ouw ouwVar) {
        this.f12251cf = ouwVar;
    }

    public final void setTopListener(com.bytedance.sdk.openadsdk.component.le.ouw ouwVar) {
        this.bly = ouwVar;
    }

    public final void setVideoManager(com.bytedance.sdk.openadsdk.component.pno.lh lhVar) {
        this.pno = lhVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void vt(JSONObject jSONObject) {
        vpp vppVar = this.f12541ko;
        boolean z10 = vppVar != null && vppVar.kfa == 0;
        int iFqk = vppVar != null ? vppVar.fqk() : 0;
        try {
            String strPno = bly.ouw().pno();
            int iBly = bly.ouw().bly();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", strPno);
            if (!z10) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(iBly)));
            } else if (bly.ouw().bly() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                zih.yu();
                jSONObject4.put("video_duration", cf.vm(String.valueOf(iFqk)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAppOpenUtils", e10.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final long yu() {
        return this.f12254ra.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void lh() {
        super.lh();
    }

    public final void ouw(final jg jgVar) {
        if (jgVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.bly.vt.2
            @Override // java.lang.Runnable
            public final void run() {
                vt.ouw(vt.this, jgVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw() {
        com.bytedance.sdk.openadsdk.component.le.ouw ouwVar = this.bly;
        if (ouwVar != null) {
            ouwVar.vt();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final boolean ouw(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.component.pno.vt vtVar;
        com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar;
        vpp vppVar;
        cd cdVar;
        if (jSONObject == null) {
            this.vt = false;
            return false;
        }
        int i10 = this.f12253lh;
        if (i10 != 1 && i10 != 2) {
            this.vt = false;
            return false;
        }
        int iOptInt = jSONObject.optInt("switch", 0);
        float fOptDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.yu = fOptDouble;
        if (fOptDouble <= 0.0f && (vppVar = this.f12541ko) != null && (cdVar = vppVar.f12879tj) != null) {
            this.yu = cdVar.ouw;
        }
        boolean z10 = iOptInt == 1;
        this.vt = z10;
        com.bytedance.sdk.openadsdk.component.le.vt vtVar2 = this.f12252le;
        if (vtVar2 != null) {
            vtVar2.ouw(this.f12253lh, this.yu, z10);
            com.bytedance.sdk.openadsdk.component.pno.lh lhVar = this.pno;
            if (lhVar != null && (vtVar = lhVar.vt) != null && (ouwVar = this.f12254ra) != null) {
                vtVar.ouw(ouwVar.yu);
                com.bytedance.sdk.component.utils.qbp.ouw("PAGAppOpenAdExpressView", "isAccelerate =" + this.vt + ",total duration = " + this.pno.vt.jae());
            }
        }
        if (this.f12253lh == 1) {
            return true;
        }
        if (!this.vt) {
            this.yu = 1.0f;
        }
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar2 = this.pno;
        if (lhVar2 != null) {
            return lhVar2.ouw(this.yu);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.openadsdk.core.bly.ko
    public final void ouw(int i10) {
        com.bytedance.sdk.openadsdk.component.pno.lh lhVar = this.pno;
        if (lhVar == null) {
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                lhVar.lh();
                this.f12252le.vt();
                return;
            }
            if (i10 == 3) {
                try {
                    if (lhVar.vt()) {
                        lhVar.yu();
                    }
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.lh("TTAppOpenVideoManager", "onContinue throw Exception :" + th2.getMessage());
                }
                this.f12252le.ouw();
                return;
            }
            if (i10 == 4) {
                com.bytedance.sdk.openadsdk.component.pno.vt vtVar = lhVar.vt;
                if (vtVar != null) {
                    vtVar.mwh();
                    lhVar.vt = null;
                    return;
                }
                return;
            }
            if (i10 != 5) {
                return;
            }
        }
        if (lhVar.ouw() || this.pno.vt()) {
            return;
        }
        this.pno.ouw(getVideoFrameLayout(), this.fkw, this.f12541ko);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp, com.bytedance.sdk.component.adexpress.vt.pno
    public final void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        if (i10 != -1 && lhVar != null && i10 == 3) {
            ra();
        } else {
            super.ouw(view, i10, lhVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.qbp
    public final void ouw(mwh.ouw ouwVar) {
        Context contextOuw = zih.ouw();
        boolean zLh = com.bytedance.sdk.openadsdk.multipro.vt.lh();
        com.bytedance.sdk.openadsdk.component.le.ouw(zih.ouw());
        ouwVar.zih = com.bytedance.sdk.component.utils.ra.ouw(contextOuw, zLh, com.bytedance.sdk.openadsdk.component.le.ouw()).getAbsolutePath();
    }

    public static /* synthetic */ void ouw(vt vtVar, jg jgVar) {
        if (jgVar != null) {
            View view = jgVar.f11590rn;
            if (view != null) {
                if (vtVar.ouw) {
                    view.setTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.f11421le, 1);
                    ((FrameLayout) jgVar.f11590rn).removeAllViews();
                    FrameLayout frameLayout = (FrameLayout) jgVar.f11590rn;
                    vtVar.tlj = frameLayout;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).gravity = 17;
                    vtVar.ouw = false;
                    return;
                }
                return;
            }
            double d10 = jgVar.fkw;
            double d11 = jgVar.f11587le;
            double d12 = jgVar.f11584cf;
            double d13 = jgVar.ryl;
            int iOuw = osn.ouw(vtVar.ryl, (float) d10);
            int iOuw2 = osn.ouw(vtVar.ryl, (float) d11);
            int iOuw3 = osn.ouw(vtVar.ryl, (float) d12);
            int iOuw4 = osn.ouw(vtVar.ryl, (float) d13);
            ko.vt("ExpressView", "vW x vH =" + d12 + VastAttributes.HORIZONTAL_POSITION + d13);
            if ((d13 != 0.0d && d12 != 0.0d) || vtVar.fvf.vt() == 7 || vtVar.fvf.vt() == 10) {
                if ((vtVar.fvf.vt() == 7 || vtVar.fvf.vt() == 10) && (jgVar instanceof com.bytedance.sdk.openadsdk.core.cf.le.vt)) {
                    FrameLayout frameLayout2 = ((com.bytedance.sdk.openadsdk.core.cf.le.vt) jgVar).zih;
                    if (frameLayout2 != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 17;
                        frameLayout2.addView(vtVar.tlj, layoutParams);
                        return;
                    }
                    return;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vtVar.tlj.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new FrameLayout.LayoutParams(iOuw3, iOuw4);
                }
                layoutParams2.width = iOuw3;
                layoutParams2.height = iOuw4;
                layoutParams2.topMargin = iOuw2;
                layoutParams2.leftMargin = iOuw;
                layoutParams2.setMarginStart(iOuw);
                layoutParams2.setMarginEnd(layoutParams2.rightMargin);
                vtVar.tlj.setLayoutParams(layoutParams2);
            }
        }
    }
}
