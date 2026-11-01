package com.yandex.div.core.dagger;

import com.yandex.div.histogram.HistogramColdTypeChecker;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: DivHistogramsModule.kt */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1 extends FunctionReferenceImpl implements bk.a<HistogramColdTypeChecker> {
    public DivHistogramsModuleKt$createHistogramReporterDelegate$histogramCallTypeProvider$1(Object obj) {
        super(0, obj, jj.a.class, "get", "get()Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // bk.a
    public final HistogramColdTypeChecker invoke() {
        return (HistogramColdTypeChecker) ((jj.a) this.receiver).get();
    }
}
