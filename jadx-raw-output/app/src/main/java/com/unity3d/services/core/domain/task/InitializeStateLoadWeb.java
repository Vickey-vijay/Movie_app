package com.unity3d.services.core.domain.task;

import ck.p;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Result;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class InitializeStateLoadWeb extends MetricTask<Params, LoadWebResult> {
    private final ISDKDispatchers dispatchers;
    private final HttpClientProvider httpClientProvider;
    private final InitializeStateNetworkError initializeStateNetworkError;

    /* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
    public static final class LoadWebResult {
        private final Configuration config;
        private final String webViewDataString;

        public static /* synthetic */ LoadWebResult copy$default(LoadWebResult loadWebResult, Configuration configuration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = loadWebResult.config;
            }
            if ((i10 & 2) != 0) {
                str = loadWebResult.webViewDataString;
            }
            return loadWebResult.copy(configuration, str);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final String component2() {
            return this.webViewDataString;
        }

        public final LoadWebResult copy(Configuration configuration, String str) {
            p.j(configuration, "config");
            p.j(str, "webViewDataString");
            return new LoadWebResult(configuration, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadWebResult)) {
                return false;
            }
            LoadWebResult loadWebResult = (LoadWebResult) obj;
            return p.e(this.config, loadWebResult.config) && p.e(this.webViewDataString, loadWebResult.webViewDataString);
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewDataString.hashCode();
        }

        public String toString() {
            return "LoadWebResult(config=" + this.config + ", webViewDataString=" + this.webViewDataString + ')';
        }

        public LoadWebResult(Configuration configuration, String str) {
            p.j(configuration, "config");
            p.j(str, "webViewDataString");
            this.config = configuration;
            this.webViewDataString = str;
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewDataString() {
            return this.webViewDataString;
        }
    }

    /* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
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
        return m3190doWorkgIAlus((Params) baseParams, (c<? super Result<LoadWebResult>>) cVar);
    }

    public InitializeStateLoadWeb(ISDKDispatchers iSDKDispatchers, InitializeStateNetworkError initializeStateNetworkError, HttpClientProvider httpClientProvider) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(initializeStateNetworkError, "initializeStateNetworkError");
        p.j(httpClientProvider, "httpClientProvider");
        this.dispatchers = iSDKDispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.httpClientProvider = httpClientProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3190doWorkgIAlus(Params params, c<? super Result<LoadWebResult>> cVar) {
        InitializeStateLoadWeb$doWork$1 initializeStateLoadWeb$doWork$1;
        if (cVar instanceof InitializeStateLoadWeb$doWork$1) {
            initializeStateLoadWeb$doWork$1 = (InitializeStateLoadWeb$doWork$1) cVar;
            int i10 = initializeStateLoadWeb$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateLoadWeb$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateLoadWeb$doWork$1 = new InitializeStateLoadWeb$doWork$1(this, cVar);
            }
        } else {
            initializeStateLoadWeb$doWork$1 = new InitializeStateLoadWeb$doWork$1(this, cVar);
        }
        Object objG = initializeStateLoadWeb$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeStateLoadWeb$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.dispatchers.getDefault();
            InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(params, this, null);
            initializeStateLoadWeb$doWork$1.label = 1;
            objG = h.g(h0Var, initializeStateLoadWeb$doWork$2, initializeStateLoadWeb$doWork$1);
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
        return getMetricNameForInitializeTask("download_web_view");
    }
}
