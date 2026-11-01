package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.mwh;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    public final int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Context f10841le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public mwh f10842lh;
    public float ouw;
    public float vt;
    public boolean yu;

    public lh(Context context, mwh mwhVar) {
        this.f10841le = context;
        this.f10842lh = mwhVar;
        this.fkw = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
