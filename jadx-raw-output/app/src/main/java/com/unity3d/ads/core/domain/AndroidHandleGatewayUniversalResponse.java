package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import qk.l;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidHandleGatewayUniversalResponse.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayUniversalResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse", f = "AndroidHandleGatewayUniversalResponse.kt", l = {42, 48, 51}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayUniversalResponse.this.invoke(null, this);
        }
    }

    public AndroidHandleGatewayUniversalResponse(SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, AndroidAppSetIdDataSource androidAppSetIdDataSource) {
        p.j(sessionRepository, "sessionRepository");
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(androidAppSetIdDataSource, "appSetIdDataSource");
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.appSetIdDataSource = androidAppSetIdDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        MutableDataOuterClass.MutableData mutableData;
        AllowedPiiOuterClass.AllowedPii value;
        AllowedPiiOuterClass.AllowedPii allowedPii;
        AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse;
        SessionRepository sessionRepository;
        ByteString privacyFsm;
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
                mutableData = (MutableDataOuterClass.MutableData) anonymousClass1.L$1;
                androidHandleGatewayUniversalResponse = (AndroidHandleGatewayUniversalResponse) anonymousClass1.L$0;
                kotlin.c.b(obj);
            } else {
                if (i11 == 2) {
                    mutableData = (MutableDataOuterClass.MutableData) anonymousClass1.L$1;
                    androidHandleGatewayUniversalResponse = (AndroidHandleGatewayUniversalResponse) anonymousClass1.L$0;
                    kotlin.c.b(obj);
                    if (mutableData.hasPrivacyFsm()) {
                        sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
                        privacyFsm = mutableData.getPrivacyFsm();
                        p.i(privacyFsm, "mutableData.privacyFsm");
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 3;
                        if (sessionRepository.setPrivacyFsm(privacyFsm, anonymousClass1) == objF) {
                            return objF;
                        }
                    }
                    return r.f64562a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
        kotlin.c.b(obj);
        if (universalResponse.hasError()) {
            String errorText = universalResponse.getError().getErrorText();
            p.i(errorText, "response.error.errorText");
            throw new GatewayException(errorText, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_universal", universalResponse.getError().getErrorText());
        }
        if (universalResponse.hasMutableData()) {
            mutableData = universalResponse.getMutableData();
            l<AllowedPiiOuterClass.AllowedPii> allowedPii2 = this.deviceInfoRepository.getAllowedPii();
            do {
                value = allowedPii2.getValue();
                allowedPii = mutableData.getAllowedPii();
                p.i(allowedPii, "mutableData.allowedPii");
            } while (!allowedPii2.a(value, allowedPii));
            if (mutableData.getAllowedPii().getAppsetId()) {
                this.appSetIdDataSource.invoke();
            }
            SessionRepository sessionRepository2 = this.sessionRepository;
            ByteString currentState = mutableData.getCurrentState();
            p.i(currentState, "mutableData.currentState");
            sessionRepository2.setGatewayState(currentState);
            if (mutableData.hasSessionToken()) {
                SessionRepository sessionRepository3 = this.sessionRepository;
                ByteString sessionToken = mutableData.getSessionToken();
                p.i(sessionToken, "mutableData.sessionToken");
                sessionRepository3.setSessionToken(sessionToken);
            }
            if (mutableData.hasPrivacy()) {
                SessionRepository sessionRepository4 = this.sessionRepository;
                ByteString privacy = mutableData.getPrivacy();
                p.i(privacy, "mutableData.privacy");
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = mutableData;
                anonymousClass1.label = 1;
                if (sessionRepository4.setPrivacy(privacy, anonymousClass1) == objF) {
                    return objF;
                }
            }
            androidHandleGatewayUniversalResponse = this;
        }
        return r.f64562a;
        if (mutableData.hasSessionCounters()) {
            SessionRepository sessionRepository5 = androidHandleGatewayUniversalResponse.sessionRepository;
            SessionCountersOuterClass.SessionCounters sessionCounters = mutableData.getSessionCounters();
            p.i(sessionCounters, "mutableData.sessionCounters");
            sessionRepository5.setSessionCounters(sessionCounters);
        }
        if (mutableData.hasCache()) {
            SessionRepository sessionRepository6 = androidHandleGatewayUniversalResponse.sessionRepository;
            ByteString cache = mutableData.getCache();
            p.i(cache, "mutableData.cache");
            anonymousClass1.L$0 = androidHandleGatewayUniversalResponse;
            anonymousClass1.L$1 = mutableData;
            anonymousClass1.label = 2;
            if (sessionRepository6.setGatewayCache(cache, anonymousClass1) == objF) {
                return objF;
            }
        }
        if (mutableData.hasPrivacyFsm()) {
            sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
            privacyFsm = mutableData.getPrivacyFsm();
            p.i(privacyFsm, "mutableData.privacyFsm");
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 3;
            if (sessionRepository.setPrivacyFsm(privacyFsm, anonymousClass1) == objF) {
                return objF;
            }
            return r.f64562a;
        }
        return r.f64562a;
    }
}
