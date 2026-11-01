package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.bly;
import com.bytedance.sdk.openadsdk.core.bly.pno;
import com.bytedance.sdk.openadsdk.core.bly.qbp;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class vt extends lh {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.component.bly.ra f12491lh;
    public com.bytedance.sdk.openadsdk.component.bly.vt ouw;
    public boolean vt;
    private final com.bytedance.sdk.openadsdk.component.le.vt zih;

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void fkw() {
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar = this.ouw;
        if (vtVar != null) {
            vtVar.jg();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void vt() {
        this.ouw.ko();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final int yu() {
        return this.ouw.getDynamicShowType();
    }

    public vt(Activity activity, vpp vppVar, FrameLayout frameLayout, ouw ouwVar, int i10, boolean z10, com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2, com.bytedance.sdk.openadsdk.component.le.vt vtVar) {
        super(activity, vppVar, frameLayout, ouwVar, i10, z10, ouwVar2);
        this.zih = vtVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void lh() {
        super.lh();
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar = this.ouw;
        if (vtVar != null) {
            vtVar.mwh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void ouw(ViewGroup viewGroup) {
        Window window = this.yu.getWindow();
        int i10 = this.tlj;
        View decorView = window.getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = osn.vt(window.getContext(), fArr[0]);
        float fVt = osn.vt(window.getContext(), fArr[1]);
        fArr[1] = fVt;
        if (fArr[0] < 10.0f || fVt < 10.0f) {
            ko.vt("DynamicViewUtils", "get root view size error, so run backup");
            int iVt = osn.vt(window.getContext(), osn.ouw());
            Context context = window.getContext();
            float fVt2 = osn.vt(context, osn.mwh(context));
            float fVt3 = osn.vt(context, osn.jg(context));
            if ((i10 == 1) != (fVt2 > fVt3)) {
                float f10 = fVt2 + fVt3;
                fVt3 = f10 - fVt3;
                fVt2 = f10 - fVt3;
            }
            if (i10 == 1) {
                fVt2 -= iVt;
            } else {
                fVt3 -= iVt;
            }
            fArr = new float[]{fVt3, fVt2};
        }
        float fMax = Math.max(fArr[0], fArr[1]);
        float fMin = Math.min(fArr[0], fArr[1]);
        if (i10 == 1) {
            fArr[0] = fMin;
            fArr[1] = fMax;
        } else {
            fArr[0] = fMax;
            fArr[1] = fMin;
        }
        Pair pair = new Pair(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar = new com.bytedance.sdk.openadsdk.component.bly.vt(this.yu, this.fkw, new AdSlot.Builder().setCodeId(String.valueOf(this.fkw.fqk())).setExpressViewAcceptedSize(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()).build(), "open_ad", this.pno, this.zih, this.f12286ko);
        this.ouw = vtVar;
        vtVar.setTopListener(this.pno);
        this.ouw.setExpressVideoListenerProxy(this.pno);
        this.ouw.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.vt.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public final void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onAdShow(View view, int i11) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onRenderFail(View view, String str, int i11) {
                vt.this.pno.le();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onRenderSuccess(View view, float f11, float f12) {
                if (vt.this.ouw.zih()) {
                    vt vtVar2 = vt.this;
                    vtVar2.vt = true;
                    com.bytedance.sdk.openadsdk.component.bly.ra raVar = vtVar2.f12491lh;
                    if (raVar != null && vtVar2.f12290ra == raVar.getParent()) {
                        vt vtVar3 = vt.this;
                        vtVar3.f12290ra.removeView(vtVar3.f12491lh);
                    }
                    vt vtVar4 = vt.this;
                    vt.super.ouw((ViewGroup) vtVar4.f12290ra);
                    vt.super.ouw();
                    vt.super.vt();
                    return;
                }
                if (vt.this.fkw.ra()) {
                    vt.this.pno.fkw();
                    return;
                }
                vt vtVar5 = vt.this;
                if (!vtVar5.f12287le) {
                    vtVar5.pno.fkw();
                } else {
                    if (!vtVar5.ouw(vtVar5.ouw.getVideoFrameLayout())) {
                        vt.this.pno.le();
                        return;
                    }
                    vt vtVar6 = vt.this;
                    vtVar6.ouw.setVideoManager(vtVar6.f12291rn);
                    vt.this.pno.fkw();
                }
            }
        });
        this.fkw.yw = 1;
        this.f12290ra.addView(this.ouw, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.component.bly.ra raVar = new com.bytedance.sdk.openadsdk.component.bly.ra(this.yu);
        this.f12491lh = raVar;
        this.f12290ra.addView(raVar);
        this.ryl = this.f12491lh.getTopDislike();
        this.mwh = this.f12491lh.getTopSkip();
        this.f12285jg = this.f12491lh.getTopCountDown();
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void ouw() {
        final vpp vppVar = this.fkw;
        final Activity activity = this.yu;
        final com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar = this.f12286ko;
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar = this.ouw;
        final String str = "open_ad";
        bly blyVar = new bly(activity, vppVar, str) { // from class: com.bytedance.sdk.openadsdk.component.ouw.vt.1
            public final /* synthetic */ com.bytedance.sdk.openadsdk.component.pno.ouw ouw;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(final Context activity2, final vpp vppVar2, final String str2) {
                super(activity2, vppVar2, str2, 4);
                ouwVar = ouwVar;
            }

            @Override // com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(ouwVar.vt));
                ouw(map);
                super.ouw(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        blyVar.ouw(vtVar);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(activity2.getApplicationContext(), vppVar2, blyVar);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(blyVar, vppVar2);
        blyVar.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.vt.2
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i10) {
                vt.this.pno.ra();
            }
        });
        this.ouw.setClickListener(blyVar);
        final vpp vppVar2 = this.fkw;
        Activity activity2 = this.yu;
        final com.bytedance.sdk.openadsdk.component.pno.ouw ouwVar2 = this.f12286ko;
        com.bytedance.sdk.openadsdk.component.bly.vt vtVar2 = this.ouw;
        final Context applicationContext = activity2.getApplicationContext();
        pno pnoVar = new pno(applicationContext, vppVar2, str2) { // from class: com.bytedance.sdk.openadsdk.component.ouw.vt.2
            public final /* synthetic */ com.bytedance.sdk.openadsdk.component.pno.ouw ouw;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(final Context applicationContext2, final vpp vppVar3, final String str2) {
                super(applicationContext2, vppVar3, str2, 4);
                ouwVar = ouwVar2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(ouwVar.vt));
                ouw(map);
                super.ouw(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        pnoVar.ouw((View) vtVar2);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(activity2.getApplicationContext(), vppVar3, pnoVar);
        com.bytedance.sdk.openadsdk.component.ouw.vt.ouw(pnoVar, vppVar3);
        this.ouw.setClickCreativeListener(pnoVar);
        pnoVar.ouw(new com.bytedance.sdk.openadsdk.core.lh.vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.vt.3
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i10) {
                vt.this.pno.ra();
            }
        });
        super.le();
        this.ouw.setBackupListener(new com.bytedance.sdk.component.adexpress.vt.lh() { // from class: com.bytedance.sdk.openadsdk.component.vt.4
            @Override // com.bytedance.sdk.component.adexpress.vt.lh
            public final boolean ouw(ViewGroup viewGroup) {
                ko.ouw("AppOpenAdExpressManager", "open_ad", "isUseBackup() called with: view = [" + viewGroup + "], errCode = [0]");
                try {
                    ((qbp) viewGroup).rn();
                    com.bytedance.sdk.openadsdk.component.bly.ouw ouwVar3 = new com.bytedance.sdk.openadsdk.component.bly.ouw(vt.this.yu);
                    com.bytedance.sdk.openadsdk.component.bly.vt vtVar3 = vt.this.ouw;
                    ouwVar3.ouw = vtVar3;
                    vtVar3.addView(ouwVar3, new FrameLayout.LayoutParams(-1, -1));
                    return true;
                } catch (Exception e10) {
                    Log.e("AppOpenAdExpressManager", "", e10);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final void ouw(int i10, boolean z10) {
        super.ouw(i10, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.component.lh
    public final JSONObject ouw(JSONObject jSONObject) {
        return this.ouw.ouw(jSONObject, this.fkw);
    }
}
