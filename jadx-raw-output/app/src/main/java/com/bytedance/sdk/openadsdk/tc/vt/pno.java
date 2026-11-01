package com.bytedance.sdk.openadsdk.tc.vt;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes11.dex */
public final class pno extends vt {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f13349le;

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final int fkw() {
        return 200;
    }

    public pno(Integer num, View view, vpp vppVar, fkw.ouw ouwVar) {
        super(num, view, vppVar, 2000, ouwVar);
        this.f13349le = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final boolean bly() {
        int i10 = this.f13349le;
        boolean z10 = i10 == 2 || i10 == 0;
        if (z10) {
            this.yu.set(false);
        }
        return !z10 || super.bly();
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final boolean lh() {
        return le.ouw(this.vt.get(), false, this.f13351lh.lna) && this.f13349le == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void ouw() {
        if (this.f13349le != 1) {
            return;
        }
        super.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void vt(int i10) {
        if (this.ouw.get()) {
            return;
        }
        if (i10 == 6 || i10 == 5) {
            this.f13349le = 0;
            ra();
        }
        if (i10 == 3 || i10 == 2) {
            this.f13349le = 2;
            ra();
        }
        if (this.f13349le == 1 || i10 != 0) {
            return;
        }
        this.f13349le = 1;
        ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void yu() {
        super.yu();
    }
}
