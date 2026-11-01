package com.unity3d.services.core.domain.task;

import ck.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Result;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: InitializeStateConfig.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class InitializeStateConfig extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;
    private final InitializeStateConfigWithLoader initializeStateConfigWithLoader;

    /* JADX INFO: compiled from: InitializeStateConfig.kt */
    public static final class Params implements BaseParams {
        private final Configuration config;

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration configuration) {
            p.j(configuration, "config");
            return new Params(configuration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && p.e(this.config, ((Params) obj).config);
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }

        public Params(Configuration configuration) {
            p.j(configuration, "config");
            this.config = configuration;
        }

        public final Configuration getConfig() {
            return this.config;
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo3176doWorkgIAlus(BaseParams baseParams, c cVar) {
        return m3184doWorkgIAlus((Params) baseParams, (c<? super Result<? extends Configuration>>) cVar);
    }

    public InitializeStateConfig(ISDKDispatchers iSDKDispatchers, InitializeStateConfigWithLoader initializeStateConfigWithLoader) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(initializeStateConfigWithLoader, "initializeStateConfigWithLoader");
        this.dispatchers = iSDKDispatchers;
        this.initializeStateConfigWithLoader = initializeStateConfigWithLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3184doWorkgIAlus(Params params, c<? super Result<? extends Configuration>> cVar) {
        InitializeStateConfig$doWork$1 initializeStateConfig$doWork$1;
        if (cVar instanceof InitializeStateConfig$doWork$1) {
            initializeStateConfig$doWork$1 = (InitializeStateConfig$doWork$1) cVar;
            int i10 = initializeStateConfig$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateConfig$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateConfig$doWork$1 = new InitializeStateConfig$doWork$1(this, cVar);
            }
        } else {
            initializeStateConfig$doWork$1 = new InitializeStateConfig$doWork$1(this, cVar);
        }
        Object objG = initializeStateConfig$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeStateConfig$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.dispatchers.getDefault();
            InitializeStateConfig$doWork$2 initializeStateConfig$doWork$2 = new InitializeStateConfig$doWork$2(params, this, null);
            initializeStateConfig$doWork$1.label = 1;
            objG = h.g(h0Var, initializeStateConfig$doWork$2, initializeStateConfig$doWork$1);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objG);
        }
        return ((Result) objG).m3466unboximpl();
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public String getMetricName() {
        return getMetricNameForInitializeTask("config_fetch");
    }
}
