package com.yandex.div.histogram;

import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: DivParsingHistogramReporter.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface DivParsingHistogramReporter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: DivParsingHistogramReporter.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final g<DefaultDivParsingHistogramReporter> DEFAULT$delegate = b.a(DivParsingHistogramReporter$Companion$DEFAULT$2.INSTANCE);

        private Companion() {
        }

        public final DivParsingHistogramReporter getDEFAULT() {
            return DEFAULT$delegate.getValue();
        }
    }
}
