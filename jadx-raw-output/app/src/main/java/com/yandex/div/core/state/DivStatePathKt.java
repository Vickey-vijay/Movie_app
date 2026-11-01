package com.yandex.div.core.state;

import kotlin.Pair;

/* JADX INFO: compiled from: DivStatePath.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivStatePathKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDivId(Pair<String, String> pair) {
        return pair.getFirst();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getStateId(Pair<String, String> pair) {
        return pair.getSecond();
    }
}
