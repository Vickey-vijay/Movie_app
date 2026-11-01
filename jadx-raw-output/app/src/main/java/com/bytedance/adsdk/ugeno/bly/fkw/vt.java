package com.bytedance.adsdk.ugeno.bly.fkw;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.vt.lh;

/* JADX INFO: loaded from: classes2.dex */
public final class vt extends lh<ouw> {
    private static final int byv = Color.parseColor("#FFC642");
    private static final int ehk = Color.parseColor("#e3e3e4");

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private float f10763fn;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private int f10764ln;
    private int ouw;
    private float qni;
    private float smu;

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "highLightColor":
            case "highlightColor":
                this.ouw = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case "lowLightColor":
            case "lowlightColor":
                this.f10764ln = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ehk);
                break;
            case "gap":
                this.f10763fn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case "size":
                this.smu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 20.0f);
                break;
            case "score":
                this.qni = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 4.0f);
                break;
        }
    }

    public vt(Context context) {
        super(context);
        this.ouw = byv;
        this.f10764ln = ehk;
        this.qni = 4.0f;
        this.smu = 20.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        super.vt();
        if (ex()) {
            ((ouw) this.fkw).ouw(this.qni, this.ouw, this.f10764ln, this.smu, (int) this.f10763fn);
        } else {
            ((ouw) this.fkw).ouw(this.qni, this.ouw, this.f10764ln, this.smu, 5);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        ouw ouwVar = new ouw(this.vt);
        ouwVar.ouw = this;
        return ouwVar;
    }
}
