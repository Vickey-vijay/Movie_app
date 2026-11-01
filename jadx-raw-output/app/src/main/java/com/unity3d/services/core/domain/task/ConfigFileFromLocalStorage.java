package com.unity3d.services.core.domain.task;

import ck.i;
import ck.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Result;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ConfigFileFromLocalStorage extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
    public static final class Params implements BaseParams {
        private final Configuration defaultConfiguration;

        /* JADX WARN: Multi-variable type inference failed */
        public Params() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Params(Configuration configuration) {
            p.j(configuration, "defaultConfiguration");
            this.defaultConfiguration = configuration;
        }

        public final Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }

        public /* synthetic */ Params(Configuration configuration, int i10, i iVar) {
            this((i10 & 1) != 0 ? new Configuration() : configuration);
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo3176doWorkgIAlus(BaseParams baseParams, c cVar) {
        return m3179doWorkgIAlus((Params) baseParams, (c<? super Result<? extends Configuration>>) cVar);
    }

    public ConfigFileFromLocalStorage(ISDKDispatchers iSDKDispatchers) {
        p.j(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3179doWorkgIAlus(Params params, c<? super Result<? extends Configuration>> cVar) {
        ConfigFileFromLocalStorage$doWork$1 configFileFromLocalStorage$doWork$1;
        if (cVar instanceof ConfigFileFromLocalStorage$doWork$1) {
            configFileFromLocalStorage$doWork$1 = (ConfigFileFromLocalStorage$doWork$1) cVar;
            int i10 = configFileFromLocalStorage$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                configFileFromLocalStorage$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                configFileFromLocalStorage$doWork$1 = new ConfigFileFromLocalStorage$doWork$1(this, cVar);
            }
        } else {
            configFileFromLocalStorage$doWork$1 = new ConfigFileFromLocalStorage$doWork$1(this, cVar);
        }
        Object objG = configFileFromLocalStorage$doWork$1.result;
        Object objF = a.f();
        int i11 = configFileFromLocalStorage$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 io2 = this.dispatchers.getIo();
            ConfigFileFromLocalStorage$doWork$2 configFileFromLocalStorage$doWork$2 = new ConfigFileFromLocalStorage$doWork$2(params, null);
            configFileFromLocalStorage$doWork$1.label = 1;
            objG = h.g(io2, configFileFromLocalStorage$doWork$2, configFileFromLocalStorage$doWork$1);
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
        return getMetricNameForInitializeTask("read_local_config");
    }
}
