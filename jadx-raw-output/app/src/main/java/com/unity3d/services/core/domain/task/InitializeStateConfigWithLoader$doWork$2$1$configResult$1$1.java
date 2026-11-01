package com.unity3d.services.core.domain.task;

import bk.p;
import com.safedk.android.utils.i;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import nk.h;
import nk.h0;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", f = "InitializeStateConfigWithLoader.kt", l = {69}, m = "invokeSuspend")
public final class InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 extends SuspendLambda implements p<Integer, c<? super r>, Object> {
    public final /* synthetic */ Ref$ObjectRef<Configuration> $config;
    public final /* synthetic */ Ref$ObjectRef<IConfigurationLoader> $configurationLoader;
    public /* synthetic */ int I$0;
    public int label;
    public final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, Ref$ObjectRef<IConfigurationLoader> ref$ObjectRef, Ref$ObjectRef<Configuration> ref$ObjectRef2, c<? super InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1> cVar) {
        super(2, cVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$configurationLoader = ref$ObjectRef;
        this.$config = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(this.this$0, this.$configurationLoader, this.$config, cVar);
        initializeStateConfigWithLoader$doWork$2$1$configResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateConfigWithLoader$doWork$2$1$configResult$1$1;
    }

    public final Object invoke(int i10, c<? super r> cVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1) create(Integer.valueOf(i10), cVar)).invokeSuspend(r.f64562a);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo1invoke(Integer num, c<? super r> cVar) {
        return invoke(num.intValue(), cVar);
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
    @d(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ Ref$ObjectRef<Configuration> $config;
        public final /* synthetic */ Ref$ObjectRef<IConfigurationLoader> $configurationLoader;
        public int label;
        public final /* synthetic */ InitializeStateConfigWithLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef<IConfigurationLoader> ref$ObjectRef, Ref$ObjectRef<Configuration> ref$ObjectRef2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$configurationLoader = ref$ObjectRef;
            this.$config = ref$ObjectRef2;
            this.this$0 = initializeStateConfigWithLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Exception {
            a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                IConfigurationLoader iConfigurationLoader = this.$configurationLoader.element;
                final Ref$ObjectRef<Configuration> ref$ObjectRef = this.$config;
                final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
                iConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork.2.1.configResult.1.1.1.1
                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onError(String str) throws AbortRetryException {
                        ck.p.j(str, "errorMsg");
                        SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                        Metric metricNewEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                        ck.p.i(metricNewEmergencySwitchOff, "newEmergencySwitchOff()");
                        sDKMetricsSender.sendMetric(metricNewEmergencySwitchOff);
                        throw new AbortRetryException(str);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onSuccess(Configuration configuration) {
                        ck.p.j(configuration, i.f44984c);
                        ref$ObjectRef.element = configuration;
                        configuration.saveToDisk();
                        initializeStateConfigWithLoader.tokenStorage.setInitToken(ref$ObjectRef.element.getUnifiedAuctionToken());
                    }
                });
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
                InitializeEventsMetricSender.getInstance().onRetryConfig();
            }
            h0 io2 = this.this$0.dispatchers.getIo();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$configurationLoader, this.$config, this.this$0, null);
            this.label = 1;
            if (h.g(io2, anonymousClass1, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
