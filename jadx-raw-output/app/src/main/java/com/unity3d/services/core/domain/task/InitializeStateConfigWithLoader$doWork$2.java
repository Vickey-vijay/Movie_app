package com.unity3d.services.core.domain.task;

import bk.p;
import ck.s;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationLoader;
import com.unity3d.services.core.configuration.ConfigurationRequestFactory;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.configuration.PrivacyConfigurationLoader;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;
import nk.h;
import nk.h0;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2", f = "InitializeStateConfigWithLoader.kt", l = {58, 101, 109}, m = "invokeSuspend")
public final class InitializeStateConfigWithLoader$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends Configuration>>, Object> {
    public final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2(InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, c<? super InitializeStateConfigWithLoader$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        InitializeStateConfigWithLoader$doWork$2 initializeStateConfigWithLoader$doWork$2 = new InitializeStateConfigWithLoader$doWork$2(this.this$0, this.$params, cVar);
        initializeStateConfigWithLoader$doWork$2.L$0 = obj;
        return initializeStateConfigWithLoader$doWork$2;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super Result<? extends Configuration>> cVar) {
        return ((InitializeStateConfigWithLoader$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01a9 A[Catch: all -> 0x0213, CancellationException -> 0x023c, TryCatch #7 {CancellationException -> 0x023c, all -> 0x0213, blocks: (B:8:0x001f, B:57:0x01d7, B:63:0x0208, B:51:0x01a1, B:53:0x01a9, B:58:0x01e1, B:59:0x01f3, B:50:0x0197, B:38:0x0159, B:40:0x0162, B:60:0x01f4, B:61:0x0201, B:62:0x0202, B:37:0x014f, B:23:0x0080), top: B:87:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e1 A[Catch: all -> 0x0213, CancellationException -> 0x023c, TryCatch #7 {CancellationException -> 0x023c, all -> 0x0213, blocks: (B:8:0x001f, B:57:0x01d7, B:63:0x0208, B:51:0x01a1, B:53:0x01a9, B:58:0x01e1, B:59:0x01f3, B:50:0x0197, B:38:0x0159, B:40:0x0162, B:60:0x01f4, B:61:0x0201, B:62:0x0202, B:37:0x014f, B:23:0x0080), top: B:87:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0224  */
    /* JADX WARN: Code duplicated, block: B:70:0x0229  */
    /* JADX WARN: Code duplicated, block: B:72:0x022f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, com.unity3d.services.core.configuration.Configuration] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.unity3d.services.core.configuration.PrivacyConfigurationLoader] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, com.unity3d.services.core.configuration.ConfigurationLoader] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Throwable thM3461exceptionOrNullimpl;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader;
        InitializeStateConfigWithLoader.Params params;
        Object objM3458constructorimpl2;
        InitializeStateConfigWithLoader initializeStateConfigWithLoader2;
        InitializeStateConfigWithLoader.Params params2;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$ObjectRef ref$ObjectRef5;
        Ref$ObjectRef ref$ObjectRef6;
        Object objMo3177invokegIAlus;
        Object objM3458constructorimpl3;
        Ref$ObjectRef ref$ObjectRef7;
        InitializeStateConfigWithLoader.Params params3;
        h0 io2;
        InitializeStateConfigWithLoader$doWork$2$1$1 initializeStateConfigWithLoader$doWork$2$1$1;
        Ref$ObjectRef ref$ObjectRef8;
        Ref$ObjectRef ref$ObjectRef9;
        T t10;
        Object objF = a.f();
        int i10 = this.label;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ref$ObjectRef2 = (Ref$ObjectRef) this.L$4;
                    ref$ObjectRef3 = (Ref$ObjectRef) this.L$3;
                    params = (InitializeStateConfigWithLoader.Params) this.L$2;
                    initializeStateConfigWithLoader = (InitializeStateConfigWithLoader) this.L$1;
                    try {
                        kotlin.c.b(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.a aVar = Result.Companion;
                        objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th));
                    }
                } else if (i10 == 2) {
                    ref$ObjectRef2 = (Ref$ObjectRef) this.L$4;
                    ref$ObjectRef6 = (Ref$ObjectRef) this.L$3;
                    ref$ObjectRef4 = (Ref$ObjectRef) this.L$2;
                    params2 = (InitializeStateConfigWithLoader.Params) this.L$1;
                    initializeStateConfigWithLoader2 = (InitializeStateConfigWithLoader) this.L$0;
                    try {
                        kotlin.c.b(obj);
                        objMo3177invokegIAlus = ((Result) obj).m3466unboximpl();
                        objM3458constructorimpl3 = Result.m3458constructorimpl(Result.m3457boximpl(objMo3177invokegIAlus));
                    } catch (Throwable th3) {
                        th = th3;
                        Result.a aVar2 = Result.Companion;
                        objM3458constructorimpl3 = Result.m3458constructorimpl(kotlin.c.a(th));
                    }
                    ref$ObjectRef7 = ref$ObjectRef6;
                    params3 = params2;
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl3)) {
                        throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params3.getConfig());
                    }
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    io2 = initializeStateConfigWithLoader2.dispatchers.getIo();
                    initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(ref$ObjectRef4, ref$ObjectRef7, initializeStateConfigWithLoader2, params3, null);
                    this.L$0 = ref$ObjectRef7;
                    this.L$1 = ref$ObjectRef2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (h.g(io2, initializeStateConfigWithLoader$doWork$2$1$1, this) == objF) {
                        return objF;
                    }
                    ref$ObjectRef8 = ref$ObjectRef2;
                    ref$ObjectRef9 = ref$ObjectRef7;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef8 = (Ref$ObjectRef) this.L$1;
                    ref$ObjectRef9 = (Ref$ObjectRef) this.L$0;
                    kotlin.c.b(obj);
                }
                Configuration configuration = (Configuration) ref$ObjectRef9.element;
                Ref$ObjectRef ref$ObjectRef10 = ref$ObjectRef9;
                ref$ObjectRef2 = ref$ObjectRef8;
                ref$ObjectRef5 = ref$ObjectRef10;
                t10 = configuration;
                ref$ObjectRef2.element = t10;
                objM3458constructorimpl = Result.m3458constructorimpl((Configuration) ref$ObjectRef5.element);
                if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                    objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
                } else {
                    thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                    if (thM3461exceptionOrNullimpl != null) {
                        objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                    }
                }
                return Result.m3457boximpl(objM3458constructorimpl);
            }
            kotlin.c.b(obj);
            l0 l0Var = (l0) this.L$0;
            InitializeStateConfigWithLoader initializeStateConfigWithLoader3 = this.this$0;
            InitializeStateConfigWithLoader.Params params4 = this.$params;
            Result.a aVar3 = Result.Companion;
            PrivacyConfigStorage privacyConfigStorage = PrivacyConfigStorage.getInstance();
            DeviceInfoDataFactory deviceInfoDataFactory = new DeviceInfoDataFactory(initializeStateConfigWithLoader3.sdkMetricsSender);
            Ref$ObjectRef ref$ObjectRef11 = new Ref$ObjectRef();
            ?? configurationLoader = new ConfigurationLoader(new ConfigurationRequestFactory(params4.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.TOKEN)), initializeStateConfigWithLoader3.sdkMetricsSender, (HttpClient) initializeStateConfigWithLoader3.getServiceProvider().getRegistry().getService("", s.b(HttpClient.class)));
            ref$ObjectRef11.element = configurationLoader;
            ref$ObjectRef11.element = new PrivacyConfigurationLoader((IConfigurationLoader) configurationLoader, new ConfigurationRequestFactory(params4.getConfig(), deviceInfoDataFactory.getDeviceInfoData(InitRequestType.PRIVACY)), privacyConfigStorage, (HttpClient) initializeStateConfigWithLoader3.getServiceProvider().getRegistry().getService("", s.b(HttpClient.class)));
            Ref$ObjectRef ref$ObjectRef12 = new Ref$ObjectRef();
            ref$ObjectRef12.element = new Configuration();
            try {
                int maxRetries = params4.getConfig().getMaxRetries();
                double retryScalingFactor = params4.getConfig().getRetryScalingFactor();
                long retryDelay = params4.getConfig().getRetryDelay();
                InitializationException initializationException = new InitializationException(ErrorState.NetworkConfigRequest, new Exception(), params4.getConfig());
                InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(initializeStateConfigWithLoader3, ref$ObjectRef11, ref$ObjectRef12, null);
                this.L$0 = l0Var;
                this.L$1 = initializeStateConfigWithLoader3;
                this.L$2 = params4;
                this.L$3 = ref$ObjectRef11;
                this.L$4 = ref$ObjectRef12;
                this.label = 1;
                ref$ObjectRef = ref$ObjectRef11;
                try {
                    if (TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateConfigWithLoader$doWork$2$1$configResult$1$1, this) == objF) {
                        return objF;
                    }
                    ref$ObjectRef2 = ref$ObjectRef12;
                    ref$ObjectRef3 = ref$ObjectRef;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader3;
                    params = params4;
                } catch (Throwable th4) {
                    th = th4;
                    ref$ObjectRef2 = ref$ObjectRef12;
                    ref$ObjectRef3 = ref$ObjectRef;
                    initializeStateConfigWithLoader = initializeStateConfigWithLoader3;
                    params = params4;
                    Result.a aVar4 = Result.Companion;
                    objM3458constructorimpl2 = Result.m3458constructorimpl(kotlin.c.a(th));
                }
            } catch (Throwable th5) {
                th = th5;
                ref$ObjectRef = ref$ObjectRef11;
            }
            objM3458constructorimpl2 = Result.m3458constructorimpl(r.f64562a);
            initializeStateConfigWithLoader2 = initializeStateConfigWithLoader;
            params2 = params;
            ref$ObjectRef4 = ref$ObjectRef3;
            if (Result.m3463isFailureimpl(objM3458constructorimpl2)) {
                Throwable thM3461exceptionOrNullimpl2 = Result.m3461exceptionOrNullimpl(objM3458constructorimpl2);
                if (thM3461exceptionOrNullimpl2 instanceof AbortRetryException) {
                    throw new InitializationException(ErrorState.NetworkConfigRequest, (Exception) thM3461exceptionOrNullimpl2, params2.getConfig());
                }
                try {
                    InitializeStateNetworkError initializeStateNetworkError = initializeStateConfigWithLoader2.initializeStateNetworkError;
                    InitializeStateNetworkError.Params params5 = new InitializeStateNetworkError.Params(params2.getConfig());
                    this.L$0 = initializeStateConfigWithLoader2;
                    this.L$1 = params2;
                    this.L$2 = ref$ObjectRef4;
                    this.L$3 = ref$ObjectRef2;
                    this.L$4 = ref$ObjectRef2;
                    this.label = 2;
                    objMo3177invokegIAlus = initializeStateNetworkError.mo3177invokegIAlus(params5, this);
                    if (objMo3177invokegIAlus == objF) {
                        return objF;
                    }
                    ref$ObjectRef6 = ref$ObjectRef2;
                    objM3458constructorimpl3 = Result.m3458constructorimpl(Result.m3457boximpl(objMo3177invokegIAlus));
                    ref$ObjectRef7 = ref$ObjectRef6;
                    params3 = params2;
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl3)) {
                        throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception("No connected events within the timeout!"), params3.getConfig());
                    }
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    io2 = initializeStateConfigWithLoader2.dispatchers.getIo();
                    initializeStateConfigWithLoader$doWork$2$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$1(ref$ObjectRef4, ref$ObjectRef7, initializeStateConfigWithLoader2, params3, null);
                    this.L$0 = ref$ObjectRef7;
                    this.L$1 = ref$ObjectRef2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                    if (h.g(io2, initializeStateConfigWithLoader$doWork$2$1$1, this) == objF) {
                        return objF;
                    }
                    ref$ObjectRef8 = ref$ObjectRef2;
                    ref$ObjectRef9 = ref$ObjectRef7;
                    Configuration configuration2 = (Configuration) ref$ObjectRef9.element;
                    Ref$ObjectRef ref$ObjectRef13 = ref$ObjectRef9;
                    ref$ObjectRef2 = ref$ObjectRef8;
                    ref$ObjectRef5 = ref$ObjectRef13;
                    t10 = configuration2;
                } catch (Throwable th6) {
                    th = th6;
                    ref$ObjectRef6 = ref$ObjectRef2;
                    Result.a aVar5 = Result.Companion;
                    objM3458constructorimpl3 = Result.m3458constructorimpl(kotlin.c.a(th));
                }
            } else {
                ref$ObjectRef5 = ref$ObjectRef2;
                t10 = (Configuration) ref$ObjectRef2.element;
            }
            ref$ObjectRef2.element = t10;
            objM3458constructorimpl = Result.m3458constructorimpl((Configuration) ref$ObjectRef5.element);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th7) {
            Result.a aVar6 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th7));
        }
        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
        } else {
            thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl != null) {
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
            }
        }
        return Result.m3457boximpl(objM3458constructorimpl);
    }
}
