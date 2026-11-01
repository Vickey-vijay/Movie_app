package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class lh {
    public String bly;
    public Map<String, String> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f11068le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.yu.le f11069lh;
    public com.bytedance.adsdk.ugeno.yu.cf ouw;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f11070ra;
    public Context tlj;
    public com.bytedance.adsdk.ugeno.vt.lh vt;
    public com.bytedance.adsdk.ugeno.yu.le.ouw yu;

    public abstract boolean ouw(Object... objArr);

    public final void lh() {
        com.bytedance.adsdk.ugeno.yu.le leVar = this.f11069lh;
        com.bytedance.adsdk.ugeno.yu.le.ouw ouwVar = leVar.ouw;
        this.yu = ouwVar;
        if (leVar == null) {
            return;
        }
        this.yu = ouwVar;
        if (ouwVar == null) {
            return;
        }
        this.fkw = ouwVar.fkw;
        this.f11068le = ouwVar.yu;
        this.f11070ra = ouwVar.f11056lh;
        this.pno = ouwVar.ouw;
        this.bly = ouwVar.vt;
    }

    public final String yu() {
        return this.pno;
    }

    public lh(Context context) {
        this.tlj = context;
    }
}
