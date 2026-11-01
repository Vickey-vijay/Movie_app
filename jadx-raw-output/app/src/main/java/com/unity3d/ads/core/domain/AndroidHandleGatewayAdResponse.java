package com.unity3d.ads.core.domain;

import android.content.Context;
import android.util.Base64;
import ck.p;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.h;
import lk.a0;
import lk.x;
import mj.r;
import mk.b;
import mk.j;
import mk.l;
import nk.l0;
import org.json.JSONObject;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {235, 241}, m = "cleanup")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {96, 113, 144, 187, 191, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invoke")
    public static final class C38791 extends ContinuationImpl {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C38791(c<? super C38791> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object cleanup(Throwable th2, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String message;
        AdPlayer adPlayer2;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                AdPlayer adPlayer3 = (AdPlayer) anonymousClass1.L$0;
                kotlin.c.b(obj);
                adPlayer2 = adPlayer3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
        kotlin.c.b(obj);
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
        Throwable cause = th2.getCause();
        if ((cause == null || (message = cause.getMessage()) == null) && (message = th2.getMessage()) == null) {
            message = "";
        }
        dsl_create.setMessage(message);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
        ByteString trackingToken = adResponse.getTrackingToken();
        p.i(trackingToken, "response.trackingToken");
        ByteString byteString2 = operativeEventErrorData_build.toByteString();
        p.i(byteString2, "operativeEventErrorData.toByteString()");
        adPlayer2 = adPlayer;
        anonymousClass1.L$0 = adPlayer2;
        anonymousClass1.label = 1;
        if (getOperativeEventApi.invoke(operativeEventType, byteString, trackingToken, byteString2, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null, anonymousClass1) == objF) {
            return objF;
        }
        if (adPlayer2 == null) {
            return r.f64562a;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        if (adPlayer2.destroy(anonymousClass1) == objF) {
            return objF;
        }
        return r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0354  */
    /* JADX WARN: Code duplicated, block: B:104:0x0357  */
    /* JADX WARN: Code duplicated, block: B:112:0x047f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x0480  */
    /* JADX WARN: Code duplicated, block: B:116:0x048a A[Catch: CancellationException -> 0x055b, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x055b, blocks: (B:114:0x0484, B:116:0x048a, B:124:0x04fe, B:126:0x052f, B:132:0x053c, B:134:0x0542, B:139:0x0550, B:140:0x0555), top: B:177:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x04d8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:124:0x04fe A[Catch: CancellationException -> 0x055b, TRY_ENTER, TryCatch #3 {CancellationException -> 0x055b, blocks: (B:114:0x0484, B:116:0x048a, B:124:0x04fe, B:126:0x052f, B:132:0x053c, B:134:0x0542, B:139:0x0550, B:140:0x0555), top: B:177:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x052f A[Catch: CancellationException -> 0x055b, TryCatch #3 {CancellationException -> 0x055b, blocks: (B:114:0x0484, B:116:0x048a, B:124:0x04fe, B:126:0x052f, B:132:0x053c, B:134:0x0542, B:139:0x0550, B:140:0x0555), top: B:177:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0538  */
    /* JADX WARN: Code duplicated, block: B:132:0x053c A[Catch: CancellationException -> 0x055b, TryCatch #3 {CancellationException -> 0x055b, blocks: (B:114:0x0484, B:116:0x048a, B:124:0x04fe, B:126:0x052f, B:132:0x053c, B:134:0x0542, B:139:0x0550, B:140:0x0555), top: B:177:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0542 A[Catch: CancellationException -> 0x055b, TryCatch #3 {CancellationException -> 0x055b, blocks: (B:114:0x0484, B:116:0x048a, B:124:0x04fe, B:126:0x052f, B:132:0x053c, B:134:0x0542, B:139:0x0550, B:140:0x0555), top: B:177:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x054d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0550 A[Catch: CancellationException -> 0x055b, TryCatch #3 {CancellationException -> 0x055b, blocks: (B:114:0x0484, B:116:0x048a, B:124:0x04fe, B:126:0x052f, B:132:0x053c, B:134:0x0542, B:139:0x0550, B:140:0x0555), top: B:177:0x0484 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x05cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:166:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:170:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0200  */
    /* JADX WARN: Code duplicated, block: B:66:0x0237 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0238  */
    /* JADX WARN: Code duplicated, block: B:70:0x0245  */
    /* JADX WARN: Code duplicated, block: B:71:0x0247  */
    /* JADX WARN: Code duplicated, block: B:73:0x024a A[Catch: CancellationException -> 0x012a, TryCatch #14 {CancellationException -> 0x012a, blocks: (B:99:0x031a, B:68:0x023b, B:73:0x024a, B:75:0x0262, B:80:0x027a, B:82:0x0283, B:85:0x02a1, B:36:0x0123, B:60:0x01dc, B:64:0x0202), top: B:198:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0262 A[Catch: CancellationException -> 0x012a, TryCatch #14 {CancellationException -> 0x012a, blocks: (B:99:0x031a, B:68:0x023b, B:73:0x024a, B:75:0x0262, B:80:0x027a, B:82:0x0283, B:85:0x02a1, B:36:0x0123, B:60:0x01dc, B:64:0x0202), top: B:198:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0276  */
    /* JADX WARN: Code duplicated, block: B:78:0x0277  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x027a A[Catch: CancellationException -> 0x012a, TRY_LEAVE, TryCatch #14 {CancellationException -> 0x012a, blocks: (B:99:0x031a, B:68:0x023b, B:73:0x024a, B:75:0x0262, B:80:0x027a, B:82:0x0283, B:85:0x02a1, B:36:0x0123, B:60:0x01dc, B:64:0x0202), top: B:198:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x029f  */
    /* JADX WARN: Code duplicated, block: B:90:0x02fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x02fb  */
    /* JADX WARN: Type inference failed for: r3v22, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    public Object invoke(UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Context context, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z10, c<? super LoadResult> cVar) throws Throwable {
        C38791 c38791;
        ByteString byteString2;
        AdResponseOuterClass.AdResponse adResponse2;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse;
        Ref$ObjectRef ref$ObjectRef;
        ByteString byteString3;
        AdResponseOuterClass.AdResponse adResponse3;
        String str2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse2;
        boolean z11;
        WebViewConfiguration webViewConfiguration;
        AdObject adObject;
        boolean z12;
        CacheWebViewAssets cacheWebViewAssets;
        AdObject adObject2;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        boolean z13;
        String configUrl;
        String query;
        String str3;
        String strEncodeToString;
        AdObject adObject3;
        long jB;
        String str4;
        Throwable th2;
        String str5;
        AdResponseOuterClass.AdResponse adResponse4;
        AdObject adObject4;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse3;
        ByteString byteString4;
        Ref$ObjectRef ref$ObjectRef2;
        String str6;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse4;
        UnityAdsLoadOptions unityAdsLoadOptions4;
        String str7;
        String str8;
        AdObject adObject5;
        String str9;
        Object objM3458constructorimpl;
        Object objM3466unboximpl;
        String str10;
        AdObject adObjectCopy;
        long jB2;
        boolean z14;
        UnityAdsLoadOptions unityAdsLoadOptions5;
        String str11;
        Ref$ObjectRef ref$ObjectRef3;
        AdObject adObject6;
        long j10;
        LoadEvent loadEvent;
        String objectId;
        boolean z15;
        JSONObject data;
        boolean z16;
        h hVar;
        AnonymousClass4 anonymousClass4;
        LoadEvent loadEvent2;
        AdObject adObject7;
        AdResponseOuterClass.AdResponse adResponse5;
        ByteString byteString5;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse5;
        h hVar2;
        AnonymousClass5 anonymousClass5;
        CancellationException cancellationException;
        Throwable cause;
        if (cVar instanceof C38791) {
            c38791 = (C38791) cVar;
            int i10 = c38791.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38791.label = i10 - Integer.MIN_VALUE;
            } else {
                c38791 = new C38791(cVar);
            }
        } else {
            c38791 = new C38791(cVar);
        }
        Object objInvoke = c38791.result;
        Object objF = sj.a.f();
        switch (c38791.label) {
            case 0:
                kotlin.c.b(objInvoke);
                Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                try {
                    try {
                        if (adResponse.hasError()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", null, "gateway", adResponse.getError().getErrorText(), false, 36, null);
                        }
                        if (adResponse.getAdData().isEmpty()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.NO_FILL, LoadResult.MSG_NO_FILL, null, "no_fill", null, false, 52, null);
                        }
                        GetLatestWebViewConfiguration getLatestWebViewConfiguration = this.getLatestWebViewConfiguration;
                        String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                        Integer numD = tj.a.d(adResponse.getWebviewConfiguration().getVersion());
                        List<String> additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                        String type = adResponse.getWebviewConfiguration().getType();
                        c38791.L$0 = this;
                        c38791.L$1 = unityAdsLoadOptions;
                        byteString2 = byteString;
                        try {
                            c38791.L$2 = byteString2;
                            adResponse2 = adResponse;
                            try {
                                c38791.L$3 = adResponse2;
                                str2 = str;
                                c38791.L$4 = str2;
                                diagnosticAdType2 = diagnosticAdType;
                                c38791.L$5 = diagnosticAdType2;
                                c38791.L$6 = ref$ObjectRef4;
                                c38791.Z$0 = z10;
                                c38791.label = 1;
                                Object objInvoke2 = getLatestWebViewConfiguration.invoke(entryPoint, numD, additionalFilesList, type, c38791);
                                if (objInvoke2 == objF) {
                                    return objF;
                                }
                                ref$ObjectRef = ref$ObjectRef4;
                                byteString3 = byteString2;
                                adResponse3 = adResponse2;
                                unityAdsLoadOptions2 = unityAdsLoadOptions;
                                androidHandleGatewayAdResponse2 = this;
                                objInvoke = objInvoke2;
                                z11 = z10;
                                webViewConfiguration = (WebViewConfiguration) objInvoke;
                                ByteString trackingToken = adResponse3.getTrackingToken();
                                p.i(trackingToken, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                                if (z11) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                adObject = new AdObject(byteString3, str2, trackingToken, false, null, null, null, false, null, null, null, unityAdsLoadOptions2, z12, diagnosticAdType2, null, null, 51192, null);
                                cacheWebViewAssets = androidHandleGatewayAdResponse2.cacheWebViewAssets;
                                c38791.L$0 = androidHandleGatewayAdResponse2;
                                c38791.L$1 = unityAdsLoadOptions2;
                                c38791.L$2 = byteString3;
                                c38791.L$3 = adResponse3;
                                c38791.L$4 = str2;
                                c38791.L$5 = diagnosticAdType2;
                                c38791.L$6 = ref$ObjectRef;
                                c38791.L$7 = webViewConfiguration;
                                c38791.L$8 = adObject;
                                c38791.label = 2;
                                if (cacheWebViewAssets.invoke(webViewConfiguration, c38791) == objF) {
                                    return objF;
                                }
                                adObject2 = adObject;
                                unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                diagnosticAdType3 = diagnosticAdType2;
                                if (webViewConfiguration.getEntryPoint().length() == 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", null, "no_webview_entry_point", null, false, 52, null);
                                }
                                configUrl = SdkProperties.getConfigUrl();
                                p.i(configUrl, "it");
                                if (!x.D(configUrl, ".html", false, 2, null)) {
                                    configUrl = null;
                                }
                                if (configUrl == null) {
                                    configUrl = webViewConfiguration.getEntryPoint();
                                }
                                try {
                                    URI uri = new URI(configUrl);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("?platform=android&mode=ad-viewer&webviewType=");
                                    sb2.append(webViewConfiguration.getType());
                                    sb2.append('&');
                                    query = uri.getQuery();
                                    if (query == null) {
                                        query = "";
                                    }
                                    sb2.append(query);
                                    str3 = a0.i1(configUrl, "?", null, 2, null) + sb2.toString();
                                    strEncodeToString = Base64.encodeToString(adResponse3.getImpressionConfiguration().toByteArray(), 2);
                                    adObject3 = adObject2;
                                    jB = j.f64572a.b();
                                    try {
                                        Result.a aVar = Result.Companion;
                                        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                                        AdPlayerScope adPlayerScope = androidHandleGatewayAdResponse2.adPlayerScope;
                                        c38791.L$0 = androidHandleGatewayAdResponse2;
                                        c38791.L$1 = unityAdsLoadOptions3;
                                        c38791.L$2 = byteString3;
                                        c38791.L$3 = adResponse3;
                                        c38791.L$4 = str2;
                                        c38791.L$5 = diagnosticAdType3;
                                        c38791.L$6 = ref$ObjectRef;
                                        c38791.L$7 = adObject3;
                                        c38791.L$8 = str3;
                                        c38791.L$9 = strEncodeToString;
                                        c38791.J$0 = jB;
                                        str4 = strEncodeToString;
                                        try {
                                            c38791.label = 3;
                                            objInvoke = androidGetWebViewContainerUseCase.invoke(adPlayerScope, c38791);
                                            if (objInvoke == objF) {
                                                return objF;
                                            }
                                            adResponse4 = adResponse3;
                                            adObject4 = adObject3;
                                            androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse2;
                                            byteString4 = byteString3;
                                            ref$ObjectRef2 = ref$ObjectRef;
                                            str6 = str4;
                                            objM3458constructorimpl = Result.m3458constructorimpl((AndroidWebViewContainer) objInvoke);
                                            str9 = str6;
                                            ref$ObjectRef = ref$ObjectRef2;
                                            byteString3 = byteString4;
                                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                            str7 = str3;
                                            str8 = str2;
                                            adObject5 = adObject4;
                                            adResponse3 = adResponse4;
                                            androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse3;
                                            try {
                                                UnityAdsLoadOptions unityAdsLoadOptions6 = unityAdsLoadOptions4;
                                                l lVar = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(jB), null);
                                                objM3466unboximpl = ((Result) lVar.a()).m3466unboximpl();
                                                long jB3 = lVar.b();
                                                SendDiagnosticEvent sendDiagnosticEvent = androidHandleGatewayAdResponse4.sendDiagnosticEvent;
                                                if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                                                    str10 = "native_webview_success_time";
                                                } else {
                                                    str10 = "native_webview_failure_time";
                                                }
                                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str10, tj.a.b(b.G(jB3, DurationUnit.MILLISECONDS)), null, null, adObject5, null, 44, null);
                                                Object objM3466unboximpl2 = ((Result) lVar.c()).m3466unboximpl();
                                                kotlin.c.b(objM3466unboximpl2);
                                                AndroidWebViewContainer androidWebViewContainer = (AndroidWebViewContainer) objM3466unboximpl2;
                                                WebViewBridge webViewBridgeInvoke = androidHandleGatewayAdResponse4.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse4.adPlayerScope);
                                                ?? Invoke = androidHandleGatewayAdResponse4.getAdPlayer.invoke(webViewBridgeInvoke, androidWebViewContainer, byteString3, diagnosticAdType3);
                                                ref$ObjectRef.element = Invoke;
                                                AdObject adObject8 = adObject5;
                                                adObjectCopy = adObject8.copy((65023 & 1) != 0 ? adObject8.opportunityId : null, (65023 & 2) != 0 ? adObject8.placementId : null, (65023 & 4) != 0 ? adObject8.trackingToken : null, (65023 & 8) != 0 ? adObject8.isScarAd : false, (65023 & 16) != 0 ? adObject8.scarQueryId : null, (65023 & 32) != 0 ? adObject8.scarAdUnitId : null, (65023 & 64) != 0 ? adObject8.scarAdString : null, (65023 & 128) != 0 ? adObject8.isOfferwallAd : false, (65023 & 256) != 0 ? adObject8.offerwallPlacementName : null, (65023 & 512) != 0 ? adObject8.adPlayer : (AdPlayer) Invoke, (65023 & 1024) != 0 ? adObject8.playerServerId : null, (65023 & 2048) != 0 ? adObject8.loadOptions : null, (65023 & 4096) != 0 ? adObject8.isHeaderBidding : false, (65023 & 8192) != 0 ? adObject8.adType : null, (65023 & 16384) != 0 ? adObject8.ttl : null, (65023 & 32768) != 0 ? adObject8.state : null);
                                                e.x(e.A(androidHandleGatewayAdResponse4.deviceInfoRepository.getAllowedPii(), new AnonymousClass2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                                                jB2 = j.f64572a.b();
                                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObjectCopy, null, 46, null);
                                                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = androidHandleGatewayAdResponse4.getHandleInvocationsFromAdViewer;
                                                qk.p<Invocation> onInvocation = webViewBridgeInvoke.getOnInvocation();
                                                ByteString adData = adResponse3.getAdData();
                                                p.i(adData, "response.adData");
                                                try {
                                                    String base64$default = ProtobufExtensionsKt.toBase64$default(adData, false, 1, null);
                                                    ByteString adDataRefreshToken = adResponse3.getAdDataRefreshToken();
                                                    p.i(adDataRefreshToken, "response.adDataRefreshToken");
                                                    String base64$default2 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null);
                                                    p.i(str9, "base64ImpressionConfiguration");
                                                    z14 = true;
                                                    unityAdsLoadOptions5 = unityAdsLoadOptions6;
                                                    String str12 = str8;
                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                                                    try {
                                                        e.x(handleInvocationsFromAdViewer.invoke(onInvocation, base64$default, base64$default2, str9, adObjectCopy, androidHandleGatewayAdResponse4.new AnonymousClass3(androidWebViewContainer, str7, adObject5, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                                                        qk.c<LoadEvent> onLoadEvent = ((AdPlayer) ref$ObjectRef.element).getOnLoadEvent();
                                                        c38791.L$0 = androidHandleGatewayAdResponse;
                                                        c38791.L$1 = unityAdsLoadOptions5;
                                                        c38791.L$2 = byteString3;
                                                        c38791.L$3 = adResponse3;
                                                        str11 = str12;
                                                        c38791.L$4 = str11;
                                                        c38791.L$5 = ref$ObjectRef;
                                                        c38791.L$6 = adObjectCopy;
                                                        c38791.L$7 = null;
                                                        c38791.L$8 = null;
                                                        c38791.L$9 = null;
                                                        c38791.J$0 = jB2;
                                                        c38791.label = 4;
                                                        objInvoke = e.F(onLoadEvent, c38791);
                                                        objF = objF;
                                                        if (objInvoke == objF) {
                                                            return objF;
                                                        }
                                                        androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse;
                                                        ref$ObjectRef3 = ref$ObjectRef;
                                                        adObject6 = adObjectCopy;
                                                        j10 = jB2;
                                                        try {
                                                            loadEvent = (LoadEvent) objInvoke;
                                                            if (!(loadEvent instanceof LoadEvent.Error)) {
                                                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                                                                androidHandleGatewayAdResponse4.campaignRepository.setLoadTimestamp(byteString3);
                                                                androidHandleGatewayAdResponse4.adRepository.addAd(byteString3, adObject6);
                                                                objectId = unityAdsLoadOptions5.getObjectId();
                                                                if (objectId != null || a0.n0(objectId)) {
                                                                    z15 = z14;
                                                                } else {
                                                                    z15 = false;
                                                                }
                                                                if (z15) {
                                                                    data = unityAdsLoadOptions5.getData();
                                                                    if (data != null || data.has("adMarkup")) {
                                                                        z16 = false;
                                                                    } else {
                                                                        z16 = z14;
                                                                    }
                                                                    if (z16) {
                                                                        androidHandleGatewayAdResponse4.adRepository.enqueueOpportunityForPlacement(str11, byteString3);
                                                                    }
                                                                }
                                                                return new LoadResult.Success(adObject6);
                                                            }
                                                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                                                            hVar = h.f63171b;
                                                            anonymousClass4 = androidHandleGatewayAdResponse4.new AnonymousClass4(loadEvent, byteString3, adResponse3, ref$ObjectRef3, null);
                                                            c38791.L$0 = androidHandleGatewayAdResponse4;
                                                            c38791.L$1 = byteString3;
                                                            c38791.L$2 = adResponse3;
                                                            c38791.L$3 = ref$ObjectRef3;
                                                            c38791.L$4 = adObject6;
                                                            c38791.L$5 = loadEvent;
                                                            c38791.L$6 = null;
                                                            c38791.label = 5;
                                                            if (nk.h.g(hVar, anonymousClass4, c38791) == objF) {
                                                                return objF;
                                                            }
                                                            loadEvent2 = loadEvent;
                                                            adObject7 = adObject6;
                                                            ref$ObjectRef = ref$ObjectRef3;
                                                            adResponse5 = adResponse3;
                                                            byteString5 = byteString3;
                                                            androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                                                            try {
                                                                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject7.isScarAd(), 4, null);
                                                            } catch (CancellationException e10) {
                                                                e = e10;
                                                                ByteString byteString6 = byteString5;
                                                                adResponse3 = adResponse5;
                                                                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse5;
                                                                byteString3 = byteString6;
                                                                hVar2 = h.f63171b;
                                                                anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(e, byteString3, adResponse3, ref$ObjectRef, null);
                                                                c38791.L$0 = e;
                                                                c38791.L$1 = null;
                                                                c38791.L$2 = null;
                                                                c38791.L$3 = null;
                                                                c38791.L$4 = null;
                                                                c38791.L$5 = null;
                                                                c38791.L$6 = null;
                                                                c38791.L$7 = null;
                                                                c38791.L$8 = null;
                                                                c38791.L$9 = null;
                                                                c38791.label = 6;
                                                                if (nk.h.g(hVar2, anonymousClass5, c38791) == objF) {
                                                                    return objF;
                                                                }
                                                                cancellationException = e;
                                                                cause = cancellationException.getCause();
                                                                if (cause == null) {
                                                                    throw cancellationException;
                                                                }
                                                                throw cause;
                                                            }
                                                        } catch (CancellationException e11) {
                                                            e = e11;
                                                            ref$ObjectRef = ref$ObjectRef3;
                                                            androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                                                            hVar2 = h.f63171b;
                                                            anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(e, byteString3, adResponse3, ref$ObjectRef, null);
                                                            c38791.L$0 = e;
                                                            c38791.L$1 = null;
                                                            c38791.L$2 = null;
                                                            c38791.L$3 = null;
                                                            c38791.L$4 = null;
                                                            c38791.L$5 = null;
                                                            c38791.L$6 = null;
                                                            c38791.L$7 = null;
                                                            c38791.L$8 = null;
                                                            c38791.L$9 = null;
                                                            c38791.label = 6;
                                                            if (nk.h.g(hVar2, anonymousClass5, c38791) == objF) {
                                                                return objF;
                                                            }
                                                            cancellationException = e;
                                                            cause = cancellationException.getCause();
                                                            if (cause == null) {
                                                                throw cancellationException;
                                                            }
                                                            throw cause;
                                                        }
                                                    } catch (CancellationException e12) {
                                                        e = e12;
                                                        objF = objF;
                                                    }
                                                } catch (CancellationException e13) {
                                                    e = e13;
                                                    objF = objF;
                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                                                    hVar2 = h.f63171b;
                                                    anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(e, byteString3, adResponse3, ref$ObjectRef, null);
                                                    c38791.L$0 = e;
                                                    c38791.L$1 = null;
                                                    c38791.L$2 = null;
                                                    c38791.L$3 = null;
                                                    c38791.L$4 = null;
                                                    c38791.L$5 = null;
                                                    c38791.L$6 = null;
                                                    c38791.L$7 = null;
                                                    c38791.L$8 = null;
                                                    c38791.L$9 = null;
                                                    c38791.label = 6;
                                                    if (nk.h.g(hVar2, anonymousClass5, c38791) == objF) {
                                                        return objF;
                                                    }
                                                    cancellationException = e;
                                                    cause = cancellationException.getCause();
                                                    if (cause == null) {
                                                        throw cancellationException;
                                                    }
                                                    throw cause;
                                                }
                                            } catch (CancellationException e14) {
                                                e = e14;
                                                objF = objF;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th2 = th;
                                            str5 = str4;
                                            Result.a aVar2 = Result.Companion;
                                            Object objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th2));
                                            androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse2;
                                            unityAdsLoadOptions4 = unityAdsLoadOptions3;
                                            str7 = str3;
                                            str8 = str2;
                                            adObject5 = adObject3;
                                            str9 = str5;
                                            objM3458constructorimpl = objM3458constructorimpl2;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str4 = strEncodeToString;
                                    }
                                } catch (Throwable unused) {
                                    try {
                                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", null, "invalid_url", configUrl, false, 36, null);
                                    } catch (CancellationException e15) {
                                        e = e15;
                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                        hVar2 = h.f63171b;
                                        anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(e, byteString3, adResponse3, ref$ObjectRef, null);
                                        c38791.L$0 = e;
                                        c38791.L$1 = null;
                                        c38791.L$2 = null;
                                        c38791.L$3 = null;
                                        c38791.L$4 = null;
                                        c38791.L$5 = null;
                                        c38791.L$6 = null;
                                        c38791.L$7 = null;
                                        c38791.L$8 = null;
                                        c38791.L$9 = null;
                                        c38791.label = 6;
                                        if (nk.h.g(hVar2, anonymousClass5, c38791) == objF) {
                                            return objF;
                                        }
                                        cancellationException = e;
                                        cause = cancellationException.getCause();
                                        if (cause == null) {
                                            throw cancellationException;
                                        }
                                        throw cause;
                                    }
                                }
                            } catch (CancellationException e16) {
                                e = e16;
                                objF = objF;
                                androidHandleGatewayAdResponse = this;
                                ref$ObjectRef = ref$ObjectRef4;
                                byteString3 = byteString2;
                                adResponse3 = adResponse2;
                            }
                        } catch (CancellationException e17) {
                            e = e17;
                            adResponse2 = adResponse;
                        }
                    } catch (CancellationException e18) {
                        e = e18;
                        byteString3 = byteString;
                        adResponse3 = adResponse;
                        androidHandleGatewayAdResponse = this;
                        objF = objF;
                        ref$ObjectRef = ref$ObjectRef4;
                    }
                } catch (CancellationException e19) {
                    e = e19;
                    byteString2 = byteString;
                }
                adResponse2 = adResponse;
                objF = objF;
                androidHandleGatewayAdResponse = this;
                ref$ObjectRef = ref$ObjectRef4;
                byteString3 = byteString2;
                adResponse3 = adResponse2;
                hVar2 = h.f63171b;
                anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(e, byteString3, adResponse3, ref$ObjectRef, null);
                c38791.L$0 = e;
                c38791.L$1 = null;
                c38791.L$2 = null;
                c38791.L$3 = null;
                c38791.L$4 = null;
                c38791.L$5 = null;
                c38791.L$6 = null;
                c38791.L$7 = null;
                c38791.L$8 = null;
                c38791.L$9 = null;
                c38791.label = 6;
                if (nk.h.g(hVar2, anonymousClass5, c38791) == objF) {
                    return objF;
                }
                cancellationException = e;
                cause = cancellationException.getCause();
                if (cause == null) {
                    throw cancellationException;
                }
                throw cause;
            case 1:
                z11 = c38791.Z$0;
                ref$ObjectRef = (Ref$ObjectRef) c38791.L$6;
                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) c38791.L$5;
                String str13 = (String) c38791.L$4;
                adResponse3 = (AdResponseOuterClass.AdResponse) c38791.L$3;
                byteString3 = (ByteString) c38791.L$2;
                unityAdsLoadOptions2 = (UnityAdsLoadOptions) c38791.L$1;
                androidHandleGatewayAdResponse2 = (AndroidHandleGatewayAdResponse) c38791.L$0;
                try {
                    kotlin.c.b(objInvoke);
                    diagnosticAdType2 = diagnosticAdType4;
                    str2 = str13;
                    webViewConfiguration = (WebViewConfiguration) objInvoke;
                    ByteString trackingToken2 = adResponse3.getTrackingToken();
                    p.i(trackingToken2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                    if (z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    adObject = new AdObject(byteString3, str2, trackingToken2, false, null, null, null, false, null, null, null, unityAdsLoadOptions2, z12, diagnosticAdType2, null, null, 51192, null);
                    cacheWebViewAssets = androidHandleGatewayAdResponse2.cacheWebViewAssets;
                    c38791.L$0 = androidHandleGatewayAdResponse2;
                    c38791.L$1 = unityAdsLoadOptions2;
                    c38791.L$2 = byteString3;
                    c38791.L$3 = adResponse3;
                    c38791.L$4 = str2;
                    c38791.L$5 = diagnosticAdType2;
                    c38791.L$6 = ref$ObjectRef;
                    c38791.L$7 = webViewConfiguration;
                    c38791.L$8 = adObject;
                    c38791.label = 2;
                    if (cacheWebViewAssets.invoke(webViewConfiguration, c38791) == objF) {
                        return objF;
                    }
                    adObject2 = adObject;
                    unityAdsLoadOptions3 = unityAdsLoadOptions2;
                    diagnosticAdType3 = diagnosticAdType2;
                    if (webViewConfiguration.getEntryPoint().length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", null, "no_webview_entry_point", null, false, 52, null);
                    }
                    configUrl = SdkProperties.getConfigUrl();
                    p.i(configUrl, "it");
                    if (!x.D(configUrl, ".html", false, 2, null)) {
                        configUrl = null;
                    }
                    if (configUrl == null) {
                        configUrl = webViewConfiguration.getEntryPoint();
                    }
                    URI uri2 = new URI(configUrl);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("?platform=android&mode=ad-viewer&webviewType=");
                    sb3.append(webViewConfiguration.getType());
                    sb3.append('&');
                    query = uri2.getQuery();
                    if (query == null) {
                        query = "";
                    }
                    sb3.append(query);
                    str3 = a0.i1(configUrl, "?", null, 2, null) + sb3.toString();
                    strEncodeToString = Base64.encodeToString(adResponse3.getImpressionConfiguration().toByteArray(), 2);
                    adObject3 = adObject2;
                    jB = j.f64572a.b();
                    Result.a aVar3 = Result.Companion;
                    AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase2 = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                    AdPlayerScope adPlayerScope2 = androidHandleGatewayAdResponse2.adPlayerScope;
                    c38791.L$0 = androidHandleGatewayAdResponse2;
                    c38791.L$1 = unityAdsLoadOptions3;
                    c38791.L$2 = byteString3;
                    c38791.L$3 = adResponse3;
                    c38791.L$4 = str2;
                    c38791.L$5 = diagnosticAdType3;
                    c38791.L$6 = ref$ObjectRef;
                    c38791.L$7 = adObject3;
                    c38791.L$8 = str3;
                    c38791.L$9 = strEncodeToString;
                    c38791.J$0 = jB;
                    str4 = strEncodeToString;
                    c38791.label = 3;
                    objInvoke = androidGetWebViewContainerUseCase2.invoke(adPlayerScope2, c38791);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    adResponse4 = adResponse3;
                    adObject4 = adObject3;
                    androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse2;
                    byteString4 = byteString3;
                    ref$ObjectRef2 = ref$ObjectRef;
                    str6 = str4;
                    objM3458constructorimpl = Result.m3458constructorimpl((AndroidWebViewContainer) objInvoke);
                    str9 = str6;
                    ref$ObjectRef = ref$ObjectRef2;
                    byteString3 = byteString4;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    str7 = str3;
                    str8 = str2;
                    adObject5 = adObject4;
                    adResponse3 = adResponse4;
                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse3;
                    UnityAdsLoadOptions unityAdsLoadOptions7 = unityAdsLoadOptions4;
                    l lVar2 = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(jB), null);
                    objM3466unboximpl = ((Result) lVar2.a()).m3466unboximpl();
                    long jB4 = lVar2.b();
                    SendDiagnosticEvent sendDiagnosticEvent2 = androidHandleGatewayAdResponse4.sendDiagnosticEvent;
                    if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                        str10 = "native_webview_success_time";
                    } else {
                        str10 = "native_webview_failure_time";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, str10, tj.a.b(b.G(jB4, DurationUnit.MILLISECONDS)), null, null, adObject5, null, 44, null);
                    Object objM3466unboximpl3 = ((Result) lVar2.c()).m3466unboximpl();
                    kotlin.c.b(objM3466unboximpl3);
                    AndroidWebViewContainer androidWebViewContainer2 = (AndroidWebViewContainer) objM3466unboximpl3;
                    WebViewBridge webViewBridgeInvoke2 = androidHandleGatewayAdResponse4.getWebViewBridge.invoke(androidWebViewContainer2, androidHandleGatewayAdResponse4.adPlayerScope);
                    ?? Invoke2 = androidHandleGatewayAdResponse4.getAdPlayer.invoke(webViewBridgeInvoke2, androidWebViewContainer2, byteString3, diagnosticAdType3);
                    ref$ObjectRef.element = Invoke2;
                    AdObject adObject9 = adObject5;
                    adObjectCopy = adObject9.copy((65023 & 1) != 0 ? adObject9.opportunityId : null, (65023 & 2) != 0 ? adObject9.placementId : null, (65023 & 4) != 0 ? adObject9.trackingToken : null, (65023 & 8) != 0 ? adObject9.isScarAd : false, (65023 & 16) != 0 ? adObject9.scarQueryId : null, (65023 & 32) != 0 ? adObject9.scarAdUnitId : null, (65023 & 64) != 0 ? adObject9.scarAdString : null, (65023 & 128) != 0 ? adObject9.isOfferwallAd : false, (65023 & 256) != 0 ? adObject9.offerwallPlacementName : null, (65023 & 512) != 0 ? adObject9.adPlayer : (AdPlayer) Invoke2, (65023 & 1024) != 0 ? adObject9.playerServerId : null, (65023 & 2048) != 0 ? adObject9.loadOptions : null, (65023 & 4096) != 0 ? adObject9.isHeaderBidding : false, (65023 & 8192) != 0 ? adObject9.adType : null, (65023 & 16384) != 0 ? adObject9.ttl : null, (65023 & 32768) != 0 ? adObject9.state : null);
                    e.x(e.A(androidHandleGatewayAdResponse4.deviceInfoRepository.getAllowedPii(), new AnonymousClass2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                    jB2 = j.f64572a.b();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObjectCopy, null, 46, null);
                    HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = androidHandleGatewayAdResponse4.getHandleInvocationsFromAdViewer;
                    qk.p<Invocation> onInvocation2 = webViewBridgeInvoke2.getOnInvocation();
                    ByteString adData2 = adResponse3.getAdData();
                    p.i(adData2, "response.adData");
                    String base64$default3 = ProtobufExtensionsKt.toBase64$default(adData2, false, 1, null);
                    ByteString adDataRefreshToken2 = adResponse3.getAdDataRefreshToken();
                    p.i(adDataRefreshToken2, "response.adDataRefreshToken");
                    String base64$default4 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2, false, 1, null);
                    p.i(str9, "base64ImpressionConfiguration");
                    z14 = true;
                    unityAdsLoadOptions5 = unityAdsLoadOptions7;
                    String str14 = str8;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                    e.x(handleInvocationsFromAdViewer2.invoke(onInvocation2, base64$default3, base64$default4, str9, adObjectCopy, androidHandleGatewayAdResponse4.new AnonymousClass3(androidWebViewContainer2, str7, adObject5, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                    qk.c<LoadEvent> onLoadEvent2 = ((AdPlayer) ref$ObjectRef.element).getOnLoadEvent();
                    c38791.L$0 = androidHandleGatewayAdResponse;
                    c38791.L$1 = unityAdsLoadOptions5;
                    c38791.L$2 = byteString3;
                    c38791.L$3 = adResponse3;
                    str11 = str14;
                    c38791.L$4 = str11;
                    c38791.L$5 = ref$ObjectRef;
                    c38791.L$6 = adObjectCopy;
                    c38791.L$7 = null;
                    c38791.L$8 = null;
                    c38791.L$9 = null;
                    c38791.J$0 = jB2;
                    c38791.label = 4;
                    objInvoke = e.F(onLoadEvent2, c38791);
                    objF = objF;
                    if (objInvoke == objF) {
                        return objF;
                    }
                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse;
                    ref$ObjectRef3 = ref$ObjectRef;
                    adObject6 = adObjectCopy;
                    j10 = jB2;
                    loadEvent = (LoadEvent) objInvoke;
                    if (!(loadEvent instanceof LoadEvent.Error)) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                        androidHandleGatewayAdResponse4.campaignRepository.setLoadTimestamp(byteString3);
                        androidHandleGatewayAdResponse4.adRepository.addAd(byteString3, adObject6);
                        objectId = unityAdsLoadOptions5.getObjectId();
                        if (objectId != null) {
                            z15 = z14;
                        } else {
                            z15 = z14;
                        }
                        if (z15) {
                            data = unityAdsLoadOptions5.getData();
                            if (data != null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                androidHandleGatewayAdResponse4.adRepository.enqueueOpportunityForPlacement(str11, byteString3);
                            }
                        }
                        return new LoadResult.Success(adObject6);
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                    hVar = h.f63171b;
                    anonymousClass4 = androidHandleGatewayAdResponse4.new AnonymousClass4(loadEvent, byteString3, adResponse3, ref$ObjectRef3, null);
                    c38791.L$0 = androidHandleGatewayAdResponse4;
                    c38791.L$1 = byteString3;
                    c38791.L$2 = adResponse3;
                    c38791.L$3 = ref$ObjectRef3;
                    c38791.L$4 = adObject6;
                    c38791.L$5 = loadEvent;
                    c38791.L$6 = null;
                    c38791.label = 5;
                    if (nk.h.g(hVar, anonymousClass4, c38791) == objF) {
                        return objF;
                    }
                    loadEvent2 = loadEvent;
                    adObject7 = adObject6;
                    ref$ObjectRef = ref$ObjectRef3;
                    adResponse5 = adResponse3;
                    byteString5 = byteString3;
                    androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject7.isScarAd(), 4, null);
                } catch (CancellationException e20) {
                    e = e20;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                    hVar2 = h.f63171b;
                    anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(e, byteString3, adResponse3, ref$ObjectRef, null);
                    c38791.L$0 = e;
                    c38791.L$1 = null;
                    c38791.L$2 = null;
                    c38791.L$3 = null;
                    c38791.L$4 = null;
                    c38791.L$5 = null;
                    c38791.L$6 = null;
                    c38791.L$7 = null;
                    c38791.L$8 = null;
                    c38791.L$9 = null;
                    c38791.label = 6;
                    if (nk.h.g(hVar2, anonymousClass5, c38791) == objF) {
                        return objF;
                    }
                    cancellationException = e;
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                }
            case 2:
                adObject2 = (AdObject) c38791.L$8;
                webViewConfiguration = (WebViewConfiguration) c38791.L$7;
                ref$ObjectRef = (Ref$ObjectRef) c38791.L$6;
                DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) c38791.L$5;
                String str15 = (String) c38791.L$4;
                AdResponseOuterClass.AdResponse adResponse6 = (AdResponseOuterClass.AdResponse) c38791.L$3;
                ByteString byteString7 = (ByteString) c38791.L$2;
                UnityAdsLoadOptions unityAdsLoadOptions8 = (UnityAdsLoadOptions) c38791.L$1;
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse6 = (AndroidHandleGatewayAdResponse) c38791.L$0;
                try {
                    kotlin.c.b(objInvoke);
                    diagnosticAdType3 = diagnosticAdType5;
                    str2 = str15;
                    adResponse3 = adResponse6;
                    byteString3 = byteString7;
                    unityAdsLoadOptions3 = unityAdsLoadOptions8;
                    androidHandleGatewayAdResponse2 = androidHandleGatewayAdResponse6;
                    if (webViewConfiguration.getEntryPoint().length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "[UnityAds] Internal communication failure", null, "no_webview_entry_point", null, false, 52, null);
                    }
                    configUrl = SdkProperties.getConfigUrl();
                    p.i(configUrl, "it");
                    if (!x.D(configUrl, ".html", false, 2, null)) {
                        configUrl = null;
                    }
                    if (configUrl == null) {
                        configUrl = webViewConfiguration.getEntryPoint();
                    }
                    URI uri3 = new URI(configUrl);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("?platform=android&mode=ad-viewer&webviewType=");
                    sb4.append(webViewConfiguration.getType());
                    sb4.append('&');
                    query = uri3.getQuery();
                    if (query == null) {
                        query = "";
                    }
                    sb4.append(query);
                    str3 = a0.i1(configUrl, "?", null, 2, null) + sb4.toString();
                    strEncodeToString = Base64.encodeToString(adResponse3.getImpressionConfiguration().toByteArray(), 2);
                    adObject3 = adObject2;
                    jB = j.f64572a.b();
                    Result.a aVar4 = Result.Companion;
                    AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase3 = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                    AdPlayerScope adPlayerScope3 = androidHandleGatewayAdResponse2.adPlayerScope;
                    c38791.L$0 = androidHandleGatewayAdResponse2;
                    c38791.L$1 = unityAdsLoadOptions3;
                    c38791.L$2 = byteString3;
                    c38791.L$3 = adResponse3;
                    c38791.L$4 = str2;
                    c38791.L$5 = diagnosticAdType3;
                    c38791.L$6 = ref$ObjectRef;
                    c38791.L$7 = adObject3;
                    c38791.L$8 = str3;
                    c38791.L$9 = strEncodeToString;
                    c38791.J$0 = jB;
                    str4 = strEncodeToString;
                    c38791.label = 3;
                    objInvoke = androidGetWebViewContainerUseCase3.invoke(adPlayerScope3, c38791);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    adResponse4 = adResponse3;
                    adObject4 = adObject3;
                    androidHandleGatewayAdResponse3 = androidHandleGatewayAdResponse2;
                    byteString4 = byteString3;
                    ref$ObjectRef2 = ref$ObjectRef;
                    str6 = str4;
                    objM3458constructorimpl = Result.m3458constructorimpl((AndroidWebViewContainer) objInvoke);
                    str9 = str6;
                    ref$ObjectRef = ref$ObjectRef2;
                    byteString3 = byteString4;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    str7 = str3;
                    str8 = str2;
                    adObject5 = adObject4;
                    adResponse3 = adResponse4;
                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse3;
                    UnityAdsLoadOptions unityAdsLoadOptions9 = unityAdsLoadOptions4;
                    l lVar3 = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(jB), null);
                    objM3466unboximpl = ((Result) lVar3.a()).m3466unboximpl();
                    long jB5 = lVar3.b();
                    SendDiagnosticEvent sendDiagnosticEvent3 = androidHandleGatewayAdResponse4.sendDiagnosticEvent;
                    if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                        str10 = "native_webview_success_time";
                    } else {
                        str10 = "native_webview_failure_time";
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, str10, tj.a.b(b.G(jB5, DurationUnit.MILLISECONDS)), null, null, adObject5, null, 44, null);
                    Object objM3466unboximpl4 = ((Result) lVar3.c()).m3466unboximpl();
                    kotlin.c.b(objM3466unboximpl4);
                    AndroidWebViewContainer androidWebViewContainer3 = (AndroidWebViewContainer) objM3466unboximpl4;
                    WebViewBridge webViewBridgeInvoke3 = androidHandleGatewayAdResponse4.getWebViewBridge.invoke(androidWebViewContainer3, androidHandleGatewayAdResponse4.adPlayerScope);
                    ?? Invoke3 = androidHandleGatewayAdResponse4.getAdPlayer.invoke(webViewBridgeInvoke3, androidWebViewContainer3, byteString3, diagnosticAdType3);
                    ref$ObjectRef.element = Invoke3;
                    AdObject adObject10 = adObject5;
                    adObjectCopy = adObject10.copy((65023 & 1) != 0 ? adObject10.opportunityId : null, (65023 & 2) != 0 ? adObject10.placementId : null, (65023 & 4) != 0 ? adObject10.trackingToken : null, (65023 & 8) != 0 ? adObject10.isScarAd : false, (65023 & 16) != 0 ? adObject10.scarQueryId : null, (65023 & 32) != 0 ? adObject10.scarAdUnitId : null, (65023 & 64) != 0 ? adObject10.scarAdString : null, (65023 & 128) != 0 ? adObject10.isOfferwallAd : false, (65023 & 256) != 0 ? adObject10.offerwallPlacementName : null, (65023 & 512) != 0 ? adObject10.adPlayer : (AdPlayer) Invoke3, (65023 & 1024) != 0 ? adObject10.playerServerId : null, (65023 & 2048) != 0 ? adObject10.loadOptions : null, (65023 & 4096) != 0 ? adObject10.isHeaderBidding : false, (65023 & 8192) != 0 ? adObject10.adType : null, (65023 & 16384) != 0 ? adObject10.ttl : null, (65023 & 32768) != 0 ? adObject10.state : null);
                    e.x(e.A(androidHandleGatewayAdResponse4.deviceInfoRepository.getAllowedPii(), new AnonymousClass2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                    jB2 = j.f64572a.b();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObjectCopy, null, 46, null);
                    HandleInvocationsFromAdViewer handleInvocationsFromAdViewer3 = androidHandleGatewayAdResponse4.getHandleInvocationsFromAdViewer;
                    qk.p<Invocation> onInvocation3 = webViewBridgeInvoke3.getOnInvocation();
                    ByteString adData3 = adResponse3.getAdData();
                    p.i(adData3, "response.adData");
                    String base64$default5 = ProtobufExtensionsKt.toBase64$default(adData3, false, 1, null);
                    ByteString adDataRefreshToken3 = adResponse3.getAdDataRefreshToken();
                    p.i(adDataRefreshToken3, "response.adDataRefreshToken");
                    String base64$default6 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken3, false, 1, null);
                    p.i(str9, "base64ImpressionConfiguration");
                    z14 = true;
                    unityAdsLoadOptions5 = unityAdsLoadOptions9;
                    String str16 = str8;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                    e.x(handleInvocationsFromAdViewer3.invoke(onInvocation3, base64$default5, base64$default6, str9, adObjectCopy, androidHandleGatewayAdResponse4.new AnonymousClass3(androidWebViewContainer3, str7, adObject5, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                    qk.c<LoadEvent> onLoadEvent3 = ((AdPlayer) ref$ObjectRef.element).getOnLoadEvent();
                    c38791.L$0 = androidHandleGatewayAdResponse;
                    c38791.L$1 = unityAdsLoadOptions5;
                    c38791.L$2 = byteString3;
                    c38791.L$3 = adResponse3;
                    str11 = str16;
                    c38791.L$4 = str11;
                    c38791.L$5 = ref$ObjectRef;
                    c38791.L$6 = adObjectCopy;
                    c38791.L$7 = null;
                    c38791.L$8 = null;
                    c38791.L$9 = null;
                    c38791.J$0 = jB2;
                    c38791.label = 4;
                    objInvoke = e.F(onLoadEvent3, c38791);
                    objF = objF;
                    if (objInvoke == objF) {
                        return objF;
                    }
                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse;
                    ref$ObjectRef3 = ref$ObjectRef;
                    adObject6 = adObjectCopy;
                    j10 = jB2;
                    loadEvent = (LoadEvent) objInvoke;
                    if (!(loadEvent instanceof LoadEvent.Error)) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                        androidHandleGatewayAdResponse4.campaignRepository.setLoadTimestamp(byteString3);
                        androidHandleGatewayAdResponse4.adRepository.addAd(byteString3, adObject6);
                        objectId = unityAdsLoadOptions5.getObjectId();
                        if (objectId != null) {
                            z15 = z14;
                        } else {
                            z15 = z14;
                        }
                        if (z15) {
                            data = unityAdsLoadOptions5.getData();
                            if (data != null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                androidHandleGatewayAdResponse4.adRepository.enqueueOpportunityForPlacement(str11, byteString3);
                            }
                        }
                        return new LoadResult.Success(adObject6);
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                    hVar = h.f63171b;
                    anonymousClass4 = androidHandleGatewayAdResponse4.new AnonymousClass4(loadEvent, byteString3, adResponse3, ref$ObjectRef3, null);
                    c38791.L$0 = androidHandleGatewayAdResponse4;
                    c38791.L$1 = byteString3;
                    c38791.L$2 = adResponse3;
                    c38791.L$3 = ref$ObjectRef3;
                    c38791.L$4 = adObject6;
                    c38791.L$5 = loadEvent;
                    c38791.L$6 = null;
                    c38791.label = 5;
                    if (nk.h.g(hVar, anonymousClass4, c38791) == objF) {
                        return objF;
                    }
                    loadEvent2 = loadEvent;
                    adObject7 = adObject6;
                    ref$ObjectRef = ref$ObjectRef3;
                    adResponse5 = adResponse3;
                    byteString5 = byteString3;
                    androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject7.isScarAd(), 4, null);
                } catch (CancellationException e21) {
                    e = e21;
                    adResponse3 = adResponse6;
                    objF = objF;
                    byteString3 = byteString7;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse6;
                }
                break;
            case 3:
                jB = c38791.J$0;
                str6 = (String) c38791.L$9;
                str3 = (String) c38791.L$8;
                adObject4 = (AdObject) c38791.L$7;
                ref$ObjectRef2 = (Ref$ObjectRef) c38791.L$6;
                diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) c38791.L$5;
                str2 = (String) c38791.L$4;
                adResponse4 = (AdResponseOuterClass.AdResponse) c38791.L$3;
                byteString4 = (ByteString) c38791.L$2;
                unityAdsLoadOptions3 = (UnityAdsLoadOptions) c38791.L$1;
                androidHandleGatewayAdResponse3 = (AndroidHandleGatewayAdResponse) c38791.L$0;
                try {
                    kotlin.c.b(objInvoke);
                    objM3458constructorimpl = Result.m3458constructorimpl((AndroidWebViewContainer) objInvoke);
                    str9 = str6;
                    ref$ObjectRef = ref$ObjectRef2;
                    byteString3 = byteString4;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    str7 = str3;
                    str8 = str2;
                    adObject5 = adObject4;
                    adResponse3 = adResponse4;
                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse3;
                } catch (Throwable th5) {
                    th2 = th5;
                    str5 = str6;
                    ref$ObjectRef = ref$ObjectRef2;
                    byteString3 = byteString4;
                    androidHandleGatewayAdResponse2 = androidHandleGatewayAdResponse3;
                    adObject3 = adObject4;
                    adResponse3 = adResponse4;
                    Result.a aVar5 = Result.Companion;
                    Object objM3458constructorimpl3 = Result.m3458constructorimpl(kotlin.c.a(th2));
                    androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse2;
                    unityAdsLoadOptions4 = unityAdsLoadOptions3;
                    str7 = str3;
                    str8 = str2;
                    adObject5 = adObject3;
                    str9 = str5;
                    objM3458constructorimpl = objM3458constructorimpl3;
                }
                UnityAdsLoadOptions unityAdsLoadOptions10 = unityAdsLoadOptions4;
                l lVar4 = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(jB), null);
                objM3466unboximpl = ((Result) lVar4.a()).m3466unboximpl();
                long jB6 = lVar4.b();
                SendDiagnosticEvent sendDiagnosticEvent4 = androidHandleGatewayAdResponse4.sendDiagnosticEvent;
                if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                    str10 = "native_webview_success_time";
                } else {
                    str10 = "native_webview_failure_time";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, str10, tj.a.b(b.G(jB6, DurationUnit.MILLISECONDS)), null, null, adObject5, null, 44, null);
                Object objM3466unboximpl5 = ((Result) lVar4.c()).m3466unboximpl();
                kotlin.c.b(objM3466unboximpl5);
                AndroidWebViewContainer androidWebViewContainer4 = (AndroidWebViewContainer) objM3466unboximpl5;
                WebViewBridge webViewBridgeInvoke4 = androidHandleGatewayAdResponse4.getWebViewBridge.invoke(androidWebViewContainer4, androidHandleGatewayAdResponse4.adPlayerScope);
                ?? Invoke4 = androidHandleGatewayAdResponse4.getAdPlayer.invoke(webViewBridgeInvoke4, androidWebViewContainer4, byteString3, diagnosticAdType3);
                ref$ObjectRef.element = Invoke4;
                AdObject adObject11 = adObject5;
                adObjectCopy = adObject11.copy((65023 & 1) != 0 ? adObject11.opportunityId : null, (65023 & 2) != 0 ? adObject11.placementId : null, (65023 & 4) != 0 ? adObject11.trackingToken : null, (65023 & 8) != 0 ? adObject11.isScarAd : false, (65023 & 16) != 0 ? adObject11.scarQueryId : null, (65023 & 32) != 0 ? adObject11.scarAdUnitId : null, (65023 & 64) != 0 ? adObject11.scarAdString : null, (65023 & 128) != 0 ? adObject11.isOfferwallAd : false, (65023 & 256) != 0 ? adObject11.offerwallPlacementName : null, (65023 & 512) != 0 ? adObject11.adPlayer : (AdPlayer) Invoke4, (65023 & 1024) != 0 ? adObject11.playerServerId : null, (65023 & 2048) != 0 ? adObject11.loadOptions : null, (65023 & 4096) != 0 ? adObject11.isHeaderBidding : false, (65023 & 8192) != 0 ? adObject11.adType : null, (65023 & 16384) != 0 ? adObject11.ttl : null, (65023 & 32768) != 0 ? adObject11.state : null);
                e.x(e.A(androidHandleGatewayAdResponse4.deviceInfoRepository.getAllowedPii(), new AnonymousClass2(ref$ObjectRef, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                jB2 = j.f64572a.b();
                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObjectCopy, null, 46, null);
                HandleInvocationsFromAdViewer handleInvocationsFromAdViewer4 = androidHandleGatewayAdResponse4.getHandleInvocationsFromAdViewer;
                qk.p<Invocation> onInvocation4 = webViewBridgeInvoke4.getOnInvocation();
                ByteString adData4 = adResponse3.getAdData();
                p.i(adData4, "response.adData");
                String base64$default7 = ProtobufExtensionsKt.toBase64$default(adData4, false, 1, null);
                ByteString adDataRefreshToken4 = adResponse3.getAdDataRefreshToken();
                p.i(adDataRefreshToken4, "response.adDataRefreshToken");
                String base64$default8 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken4, false, 1, null);
                p.i(str9, "base64ImpressionConfiguration");
                z14 = true;
                unityAdsLoadOptions5 = unityAdsLoadOptions10;
                String str17 = str8;
                androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                e.x(handleInvocationsFromAdViewer4.invoke(onInvocation4, base64$default7, base64$default8, str9, adObjectCopy, androidHandleGatewayAdResponse4.new AnonymousClass3(androidWebViewContainer4, str7, adObject5, null)), ((AdPlayer) ref$ObjectRef.element).getScope());
                qk.c<LoadEvent> onLoadEvent4 = ((AdPlayer) ref$ObjectRef.element).getOnLoadEvent();
                c38791.L$0 = androidHandleGatewayAdResponse;
                c38791.L$1 = unityAdsLoadOptions5;
                c38791.L$2 = byteString3;
                c38791.L$3 = adResponse3;
                str11 = str17;
                c38791.L$4 = str11;
                c38791.L$5 = ref$ObjectRef;
                c38791.L$6 = adObjectCopy;
                c38791.L$7 = null;
                c38791.L$8 = null;
                c38791.L$9 = null;
                c38791.J$0 = jB2;
                c38791.label = 4;
                objInvoke = e.F(onLoadEvent4, c38791);
                objF = objF;
                if (objInvoke == objF) {
                    return objF;
                }
                androidHandleGatewayAdResponse4 = androidHandleGatewayAdResponse;
                ref$ObjectRef3 = ref$ObjectRef;
                adObject6 = adObjectCopy;
                j10 = jB2;
                loadEvent = (LoadEvent) objInvoke;
                if (!(loadEvent instanceof LoadEvent.Error)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                    androidHandleGatewayAdResponse4.campaignRepository.setLoadTimestamp(byteString3);
                    androidHandleGatewayAdResponse4.adRepository.addAd(byteString3, adObject6);
                    objectId = unityAdsLoadOptions5.getObjectId();
                    if (objectId != null) {
                        z15 = z14;
                    } else {
                        z15 = z14;
                    }
                    if (z15) {
                        data = unityAdsLoadOptions5.getData();
                        if (data != null) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (z16) {
                            androidHandleGatewayAdResponse4.adRepository.enqueueOpportunityForPlacement(str11, byteString3);
                        }
                    }
                    return new LoadResult.Success(adObject6);
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                hVar = h.f63171b;
                anonymousClass4 = androidHandleGatewayAdResponse4.new AnonymousClass4(loadEvent, byteString3, adResponse3, ref$ObjectRef3, null);
                c38791.L$0 = androidHandleGatewayAdResponse4;
                c38791.L$1 = byteString3;
                c38791.L$2 = adResponse3;
                c38791.L$3 = ref$ObjectRef3;
                c38791.L$4 = adObject6;
                c38791.L$5 = loadEvent;
                c38791.L$6 = null;
                c38791.label = 5;
                if (nk.h.g(hVar, anonymousClass4, c38791) == objF) {
                    return objF;
                }
                loadEvent2 = loadEvent;
                adObject7 = adObject6;
                ref$ObjectRef = ref$ObjectRef3;
                adResponse5 = adResponse3;
                byteString5 = byteString3;
                androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject7.isScarAd(), 4, null);
            case 4:
                j10 = c38791.J$0;
                adObject6 = (AdObject) c38791.L$6;
                ref$ObjectRef3 = (Ref$ObjectRef) c38791.L$5;
                String str18 = (String) c38791.L$4;
                AdResponseOuterClass.AdResponse adResponse7 = (AdResponseOuterClass.AdResponse) c38791.L$3;
                ByteString byteString8 = (ByteString) c38791.L$2;
                UnityAdsLoadOptions unityAdsLoadOptions11 = (UnityAdsLoadOptions) c38791.L$1;
                androidHandleGatewayAdResponse4 = (AndroidHandleGatewayAdResponse) c38791.L$0;
                try {
                    kotlin.c.b(objInvoke);
                    objF = objF;
                    unityAdsLoadOptions5 = unityAdsLoadOptions11;
                    z14 = true;
                    str11 = str18;
                    adResponse3 = adResponse7;
                    byteString3 = byteString8;
                    loadEvent = (LoadEvent) objInvoke;
                    if (!(loadEvent instanceof LoadEvent.Error)) {
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                        androidHandleGatewayAdResponse4.campaignRepository.setLoadTimestamp(byteString3);
                        androidHandleGatewayAdResponse4.adRepository.addAd(byteString3, adObject6);
                        objectId = unityAdsLoadOptions5.getObjectId();
                        if (objectId != null) {
                            z15 = z14;
                        } else {
                            z15 = z14;
                        }
                        if (z15) {
                            data = unityAdsLoadOptions5.getData();
                            if (data != null) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z16) {
                                androidHandleGatewayAdResponse4.adRepository.enqueueOpportunityForPlacement(str11, byteString3);
                            }
                        }
                        return new LoadResult.Success(adObject6);
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse4.sendDiagnosticEvent, "native_create_ad_object_failure_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, adObject6, null, 44, null);
                    hVar = h.f63171b;
                    anonymousClass4 = androidHandleGatewayAdResponse4.new AnonymousClass4(loadEvent, byteString3, adResponse3, ref$ObjectRef3, null);
                    c38791.L$0 = androidHandleGatewayAdResponse4;
                    c38791.L$1 = byteString3;
                    c38791.L$2 = adResponse3;
                    c38791.L$3 = ref$ObjectRef3;
                    c38791.L$4 = adObject6;
                    c38791.L$5 = loadEvent;
                    c38791.L$6 = null;
                    c38791.label = 5;
                    if (nk.h.g(hVar, anonymousClass4, c38791) == objF) {
                        return objF;
                    }
                    loadEvent2 = loadEvent;
                    adObject7 = adObject6;
                    ref$ObjectRef = ref$ObjectRef3;
                    adResponse5 = adResponse3;
                    byteString5 = byteString3;
                    androidHandleGatewayAdResponse5 = androidHandleGatewayAdResponse4;
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject7.isScarAd(), 4, null);
                } catch (CancellationException e22) {
                    e = e22;
                    ref$ObjectRef = ref$ObjectRef3;
                    adResponse3 = adResponse7;
                    objF = objF;
                    byteString3 = byteString8;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                    hVar2 = h.f63171b;
                    anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(e, byteString3, adResponse3, ref$ObjectRef, null);
                    c38791.L$0 = e;
                    c38791.L$1 = null;
                    c38791.L$2 = null;
                    c38791.L$3 = null;
                    c38791.L$4 = null;
                    c38791.L$5 = null;
                    c38791.L$6 = null;
                    c38791.L$7 = null;
                    c38791.L$8 = null;
                    c38791.L$9 = null;
                    c38791.label = 6;
                    if (nk.h.g(hVar2, anonymousClass5, c38791) == objF) {
                        return objF;
                    }
                    cancellationException = e;
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                }
            case 5:
                loadEvent2 = (LoadEvent) c38791.L$5;
                adObject7 = (AdObject) c38791.L$4;
                ref$ObjectRef = (Ref$ObjectRef) c38791.L$3;
                adResponse5 = (AdResponseOuterClass.AdResponse) c38791.L$2;
                byteString5 = (ByteString) c38791.L$1;
                androidHandleGatewayAdResponse5 = (AndroidHandleGatewayAdResponse) c38791.L$0;
                try {
                    kotlin.c.b(objInvoke);
                    objF = objF;
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject7.isScarAd(), 4, null);
                } catch (CancellationException e23) {
                    e = e23;
                    objF = objF;
                    ByteString byteString9 = byteString5;
                    adResponse3 = adResponse5;
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse5;
                    byteString3 = byteString9;
                    hVar2 = h.f63171b;
                    anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(e, byteString3, adResponse3, ref$ObjectRef, null);
                    c38791.L$0 = e;
                    c38791.L$1 = null;
                    c38791.L$2 = null;
                    c38791.L$3 = null;
                    c38791.L$4 = null;
                    c38791.L$5 = null;
                    c38791.L$6 = null;
                    c38791.L$7 = null;
                    c38791.L$8 = null;
                    c38791.L$9 = null;
                    c38791.label = 6;
                    if (nk.h.g(hVar2, anonymousClass5, c38791) == objF) {
                        return objF;
                    }
                    cancellationException = e;
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                }
            case 6:
                cancellationException = (CancellationException) c38791.L$0;
                kotlin.c.b(objInvoke);
                cause = cancellationException.getCause();
                if (cause == null) {
                    throw cancellationException;
                }
                throw cause;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {161}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements bk.p<AllowedPiiOuterClass.AllowedPii, c<? super r>, Object> {
        public final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref$ObjectRef<AdPlayer> ref$ObjectRef, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$adPlayer = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$adPlayer, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(AllowedPiiOuterClass.AllowedPii allowedPii, c<? super r> cVar) {
            return ((AnonymousClass2) create(allowedPii, cVar)).invokeSuspend(r.f64562a);
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
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                AdPlayer adPlayer = this.$adPlayer.element;
                byte[] byteArray = allowedPii.toByteArray();
                p.i(byteArray, "it.toByteArray()");
                this.label = 1;
                if (adPlayer.onAllowedPiiChange(byteArray, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements bk.l<c<? super r>, Object> {
        public final /* synthetic */ AdObject $tmpAdObject;
        public final /* synthetic */ String $webViewUrl;
        public final /* synthetic */ AndroidWebViewContainer $webviewContainer;
        public long J$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AndroidWebViewContainer androidWebViewContainer, String str, AdObject adObject, c<? super AnonymousClass3> cVar) {
            super(1, cVar);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
            this.$tmpAdObject = adObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(c<?> cVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass3(this.$webviewContainer, this.$webViewUrl, this.$tmpAdObject, cVar);
        }

        @Override // bk.l
        public final Object invoke(c<? super r> cVar) {
            return ((AnonymousClass3) create(cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j10;
            Object objM3458constructorimpl;
            String str;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    j10 = this.J$0;
                    try {
                        kotlin.c.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.a aVar = Result.Companion;
                        objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
                String str2 = this.$webViewUrl;
                long jB = j.f64572a.b();
                try {
                    Result.a aVar2 = Result.Companion;
                    this.J$0 = jB;
                    this.label = 1;
                    if (androidWebViewContainer.loadUrl(str2, this) == objF) {
                        return objF;
                    }
                    j10 = jB;
                } catch (Throwable th3) {
                    th = th3;
                    j10 = jB;
                    Result.a aVar3 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                }
            }
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            l lVar = new l(Result.m3457boximpl(objM3458constructorimpl), j.a.e(j10), null);
            AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
            AdObject adObject = this.$tmpAdObject;
            Object objM3466unboximpl = ((Result) lVar.a()).m3466unboximpl();
            long jB2 = lVar.b();
            SendDiagnosticEvent sendDiagnosticEvent = androidHandleGatewayAdResponse.sendDiagnosticEvent;
            if (Result.m3464isSuccessimpl(objM3466unboximpl)) {
                str = "native_load_file_task_success_time";
            } else {
                str = "native_load_file_task_failure_time";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, tj.a.b(b.G(jB2, DurationUnit.MILLISECONDS)), null, null, adObject, null, 44, null);
            kotlin.c.b(objM3466unboximpl);
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {192}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends SuspendLambda implements bk.p<l0, c<? super r>, Object> {
        public final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
        public final /* synthetic */ LoadEvent $loadEvent;
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref$ObjectRef<AdPlayer> ref$ObjectRef, c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass4(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass4) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                Error error = new Error(((LoadEvent.Error) this.$loadEvent).getMessage());
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = this.$adPlayer.element;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(error, byteString, adResponse, adPlayer, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", l = {Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends SuspendLambda implements bk.p<l0, c<? super r>, Object> {
        public final /* synthetic */ Ref$ObjectRef<AdPlayer> $adPlayer;
        public final /* synthetic */ ByteString $opportunityId;
        public final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        public final /* synthetic */ CancellationException $t;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Ref$ObjectRef<AdPlayer> ref$ObjectRef, c<? super AnonymousClass5> cVar) {
            super(2, cVar);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = ref$ObjectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass5(this.$t, this.$opportunityId, this.$response, this.$adPlayer, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass5) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                CancellationException cancellationException = this.$t;
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = this.$adPlayer.element;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridgeUseCase, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer, CacheWebViewAssets cacheWebViewAssets) {
        p.j(adRepository, "adRepository");
        p.j(androidGetWebViewContainerUseCase, "getWebViewContainerUseCase");
        p.j(getWebViewBridgeUseCase, "getWebViewBridge");
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(handleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        p.j(campaignRepository, "campaignRepository");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.j(getOperativeEventApi, "getOperativeEventApi");
        p.j(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        p.j(adPlayerScope, "adPlayerScope");
        p.j(getAdPlayer, "getAdPlayer");
        p.j(cacheWebViewAssets, "cacheWebViewAssets");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = androidGetWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridgeUseCase;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = handleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }
}
