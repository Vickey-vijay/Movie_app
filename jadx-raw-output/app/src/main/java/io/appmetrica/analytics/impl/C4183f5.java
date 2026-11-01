package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4183f5 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4183f5 f56711a = new C4183f5();

    public C4183f5() {
        super(1);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
