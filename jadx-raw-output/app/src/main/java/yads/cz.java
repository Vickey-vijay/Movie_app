package yads;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;

/* JADX INFO: loaded from: classes11.dex */
public final class cz implements zy {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f76485f = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rg1 f76486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn0 f76487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u7 f76488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p33 f76489e;

    /* JADX WARN: Code duplicated, block: B:50:0x039e A[Catch: all -> 0x050a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x001f, B:8:0x0205, B:10:0x0213, B:15:0x0277, B:17:0x0282, B:22:0x0292, B:24:0x029f, B:26:0x02dd, B:28:0x02e9, B:30:0x033a, B:32:0x0348, B:43:0x037b, B:48:0x0385, B:50:0x039e, B:51:0x03a2, B:57:0x0458, B:60:0x045f, B:63:0x0465, B:66:0x0475, B:68:0x047d, B:70:0x0506, B:56:0x044e, B:42:0x0371, B:53:0x0437), top: B:76:0x0005, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x045e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0463 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0471  */
    /* JADX WARN: Code duplicated, block: B:66:0x0475 A[Catch: all -> 0x050a, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x001f, B:8:0x0205, B:10:0x0213, B:15:0x0277, B:17:0x0282, B:22:0x0292, B:24:0x029f, B:26:0x02dd, B:28:0x02e9, B:30:0x033a, B:32:0x0348, B:43:0x037b, B:48:0x0385, B:50:0x039e, B:51:0x03a2, B:57:0x0458, B:60:0x045f, B:63:0x0465, B:66:0x0475, B:68:0x047d, B:70:0x0506, B:56:0x044e, B:42:0x0371, B:53:0x0437), top: B:76:0x0005, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x047c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0437 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final nt2 a() {
        nt2 nt2Var;
        Map mapA;
        Set setA;
        f8 f8VarA;
        Integer num;
        Object objM3458constructorimpl;
        vw0 vw0Var;
        boolean zA;
        List listA;
        List list;
        boolean zA2;
        boolean zA3;
        boolean zA4;
        boolean zA5;
        boolean zA6;
        Integer numB;
        boolean zA7;
        boolean zA8;
        boolean zA9;
        boolean zA10;
        String strC;
        boolean zA11;
        String strC2;
        Object objM3458constructorimpl2;
        gm0 gm0Var;
        by2 by2Var;
        synchronized (f76485f) {
            rg1 rg1Var = this.f76486b;
            bz bzVar = bz.f76017c;
            long jB = ((tg1) rg1Var).b("SdkConfigurationExpiredDate");
            Boolean boolA = az.a(this.f76486b, "SdkConfigurationVisibilityErrorIndicatorEnabled");
            if (jB != 0) {
                Integer numB2 = az.b(this.f76486b, "SdkConfigurationAdRequestMaxRetries");
                Integer numB3 = az.b(this.f76486b, "SdkConfigurationPingRequestMaxRetries");
                int iA = ((tg1) this.f76486b).a(0, "AdIdsStorageSize");
                int iA2 = ((tg1) this.f76486b).a(0, "SdkConfigurationNativeWebViewPoolSize");
                long jB2 = ((tg1) this.f76486b).b("SdkConfigurationMaxDiskCacheSizeBytesForVideo");
                long jB3 = ((tg1) this.f76486b).b("SdkConfigurationMaxDiskCacheSizeBytesForRequestQueue");
                Boolean boolA2 = az.a(this.f76486b, "SdkConfigurationMediationSensitiveModeDisabled");
                boolean zA12 = ((tg1) this.f76486b).a("SdkConfigurationFusedLocationProviderDisabled", false);
                boolean zA13 = ((tg1) this.f76486b).a("SdkConfigurationLockScreenEnabled", false);
                Boolean boolA3 = az.a(this.f76486b, "SdkConfigurationUserConsent");
                String strC3 = ((tg1) this.f76486b).c("SdkConfigurationLibraryVersion");
                String strC4 = ((tg1) this.f76486b).c("SdkConfigurationHost");
                String strC5 = ((tg1) this.f76486b).c("DivkitFont");
                String strC6 = ((tg1) this.f76486b).c("SdkConfigurationClickHandlerType");
                String strC7 = ((tg1) this.f76486b).c("SdkConfigurationMraidUrl");
                String strC8 = ((tg1) this.f76486b).c("SdkConfigurationOmSdkControllerUrl");
                boolean zA14 = ((tg1) this.f76486b).a("CustomClickHandlingEnabled", false);
                boolean zA15 = ((tg1) this.f76486b).a("SdkConfigurationSensitiveModeDisabled", false);
                boolean zA16 = ((tg1) this.f76486b).a("SdkConfigurationHardSensitiveModeEnabled", false);
                boolean zA17 = ((tg1) this.f76486b).a("SdkConfigurationLegacyVastTrackingEnabled", false);
                boolean zA18 = ((tg1) this.f76486b).a("SdkConfigurationLegacyVisibilityLogicEnabled", false);
                boolean zA19 = ((tg1) this.f76486b).a("SdkConfigurationOverlappingVisibilityTrackingEnabled", false);
                boolean zA20 = ((tg1) this.f76486b).a("SdkConfigurationOverlappingWindowTrackingEnabled", false);
                boolean zA21 = ((tg1) this.f76486b).a("SdkConfigurationShowVersionValidationErrorLog", false);
                boolean zA22 = ((tg1) this.f76486b).a("SdkConfigurationShowVersionValidationErrorIndicator", false);
                boolean zA23 = ((tg1) this.f76486b).a("SdkConfigurationImpressionValidationOnClickEnabled", false);
                boolean zA24 = ((tg1) this.f76486b).a("SdkConfigurationLegacySliderImpressionEnabled", false);
                boolean zA25 = ((tg1) this.f76486b).a("SdkConfigurationFullScreenBackButtonEnabled", false);
                boolean zA26 = ((tg1) this.f76486b).a("SdkConfigurationOpenMeasurementSdkDisabled", false);
                boolean zA27 = ((tg1) this.f76486b).a("SdkConfigurationLocationConsent", false);
                boolean zA28 = ((tg1) this.f76486b).a("SdkConfigurationClientBiddingStartupInitializationEnabled", false);
                boolean zA29 = ((tg1) this.f76486b).a("SdkConfigurationHeaderBiddingStartupInitializationEnabled", false);
                cl.a aVar = jp.f79141a;
                hp hpVarA = jp.a(this.f76486b);
                String strC9 = ((tg1) this.f76486b).c("SdkConfigurationPublicEncryptionKey");
                String strC10 = ((tg1) this.f76486b).c("SdkConfigurationInstreamDesign");
                Integer numB4 = az.b(this.f76486b, "SdkConfigurationPublicEncryptionVersion");
                boolean zA30 = ((tg1) this.f76486b).a("SdkConfigurationEcpmImpressionCallbackDisabled", false);
                boolean zA31 = ((tg1) this.f76486b).a("SdkConfigurationDivkitisabled", false);
                boolean zA32 = ((tg1) this.f76486b).a("SdkConfigurationLibSSLEnabled", false);
                boolean zA33 = ((tg1) this.f76486b).a("SdkConfigurationCloseFullscreenWithAdtuneDisabled", false);
                boolean zA34 = ((tg1) this.f76486b).a("SdkConfigurationEncryptedRequestsEnabled", false);
                boolean zA35 = ((tg1) this.f76486b).a("SdkConfigurationRenderAssetValidationEnabled", false);
                boolean zA36 = ((tg1) this.f76486b).a("SdkConfigurationAutomaticSdkInitializationDelayEnabled", false);
                Boolean boolA4 = az.a(this.f76486b, "SdkConfigurationAgeRestrictedUser");
                boolean zA37 = ((tg1) this.f76486b).a("NativeBannerEnabled", false);
                boolean zA38 = ((tg1) this.f76486b).a("UseDivkitCloseActionInsteadSystemClick", false);
                String strC11 = ((tg1) this.f76486b).c("BannerSizeCalculationType");
                String strC12 = ((tg1) this.f76486b).c("StartupVersion");
                String strC13 = ((tg1) this.f76486b).c("StartupParameters");
                if (strC13 != null) {
                    this.f76489e.getClass();
                    mapA = p33.a(strC13);
                } else {
                    mapA = null;
                }
                boolean zA39 = ((tg1) this.f76486b).a("AppOpenAdPreloadingEnabled", false);
                boolean zA40 = ((tg1) this.f76486b).a("InterstitialPreloadingEnabled", false);
                boolean zA41 = ((tg1) this.f76486b).a("RewardedPreloadingEnabled", false);
                boolean zA42 = ((tg1) this.f76486b).a("NewFalseClickTrackingEnabled", false);
                boolean zA43 = ((tg1) this.f76486b).a("VarioqubEnabled", false);
                boolean zA44 = ((tg1) this.f76486b).a("CrashTrackerEnabled", false);
                boolean zA45 = ((tg1) this.f76486b).a("ErrorTrackerEnabled", false);
                boolean zA46 = ((tg1) this.f76486b).a("AnrTrackerEnabled", false);
                tg1 tg1Var = (tg1) this.f76486b;
                if (!tg1Var.a("AnrTrackerInterval")) {
                    tg1Var = null;
                }
                Long lValueOf = tg1Var != null ? Long.valueOf(tg1Var.b("AnrTrackerInterval")) : null;
                tg1 tg1Var2 = (tg1) this.f76486b;
                if (!tg1Var2.a("AnrTrackerThreshold")) {
                    tg1Var2 = null;
                }
                Long lValueOf2 = tg1Var2 != null ? Long.valueOf(tg1Var2.b("AnrTrackerThreshold")) : null;
                Long l10 = lValueOf;
                boolean zA47 = ((tg1) this.f76486b).a("ExitInfoAnrTrackerEnabled", false);
                Integer numB5 = az.b(this.f76486b, "ExitInfoAnrTrackerMaxResults");
                Integer numB6 = az.b(this.f76486b, "ExitInfoAnrTrackerHistoricalThresholdDays");
                Boolean boolA5 = az.a(this.f76486b, "ExitInfoAnrTrackerEnrichedTraces");
                boolean zA48 = ((tg1) this.f76486b).a("CrashIgnoreEnabled", false);
                String strC14 = ((tg1) this.f76486b).c("CrashStackTraceExclusionRules");
                if (strC14 != null) {
                    this.f76487c.getClass();
                    setA = dn0.a(strC14);
                } else {
                    setA = null;
                }
                Set set = setA;
                boolean zA49 = ((tg1) this.f76486b).a("TimeStampingTrackingUrlsEnabled", false);
                boolean zA50 = ((tg1) this.f76486b).a("AppAdAnalyticsReportingEnabled", true);
                boolean zA51 = ((tg1) this.f76486b).a("AppMetricaEasyIntegrationAutoActivationDisabled", false);
                Integer numB7 = az.b(this.f76486b, "SdkConfigurationNetworkThreadPoolSize");
                Integer numB8 = az.b(this.f76486b, "SdkConfigurationImageLoadingThreadPoolSize");
                Integer numB9 = az.b(this.f76486b, "SdkConfigurationTimeoutIntervalForRequest");
                Integer numB10 = az.b(this.f76486b, "SdkConfigurationTimeoutIntervalForPingRequest");
                String strC15 = ((tg1) this.f76486b).c("QualityAdVerificationConfiguration");
                if (strC15 != null) {
                    this.f76488d.getClass();
                    f8VarA = u7.a(strC15);
                } else {
                    f8VarA = null;
                }
                String strC16 = ((tg1) this.f76486b).c("SdkConfigurationFont");
                if (strC16 != null) {
                    try {
                        Result.a aVar2 = Result.Companion;
                        cl.a aVar3 = ne1.f80658a;
                        aVar3.a();
                        num = numB7;
                        try {
                            objM3458constructorimpl = Result.m3458constructorimpl(aVar3.b(vw0.Companion.serializer(), strC16));
                        } catch (Throwable th2) {
                            th = th2;
                            Result.a aVar4 = Result.Companion;
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        num = numB7;
                    }
                    if (!Result.m3463isFailureimpl(objM3458constructorimpl)) {
                        vw0Var = (vw0) objM3458constructorimpl;
                        rg1 rg1Var2 = this.f76486b;
                        bz bzVar2 = bz.f76017c;
                        zA = ((tg1) rg1Var2).a("SdkTrackingReporterEnabled", false);
                        listA = vg1.a(this.f76486b);
                        if (listA == null) {
                            listA = nj.s.k();
                        }
                        list = listA;
                        zA2 = ((tg1) this.f76486b).a("ShouldPrefetchDns", false);
                        zA3 = ((tg1) this.f76486b).a("ShouldUseAdRenderedWebViewCallback", false);
                        zA4 = ((tg1) this.f76486b).a("OutstreamWrapperVideoSupported", false);
                        zA5 = ((tg1) this.f76486b).a("ValidateClickInWebView", false);
                        zA6 = ((tg1) this.f76486b).a("PassFullScreenHeightFromSdkEnabled", false);
                        numB = az.b(this.f76486b, "SdkConfigurationInstreamQrcodeSizeInPx");
                        zA7 = ((tg1) this.f76486b).a("HideBottomNavigationBar", false);
                        zA8 = ((tg1) this.f76486b).a("PreWarmWebViewOnBackground", false);
                        zA9 = ((tg1) this.f76486b).a("ForceDefaultPlayer", false);
                        zA10 = ((tg1) this.f76486b).a("SupportGif", false);
                        strC = ((tg1) this.f76486b).c("SessionToken");
                        zA11 = ((tg1) this.f76486b).a(bz.L0.a(), false);
                        strC2 = ((tg1) this.f76486b).c(bz.N0.a());
                        if (strC2 != null) {
                            try {
                                Result.a aVar5 = Result.Companion;
                                cl.a aVar6 = ne1.f80658a;
                                aVar6.a();
                                objM3458constructorimpl2 = Result.m3458constructorimpl(aVar6.b(md2.Companion.serializer(), strC2));
                            } catch (Throwable th4) {
                                Result.a aVar7 = Result.Companion;
                                objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th4));
                            }
                            if (Result.m3463isFailureimpl(objM3458constructorimpl2)) {
                                objM3458constructorimpl2 = null;
                            }
                            md2 md2Var = (md2) objM3458constructorimpl2;
                            if (strC9 != null || numB4 == null) {
                                gm0Var = null;
                            } else {
                                gm0Var = new gm0(numB4.intValue(), strC9);
                            }
                            if (strC != null) {
                                by2Var = new by2(strC);
                            } else {
                                by2Var = null;
                            }
                            nt2Var = new nt2(iA, iA2, jB2, jB3, jB, zA14, zA12, zA13, zA15, zA16, zA18, zA17, zA19, zA20, zA23, zA24, zA22, zA21, zA25, zA33, zA30, zA31, zA26, zA27, zA32, zA34, zA35, zA36, zA37, zA38, zA39, zA40, zA41, zA42, zA43, numB2, numB3, boolA3, boolA4, boolA, strC11, strC7, strC8, strC3, strC6, strC10, strC4, strC5, boolA2, gm0Var, zA28, zA29, hpVarA, strC12, mapA, zA44, zA45, zA46, l10, lValueOf2, zA47, numB5, numB6, boolA5, zA48, set, zA49, zA50, zA51, num, numB8, numB9, numB10, f8VarA, zA, list, zA2, zA3, zA4, zA5, zA6, numB, zA7, zA8, vw0Var, zA9, zA11, zA10, by2Var, md2Var);
                        } else {
                            objM3458constructorimpl2 = null;
                            md2 md2Var2 = (md2) objM3458constructorimpl2;
                            if (strC9 != null) {
                                gm0Var = null;
                            } else {
                                gm0Var = null;
                            }
                            if (strC != null) {
                                by2Var = new by2(strC);
                            } else {
                                by2Var = null;
                            }
                            nt2Var = new nt2(iA, iA2, jB2, jB3, jB, zA14, zA12, zA13, zA15, zA16, zA18, zA17, zA19, zA20, zA23, zA24, zA22, zA21, zA25, zA33, zA30, zA31, zA26, zA27, zA32, zA34, zA35, zA36, zA37, zA38, zA39, zA40, zA41, zA42, zA43, numB2, numB3, boolA3, boolA4, boolA, strC11, strC7, strC8, strC3, strC6, strC10, strC4, strC5, boolA2, gm0Var, zA28, zA29, hpVarA, strC12, mapA, zA44, zA45, zA46, l10, lValueOf2, zA47, numB5, numB6, boolA5, zA48, set, zA49, zA50, zA51, num, numB8, numB9, numB10, f8VarA, zA, list, zA2, zA3, zA4, zA5, zA6, numB, zA7, zA8, vw0Var, zA9, zA11, zA10, by2Var, md2Var2);
                        }
                    }
                    throw th;
                }
                num = numB7;
                objM3458constructorimpl = null;
                vw0Var = (vw0) objM3458constructorimpl;
                rg1 rg1Var3 = this.f76486b;
                bz bzVar3 = bz.f76017c;
                zA = ((tg1) rg1Var3).a("SdkTrackingReporterEnabled", false);
                listA = vg1.a(this.f76486b);
                if (listA == null) {
                    listA = nj.s.k();
                }
                list = listA;
                zA2 = ((tg1) this.f76486b).a("ShouldPrefetchDns", false);
                zA3 = ((tg1) this.f76486b).a("ShouldUseAdRenderedWebViewCallback", false);
                zA4 = ((tg1) this.f76486b).a("OutstreamWrapperVideoSupported", false);
                zA5 = ((tg1) this.f76486b).a("ValidateClickInWebView", false);
                zA6 = ((tg1) this.f76486b).a("PassFullScreenHeightFromSdkEnabled", false);
                numB = az.b(this.f76486b, "SdkConfigurationInstreamQrcodeSizeInPx");
                zA7 = ((tg1) this.f76486b).a("HideBottomNavigationBar", false);
                zA8 = ((tg1) this.f76486b).a("PreWarmWebViewOnBackground", false);
                zA9 = ((tg1) this.f76486b).a("ForceDefaultPlayer", false);
                zA10 = ((tg1) this.f76486b).a("SupportGif", false);
                strC = ((tg1) this.f76486b).c("SessionToken");
                zA11 = ((tg1) this.f76486b).a(bz.L0.a(), false);
                strC2 = ((tg1) this.f76486b).c(bz.N0.a());
                if (strC2 != null) {
                    Result.a aVar8 = Result.Companion;
                    cl.a aVar9 = ne1.f80658a;
                    aVar9.a();
                    objM3458constructorimpl2 = Result.m3458constructorimpl(aVar9.b(md2.Companion.serializer(), strC2));
                    if (Result.m3463isFailureimpl(objM3458constructorimpl2)) {
                        objM3458constructorimpl2 = null;
                    }
                    md2 md2Var3 = (md2) objM3458constructorimpl2;
                    if (strC9 != null) {
                        gm0Var = null;
                    } else {
                        gm0Var = null;
                    }
                    if (strC != null) {
                        by2Var = new by2(strC);
                    } else {
                        by2Var = null;
                    }
                    nt2Var = new nt2(iA, iA2, jB2, jB3, jB, zA14, zA12, zA13, zA15, zA16, zA18, zA17, zA19, zA20, zA23, zA24, zA22, zA21, zA25, zA33, zA30, zA31, zA26, zA27, zA32, zA34, zA35, zA36, zA37, zA38, zA39, zA40, zA41, zA42, zA43, numB2, numB3, boolA3, boolA4, boolA, strC11, strC7, strC8, strC3, strC6, strC10, strC4, strC5, boolA2, gm0Var, zA28, zA29, hpVarA, strC12, mapA, zA44, zA45, zA46, l10, lValueOf2, zA47, numB5, numB6, boolA5, zA48, set, zA49, zA50, zA51, num, numB8, numB9, numB10, f8VarA, zA, list, zA2, zA3, zA4, zA5, zA6, numB, zA7, zA8, vw0Var, zA9, zA11, zA10, by2Var, md2Var3);
                } else {
                    objM3458constructorimpl2 = null;
                    md2 md2Var4 = (md2) objM3458constructorimpl2;
                    if (strC9 != null) {
                        gm0Var = null;
                    } else {
                        gm0Var = null;
                    }
                    if (strC != null) {
                        by2Var = new by2(strC);
                    } else {
                        by2Var = null;
                    }
                    nt2Var = new nt2(iA, iA2, jB2, jB3, jB, zA14, zA12, zA13, zA15, zA16, zA18, zA17, zA19, zA20, zA23, zA24, zA22, zA21, zA25, zA33, zA30, zA31, zA26, zA27, zA32, zA34, zA35, zA36, zA37, zA38, zA39, zA40, zA41, zA42, zA43, numB2, numB3, boolA3, boolA4, boolA, strC11, strC7, strC8, strC3, strC6, strC10, strC4, strC5, boolA2, gm0Var, zA28, zA29, hpVarA, strC12, mapA, zA44, zA45, zA46, l10, lValueOf2, zA47, numB5, numB6, boolA5, zA48, set, zA49, zA50, zA51, num, numB8, numB9, numB10, f8VarA, zA, list, zA2, zA3, zA4, zA5, zA6, numB, zA7, zA8, vw0Var, zA9, zA11, zA10, by2Var, md2Var4);
                }
                throw th;
            }
            nt2Var = null;
            mj.r rVar = mj.r.f64562a;
        }
        return nt2Var;
    }

    public cz(rg1 rg1Var, dn0 dn0Var, u7 u7Var, p33 p33Var) {
        this.f76486b = rg1Var;
        this.f76487c = dn0Var;
        this.f76488d = u7Var;
        this.f76489e = p33Var;
    }

    public final void a(nt2 nt2Var) {
        String strA;
        String strC;
        synchronized (f76485f) {
            ((tg1) this.f76486b).a(bz.f76029i.a(), nt2Var.R);
            ((tg1) this.f76486b).a(bz.P.a(), nt2Var.S);
            ((tg1) this.f76486b).b(bz.f76033k.a(), nt2Var.f80771i);
            ((tg1) this.f76486b).b(bz.Q.a(), nt2Var.f80773j);
            ((tg1) this.f76486b).a(bz.f76017c.a(), nt2Var.f80763e);
            ((tg1) this.f76486b).a(bz.f76019d.a(), nt2Var.P);
            ((tg1) this.f76486b).a(bz.f76021e.a(), nt2Var.Q);
            ((tg1) this.f76486b).a(bz.f76061y.a(), nt2Var.T);
            ((tg1) this.f76486b).b(bz.f76023f.a(), nt2Var.f80765f);
            ((tg1) this.f76486b).b(bz.f76057w.a(), nt2Var.f80789r);
            ((tg1) this.f76486b).b(bz.f76059x.a(), nt2Var.f80787q);
            ((tg1) this.f76486b).b(nt2Var.f80755a, bz.f76025g.a());
            ((tg1) this.f76486b).b(bz.f76053u.a(), nt2Var.g());
            ((tg1) this.f76486b).b(bz.f76055v.a(), nt2Var.f80785p);
            ((tg1) this.f76486b).b(bz.G.a(), nt2Var.f80795u);
            ((tg1) this.f76486b).b(bz.I.a(), nt2Var.f80797v);
            rg1 rg1Var = this.f76486b;
            bz bzVar = bz.H;
            ((tg1) rg1Var).b(bzVar.a(), nt2Var.f80793t);
            ((tg1) this.f76486b).b(bz.J.a(), nt2Var.f80801x);
            ((tg1) this.f76486b).b(bz.M.a(), nt2Var.f80803y);
            ((tg1) this.f76486b).b(bz.N.a(), nt2Var.f80805z);
            rg1 rg1Var2 = this.f76486b;
            bz bzVar2 = bz.O;
            ((tg1) rg1Var2).b(bzVar2.a(), nt2Var.A);
            ((tg1) this.f76486b).b(nt2Var.f80757b, bz.B.a());
            ((tg1) this.f76486b).a(bz.C.a(), nt2Var.f80759c);
            ((tg1) this.f76486b).a(bz.D.a(), nt2Var.f80761d);
            ((tg1) this.f76486b).a(bz.S.a(), nt2Var.U);
            ((tg1) this.f76486b).a(bz.T.a(), nt2Var.V);
            ((tg1) this.f76486b).a(bz.X.a(), nt2Var.O);
            Boolean bool = nt2Var.N;
            Boolean bool2 = nt2Var.W;
            boolean z10 = nt2Var.f80767g;
            boolean z11 = nt2Var.f80769h;
            Boolean bool3 = nt2Var.L;
            boolean z12 = nt2Var.f80777l;
            boolean zH = nt2Var.h();
            boolean z13 = nt2Var.f80779m;
            boolean z14 = nt2Var.f80781n;
            boolean z15 = nt2Var.f80791s;
            boolean z16 = nt2Var.f80799w;
            boolean z17 = nt2Var.Y;
            boolean z18 = nt2Var.Z;
            Integer num = nt2Var.J;
            Integer num2 = nt2Var.K;
            hp hpVar = nt2Var.f80756a0;
            boolean z19 = nt2Var.f80793t;
            boolean z20 = nt2Var.A;
            Boolean bool4 = nt2Var.M;
            boolean zF = nt2Var.f();
            boolean z21 = nt2Var.C;
            boolean z22 = nt2Var.D;
            az.a(this.f76486b, bz.f76027h.a(), bool);
            az.a(this.f76486b, bz.f76031j.a(), bool2);
            az.a(this.f76486b, bz.f76035l.a(), Boolean.valueOf(z10));
            az.a(this.f76486b, bz.f76037m.a(), Boolean.valueOf(z11));
            az.a(this.f76486b, bz.f76039n.a(), bool3);
            az.a(this.f76486b, bz.f76043p.a(), Boolean.valueOf(z12));
            az.a(this.f76486b, bz.f76041o.a(), Boolean.valueOf(zH));
            az.a(this.f76486b, bz.f76045q.a(), Boolean.valueOf(z13));
            az.a(this.f76486b, bz.f76047r.a(), Boolean.valueOf(z14));
            az.a(this.f76486b, bzVar.a(), Boolean.valueOf(z19));
            az.a(this.f76486b, bz.f76063z.a(), Boolean.valueOf(z15));
            az.a(this.f76486b, bz.A.a(), Boolean.valueOf(z16));
            az.a(this.f76486b, bz.R.a(), bool4);
            az.a(this.f76486b, bz.U.a(), Boolean.valueOf(zF));
            az.a(this.f76486b, bz.K.a(), Boolean.valueOf(z17));
            az.a(this.f76486b, bz.L.a(), Boolean.valueOf(z18));
            az.a(this.f76486b, bz.f76049s.a(), num);
            az.a(this.f76486b, bz.f76051t.a(), num2);
            if (hpVar != null) {
                cl.a aVar = jp.f79141a;
                jp.a(this.f76486b, hpVar);
            } else {
                cl.a aVar2 = jp.f79141a;
                jp.b(this.f76486b);
            }
            gm0 gm0Var = nt2Var.X;
            if (gm0Var != null) {
                ((tg1) this.f76486b).a(bz.E.a(), gm0Var.a());
                ((tg1) this.f76486b).b(gm0Var.b(), bz.F.a());
            }
            az.a(this.f76486b, bzVar2.a(), Boolean.valueOf(z20));
            ((tg1) this.f76486b).b(bz.V.a(), z21);
            ((tg1) this.f76486b).b(bz.W.a(), z22);
            ((tg1) this.f76486b).a(bz.Y.a(), nt2Var.f80758b0);
            rg1 rg1Var3 = this.f76486b;
            String strA2 = bz.Z.a();
            Map map = nt2Var.f80760c0;
            String strC2 = null;
            if (map != null) {
                this.f76489e.getClass();
                strA = p33.a(map);
            } else {
                strA = null;
            }
            ((tg1) rg1Var3).a(strA2, strA);
            ((tg1) this.f76486b).b(bz.f76015a0.a(), nt2Var.E);
            ((tg1) this.f76486b).b(bz.f76016b0.a(), nt2Var.F);
            ((tg1) this.f76486b).b(bz.f76018c0.a(), nt2Var.G);
            ((tg1) this.f76486b).b(bz.f76020d0.a(), nt2Var.i());
            ((tg1) this.f76486b).b(bz.f76022e0.a(), nt2Var.I);
            ((tg1) this.f76486b).b(bz.f76024f0.a(), nt2Var.f80762d0);
            ((tg1) this.f76486b).b(bz.f76026g0.a(), nt2Var.f80764e0);
            ((tg1) this.f76486b).b(bz.f76028h0.a(), nt2Var.f80766f0);
            rg1 rg1Var4 = this.f76486b;
            String strA3 = bz.f76030i0.a();
            Long l10 = nt2Var.f80768g0;
            if (l10 != null) {
                ((tg1) rg1Var4).a(strA3, l10.longValue());
            } else {
                ((tg1) rg1Var4).d(strA3);
            }
            rg1 rg1Var5 = this.f76486b;
            String strA4 = bz.f76032j0.a();
            Long l11 = nt2Var.f80770h0;
            if (l11 != null) {
                ((tg1) rg1Var5).a(strA4, l11.longValue());
            } else {
                ((tg1) rg1Var5).d(strA4);
            }
            ((tg1) this.f76486b).b(bz.f76034k0.a(), nt2Var.f80772i0);
            az.a(this.f76486b, bz.f76036l0.a(), nt2Var.f80774j0);
            az.a(this.f76486b, bz.f76038m0.a(), nt2Var.f80776k0);
            az.a(this.f76486b, bz.f76040n0.a(), nt2Var.f80778l0);
            ((tg1) this.f76486b).b(bz.f76042o0.a(), nt2Var.f80780m0);
            rg1 rg1Var6 = this.f76486b;
            String strA5 = bz.f76044p0.a();
            dn0 dn0Var = this.f76487c;
            Set set = nt2Var.f80782n0;
            dn0Var.getClass();
            ((tg1) rg1Var6).a(strA5, dn0.a(set));
            ((tg1) this.f76486b).b(bz.f76046q0.a(), nt2Var.e());
            ((tg1) this.f76486b).b(bz.f76048r0.a(), nt2Var.f80786p0);
            ((tg1) this.f76486b).b(bz.f76050s0.a(), nt2Var.f80788q0);
            az.a(this.f76486b, bz.f76052t0.a(), nt2Var.f80790r0);
            az.a(this.f76486b, bz.f76054u0.a(), nt2Var.f80792s0);
            az.a(this.f76486b, bz.f76056v0.a(), nt2Var.f80794t0);
            az.a(this.f76486b, bz.f76058w0.a(), nt2Var.f80796u0);
            rg1 rg1Var7 = this.f76486b;
            String strA6 = bz.f76060x0.a();
            u7 u7Var = this.f76488d;
            f8 f8VarA = nt2Var.a();
            u7Var.getClass();
            ((tg1) rg1Var7).a(strA6, u7.a(f8VarA));
            rg1 rg1Var8 = this.f76486b;
            String strA7 = bz.I0.a();
            vw0 vw0Var = nt2Var.G0;
            if (vw0Var != null) {
                cl.a.C0024a c0024a = cl.a.f6073d;
                c0024a.a();
                strC = c0024a.c(vw0.Companion.serializer(), vw0Var);
            } else {
                strC = null;
            }
            ((tg1) rg1Var8).a(strA7, strC);
            ((tg1) this.f76486b).b(bz.f76062y0.a(), nt2Var.f80800w0);
            vg1.a(this.f76486b, bz.f76064z0.a(), nt2Var.f80802x0);
            ((tg1) this.f76486b).b(bz.A0.a(), nt2Var.f80804y0);
            ((tg1) this.f76486b).b(bz.B0.a(), nt2Var.f80806z0);
            ((tg1) this.f76486b).b(bz.C0.a(), nt2Var.A0);
            ((tg1) this.f76486b).b(bz.D0.a(), nt2Var.B0);
            ((tg1) this.f76486b).b(bz.E0.a(), nt2Var.C0);
            az.a(this.f76486b, bz.F0.a(), nt2Var.D0);
            ((tg1) this.f76486b).b(bz.G0.a(), nt2Var.E0);
            ((tg1) this.f76486b).b(bz.H0.a(), nt2Var.F0);
            ((tg1) this.f76486b).b(bz.J0.a(), nt2Var.b());
            ((tg1) this.f76486b).b(bz.M0.a(), nt2Var.d());
            by2 by2VarC = nt2Var.c();
            if (by2VarC != null) {
                ((tg1) this.f76486b).a(bz.K0.a(), by2VarC.a());
            }
            ((tg1) this.f76486b).b(bz.L0.a(), nt2Var.I0);
            rg1 rg1Var9 = this.f76486b;
            String strA8 = bz.N0.a();
            md2 md2Var = nt2Var.L0;
            if (md2Var != null) {
                cl.a.C0024a c0024a2 = cl.a.f6073d;
                c0024a2.a();
                strC2 = c0024a2.c(md2.Companion.serializer(), md2Var);
            }
            ((tg1) rg1Var9).a(strA8, strC2);
            mj.r rVar = mj.r.f64562a;
        }
    }
}
