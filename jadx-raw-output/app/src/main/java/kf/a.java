package kf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes2.dex */
public class a extends InternalBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final AdSize f62780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private AdManagerAdView f62781b;

    public static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final a f62782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final InternalLoadListener f62783b;

        private b(@NonNull a aVar, @NonNull InternalLoadListener internalLoadListener) {
            this.f62782a = aVar;
            this.f62783b = internalLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f62783b.onAdLoadFailed(this.f62782a, n.a(BMError.NoFill, loadAdError));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalAdPresentListener adPresentListener = this.f62782a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            this.f62782a.onBackground(new Runnable() { // from class: kf.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62785b.a(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalAdPresentListener adPresentListener = this.f62782a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f62782a.onBackground(new Runnable() { // from class: kf.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62787b.a();
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            InternalAdLoadData internalAdLoadDataA = n.a(this.f62782a.f62781b);
            this.f62782a.onAdLoaded(internalAdLoadDataA);
            this.f62783b.onAdLoaded(this.f62782a, internalAdLoadDataA);
        }
    }

    public static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final a f62784a;

        private c(@NonNull a aVar) {
            this.f62784a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f62784a.onPaidEvent(n.a(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(@NonNull final AdValue adValue) {
            this.f62784a.onBackground(new Runnable() { // from class: kf.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62788b.a(adValue);
                }
            });
        }
    }

    public a(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener, @NonNull AdSize adSize) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
        this.f62780a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    @UiThread
    public void destroyAd() {
        AdManagerAdView adManagerAdView = this.f62781b;
        if (adManagerAdView != null) {
            adManagerAdView.setOnPaidEventListener(null);
            this.f62781b.destroy();
            this.f62781b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd
    @Nullable
    public View getAdView() {
        return this.f62781b;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    @SuppressLint({"MissingPermission"})
    @UiThread
    public void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f62781b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f62781b.setAdUnitId(getAdUnitId());
        this.f62781b.setAdListener(new b(internalLoadListener));
        this.f62781b.setOnPaidEventListener(new c());
        this.f62781b.setAdSize(this.f62780a);
        this.f62781b.loadAd(n.a(getAdUnit()));
    }
}
