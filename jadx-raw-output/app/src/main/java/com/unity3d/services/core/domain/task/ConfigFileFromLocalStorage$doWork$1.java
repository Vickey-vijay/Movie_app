package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage", f = "ConfigFileFromLocalStorage.kt", l = {27}, m = "doWork-gIAlu-s")
public final class ConfigFileFromLocalStorage$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConfigFileFromLocalStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigFileFromLocalStorage$doWork$1(ConfigFileFromLocalStorage configFileFromLocalStorage, c<? super ConfigFileFromLocalStorage$doWork$1> cVar) {
        super(cVar);
        this.this$0 = configFileFromLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3179doWorkgIAlus = this.this$0.m3179doWorkgIAlus((ConfigFileFromLocalStorage.Params) null, (c<? super Result<? extends Configuration>>) this);
        return objM3179doWorkgIAlus == a.f() ? objM3179doWorkgIAlus : Result.m3457boximpl(objM3179doWorkgIAlus);
    }
}
