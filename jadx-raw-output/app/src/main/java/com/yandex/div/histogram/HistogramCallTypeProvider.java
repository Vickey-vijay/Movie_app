package com.yandex.div.histogram;

import bk.a;

/* JADX INFO: compiled from: HistogramCallTypeProvider.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class HistogramCallTypeProvider extends HistogramCallTypeChecker {
    private final a<HistogramColdTypeChecker> histogramColdTypeChecker;

    public final String getHistogramCallType(String str) {
        if (!this.histogramColdTypeChecker.invoke().addReported(str)) {
            return addReported(str) ? "Cool" : "Warm";
        }
        addReported(str);
        return "Cold";
    }

    public HistogramCallTypeProvider(a<HistogramColdTypeChecker> aVar) {
        this.histogramColdTypeChecker = aVar;
    }
}
