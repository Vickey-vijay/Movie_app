package androidx.core.app;

import android.content.Intent;
import androidx.core.util.Consumer;

/* JADX INFO: compiled from: OnNewIntentProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface OnNewIntentProvider {
    void addOnNewIntentListener(Consumer<Intent> consumer);

    void removeOnNewIntentListener(Consumer<Intent> consumer);
}
