package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.osn;

/* JADX INFO: loaded from: classes9.dex */
public class ryl {
    private com.bytedance.sdk.openadsdk.core.widget.pno fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.zih f12224lh;
    public View ouw;
    public Context vt;
    public com.bytedance.sdk.openadsdk.core.le.pno yu;

    public final View ouw() {
        return this.ouw;
    }

    public final void vt() {
        this.ouw = null;
        this.vt = null;
    }

    public final void ouw(int i10) {
        this.fkw.setProgress(i10);
    }

    public ryl(Context context) {
        this.vt = context;
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(this.vt);
        fkwVar.setGravity(1);
        fkwVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.zih zihVar = new com.bytedance.sdk.openadsdk.core.widget.zih(this.vt);
        this.f12224lh = zihVar;
        zihVar.setId(520093745);
        int iOuw = osn.ouw(this.vt, 64.0f);
        fkwVar.addView(this.f12224lh, new LinearLayout.LayoutParams(iOuw, iOuw));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(this.vt);
        this.yu = pnoVar;
        pnoVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(osn.ouw(this.vt, 219.0f), -2);
        layoutParams.topMargin = osn.ouw(this.vt, 16.0f);
        this.yu.setLayoutParams(layoutParams);
        this.yu.setEllipsize(TextUtils.TruncateAt.END);
        this.yu.setGravity(17);
        this.yu.setMaxWidth(osn.ouw(this.vt, 150.0f));
        this.yu.setMaxLines(2);
        this.yu.setTextColor(-1);
        this.yu.setTextSize(1, 16.0f);
        fkwVar.addView(this.yu);
        this.fkw = new com.bytedance.sdk.openadsdk.core.widget.pno(this.vt);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(osn.ouw(this.vt, 219.0f), osn.ouw(this.vt, 6.0f));
        layoutParams2.topMargin = osn.ouw(this.vt, 32.0f);
        fkwVar.addView(this.fkw, layoutParams2);
        this.ouw = fkwVar;
    }
}
