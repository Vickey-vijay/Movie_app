package com.unity3d.ads.core.domain;

import android.content.Context;
import bk.p;
import ck.i;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import mj.r;
import mk.b;
import mk.j;
import mk.l;
import nk.h;
import nk.h0;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidLoad.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final h0 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidLoad.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {72, 76, 93, 97, 136}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super LoadResult>, Object> {
        public final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        public final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ String $placement;
        public int I$0;
        public long J$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, ByteString byteString, String str, UnityAdsLoadOptions unityAdsLoadOptions, Context context, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$opportunityId = byteString;
            this.$placement = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = AndroidLoad.this.new AnonymousClass2(this.$bannerSize, this.$headerBiddingAdMarkup, this.$opportunityId, this.$placement, this.$loadOptions, this.$context, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super LoadResult> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:106:0x0292 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:107:0x0293  */
        /* JADX WARN: Code duplicated, block: B:120:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:121:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:124:0x0311 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:126:0x032f A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:128:0x0398 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:131:0x03b1 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:135:0x03dd  */
        /* JADX WARN: Code duplicated, block: B:136:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:139:0x03f4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:142:0x03fb A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:144:0x0409 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:145:0x041c A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:146:0x0423 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:148:0x0427  */
        /* JADX WARN: Code duplicated, block: B:149:0x0428 A[Catch: UnityAdsNetworkException -> 0x0027, TryCatch #7 {UnityAdsNetworkException -> 0x0027, blocks: (B:9:0x0020, B:140:0x03f5, B:142:0x03fb, B:144:0x0409, B:145:0x041c, B:146:0x0423, B:149:0x0428, B:150:0x042d, B:118:0x02b6, B:122:0x02e5, B:124:0x0311, B:126:0x032f, B:128:0x0398, B:129:0x03a4, B:131:0x03b1, B:132:0x03c2, B:133:0x03c8, B:137:0x03e1, B:117:0x02ac, B:21:0x0060, B:101:0x0256, B:83:0x01af, B:87:0x01dd, B:82:0x01a5, B:29:0x009f, B:61:0x013b, B:32:0x00b0, B:34:0x00bc, B:36:0x00d4, B:41:0x00dd, B:43:0x00e2, B:47:0x00f2, B:51:0x00ff, B:53:0x0111, B:57:0x0118, B:89:0x020f, B:93:0x021c, B:95:0x0238, B:97:0x023c, B:42:0x00e0), top: B:167:0x0014 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x017f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:69:0x0180  */
        /* JADX WARN: Code duplicated, block: B:85:0x01d8  */
        /* JADX WARN: Code duplicated, block: B:86:0x01db  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10;
            Object obj2;
            int i10;
            Object objInvoke;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
            AdObject adObject;
            Object objInvoke2;
            int i11;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
            AdObject adObject2;
            long jB;
            i iVar;
            int i12;
            AdObject adObject3;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
            long j10;
            Object objRequest$default;
            Object objM3458constructorimpl;
            Object objM3466unboximpl;
            String str;
            AdResponseOuterClass.AdResponse adResponse;
            long jB2;
            long j11;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4;
            AdObject adObject4;
            long j12;
            Object objRequest$default2;
            Object objM3458constructorimpl2;
            boolean z11;
            Object objInvoke3;
            Object objM3466unboximpl2;
            String str2;
            UniversalResponseOuterClass.UniversalResponse universalResponse;
            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse;
            AdResponseKt.Dsl dsl_create;
            ByteString adData;
            LoadResult loadResult;
            Object objF = sj.a.f();
            int i13 = this.label;
            String str3 = "native_load_config_success_time";
            try {
                if (i13 == 0) {
                    kotlin.c.b(obj);
                    l0 l0Var = (l0) this.L$0;
                    if (!AndroidLoad.this.sessionRepository.isSdkInitialized()) {
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, null, null, "not_initialized", null, false, 54, null);
                    }
                    boolean z12 = this.$bannerSize != null;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5 = z12 ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
                    int i14 = !this.$headerBiddingAdMarkup.getAdData().isEmpty() ? 1 : 0;
                    AdObject tmpAdObject = AndroidLoad.this.getTmpAdObject(this.$opportunityId, this.$placement, i14 != 0, diagnosticAdType5, this.$loadOptions);
                    if (i14 == 0) {
                        AndroidLoad.this.incrementLoadRequestCount(z12);
                        GetAdRequest getAdRequest = AndroidLoad.this.getAdRequest;
                        String str4 = this.$placement;
                        ByteString byteString = this.$opportunityId;
                        AdRequestOuterClass.BannerSize bannerSize = this.$bannerSize;
                        this.L$0 = l0Var;
                        this.L$1 = diagnosticAdType5;
                        this.L$2 = tmpAdObject;
                        this.I$0 = i14;
                        this.label = 1;
                        objInvoke2 = getAdRequest.invoke(str4, byteString, bannerSize, this);
                        if (objInvoke2 == objF) {
                            return objF;
                        }
                        i11 = i14;
                        diagnosticAdType2 = diagnosticAdType5;
                        adObject2 = tmpAdObject;
                        UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) objInvoke2;
                        RequestPolicy requestPolicyInvoke = AndroidLoad.this.getRequestPolicy.invoke();
                        AndroidLoad androidLoad = AndroidLoad.this;
                        jB = j.f64572a.b();
                        Result.a aVar = Result.Companion;
                        GatewayClient gatewayClient = androidLoad.gatewayClient;
                        OperationType operationType = OperationType.LOAD;
                        this.L$0 = diagnosticAdType2;
                        this.L$1 = adObject2;
                        this.L$2 = null;
                        this.I$0 = i11;
                        this.J$0 = jB;
                        this.label = 2;
                        jB = jB;
                        z10 = true;
                        str3 = "native_load_config_success_time";
                        iVar = null;
                        objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, this, 1, null);
                        if (objRequest$default == objF) {
                            return objF;
                        }
                        i12 = i11;
                        adObject3 = adObject2;
                        diagnosticAdType3 = diagnosticAdType2;
                        j10 = jB;
                        objM3458constructorimpl = Result.m3458constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default);
                        AdObject adObject5 = adObject3;
                        l lVar = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(j10), iVar);
                        AndroidLoad androidLoad2 = AndroidLoad.this;
                        objM3466unboximpl = ((Result) lVar.a()).m3466unboximpl();
                        long jB3 = lVar.b();
                        SendDiagnosticEvent sendDiagnosticEvent = androidLoad2.sendDiagnosticEvent;
                        if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                            str = str3;
                        } else {
                            str = "native_load_config_failure_time";
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, tj.a.b(b.G(jB3, DurationUnit.MILLISECONDS)), null, null, adObject5, null, 44, null);
                        Object objM3466unboximpl3 = ((Result) lVar.c()).m3466unboximpl();
                        kotlin.c.b(objM3466unboximpl3);
                        adResponse = ((UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl3).getPayload().getAdResponse();
                        AdResponseOuterClass.AdResponse adResponse2 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                        ByteString byteString2 = this.$opportunityId;
                        ck.p.i(adResponse2, "response");
                        Context context = this.$context;
                        String str5 = this.$placement;
                        if (i12 != 0) {
                            z11 = z10;
                        } else {
                            z11 = false;
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions, byteString2, adResponse2, context, str5, diagnosticAdType6, z11, this);
                        if (objInvoke3 == objF) {
                            return objF;
                        }
                    } else {
                        z10 = true;
                        obj2 = null;
                        AndroidLoad.this.incrementLoadRequestAdmCount(z12);
                        GetAdPlayerConfigRequest getAdPlayerConfigRequest = AndroidLoad.this.getAdPlayerConfigRequest;
                        String str6 = this.$placement;
                        ByteString byteString3 = this.$opportunityId;
                        ByteString configurationToken = this.$headerBiddingAdMarkup.getConfigurationToken();
                        ck.p.i(configurationToken, "headerBiddingAdMarkup.configurationToken");
                        AdFormatOuterClass.AdFormat adFormat = this.$bannerSize != null ? AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null;
                        this.L$0 = l0Var;
                        this.L$1 = diagnosticAdType5;
                        this.L$2 = tmpAdObject;
                        this.I$0 = i14;
                        this.label = 3;
                        i10 = i14;
                        objInvoke = getAdPlayerConfigRequest.invoke(str6, byteString3, configurationToken, adFormat, this);
                        if (objInvoke == objF) {
                            return objF;
                        }
                        diagnosticAdType = diagnosticAdType5;
                        adObject = tmpAdObject;
                        UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                        RequestPolicy requestPolicyInvoke2 = AndroidLoad.this.getRequestPolicy.invoke();
                        AndroidLoad androidLoad3 = AndroidLoad.this;
                        jB2 = j.f64572a.b();
                        Result.a aVar2 = Result.Companion;
                        GatewayClient gatewayClient2 = androidLoad3.gatewayClient;
                        OperationType operationType2 = OperationType.LOAD_HEADER_BIDDING;
                        this.L$0 = diagnosticAdType;
                        this.L$1 = adObject;
                        this.L$2 = obj2;
                        this.I$0 = i10;
                        this.J$0 = jB2;
                        this.label = 4;
                        j11 = jB2;
                        diagnosticAdType4 = diagnosticAdType;
                        objRequest$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, requestPolicyInvoke2, operationType2, this, 1, null);
                        if (objRequest$default2 == objF) {
                            return objF;
                        }
                        diagnosticAdType3 = diagnosticAdType4;
                        adObject4 = adObject;
                        i12 = i10;
                        j12 = j11;
                        objM3458constructorimpl2 = Result.m3458constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default2);
                        AdObject adObject6 = adObject4;
                        l lVar2 = new l(Result.m3457boximpl(objM3458constructorimpl2), j.a.e(j12), null);
                        AndroidLoad androidLoad4 = AndroidLoad.this;
                        objM3466unboximpl2 = ((Result) lVar2.a()).m3466unboximpl();
                        long jB4 = lVar2.b();
                        SendDiagnosticEvent sendDiagnosticEvent2 = androidLoad4.sendDiagnosticEvent;
                        if (Result.m3464isSuccessimpl(objM3466unboximpl2)) {
                            str2 = str3;
                        } else {
                            str2 = "native_load_config_failure_time";
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str2, tj.a.b(b.G(jB4, DurationUnit.MILLISECONDS)), null, null, adObject6, null, 44, null);
                        Object objM3466unboximpl4 = ((Result) lVar2.c()).m3466unboximpl();
                        kotlin.c.b(objM3466unboximpl4);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl4;
                        if (universalResponse.hasError()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                        }
                        adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup = this.$headerBiddingAdMarkup;
                        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
                        AdResponseOuterClass.AdResponse.Builder builderNewBuilder = AdResponseOuterClass.AdResponse.newBuilder();
                        ck.p.i(builderNewBuilder, "newBuilder()");
                        dsl_create = companion._create(builderNewBuilder);
                        ByteString adData2 = headerBiddingAdMarkup.getAdData();
                        ck.p.i(adData2, "headerBiddingAdMarkup.adData");
                        dsl_create.setAdData(adData2);
                        dsl_create.setAdDataVersion(headerBiddingAdMarkup.getAdDataVersion());
                        ByteString trackingToken = adPlayerConfigResponse.getTrackingToken();
                        ck.p.i(trackingToken, "response.trackingToken");
                        dsl_create.setTrackingToken(trackingToken);
                        ByteString impressionConfiguration = adPlayerConfigResponse.getImpressionConfiguration();
                        ck.p.i(impressionConfiguration, "response.impressionConfiguration");
                        dsl_create.setImpressionConfiguration(impressionConfiguration);
                        dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                        WebviewConfiguration.WebViewConfiguration webviewConfiguration = adPlayerConfigResponse.getWebviewConfiguration();
                        ck.p.i(webviewConfiguration, "response.webviewConfiguration");
                        dsl_create.setWebviewConfiguration(webviewConfiguration);
                        ByteString adDataRefreshToken = adPlayerConfigResponse.getAdDataRefreshToken();
                        ck.p.i(adDataRefreshToken, "response.adDataRefreshToken");
                        dsl_create.setAdDataRefreshToken(adDataRefreshToken);
                        if (adPlayerConfigResponse.hasError()) {
                            ErrorOuterClass.Error error = adPlayerConfigResponse.getError();
                            ck.p.i(error, "response.error");
                            dsl_create.setError(error);
                        }
                        adData = adPlayerConfigResponse.getAdData();
                        ck.p.i(adData, "response.adData");
                        if (ByteStringsKt.isNotEmpty(adData)) {
                            ByteString adData3 = adPlayerConfigResponse.getAdData();
                            ck.p.i(adData3, "response.adData");
                            dsl_create.setAdData(adData3);
                            dsl_create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                        }
                        adResponse = dsl_create._build();
                        AdResponseOuterClass.AdResponse adResponse3 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse2 = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions2 = this.$loadOptions;
                        ByteString byteString4 = this.$opportunityId;
                        ck.p.i(adResponse3, "response");
                        Context context2 = this.$context;
                        String str7 = this.$placement;
                        if (i12 != 0) {
                            z11 = z10;
                        } else {
                            z11 = false;
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse2.invoke(unityAdsLoadOptions2, byteString4, adResponse3, context2, str7, diagnosticAdType7, z11, this);
                        if (objInvoke3 == objF) {
                            return objF;
                        }
                    }
                } else if (i13 == 1) {
                    int i15 = this.I$0;
                    AdObject adObject7 = (AdObject) this.L$2;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$1;
                    kotlin.c.b(obj);
                    i11 = i15;
                    adObject2 = adObject7;
                    diagnosticAdType2 = diagnosticAdType8;
                    objInvoke2 = obj;
                    UniversalRequestOuterClass.UniversalRequest universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) objInvoke2;
                    RequestPolicy requestPolicyInvoke3 = AndroidLoad.this.getRequestPolicy.invoke();
                    AndroidLoad androidLoad5 = AndroidLoad.this;
                    jB = j.f64572a.b();
                    try {
                        Result.a aVar3 = Result.Companion;
                        GatewayClient gatewayClient3 = androidLoad5.gatewayClient;
                        OperationType operationType3 = OperationType.LOAD;
                        this.L$0 = diagnosticAdType2;
                        this.L$1 = adObject2;
                        this.L$2 = null;
                        this.I$0 = i11;
                        this.J$0 = jB;
                        try {
                            this.label = 2;
                            jB = jB;
                            z10 = true;
                            str3 = "native_load_config_success_time";
                            iVar = null;
                            try {
                                objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient3, null, universalRequest3, requestPolicyInvoke3, operationType3, this, 1, null);
                                if (objRequest$default == objF) {
                                    return objF;
                                }
                                i12 = i11;
                                adObject3 = adObject2;
                                diagnosticAdType3 = diagnosticAdType2;
                                j10 = jB;
                                objM3458constructorimpl = Result.m3458constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default);
                                AdObject adObject8 = adObject3;
                                l lVar3 = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(j10), iVar);
                                AndroidLoad androidLoad6 = AndroidLoad.this;
                                objM3466unboximpl = ((Result) lVar3.a()).m3466unboximpl();
                                long jB5 = lVar3.b();
                                SendDiagnosticEvent sendDiagnosticEvent3 = androidLoad6.sendDiagnosticEvent;
                                if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                                    str = str3;
                                } else {
                                    str = "native_load_config_failure_time";
                                }
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, str, tj.a.b(b.G(jB5, DurationUnit.MILLISECONDS)), null, null, adObject8, null, 44, null);
                                Object objM3466unboximpl5 = ((Result) lVar3.c()).m3466unboximpl();
                                kotlin.c.b(objM3466unboximpl5);
                                adResponse = ((UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl5).getPayload().getAdResponse();
                                AdResponseOuterClass.AdResponse adResponse4 = adResponse;
                                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = diagnosticAdType3;
                                HandleGatewayAdResponse handleGatewayAdResponse3 = AndroidLoad.this.handleGatewayAdResponse;
                                UnityAdsLoadOptions unityAdsLoadOptions3 = this.$loadOptions;
                                ByteString byteString5 = this.$opportunityId;
                                ck.p.i(adResponse4, "response");
                                Context context3 = this.$context;
                                String str8 = this.$placement;
                                if (i12 != 0) {
                                    z11 = z10;
                                } else {
                                    z11 = false;
                                }
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                objInvoke3 = handleGatewayAdResponse3.invoke(unityAdsLoadOptions3, byteString5, adResponse4, context3, str8, diagnosticAdType9, z11, this);
                                if (objInvoke3 == objF) {
                                    return objF;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                i12 = i11;
                                adObject3 = adObject2;
                                diagnosticAdType3 = diagnosticAdType2;
                                j10 = jB;
                                Result.a aVar4 = Result.Companion;
                                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                                AdObject adObject9 = adObject3;
                                l lVar4 = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(j10), iVar);
                                AndroidLoad androidLoad7 = AndroidLoad.this;
                                objM3466unboximpl = ((Result) lVar4.a()).m3466unboximpl();
                                long jB6 = lVar4.b();
                                SendDiagnosticEvent sendDiagnosticEvent4 = androidLoad7.sendDiagnosticEvent;
                                if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                                    str = str3;
                                } else {
                                    str = "native_load_config_failure_time";
                                }
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str, tj.a.b(b.G(jB6, DurationUnit.MILLISECONDS)), null, null, adObject9, null, 44, null);
                                Object objM3466unboximpl6 = ((Result) lVar4.c()).m3466unboximpl();
                                kotlin.c.b(objM3466unboximpl6);
                                adResponse = ((UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl6).getPayload().getAdResponse();
                                AdResponseOuterClass.AdResponse adResponse5 = adResponse;
                                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType10 = diagnosticAdType3;
                                HandleGatewayAdResponse handleGatewayAdResponse4 = AndroidLoad.this.handleGatewayAdResponse;
                                UnityAdsLoadOptions unityAdsLoadOptions4 = this.$loadOptions;
                                ByteString byteString6 = this.$opportunityId;
                                ck.p.i(adResponse5, "response");
                                Context context4 = this.$context;
                                String str9 = this.$placement;
                                if (i12 != 0) {
                                    z11 = z10;
                                } else {
                                    z11 = false;
                                }
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                objInvoke3 = handleGatewayAdResponse4.invoke(unityAdsLoadOptions4, byteString6, adResponse5, context4, str9, diagnosticAdType10, z11, this);
                                if (objInvoke3 == objF) {
                                    return objF;
                                }
                                loadResult = (LoadResult) objInvoke3;
                                if (loadResult instanceof LoadResult.Success) {
                                    AdObject ad2 = AndroidLoad.this.adRepository.getAd(this.$opportunityId);
                                    if (ad2 == null) {
                                    }
                                }
                                if (loadResult instanceof LoadResult.Failure) {
                                    return loadResult;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            z10 = true;
                            iVar = null;
                            i12 = i11;
                            adObject3 = adObject2;
                            diagnosticAdType3 = diagnosticAdType2;
                            j10 = jB;
                            Result.a aVar5 = Result.Companion;
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                            AdObject adObject10 = adObject3;
                            l lVar5 = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(j10), iVar);
                            AndroidLoad androidLoad8 = AndroidLoad.this;
                            objM3466unboximpl = ((Result) lVar5.a()).m3466unboximpl();
                            long jB7 = lVar5.b();
                            SendDiagnosticEvent sendDiagnosticEvent5 = androidLoad8.sendDiagnosticEvent;
                            if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                                str = str3;
                            } else {
                                str = "native_load_config_failure_time";
                            }
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent5, str, tj.a.b(b.G(jB7, DurationUnit.MILLISECONDS)), null, null, adObject10, null, 44, null);
                            Object objM3466unboximpl7 = ((Result) lVar5.c()).m3466unboximpl();
                            kotlin.c.b(objM3466unboximpl7);
                            adResponse = ((UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl7).getPayload().getAdResponse();
                            AdResponseOuterClass.AdResponse adResponse6 = adResponse;
                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType11 = diagnosticAdType3;
                            HandleGatewayAdResponse handleGatewayAdResponse5 = AndroidLoad.this.handleGatewayAdResponse;
                            UnityAdsLoadOptions unityAdsLoadOptions5 = this.$loadOptions;
                            ByteString byteString7 = this.$opportunityId;
                            ck.p.i(adResponse6, "response");
                            Context context5 = this.$context;
                            String str10 = this.$placement;
                            if (i12 != 0) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            objInvoke3 = handleGatewayAdResponse5.invoke(unityAdsLoadOptions5, byteString7, adResponse6, context5, str10, diagnosticAdType11, z11, this);
                            if (objInvoke3 == objF) {
                                return objF;
                            }
                            loadResult = (LoadResult) objInvoke3;
                            if (loadResult instanceof LoadResult.Success) {
                                AdObject ad3 = AndroidLoad.this.adRepository.getAd(this.$opportunityId);
                                if (ad3 == null) {
                                }
                            }
                            if (loadResult instanceof LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        z10 = true;
                    }
                } else if (i13 == 2) {
                    j10 = this.J$0;
                    i12 = this.I$0;
                    adObject3 = (AdObject) this.L$1;
                    diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        objRequest$default = obj;
                        z10 = true;
                        str3 = "native_load_config_success_time";
                        iVar = null;
                        try {
                            objM3458constructorimpl = Result.m3458constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default);
                        } catch (Throwable th5) {
                            th = th5;
                            Result.a aVar6 = Result.Companion;
                            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z10 = true;
                        str3 = "native_load_config_success_time";
                        iVar = null;
                        Result.a aVar7 = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                        AdObject adObject11 = adObject3;
                        l lVar6 = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(j10), iVar);
                        AndroidLoad androidLoad9 = AndroidLoad.this;
                        objM3466unboximpl = ((Result) lVar6.a()).m3466unboximpl();
                        long jB8 = lVar6.b();
                        SendDiagnosticEvent sendDiagnosticEvent6 = androidLoad9.sendDiagnosticEvent;
                        if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                            str = str3;
                        } else {
                            str = "native_load_config_failure_time";
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent6, str, tj.a.b(b.G(jB8, DurationUnit.MILLISECONDS)), null, null, adObject11, null, 44, null);
                        Object objM3466unboximpl8 = ((Result) lVar6.c()).m3466unboximpl();
                        kotlin.c.b(objM3466unboximpl8);
                        adResponse = ((UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl8).getPayload().getAdResponse();
                        AdResponseOuterClass.AdResponse adResponse7 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType12 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse6 = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions6 = this.$loadOptions;
                        ByteString byteString8 = this.$opportunityId;
                        ck.p.i(adResponse7, "response");
                        Context context6 = this.$context;
                        String str11 = this.$placement;
                        if (i12 != 0) {
                            z11 = z10;
                        } else {
                            z11 = false;
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse6.invoke(unityAdsLoadOptions6, byteString8, adResponse7, context6, str11, diagnosticAdType12, z11, this);
                        if (objInvoke3 == objF) {
                            return objF;
                        }
                        loadResult = (LoadResult) objInvoke3;
                        if (loadResult instanceof LoadResult.Success) {
                            AdObject ad4 = AndroidLoad.this.adRepository.getAd(this.$opportunityId);
                            if (ad4 == null) {
                            }
                        }
                        if (loadResult instanceof LoadResult.Failure) {
                            return loadResult;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    AdObject adObject12 = adObject3;
                    l lVar7 = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(j10), iVar);
                    AndroidLoad androidLoad10 = AndroidLoad.this;
                    objM3466unboximpl = ((Result) lVar7.a()).m3466unboximpl();
                    long jB9 = lVar7.b();
                    SendDiagnosticEvent sendDiagnosticEvent7 = androidLoad10.sendDiagnosticEvent;
                    if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                        str = str3;
                    } else {
                        str = "native_load_config_failure_time";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent7, str, tj.a.b(b.G(jB9, DurationUnit.MILLISECONDS)), null, null, adObject12, null, 44, null);
                    Object objM3466unboximpl9 = ((Result) lVar7.c()).m3466unboximpl();
                    kotlin.c.b(objM3466unboximpl9);
                    adResponse = ((UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl9).getPayload().getAdResponse();
                    AdResponseOuterClass.AdResponse adResponse8 = adResponse;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType13 = diagnosticAdType3;
                    HandleGatewayAdResponse handleGatewayAdResponse7 = AndroidLoad.this.handleGatewayAdResponse;
                    UnityAdsLoadOptions unityAdsLoadOptions7 = this.$loadOptions;
                    ByteString byteString9 = this.$opportunityId;
                    ck.p.i(adResponse8, "response");
                    Context context7 = this.$context;
                    String str12 = this.$placement;
                    if (i12 != 0) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    objInvoke3 = handleGatewayAdResponse7.invoke(unityAdsLoadOptions7, byteString9, adResponse8, context7, str12, diagnosticAdType13, z11, this);
                    if (objInvoke3 == objF) {
                        return objF;
                    }
                } else if (i13 == 3) {
                    int i16 = this.I$0;
                    AdObject adObject13 = (AdObject) this.L$2;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType14 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$1;
                    kotlin.c.b(obj);
                    i10 = i16;
                    adObject = adObject13;
                    z10 = true;
                    objInvoke = obj;
                    obj2 = null;
                    diagnosticAdType = diagnosticAdType14;
                    UniversalRequestOuterClass.UniversalRequest universalRequest4 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                    RequestPolicy requestPolicyInvoke4 = AndroidLoad.this.getRequestPolicy.invoke();
                    AndroidLoad androidLoad11 = AndroidLoad.this;
                    jB2 = j.f64572a.b();
                    try {
                        Result.a aVar8 = Result.Companion;
                        GatewayClient gatewayClient4 = androidLoad11.gatewayClient;
                        OperationType operationType4 = OperationType.LOAD_HEADER_BIDDING;
                        this.L$0 = diagnosticAdType;
                        this.L$1 = adObject;
                        this.L$2 = obj2;
                        this.I$0 = i10;
                        this.J$0 = jB2;
                        this.label = 4;
                        j11 = jB2;
                        diagnosticAdType4 = diagnosticAdType;
                        try {
                            objRequest$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient4, null, universalRequest4, requestPolicyInvoke4, operationType4, this, 1, null);
                            if (objRequest$default2 == objF) {
                                return objF;
                            }
                            diagnosticAdType3 = diagnosticAdType4;
                            adObject4 = adObject;
                            i12 = i10;
                            j12 = j11;
                            objM3458constructorimpl2 = Result.m3458constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default2);
                            AdObject adObject14 = adObject4;
                            l lVar8 = new l(Result.m3457boximpl(objM3458constructorimpl2), j.a.e(j12), null);
                            AndroidLoad androidLoad12 = AndroidLoad.this;
                            objM3466unboximpl2 = ((Result) lVar8.a()).m3466unboximpl();
                            long jB10 = lVar8.b();
                            SendDiagnosticEvent sendDiagnosticEvent8 = androidLoad12.sendDiagnosticEvent;
                            if (Result.m3464isSuccessimpl(objM3466unboximpl2)) {
                                str2 = str3;
                            } else {
                                str2 = "native_load_config_failure_time";
                            }
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent8, str2, tj.a.b(b.G(jB10, DurationUnit.MILLISECONDS)), null, null, adObject14, null, 44, null);
                            Object objM3466unboximpl10 = ((Result) lVar8.c()).m3466unboximpl();
                            kotlin.c.b(objM3466unboximpl10);
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl10;
                            if (universalResponse.hasError()) {
                                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                            }
                            adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2 = this.$headerBiddingAdMarkup;
                            AdResponseKt.Dsl.Companion companion2 = AdResponseKt.Dsl.Companion;
                            AdResponseOuterClass.AdResponse.Builder builderNewBuilder2 = AdResponseOuterClass.AdResponse.newBuilder();
                            ck.p.i(builderNewBuilder2, "newBuilder()");
                            dsl_create = companion2._create(builderNewBuilder2);
                            ByteString adData4 = headerBiddingAdMarkup2.getAdData();
                            ck.p.i(adData4, "headerBiddingAdMarkup.adData");
                            dsl_create.setAdData(adData4);
                            dsl_create.setAdDataVersion(headerBiddingAdMarkup2.getAdDataVersion());
                            ByteString trackingToken2 = adPlayerConfigResponse.getTrackingToken();
                            ck.p.i(trackingToken2, "response.trackingToken");
                            dsl_create.setTrackingToken(trackingToken2);
                            ByteString impressionConfiguration2 = adPlayerConfigResponse.getImpressionConfiguration();
                            ck.p.i(impressionConfiguration2, "response.impressionConfiguration");
                            dsl_create.setImpressionConfiguration(impressionConfiguration2);
                            dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                            WebviewConfiguration.WebViewConfiguration webviewConfiguration2 = adPlayerConfigResponse.getWebviewConfiguration();
                            ck.p.i(webviewConfiguration2, "response.webviewConfiguration");
                            dsl_create.setWebviewConfiguration(webviewConfiguration2);
                            ByteString adDataRefreshToken2 = adPlayerConfigResponse.getAdDataRefreshToken();
                            ck.p.i(adDataRefreshToken2, "response.adDataRefreshToken");
                            dsl_create.setAdDataRefreshToken(adDataRefreshToken2);
                            if (adPlayerConfigResponse.hasError()) {
                                ErrorOuterClass.Error error2 = adPlayerConfigResponse.getError();
                                ck.p.i(error2, "response.error");
                                dsl_create.setError(error2);
                            }
                            adData = adPlayerConfigResponse.getAdData();
                            ck.p.i(adData, "response.adData");
                            if (ByteStringsKt.isNotEmpty(adData)) {
                                ByteString adData5 = adPlayerConfigResponse.getAdData();
                                ck.p.i(adData5, "response.adData");
                                dsl_create.setAdData(adData5);
                                dsl_create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                            }
                            adResponse = dsl_create._build();
                            AdResponseOuterClass.AdResponse adResponse9 = adResponse;
                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType15 = diagnosticAdType3;
                            HandleGatewayAdResponse handleGatewayAdResponse8 = AndroidLoad.this.handleGatewayAdResponse;
                            UnityAdsLoadOptions unityAdsLoadOptions8 = this.$loadOptions;
                            ByteString byteString10 = this.$opportunityId;
                            ck.p.i(adResponse9, "response");
                            Context context8 = this.$context;
                            String str13 = this.$placement;
                            if (i12 != 0) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            objInvoke3 = handleGatewayAdResponse8.invoke(unityAdsLoadOptions8, byteString10, adResponse9, context8, str13, diagnosticAdType15, z11, this);
                            if (objInvoke3 == objF) {
                                return objF;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            diagnosticAdType3 = diagnosticAdType4;
                            adObject4 = adObject;
                            i12 = i10;
                            j12 = j11;
                            Result.a aVar9 = Result.Companion;
                            objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th));
                            AdObject adObject15 = adObject4;
                            l lVar9 = new l(Result.m3457boximpl(objM3458constructorimpl2), j.a.e(j12), null);
                            AndroidLoad androidLoad13 = AndroidLoad.this;
                            objM3466unboximpl2 = ((Result) lVar9.a()).m3466unboximpl();
                            long jB11 = lVar9.b();
                            SendDiagnosticEvent sendDiagnosticEvent9 = androidLoad13.sendDiagnosticEvent;
                            if (Result.m3464isSuccessimpl(objM3466unboximpl2)) {
                                str2 = str3;
                            } else {
                                str2 = "native_load_config_failure_time";
                            }
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent9, str2, tj.a.b(b.G(jB11, DurationUnit.MILLISECONDS)), null, null, adObject15, null, 44, null);
                            Object objM3466unboximpl11 = ((Result) lVar9.c()).m3466unboximpl();
                            kotlin.c.b(objM3466unboximpl11);
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl11;
                            if (universalResponse.hasError()) {
                                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                            }
                            adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = this.$headerBiddingAdMarkup;
                            AdResponseKt.Dsl.Companion companion3 = AdResponseKt.Dsl.Companion;
                            AdResponseOuterClass.AdResponse.Builder builderNewBuilder3 = AdResponseOuterClass.AdResponse.newBuilder();
                            ck.p.i(builderNewBuilder3, "newBuilder()");
                            dsl_create = companion3._create(builderNewBuilder3);
                            ByteString adData6 = headerBiddingAdMarkup3.getAdData();
                            ck.p.i(adData6, "headerBiddingAdMarkup.adData");
                            dsl_create.setAdData(adData6);
                            dsl_create.setAdDataVersion(headerBiddingAdMarkup3.getAdDataVersion());
                            ByteString trackingToken3 = adPlayerConfigResponse.getTrackingToken();
                            ck.p.i(trackingToken3, "response.trackingToken");
                            dsl_create.setTrackingToken(trackingToken3);
                            ByteString impressionConfiguration3 = adPlayerConfigResponse.getImpressionConfiguration();
                            ck.p.i(impressionConfiguration3, "response.impressionConfiguration");
                            dsl_create.setImpressionConfiguration(impressionConfiguration3);
                            dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                            WebviewConfiguration.WebViewConfiguration webviewConfiguration3 = adPlayerConfigResponse.getWebviewConfiguration();
                            ck.p.i(webviewConfiguration3, "response.webviewConfiguration");
                            dsl_create.setWebviewConfiguration(webviewConfiguration3);
                            ByteString adDataRefreshToken3 = adPlayerConfigResponse.getAdDataRefreshToken();
                            ck.p.i(adDataRefreshToken3, "response.adDataRefreshToken");
                            dsl_create.setAdDataRefreshToken(adDataRefreshToken3);
                            if (adPlayerConfigResponse.hasError()) {
                                ErrorOuterClass.Error error3 = adPlayerConfigResponse.getError();
                                ck.p.i(error3, "response.error");
                                dsl_create.setError(error3);
                            }
                            adData = adPlayerConfigResponse.getAdData();
                            ck.p.i(adData, "response.adData");
                            if (ByteStringsKt.isNotEmpty(adData)) {
                                ByteString adData7 = adPlayerConfigResponse.getAdData();
                                ck.p.i(adData7, "response.adData");
                                dsl_create.setAdData(adData7);
                                dsl_create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                            }
                            adResponse = dsl_create._build();
                            AdResponseOuterClass.AdResponse adResponse10 = adResponse;
                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType16 = diagnosticAdType3;
                            HandleGatewayAdResponse handleGatewayAdResponse9 = AndroidLoad.this.handleGatewayAdResponse;
                            UnityAdsLoadOptions unityAdsLoadOptions9 = this.$loadOptions;
                            ByteString byteString11 = this.$opportunityId;
                            ck.p.i(adResponse10, "response");
                            Context context9 = this.$context;
                            String str14 = this.$placement;
                            if (i12 != 0) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            objInvoke3 = handleGatewayAdResponse9.invoke(unityAdsLoadOptions9, byteString11, adResponse10, context9, str14, diagnosticAdType16, z11, this);
                            if (objInvoke3 == objF) {
                                return objF;
                            }
                            loadResult = (LoadResult) objInvoke3;
                            if (loadResult instanceof LoadResult.Success) {
                                AdObject ad5 = AndroidLoad.this.adRepository.getAd(this.$opportunityId);
                                if (ad5 == null) {
                                }
                            }
                            if (loadResult instanceof LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j11 = jB2;
                        diagnosticAdType4 = diagnosticAdType;
                    }
                } else if (i13 == 4) {
                    j12 = this.J$0;
                    i12 = this.I$0;
                    adObject4 = (AdObject) this.L$1;
                    diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        objRequest$default2 = obj;
                        z10 = true;
                        str3 = "native_load_config_success_time";
                        try {
                            objM3458constructorimpl2 = Result.m3458constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default2);
                        } catch (Throwable th9) {
                            th = th9;
                            Result.a aVar10 = Result.Companion;
                            objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th));
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        z10 = true;
                        str3 = "native_load_config_success_time";
                        Result.a aVar11 = Result.Companion;
                        objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th));
                        AdObject adObject16 = adObject4;
                        l lVar10 = new l(Result.m3457boximpl(objM3458constructorimpl2), j.a.e(j12), null);
                        AndroidLoad androidLoad14 = AndroidLoad.this;
                        objM3466unboximpl2 = ((Result) lVar10.a()).m3466unboximpl();
                        long jB12 = lVar10.b();
                        SendDiagnosticEvent sendDiagnosticEvent10 = androidLoad14.sendDiagnosticEvent;
                        if (Result.m3464isSuccessimpl(objM3466unboximpl2)) {
                            str2 = str3;
                        } else {
                            str2 = "native_load_config_failure_time";
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent10, str2, tj.a.b(b.G(jB12, DurationUnit.MILLISECONDS)), null, null, adObject16, null, 44, null);
                        Object objM3466unboximpl12 = ((Result) lVar10.c()).m3466unboximpl();
                        kotlin.c.b(objM3466unboximpl12);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl12;
                        if (universalResponse.hasError()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                        }
                        adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup4 = this.$headerBiddingAdMarkup;
                        AdResponseKt.Dsl.Companion companion4 = AdResponseKt.Dsl.Companion;
                        AdResponseOuterClass.AdResponse.Builder builderNewBuilder4 = AdResponseOuterClass.AdResponse.newBuilder();
                        ck.p.i(builderNewBuilder4, "newBuilder()");
                        dsl_create = companion4._create(builderNewBuilder4);
                        ByteString adData8 = headerBiddingAdMarkup4.getAdData();
                        ck.p.i(adData8, "headerBiddingAdMarkup.adData");
                        dsl_create.setAdData(adData8);
                        dsl_create.setAdDataVersion(headerBiddingAdMarkup4.getAdDataVersion());
                        ByteString trackingToken4 = adPlayerConfigResponse.getTrackingToken();
                        ck.p.i(trackingToken4, "response.trackingToken");
                        dsl_create.setTrackingToken(trackingToken4);
                        ByteString impressionConfiguration4 = adPlayerConfigResponse.getImpressionConfiguration();
                        ck.p.i(impressionConfiguration4, "response.impressionConfiguration");
                        dsl_create.setImpressionConfiguration(impressionConfiguration4);
                        dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                        WebviewConfiguration.WebViewConfiguration webviewConfiguration4 = adPlayerConfigResponse.getWebviewConfiguration();
                        ck.p.i(webviewConfiguration4, "response.webviewConfiguration");
                        dsl_create.setWebviewConfiguration(webviewConfiguration4);
                        ByteString adDataRefreshToken4 = adPlayerConfigResponse.getAdDataRefreshToken();
                        ck.p.i(adDataRefreshToken4, "response.adDataRefreshToken");
                        dsl_create.setAdDataRefreshToken(adDataRefreshToken4);
                        if (adPlayerConfigResponse.hasError()) {
                            ErrorOuterClass.Error error4 = adPlayerConfigResponse.getError();
                            ck.p.i(error4, "response.error");
                            dsl_create.setError(error4);
                        }
                        adData = adPlayerConfigResponse.getAdData();
                        ck.p.i(adData, "response.adData");
                        if (ByteStringsKt.isNotEmpty(adData)) {
                            ByteString adData9 = adPlayerConfigResponse.getAdData();
                            ck.p.i(adData9, "response.adData");
                            dsl_create.setAdData(adData9);
                            dsl_create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                        }
                        adResponse = dsl_create._build();
                        AdResponseOuterClass.AdResponse adResponse11 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType17 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse10 = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions10 = this.$loadOptions;
                        ByteString byteString12 = this.$opportunityId;
                        ck.p.i(adResponse11, "response");
                        Context context10 = this.$context;
                        String str15 = this.$placement;
                        if (i12 != 0) {
                            z11 = z10;
                        } else {
                            z11 = false;
                        }
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse10.invoke(unityAdsLoadOptions10, byteString12, adResponse11, context10, str15, diagnosticAdType17, z11, this);
                        if (objInvoke3 == objF) {
                            return objF;
                        }
                        loadResult = (LoadResult) objInvoke3;
                        if (loadResult instanceof LoadResult.Success) {
                            AdObject ad6 = AndroidLoad.this.adRepository.getAd(this.$opportunityId);
                            return ad6 == null ? new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, false, 52, null) : new LoadResult.Success(ad6);
                        }
                        if (loadResult instanceof LoadResult.Failure) {
                            return loadResult;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    AdObject adObject17 = adObject4;
                    l lVar11 = new l(Result.m3457boximpl(objM3458constructorimpl2), j.a.e(j12), null);
                    AndroidLoad androidLoad15 = AndroidLoad.this;
                    objM3466unboximpl2 = ((Result) lVar11.a()).m3466unboximpl();
                    long jB13 = lVar11.b();
                    SendDiagnosticEvent sendDiagnosticEvent11 = androidLoad15.sendDiagnosticEvent;
                    if (Result.m3464isSuccessimpl(objM3466unboximpl2)) {
                        str2 = str3;
                    } else {
                        str2 = "native_load_config_failure_time";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent11, str2, tj.a.b(b.G(jB13, DurationUnit.MILLISECONDS)), null, null, adObject17, null, 44, null);
                    Object objM3466unboximpl13 = ((Result) lVar11.c()).m3466unboximpl();
                    kotlin.c.b(objM3466unboximpl13);
                    universalResponse = (UniversalResponseOuterClass.UniversalResponse) objM3466unboximpl13;
                    if (universalResponse.hasError()) {
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                    }
                    adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                    HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup5 = this.$headerBiddingAdMarkup;
                    AdResponseKt.Dsl.Companion companion5 = AdResponseKt.Dsl.Companion;
                    AdResponseOuterClass.AdResponse.Builder builderNewBuilder5 = AdResponseOuterClass.AdResponse.newBuilder();
                    ck.p.i(builderNewBuilder5, "newBuilder()");
                    dsl_create = companion5._create(builderNewBuilder5);
                    ByteString adData10 = headerBiddingAdMarkup5.getAdData();
                    ck.p.i(adData10, "headerBiddingAdMarkup.adData");
                    dsl_create.setAdData(adData10);
                    dsl_create.setAdDataVersion(headerBiddingAdMarkup5.getAdDataVersion());
                    ByteString trackingToken5 = adPlayerConfigResponse.getTrackingToken();
                    ck.p.i(trackingToken5, "response.trackingToken");
                    dsl_create.setTrackingToken(trackingToken5);
                    ByteString impressionConfiguration5 = adPlayerConfigResponse.getImpressionConfiguration();
                    ck.p.i(impressionConfiguration5, "response.impressionConfiguration");
                    dsl_create.setImpressionConfiguration(impressionConfiguration5);
                    dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                    WebviewConfiguration.WebViewConfiguration webviewConfiguration5 = adPlayerConfigResponse.getWebviewConfiguration();
                    ck.p.i(webviewConfiguration5, "response.webviewConfiguration");
                    dsl_create.setWebviewConfiguration(webviewConfiguration5);
                    ByteString adDataRefreshToken5 = adPlayerConfigResponse.getAdDataRefreshToken();
                    ck.p.i(adDataRefreshToken5, "response.adDataRefreshToken");
                    dsl_create.setAdDataRefreshToken(adDataRefreshToken5);
                    if (adPlayerConfigResponse.hasError()) {
                        ErrorOuterClass.Error error5 = adPlayerConfigResponse.getError();
                        ck.p.i(error5, "response.error");
                        dsl_create.setError(error5);
                    }
                    adData = adPlayerConfigResponse.getAdData();
                    ck.p.i(adData, "response.adData");
                    if (ByteStringsKt.isNotEmpty(adData)) {
                        ByteString adData11 = adPlayerConfigResponse.getAdData();
                        ck.p.i(adData11, "response.adData");
                        dsl_create.setAdData(adData11);
                        dsl_create.setAdDataVersion(adPlayerConfigResponse.getAdDataVersion());
                    }
                    adResponse = dsl_create._build();
                    AdResponseOuterClass.AdResponse adResponse12 = adResponse;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType18 = diagnosticAdType3;
                    HandleGatewayAdResponse handleGatewayAdResponse11 = AndroidLoad.this.handleGatewayAdResponse;
                    UnityAdsLoadOptions unityAdsLoadOptions11 = this.$loadOptions;
                    ByteString byteString13 = this.$opportunityId;
                    ck.p.i(adResponse12, "response");
                    Context context11 = this.$context;
                    String str16 = this.$placement;
                    if (i12 != 0) {
                        z11 = z10;
                    } else {
                        z11 = false;
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    objInvoke3 = handleGatewayAdResponse11.invoke(unityAdsLoadOptions11, byteString13, adResponse12, context11, str16, diagnosticAdType18, z11, this);
                    if (objInvoke3 == objF) {
                        return objF;
                    }
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    objInvoke3 = obj;
                }
                loadResult = (LoadResult) objInvoke3;
                if (loadResult instanceof LoadResult.Success) {
                    AdObject ad7 = AndroidLoad.this.adRepository.getAd(this.$opportunityId);
                    if (ad7 == null) {
                    }
                }
                if (loadResult instanceof LoadResult.Failure) {
                    return loadResult;
                }
                throw new NoWhenBranchMatchedException();
            } catch (UnityAdsNetworkException e10) {
                return AndroidLoad.this.handleGatewayException(e10);
            }
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, c<? super LoadResult> cVar) {
        return h.g(this.defaultDispatcher, new AnonymousClass2(bannerSize, headerBiddingAdMarkup, byteString, str, unityAdsLoadOptions, context, null), cVar);
    }

    public AndroidLoad(h0 h0Var, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        ck.p.j(h0Var, "defaultDispatcher");
        ck.p.j(getAdRequest, "getAdRequest");
        ck.p.j(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        ck.p.j(getRequestPolicy, "getRequestPolicy");
        ck.p.j(handleGatewayAdResponse, "handleGatewayAdResponse");
        ck.p.j(sessionRepository, "sessionRepository");
        ck.p.j(gatewayClient, "gatewayClient");
        ck.p.j(adRepository, "adRepository");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.defaultDispatcher = h0Var;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(ByteString byteString, String str, boolean z10, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, UnityAdsLoadOptions unityAdsLoadOptions) {
        ByteString byteString2 = ByteString.EMPTY;
        ck.p.i(byteString2, "EMPTY");
        return new AdObject(byteString, str, byteString2, false, null, null, null, false, null, null, null, unityAdsLoadOptions, z10, diagnosticAdType, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        String message;
        boolean z10 = unityAdsNetworkException instanceof NetworkTimeoutException;
        UnityAds.UnityAdsLoadError unityAdsLoadError = z10 ? UnityAds.UnityAdsLoadError.TIMEOUT : UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
        if (z10) {
            message = LoadResult.MSG_TIMEOUT;
        } else {
            message = unityAdsNetworkException instanceof GatewayException ? unityAdsNetworkException.getMessage() : "[UnityAds] Internal communication failure";
        }
        return new LoadResult.Failure(unityAdsLoadError, message, unityAdsNetworkException, z10 ? "timeout" : "gateway", unityAdsNetworkException.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }
}
