package com.inmobi.media;

import android.view.ViewTreeObserver;
import com.inmobi.ads.InMobiBanner;

/* JADX INFO: loaded from: classes7.dex */
public final class V8 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f23693a;

    public V8(InMobiBanner inMobiBanner) {
        this.f23693a = inMobiBanner;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C3053n9 c3053n9;
        try {
            InMobiBanner inMobiBanner = this.f23693a;
            inMobiBanner.f22291i = F3.b(inMobiBanner.getMeasuredWidth() / J5.b());
            InMobiBanner inMobiBanner2 = this.f23693a;
            inMobiBanner2.f22292j = F3.b(inMobiBanner2.getMeasuredHeight() / J5.b());
            if (InMobiBanner.access$hasValidSize(this.f23693a)) {
                this.f23693a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        } catch (Exception e10) {
            C2820e2 mAdManager$media_release = this.f23693a.getMAdManager$media_release();
            if (mAdManager$media_release == null || (c3053n9 = mAdManager$media_release.f22542f) == null) {
                return;
            }
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            ck.p.i(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            c3053n9.a(strAccess$getTAG$cp, "InMobiBanner$1.onGlobalLayout() handler threw unexpected error: ", e10);
        }
    }
}
