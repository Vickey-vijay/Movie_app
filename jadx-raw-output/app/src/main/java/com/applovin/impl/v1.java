package com.applovin.impl;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes5.dex */
abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f9735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f9736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.b f9737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ViewGroup f9738d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout.LayoutParams f9739e;

    public void a(View view) {
        this.f9738d.removeView(view);
    }

    public void a(com.applovin.impl.adview.g gVar) {
        if (gVar == null || gVar.getParent() != null) {
            return;
        }
        a(this.f9737c.n(), (this.f9737c.u0() ? 3 : 5) | 48, gVar);
    }

    public v1(com.applovin.impl.sdk.ad.b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f9739e = layoutParams;
        this.f9737c = bVar;
        this.f9735a = kVar;
        this.f9736b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f9738d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        frameLayout.setLayoutParams(layoutParams);
    }

    public void a(com.applovin.impl.sdk.ad.b.d dVar, int i10, com.applovin.impl.adview.g gVar) {
        gVar.a(dVar.f9158a, dVar.f9162e, dVar.f9161d, i10);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gVar.getLayoutParams());
        int i11 = dVar.f9160c;
        layoutParams.setMargins(i11, dVar.f9159b, i11, 0);
        layoutParams.gravity = i10;
        this.f9738d.addView(gVar, layoutParams);
    }
}
