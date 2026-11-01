package com.unity3d.services.core.network.core;

import bk.p;
import ck.i;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lk.a0;
import lk.w;
import mj.r;
import nk.h;
import nk.l;
import nk.l0;
import nk.l1;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import rj.c;
import sj.a;
import tj.d;
import tj.f;

/* JADX INFO: compiled from: CronetClient.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    /* JADX INFO: compiled from: CronetClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int i10) {
        if (i10 == 0) {
            return 4;
        }
        if (i10 != 1) {
            return i10 != 2 ? 1 : 2;
        }
        return 3;
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.CronetClient$executeBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: CronetClient.kt */
    @d(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", l = {37}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super HttpResponse>, Object> {
        public final /* synthetic */ HttpRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequest httpRequest, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return CronetClient.this.new AnonymousClass1(this.$request, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super HttpResponse> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                CronetClient cronetClient = CronetClient.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = HttpClient.DefaultImpls.execute$default(cronetClient, httpRequest, false, this, 2, null);
                if (obj == objF) {
                    return objF;
                }
            }
            return obj;
        }
    }

    public CronetClient(CronetEngine cronetEngine, ISDKDispatchers iSDKDispatchers) {
        ck.p.j(cronetEngine, "engine");
        ck.p.j(iSDKDispatchers, "dispatchers");
        this.engine = cronetEngine;
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest httpRequest) {
        return a0.F0(a0.l1(httpRequest.getBaseURL(), '/') + '/' + a0.l1(httpRequest.getPath(), '/'), "/");
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, final boolean z10, c<? super HttpResponse> cVar) {
        byte[] bytes;
        final PipedOutputStream pipedOutputStream = z10 ? new PipedOutputStream() : null;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        UrlRequest.Builder builderNewUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), new UnityAdsUrlRequestCallback() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) throws IOException {
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                NetworkException networkException = cronetException instanceof NetworkException ? (NetworkException) cronetException : null;
                UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                l<HttpResponse> lVar = cVar2;
                Result.a aVar = Result.Companion;
                lVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(unityAdsNetworkException)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
                ck.p.j(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
                ck.p.j(urlResponseInfo, "info");
                ck.p.j(byteBuffer, "byteBuffer");
                if (pipedOutputStream == null) {
                    super.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
                    return;
                }
                if (!atomicBoolean.getAndSet(true)) {
                    l<HttpResponse> lVar = cVar2;
                    int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                    Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                    String url = urlResponseInfo.getUrl();
                    PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
                    String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                    long contentSize = this.getContentSize(urlResponseInfo);
                    ck.p.i(allHeaders, "allHeaders");
                    ck.p.i(url, "url");
                    ck.p.i(negotiatedProtocol, "negotiatedProtocol");
                    lVar.resumeWith(Result.m3458constructorimpl(new HttpResponse(pipedInputStream, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize)));
                }
                byteBuffer.flip();
                try {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    pipedOutputStream.write(bArr);
                } catch (IOException e10) {
                    DeviceLog.info("IOException during ByteBuffer read. Details: ", e10);
                }
                byteBuffer.clear();
                urlRequest.read(byteBuffer);
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr) throws IOException {
                PipedOutputStream pipedOutputStream2;
                ck.p.j(urlRequest, AdActivity.REQUEST_KEY_EXTRA);
                ck.p.j(urlResponseInfo, "info");
                ck.p.j(bArr, "bodyBytes");
                if (z10 && (pipedOutputStream2 = pipedOutputStream) != null) {
                    pipedOutputStream2.close();
                }
                if (atomicBoolean.getAndSet(true)) {
                    return;
                }
                l<HttpResponse> lVar = cVar2;
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                String url = urlResponseInfo.getUrl();
                String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                long contentSize = this.getContentSize(urlResponseInfo);
                ck.p.i(allHeaders, "allHeaders");
                ck.p.i(url, "url");
                ck.p.i(negotiatedProtocol, "negotiatedProtocol");
                lVar.resumeWith(Result.m3458constructorimpl(new HttpResponse(bArr, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize)));
            }

            @Override // org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws IOException {
                String url;
                String negotiatedProtocol;
                super.onCanceled(urlRequest, urlResponseInfo);
                PipedOutputStream pipedOutputStream2 = pipedOutputStream;
                if (pipedOutputStream2 != null) {
                    pipedOutputStream2.close();
                }
                if (urlResponseInfo != null) {
                    url = urlResponseInfo.getUrl();
                } else {
                    url = null;
                }
                if (urlResponseInfo != null) {
                    negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                } else {
                    negotiatedProtocol = null;
                }
                NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, url, negotiatedProtocol, null, "cronet", 38, null);
                if (!atomicBoolean.getAndSet(true)) {
                    l<HttpResponse> lVar = cVar2;
                    Result.a aVar = Result.Companion;
                    lVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(networkTimeoutException)));
                }
            }
        }, l1.a(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bytes = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bytes = ((String) httpRequest.getBody()).getBytes(lk.c.f63591b);
                ck.p.i(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = new byte[0];
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bytes), l1.a(this.dispatchers.getIo()));
        }
        final UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        cVar2.p(new bk.l<Throwable, r>() { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$2
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
                urlRequestBuild.cancel();
            }
        });
        urlRequestBuild.start();
        Object objB = cVar2.B();
        if (objB == a.f()) {
            f.c(cVar);
        }
        return objB;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        ck.p.j(httpRequest, AdActivity.REQUEST_KEY_EXTRA);
        return (HttpResponse) h.e(this.dispatchers.getIo(), new AnonymousClass1(httpRequest, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long lT;
        List<String> list = urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list != null && (str = list.get(0)) != null && (lT = w.t(str)) != null) {
            return lT.longValue();
        }
        return -1L;
    }
}
