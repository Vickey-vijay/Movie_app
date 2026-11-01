package com.bytedance.sdk.openadsdk.core.cf.vt.lh;

import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ra.ra;

/* JADX INFO: loaded from: classes4.dex */
public final class lh extends com.bytedance.adsdk.ugeno.vt.lh<ouw> {

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private float f12652fn;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private int f12653ln;
    private String ouw;
    private int qni;
    private float smu;

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "progressBackgroundColor":
                this.qni = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case "progressSize":
                this.smu = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f));
                break;
            case "progressType":
                this.ouw = str2;
                break;
            case "progressColor":
                this.f12653ln = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case "barRadius":
                if (com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f) > 0.0f) {
                    this.f12652fn = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                    break;
                } else {
                    this.f12652fn = 0.0f;
                    break;
                }
                break;
        }
    }

    public lh(Context context) {
        super(context);
        this.ouw = "line";
        this.f12653ln = com.bytedance.adsdk.ugeno.ra.ouw.ouw("#FFD813", ViewCompat.MEASURED_STATE_MASK);
        this.qni = com.bytedance.adsdk.ugeno.ra.ouw.ouw("rgba(0, 0, 0, 0.5)", ViewCompat.MEASURED_STATE_MASK);
        this.smu = ra.ouw(this.vt, 1.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        super.vt();
        ouw ouwVar = (ouw) this.fkw;
        ouwVar.vt = this.ouw;
        ouw ouwVarVt = ouwVar.ouw(this.f12653ln).vt(this.qni);
        ouwVarVt.ouw = this.f12652fn;
        ouwVarVt.ouw(this.smu);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        ouw ouwVar = new ouw(this.vt);
        ouwVar.f12657lh = this;
        return ouwVar;
    }
}
