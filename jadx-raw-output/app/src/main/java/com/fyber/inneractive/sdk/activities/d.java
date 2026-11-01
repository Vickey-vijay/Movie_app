package com.fyber.inneractive.sdk.activities;

import android.view.View;
import com.fyber.inneractive.sdk.util.r;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements View.OnSystemUiVisibilityChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f14854a;

    public d(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f14854a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i10) {
        if ((i10 & 2) == 0) {
            r.f18607b.postDelayed(this.f14854a.mHideNavigationBarTask, 3000L);
        }
    }
}
