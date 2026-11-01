package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;

/* JADX INFO: loaded from: classes5.dex */
public final class A6 extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaView f22345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2990kl f22346b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A6)) {
            return false;
        }
        A6 a10 = (A6) obj;
        return ck.p.e(this.f22345a, a10.f22345a) && ck.p.e(this.f22346b, a10.f22346b);
    }

    public A6(MediaView mediaView, C2990kl c2990kl) {
        ck.p.j(mediaView, "mediaView");
        this.f22345a = mediaView;
        this.f22346b = c2990kl;
    }

    public final int hashCode() {
        int iHashCode = this.f22345a.hashCode() * 31;
        C2990kl c2990kl = this.f22346b;
        return iHashCode + (c2990kl == null ? 0 : c2990kl.hashCode());
    }

    public final String toString() {
        return "Success(mediaView=" + this.f22345a + ", vastBeaconData=" + this.f22346b + ")";
    }
}
