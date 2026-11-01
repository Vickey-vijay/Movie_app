package com.unity3d.ads.gatewayclient;

import bk.p;
import ck.i;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.ui.AdActivity;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import mj.h;
import mj.r;
import mk.b;
import mk.j;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: CommonGatewayClient.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_AFTER = "Retry-After";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClientProvider httpClientProvider;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @d(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {118, 119}, m = "executeRequest")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeRequest(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @d(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {75, 81, 105}, m = "executeWithRetry")
    public static final class C39391 extends ContinuationImpl {
        public int I$0;
        public long J$0;
        public long J$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C39391(c<? super C39391> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeWithRetry(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @d(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {59}, m = AdActivity.REQUEST_KEY_EXTRA)
    public static final class C39401 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C39401(c<? super C39401> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.request(null, null, null, null, this);
        }
    }

    private final long calculateJitter(int i10, float f10) {
        if (f10 == 0.0f) {
            return 0L;
        }
        long j10 = (long) (i10 * f10);
        return Random.Default.nextLong(-j10, j10);
    }

    private final boolean shouldRetry(int i10, long j10, int i11) {
        return (400 <= i10 && i10 < 600) && j10 < ((long) i11);
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @d(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {60}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super UniversalResponseOuterClass.UniversalResponse>, Object> {
        public final /* synthetic */ OperationType $operationType;
        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
        public final /* synthetic */ RequestPolicy $requestPolicy;
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$url = str;
            this.$request = universalRequest;
            this.$requestPolicy = requestPolicy;
            this.$operationType = operationType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return CommonGatewayClient.this.new AnonymousClass2(this.$url, this.$request, this.$requestPolicy, this.$operationType, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super UniversalResponseOuterClass.UniversalResponse> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                CommonGatewayClient commonGatewayClient = CommonGatewayClient.this;
                String str = this.$url;
                UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
                RequestPolicy requestPolicy = this.$requestPolicy;
                OperationType operationType = this.$operationType;
                this.label = 1;
                obj = commonGatewayClient.executeWithRetry(str, universalRequest, requestPolicy, operationType, this);
                if (obj == objF) {
                    return objF;
                }
            }
            return obj;
        }
    }

    public CommonGatewayClient(HttpClientProvider httpClientProvider, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository) {
        ck.p.j(httpClientProvider, "httpClientProvider");
        ck.p.j(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        ck.p.j(sessionRepository, "sessionRepository");
        this.httpClientProvider = httpClientProvider;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
    }

    private final HttpRequest buildHttpRequest(String str, Map<String, ? extends List<String>> map, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest universalRequest) {
        return new HttpRequest(str, null, RequestType.POST, universalRequest.toByteArray(), map, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateExponentialBackoff(long j10, RequestPolicy requestPolicy, int i10) {
        return i10 == 0 ? j10 : (long) (j10 * requestPolicy.getRetryScalingFactor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object executeRequest(HttpRequest httpRequest, int i10, OperationType operationType, c<? super HttpResponse> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        long jB;
        int i11;
        OperationType operationType2;
        CommonGatewayClient commonGatewayClient;
        CommonGatewayClient commonGatewayClient2;
        HttpRequest httpRequest2;
        long j10;
        long j11;
        OperationType operationType3;
        int i12;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i13 = anonymousClass1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i13 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objInvoke = anonymousClass2.result;
        Object objF = a.f();
        int i14 = anonymousClass2.label;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = anonymousClass2.J$0;
                i12 = anonymousClass2.I$0;
                operationType3 = (OperationType) anonymousClass2.L$1;
                commonGatewayClient = (CommonGatewayClient) anonymousClass2.L$0;
                try {
                    kotlin.c.b(objInvoke);
                    HttpResponse httpResponse = (HttpResponse) objInvoke;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse, i12, operationType3, j.a.b(j11));
                    return httpResponse;
                } catch (UnityAdsNetworkException e10) {
                    e = e10;
                    i11 = i12;
                    operationType2 = operationType3;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType2, j.a.b(j11));
                    return HttpResponseKt.toHttpResponse(e);
                } catch (TimeoutCancellationException e11) {
                    e = e11;
                    i11 = i12;
                    operationType2 = operationType3;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i11, operationType2, j.a.b(j11));
                    throw e;
                }
            }
            jB = anonymousClass2.J$0;
            int i15 = anonymousClass2.I$0;
            OperationType operationType4 = (OperationType) anonymousClass2.L$2;
            HttpRequest httpRequest3 = (HttpRequest) anonymousClass2.L$1;
            CommonGatewayClient commonGatewayClient3 = (CommonGatewayClient) anonymousClass2.L$0;
            try {
                kotlin.c.b(objInvoke);
                j10 = jB;
                commonGatewayClient2 = commonGatewayClient3;
                i11 = i15;
                operationType2 = operationType4;
                httpRequest2 = httpRequest3;
                try {
                    anonymousClass2.L$0 = commonGatewayClient2;
                    anonymousClass2.L$1 = operationType2;
                    anonymousClass2.L$2 = null;
                    anonymousClass2.I$0 = i11;
                    anonymousClass2.J$0 = j10;
                    anonymousClass2.label = 2;
                    objInvoke = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequest2, false, anonymousClass2, 2, null);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    operationType3 = operationType2;
                    i12 = i11;
                    j11 = j10;
                    commonGatewayClient = commonGatewayClient2;
                    HttpResponse httpResponse2 = (HttpResponse) objInvoke;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse2, i12, operationType3, j.a.b(j11));
                    return httpResponse2;
                } catch (UnityAdsNetworkException e12) {
                    e = e12;
                    j11 = j10;
                    commonGatewayClient = commonGatewayClient2;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType2, j.a.b(j11));
                    return HttpResponseKt.toHttpResponse(e);
                } catch (TimeoutCancellationException e13) {
                    e = e13;
                    j11 = j10;
                    commonGatewayClient = commonGatewayClient2;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i11, operationType2, j.a.b(j11));
                    throw e;
                }
            } catch (UnityAdsNetworkException e14) {
                e = e14;
                operationType2 = operationType4;
                commonGatewayClient = commonGatewayClient3;
                i11 = i15;
                j11 = jB;
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType2, j.a.b(j11));
                return HttpResponseKt.toHttpResponse(e);
            } catch (TimeoutCancellationException e15) {
                e = e15;
                operationType2 = operationType4;
                commonGatewayClient = commonGatewayClient3;
                i11 = i15;
                j11 = jB;
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i11, operationType2, j.a.b(j11));
                throw e;
            }
        }
        kotlin.c.b(objInvoke);
        jB = j.f64572a.b();
        try {
            HttpClientProvider httpClientProvider = this.httpClientProvider;
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = httpRequest;
            operationType2 = operationType;
            try {
                anonymousClass2.L$2 = operationType2;
                i11 = i10;
                try {
                    anonymousClass2.I$0 = i11;
                    anonymousClass2.J$0 = jB;
                    anonymousClass2.label = 1;
                    objInvoke = httpClientProvider.invoke(anonymousClass2);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    commonGatewayClient2 = this;
                    httpRequest2 = httpRequest;
                    j10 = jB;
                    anonymousClass2.L$0 = commonGatewayClient2;
                    anonymousClass2.L$1 = operationType2;
                    anonymousClass2.L$2 = null;
                    anonymousClass2.I$0 = i11;
                    anonymousClass2.J$0 = j10;
                    anonymousClass2.label = 2;
                    objInvoke = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequest2, false, anonymousClass2, 2, null);
                    if (objInvoke == objF) {
                        return objF;
                    }
                    operationType3 = operationType2;
                    i12 = i11;
                    j11 = j10;
                    commonGatewayClient = commonGatewayClient2;
                    HttpResponse httpResponse3 = (HttpResponse) objInvoke;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse3, i12, operationType3, j.a.b(j11));
                    return httpResponse3;
                } catch (UnityAdsNetworkException e16) {
                    e = e16;
                    commonGatewayClient = this;
                    j11 = jB;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i11, operationType2, j.a.b(j11));
                    return HttpResponseKt.toHttpResponse(e);
                } catch (TimeoutCancellationException e17) {
                    e = e17;
                    commonGatewayClient = this;
                    j11 = jB;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i11, operationType2, j.a.b(j11));
                    throw e;
                }
            } catch (UnityAdsNetworkException e18) {
                e = e18;
                i11 = i10;
            } catch (TimeoutCancellationException e19) {
                e = e19;
                i11 = i10;
            }
        } catch (UnityAdsNetworkException e20) {
            e = e20;
            i11 = i10;
            operationType2 = operationType;
        } catch (TimeoutCancellationException e21) {
            e = e21;
            i11 = i10;
            operationType2 = operationType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:27:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x010f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0111  */
    /* JADX WARN: Code duplicated, block: B:32:0x0119  */
    /* JADX WARN: Code duplicated, block: B:39:0x0144  */
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
    /* JADX WARN: Code duplicated, block: B:42:0x014e  */
    /* JADX WARN: Code duplicated, block: B:45:0x016d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0189  */
    /* JADX WARN: Code duplicated, block: B:50:0x019b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0189 -> B:49:0x0193). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object executeWithRetry(java.lang.String r32, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r33, com.unity3d.ads.gatewayclient.RequestPolicy r34, com.unity3d.ads.core.data.model.OperationType r35, rj.c<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, rj.c):java.lang.Object");
    }

    private final String getGatewayUrl(String str) {
        return !ck.p.e(str, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? str : this.sessionRepository.getGatewayUrl();
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException, int i10, OperationType operationType, mk.i iVar) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), kotlin.collections.a.o(h.a("operation", operationType.toString()), h.a("retries", String.valueOf(i10)), h.a("protocol", String.valueOf(unityAdsNetworkException.getProtocol())), h.a("network_client", String.valueOf(unityAdsNetworkException.getClient())), h.a("reason_code", String.valueOf(unityAdsNetworkException.getCode())), h.a("reason_debug", unityAdsNetworkException.getMessage())), null, null, null, 56, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int i10, OperationType operationType, mk.i iVar) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), kotlin.collections.a.o(h.a("operation", operationType.toString()), h.a("retries", String.valueOf(i10)), h.a("protocol", httpResponse.getProtocol()), h.a("network_client", httpResponse.getClient()), h.a("reason_code", String.valueOf(httpResponse.getStatusCode()))), null, null, null, 56, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    public Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, c<? super UniversalResponseOuterClass.UniversalResponse> cVar) throws Throwable {
        C39401 c39401;
        RequestPolicy requestPolicy2;
        if (cVar instanceof C39401) {
            c39401 = (C39401) cVar;
            int i10 = c39401.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c39401.label = i10 - Integer.MIN_VALUE;
            } else {
                c39401 = new C39401(cVar);
            }
        } else {
            c39401 = new C39401(cVar);
        }
        Object objE = c39401.result;
        Object objF = a.f();
        int i11 = c39401.label;
        if (i11 == 0) {
            kotlin.c.b(objE);
            b.a aVar = b.f64563c;
            long jS = mk.d.s(requestPolicy.getMaxDuration(), DurationUnit.MILLISECONDS);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(str, universalRequest, requestPolicy, operationType, null);
            c39401.L$0 = requestPolicy;
            c39401.label = 1;
            objE = TimeoutKt.e(jS, anonymousClass2, c39401);
            if (objE == objF) {
                return objF;
            }
            requestPolicy2 = requestPolicy;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            requestPolicy2 = (RequestPolicy) c39401.L$0;
            kotlin.c.b(objE);
        }
        UniversalResponseOuterClass.UniversalResponse universalResponse = (UniversalResponseOuterClass.UniversalResponse) objE;
        if (universalResponse != null) {
            return universalResponse;
        }
        throw new NetworkTimeoutException("Gateway request timed out after " + requestPolicy2.getMaxDuration() + "ms", null, null, null, null, null, null, 126, null);
    }

    private final long calculateDelayTime(long j10, RequestPolicy requestPolicy, int i10) {
        return Math.min(calculateExponentialBackoff(j10, requestPolicy, i10) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final Map<String, List<String>> getHeaders(int i10) {
        Map mapD = nj.l0.d();
        mapD.put("Content-Type", nj.r.e(HEADER_PROTOBUF));
        if (i10 > 0) {
            mapD.put(HEADER_RETRY_ATTEMPT, nj.r.e(String.valueOf(i10)));
        }
        return nj.l0.c(mapD);
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse httpResponse, OperationType operationType) {
        try {
            Object body = httpResponse.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse from = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                ck.p.i(from, "parseFrom(responseBody)");
                return from;
            }
            if (body instanceof String) {
                byte[] bytes = ((String) body).getBytes(lk.c.f63591b);
                ck.p.i(bytes, "this as java.lang.String).getBytes(charset)");
                UniversalResponseOuterClass.UniversalResponse from2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
                ck.p.i(from2, "parseFrom(\n             ….UTF_8)\n                )");
                return from2;
            }
            throw new InvalidProtocolBufferException("Could not parse response from gateway service");
        } catch (InvalidProtocolBufferException e10) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e10.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, kotlin.collections.a.m(h.a("operation", operationType.toString()), h.a("reason", "protobuf_parsing"), h.a("reason_debug", httpResponse.getBody().toString())), null, null, null, 58, null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.Companion;
            UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            ck.p.i(builderNewBuilder, "newBuilder()");
            UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.Companion;
            ErrorOuterClass.Error.Builder builderNewBuilder2 = ErrorOuterClass.Error.newBuilder();
            ck.p.i(builderNewBuilder2, "newBuilder()");
            ErrorKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
            dsl_create2.setErrorText("ERROR: Could not parse response from gateway service");
            dsl_create.setError(dsl_create2._build());
            return dsl_create._build();
        }
    }
}
