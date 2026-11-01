package com.bytedance.adsdk.ouw.vt.vt.ouw;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zih implements com.bytedance.adsdk.ouw.vt.vt.ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ouw.vt.yu.lh f10742lh;
    public com.bytedance.adsdk.ouw.vt.vt.ouw ouw;
    public com.bytedance.adsdk.ouw.vt.vt.ouw vt;

    public final void ouw(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public final void vt(com.bytedance.adsdk.ouw.vt.vt.ouw ouwVar) {
        this.vt = ouwVar;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final com.bytedance.adsdk.ouw.vt.yu.fkw ouw() {
        return com.bytedance.adsdk.ouw.vt.yu.le.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.ouw.vt.vt.ouw
    public final String vt() {
        return this.ouw.vt() + this.f10742lh.f10755rn + this.vt.vt();
    }

    public zih(com.bytedance.adsdk.ouw.vt.yu.lh lhVar) {
        this.f10742lh = lhVar;
    }

    public String toString() {
        return vt();
    }
}
