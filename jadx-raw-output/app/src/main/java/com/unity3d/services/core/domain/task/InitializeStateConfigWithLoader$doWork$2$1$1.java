package com.unity3d.services.core.domain.task;

import bk.p;
import com.safedk.android.utils.i;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateConfigWithLoader$doWork$2$1$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ Ref$ObjectRef<Configuration> $config;
    public final /* synthetic */ Ref$ObjectRef<IConfigurationLoader> $configurationLoader;
    public final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    public int label;
    public final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$1(Ref$ObjectRef<IConfigurationLoader> ref$ObjectRef, Ref$ObjectRef<Configuration> ref$ObjectRef2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, c<? super InitializeStateConfigWithLoader$doWork$2$1$1> cVar) {
        super(2, cVar);
        this.$configurationLoader = ref$ObjectRef;
        this.$config = ref$ObjectRef2;
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new InitializeStateConfigWithLoader$doWork$2$1$1(this.$configurationLoader, this.$config, this.this$0, this.$params, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            IConfigurationLoader iConfigurationLoader = this.$configurationLoader.element;
            final Ref$ObjectRef<Configuration> ref$ObjectRef = this.$config;
            final InitializeStateConfigWithLoader initializeStateConfigWithLoader = this.this$0;
            final InitializeStateConfigWithLoader.Params params = this.$params;
            iConfigurationLoader.loadConfiguration(new IConfigurationLoaderListener() { // from class: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1.1
                @Override // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                public void onError(String str) throws InitializationException {
                    ck.p.j(str, "errorMsg");
                    SDKMetricsSender sDKMetricsSender = initializeStateConfigWithLoader.sdkMetricsSender;
                    Metric metricNewEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                    ck.p.i(metricNewEmergencySwitchOff, "newEmergencySwitchOff()");
                    sDKMetricsSender.sendMetric(metricNewEmergencySwitchOff);
                    throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception(str), params.getConfig());
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
