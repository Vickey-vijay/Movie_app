package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: loaded from: classes8.dex */
public final class Sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiNativeViewData f23523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaView f23524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f23525c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sg)) {
            return false;
        }
        Sg sg2 = (Sg) obj;
        return ck.p.e(this.f23523a, sg2.f23523a) && ck.p.e(this.f23524b, sg2.f23524b) && ck.p.e(this.f23525c, sg2.f23525c);
    }

    public Sg(InMobiNativeViewData inMobiNativeViewData, MediaView mediaView, View view) {
        ck.p.j(inMobiNativeViewData, "pubView");
        this.f23523a = inMobiNativeViewData;
        this.f23524b = mediaView;
        this.f23525c = view;
    }

    public final int hashCode() {
        int iHashCode = this.f23523a.hashCode() * 31;
        MediaView mediaView = this.f23524b;
        int iHashCode2 = (iHashCode + (mediaView == null ? 0 : mediaView.hashCode())) * 31;
        View view = this.f23525c;
        return iHashCode2 + (view != null ? view.hashCode() : 0);
    }

    public final String toString() {
        return "PublisherNativeViewData(pubView=" + this.f23523a + ", mediaView=" + this.f23524b + ", adChoice=" + this.f23525c + ")";
    }
}
