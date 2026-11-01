package com.vungle.ads.internal.bidding;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import bk.l;
import ck.p;
import ck.s;
import cl.a;
import cl.d;
import cl.m;
import com.ironsource.C3426d4;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.RtbRequest;
import com.vungle.ads.internal.model.RtbToken;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.VungleHeader;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.InputOutputUtils;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import mj.g;
import mj.r;
import xk.h;

/* JADX INFO: compiled from: BidTokenEncoder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002,+B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0002J\u000f\u0010\u000e\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010\u0006R(\u0010\"\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0006\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006/²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/bidding/BidTokenEncoder;", "", "Lcom/vungle/ads/internal/bidding/BidTokenEncoder$BiddingTokenInfo;", "generateBidToken", "Lmj/r;", "onResume$vungle_ads_release", "()V", C3426d4.i.f28569u0, "onPause$vungle_ads_release", C3426d4.i.f28567t0, "encode", "", "constructV6Token$vungle_ads_release", "()Ljava/lang/String;", "constructV6Token", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "Lcom/vungle/ads/SingleValueMetric;", "bidTokenRequestedMetric", "Lcom/vungle/ads/SingleValueMetric;", "", "ordinalView", "I", "getOrdinalView$vungle_ads_release", "()I", "setOrdinalView$vungle_ads_release", "(I)V", "getOrdinalView$vungle_ads_release$annotations", "Lcl/a;", "json", "Lcl/a;", "getJson$annotations", "", "enterBackgroundTime", "J", "getEnterBackgroundTime$vungle_ads_release", "()J", "setEnterBackgroundTime$vungle_ads_release", "(J)V", "getEnterBackgroundTime$vungle_ads_release$annotations", "<init>", "(Landroid/content/Context;)V", VastTagName.COMPANION, "BiddingTokenInfo", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class BidTokenEncoder {
    private static final String TAG = "BidTokenEncoder";
    public static final int TOKEN_VERSION = 6;
    private SingleValueMetric bidTokenRequestedMetric;
    private final Context context;
    private long enterBackgroundTime;
    private final a json;
    private int ordinalView;

    /* JADX INFO: compiled from: BidTokenEncoder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/bidding/BidTokenEncoder$BiddingTokenInfo;", "", "bidToken", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getBidToken", "()Ljava/lang/String;", "getErrorMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class BiddingTokenInfo {
        private final String bidToken;
        private final String errorMessage;

        public static /* synthetic */ BiddingTokenInfo copy$default(BiddingTokenInfo biddingTokenInfo, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = biddingTokenInfo.bidToken;
            }
            if ((i10 & 2) != 0) {
                str2 = biddingTokenInfo.errorMessage;
            }
            return biddingTokenInfo.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBidToken() {
            return this.bidToken;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final BiddingTokenInfo copy(String bidToken, String errorMessage) {
            p.j(bidToken, "bidToken");
            p.j(errorMessage, "errorMessage");
            return new BiddingTokenInfo(bidToken, errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BiddingTokenInfo)) {
                return false;
            }
            BiddingTokenInfo biddingTokenInfo = (BiddingTokenInfo) other;
            return p.e(this.bidToken, biddingTokenInfo.bidToken) && p.e(this.errorMessage, biddingTokenInfo.errorMessage);
        }

        public int hashCode() {
            return (this.bidToken.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public String toString() {
            return "BiddingTokenInfo(bidToken=" + this.bidToken + ", errorMessage=" + this.errorMessage + ')';
        }

        public BiddingTokenInfo(String str, String str2) {
            p.j(str, "bidToken");
            p.j(str2, "errorMessage");
            this.bidToken = str;
            this.errorMessage = str2;
        }

        public final String getBidToken() {
            return this.bidToken;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getEnterBackgroundTime$vungle_ads_release$annotations() {
    }

    private static /* synthetic */ void getJson$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getOrdinalView$vungle_ads_release$annotations() {
    }

    public BidTokenEncoder(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
        this.bidTokenRequestedMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.json = m.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$json$1
            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(d dVar) {
                p.j(dVar, "$this$Json");
                dVar.f(true);
                dVar.d(true);
                dVar.e(false);
            }
        }, 1, null);
        ActivityManager.INSTANCE.addLifecycleListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder.1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onBackground() {
                BidTokenEncoder.this.onPause$vungle_ads_release();
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onForeground() {
                BidTokenEncoder.this.onResume$vungle_ads_release();
            }
        });
    }

    private final BiddingTokenInfo generateBidToken() {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.bidTokenRequestedMetric, (LogEntry) null, (String) null, 6, (Object) null);
        try {
            String strConstructV6Token$vungle_ads_release = constructV6Token$vungle_ads_release();
            Logger.Companion companion = Logger.INSTANCE;
            companion.d(TAG, "BidToken: " + strConstructV6Token$vungle_ads_release);
            try {
                String str = "6:" + InputOutputUtils.INSTANCE.convertForSending(strConstructV6Token$vungle_ads_release);
                companion.d(TAG, "After conversion: " + str);
                return new BiddingTokenInfo(str, "");
            } catch (Throwable th2) {
                String str2 = "Fail to gzip token data. " + th2.getLocalizedMessage();
                new GzipEncodeError(str2).logErrorNoReturnValue$vungle_ads_release();
                return new BiddingTokenInfo("", str2);
            }
        } catch (Throwable th3) {
            String str3 = "Failed to encode TokenParameters. " + th3.getLocalizedMessage();
            new JsonEncodeError(str3).logErrorNoReturnValue$vungle_ads_release();
            return new BiddingTokenInfo("", str3);
        }
    }

    @VisibleForTesting
    public final String constructV6Token$vungle_ads_release() {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        VungleApiClient vungleApiClientM3232constructV6Token$lambda0 = m3232constructV6Token$lambda0(b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<VungleApiClient>() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder$constructV6Token$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
            @Override // bk.a
            public final VungleApiClient invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(VungleApiClient.class);
            }
        }));
        ConfigManager configManager = ConfigManager.INSTANCE;
        CommonRequestBody commonRequestBodyRequestBody = vungleApiClientM3232constructV6Token$lambda0.requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        RtbToken rtbToken = new RtbToken(commonRequestBodyRequestBody.getDevice(), commonRequestBodyRequestBody.getUser(), commonRequestBodyRequestBody.getExt(), new RtbRequest(VungleHeader.INSTANCE.getHeaderUa()), this.ordinalView);
        a aVar = this.json;
        xk.b<Object> bVarB = h.b(aVar.a(), s.l(RtbToken.class));
        p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return aVar.c(bVarB, rtbToken);
    }

    public final BiddingTokenInfo encode() {
        this.ordinalView++;
        return generateBidToken();
    }

    /* JADX INFO: renamed from: getEnterBackgroundTime$vungle_ads_release, reason: from getter */
    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    /* JADX INFO: renamed from: getOrdinalView$vungle_ads_release, reason: from getter */
    public final int getOrdinalView() {
        return this.ordinalView;
    }

    @VisibleForTesting(otherwise = 2)
    public final void onPause$vungle_ads_release() {
        Logger.INSTANCE.d(TAG, "BidTokenEncoder#onBackground()");
        this.enterBackgroundTime = System.currentTimeMillis();
    }

    @VisibleForTesting(otherwise = 2)
    public final void onResume$vungle_ads_release() {
        Logger.INSTANCE.d(TAG, "BidTokenEncoder#onForeground()");
        if (System.currentTimeMillis() > this.enterBackgroundTime + ConfigManager.INSTANCE.getSessionTimeout()) {
            this.ordinalView = 0;
            this.enterBackgroundTime = 0L;
        }
    }

    public final void setEnterBackgroundTime$vungle_ads_release(long j10) {
        this.enterBackgroundTime = j10;
    }

    public final void setOrdinalView$vungle_ads_release(int i10) {
        this.ordinalView = i10;
    }

    /* JADX INFO: renamed from: constructV6Token$lambda-0, reason: not valid java name */
    private static final VungleApiClient m3232constructV6Token$lambda0(g<VungleApiClient> gVar) {
        return gVar.getValue();
    }
}
