package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.Hc;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Hc extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f22805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2780cd f22806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f22807c;

    public final void a(bk.l lVar) {
        InMobiNative inMobiNative = (InMobiNative) this.f22807c.get();
        if (inMobiNative == null) {
            Kb.a((byte) 1, "NativeCallbacks", "Lost reference to InMobiNative! callback cannot be given");
        } else {
            lVar.invoke(inMobiNative);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final byte getType() {
        return (byte) 0;
    }

    public Hc(InMobiNative inMobiNative, Rg rg2, C2780cd c2780cd) {
        ck.p.j(inMobiNative, "inMobiNative");
        ck.p.j(rg2, "publisherListenersModel");
        ck.p.j(c2780cd, "nativeFlowManagerNotifier");
        this.f22805a = rg2;
        this.f22806b = c2780cd;
        this.f22807c = new WeakReference(inMobiNative);
    }

    public static final mj.r b(Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f22805a.f23463a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDismissed(inMobiNative);
        }
        return mj.r.f64562a;
    }

    public static final mj.r c(Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f22805a.f23463a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDisplayed(inMobiNative);
        }
        return mj.r.f64562a;
    }

    public static final mj.r d(Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f22805a.f23463a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onUserWillLeaveApplication(inMobiNative);
        }
        return mj.r.f64562a;
    }

    public static final mj.r e(Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f22805a.f23464b;
        if (videoEventListener != null) {
            videoEventListener.onVideoCompleted(inMobiNative);
        }
        return mj.r.f64562a;
    }

    public static final mj.r f(Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f22805a.f23464b;
        if (videoEventListener != null) {
            videoEventListener.onVideoPaused(inMobiNative);
        }
        return mj.r.f64562a;
    }

    public static final mj.r g(Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f22805a.f23464b;
        if (videoEventListener != null) {
            videoEventListener.onVideoResumed(inMobiNative);
        }
        return mj.r.f64562a;
    }

    public static final mj.r h(Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f22805a.f23464b;
        if (videoEventListener != null) {
            videoEventListener.onVideoStarted(inMobiNative);
        }
        return mj.r.f64562a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdClicked(Map map) {
        ck.p.j(map, "params");
        a(new bk.l() { // from class: b7.j1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f4996b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDismissed() {
        a(new bk.l() { // from class: b7.e1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.b(this.f4904b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDisplayed(AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        a(new bk.l() { // from class: b7.h1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.c(this.f4953b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        ck.p.j(inMobiAdRequestStatus, "status");
        onAdLoadFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchSuccessful(final AdMetaInfo adMetaInfo) {
        ck.p.j(adMetaInfo, "info");
        a(new bk.l() { // from class: b7.k1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f5011b, adMetaInfo, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdImpression(final C2890gk c2890gk) {
        a(new bk.l() { // from class: b7.l1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f5031b, c2890gk, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdLoadFailed(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        ck.p.j(inMobiAdRequestStatus, "status");
        a(new bk.l() { // from class: b7.d1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f4884b, inMobiAdRequestStatus, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAudioStateChanged(final boolean z10) {
        a(new bk.l() { // from class: b7.g1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.a(z10, this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onUserLeftApplication() {
        a(new bk.l() { // from class: b7.c1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.d(this.f4868b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoCompleted() {
        a(new bk.l() { // from class: b7.a1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.e(this.f4837b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoPaused() {
        a(new bk.l() { // from class: b7.b1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.f(this.f4851b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoResumed() {
        a(new bk.l() { // from class: b7.f1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.g(this.f4919b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoStarted() {
        a(new bk.l() { // from class: b7.z0
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.h(this.f5273b, (InMobiNative) obj);
            }
        });
    }

    public static final mj.r a(Hc hc2, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        Ac ac2 = hc2.f22806b.f24130a.f24237d.f22732b;
        ac2.getClass();
        InterfaceC2786cj interfaceC2786cj = ac2.f22360c;
        O6 o10 = interfaceC2786cj instanceof O6 ? (O6) interfaceC2786cj : null;
        if (o10 != null) {
            InterfaceC3028m9 interfaceC3028m9L = o10.l();
            if (interfaceC3028m9L != null) {
                ((C3053n9) interfaceC3028m9L).a("AUM-FetchedState", "Inflate Called");
            }
            Yc yc2 = (Yc) o10;
            InterfaceC3028m9 interfaceC3028m9L2 = yc2.l();
            if (interfaceC3028m9L2 != null) {
                ((C3053n9) interfaceC3028m9L2).a("AUM-NativeFetchedState", "transitionToLoadingState Called - starting ad inflation");
            }
            yc2.f23845j.a(new Cd(yc2.f23841f, yc2.f23842g, yc2.f23843h, yc2.f23844i, yc2.f23845j), yc2);
        }
        NativeAdEventListener nativeAdEventListener = hc2.f22805a.f23463a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFetchSuccessful(inMobiNative, adMetaInfo);
        }
        return mj.r.f64562a;
    }

    public final void a(final C2755be c2755be, final AdMetaInfo adMetaInfo) {
        ck.p.j(c2755be, "pubData");
        ck.p.j(adMetaInfo, "info");
        a(new bk.l() { // from class: b7.i1
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f4975b, c2755be, adMetaInfo, (InMobiNative) obj);
            }
        });
    }

    public static final mj.r a(Hc hc2, C2755be c2755be, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        C2780cd c2780cd = hc2.f22806b;
        c2780cd.getClass();
        ck.p.j(c2755be, "pubData");
        c2780cd.f24130a.f24238e = c2755be;
        NativeAdEventListener nativeAdEventListener = hc2.f22805a.f23463a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadSucceeded(inMobiNative, adMetaInfo);
        }
        return mj.r.f64562a;
    }

    public static final mj.r a(Hc hc2, InMobiAdRequestStatus inMobiAdRequestStatus, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f22805a.f23463a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
        }
        return mj.r.f64562a;
    }

    public static final mj.r a(Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f22805a.f23463a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked(inMobiNative);
        }
        InMobiNative.LockScreenListener lockScreenListener = hc2.f22805a.f23465c;
        if (lockScreenListener != null) {
            lockScreenListener.onActionRequired(inMobiNative);
        }
        return mj.r.f64562a;
    }

    public static final mj.r a(boolean z10, Hc hc2, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f22805a.f23464b;
        if (videoEventListener != null) {
            videoEventListener.onAudioStateChanged(inMobiNative, z10);
        }
        return mj.r.f64562a;
    }

    public static final mj.r a(Hc hc2, C2890gk c2890gk, InMobiNative inMobiNative) {
        ck.p.j(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f22805a.f23463a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdImpression(inMobiNative);
        }
        if (c2890gk != null) {
            c2890gk.c();
        }
        return mj.r.f64562a;
    }
}
