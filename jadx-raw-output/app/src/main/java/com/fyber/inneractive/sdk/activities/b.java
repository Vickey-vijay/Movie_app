package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveBaseActivity f14852a;

    public b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.f14852a = inneractiveBaseActivity;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f14852a.onBackPressed();
    }
}
