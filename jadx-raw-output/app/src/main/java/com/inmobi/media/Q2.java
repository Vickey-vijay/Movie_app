package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.EngagementSignalsCallback;

/* JADX INFO: loaded from: classes6.dex */
public final class Q2 implements EngagementSignalsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R2 f23365a;

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
        ck.p.j(bundle, "extras");
    }

    public Q2(R2 r10) {
        this.f23365a = r10;
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onSessionEnded(boolean z10, Bundle bundle) {
        Rh rh2;
        ck.p.j(bundle, "extras");
        if (z10 && (rh2 = (Rh) this.f23365a.f23429i.get()) != null) {
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            rh2.a(Mh.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        Rh rh3 = (Rh) this.f23365a.f23429i.get();
        if (rh3 != null) {
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            rh3.a(Mh.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public final void onVerticalScrollEvent(boolean z10, Bundle bundle) {
        ck.p.j(bundle, "extras");
        R2 r10 = this.f23365a;
        if (r10.f23428h) {
            return;
        }
        r10.f23428h = true;
        Rh rh2 = (Rh) r10.f23429i.get();
        if (rh2 != null) {
            GestureDetectorOnGestureListenerC2785ci.f24139e1.getClass();
            rh2.a(Mh.a("IN_NATIVE_BROWSER", "onScroll"));
        }
    }
}
