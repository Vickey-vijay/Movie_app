package com.unity3d.services.core.network.core;

import androidx.core.app.NotificationCompat;
import bk.l;
import bk.p;
import ck.i;
import com.safedk.android.internal.partials.UnityCoreNetworkBridge;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lk.w;
import mj.r;
import nk.h;
import nk.l0;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import rj.c;
import sj.a;
import tj.d;
import tj.f;

/* JADX INFO: compiled from: OkHttp3Client.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final OkHttpClient client;
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: OkHttp3Client.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$1, reason: invalid class name */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @d(c = "com.unity3d.services.core.network.core.OkHttp3Client", f = "OkHttp3Client.kt", l = {134}, m = "execute")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttp3Client.this.execute(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @d(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {37}, m = "invokeSuspend")
    public static final class C39461 extends SuspendLambda implements p<l0, c<? super HttpResponse>, Object> {
        public final /* synthetic */ HttpRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39461(HttpRequest httpRequest, c<? super C39461> cVar) {
            super(2, cVar);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return OkHttp3Client.this.new C39461(this.$request, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super HttpResponse> cVar) {
            return ((C39461) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                OkHttp3Client okHttp3Client = OkHttp3Client.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = HttpClient.DefaultImpls.execute$default(okHttp3Client, httpRequest, false, this, 2, null);
                if (obj == objF) {
                    return objF;
                }
            }
            return obj;
        }
    }

    public OkHttp3Client(ISDKDispatchers iSDKDispatchers, OkHttpClient okHttpClient) {
        ck.p.j(iSDKDispatchers, "dispatchers");
        ck.p.j(okHttpClient, "client");
        this.dispatchers = iSDKDispatchers;
        this.client = okHttpClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, boolean z10, c<? super HttpResponse> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
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
        Object objB = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        final boolean z11 = true;
        try {
            if (i11 == 0) {
                kotlin.c.b(objB);
                Request okHttpProtoRequest = HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest);
                OkHttpClient.Builder builderNewBuilder = this.client.newBuilder();
                long connectTimeout = httpRequest.getConnectTimeout();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                OkHttpClient okHttpClientBuild = builderNewBuilder.connectTimeout(connectTimeout, timeUnit).readTimeout(httpRequest.getReadTimeout(), timeUnit).writeTimeout(httpRequest.getWriteTimeout(), timeUnit).build();
                anonymousClass1.L$0 = httpRequest;
                anonymousClass1.L$1 = okHttpProtoRequest;
                anonymousClass1.L$2 = okHttpClientBuild;
                anonymousClass1.Z$0 = z10;
                anonymousClass1.label = 1;
                final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(anonymousClass1), 1);
                cVar2.J();
                final Call callNewCall = okHttpClientBuild.newCall(okHttpProtoRequest);
                cVar2.p(new l<Throwable, r>() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                        invoke2(th2);
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        callNewCall.cancel();
                    }
                });
                if (!z10) {
                    z11 = false;
                }
                UnityCoreNetworkBridge.okhttp3CallEnqueue(callNewCall, new Callback() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2
                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        ck.p.j(call, NotificationCompat.CATEGORY_CALL);
                        ck.p.j(iOException, "e");
                        nk.l<HttpResponse> lVar = cVar2;
                        Result.a aVar = Result.Companion;
                        lVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(iOException)));
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) {
                        Object objBytes;
                        long jLongValue;
                        Long lT;
                        ck.p.j(call, NotificationCompat.CATEGORY_CALL);
                        ck.p.j(response, "response");
                        ResponseBody responseBodyOkhttp3Response_body = UnityCoreNetworkBridge.okhttp3Response_body(response);
                        if (responseBodyOkhttp3Response_body == null) {
                            nk.l<HttpResponse> lVar = cVar2;
                            Result.a aVar = Result.Companion;
                            lVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(new UnityAdsNetworkException("Empty response", null, Integer.valueOf(response.code()), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null))));
                            return;
                        }
                        if (!response.isSuccessful()) {
                            responseBodyOkhttp3Response_body.close();
                            nk.l<HttpResponse> lVar2 = cVar2;
                            Result.a aVar2 = Result.Companion;
                            lVar2.resumeWith(Result.m3458constructorimpl(kotlin.c.a(new UnityAdsNetworkException("Network request failed with code " + response.code(), null, Integer.valueOf(response.code()), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null))));
                            return;
                        }
                        try {
                            if (z11) {
                                objBytes = responseBodyOkhttp3Response_body.byteStream();
                                ck.p.h(objBytes, "null cannot be cast to non-null type kotlin.Any");
                            } else {
                                objBytes = responseBodyOkhttp3Response_body.bytes();
                            }
                            Object obj = objBytes;
                            nk.l<HttpResponse> lVar3 = cVar2;
                            int iCode = response.code();
                            Map<String, List<String>> multimap = response.headers().toMultimap();
                            String string = response.request().url().toString();
                            String string2 = response.protocol().toString();
                            String strHeader = response.header("Content-Length");
                            if (strHeader != null && (lT = w.t(strHeader)) != null) {
                                jLongValue = lT.longValue();
                            } else {
                                jLongValue = -1;
                            }
                            ck.p.i(obj, "responseData");
                            ck.p.i(multimap, "toMultimap()");
                            ck.p.i(string, "toString()");
                            ck.p.i(string2, "toString()");
                            lVar3.resumeWith(Result.m3458constructorimpl(new HttpResponse(obj, iCode, multimap, string, string2, OkHttp3Client.NETWORK_CLIENT_OKHTTP, jLongValue)));
                        } catch (Exception e10) {
                            responseBodyOkhttp3Response_body.close();
                            nk.l<HttpResponse> lVar4 = cVar2;
                            Result.a aVar3 = Result.Companion;
                            lVar4.resumeWith(Result.m3458constructorimpl(kotlin.c.a(e10)));
                        }
                    }
                });
                objB = cVar2.B();
                if (objB == a.f()) {
                    f.c(anonymousClass1);
                }
                if (objB == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objB);
            }
            return objB;
        } catch (SocketTimeoutException unused) {
            throw new NetworkTimeoutException(MSG_CONNECTION_TIMEOUT, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (IOException unused2) {
            throw new UnityAdsNetworkException(MSG_CONNECTION_FAILED, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        }
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        ck.p.j(httpRequest, AdActivity.REQUEST_KEY_EXTRA);
        return (HttpResponse) h.e(this.dispatchers.getIo(), new C39461(httpRequest, null));
    }
}
