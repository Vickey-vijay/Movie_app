package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.ra.ra;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public final class lh extends com.bytedance.adsdk.ugeno.vt.ouw<com.bytedance.adsdk.ugeno.le.vt> {
    private float baa;
    private float byv;
    private String ehk;
    private float eot;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    private int f10893fg;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private float f10894fn;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f10895ki;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private String f10896ln;
    private float mu;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private JSONArray f10897nn;
    private boolean qni;
    private boolean smu;
    private float xne;
    private int xwt;
    private com.bytedance.adsdk.ugeno.vt.lh zjq;

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final View ouw() {
        com.bytedance.adsdk.ugeno.le.vt vtVar = new com.bytedance.adsdk.ugeno.le.vt(this.vt);
        this.fkw = vtVar;
        vtVar.f10892cf = this;
        return vtVar;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(JSONObject jSONObject) {
    }

    public lh(Context context) {
        super(context);
        this.qni = true;
        this.smu = true;
        this.f10894fn = 0.0f;
        this.byv = 2000.0f;
        this.ehk = "normal";
        this.f10895ki = true;
        this.xwt = Color.parseColor("#666666");
        this.f10893fg = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        super.vt();
        JSONArray jSONArray = this.f10897nn;
        if (jSONArray != null && jSONArray.length() > 0) {
            com.bytedance.adsdk.ugeno.le.ouw ouwVarRa = ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).fkw((int) this.eot).le((int) this.mu).ra((int) this.xne);
            ouwVarRa.yu = this.f10895ki;
            com.bytedance.adsdk.ugeno.le.ouw ouwVarVt = ouwVarRa.lh(this.f10893fg).yu(this.xwt).vt(this.ehk).vt(this.qni);
            ouwVarVt.f10881lh = this.baa;
            ouwVarVt.ouw(this.smu).vt((int) this.byv).yu = this.f10895ki;
            for (int i10 = 0; i10 < this.f10897nn.length(); i10++) {
                ryl rylVar = new ryl(this.vt);
                rylVar.ouw(this.kfa);
                com.bytedance.adsdk.ugeno.vt.lh<View> lhVarOuw = rylVar.ouw(this.zjq.jqy(), (com.bytedance.adsdk.ugeno.vt.lh<View>) null);
                rylVar.vt(this.f10897nn.optJSONObject(i10));
                ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).ouw(lhVarOuw);
            }
            if (this.smu) {
                ((com.bytedance.adsdk.ugeno.le.vt) this.fkw).ouw();
            }
        }
    }

    public final void ouw(int i10) {
        T t10 = this.fkw;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.le.vt) t10).cf(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        this.zjq = lhVar;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        if (TextUtils.isEmpty(str)) {
        }
        str.hashCode();
        switch (str) {
            case "delayStart":
                this.f10894fn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case "indicatorColor":
                this.xwt = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case "nextMargin":
                this.xne = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "effect":
                this.ehk = str2;
                break;
            case "direction":
                this.f10896ln = str2;
                break;
            case "indicator":
                this.f10895ki = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "previousMargin":
                this.mu = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "loop":
                this.qni = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "speed":
                this.byv = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 500.0f);
                break;
            case "pageCount":
                this.baa = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                break;
            case "pageMargin":
                this.eot = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case "indicatorSelectedColor":
                this.f10893fg = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case "autoplay":
                this.smu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, true);
                break;
            case "dataList":
                this.f10897nn = com.bytedance.adsdk.ugeno.ra.vt.ouw(str2, (JSONArray) null);
                break;
        }
    }
}
