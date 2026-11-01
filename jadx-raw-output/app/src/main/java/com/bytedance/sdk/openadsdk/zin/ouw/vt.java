package com.bytedance.sdk.openadsdk.zin.ouw;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.mwh.le;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.zin.pno;

/* JADX INFO: loaded from: classes2.dex */
public final class vt extends ouw {
    public FrameLayout qbp;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public final FrameLayout f13623th;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public le f13624vm;
    public volatile boolean zih;
    public String zin;

    public vt(Context context, vpp vppVar, int i10, FrameLayout frameLayout, String str) {
        super(context, vppVar, i10, true, frameLayout);
        this.f13623th = frameLayout;
        this.zin = str;
        pno pnoVar = this.f13616ra;
        if (pnoVar != null) {
            pnoVar.coz = false;
        }
        int iYu = osn.yu(context);
        int iLe = osn.le(context);
        if (i10 == 1) {
            if (iYu <= iLe) {
                this.f13615lh.layout(0, 0, iYu, iLe);
                return;
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (iYu > iLe) {
                this.f13615lh.layout(0, 0, iYu, iLe);
                return;
            }
        }
        this.f13615lh.layout(0, 0, iLe, iYu);
    }

    public final void le() {
        super.ouw(true, new le() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.vt.1
            @Override // com.bytedance.sdk.openadsdk.mwh.le
            public final void ouw() {
                vt vtVar = vt.this;
                le leVar = vtVar.f13624vm;
                if (leVar != null) {
                    leVar.ouw();
                } else {
                    vtVar.zih = true;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.zin.ouw.ouw
    public final void ouw() {
        ko.vt("PlayablePreManager", "showPlayable");
        this.qbp.setVisibility(0);
        super.ouw();
    }
}
