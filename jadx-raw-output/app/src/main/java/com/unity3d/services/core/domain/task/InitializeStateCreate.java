package com.unity3d.services.core.domain.task;

import ck.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Result;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: InitializeStateCreate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class InitializeStateCreate extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: InitializeStateCreate.kt */
    public static final class Params implements BaseParams {
        private final Configuration config;
        private final String webViewData;

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            if ((i10 & 2) != 0) {
                str = params.webViewData;
            }
            return params.copy(configuration, str);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final String component2() {
            return this.webViewData;
        }

        public final Params copy(Configuration configuration, String str) {
            p.j(configuration, "config");
            p.j(str, "webViewData");
            return new Params(configuration, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return p.e(this.config, params.config) && p.e(this.webViewData, params.webViewData);
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewData.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ", webViewData=" + this.webViewData + ')';
        }

        public Params(Configuration configuration, String str) {
            p.j(configuration, "config");
            p.j(str, "webViewData");
            this.config = configuration;
            this.webViewData = str;
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewData() {
            return this.webViewData;
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo3176doWorkgIAlus(BaseParams baseParams, c cVar) {
        return m3187doWorkgIAlus((Params) baseParams, (c<? super Result<? extends Configuration>>) cVar);
    }

    public InitializeStateCreate(ISDKDispatchers iSDKDispatchers) {
        p.j(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3187doWorkgIAlus(Params params, c<? super Result<? extends Configuration>> cVar) {
        InitializeStateCreate$doWork$1 initializeStateCreate$doWork$1;
        if (cVar instanceof InitializeStateCreate$doWork$1) {
            initializeStateCreate$doWork$1 = (InitializeStateCreate$doWork$1) cVar;
            int i10 = initializeStateCreate$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateCreate$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateCreate$doWork$1 = new InitializeStateCreate$doWork$1(this, cVar);
            }
        } else {
            initializeStateCreate$doWork$1 = new InitializeStateCreate$doWork$1(this, cVar);
        }
        Object objG = initializeStateCreate$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeStateCreate$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.dispatchers.getDefault();
            InitializeStateCreate$doWork$2 initializeStateCreate$doWork$2 = new InitializeStateCreate$doWork$2(params, null);
            initializeStateCreate$doWork$1.label = 1;
            objG = h.g(h0Var, initializeStateCreate$doWork$2, initializeStateCreate$doWork$1);
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
        return getMetricNameForInitializeTask("create_web_view");
    }
}
