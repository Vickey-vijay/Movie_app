package com.unity3d.ads.core.domain;

import bk.l;
import bk.p;
import ck.i;
import ck.s;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.network.model.RequestType;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.h;
import mj.r;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ACTION = "action";
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PLACEMENT_NAME = "placementName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_USE_ACTIVITY_FOR_RESULT = "useActivityForResult";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    @d(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<Invocation, c<? super r>, Object> {
        public final /* synthetic */ Map<String, bk.a<ExposedFunction>> $definition;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Map<String, ? extends bk.a<? extends ExposedFunction>> map, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$definition = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$definition, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(Invocation invocation, c<? super r> cVar) {
            return ((AnonymousClass2) create(invocation, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
        @d(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", l = {188}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements l<c<? super Object>, Object> {
            public final /* synthetic */ ExposedFunction $exposedFunction;
            public final /* synthetic */ Invocation $it;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, c<? super AnonymousClass1> cVar) {
                super(1, cVar);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(c<?> cVar) {
                return new AnonymousClass1(this.$exposedFunction, this.$it, cVar);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ Object invoke(c<? super Object> cVar) {
                return invoke2((c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(c<Object> cVar) {
                return ((AnonymousClass1) create(cVar)).invokeSuspend(r.f64562a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = sj.a.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    ExposedFunction exposedFunction = this.$exposedFunction;
                    Object[] parameters = this.$it.getParameters();
                    this.label = 1;
                    obj = exposedFunction.mo1invoke(parameters, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return obj;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ExposedFunction exposedFunctionInvoke;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                Invocation invocation = (Invocation) this.L$0;
                bk.a<ExposedFunction> aVar = this.$definition.get(invocation.getLocation());
                if (aVar != null && (exposedFunctionInvoke = aVar.invoke()) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(exposedFunctionInvoke, invocation, null);
                    this.label = 1;
                    if (invocation.handle(anonymousClass1, this) == objF) {
                        return objF;
                    }
                } else {
                    return r.f64562a;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: HandleInvocationsFromAdViewer.kt */
    @d(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$1", f = "HandleInvocationsFromAdViewer.kt", l = {184}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<qk.d<? super Invocation>, c<? super r>, Object> {
        public final /* synthetic */ l<c<? super r>, Object> $onSubscription;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super c<? super r>, ? extends Object> lVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onSubscription = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$onSubscription, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(qk.d<? super Invocation> dVar, c<? super r> cVar) {
            return ((AnonymousClass1) create(dVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                l<c<? super r>, Object> lVar = this.$onSubscription;
                this.label = 1;
                if (lVar.invoke(this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public final qk.c<Invocation> invoke(qk.p<Invocation> pVar, String str, String str2, String str3, final AdObject adObject, l<? super c<? super r>, ? extends Object> lVar) {
        ck.p.j(pVar, "onInvocations");
        ck.p.j(str, "adData");
        ck.p.j(str2, KEY_AD_DATA_REFRESH_TOKEN);
        ck.p.j(str3, KEY_IMPRESSION_CONFIG);
        ck.p.j(adObject, "adObject");
        ck.p.j(lVar, "onSubscription");
        final String strM3152constructorimpl = AdData.m3152constructorimpl(str);
        final String strM3166constructorimpl = ImpressionConfig.m3166constructorimpl(str3);
        final String strM3159constructorimpl = AdDataRefreshToken.m3159constructorimpl(str2);
        return e.A(e.C(pVar, new AnonymousClass1(lVar, null)), new AnonymousClass2(kotlin.collections.a.m(h.a(ExposedFunctionLocation.GET_AD_CONTEXT, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.m3173getAdContextyLuu4LI((AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService("", s.b(AndroidGetAdPlayerContext.class)), strM3152constructorimpl, strM3166constructorimpl, strM3159constructorimpl, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService("", s.b(IsOMActivated.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.GET_CONNECTION_TYPE, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getConnectionType((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_DEVICE_VOLUME, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenHeight((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_SCREEN_WIDTH, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$6
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getScreenWidth((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.OPEN_URL, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.openUrl(adObject, (HandleOpenUrl) this.getServiceProvider().getRegistry().getService("", s.b(HandleOpenUrl.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_ORIENTATION, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$8
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOrientation(adObject);
            }
        }), h.a(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendOperativeEvent((GetOperativeEventApi) this.this$0.getServiceProvider().getRegistry().getService("", s.b(GetOperativeEventApi.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.STORAGE_WRITE, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.writeStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_READ, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.readStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_DELETE, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.deleteStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_CLEAR, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.clearStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_GET_KEYS, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getKeysStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_GET, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getStorage();
            }
        }), h.a(ExposedFunctionLocation.STORAGE_SET, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setStorage();
            }
        }), h.a(ExposedFunctionLocation.GET_PRIVACY_FSM, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$17
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_PRIVACY_FSM, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$18
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacyFsm((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_PRIVACY, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$19
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_PRIVACY, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$20
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setPrivacy((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_ALLOWED_PII, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$21
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_ALLOWED_PII, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$22
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setAllowedPii((DeviceInfoRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(DeviceInfoRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.GET_SESSION_TOKEN, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$23
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.getSessionToken((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$24
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.markCampaignStateShown((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(CampaignRepository.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.REFRESH_AD_DATA, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$25
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.refreshAdData((Refresh) this.this$0.getServiceProvider().getRegistry().getService("", s.b(Refresh.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$26
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateCampaignState((CampaignRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(CampaignRepository.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$27
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.updateTrackingToken(adObject);
            }
        }), h.a(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$28
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendPrivacyUpdateRequest((SendPrivacyUpdateRequest) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SendPrivacyUpdateRequest.class)));
            }
        }), h.a(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$29
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent((SendDiagnosticEvent) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SendDiagnosticEvent.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$30
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.DOWNLOAD, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$31
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.download((CacheFile) this.this$0.getServiceProvider().getRegistry().getService("", s.b(CacheFile.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.IS_FILE_CACHED, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$32
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isFileCached((GetIsFileCache) this.this$0.getServiceProvider().getRegistry().getService("", s.b(GetIsFileCache.class)));
            }
        }), h.a(ExposedFunctionLocation.OM_START_SESSION, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$33
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omStartSession((AndroidOmInteraction) this.this$0.getServiceProvider().getRegistry().getService("", s.b(AndroidOmInteraction.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.OM_FINISH_SESSION, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$34
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omFinishSession((OmFinishSession) this.this$0.getServiceProvider().getRegistry().getService("", s.b(OmFinishSession.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.OM_IMPRESSION, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$35
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) this.this$0.getServiceProvider().getRegistry().getService("", s.b(OmImpressionOccurred.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.OM_GET_DATA, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$36
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.omGetData((GetOmData) this.this$0.getServiceProvider().getRegistry().getService("", s.b(GetOmData.class)));
            }
        }), h.a(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$37
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isAttributionAvailable((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", s.b(AndroidAttribution.class)));
            }
        }), h.a(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$38
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterView((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", s.b(AndroidAttribution.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$39
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.attributionRegisterClick((AndroidAttribution) this.this$0.getServiceProvider().getRegistry().getService("", s.b(AndroidAttribution.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.LOAD_SCAR_AD, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$40
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadScarAd((LoadScarAd) this.this$0.getServiceProvider().getRegistry().getService("", s.b(LoadScarAd.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.SHOW_SCAR_AD, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showScarAd();
            }
        }), h.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$42
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$43
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$44
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.hbTokenReset((SessionRepository) this.this$0.getServiceProvider().getRegistry().getService("", s.b(SessionRepository.class)));
            }
        }), h.a(ExposedFunctionLocation.LOAD_OFFERWALL_AD, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$45
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.loadOfferwallAd((LoadOfferwallAd) this.this$0.getServiceProvider().getRegistry().getService("", s.b(LoadOfferwallAd.class)), adObject);
            }
        }), h.a(ExposedFunctionLocation.SHOW_OFFERWALL_AD, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$46
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.showOfferwallAd();
            }
        }), h.a(ExposedFunctionLocation.IS_OFFERWALL_AD_READY, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$47
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.isOfferwallAdReady((GetIsOfferwallAdReady) this.this$0.getServiceProvider().getRegistry().getService("", s.b(GetIsOfferwallAdReady.class)));
            }
        }), h.a(ExposedFunctionLocation.REQUEST_GET, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$48
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.GET, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", s.b(ExecuteAdViewerRequest.class)));
            }
        }), h.a(ExposedFunctionLocation.REQUEST_POST, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$49
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.POST, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", s.b(ExecuteAdViewerRequest.class)));
            }
        }), h.a(ExposedFunctionLocation.REQUEST_HEAD, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$50
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.request(RequestType.HEAD, (ExecuteAdViewerRequest) this.this$0.getServiceProvider().getRegistry().getService("", s.b(ExecuteAdViewerRequest.class)));
            }
        }), h.a(ExposedFunctionLocation.SET_OPPORTUNITY_TTL, new bk.a<ExposedFunction>() { // from class: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$definition$51
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ExposedFunction invoke() {
                return CommonAdViewerExposedFunctionsKt.setOpportunityTTL(adObject);
            }
        })), null));
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }
}
