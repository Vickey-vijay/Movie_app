package com.unity3d.ads.core.domain;

import android.content.Context;
import bk.p;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$client$1", f = "AndroidHttpClientProvider.kt", l = {78}, m = "invokeSuspend")
public final class AndroidHttpClientProvider$createHttpClient$client$1 extends SuspendLambda implements p<l0, c<? super HttpClient>, Object> {
    public final /* synthetic */ HttpClientSelection $selectedHttpClient;
    public int label;
    public final /* synthetic */ AndroidHttpClientProvider this$0;

    /* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HttpClientSelection.values().length];
            try {
                iArr[HttpClientSelection.OKHTTP3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HttpClientSelection.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClientProvider$createHttpClient$client$1(HttpClientSelection httpClientSelection, AndroidHttpClientProvider androidHttpClientProvider, c<? super AndroidHttpClientProvider$createHttpClient$client$1> cVar) {
        super(2, cVar);
        this.$selectedHttpClient = httpClientSelection;
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new AndroidHttpClientProvider$createHttpClient$client$1(this.$selectedHttpClient, this.this$0, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super HttpClient> cVar) {
        return ((AndroidHttpClientProvider$createHttpClient$client$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.$selectedHttpClient.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
                    Context context = androidHttpClientProvider.context;
                    ISDKDispatchers iSDKDispatchers = this.this$0.dispatchers;
                    HttpClientSelection httpClientSelection = this.$selectedHttpClient;
                    this.label = 1;
                    obj = androidHttpClientProvider.buildNetworkClient(context, iSDKDispatchers, httpClientSelection, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    return new LegacyHttpClient(this.this$0.dispatchers);
                }
            } else {
                return this.this$0.getOkHttp3Client();
            }
        }
        return (HttpClient) obj;
    }
}
