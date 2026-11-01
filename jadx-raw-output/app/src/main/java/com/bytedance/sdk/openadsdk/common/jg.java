package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes2.dex */
public final class jg {
    public th fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final vpp f12206le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ImageView f12207lh;
    public RelativeLayout ouw;
    private final String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final Context f12208ra;
    public com.bytedance.sdk.component.bly.le vt;
    public zin yu;

    public jg(Context context, vpp vppVar, String str) {
        this.f12208ra = context;
        this.f12206le = vppVar;
        this.pno = str;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new tlj(context));
        com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(context, com.bytedance.sdk.component.bly.le.lh.LANDING_PAGE);
        int i10 = com.bytedance.sdk.openadsdk.utils.rn.ux;
        leVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        int i11 = com.bytedance.sdk.openadsdk.utils.rn.myk;
        layoutParams.addRule(3, i11);
        relativeLayout.addView(leVar, layoutParams);
        bly blyVar = new bly(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(blyVar.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(blyVar, layoutParams2);
        this.ouw = relativeLayout;
        this.vt = (com.bytedance.sdk.component.bly.le) relativeLayout.findViewById(i10);
        zin zinVar = new zin(context, (RelativeLayout) this.ouw.findViewById(i11), vppVar);
        this.yu = zinVar;
        this.f12207lh = zinVar.yu;
        this.fkw = new th(context, (LinearLayout) this.ouw.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f13433sd), this.vt, vppVar, str);
    }
}
