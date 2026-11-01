package com.yandex.div.core.view2.logging.bind;

import com.yandex.div.core.view2.animations.DivComparatorReporter;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;

/* JADX INFO: compiled from: BindingEventReporter.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface BindingEventReporter extends DivComparatorReporter, ComplexRebindReporter, SimpleRebindReporter, ForceRebindReporter {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: BindingEventReporter.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final BindingEventReporter STUB = new BindingEventReporter() { // from class: com.yandex.div.core.view2.logging.bind.BindingEventReporter$Companion$STUB$1
            @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
            public void onBindingFatalNoData() {
            }

            @Override // com.yandex.div.core.view2.logging.bind.BindingEventReporter
            public void onBindingFatalSameData() {
            }
        };

        private Companion() {
        }

        public final BindingEventReporter getSTUB() {
            return STUB;
        }
    }

    void onBindingFatalNoData();

    void onBindingFatalSameData();
}
