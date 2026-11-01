package com.yandex.div.core;

import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.yandex.div.core.state.DivStatePath;

/* JADX INFO: loaded from: classes8.dex */
public interface DivViewFacade {
    @NonNull
    View getView();

    default void hideTooltip(@NonNull String str) {
    }

    default void showTooltip(@NonNull String str) {
    }

    default void switchToState(@IntRange(from = 0) long j10) {
        switchToState(j10, true);
    }

    void switchToState(@IntRange(from = 0) long j10, boolean z10);

    default void switchToState(@NonNull DivStatePath divStatePath, boolean z10) {
        switchToState(divStatePath.getTopLevelStateId(), z10);
    }

    default void showTooltip(@NonNull String str, boolean z10) {
        showTooltip(str);
    }
}
