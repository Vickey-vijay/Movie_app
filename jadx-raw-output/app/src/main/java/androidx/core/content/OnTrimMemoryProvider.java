package androidx.core.content;

import androidx.core.util.Consumer;

/* JADX INFO: compiled from: OnTrimMemoryProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface OnTrimMemoryProvider {
    void addOnTrimMemoryListener(Consumer<Integer> consumer);

    void removeOnTrimMemoryListener(Consumer<Integer> consumer);
}
