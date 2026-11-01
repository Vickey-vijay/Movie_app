package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.le.vpp;

/* JADX INFO: loaded from: classes7.dex */
public class zih<E extends vpp> implements ra<E> {
    public int fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw f11417lh;
    public vpp ouw;
    public Context vt;
    public com.bytedance.sdk.component.adexpress.dynamic.yu.ra yu;

    public zih(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, int i10) {
        this.fkw = i10;
        this.vt = context;
        this.f11417lh = fkwVar;
        this.yu = raVar;
        yu();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public final /* bridge */ /* synthetic */ ViewGroup lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public void ouw() {
        this.ouw.ouw();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lh.ra
    public void vt() {
        this.ouw.vt();
    }

    public void yu() {
        this.ouw = new vpp(this.vt, this.yu.yu.f11454tc);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.vt, 100 - this.fkw);
        this.ouw.setLayoutParams(layoutParams);
        try {
            this.ouw.setGuideText(this.yu.yu.f11460vm);
        } catch (Throwable unused) {
        }
    }

    public zih(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar) {
        this(context, fkwVar, raVar, 0);
    }
}
