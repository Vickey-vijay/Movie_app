package com.yandex.div.histogram;

import bk.a;
import com.yandex.div.histogram.metrics.RenderMetrics;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Div2ViewHistogramReporter.kt */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class Div2ViewHistogramReporter$renderMetrics$2 extends FunctionReferenceImpl implements a<RenderMetrics> {
    public static final Div2ViewHistogramReporter$renderMetrics$2 INSTANCE = new Div2ViewHistogramReporter$renderMetrics$2();

    public Div2ViewHistogramReporter$renderMetrics$2() {
        super(0, RenderMetrics.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // bk.a
    public final RenderMetrics invoke() {
        return new RenderMetrics();
    }
}
