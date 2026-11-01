package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import bk.p;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nj.n;
import nk.h;
import nk.h0;
import nk.l0;
import org.json.JSONArray;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final GetCachedAsset getCachedAsset;
    private final HttpClientProvider httpClientProvider;
    private final h0 ioDispatcher;

    /* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidExecuteAdViewerRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {28, 29}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super HttpResponse>, Object> {
        public final /* synthetic */ Object[] $parameters;
        public final /* synthetic */ RequestType $type;
        public int label;
        public final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$parameters = objArr;
            this.this$0 = androidExecuteAdViewerRequest;
            this.$type = requestType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.$parameters, this.this$0, this.$type, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super HttpResponse> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM3458constructorimpl;
            Object objInvoke;
            WebResourceResponse webResourceResponseInvoke$default;
            InputStream data;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Object objR = n.R(this.$parameters, 1);
                byte[] bArrC = null;
                String str = objR instanceof String ? (String) objR : null;
                if (str == null) {
                    str = "";
                }
                if (!(str.length() > 0)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                try {
                    Result.a aVar = Result.Companion;
                    Uri uri = Uri.parse(str);
                    ck.p.i(uri, "parse(this)");
                    objM3458constructorimpl = Result.m3458constructorimpl(uri);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                    objM3458constructorimpl = null;
                }
                Uri uri2 = (Uri) objM3458constructorimpl;
                if (uri2 != null) {
                    if (!(this.$type == RequestType.GET)) {
                        uri2 = null;
                    }
                    if (uri2 != null && (webResourceResponseInvoke$default = GetCachedAsset.invoke$default(this.this$0.getCachedAsset, uri2, null, 2, null)) != null && (data = webResourceResponseInvoke$default.getData()) != null) {
                        ck.p.i(data, "data");
                        bArrC = yj.a.c(data);
                    }
                }
                byte[] bArr = bArrC;
                if (bArr != null) {
                    return new HttpResponse(bArr, 0, null, null, null, null, 0L, 126, null);
                }
                HttpClientProvider httpClientProvider = this.this$0.httpClientProvider;
                this.label = 1;
                objInvoke = httpClientProvider.invoke(this);
                if (objInvoke == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                    return obj;
                }
                kotlin.c.b(obj);
                objInvoke = obj;
            }
            HttpRequest httpRequestCreateRequest = this.this$0.createRequest(this.$type, this.$parameters);
            this.label = 2;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequestCreateRequest, false, this, 2, null);
            return objExecute$default == objF ? objF : objExecute$default;
        }
    }

    public AndroidExecuteAdViewerRequest(h0 h0Var, HttpClientProvider httpClientProvider, GetCachedAsset getCachedAsset) {
        ck.p.j(h0Var, "ioDispatcher");
        ck.p.j(httpClientProvider, "httpClientProvider");
        ck.p.j(getCachedAsset, "getCachedAsset");
        this.ioDispatcher = h0Var;
        this.httpClientProvider = httpClientProvider;
        this.getCachedAsset = getCachedAsset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Map<String, List<String>> mapJ;
        Map<String, List<String>> mapJ2;
        String str = (String) n.R(objArr, 1);
        if (!(!(str == null || str.length() == 0))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            JSONArray jSONArray = (JSONArray) n.R(objArr, 2);
            Integer num = (Integer) n.R(objArr, 3);
            Integer num2 = (Integer) n.R(objArr, 4);
            if (jSONArray == null || (mapJ = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) {
                mapJ = kotlin.collections.a.j();
            }
            return new HttpRequest(str, null, requestType, null, mapJ, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = (String) n.R(objArr, 2);
        JSONArray jSONArray2 = (JSONArray) n.R(objArr, 3);
        Integer num3 = (Integer) n.R(objArr, 4);
        Integer num4 = (Integer) n.R(objArr, 5);
        if (jSONArray2 == null || (mapJ2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) {
            mapJ2 = kotlin.collections.a.j();
        }
        return new HttpRequest(str, null, requestType, str2, mapJ2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, c<? super HttpResponse> cVar) {
        return h.g(this.ioDispatcher, new AnonymousClass2(objArr, this, requestType, null), cVar);
    }
}
