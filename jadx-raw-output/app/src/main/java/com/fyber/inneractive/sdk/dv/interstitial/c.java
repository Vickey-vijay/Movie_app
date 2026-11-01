package com.fyber.inneractive.sdk.dv.interstitial;

import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15250a;

    public c(d dVar) {
        this.f15250a = dVar;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        a aVar = this.f15250a.f14820j;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        a aVar = this.f15250a.f14820j;
        if (aVar != null) {
            aVar.w();
        }
    }
}
