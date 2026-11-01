package com.yandex.div.histogram;

import bk.a;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: HistogramConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1 extends FunctionReferenceImpl implements a<NoOpHistogramBridge> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1();

    public HistogramConfiguration$DefaultHistogramConfiguration$histogramBridge$1() {
        super(0, NoOpHistogramBridge.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // bk.a
    public final NoOpHistogramBridge invoke() {
        return new NoOpHistogramBridge();
    }
}
