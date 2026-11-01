package com.vungle.ads.internal.load;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryActiveError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.net.SocketTimeoutException;
import kotlin.Metadata;

/* JADX INFO: compiled from: DefaultAdLoader.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0014J\b\u0010\r\u001a\u00020\u0006H\u0016¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/internal/load/DefaultAdLoader;", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "Lcom/vungle/ads/VungleAdSize;", C3426d4.i.O, "Lcom/vungle/ads/internal/model/Placement;", "placement", "Lmj/r;", "fetchAdMetadata", "", "throwable", "Lcom/vungle/ads/VungleError;", "retrofitToVungleError", "requestAd", "onAdLoadReady", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/executor/Executors;", "sdkExecutors", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "omInjector", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloader", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/load/AdRequest;", "adRequest", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultAdLoader extends BaseAdLoader {

    /* JADX INFO: renamed from: com.vungle.ads.internal.load.DefaultAdLoader$fetchAdMetadata$1, reason: invalid class name */
    /* JADX INFO: compiled from: DefaultAdLoader.kt */
    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J(\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005H\u0016J\"\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"com/vungle/ads/internal/load/DefaultAdLoader$fetchAdMetadata$1", "Lcom/vungle/ads/internal/network/Callback;", "Lcom/vungle/ads/internal/model/AdPayload;", "Lcom/vungle/ads/internal/network/Call;", NotificationCompat.CATEGORY_CALL, "Lcom/vungle/ads/internal/network/Response;", "response", "Lmj/r;", "onResponse", "", "t", "onFailure", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class AnonymousClass1 implements Callback<AdPayload> {
        public final /* synthetic */ Placement $placement;

        public AnonymousClass1(Placement placement) {
            this.$placement = placement;
        }

        @Override // com.vungle.ads.internal.network.Callback
        public void onFailure(Call<AdPayload> call, final Throwable th2) {
            VungleThreadPoolExecutor background_executor = DefaultAdLoader.this.getSdkExecutors().getBACKGROUND_EXECUTOR();
            final DefaultAdLoader defaultAdLoader = DefaultAdLoader.this;
            background_executor.execute(new Runnable() { // from class: bd.f
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAdLoader.AnonymousClass1.m3245onFailure$lambda1(defaultAdLoader, th2);
                }
            });
        }

        @Override // com.vungle.ads.internal.network.Callback
        public void onResponse(Call<AdPayload> call, final Response<AdPayload> response) {
            VungleThreadPoolExecutor background_executor = DefaultAdLoader.this.getSdkExecutors().getBACKGROUND_EXECUTOR();
            final DefaultAdLoader defaultAdLoader = DefaultAdLoader.this;
            final Placement placement = this.$placement;
            background_executor.execute(new Runnable() { // from class: bd.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultAdLoader.AnonymousClass1.m3246onResponse$lambda0(defaultAdLoader, placement, response);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onFailure$lambda-1, reason: not valid java name */
        public static final void m3245onFailure$lambda1(DefaultAdLoader defaultAdLoader, Throwable th2) {
            p.j(defaultAdLoader, "this$0");
            defaultAdLoader.onAdLoadFailed(defaultAdLoader.retrofitToVungleError(th2).setLogEntry$vungle_ads_release(defaultAdLoader.getLogEntry()).logError$vungle_ads_release());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onResponse$lambda-0, reason: not valid java name */
        public static final void m3246onResponse$lambda0(DefaultAdLoader defaultAdLoader, Placement placement, Response response) {
            AdPayload adPayload;
            p.j(defaultAdLoader, "this$0");
            p.j(placement, "$placement");
            if (defaultAdLoader.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
                defaultAdLoader.onAdLoadFailed(new AdRetryError().setLogEntry$vungle_ads_release(defaultAdLoader.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            boolean z10 = false;
            if (response != null && !response.isSuccessful()) {
                z10 = true;
            }
            if (z10) {
                defaultAdLoader.onAdLoadFailed(new APIFailedStatusCodeError("ads API: " + response.code()).setLogEntry$vungle_ads_release(defaultAdLoader.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            AdPayload.AdUnit adUnit = null;
            if (response != null) {
                adPayload = (AdPayload) response.body();
            } else {
                adPayload = null;
            }
            if (adPayload != null) {
                adUnit = adPayload.adUnit();
            }
            if (adUnit == null) {
                defaultAdLoader.onAdLoadFailed(new AdResponseEmptyError("Ad response is empty").setLogEntry$vungle_ads_release(defaultAdLoader.getLogEntry()).logError$vungle_ads_release());
            } else {
                defaultAdLoader.handleAdMetaData$vungle_ads_release(adPayload, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_AD_LOAD));
            }
        }
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultAdLoader(Context context, VungleApiClient vungleApiClient, Executors executors, OMInjector oMInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, executors, oMInjector, downloader, pathProvider, adRequest);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(vungleApiClient, "vungleApiClient");
        p.j(executors, "sdkExecutors");
        p.j(oMInjector, "omInjector");
        p.j(downloader, "downloader");
        p.j(pathProvider, "pathProvider");
        p.j(adRequest, "adRequest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VungleError retrofitToVungleError(Throwable throwable) {
        if (throwable instanceof SocketTimeoutException) {
            return new NetworkTimeoutError();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ads request fail: ");
        sb2.append(throwable != null ? throwable.getMessage() : null);
        return new NetworkUnreachable(sb2.toString());
    }

    private final void fetchAdMetadata(VungleAdSize vungleAdSize, Placement placement) {
        if (getVungleApiClient().checkIsRetryAfterActive(placement.getReferenceId())) {
            onAdLoadFailed(new AdRetryActiveError().setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
            return;
        }
        Call<AdPayload> callRequestAd = getVungleApiClient().requestAd(placement.getReferenceId(), vungleAdSize);
        if (callRequestAd == null) {
            onAdLoadFailed(new NetworkUnreachable("adsCall is null").setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
        } else {
            callRequestAd.enqueue(new AnonymousClass1(placement));
        }
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }
}
