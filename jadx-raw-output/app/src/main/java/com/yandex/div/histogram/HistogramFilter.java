package com.yandex.div.histogram;

import com.yandex.div.histogram.HistogramFilter;

/* JADX INFO: compiled from: HistogramFilter.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface HistogramFilter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: HistogramFilter.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final HistogramFilter ON = new HistogramFilter() { // from class: ee.c
            @Override // com.yandex.div.histogram.HistogramFilter
            public final boolean report(String str) {
                return HistogramFilter.Companion.ON$lambda$0(str);
            }
        };
        private static final HistogramFilter OFF = new HistogramFilter() { // from class: ee.d
            @Override // com.yandex.div.histogram.HistogramFilter
            public final boolean report(String str) {
                return HistogramFilter.Companion.OFF$lambda$1(str);
            }
        };

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean OFF$lambda$1(String str) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean ON$lambda$0(String str) {
            return true;
        }

        public final HistogramFilter getOFF() {
            return OFF;
        }

        public final HistogramFilter getON() {
            return ON;
        }
    }

    boolean report(String str);
}
