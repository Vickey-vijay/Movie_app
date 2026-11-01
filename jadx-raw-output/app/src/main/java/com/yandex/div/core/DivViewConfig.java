package com.yandex.div.core;

import androidx.annotation.Px;

/* JADX INFO: loaded from: classes2.dex */
public interface DivViewConfig {
    public static final DivViewConfig DEFAULT = new DivViewConfig() { // from class: od.i
    };

    @Px
    default int getLogCardScrollSignificantThreshold() {
        return 0;
    }
}
