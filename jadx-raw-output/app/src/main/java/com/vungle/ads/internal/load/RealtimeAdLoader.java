package com.vungle.ads.internal.load;

import android.content.Context;
import bk.a;
import ck.p;
import com.ironsource.C3605n2;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: RealtimeAdLoader.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\u001b²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/load/RealtimeAdLoader;", "Lcom/vungle/ads/internal/load/BaseAdLoader;", "", "", C3605n2.f30218x, "Lmj/r;", "sendWinNotification", "requestAd", "onAdLoadReady", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "Lcom/vungle/ads/internal/executor/Executors;", "sdkExecutors", "Lcom/vungle/ads/internal/omsdk/OMInjector;", "omInjector", "Lcom/vungle/ads/internal/downloader/Downloader;", "downloader", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/load/AdRequest;", "adRequest", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/network/VungleApiClient;Lcom/vungle/ads/internal/executor/Executors;Lcom/vungle/ads/internal/omsdk/OMInjector;Lcom/vungle/ads/internal/downloader/Downloader;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/load/AdRequest;)V", "Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class RealtimeAdLoader extends BaseAdLoader {
    private final void sendWinNotification(List<String> list) {
        if (list != null && list.isEmpty()) {
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = getContext();
        g gVarB = b.b(LazyThreadSafetyMode.SYNCHRONIZED, new a<TpatSender>() { // from class: com.vungle.ads.internal.load.RealtimeAdLoader$sendWinNotification$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.TpatSender, java.lang.Object] */
            @Override // bk.a
            public final TpatSender invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(TpatSender.class);
            }
        });
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                TpatSender.sendTpat$default(m3248sendWinNotification$lambda2(gVarB), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.WIN_NOTIFICATION).withLogEntry(getLogEntry()).build(), false, 2, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeAdLoader(Context context, VungleApiClient vungleApiClient, Executors executors, OMInjector oMInjector, Downloader downloader, PathProvider pathProvider, AdRequest adRequest) {
        super(context, vungleApiClient, executors, oMInjector, downloader, pathProvider, adRequest);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(vungleApiClient, "vungleApiClient");
        p.j(executors, "sdkExecutors");
        p.j(oMInjector, "omInjector");
        p.j(downloader, "downloader");
        p.j(pathProvider, "pathProvider");
        p.j(adRequest, "adRequest");
    }

    /* JADX INFO: renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final VungleApiClient m3247requestAd$lambda0(g<VungleApiClient> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final TpatSender m3248sendWinNotification$lambda2(g<TpatSender> gVar) {
        return gVar.getValue();
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void onAdLoadReady() {
        List<String> winNotifications;
        AdPayload advertisement = getAdvertisement();
        if (advertisement != null) {
            winNotifications = advertisement.getWinNotifications();
        } else {
            winNotifications = null;
        }
        sendWinNotification(winNotifications);
    }

    @Override // com.vungle.ads.internal.load.BaseAdLoader
    public void requestAd() {
        BidPayload adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            onAdLoadFailed(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
            return;
        }
        if (ConfigManager.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                Logger.INSTANCE.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
                final Context context = getContext();
                g gVarB = b.b(LazyThreadSafetyMode.SYNCHRONIZED, new a<VungleApiClient>() { // from class: com.vungle.ads.internal.load.RealtimeAdLoader$requestAd$$inlined$inject$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                    @Override // bk.a
                    public final VungleApiClient invoke() {
                        return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
                    }
                });
                if (decodedAdsResponse != null) {
                    new RTADebugger(m3247requestAd$lambda0(gVarB)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        AdPayload ad2 = adMarkup.getAd();
        Integer version = adMarkup.getVersion();
        if (version != null && version.intValue() == 2 && ad2 != null) {
            handleAdMetaData$vungle_ads_release(ad2, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_ADM_LOAD));
        } else {
            onAdLoadFailed(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(getLogEntry()).logError$vungle_ads_release());
        }
    }
}
