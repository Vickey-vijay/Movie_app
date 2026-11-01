package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class vt extends lh implements com.bytedance.adsdk.ugeno.ouw.vt {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private String f11075cf;

    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        com.bytedance.adsdk.ugeno.vt.lh lhVarVt;
        com.bytedance.adsdk.ugeno.ouw.ouw ouwVarCf;
        Map<String, String> map = this.fkw;
        if (map != null && map.size() > 0) {
            String str = this.fkw.get("name");
            this.f11075cf = this.fkw.get("state");
            if (!TextUtils.isEmpty(str) && (lhVarVt = com.bytedance.adsdk.ugeno.vt.lh.vt(this.vt)) != null && (ouwVarCf = lhVarVt.pno(str).cf(str)) != null) {
                ouwVarCf.f10911lh = this;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt
    public final void vt() {
        com.bytedance.adsdk.ugeno.yu.cf cfVar;
        if ((TextUtils.equals(this.f11075cf, "complete") || TextUtils.isEmpty(this.f11075cf)) && (cfVar = this.ouw) != null) {
            cfVar.ouw(this.f11068le, this.f11069lh.vt);
        }
    }

    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ouw.vt
    public final void ouw() {
        com.bytedance.adsdk.ugeno.yu.cf cfVar;
        if ((TextUtils.equals(this.f11075cf, "start") || TextUtils.isEmpty(this.f11075cf)) && (cfVar = this.ouw) != null) {
            cfVar.ouw(this.f11068le, this.f11069lh.vt);
        }
    }
}
