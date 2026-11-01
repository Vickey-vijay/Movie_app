package com.yandex.div.core.player;

import com.yandex.div2.DivVideoScale;

/* JADX INFO: compiled from: DivVideoAttachable.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface DivVideoAttachable {
    default void attach(DivPlayer divPlayer) {
    }

    default void detach() {
    }

    default DivPlayer getAttachedPlayer() {
        return null;
    }

    default void setScale(DivVideoScale divVideoScale) {
    }

    default void setVisibleOnScreen(boolean z10) {
    }
}
