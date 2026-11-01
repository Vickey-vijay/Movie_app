package com.unity3d.ads.core.domain.exposure;

import android.util.Base64;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.model.OnWebRequestComplete;
import com.unity3d.ads.adplayer.model.OnWebRequestFailed;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.GetIsFileCache;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.HandleOpenUrl;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.SendPrivacyUpdateRequest;
import com.unity3d.ads.core.domain.attribution.AndroidAttribution;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.domain.offerwall.GetIsOfferwallAdReady;
import com.unity3d.ads.core.domain.offerwall.LoadOfferwallAd;
import com.unity3d.ads.core.domain.om.AndroidOmInteraction;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import com.unity3d.ads.core.domain.scar.LoadScarAd;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.utils.ContinuationFromCallback;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.time.DurationUnit;
import lk.a0;
import mj.r;
import mk.b;
import mk.d;
import nj.l0;
import nj.n;
import nj.s;
import org.json.JSONArray;
import org.json.JSONObject;
import qk.k;
import qk.l;
import rj.c;
import rj.f;
import sj.a;

/* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CommonAdViewerExposedFunctionsKt {

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$download$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C38951 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ CacheFile $cacheFile;

        public C38951(CacheFile cacheFile, AdObject adObject) {
            this.$cacheFile = cacheFile;
            this.$adObject = adObject;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<Object>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$download$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$download$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$download$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, cVar);
            }
            CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$2 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
            Object objInvoke = commonAdViewerExposedFunctionsKt$download$1$invoke$2.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$download$1$invoke$2.label;
            if (i11 == 0) {
                kotlin.c.b(objInvoke);
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String string = jSONObject.getString("url");
                JSONArray jSONArray = (JSONArray) n.R(objArr, 2);
                int iOptInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                CacheFile cacheFile = this.$cacheFile;
                p.i(string, "url");
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$download$1$invoke$2.label = 1;
                objInvoke = cacheFile.invoke(string, adObject, jSONArray, iOptInt, commonAdViewerExposedFunctionsKt$download$1$invoke$2);
                if (objInvoke == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objInvoke);
            }
            CacheResult cacheResult = (CacheResult) objInvoke;
            if (!(cacheResult instanceof CacheResult.Success)) {
                if (cacheResult instanceof CacheResult.Failure) {
                    throw new IllegalStateException(((CacheResult.Failure) cacheResult).getError().name().toString());
                }
                throw new NoWhenBranchMatchedException();
            }
            return "unity-ads-cache://unity.ads.cache/" + ((CacheResult.Success) cacheResult).getCachedFile().getName();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39011 implements ExposedFunction {
        public final /* synthetic */ SessionRepository $sessionRepository;

        public C39011(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<Object>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(this, cVar);
            }
            Object privacy = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(privacy);
                SessionRepository sessionRepository = this.$sessionRepository;
                commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1.label = 1;
                privacy = sessionRepository.getPrivacy(commonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1);
                if (privacy == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(privacy);
            }
            return ProtobufExtensionsKt.toBase64$default((ByteString) privacy, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39021 implements ExposedFunction {
        public final /* synthetic */ SessionRepository $sessionRepository;

        public C39021(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<Object>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1(this, cVar);
            }
            Object privacyFsm = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(privacyFsm);
                SessionRepository sessionRepository = this.$sessionRepository;
                commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1.label = 1;
                privacyFsm = sessionRepository.getPrivacyFsm(commonAdViewerExposedFunctionsKt$getPrivacyFsm$1$invoke$1);
                if (privacyFsm == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(privacyFsm);
            }
            return ProtobufExtensionsKt.toBase64$default((ByteString) privacyFsm, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39141 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ LoadOfferwallAd $loadOfferwallAd;

        public C39141(AdObject adObject, LoadOfferwallAd loadOfferwallAd) {
            this.$adObject = adObject;
            this.$loadOfferwallAd = loadOfferwallAd;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                Object obj2 = objArr[0];
                p.h(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                String strOptString = ((JSONObject) obj2).optString("placementName");
                this.$adObject.setOfferwallAd(true);
                this.$adObject.setOfferwallPlacementName(strOptString);
                LoadOfferwallAd loadOfferwallAd = this.$loadOfferwallAd;
                p.i(strOptString, "placementName");
                commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1.label = 1;
                if (loadOfferwallAd.invoke(strOptString, commonAdViewerExposedFunctionsKt$loadOfferwallAd$1$invoke$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39151 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ LoadScarAd $loadScarAd;

        public C39151(AdObject adObject, LoadScarAd loadScarAd) {
            this.$adObject = adObject;
            this.$loadScarAd = loadScarAd;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1(this, cVar);
            }
            CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1;
            Object obj = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                Object obj2 = objArr[0];
                p.h(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                String strOptString = jSONObject.optString("type");
                String strOptString2 = jSONObject.optString("adUnitId");
                String strOptString3 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_STRING);
                String strOptString4 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_QUERY_ID);
                int iOptInt = jSONObject.optInt("videoLength");
                this.$adObject.setScarAd(true);
                this.$adObject.setScarAdUnitId(strOptString2);
                this.$adObject.setScarQueryId(strOptString4);
                this.$adObject.setScarAdString(strOptString3);
                LoadScarAd loadScarAd = this.$loadScarAd;
                p.i(strOptString, "adType");
                String placementId = this.$adObject.getPlacementId();
                p.i(strOptString2, "adUnitId");
                p.i(strOptString3, HandleInvocationsFromAdViewer.KEY_AD_STRING);
                p.i(strOptString4, HandleInvocationsFromAdViewer.KEY_QUERY_ID);
                commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2.label = 1;
                if (loadScarAd.invoke(strOptString, placementId, strOptString2, strOptString3, strOptString4, iOptInt, commonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$2) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omFinishSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39171 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ OmFinishSession $omFinishSession;

        public C39171(OmFinishSession omFinishSession, AdObject adObject) {
            this.$omFinishSession = omFinishSession;
            this.$adObject = adObject;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                OmFinishSession omFinishSession = this.$omFinishSession;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1.label = 1;
                if (omFinishSession.invoke(adObject, commonAdViewerExposedFunctionsKt$omFinishSession$1$invoke$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39181 implements ExposedFunction {
        public final /* synthetic */ GetOmData $getOmData;

        public C39181(GetOmData getOmData) {
            this.$getOmData = getOmData;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<Object>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(this, cVar);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(objInvoke);
                GetOmData getOmData = this.$getOmData;
                commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1.label = 1;
                objInvoke = getOmData.invoke(commonAdViewerExposedFunctionsKt$omGetData$1$invoke$1);
                if (objInvoke == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objInvoke);
            }
            OMData oMData = (OMData) objInvoke;
            Map mapD = l0.d();
            mapD.put("version", oMData.getVersion());
            mapD.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER, oMData.getPartnerName());
            mapD.put(HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, oMData.getPartnerVersion());
            return l0.c(mapD);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39191 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ OmImpressionOccurred $omImpressionOccurred;

        public C39191(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
            this.$omImpressionOccurred = omImpressionOccurred;
            this.$adObject = adObject;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                Object obj2 = objArr[0];
                p.h(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                OmImpressionOccurred omImpressionOccurred = this.$omImpressionOccurred;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1.label = 1;
                if (omImpressionOccurred.invoke(adObject, zBooleanValue, commonAdViewerExposedFunctionsKt$omImpression$1$invoke$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39201 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ AndroidOmInteraction $omStartSession;

        public C39201(AndroidOmInteraction androidOmInteraction, AdObject adObject) {
            this.$omStartSession = androidOmInteraction;
            this.$adObject = adObject;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                Object obj2 = objArr[0];
                p.h(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                AndroidOmInteraction androidOmInteraction = this.$omStartSession;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1.label = 1;
                if (androidOmInteraction.invoke(adObject, (JSONObject) obj2, commonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39231 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ Refresh $refresh;

        public C39231(Refresh refresh, AdObject adObject) {
            this.$refresh = refresh;
            this.$adObject = adObject;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<Object>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1;
            ByteString byteStringFromBase64$default;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, cVar);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(objInvoke);
                if (objArr.length == 0) {
                    byteStringFromBase64$default = ByteString.EMPTY;
                } else {
                    Object obj = objArr[0];
                    p.h(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    String strOptString = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
                    p.i(strOptString, "refreshToken");
                    byteStringFromBase64$default = ProtobufExtensionsKt.fromBase64$default(strOptString, false, 1, null);
                }
                Refresh refresh = this.$refresh;
                p.i(byteStringFromBase64$default, "refreshTokenByteString");
                ByteString opportunityId = this.$adObject.getOpportunityId();
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = 1;
                objInvoke = refresh.invoke(byteStringFromBase64$default, opportunityId, commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1);
                if (objInvoke == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objInvoke);
            }
            AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) objInvoke;
            if (adDataRefreshResponse.hasError()) {
                throw new IllegalArgumentException("Refresh failed");
            }
            Map mapD = l0.d();
            ByteString adData = adDataRefreshResponse.getAdData();
            p.i(adData, "adRefreshResponse.adData");
            mapD.put("adData", ProtobufExtensionsKt.toBase64$default(adData, false, 1, null));
            ByteString adDataRefreshToken = adDataRefreshResponse.getAdDataRefreshToken();
            p.i(adDataRefreshToken, "adRefreshResponse.adDataRefreshToken");
            mapD.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null));
            ByteString trackingToken = adDataRefreshResponse.getTrackingToken();
            p.i(trackingToken, "adRefreshResponse.trackingToken");
            mapD.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(trackingToken, false, 1, null));
            return l0.c(mapD);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39241 implements ExposedFunction {
        public final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
        public final /* synthetic */ RequestType $type;

        public C39241(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
            this.$executeAdViewerRequest = executeAdViewerRequest;
            this.$type = requestType;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<Object>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$request$1$invoke$1 commonAdViewerExposedFunctionsKt$request$1$invoke$1;
            String str;
            Exception e10;
            String str2;
            String message;
            String str3;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$request$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$request$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$request$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$request$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$request$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$request$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$request$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                Object objK = n.K(objArr);
                p.h(objK, "null cannot be cast to non-null type kotlin.String");
                String str4 = (String) objK;
                String str5 = (String) n.R(objArr, 1);
                try {
                    ExecuteAdViewerRequest executeAdViewerRequest = this.$executeAdViewerRequest;
                    RequestType requestType = this.$type;
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0 = str4;
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1 = str5;
                    commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = 1;
                    Object objInvoke = executeAdViewerRequest.invoke(requestType, objArr, commonAdViewerExposedFunctionsKt$request$1$invoke$1);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    str = str4;
                    obj = objInvoke;
                    str2 = str5;
                } catch (Exception e11) {
                    str = str4;
                    e10 = e11;
                    str2 = str5;
                    String[] strArr = new String[3];
                    strArr[0] = str;
                    strArr[1] = str2;
                    message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    strArr[2] = message;
                    return new OnWebRequestFailed(s.n(strArr));
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1;
                str = (String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0;
                try {
                    kotlin.c.b(obj);
                } catch (Exception e12) {
                    e10 = e12;
                    String[] strArr2 = new String[3];
                    strArr2[0] = str;
                    strArr2[1] = str2;
                    message = e10.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    strArr2[2] = message;
                    return new OnWebRequestFailed(s.n(strArr2));
                }
            }
            HttpResponse httpResponse = (HttpResponse) obj;
            Object body = httpResponse.getBody();
            if (body instanceof String) {
                str3 = (String) body;
            } else {
                str3 = body instanceof byte[] ? new String((byte[]) body, lk.c.f63591b) : null;
            }
            return new OnWebRequestComplete(s.n(str, httpResponse.getUrlString(), str3, tj.a.d(httpResponse.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse.getHeaders())));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39261 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ GetOperativeEventApi $getOperativeEventApi;

        public C39261(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
            this.$getOperativeEventApi = getOperativeEventApi;
            this.$adObject = adObject;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SPECIFIED_BY_AD_PLAYER;
                Object obj2 = objArr[0];
                p.h(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                p.i(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                GetOperativeEventApi getOperativeEventApi = this.$getOperativeEventApi;
                AdObject adObject = this.$adObject;
                commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1.label = 1;
                if (getOperativeEventApi.invoke(operativeEventType, adObject, byteString, commonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39271 implements ExposedFunction {
        public final /* synthetic */ SendPrivacyUpdateRequest $sendPrivacyUpdateRequest;

        public C39271(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
            this.$sendPrivacyUpdateRequest = sendPrivacyUpdateRequest;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<Object>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1(this, cVar);
            }
            Object objInvoke = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(objInvoke);
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                String strOptString = jSONObject.optString("content");
                int iOptInt = jSONObject.optInt("version");
                SendPrivacyUpdateRequest sendPrivacyUpdateRequest = this.$sendPrivacyUpdateRequest;
                p.i(strOptString, "privacyUpdateContentBase64");
                ByteString byteStringFromBase64$default = ProtobufExtensionsKt.fromBase64$default(strOptString, false, 1, null);
                commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1.label = 1;
                objInvoke = sendPrivacyUpdateRequest.invoke(iOptInt, byteStringFromBase64$default, commonAdViewerExposedFunctionsKt$sendPrivacyUpdateRequest$1$invoke$1);
                if (objInvoke == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objInvoke);
            }
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = (PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse) objInvoke;
            Map mapD = l0.d();
            mapD.put("version", tj.a.d(privacyUpdateResponse.getVersion()));
            ByteString content = privacyUpdateResponse.getContent();
            p.i(content, "response.content");
            mapD.put("content", ProtobufExtensionsKt.toBase64$default(content, false, 1, null));
            return l0.c(mapD);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setOrientation$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39301 implements ExposedFunction {
        public final /* synthetic */ AdObject $adObject;

        public C39301(AdObject adObject) {
            this.$adObject = adObject;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                Object obj2 = objArr[0];
                p.h(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                k<DisplayMessage> displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                String stringUtf8 = this.$adObject.getOpportunityId().toStringUtf8();
                p.i(stringUtf8, "adObject.opportunityId.toStringUtf8()");
                DisplayMessage.SetOrientation setOrientation = new DisplayMessage.SetOrientation(stringUtf8, iIntValue);
                commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1.label = 1;
                if (displayMessages.emit(setOrientation, commonAdViewerExposedFunctionsKt$setOrientation$1$invoke$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39311 implements ExposedFunction {
        public final /* synthetic */ SessionRepository $sessionRepository;

        public C39311(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                SessionRepository sessionRepository = this.$sessionRepository;
                Object obj2 = objArr[0];
                p.h(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                p.i(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1.label = 1;
                if (sessionRepository.setPrivacy(byteString, commonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
    public static final class C39321 implements ExposedFunction {
        public final /* synthetic */ SessionRepository $sessionRepository;

        public C39321(SessionRepository sessionRepository) {
            this.$sessionRepository = sessionRepository;
        }

        @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
            return invoke2(objArr, (c<? super r>) cVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Object[] objArr, c<? super r> cVar) throws Throwable {
            CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1;
            if (cVar instanceof CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) cVar;
                int i10 = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, cVar);
                }
            } else {
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1(this, cVar);
            }
            Object obj = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.result;
            Object objF = a.f();
            int i11 = commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label;
            if (i11 == 0) {
                kotlin.c.b(obj);
                SessionRepository sessionRepository = this.$sessionRepository;
                Object obj2 = objArr[0];
                p.h(obj2, "null cannot be cast to non-null type kotlin.String");
                byte[] bArrDecode = Base64.decode((String) obj2, 2);
                p.i(bArrDecode, "decode(it[0] as String, Base64.NO_WRAP)");
                ByteString byteString = ByteStringsKt.toByteString(bArrDecode);
                commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1.label = 1;
                if (sessionRepository.setPrivacyFsm(byteString, commonAdViewerExposedFunctionsKt$setPrivacyFsm$1$invoke$1) == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
    }

    public static final ExposedFunction attributionRegisterClick(final AndroidAttribution androidAttribution, final AdObject adObject) {
        p.j(androidAttribution, "androidAttribution");
        p.j(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterClick.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerClick((String) obj, adObject, cVar);
            }
        };
    }

    public static final ExposedFunction attributionRegisterView(final AndroidAttribution androidAttribution, final AdObject adObject) {
        p.j(androidAttribution, "androidAttribution");
        p.j(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.attributionRegisterView.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                AndroidAttribution androidAttribution2 = androidAttribution;
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                return androidAttribution2.registerView((String) obj, adObject, cVar);
            }
        };
    }

    public static final ExposedFunction clearStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.clearStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
                f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.clear((String) obj, new ContinuationFromCallback(fVar));
                Object objA = fVar.a();
                if (objA == a.f()) {
                    tj.f.c(cVar);
                }
                return objA;
            }
        };
    }

    public static final ExposedFunction deleteStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.deleteStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
                f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                p.h(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.delete((String) obj, (String) obj2, new ContinuationFromCallback(fVar));
                Object objA = fVar.a();
                if (objA == a.f()) {
                    tj.f.c(cVar);
                }
                return objA;
            }
        };
    }

    public static final ExposedFunction download(CacheFile cacheFile, AdObject adObject) {
        p.j(cacheFile, "cacheFile");
        p.j(adObject, "adObject");
        return new C38951(cacheFile, adObject);
    }

    /* JADX INFO: renamed from: getAdContext-yLuu4LI, reason: not valid java name */
    public static final ExposedFunction m3173getAdContextyLuu4LI(AndroidGetAdPlayerContext androidGetAdPlayerContext, String str, String str2, String str3, IsOMActivated isOMActivated, AdObject adObject) {
        p.j(androidGetAdPlayerContext, "getAndroidAdPlayerContext");
        p.j(str, "adData");
        p.j(str2, HandleInvocationsFromAdViewer.KEY_IMPRESSION_CONFIG);
        p.j(str3, HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
        p.j(isOMActivated, "isOMActivated");
        p.j(adObject, "adObject");
        return new CommonAdViewerExposedFunctionsKt$getAdContext$1(str, str2, str3, androidGetAdPlayerContext, adObject, isOMActivated);
    }

    public static final ExposedFunction getAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                String strEncodeToString = Base64.encodeToString(deviceInfoRepository.getAllowedPii().getValue().toByteArray(), 2);
                p.i(strEncodeToString, "encodeToString(deviceInf…eArray(), Base64.NO_WRAP)");
                return strEncodeToString;
            }
        };
    }

    public static final ExposedFunction getConnectionType(final DeviceInfoRepository deviceInfoRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getConnectionType.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                DynamicDeviceInfoOuterClass.ConnectionType connectionType = deviceInfoRepository.getDynamicDeviceInfo().getConnectionType();
                p.i(connectionType, "deviceInfoRepository.dyn…DeviceInfo.connectionType");
                return connectionType;
            }
        };
    }

    public static final ExposedFunction getDeviceMaxVolume(final DeviceInfoRepository deviceInfoRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceMaxVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                return tj.a.b(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getMaxVolume());
            }
        };
    }

    public static final ExposedFunction getDeviceVolume(final DeviceInfoRepository deviceInfoRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getDeviceVolume.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                return tj.a.b(deviceInfoRepository.getDynamicDeviceInfo().getAndroid().getVolume());
            }
        };
    }

    public static final ExposedFunction getKeysStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getKeysStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
                f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                p.h(obj2, "null cannot be cast to non-null type kotlin.String");
                Object obj3 = objArr[2];
                p.h(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                Storage.getKeys((String) obj, (String) obj2, (Boolean) obj3, new ContinuationFromCallback(fVar));
                Object objA = fVar.a();
                if (objA == a.f()) {
                    tj.f.c(cVar);
                }
                return objA;
            }
        };
    }

    public static final ExposedFunction getPrivacy(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new C39011(sessionRepository);
    }

    public static final ExposedFunction getPrivacyFsm(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new C39021(sessionRepository);
    }

    public static final ExposedFunction getScreenHeight(final DeviceInfoRepository deviceInfoRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenHeight.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                return tj.a.d(deviceInfoRepository.getDynamicDeviceInfo().getScreenHeight());
            }
        };
    }

    public static final ExposedFunction getScreenWidth(final DeviceInfoRepository deviceInfoRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getScreenWidth.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                return tj.a.d(deviceInfoRepository.getDynamicDeviceInfo().getScreenWidth());
            }
        };
    }

    public static final ExposedFunction getSessionToken(final SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getSessionToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                return ProtobufExtensionsKt.toBase64$default(sessionRepository.getSessionToken(), false, 1, null);
            }
        };
    }

    public static final ExposedFunction getStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.getStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
                f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                p.h(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.get((String) obj, (String) obj2, new ContinuationFromCallback(fVar));
                Object objA = fVar.a();
                if (objA == a.f()) {
                    tj.f.c(cVar);
                }
                return objA;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementStarts(final SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementStarts.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                sessionRepository.incrementTokenStartsCount();
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction hbTokenIncrementWins(final SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenIncrementWins.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                sessionRepository.incrementTokenWinsCount();
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction hbTokenReset(final SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.hbTokenReset.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                sessionRepository.resetTokenCounters();
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction incrementBannerImpressionCount(final SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.incrementBannerImpressionCount.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                sessionRepository.incrementBannerImpressionCount();
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction isAttributionAvailable(final AndroidAttribution androidAttribution) {
        p.j(androidAttribution, "androidAttribution");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isAttributionAvailable.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                return androidAttribution.isAvailable(cVar);
            }
        };
    }

    public static final ExposedFunction isFileCached(final GetIsFileCache getIsFileCache) {
        p.j(getIsFileCache, "getIfFileCache");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isFileCached.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                return getIsFileCache.invoke((String) obj, cVar);
            }
        };
    }

    public static final ExposedFunction isOfferwallAdReady(final GetIsOfferwallAdReady getIsOfferwallAdReady) {
        p.j(getIsOfferwallAdReady, "getIsOfferwallAdReady");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.isOfferwallAdReady.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String strOptString = ((JSONObject) obj).optString("placementName");
                GetIsOfferwallAdReady getIsOfferwallAdReady2 = getIsOfferwallAdReady;
                p.i(strOptString, "placementName");
                return getIsOfferwallAdReady2.invoke(strOptString, cVar);
            }
        };
    }

    public static final ExposedFunction loadOfferwallAd(LoadOfferwallAd loadOfferwallAd, AdObject adObject) {
        p.j(loadOfferwallAd, "loadOfferwallAd");
        p.j(adObject, "adObject");
        return new C39141(adObject, loadOfferwallAd);
    }

    public static final ExposedFunction loadScarAd(LoadScarAd loadScarAd, AdObject adObject) {
        p.j(loadScarAd, "loadScarAd");
        p.j(adObject, "adObject");
        return new C39151(adObject, loadScarAd);
    }

    public static final ExposedFunction markCampaignStateShown(final CampaignRepository campaignRepository, final AdObject adObject) {
        p.j(campaignRepository, "campaignRepository");
        p.j(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.markCampaignStateShown.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                campaignRepository.setShowTimestamp(adObject.getOpportunityId());
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction omFinishSession(OmFinishSession omFinishSession, AdObject adObject) {
        p.j(omFinishSession, "omFinishSession");
        p.j(adObject, "adObject");
        return new C39171(omFinishSession, adObject);
    }

    public static final ExposedFunction omGetData(GetOmData getOmData) {
        p.j(getOmData, "getOmData");
        return new C39181(getOmData);
    }

    public static final ExposedFunction omImpression(OmImpressionOccurred omImpressionOccurred, AdObject adObject) {
        p.j(omImpressionOccurred, "omImpressionOccurred");
        p.j(adObject, "adObject");
        return new C39191(omImpressionOccurred, adObject);
    }

    public static final ExposedFunction omStartSession(AndroidOmInteraction androidOmInteraction, AdObject adObject) {
        p.j(androidOmInteraction, "omStartSession");
        p.j(adObject, "adObject");
        return new C39201(androidOmInteraction, adObject);
    }

    public static final ExposedFunction openUrl(final AdObject adObject, final HandleOpenUrl handleOpenUrl) {
        p.j(adObject, "adObject");
        p.j(handleOpenUrl, "handleOpenUrl");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.openUrl.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) {
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object objR = n.R(objArr, 1);
                JSONObject jSONObject = objR instanceof JSONObject ? (JSONObject) objR : null;
                String strOptString = jSONObject != null ? jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME) : null;
                String strOptString2 = jSONObject != null ? jSONObject.optString("action", "android.intent.action.VIEW") : null;
                JSONObject jSONObjectOptJSONObject = jSONObject != null ? jSONObject.optJSONObject("extras") : null;
                return handleOpenUrl.invoke(adObject, str, strOptString, strOptString2, jSONObjectOptJSONObject != null ? JSONObjectExtensionsKt.toBuiltInMap(jSONObjectOptJSONObject) : null, jSONObject != null ? jSONObject.optBoolean(HandleInvocationsFromAdViewer.KEY_USE_ACTIVITY_FOR_RESULT) : false, cVar);
            }
        };
    }

    public static final ExposedFunction readStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.readStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
                f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.read((String) obj, new ContinuationFromCallback(fVar));
                Object objA = fVar.a();
                if (objA == a.f()) {
                    tj.f.c(cVar);
                }
                return objA;
            }
        };
    }

    public static final ExposedFunction refreshAdData(Refresh refresh, AdObject adObject) {
        p.j(refresh, ToolBar.REFRESH);
        p.j(adObject, "adObject");
        return new C39231(refresh, adObject);
    }

    public static final ExposedFunction sendDiagnosticEvent(final SendDiagnosticEvent sendDiagnosticEvent, final AdObject adObject) {
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.j(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.sendDiagnosticEvent.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                String string;
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = objArr[1];
                p.h(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                Map mapD = l0.d();
                Iterator<String> itKeys = jSONObject.keys();
                p.i(itKeys, "tags.keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    mapD.put(next, jSONObject.getString(next));
                }
                Map mapC = l0.c(mapD);
                Object objR = n.R(objArr, 2);
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, (objR == null || (string = objR.toString()) == null) ? null : tj.a.b(Double.parseDouble(string)), mapC, null, adObject, null, 40, null);
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction sendOperativeEvent(GetOperativeEventApi getOperativeEventApi, AdObject adObject) {
        p.j(getOperativeEventApi, "getOperativeEventApi");
        p.j(adObject, "adObject");
        return new C39261(getOperativeEventApi, adObject);
    }

    public static final ExposedFunction sendPrivacyUpdateRequest(SendPrivacyUpdateRequest sendPrivacyUpdateRequest) {
        p.j(sendPrivacyUpdateRequest, "sendPrivacyUpdateRequest");
        return new C39271(sendPrivacyUpdateRequest);
    }

    public static final ExposedFunction setAllowedPii(final DeviceInfoRepository deviceInfoRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setAllowedPii.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                AllowedPiiOuterClass.AllowedPii value;
                final AllowedPiiKt.Dsl dsl_create;
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                l<AllowedPiiOuterClass.AllowedPii> allowedPii = deviceInfoRepository.getAllowedPii();
                do {
                    value = allowedPii.getValue();
                    AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
                    AllowedPiiOuterClass.AllowedPii.Builder builder = value.toBuilder();
                    p.i(builder, "this.toBuilder()");
                    dsl_create = companion._create(builder);
                    Object objOpt = jSONObject.opt("idfa");
                    Boolean bool = objOpt instanceof Boolean ? (Boolean) objOpt : null;
                    if (bool != null) {
                        new MutablePropertyReference0Impl(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfa());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0, jk.i
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfa(((Boolean) obj2).booleanValue());
                            }
                        }.set(tj.a.a(bool.booleanValue()));
                    }
                    Object objOpt2 = jSONObject.opt("idfv");
                    Boolean bool2 = objOpt2 instanceof Boolean ? (Boolean) objOpt2 : null;
                    if (bool2 != null) {
                        new MutablePropertyReference0Impl(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getIdfv());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0, jk.i
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setIdfv(((Boolean) obj2).booleanValue());
                            }
                        }.set(tj.a.a(bool2.booleanValue()));
                    }
                    Object objOpt3 = jSONObject.opt("appset_id");
                    Boolean bool3 = objOpt3 instanceof Boolean ? (Boolean) objOpt3 : null;
                    if (bool3 != null) {
                        new MutablePropertyReference0Impl(dsl_create) { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$6
                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                            public Object get() {
                                return Boolean.valueOf(((AllowedPiiKt.Dsl) this.receiver).getAppsetId());
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0, jk.i
                            public void set(Object obj2) {
                                ((AllowedPiiKt.Dsl) this.receiver).setAppsetId(((Boolean) obj2).booleanValue());
                            }
                        }.set(tj.a.a(bool3.booleanValue()));
                    }
                } while (!allowedPii.a(value, dsl_create._build()));
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction setOpportunityTTL(final AdObject adObject) {
        p.j(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setOpportunityTTL.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                l<b> ttl = adObject.getTtl();
                b.a aVar = b.f64563c;
                ttl.setValue(b.f(d.s(iIntValue, DurationUnit.SECONDS)));
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction setOrientation(AdObject adObject) {
        p.j(adObject, "adObject");
        return new C39301(adObject);
    }

    public static final ExposedFunction setPrivacy(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new C39311(sessionRepository);
    }

    public static final ExposedFunction setPrivacyFsm(SessionRepository sessionRepository) {
        p.j(sessionRepository, "sessionRepository");
        return new C39321(sessionRepository);
    }

    public static final ExposedFunction setStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.setStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
                f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = objArr[1];
                p.h(obj2, "null cannot be cast to non-null type kotlin.String");
                Storage.set((String) obj, (String) obj2, objArr[2], new ContinuationFromCallback(fVar));
                Object objA = fVar.a();
                if (objA == a.f()) {
                    tj.f.c(cVar);
                }
                return objA;
            }
        };
    }

    public static final ExposedFunction showOfferwallAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showOfferwallAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction showScarAd() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.showScarAd.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction updateCampaignState(final CampaignRepository campaignRepository, final AdObject adObject) {
        p.j(campaignRepository, "campaignRepository");
        p.j(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateCampaignState.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX WARN: Code duplicated, block: B:28:0x0074  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                CampaignStateOuterClass.Campaign campaign_build;
                Object objL = n.L(objArr);
                JSONObject jSONObject = objL instanceof JSONObject ? (JSONObject) objL : null;
                if (jSONObject == null) {
                    throw new IllegalArgumentException("Update campaign state requires a JSONObject".toString());
                }
                String strOptString = jSONObject.optString("data");
                if (!(!(strOptString == null || a0.n0(strOptString)))) {
                    throw new IllegalArgumentException("Update campaign state requires a data string".toString());
                }
                int iOptInt = jSONObject.optInt("dataVersion");
                if (!(iOptInt != 0)) {
                    throw new IllegalArgumentException("Update campaign state requires a dataVersion integer".toString());
                }
                ByteString opportunityId = adObject.getOpportunityId();
                String placementId = adObject.getPlacementId();
                p.i(strOptString, "data");
                ByteString byteStringFromBase64$default = ProtobufExtensionsKt.fromBase64$default(strOptString, false, 1, null);
                if (!(!byteStringFromBase64$default.isEmpty())) {
                    throw new IllegalArgumentException("Update campaign state requires a non-empty data byte string".toString());
                }
                CampaignStateOuterClass.Campaign campaign = campaignRepository.getCampaign(opportunityId);
                if (campaign != null) {
                    CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
                    CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
                    p.i(builder, "this.toBuilder()");
                    CampaignKt.Dsl dsl_create = companion._create(builder);
                    dsl_create.setData(byteStringFromBase64$default);
                    dsl_create.setDataVersion(iOptInt);
                    campaign_build = dsl_create._build();
                    if (campaign_build == null) {
                        CampaignKt.Dsl.Companion companion2 = CampaignKt.Dsl.Companion;
                        CampaignStateOuterClass.Campaign.Builder builderNewBuilder = CampaignStateOuterClass.Campaign.newBuilder();
                        p.i(builderNewBuilder, "newBuilder()");
                        CampaignKt.Dsl dsl_create2 = companion2._create(builderNewBuilder);
                        dsl_create2.setData(byteStringFromBase64$default);
                        dsl_create2.setDataVersion(iOptInt);
                        dsl_create2.setPlacementId(placementId);
                        dsl_create2.setImpressionOpportunityId(opportunityId);
                        campaign_build = dsl_create2._build();
                    }
                } else {
                    CampaignKt.Dsl.Companion companion3 = CampaignKt.Dsl.Companion;
                    CampaignStateOuterClass.Campaign.Builder builderNewBuilder2 = CampaignStateOuterClass.Campaign.newBuilder();
                    p.i(builderNewBuilder2, "newBuilder()");
                    CampaignKt.Dsl dsl_create3 = companion3._create(builderNewBuilder2);
                    dsl_create3.setData(byteStringFromBase64$default);
                    dsl_create3.setDataVersion(iOptInt);
                    dsl_create3.setPlacementId(placementId);
                    dsl_create3.setImpressionOpportunityId(opportunityId);
                    campaign_build = dsl_create3._build();
                }
                campaignRepository.setCampaign(opportunityId, campaign_build);
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction updateTrackingToken(final AdObject adObject) {
        p.j(adObject, "adObject");
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.updateTrackingToken.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<? super r>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<? super r> cVar) {
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type org.json.JSONObject");
                String strOptString = ((JSONObject) obj).optString(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                if (!(strOptString == null || strOptString.length() == 0)) {
                    AdObject adObject2 = adObject;
                    p.i(strOptString, "token");
                    adObject2.setTrackingToken(ProtobufExtensionsKt.fromBase64$default(strOptString, false, 1, null));
                }
                return r.f64562a;
            }
        };
    }

    public static final ExposedFunction writeStorage() {
        return new ExposedFunction() { // from class: com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.writeStorage.1
            @Override // com.unity3d.ads.adplayer.ExposedFunction, bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo1invoke(Object[] objArr, c<? super Object> cVar) {
                return invoke2(objArr, (c<Object>) cVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Object[] objArr, c<Object> cVar) throws Throwable {
                f fVar = new f(IntrinsicsKt__IntrinsicsJvmKt.c(cVar));
                Object obj = objArr[0];
                p.h(obj, "null cannot be cast to non-null type kotlin.String");
                Storage.write((String) obj, new ContinuationFromCallback(fVar));
                Object objA = fVar.a();
                if (objA == a.f()) {
                    tj.f.c(cVar);
                }
                return objA;
            }
        };
    }

    public static final ExposedFunction request(RequestType requestType, ExecuteAdViewerRequest executeAdViewerRequest) {
        p.j(requestType, "type");
        p.j(executeAdViewerRequest, "executeAdViewerRequest");
        return new C39241(executeAdViewerRequest, requestType);
    }
}
