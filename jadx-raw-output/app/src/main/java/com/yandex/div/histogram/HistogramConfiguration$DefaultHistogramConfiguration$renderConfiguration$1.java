package com.yandex.div.histogram;

import bk.a;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: compiled from: HistogramConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1 extends AdaptedFunctionReference implements a<RenderConfiguration> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1();

    public HistogramConfiguration$DefaultHistogramConfiguration$renderConfiguration$1() {
        super(0, RenderConfiguration.class, "<init>", "<init>(Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;Lcom/yandex/div/histogram/HistogramFilter;)V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // bk.a
    public final RenderConfiguration invoke() {
        return new RenderConfiguration(null, null, null, null, 15, null);
    }
}
