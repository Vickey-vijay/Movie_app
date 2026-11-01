package com.yandex.mobile.ads.nativeads;

import ck.p;
import yads.et3;
import yads.j02;
import yads.jt3;
import yads.kr3;
import yads.rt3;
import yads.tm;
import yads.w02;
import yads.y02;
import yads.z00;

/* JADX INFO: loaded from: classes10.dex */
public class d implements NativeAd, y02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w02 f51073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f51074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rt3 f51075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tm f51076d;

    public /* synthetic */ d(w02 w02Var) {
        this(w02Var, new f(), new rt3(), new tm());
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void bindNativeAd(NativeAdViewBinder nativeAdViewBinder) throws NativeAdException {
        try {
            this.f51074b.getClass();
            this.f51073a.a(f.a(nativeAdViewBinder));
        } catch (j02 e10) {
            throw new NativeAdException(e10.f78886b, e10);
        } catch (Throwable th2) {
            throw new NativeAdException("Ad binding failed with unexpected exception", th2);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && p.e(((d) obj).f51073a, this.f51073a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final NativeAdAssets getAdAssets() {
        return new et3(this.f51073a.getAdAssets());
    }

    public int hashCode() {
        return this.f51073a.hashCode();
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAd
    public final void setNativeAdEventListener(NativeAdEventListener nativeAdEventListener) {
        z00 jt3Var;
        if (nativeAdEventListener instanceof ClosableNativeAdEventListener) {
            jt3Var = new kr3((ClosableNativeAdEventListener) nativeAdEventListener);
        } else {
            jt3Var = nativeAdEventListener != null ? new jt3(nativeAdEventListener) : null;
        }
        this.f51073a.a(jt3Var);
    }

    public d(w02 w02Var, f fVar, rt3 rt3Var, tm tmVar) {
        this.f51073a = w02Var;
        this.f51074b = fVar;
        this.f51075c = rt3Var;
        this.f51076d = tmVar;
    }
}
