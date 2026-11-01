package com.vungle.ads;

import android.content.Context;
import ck.p;
import com.ironsource.C3702sd;
import com.ironsource.Mf;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.ThreadUtil;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mj.g;
import mj.r;

/* JADX INFO: compiled from: BaseAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\r\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0010¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001b\u00105\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u00109R\u001a\u0010<\u001a\u00020;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010E\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010B\u001a\u0004\bF\u0010DR\u001a\u0010G\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010DR\u001a\u0010I\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010B\u001a\u0004\bJ\u0010DR\u001a\u0010L\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001a\u0010P\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010OR\u001a\u0010R\u001a\u00020@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010B\u001a\u0004\bS\u0010DR$\u0010U\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010\\\u001a\u0004\u0018\u00010\r2\b\u0010[\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010\"\u001a\u0004\b]\u0010$R(\u0010^\u001a\u0004\u0018\u00010\r2\b\u0010[\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b^\u0010\"\u001a\u0004\b_\u0010$¨\u0006b"}, d2 = {"Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/Ad;", "Lmj/r;", "onLoadEnd", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/AdInternal;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/AdInternal;", "constructAdInternal", "", "canPlayAd", "()Ljava/lang/Boolean;", "", "adMarkup", "load", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "onAdLoaded$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", Mf.f27060j, "baseAd", "onLoadSuccess$vungle_ads_release", "(Lcom/vungle/ads/BaseAd;Ljava/lang/String;)V", C3702sd.f30731f, "Lcom/vungle/ads/VungleError;", "vungleError", "onLoadFailure$vungle_ads_release", "(Lcom/vungle/ads/BaseAd;Lcom/vungle/ads/VungleError;)V", "onLoadFailure", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "placementId", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "Lcom/vungle/ads/AdConfig;", "adConfig", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "Lcom/vungle/ads/BaseAdListener;", "adListener", "Lcom/vungle/ads/BaseAdListener;", "getAdListener", "()Lcom/vungle/ads/BaseAdListener;", "setAdListener", "(Lcom/vungle/ads/BaseAdListener;)V", "adInternal$delegate", "Lmj/g;", "getAdInternal$vungle_ads_release", "()Lcom/vungle/ads/internal/AdInternal;", "adInternal", "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "getSignalManager$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "getLogEntry$vungle_ads_release", "()Lcom/vungle/ads/internal/util/LogEntry;", "Lcom/vungle/ads/TimeIntervalMetric;", "responseToShowMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "getResponseToShowMetric$vungle_ads_release", "()Lcom/vungle/ads/TimeIntervalMetric;", "presentToDisplayMetric", "getPresentToDisplayMetric$vungle_ads_release", "showToFailMetric", "getShowToFailMetric$vungle_ads_release", "displayToClickMetric", "getDisplayToClickMetric$vungle_ads_release", "Lcom/vungle/ads/SingleValueMetric;", "leaveApplicationMetric", "Lcom/vungle/ads/SingleValueMetric;", "getLeaveApplicationMetric$vungle_ads_release", "()Lcom/vungle/ads/SingleValueMetric;", "rewardedMetric", "getRewardedMetric$vungle_ads_release", "showToCloseMetric", "getShowToCloseMetric$vungle_ads_release", "Lcom/vungle/ads/internal/signals/SignaledAd;", "signaledAd", "Lcom/vungle/ads/internal/signals/SignaledAd;", "getSignaledAd$vungle_ads_release", "()Lcom/vungle/ads/internal/signals/SignaledAd;", "setSignaledAd$vungle_ads_release", "(Lcom/vungle/ads/internal/signals/SignaledAd;)V", "<set-?>", "creativeId", "getCreativeId", "eventId", "getEventId", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public abstract class BaseAd implements Ad {
    private final AdConfig adConfig;

    /* JADX INFO: renamed from: adInternal$delegate, reason: from kotlin metadata */
    private final g adInternal;
    private BaseAdListener adListener;
    private final Context context;
    private String creativeId;
    private final TimeIntervalMetric displayToClickMetric;
    private String eventId;
    private final SingleValueMetric leaveApplicationMetric;
    private final LogEntry logEntry;
    private final String placementId;
    private final TimeIntervalMetric presentToDisplayMetric;
    private final TimeIntervalMetric responseToShowMetric;
    private final SingleValueMetric rewardedMetric;
    private final TimeIntervalMetric showToCloseMetric;
    private final TimeIntervalMetric showToFailMetric;

    /* JADX INFO: renamed from: signalManager$delegate, reason: from kotlin metadata */
    private final g signalManager;
    private SignaledAd signaledAd;

    public abstract AdInternal constructAdInternal$vungle_ads_release(Context context);

    public BaseAd(final Context context, String str, AdConfig adConfig) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        p.j(adConfig, "adConfig");
        this.context = context;
        this.placementId = str;
        this.adConfig = adConfig;
        this.adInternal = kotlin.b.a(new bk.a<AdInternal>() { // from class: com.vungle.ads.BaseAd$adInternal$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final AdInternal invoke() {
                BaseAd baseAd = this.this$0;
                AdInternal adInternalConstructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
                adInternalConstructAdInternal$vungle_ads_release.setLogEntry$vungle_ads_release(this.this$0.getLogEntry());
                return adInternalConstructAdInternal$vungle_ads_release;
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.signalManager = kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<SignalManager>() { // from class: com.vungle.ads.BaseAd$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // bk.a
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(SignalManager.class);
            }
        });
        LogEntry logEntry = new LogEntry();
        logEntry.setPlacementRefId$vungle_ads_release(str);
        this.logEntry = logEntry;
        this.responseToShowMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.presentToDisplayMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_PRESENT_TO_DISPLAY_DURATION_MS);
        this.showToFailMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_FAIL_DURATION_MS);
        this.displayToClickMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_DISPLAY_TO_CLICK_DURATION_MS);
        this.leaveApplicationMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_LEAVE_APPLICATION);
        this.rewardedMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_REWARD_USER);
        this.showToCloseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_CLOSE_DURATION_MS);
    }

    private final void onLoadEnd() {
        this.responseToShowMetric.markStart();
    }

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final AdInternal getAdInternal$vungle_ads_release() {
        return (AdInternal) this.adInternal.getValue();
    }

    public final BaseAdListener getAdListener() {
        return this.adListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    /* JADX INFO: renamed from: getDisplayToClickMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getDisplayToClickMetric() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: getLeaveApplicationMetric$vungle_ads_release, reason: from getter */
    public final SingleValueMetric getLeaveApplicationMetric() {
        return this.leaveApplicationMetric;
    }

    /* JADX INFO: renamed from: getLogEntry$vungle_ads_release, reason: from getter */
    public final LogEntry getLogEntry() {
        return this.logEntry;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    /* JADX INFO: renamed from: getPresentToDisplayMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getPresentToDisplayMetric() {
        return this.presentToDisplayMetric;
    }

    /* JADX INFO: renamed from: getResponseToShowMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getResponseToShowMetric() {
        return this.responseToShowMetric;
    }

    /* JADX INFO: renamed from: getRewardedMetric$vungle_ads_release, reason: from getter */
    public final SingleValueMetric getRewardedMetric() {
        return this.rewardedMetric;
    }

    /* JADX INFO: renamed from: getShowToCloseMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getShowToCloseMetric() {
        return this.showToCloseMetric;
    }

    /* JADX INFO: renamed from: getShowToFailMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getShowToFailMetric() {
        return this.showToFailMetric;
    }

    public final SignalManager getSignalManager$vungle_ads_release() {
        return (SignalManager) this.signalManager.getValue();
    }

    /* JADX INFO: renamed from: getSignaledAd$vungle_ads_release, reason: from getter */
    public final SignaledAd getSignaledAd() {
        return this.signaledAd;
    }

    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        p.j(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String strEventId = advertisement.eventId();
        this.eventId = strEventId;
        SignaledAd signaledAd = this.signaledAd;
        if (signaledAd == null) {
            return;
        }
        signaledAd.setEventId(strEventId);
    }

    public void onLoadFailure$vungle_ads_release(BaseAd baseAd, final VungleError vungleError) {
        p.j(baseAd, "baseAd");
        p.j(vungleError, "vungleError");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseAd$onLoadFailure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BaseAdListener adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(this.this$0, vungleError);
                }
            }
        });
    }

    public void onLoadSuccess$vungle_ads_release(BaseAd baseAd, String adMarkup) {
        p.j(baseAd, "baseAd");
        onLoadEnd();
        ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseAd$onLoadSuccess$1
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BaseAdListener adListener = this.this$0.getAdListener();
                if (adListener != null) {
                    adListener.onAdLoaded(this.this$0);
                }
            }
        });
    }

    public final void setAdListener(BaseAdListener baseAdListener) {
        this.adListener = baseAdListener;
    }

    public final void setSignaledAd$vungle_ads_release(SignaledAd signaledAd) {
        this.signaledAd = signaledAd;
    }

    @Override // com.vungle.ads.Ad
    public Boolean canPlayAd() {
        boolean z10 = false;
        if (AdInternal.canPlayAd$default(getAdInternal$vungle_ads_release(), false, 1, null) == null) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.vungle.ads.Ad
    public void load(final String str) {
        getAdInternal$vungle_ads_release().loadAd(this.placementId, str, new AdLoaderCallback() { // from class: com.vungle.ads.BaseAd.load.1
            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onFailure(VungleError vungleError) {
                p.j(vungleError, "error");
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadFailure$vungle_ads_release(baseAd, vungleError);
            }

            @Override // com.vungle.ads.internal.load.AdLoaderCallback
            public void onSuccess(AdPayload adPayload) {
                p.j(adPayload, "advertisement");
                BaseAd.this.onAdLoaded$vungle_ads_release(adPayload);
                BaseAd baseAd = BaseAd.this;
                baseAd.onLoadSuccess$vungle_ads_release(baseAd, str);
            }
        });
    }
}
