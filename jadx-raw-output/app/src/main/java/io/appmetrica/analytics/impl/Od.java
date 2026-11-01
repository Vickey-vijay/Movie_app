package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Od extends FunctionReferenceImpl implements bk.l {
    public Od(Object obj) {
        super(1, obj, Pd.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        Pd pd2 = (Pd) this.receiver;
        pd2.f55731a.markCrashCompleted((String) obj);
        pd2.f55731a.deleteCompletedCrashes();
        return mj.r.f64562a;
    }
}
