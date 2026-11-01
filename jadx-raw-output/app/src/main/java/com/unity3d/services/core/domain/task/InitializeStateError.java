package com.unity3d.services.core.domain.task;

import ck.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Result;
import mj.r;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: InitializeStateError.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class InitializeStateError extends MetricTask<Params, r> {
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: compiled from: InitializeStateError.kt */
    public static final class Params implements BaseParams {
        private final Configuration config;
        private final ErrorState errorState;
        private final Exception exception;

        public static /* synthetic */ Params copy$default(Params params, ErrorState errorState, Exception exc, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = params.errorState;
            }
            if ((i10 & 2) != 0) {
                exc = params.exception;
            }
            if ((i10 & 4) != 0) {
                configuration = params.config;
            }
            return params.copy(errorState, exc, configuration);
        }

        public final ErrorState component1() {
            return this.errorState;
        }

        public final Exception component2() {
            return this.exception;
        }

        public final Configuration component3() {
            return this.config;
        }

        public final Params copy(ErrorState errorState, Exception exc, Configuration configuration) {
            p.j(errorState, "errorState");
            p.j(exc, "exception");
            p.j(configuration, "config");
            return new Params(errorState, exc, configuration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.errorState == params.errorState && p.e(this.exception, params.exception) && p.e(this.config, params.config);
        }

        public int hashCode() {
            return (((this.errorState.hashCode() * 31) + this.exception.hashCode()) * 31) + this.config.hashCode();
        }

        public String toString() {
            return "Params(errorState=" + this.errorState + ", exception=" + this.exception + ", config=" + this.config + ')';
        }

        public Params(ErrorState errorState, Exception exc, Configuration configuration) {
            p.j(errorState, "errorState");
            p.j(exc, "exception");
            p.j(configuration, "config");
            this.errorState = errorState;
            this.exception = exc;
            this.config = configuration;
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final Exception getException() {
            return this.exception;
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo3176doWorkgIAlus(BaseParams baseParams, c cVar) {
        return m3188doWorkgIAlus((Params) baseParams, (c<? super Result<r>>) cVar);
    }

    public InitializeStateError(ISDKDispatchers iSDKDispatchers) {
        p.j(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3188doWorkgIAlus(Params params, c<? super Result<r>> cVar) {
        InitializeStateError$doWork$1 initializeStateError$doWork$1;
        if (cVar instanceof InitializeStateError$doWork$1) {
            initializeStateError$doWork$1 = (InitializeStateError$doWork$1) cVar;
            int i10 = initializeStateError$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeStateError$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeStateError$doWork$1 = new InitializeStateError$doWork$1(this, cVar);
            }
        } else {
            initializeStateError$doWork$1 = new InitializeStateError$doWork$1(this, cVar);
        }
        Object objG = initializeStateError$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeStateError$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.dispatchers.getDefault();
            InitializeStateError$doWork$2 initializeStateError$doWork$2 = new InitializeStateError$doWork$2(params, null);
            initializeStateError$doWork$1.label = 1;
            objG = h.g(h0Var, initializeStateError$doWork$2, initializeStateError$doWork$1);
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
        return getMetricNameForInitializeTask("error");
    }
}
