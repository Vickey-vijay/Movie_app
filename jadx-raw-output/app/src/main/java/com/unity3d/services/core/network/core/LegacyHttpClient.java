package com.unity3d.services.core.network.core;

import bk.p;
import ck.i;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: LegacyHttpClient.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class LegacyHttpClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String NETWORK_CLIENT_LEGACY = "legacy";
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: LegacyHttpClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.LegacyHttpClient$execute$2, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyHttpClient.kt */
    @d(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super HttpResponse>, Object> {
        public final /* synthetic */ HttpRequest $request;
        public final /* synthetic */ boolean $withInputStream;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpRequest httpRequest, boolean z10, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$request = httpRequest;
            this.$withInputStream = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$request, this.$withInputStream, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super HttpResponse> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            Object byteArrayInputStream;
            a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
                String strMakeRequest = webRequest.makeRequest();
                if (strMakeRequest == null) {
                    strMakeRequest = "";
                }
                if (this.$withInputStream) {
                    byte[] bytes = strMakeRequest.getBytes(lk.c.f63591b);
                    ck.p.i(bytes, "this as java.lang.String).getBytes(charset)");
                    byteArrayInputStream = new ByteArrayInputStream(bytes);
                } else {
                    byteArrayInputStream = strMakeRequest;
                }
                int responseCode = webRequest.getResponseCode();
                Map<String, List<String>> headers = webRequest.getHeaders();
                String string = webRequest.getUrl().toString();
                ck.p.i(headers, "headers");
                ck.p.i(string, "toString()");
                return new HttpResponse(byteArrayInputStream, responseCode, headers, string, null, LegacyHttpClient.NETWORK_CLIENT_LEGACY, 0L, 80, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyHttpClient.kt */
    @d(c = "com.unity3d.services.core.network.core.LegacyHttpClient$executeBlocking$1", f = "LegacyHttpClient.kt", l = {26}, m = "invokeSuspend")
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
            return LegacyHttpClient.this.new AnonymousClass1(this.$request, cVar);
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
                LegacyHttpClient legacyHttpClient = LegacyHttpClient.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = HttpClient.DefaultImpls.execute$default(legacyHttpClient, httpRequest, false, this, 2, null);
                if (obj == objF) {
                    return objF;
                }
            }
            return obj;
        }
    }

    public LegacyHttpClient(ISDKDispatchers iSDKDispatchers) {
        ck.p.j(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, boolean z10, c<? super HttpResponse> cVar) {
        return h.g(this.dispatchers.getIo(), new AnonymousClass2(httpRequest, z10, null), cVar);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        ck.p.j(httpRequest, AdActivity.REQUEST_KEY_EXTRA);
        return (HttpResponse) h.e(this.dispatchers.getIo(), new AnonymousClass1(httpRequest, null));
    }
}
