package com.unity3d.services.core.domain.task;

import android.app.Application;
import ck.p;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.Result;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes4.dex */
public class InitializeStateReset extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: InitializeStateReset.kt */
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
        return m3193doWorkgIAlus((Params) baseParams, (c<? super Result<? extends Configuration>>) cVar);
    }

    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3193doWorkgIAlus(Params params, c<? super Result<? extends Configuration>> cVar) {
        return m3192doWorkgIAlus$suspendImpl(this, params, cVar);
    }

    public InitializeStateReset(ISDKDispatchers iSDKDispatchers) {
        p.j(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s$suspendImpl, reason: not valid java name */
    public static /* synthetic */ Object m3192doWorkgIAlus$suspendImpl(InitializeStateReset initializeStateReset, Params params, c<? super Result<? extends Configuration>> cVar) throws Throwable {
        InitializeStateReset$doWork$1 initializeStateReset$doWork$1;
        if (cVar instanceof InitializeStateReset$doWork$1) {
            initializeStateReset$doWork$1 = (InitializeStateReset$doWork$1) cVar;
            int i10 = initializeStateReset$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateReset$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateReset$doWork$1 = new InitializeStateReset$doWork$1(initializeStateReset, cVar);
            }
        } else {
            initializeStateReset$doWork$1 = new InitializeStateReset$doWork$1(initializeStateReset, cVar);
        }
        Object objG = initializeStateReset$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeStateReset$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = initializeStateReset.dispatchers.getDefault();
            InitializeStateReset$doWork$2 initializeStateReset$doWork$2 = new InitializeStateReset$doWork$2(params, initializeStateReset, null);
            initializeStateReset$doWork$1.label = 1;
            objG = h.g(h0Var, initializeStateReset$doWork$2, initializeStateReset$doWork$1);
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
        return getMetricNameForInitializeTask("reset");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterLifecycleCallbacks() {
        if (Lifecycle.getLifecycleListener() != null) {
            Application application = ClientProperties.getApplication();
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
            }
            Lifecycle.setLifecycleListener(null);
        }
    }
}
