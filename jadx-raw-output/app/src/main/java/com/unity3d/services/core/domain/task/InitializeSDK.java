package com.unity3d.services.core.domain.task;

import ck.p;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import nk.h;
import nk.h0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class InitializeSDK extends MetricTask<EmptyParams, r> {
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final ISDKDispatchers dispatchers;
    private final InitializeStateComplete initializeStateComplete;
    private final InitializeStateConfig initializeStateConfig;
    private final InitializeStateCreate initializeStateCreate;
    private final InitializeStateError initializeStateError;
    private final InitializeStateLoadCache initializeStateLoadCache;
    private final InitializeStateLoadWeb initializeStateLoadWeb;
    private final InitializeStateReset initializeStateReset;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1, reason: invalid class name */
    /* JADX INFO: compiled from: InitializeSDK.kt */
    @d(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {111}, m = "handleInitializationException")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitializeSDK.this.handleInitializationException(null, this);
        }
    }

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ Object mo3176doWorkgIAlus(BaseParams baseParams, c cVar) {
        return m3182doWorkgIAlus((EmptyParams) baseParams, (c<? super Result<r>>) cVar);
    }

    public InitializeSDK(ISDKDispatchers iSDKDispatchers, ConfigFileFromLocalStorage configFileFromLocalStorage, InitializeStateReset initializeStateReset, InitializeStateError initializeStateError, InitializeStateConfig initializeStateConfig, InitializeStateCreate initializeStateCreate, InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadWeb initializeStateLoadWeb, InitializeStateComplete initializeStateComplete) {
        p.j(iSDKDispatchers, "dispatchers");
        p.j(configFileFromLocalStorage, "configFileFromLocalStorage");
        p.j(initializeStateReset, "initializeStateReset");
        p.j(initializeStateError, "initializeStateError");
        p.j(initializeStateConfig, "initializeStateConfig");
        p.j(initializeStateCreate, "initializeStateCreate");
        p.j(initializeStateLoadCache, "initializeStateLoadCache");
        p.j(initializeStateLoadWeb, "initializeStateLoadWeb");
        p.j(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = iSDKDispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: executeErrorState-BWLJW6A, reason: not valid java name */
    public final Object m3181executeErrorStateBWLJW6A(ErrorState errorState, Throwable th2, Configuration configuration, c<? super Result<r>> cVar) throws Throwable {
        InitializeSDK$executeErrorState$1 initializeSDK$executeErrorState$1;
        if (cVar instanceof InitializeSDK$executeErrorState$1) {
            initializeSDK$executeErrorState$1 = (InitializeSDK$executeErrorState$1) cVar;
            int i10 = initializeSDK$executeErrorState$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeSDK$executeErrorState$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeSDK$executeErrorState$1 = new InitializeSDK$executeErrorState$1(this, cVar);
            }
        } else {
            initializeSDK$executeErrorState$1 = new InitializeSDK$executeErrorState$1(this, cVar);
        }
        Object obj = initializeSDK$executeErrorState$1.result;
        Object objF = a.f();
        int i11 = initializeSDK$executeErrorState$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            return ((Result) obj).m3466unboximpl();
        }
        kotlin.c.b(obj);
        InitializeStateError initializeStateError = this.initializeStateError;
        InitializeStateError.Params params = new InitializeStateError.Params(errorState, new Exception(th2 != null ? th2.getMessage() : null), configuration);
        initializeSDK$executeErrorState$1.label = 1;
        Object objMo3177invokegIAlus = initializeStateError.mo3177invokegIAlus(params, initializeSDK$executeErrorState$1);
        return objMo3177invokegIAlus == objF ? objF : objMo3177invokegIAlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleInitializationException(InitializationException initializationException, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InitializationException initializationException2 = (InitializationException) anonymousClass1.L$0;
            kotlin.c.b(obj);
            ((Result) obj).m3466unboximpl();
            throw initializationException2;
        }
        kotlin.c.b(obj);
        ErrorState errorState = initializationException.getErrorState();
        Throwable originalException = initializationException.getOriginalException();
        Configuration config = initializationException.getConfig();
        anonymousClass1.L$0 = initializationException;
        anonymousClass1.label = 1;
        if (m3181executeErrorStateBWLJW6A(errorState, originalException, config, anonymousClass1) == objF) {
            return objF;
        }
        throw initializationException;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public Object m3182doWorkgIAlus(EmptyParams emptyParams, c<? super Result<r>> cVar) {
        InitializeSDK$doWork$1 initializeSDK$doWork$1;
        if (cVar instanceof InitializeSDK$doWork$1) {
            initializeSDK$doWork$1 = (InitializeSDK$doWork$1) cVar;
            int i10 = initializeSDK$doWork$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                initializeSDK$doWork$1.label = i10 - Integer.MIN_VALUE;
            } else {
                initializeSDK$doWork$1 = new InitializeSDK$doWork$1(this, cVar);
            }
        } else {
            initializeSDK$doWork$1 = new InitializeSDK$doWork$1(this, cVar);
        }
        Object objG = initializeSDK$doWork$1.result;
        Object objF = a.f();
        int i11 = initializeSDK$doWork$1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.dispatchers.getDefault();
            InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this, null);
            initializeSDK$doWork$1.label = 1;
            objG = h.g(h0Var, initializeSDK$doWork$2, initializeSDK$doWork$1);
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
        return getMetricNameForInitializeTask(MobileAdsBridgeBase.initializeMethodName);
    }
}
