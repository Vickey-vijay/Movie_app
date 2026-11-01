package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h;
import nk.h0;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1", f = "InitializeStateLoadWeb.kt", l = {57}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 extends SuspendLambda implements p<Integer, c<? super HttpResponse>, Object> {
    public final /* synthetic */ HttpRequest $request;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, c<? super InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1> cVar) {
        super(2, cVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 = new InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(this.this$0, this.$request, cVar);
        initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1;
    }

    public final Object invoke(int i10, c<? super HttpResponse> cVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1) create(Integer.valueOf(i10), cVar)).invokeSuspend(r.f64562a);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(Integer num, c<? super HttpResponse> cVar) {
        return invoke(num.intValue(), cVar);
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
    @d(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1", f = "InitializeStateLoadWeb.kt", l = {57, 57}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super HttpResponse>, Object> {
        public final /* synthetic */ HttpRequest $request;
        public int label;
        public final /* synthetic */ InitializeStateLoadWeb this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = initializeStateLoadWeb;
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$request, cVar);
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
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                }
                return obj;
            }
            kotlin.c.b(obj);
            HttpClientProvider httpClientProvider = this.this$0.httpClientProvider;
            this.label = 1;
            obj = httpClientProvider.invoke(this);
            if (obj == objF) {
                return objF;
            }
            HttpRequest httpRequest = this.$request;
            this.label = 2;
            obj = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest, false, this, 2, null);
            if (obj == objF) {
                return objF;
            }
            return obj;
        }
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
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryWebview();
            }
            h0 io2 = this.this$0.dispatchers.getIo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, null);
            this.label = 1;
            obj = h.g(io2, anonymousClass1, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
