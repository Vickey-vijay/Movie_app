package com.bytedance.sdk.openadsdk.core.cf.vt;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

/* JADX INFO: loaded from: classes10.dex */
public final class fkw extends com.bytedance.adsdk.ugeno.vt.lh<FrameLayout> {
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        FrameLayout frameLayout = new FrameLayout(this.vt);
        com.bytedance.sdk.openadsdk.core.model.vt vtVar = new com.bytedance.sdk.openadsdk.core.model.vt();
        vtVar.fkw = true;
        PAGLogoView pAGLogoView = new PAGLogoView(this.vt);
        pAGLogoView.initData(vtVar);
        frameLayout.addView(pAGLogoView);
        return frameLayout;
    }

    public fkw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        super.vt();
    }
}
