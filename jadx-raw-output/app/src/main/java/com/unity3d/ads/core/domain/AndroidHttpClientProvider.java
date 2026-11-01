package com.unity3d.ads.core.domain;

import android.content.Context;
import ck.p;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Locale;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutKt;
import lk.a0;
import mj.h;
import mk.b;
import mk.j;
import nj.l0;
import nk.l;
import nk.l1;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;
import rj.c;
import tj.d;
import tj.f;
import wk.g;

/* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private HttpClient cachedClient;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final wk.a mutex;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {74}, m = "createHttpClient")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
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
            return AndroidHttpClientProvider.this.createHttpClient(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {134, 57}, m = "invoke")
    public static final class C38801 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C38801(c<? super C38801> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(this);
        }
    }

    public AndroidHttpClientProvider(AlternativeFlowReader alternativeFlowReader, ISDKDispatchers iSDKDispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        p.j(alternativeFlowReader, "alternativeFlowReader");
        p.j(iSDKDispatchers, "dispatchers");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        p.j(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = iSDKDispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, c<? super HttpClient> cVar) {
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(l1.a(iSDKDispatchers.getIo()), new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> task) {
                String message;
                p.j(task, "it");
                String str = "Errored without message.";
                if (!task.isSuccessful()) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    Exception exception = task.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_install_error", null, l0.g(h.a("reason", str)), null, null, null, 58, null);
                    l<HttpClient> lVar = cVar2;
                    Result.a aVar = Result.Companion;
                    lVar.resumeWith(Result.m3458constructorimpl(this.this$0.getOkHttp3Client()));
                    return;
                }
                try {
                    CronetEngine.Builder builderCreateCronetEngineBuilder = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                    if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                        builderCreateCronetEngineBuilder.enableQuic(true);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                    }
                    CronetEngine cronetEngineBuild = builderCreateCronetEngineBuilder.build();
                    l<HttpClient> lVar2 = cVar2;
                    Result.a aVar2 = Result.Companion;
                    p.i(cronetEngineBuild, "cronetEngine");
                    lVar2.resumeWith(Result.m3458constructorimpl(new CronetClient(cronetEngineBuild, iSDKDispatchers)));
                } catch (Throwable th2) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    String message2 = th2.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_engine_error", null, l0.g(h.a("reason", message2 != null ? message2 : "Errored without message.")), null, null, null, 58, null);
                    l<HttpClient> lVar3 = cVar2;
                    Result.a aVar3 = Result.Companion;
                    lVar3.resumeWith(Result.m3458constructorimpl(this.this$0.getOkHttp3Client()));
                }
            }
        });
        Object objB = cVar2.B();
        if (objB == sj.a.f()) {
            f.c(cVar);
        }
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object createHttpClient(c<? super HttpClient> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objM3458constructorimpl;
        HttpClientSelection httpClientSelection;
        HttpClientSelection httpClientSelection2;
        long j10;
        AndroidHttpClientProvider androidHttpClientProvider;
        String str;
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
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (!this.alternativeFlowReader.invoke()) {
                return new LegacyHttpClient(this.dispatchers);
            }
            String stringTrait = this.mediationTraitsMetadataReader.getStringTrait(MediationTraitsMetadataReader.USE_HTTP_CLIENT);
            if (stringTrait != null) {
                try {
                    Result.a aVar = Result.Companion;
                    String upperCase = stringTrait.toUpperCase(Locale.ROOT);
                    p.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    objM3458constructorimpl = Result.m3458constructorimpl(HttpClientSelection.valueOf(upperCase));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                    objM3458constructorimpl = null;
                }
                httpClientSelection = (HttpClientSelection) objM3458constructorimpl;
                if (httpClientSelection == null) {
                    httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
                }
            } else {
                httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
            }
            long jB = j.f64572a.b();
            AndroidHttpClientProvider$createHttpClient$client$1 androidHttpClientProvider$createHttpClient$client$1 = new AndroidHttpClientProvider$createHttpClient$client$1(httpClientSelection, this, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = httpClientSelection;
            anonymousClass1.J$0 = jB;
            anonymousClass1.label = 1;
            Object objD = TimeoutKt.d(500L, androidHttpClientProvider$createHttpClient$client$1, anonymousClass1);
            if (objD == objF) {
                return objF;
            }
            httpClientSelection2 = httpClientSelection;
            obj = objD;
            j10 = jB;
            androidHttpClientProvider = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = anonymousClass1.J$0;
            httpClientSelection2 = (HttpClientSelection) anonymousClass1.L$1;
            androidHttpClientProvider = (AndroidHttpClientProvider) anonymousClass1.L$0;
            kotlin.c.b(obj);
        }
        HttpClient httpClient = (HttpClient) obj;
        double dG = b.G(j.a.e(j10), DurationUnit.MILLISECONDS);
        if (a0.X(httpClientSelection2.name(), "CRONET", false, 2, null)) {
            if (httpClient == null) {
                str = "native_cronet_timeout";
            } else {
                str = httpClient instanceof CronetClient ? "native_cronet_success_time" : "native_cronet_failure_time";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHttpClientProvider.sendDiagnosticEvent, str, tj.a.b(dG), null, null, null, null, 60, null);
        }
        return httpClient == null ? androidHttpClientProvider.getOkHttp3Client() : httpClient;
    }

    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new OkHttpClient());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    public Object invoke(c<? super HttpClient> cVar) throws Throwable {
        C38801 c38801;
        wk.a aVar;
        AndroidHttpClientProvider androidHttpClientProvider;
        wk.a aVar2;
        Throwable th2;
        AndroidHttpClientProvider androidHttpClientProvider2;
        if (cVar instanceof C38801) {
            c38801 = (C38801) cVar;
            int i10 = c38801.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38801.label = i10 - Integer.MIN_VALUE;
            } else {
                c38801 = new C38801(cVar);
            }
        } else {
            c38801 = new C38801(cVar);
        }
        Object obj = c38801.result;
        Object objF = sj.a.f();
        int i11 = c38801.label;
        try {
            if (i11 == 0) {
                kotlin.c.b(obj);
                aVar = this.mutex;
                c38801.L$0 = this;
                c38801.L$1 = aVar;
                c38801.label = 1;
                if (aVar.a(null, c38801) == objF) {
                    return objF;
                }
                androidHttpClientProvider = this;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (wk.a) c38801.L$1;
                    androidHttpClientProvider2 = (AndroidHttpClientProvider) c38801.L$0;
                    try {
                        kotlin.c.b(obj);
                        HttpClient httpClient = (HttpClient) obj;
                        androidHttpClientProvider2.cachedClient = httpClient;
                        aVar2.b(null);
                        return httpClient;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.b(null);
                        throw th2;
                    }
                }
                wk.a aVar3 = (wk.a) c38801.L$1;
                androidHttpClientProvider = (AndroidHttpClientProvider) c38801.L$0;
                kotlin.c.b(obj);
                aVar = aVar3;
            }
            HttpClient httpClient2 = androidHttpClientProvider.cachedClient;
            if (httpClient2 != null) {
                aVar.b(null);
                return httpClient2;
            }
            c38801.L$0 = androidHttpClientProvider;
            c38801.L$1 = aVar;
            c38801.label = 2;
            Object objCreateHttpClient = androidHttpClientProvider.createHttpClient(c38801);
            if (objCreateHttpClient == objF) {
                return objF;
            }
            aVar2 = aVar;
            obj = objCreateHttpClient;
            androidHttpClientProvider2 = androidHttpClientProvider;
            HttpClient httpClient3 = (HttpClient) obj;
            androidHttpClientProvider2.cachedClient = httpClient3;
            aVar2.b(null);
            return httpClient3;
        } catch (Throwable th4) {
            aVar2 = aVar;
            th2 = th4;
            aVar2.b(null);
            throw th2;
        }
    }
}
