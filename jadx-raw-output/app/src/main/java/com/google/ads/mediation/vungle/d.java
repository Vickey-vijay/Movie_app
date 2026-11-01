package com.google.ads.mediation.vungle;

import android.content.Context;
import ck.p;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: VungleSdkWrapper.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f18960a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.google.ads.mediation.vungle.a f18961b = new a();

    /* JADX INFO: compiled from: VungleSdkWrapper.kt */
    public static final class a implements com.google.ads.mediation.vungle.a {
        @Override // com.google.ads.mediation.vungle.a
        public void a(Context context, String str, InitializationListener initializationListener) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(str, "appId");
            p.j(initializationListener, "initializationListener");
            VungleAds.INSTANCE.init(context, str, initializationListener);
        }

        @Override // com.google.ads.mediation.vungle.a
        public void b(Context context, BidTokenCallback bidTokenCallback) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(bidTokenCallback, "callback");
            VungleAds.INSTANCE.getBiddingToken(context, bidTokenCallback);
        }

        @Override // com.google.ads.mediation.vungle.a
        public String getSdkVersion() {
            return VungleAds.INSTANCE.getSdkVersion();
        }

        @Override // com.google.ads.mediation.vungle.a
        public boolean isInitialized() {
            return VungleAds.INSTANCE.isInitialized();
        }
    }
}
