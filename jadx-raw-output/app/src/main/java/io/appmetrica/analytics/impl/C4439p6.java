package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4439p6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4655xn apply(Thread thread) {
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        return new C4655xn(name, priority, id2, threadGroup != null ? threadGroup.getName() : "", null, null);
    }
}
