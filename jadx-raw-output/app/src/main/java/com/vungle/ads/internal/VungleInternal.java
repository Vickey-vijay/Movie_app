package com.vungle.ads.internal;

import android.content.Context;
import ck.p;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Utils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mj.g;

/* JADX INFO: compiled from: VungleInternal.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\b¨\u0006\u0010²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/VungleInternal;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/BidTokenCallback;", "callback", "Lmj/r;", "getAvailableBidTokensAsync", "", "getSdkVersion", "<init>", "()V", "Lcom/vungle/ads/internal/bidding/BidTokenEncoder;", "bidTokenEncoder", "Lcom/vungle/ads/internal/executor/SDKExecutors;", "sdkExecutors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleInternal {
    public final String getSdkVersion() {
        return BuildConfig.VERSION_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-2, reason: not valid java name */
    public static final void m3231getAvailableBidTokensAsync$lambda2(BidTokenCallback bidTokenCallback, g gVar) {
        p.j(bidTokenCallback, "$callback");
        p.j(gVar, "$bidTokenEncoder$delegate");
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        timeIntervalMetric.markStart();
        BidTokenEncoder.BiddingTokenInfo biddingTokenInfoEncode = m3229getAvailableBidTokensAsync$lambda0(gVar).encode();
        timeIntervalMetric.markEnd();
        if (biddingTokenInfoEncode.getBidToken().length() > 0) {
            bidTokenCallback.onBidTokenCollected(biddingTokenInfoEncode.getBidToken());
        } else {
            timeIntervalMetric.setMetricType(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            timeIntervalMetric.setMeta(biddingTokenInfoEncode.getErrorMessage());
            bidTokenCallback.onBidTokenError(biddingTokenInfoEncode.getErrorMessage());
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, (LogEntry) null, (String) null, 6, (Object) null);
    }

    public final void getAvailableBidTokensAsync(final Context context, final BidTokenCallback bidTokenCallback) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(bidTokenCallback, "callback");
        if (Utils.INSTANCE.isOSVersionInvalid()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            bidTokenCallback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!VungleAds.INSTANCE.isInitialized()) {
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            p.i(applicationContext, "context.applicationContext");
            privacyManager.init(applicationContext);
        }
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final g gVarB = kotlin.b.b(lazyThreadSafetyMode, new bk.a<BidTokenEncoder>() { // from class: com.vungle.ads.internal.VungleInternal$getAvailableBidTokensAsync$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.bidding.BidTokenEncoder, java.lang.Object] */
            @Override // bk.a
            public final BidTokenEncoder invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(BidTokenEncoder.class);
            }
        });
        m3230getAvailableBidTokensAsync$lambda1(kotlin.b.b(lazyThreadSafetyMode, new bk.a<SDKExecutors>() { // from class: com.vungle.ads.internal.VungleInternal$getAvailableBidTokensAsync$$inlined$inject$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.SDKExecutors, java.lang.Object] */
            @Override // bk.a
            public final SDKExecutors invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(SDKExecutors.class);
            }
        })).getAPI_EXECUTOR().execute(new Runnable() { // from class: com.vungle.ads.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                VungleInternal.m3231getAvailableBidTokensAsync$lambda2(bidTokenCallback, gVarB);
            }
        });
    }

    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-0, reason: not valid java name */
    private static final BidTokenEncoder m3229getAvailableBidTokensAsync$lambda0(g<BidTokenEncoder> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: getAvailableBidTokensAsync$lambda-1, reason: not valid java name */
    private static final SDKExecutors m3230getAvailableBidTokensAsync$lambda1(g<SDKExecutors> gVar) {
        return gVar.getValue();
    }
}
