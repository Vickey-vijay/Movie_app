package com.unity3d.services.core.domain.task;

import bk.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import org.json.JSONObject;
import rj.c;
import sj.a;
import tj.d;
import yj.g;

/* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", l = {}, m = "invokeSuspend")
public final class ConfigFileFromLocalStorage$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends Configuration>>, Object> {
    public final /* synthetic */ ConfigFileFromLocalStorage.Params $params;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$2(ConfigFileFromLocalStorage.Params params, c<? super ConfigFileFromLocalStorage$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new ConfigFileFromLocalStorage$doWork$2(this.$params, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super Result<? extends Configuration>> cVar) {
        return ((ConfigFileFromLocalStorage$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Configuration configuration;
        a.f();
        if (this.label == 0) {
            kotlin.c.b(obj);
            ConfigFileFromLocalStorage.Params params = this.$params;
            try {
                Result.a aVar = Result.Companion;
                File file = new File(SdkProperties.getLocalConfigurationFilepath());
                if (!file.exists()) {
                    configuration = params.getDefaultConfiguration();
                } else {
                    configuration = new Configuration(new JSONObject(g.k(file, null, 1, null)));
                }
                objM3458constructorimpl = Result.m3458constructorimpl(configuration);
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = Result.m3458constructorimpl(objM3458constructorimpl);
            } else {
                Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
                if (thM3461exceptionOrNullimpl != null) {
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(thM3461exceptionOrNullimpl));
                }
            }
            return Result.m3457boximpl(objM3458constructorimpl);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
