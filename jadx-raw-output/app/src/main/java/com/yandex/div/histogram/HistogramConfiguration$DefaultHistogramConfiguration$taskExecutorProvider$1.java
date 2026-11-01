package com.yandex.div.histogram;

import bk.a;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: HistogramConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 extends FunctionReferenceImpl implements a<DefaultTaskExecutor> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1();

    public HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1() {
        super(0, DefaultTaskExecutor.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // bk.a
    public final DefaultTaskExecutor invoke() {
        return new DefaultTaskExecutor();
    }
}
