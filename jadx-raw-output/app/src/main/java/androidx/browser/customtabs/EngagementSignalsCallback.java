package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public interface EngagementSignalsCallback {
    default void onGreatestScrollPercentageIncreased(@IntRange(from = 1, to = 100) int i10, @NonNull Bundle bundle) {
    }

    default void onSessionEnded(boolean z10, @NonNull Bundle bundle) {
    }

    default void onVerticalScrollEvent(boolean z10, @NonNull Bundle bundle) {
    }
}
