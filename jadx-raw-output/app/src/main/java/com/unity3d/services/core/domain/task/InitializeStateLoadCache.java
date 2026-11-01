package com.unity3d.services.core.domain.task;

import ck.i;
import ck.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import kotlin.Result;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: InitializeStateLoadCache.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class InitializeStateLoadCache extends MetricTask<Params, LoadCacheResult> {
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: InitializeStateLoadCache.kt */
    public static final class LoadCacheResult {
        private final boolean hasHashMismatch;
        private final String webViewData;

        public LoadCacheResult(boolean z10, String str) {
            this.hasHashMismatch = z10;
            this.webViewData = str;
        }

        public static /* synthetic */ LoadCacheResult copy$default(LoadCacheResult loadCacheResult, boolean z10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = loadCacheResult.hasHashMismatch;
            }
            if ((i10 & 2) != 0) {
                str = loadCacheResult.webViewData;
            }
            return loadCacheResult.copy(z10, str);
        }

        public final boolean component1() {
            return this.hasHashMismatch;
        }

        public final String component2() {
            return this.webViewData;
        }

        public final LoadCacheResult copy(boolean z10, String str) {
            return new LoadCacheResult(z10, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadCacheResult)) {
                return false;
            }
            LoadCacheResult loadCacheResult = (LoadCacheResult) obj;
            return this.hasHashMismatch == loadCacheResult.hasHashMismatch && p.e(this.webViewData, loadCacheResult.webViewData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.hasHashMismatch;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = r10 * 31;
            String str = this.webViewData;
            return i10 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LoadCacheResult(hasHashMismatch=" + this.hasHashMismatch + ", webViewData=" + this.webViewData + ')';
        }

        public /* synthetic */ LoadCacheResult(boolean z10, String str, int i10, i iVar) {
            this(z10, (i10 & 2) != 0 ? null : str);
        }

        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        public final String getWebViewData() {
            return this.webViewData;
        }
    }

    /* JADX INFO: compiled from: InitializeStateLoadCache.kt */
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
        return m3189doWorkgIAlus((Params) baseParams, (c<? super Result<LoadCacheResult>>) cVar);
    }

    public InitializeStateLoadCache(ISDKDispatchers iSDKDispatchers) {
        p.j(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getWebViewData() {
        try {
            return Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
        } catch (Exception e10) {
            DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e10.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3189doWorkgIAlus(Params params, c<? super Result<LoadCacheResult>> cVar) {
        InitializeStateLoadCache$doWork$1 initializeStateLoadCache$doWork$1;
        if (cVar instanceof InitializeStateLoadCache$doWork$1) {
            initializeStateLoadCache$doWork$1 = (InitializeStateLoadCache$doWork$1) cVar;
            int i10 = initializeStateLoadCache$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateLoadCache$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateLoadCache$doWork$1 = new InitializeStateLoadCache$doWork$1(this, cVar);
            }
        } else {
            initializeStateLoadCache$doWork$1 = new InitializeStateLoadCache$doWork$1(this, cVar);
        }
        Object objG = initializeStateLoadCache$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeStateLoadCache$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.dispatchers.getDefault();
            InitializeStateLoadCache$doWork$2 initializeStateLoadCache$doWork$2 = new InitializeStateLoadCache$doWork$2(this, params, null);
            initializeStateLoadCache$doWork$1.label = 1;
            objG = h.g(h0Var, initializeStateLoadCache$doWork$2, initializeStateLoadCache$doWork$1);
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
        return getMetricNameForInitializeTask("read_local_webview");
    }
}
