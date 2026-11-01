package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v81 yads.bz[], still in use, count: 1, list:
  (r1v81 yads.bz[]) from 0x069b: INVOKE (r1v81 yads.bz[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):uj.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):uj.a<E extends java.lang.Enum<E>> (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class bz {
    f76017c("SdkConfigurationExpiredDate"),
    f76019d("SdkConfigurationMraidUrl"),
    f76021e("SdkConfigurationOmSdkControllerUrl"),
    f76023f("CustomClickHandlingEnabled"),
    f76025g("AdIdsStorageSize"),
    f76027h("SdkConfigurationVisibilityErrorIndicatorEnabled"),
    f76029i("SdkConfigurationLibraryVersion"),
    f76031j("SdkConfigurationMediationSensitiveModeDisabled"),
    f76033k("SdkConfigurationSensitiveModeDisabled"),
    f76035l("SdkConfigurationFusedLocationProviderDisabled"),
    f76037m("SdkConfigurationLockScreenEnabled"),
    f76039n("SdkConfigurationUserConsent"),
    f76041o("SdkConfigurationLegacyVisibilityLogicEnabled"),
    f76043p("SdkConfigurationLegacyVastTrackingEnabled"),
    f76045q("SdkConfigurationOverlappingVisibilityTrackingEnabled"),
    f76047r("SdkConfigurationOverlappingWindowTrackingEnabled"),
    f76049s("SdkConfigurationAdRequestMaxRetries"),
    f76051t("SdkConfigurationPingRequestMaxRetries"),
    f76053u("SdkConfigurationImpressionValidationOnClickEnabled"),
    f76055v("SdkConfigurationLegacySliderImpressionEnabled"),
    f76057w("SdkConfigurationShowVersionValidationErrorLog"),
    f76059x("SdkConfigurationShowVersionValidationErrorIndicator"),
    f76061y("SdkConfigurationInstreamDesign"),
    f76063z("SdkConfigurationFullScreenBackButtonEnabled"),
    A("SdkConfigurationOpenMeasurementSdkDisabled"),
    B("SdkConfigurationNativeWebViewPoolSize"),
    C("SdkConfigurationMaxDiskCacheSizeBytesForVideo"),
    D("SdkConfigurationMaxDiskCacheSizeBytesForRequestQueue"),
    E("SdkConfigurationPublicEncryptionKey"),
    F("SdkConfigurationPublicEncryptionVersion"),
    G("SdkConfigurationEcpmImpressionCallbackDisabled"),
    H("SdkConfigurationCloseFullscreenWithAdtuneDisabled"),
    I("SdkConfigurationDivkitisabled"),
    J("SdkConfigurationLocationConsent"),
    K("SdkConfigurationClientBiddingStartupInitializationEnabled"),
    L("SdkConfigurationHeaderBiddingStartupInitializationEnabled"),
    M("SdkConfigurationLibSSLEnabled"),
    N("SdkConfigurationEncryptedRequestsEnabled"),
    O("SdkConfigurationRenderAssetValidationEnabled"),
    P("SdkConfigurationClickHandlerType"),
    Q("SdkConfigurationHardSensitiveModeEnabled"),
    R("SdkConfigurationAgeRestrictedUser"),
    S("SdkConfigurationHost"),
    T("DivkitFont"),
    U("SdkConfigurationAutomaticSdkInitializationDelayEnabled"),
    V("NativeBannerEnabled"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3("UseNewBindingApiForDivkit"),
    W("UseDivkitCloseActionInsteadSystemClick"),
    X("BannerSizeCalculationType"),
    Y("StartupVersion"),
    Z("StartupParameters"),
    f76015a0("AppOpenAdPreloadingEnabled"),
    f76016b0("InterstitialPreloadingEnabled"),
    f76018c0("RewardedPreloadingEnabled"),
    f76020d0("NewFalseClickTrackingEnabled"),
    f76022e0("VarioqubEnabled"),
    f76024f0("CrashTrackerEnabled"),
    f76026g0("ErrorTrackerEnabled"),
    f76028h0("AnrTrackerEnabled"),
    f76030i0("AnrTrackerInterval"),
    f76032j0("AnrTrackerThreshold"),
    f76034k0("ExitInfoAnrTrackerEnabled"),
    f76036l0("ExitInfoAnrTrackerMaxResults"),
    f76038m0("ExitInfoAnrTrackerHistoricalThresholdDays"),
    f76040n0("ExitInfoAnrTrackerEnrichedTraces"),
    f76042o0("CrashIgnoreEnabled"),
    f76044p0("CrashStackTraceExclusionRules"),
    f76046q0("TimeStampingTrackingUrlsEnabled"),
    f76048r0("AppAdAnalyticsReportingEnabled"),
    f76050s0("AppMetricaEasyIntegrationAutoActivationDisabled"),
    f76052t0("SdkConfigurationNetworkThreadPoolSize"),
    f76054u0("SdkConfigurationImageLoadingThreadPoolSize"),
    f76056v0("SdkConfigurationTimeoutIntervalForRequest"),
    f76058w0("SdkConfigurationTimeoutIntervalForPingRequest"),
    f76060x0("QualityAdVerificationConfiguration"),
    f76062y0("SdkTrackingReporterEnabled"),
    f76064z0("SdkConfigurationFallbackHosts"),
    A0("ShouldPrefetchDns"),
    B0("ShouldUseAdRenderedWebViewCallback"),
    C0("OutstreamWrapperVideoSupported"),
    D0("ValidateClickInWebView"),
    E0("PassFullScreenHeightFromSdkEnabled"),
    F0("SdkConfigurationInstreamQrcodeSizeInPx"),
    G0("HideBottomNavigationBar"),
    H0("PreWarmWebViewOnBackground"),
    I0("SdkConfigurationFont"),
    J0("ForceDefaultPlayer"),
    K0("SessionToken"),
    L0("UseMedia3"),
    M0("SupportGif"),
    N0("PlaybackOptimizationConfig");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76065b;

    static {
        kotlin.enums.a.a(bzVarArr);
    }

    public static bz valueOf(String str) {
        return (bz) Enum.valueOf(bz.class, str);
    }

    public static bz[] values() {
        return (bz[]) O0.clone();
    }

    public final String a() {
        return this.f76065b;
    }

    public bz(String str) {
        super(str, i);
        this.f76065b = str;
    }
}
