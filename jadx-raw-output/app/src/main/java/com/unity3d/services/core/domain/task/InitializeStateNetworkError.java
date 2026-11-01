package com.unity3d.services.core.domain.task;

import ck.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import kotlin.Result;
import mj.r;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: InitializeStateNetworkError.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class InitializeStateNetworkError extends MetricTask<Params, r> implements IConnectivityListener {
    private int connectedEventThreshold;
    private c<? super r> continuation;
    private final ISDKDispatchers dispatchers;
    private long lastConnectedEventTimeMs;
    private int maximumConnectedEvents;
    private int receivedConnectedEvents;

    /* JADX INFO: compiled from: InitializeStateNetworkError.kt */
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
        return m3191doWorkgIAlus((Params) baseParams, (c<? super Result<r>>) cVar);
    }

    public InitializeStateNetworkError(ISDKDispatchers iSDKDispatchers) {
        p.j(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
        this.maximumConnectedEvents = 500;
        this.connectedEventThreshold = 10000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListening(c<? super r> cVar) {
        this.continuation = cVar;
        ConnectivityMonitor.addListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3191doWorkgIAlus(Params params, c<? super Result<r>> cVar) throws Throwable {
        InitializeStateNetworkError$doWork$1 initializeStateNetworkError$doWork$1;
        if (cVar instanceof InitializeStateNetworkError$doWork$1) {
            initializeStateNetworkError$doWork$1 = (InitializeStateNetworkError$doWork$1) cVar;
            int i10 = initializeStateNetworkError$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateNetworkError$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateNetworkError$doWork$1 = new InitializeStateNetworkError$doWork$1(this, cVar);
            }
        } else {
            initializeStateNetworkError$doWork$1 = new InitializeStateNetworkError$doWork$1(this, cVar);
        }
        Object objG = initializeStateNetworkError$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeStateNetworkError$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.dispatchers.getDefault();
            InitializeStateNetworkError$doWork$2 initializeStateNetworkError$doWork$2 = new InitializeStateNetworkError$doWork$2(this, params, null);
            initializeStateNetworkError$doWork$1.label = 1;
            objG = h.g(h0Var, initializeStateNetworkError$doWork$2, initializeStateNetworkError$doWork$1);
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
        return getMetricNameForInitializeTask("error_network");
    }

    @Override // com.unity3d.services.core.connectivity.IConnectivityListener
    public void onConnected() {
        this.receivedConnectedEvents++;
        DeviceLog.debug("Unity Ads init got connected event");
        if (shouldHandleConnectedEvent()) {
            c<? super r> cVar = this.continuation;
            if (cVar != null) {
                Result.a aVar = Result.Companion;
                cVar.resumeWith(Result.m3458constructorimpl(r.f64562a));
            }
            this.continuation = null;
        }
        if (this.receivedConnectedEvents > this.maximumConnectedEvents) {
            ConnectivityMonitor.removeListener(this);
        }
        this.lastConnectedEventTimeMs = System.currentTimeMillis();
    }

    @Override // com.unity3d.services.core.connectivity.IConnectivityListener
    public void onDisconnected() {
        DeviceLog.debug("Unity Ads init got disconnected event");
    }

    private final boolean shouldHandleConnectedEvent() {
        if (System.currentTimeMillis() - this.lastConnectedEventTimeMs >= this.connectedEventThreshold && this.receivedConnectedEvents <= this.maximumConnectedEvents) {
            return true;
        }
        return false;
    }
}
