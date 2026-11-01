package com.yandex.div.histogram;

import bk.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.b;
import mj.g;
import mj.r;

/* JADX INFO: compiled from: HistogramCallTypeChecker.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class HistogramCallTypeChecker {
    private final g reportedHistograms$delegate = b.a(new a<ConcurrentHashMap<String, r>>() { // from class: com.yandex.div.histogram.HistogramCallTypeChecker$reportedHistograms$2
        @Override // bk.a
        public final ConcurrentHashMap<String, r> invoke() {
            return new ConcurrentHashMap<>();
        }
    });

    private final ConcurrentHashMap<String, r> getReportedHistograms() {
        return (ConcurrentHashMap) this.reportedHistograms$delegate.getValue();
    }

    public final boolean addReported(String str) {
        if (getReportedHistograms().containsKey(str) || getReportedHistograms().putIfAbsent(str, r.f64562a) != null) {
            return false;
        }
        return true;
    }
}
