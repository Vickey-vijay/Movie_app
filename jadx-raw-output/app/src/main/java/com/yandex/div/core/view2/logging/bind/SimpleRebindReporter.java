package com.yandex.div.core.view2.logging.bind;

/* JADX INFO: compiled from: SimpleRebindReporter.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface SimpleRebindReporter extends ForceRebindReporter {
    default void onSimpleRebindException(Exception exc) {
    }

    default void onSimpleRebindFatalNoState() {
    }

    default void onSimpleRebindNoChild() {
    }

    default void onSimpleRebindSuccess() {
    }
}
