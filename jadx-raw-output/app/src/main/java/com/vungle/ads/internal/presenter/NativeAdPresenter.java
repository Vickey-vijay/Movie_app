package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3426d4;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.LinkError;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.omsdk.NativeOMTracker;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ExternalRouter;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mj.g;
import mj.h;

/* JADX INFO: compiled from: NativeAdPresenter.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 C2\u00020\u0001:\u0001CB)\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\bA\u0010BJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0014\u001a\u00020\u0004J\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0004R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u0001068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010/\u001a\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006F²\u0006\f\u0010E\u001a\u00020D8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "", "", "ctaUrl", "Lmj/r;", "onDownload", "privacyUrl", "onPrivacy", "start", "", "needShowGdpr", "showGdpr", C3426d4.i.W, "triggerEventMetricForTpat", "Lcom/vungle/ads/internal/presenter/AdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setEventListener", "action", "value", "processCommand", "prepare", "detach", "omSdkData", "initOMTracker", "Landroid/view/View;", "rootView", "startTracking", "onImpression", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;", "delegate", "Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/platform/Platform;", "", "adStartTime", "Ljava/lang/Long;", "bus", "Lcom/vungle/ads/internal/presenter/AdEventListener;", "Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender$delegate", "Lmj/g;", "getTpatSender", "()Lcom/vungle/ads/internal/network/TpatSender;", "tpatSender", "Landroid/app/Dialog;", "currentDialog", "Landroid/app/Dialog;", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry$delegate", "getLogEntry", "()Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "adViewed", "Z", "adClicked", "Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "omTracker", "Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/presenter/NativePresenterDelegate;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/internal/platform/Platform;)V", VastTagName.COMPANION, "Lcom/vungle/ads/internal/omsdk/OMInjector;", "omInjector", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class NativeAdPresenter {
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    private static final String TAG = "NativeAdPresenter";
    public static final String TPAT = "tpat";
    public static final String VIDEO_VIEWED = "videoViewed";
    private boolean adClicked;
    private Long adStartTime;
    private boolean adViewed;
    private final AdPayload advertisement;
    private AdEventListener bus;
    private final Context context;
    private Dialog currentDialog;
    private final NativePresenterDelegate delegate;

    /* JADX INFO: renamed from: logEntry$delegate, reason: from kotlin metadata */
    private final g logEntry;
    private NativeOMTracker omTracker;
    private final Platform platform;

    /* JADX INFO: renamed from: tpatSender$delegate, reason: from kotlin metadata */
    private final g tpatSender;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<String, Sdk.SDKMetric.SDKMetricType> eventMap = kotlin.collections.a.m(h.a("checkpoint.0", Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), h.a("clickUrl", Sdk.SDKMetric.SDKMetricType.AD_CLICK_EVENT));

    /* JADX INFO: compiled from: NativeAdPresenter.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R(\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vungle/ads/internal/presenter/NativeAdPresenter$Companion;", "", "()V", "DOWNLOAD", "", "OPEN_PRIVACY", "TAG", "TPAT", "VIDEO_VIEWED", "eventMap", "", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$SDKMetricType;", "getEventMap$vungle_ads_release$annotations", "getEventMap$vungle_ads_release", "()Ljava/util/Map;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getEventMap$vungle_ads_release$annotations() {
        }

        public final Map<String, Sdk.SDKMetric.SDKMetricType> getEventMap$vungle_ads_release() {
            return NativeAdPresenter.eventMap;
        }
    }

    public NativeAdPresenter(final Context context, NativePresenterDelegate nativePresenterDelegate, AdPayload adPayload, Platform platform) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(nativePresenterDelegate, "delegate");
        p.j(platform, "platform");
        this.context = context;
        this.delegate = nativePresenterDelegate;
        this.advertisement = adPayload;
        this.platform = platform;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.tpatSender = kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<TpatSender>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$special$$inlined$inject$1
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
        this.logEntry = kotlin.b.a(new bk.a<LogEntry>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$logEntry$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final LogEntry invoke() {
                AdPayload adPayload2 = this.this$0.advertisement;
                if (adPayload2 != null) {
                    return adPayload2.getLogEntry();
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogEntry getLogEntry() {
        return (LogEntry) this.logEntry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TpatSender getTpatSender() {
        return (TpatSender) this.tpatSender.getValue();
    }

    private final boolean needShowGdpr() {
        return ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && p.e("unknown", PrivacyManager.INSTANCE.getConsentStatus());
    }

    private final void onDownload(String str) {
        AdEventListener adEventListener;
        AdPayload.AdUnit adUnit;
        String deeplinkUrl = null;
        if (!this.adClicked) {
            boolean z10 = true;
            this.adClicked = true;
            AdPayload adPayload = this.advertisement;
            List tpatUrls$default = adPayload != null ? AdPayload.getTpatUrls$default(adPayload, "clickUrl", null, null, 6, null) : null;
            if (tpatUrls$default != null && !tpatUrls$default.isEmpty()) {
                z10 = false;
            }
            if (z10) {
                new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key: clickUrl").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                Iterator it = tpatUrls$default.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey("clickUrl").withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
            if (str != null) {
                TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder(str).tpatKey(Constants.CTA_URL).withLogEntry(getLogEntry()).build(), false, 2, null);
            }
        }
        AdPayload adPayload2 = this.advertisement;
        if (adPayload2 != null && (adUnit = adPayload2.adUnit()) != null) {
            deeplinkUrl = adUnit.getDeeplinkUrl();
        }
        final String str2 = deeplinkUrl;
        boolean zLaunch$vungle_ads_release = ExternalRouter.INSTANCE.launch$vungle_ads_release(str2, str, this.context, getLogEntry(), new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$onDownload$launched$1
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean z11) {
                if (!z11) {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + str2).setLogEntry$vungle_ads_release(this.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                }
                AdPayload adPayload3 = this.advertisement;
                List tpatUrls$default2 = adPayload3 != null ? AdPayload.getTpatUrls$default(adPayload3, Constants.DEEPLINK_CLICK, String.valueOf(z11), null, 4, null) : null;
                if (tpatUrls$default2 != null) {
                    NativeAdPresenter nativeAdPresenter = this;
                    Iterator it2 = tpatUrls$default2.iterator();
                    while (it2.hasNext()) {
                        TpatSender.sendTpat$default(nativeAdPresenter.getTpatSender(), new TpatRequest.Builder((String) it2.next()).tpatKey(Constants.DEEPLINK_CLICK).withLogEntry(nativeAdPresenter.getLogEntry()).build(), false, 2, null);
                    }
                }
            }
        });
        AdEventListener adEventListener2 = this.bus;
        if (adEventListener2 != null) {
            adEventListener2.onNext("open", "adClick", this.delegate.getPlacementRefId());
        }
        if (!zLaunch$vungle_ads_release || (adEventListener = this.bus) == null) {
            return;
        }
        adEventListener.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
    }

    private final void onPrivacy(String str) {
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), getLogEntry(), (String) null, 4, (Object) null);
        if (str != null) {
            if (!FileUtility.INSTANCE.isValidUrl(str)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            if (!ExternalRouter.INSTANCE.launch$vungle_ads_release((16 & 1) != 0 ? null : null, (16 & 2) != 0 ? null : str, this.context, (16 & 8) != 0 ? null : getLogEntry(), (16 & 16) != 0 ? null : null)) {
                new PrivacyUrlError(str).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            AdEventListener adEventListener = this.bus;
            if (adEventListener != null) {
                adEventListener.onNext("open", "adLeftApplication", this.delegate.getPlacementRefId());
            }
        }
    }

    public static /* synthetic */ void processCommand$default(NativeAdPresenter nativeAdPresenter, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        nativeAdPresenter.processCommand(str, str2);
    }

    private final void showGdpr() {
        PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.context instanceof Activity)) {
            Logger.INSTANCE.w(TAG, "We can not show GDPR dialog with application context.");
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.ads.internal.presenter.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                NativeAdPresenter.m3260showGdpr$lambda8(this.f45455b, dialogInterface, i10);
            }
        };
        ConfigManager configManager = ConfigManager.INSTANCE;
        String gDPRConsentTitle = configManager.getGDPRConsentTitle();
        String gDPRConsentMessage = configManager.getGDPRConsentMessage();
        String gDPRButtonAccept = configManager.getGDPRButtonAccept();
        String gDPRButtonDeny = configManager.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        boolean z10 = true;
        if (!(gDPRConsentTitle == null || gDPRConsentTitle.length() == 0)) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            z10 = false;
        }
        if (!z10) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, onClickListener);
        builder.setNegativeButton(gDPRButtonDeny, onClickListener);
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.e
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NativeAdPresenter.m3261showGdpr$lambda9(this.f45456b, dialogInterface);
            }
        });
        this.currentDialog = alertDialogCreate;
        alertDialogCreate.show();
    }

    private final void triggerEventMetricForTpat(String str) {
        Sdk.SDKMetric.SDKMetricType sDKMetricType = eventMap.get(str);
        if (sDKMetricType != null) {
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(sDKMetricType), getLogEntry(), (String) null, 4, (Object) null);
        }
    }

    public final void detach() {
        List<String> tpatUrls;
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.stop();
        }
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        Long l10 = this.adStartTime;
        if (l10 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l10.longValue();
            AdPayload adPayload = this.advertisement;
            if (adPayload != null && (tpatUrls = adPayload.getTpatUrls(Constants.AD_CLOSE, String.valueOf(jCurrentTimeMillis), String.valueOf(this.platform.getVolumeLevel()))) != null) {
                Iterator<T> it = tpatUrls.iterator();
                while (it.hasNext()) {
                    TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(Constants.AD_CLOSE).withLogEntry(getLogEntry()).build(), false, 2, null);
                }
            }
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("end", null, this.delegate.getPlacementRefId());
        }
    }

    public final void initOMTracker(String str) {
        p.j(str, "omSdkData");
        AdPayload adPayload = this.advertisement;
        boolean zOmEnabled = adPayload != null ? adPayload.omEnabled() : false;
        if ((str.length() > 0) && zOmEnabled) {
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context = this.context;
            String oMSDKJS$vungle_ads_release = m3259initOMTracker$lambda10(kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<OMInjector>() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$initOMTracker$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMInjector, java.lang.Object] */
                @Override // bk.a
                public final OMInjector invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(OMInjector.class);
                }
            })).getOMSDKJS$vungle_ads_release();
            if (oMSDKJS$vungle_ads_release != null) {
                this.omTracker = new NativeOMTracker(str, oMSDKJS$vungle_ads_release);
            }
        }
    }

    public final void onImpression() {
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.impressionOccurred();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00db  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void processCommand(String str, String str2) {
        List<String> tpatUrls$default;
        p.j(str, "action");
        boolean z10 = true;
        switch (str.hashCode()) {
            case -511324706:
                if (str.equals("openPrivacy")) {
                    onPrivacy(str2);
                    return;
                }
                break;
            case 3566511:
                if (str.equals("tpat")) {
                    if (str2 == null || str2.length() == 0) {
                        new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                    triggerEventMetricForTpat(str2);
                    if (p.e(str2, "checkpoint.0")) {
                        AdPayload adPayload = this.advertisement;
                        if (adPayload != null) {
                            tpatUrls$default = adPayload.getTpatUrls(str2, this.platform.getCarrierName(), String.valueOf(this.platform.getVolumeLevel()));
                        } else {
                            tpatUrls$default = null;
                        }
                    } else {
                        AdPayload adPayload2 = this.advertisement;
                        if (adPayload2 != null) {
                            tpatUrls$default = AdPayload.getTpatUrls$default(adPayload2, str2, null, null, 6, null);
                        } else {
                            tpatUrls$default = null;
                        }
                    }
                    if (tpatUrls$default != null && !tpatUrls$default.isEmpty()) {
                        z10 = false;
                    }
                    if (!z10) {
                        Iterator<T> it = tpatUrls$default.iterator();
                        while (it.hasNext()) {
                            TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it.next()).tpatKey(str2).withLogEntry(getLogEntry()).build(), false, 2, null);
                        }
                        return;
                    } else {
                        new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Empty urls for tpat: " + str2).setLogEntry$vungle_ads_release(getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
                        return;
                    }
                }
                break;
            case 1118284383:
                if (str.equals(VIDEO_VIEWED)) {
                    AdEventListener adEventListener = this.bus;
                    if (adEventListener == null || this.adViewed) {
                        return;
                    }
                    this.adViewed = true;
                    if (adEventListener != null) {
                        adEventListener.onNext("adViewed", null, this.delegate.getPlacementRefId());
                    }
                    List<String> impressionUrls = this.delegate.getImpressionUrls();
                    if (impressionUrls != null) {
                        Iterator<T> it2 = impressionUrls.iterator();
                        while (it2.hasNext()) {
                            TpatSender.sendTpat$default(getTpatSender(), new TpatRequest.Builder((String) it2.next()).tpatKey("impression").withLogEntry(getLogEntry()).build(), false, 2, null);
                        }
                        return;
                    }
                    return;
                }
                break;
            case 1427818632:
                if (str.equals(DOWNLOAD)) {
                    onDownload(str2);
                    return;
                }
                break;
        }
        Logger.INSTANCE.w(TAG, "Unknown native ad action: " + str);
    }

    public final void setEventListener(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void startTracking(View view) {
        p.j(view, "rootView");
        NativeOMTracker nativeOMTracker = this.omTracker;
        if (nativeOMTracker != null) {
            nativeOMTracker.start(view);
        }
    }

    /* JADX INFO: renamed from: initOMTracker$lambda-10, reason: not valid java name */
    private static final OMInjector m3259initOMTracker$lambda10(g<OMInjector> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-8, reason: not valid java name */
    public static final void m3260showGdpr$lambda8(NativeAdPresenter nativeAdPresenter, DialogInterface dialogInterface, int i10) {
        String value;
        p.j(nativeAdPresenter, "this$0");
        if (i10 != -2) {
            if (i10 != -1) {
                value = "opted_out_by_timeout";
            } else {
                value = PrivacyConsent.OPT_IN.getValue();
            }
        } else {
            value = PrivacyConsent.OPT_OUT.getValue();
        }
        PrivacyManager.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        nativeAdPresenter.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showGdpr$lambda-9, reason: not valid java name */
    public static final void m3261showGdpr$lambda9(NativeAdPresenter nativeAdPresenter, DialogInterface dialogInterface) {
        p.j(nativeAdPresenter, "this$0");
        nativeAdPresenter.currentDialog = null;
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    public final void prepare() {
        start();
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.delegate.getPlacementRefId());
        }
        this.adStartTime = Long.valueOf(System.currentTimeMillis());
    }
}
