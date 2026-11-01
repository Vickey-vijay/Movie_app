package com.inmobi.ads.banner;

import android.view.View;
import android.view.ViewGroup;
import ck.p;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.media.W8;

/* JADX INFO: loaded from: classes11.dex */
public final class InMobiBannerAudioManager {
    public static final InMobiBannerAudioManager INSTANCE = new InMobiBannerAudioManager();

    public static InMobiBanner a(ViewGroup viewGroup) {
        InMobiBanner inMobiBannerA;
        if (viewGroup instanceof InMobiBanner) {
            if (viewGroup.getVisibility() == 0 && viewGroup.isShown()) {
                return (InMobiBanner) viewGroup;
            }
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof ViewGroup) && (inMobiBannerA = a((ViewGroup) childAt)) != null) {
                return inMobiBannerA;
            }
        }
        return null;
    }

    public static final void setAudioEnabled(boolean z10) {
        W8.f23731d.set(z10);
    }

    public static final <T extends ViewGroup> void setAudioListener(T t10, AudioListener audioListener) {
        p.j(t10, "t");
        p.j(audioListener, "audioListener");
        INSTANCE.getClass();
        InMobiBanner inMobiBannerA = a(t10);
        if (inMobiBannerA != null && inMobiBannerA.isAudioAd()) {
            inMobiBannerA.setAudioListener(audioListener);
        }
    }
}
