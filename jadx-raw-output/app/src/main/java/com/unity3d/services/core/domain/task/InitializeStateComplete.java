package com.unity3d.services.core.domain.task;

import androidx.datastore.core.DataStore;
import ck.p;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Result;
import mj.r;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: InitializeStateComplete.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class InitializeStateComplete extends MetricTask<Params, r> {
    private final DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore;
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: InitializeStateComplete.kt */
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
        return m3183doWorkgIAlus((Params) baseParams, (c<? super Result<r>>) cVar);
    }

    public InitializeStateComplete(DataStore<ByteStringStoreOuterClass.ByteStringStore> dataStore, ISDKDispatchers iSDKDispatchers) {
        p.j(dataStore, "dataStore");
        p.j(iSDKDispatchers, "dispatchers");
        this.dataStore = dataStore;
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3183doWorkgIAlus(Params params, c<? super Result<r>> cVar) {
        InitializeStateComplete$doWork$1 initializeStateComplete$doWork$1;
        if (cVar instanceof InitializeStateComplete$doWork$1) {
            initializeStateComplete$doWork$1 = (InitializeStateComplete$doWork$1) cVar;
            int i10 = initializeStateComplete$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateComplete$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateComplete$doWork$1 = new InitializeStateComplete$doWork$1(this, cVar);
            }
        } else {
            initializeStateComplete$doWork$1 = new InitializeStateComplete$doWork$1(this, cVar);
        }
        Object objG = initializeStateComplete$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeStateComplete$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.dispatchers.getDefault();
            InitializeStateComplete$doWork$2 initializeStateComplete$doWork$2 = new InitializeStateComplete$doWork$2(params, this, null);
            initializeStateComplete$doWork$1.label = 1;
            objG = h.g(h0Var, initializeStateComplete$doWork$2, initializeStateComplete$doWork$1);
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
        return getMetricNameForInitializeTask("completion");
    }
}
