package com.bytedance.sdk.openadsdk.tc.vt;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lh extends vt {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f13347le;

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void vt(int i10) {
    }

    public lh(Integer num, View view, vpp vppVar, fkw.ouw ouwVar) {
        super(num, view, vppVar, 1000, ouwVar);
        this.f13347le = -1;
        vt(view);
    }

    private void vt(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.f13347le = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final int fkw() {
        vpp vppVar = this.f13351lh;
        return (vppVar != null && vppVar.tpk && vppVar.uoy() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final boolean lh() {
        WeakReference<View> weakReference = this.vt;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.vt.get();
        if (this.f13347le == -1) {
            vt(view);
        }
        return le.ouw(view, this.f13347le == 1, this.f13351lh.lna);
    }

    @Override // com.bytedance.sdk.openadsdk.tc.vt.vt
    public final void yu() {
        super.yu();
    }
}
