package lf;

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

/* JADX INFO: loaded from: classes11.dex */
public class a extends InternalBannerAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final AdSize f63531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private AdManagerAdView f63532b;

    public static final class b extends AdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final a f63533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final InternalLoadListener f63534b;

        private b(@NonNull a aVar, @NonNull InternalLoadListener internalLoadListener) {
            this.f63533a = aVar;
            this.f63534b = internalLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.f63534b.onAdLoadFailed(this.f63533a, n.a(BMError.NoFill, loadAdError));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalAdPresentListener adPresentListener = this.f63533a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull final LoadAdError loadAdError) {
            this.f63533a.onBackground(new Runnable() { // from class: lf.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63536b.a(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalAdPresentListener adPresentListener = this.f63533a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.f63533a.onBackground(new Runnable() { // from class: lf.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63538b.a();
                }
            });
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            InternalAdLoadData internalAdLoadDataA = n.a(this.f63533a.f63532b);
            this.f63533a.onAdLoaded(internalAdLoadDataA);
            this.f63534b.onAdLoaded(this.f63533a, internalAdLoadDataA);
        }
    }

    public static final class c implements OnPaidEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final a f63535a;

        private c(@NonNull a aVar) {
            this.f63535a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.f63535a.onPaidEvent(n.a(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(@NonNull final AdValue adValue) {
            this.f63535a.onBackground(new Runnable() { // from class: lf.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f63539b.a(adValue);
                }
            });
        }
    }

    public a(@NonNull NetworkParams networkParams, @NonNull TaskExecutor taskExecutor, @NonNull AdsFormat adsFormat, @NonNull Waterfall.Configuration.AdUnit adUnit, @NonNull InternalAdListener internalAdListener, @NonNull AdSize adSize) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
        this.f63531a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    @UiThread
    public void destroyAd() {
        AdManagerAdView adManagerAdView = this.f63532b;
        if (adManagerAdView != null) {
            adManagerAdView.setOnPaidEventListener(null);
            this.f63532b.destroy();
            this.f63532b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd
    @Nullable
    public View getAdView() {
        return this.f63532b;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    @SuppressLint({"MissingPermission"})
    @UiThread
    public void loadAd(@NonNull Context context, @NonNull InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.f63532b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f63532b.setAdUnitId(getAdUnitId());
        this.f63532b.setAdListener(new b(internalLoadListener));
        this.f63532b.setOnPaidEventListener(new c());
        this.f63532b.setAdSize(this.f63531a);
        this.f63532b.loadAd(n.a(getAdUnit()));
    }
}
