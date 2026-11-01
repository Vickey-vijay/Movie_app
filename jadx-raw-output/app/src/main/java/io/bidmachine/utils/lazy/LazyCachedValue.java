package io.bidmachine.utils.lazy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes4.dex */
public class LazyCachedValue<T> implements LazyValue<T> {

    @NonNull
    private final LazyValue<T> lazyValue;

    @Nullable
    @VisibleForTesting
    public volatile T value;

    @Override // io.bidmachine.utils.lazy.LazyValue
    @NonNull
    public T get() {
        T t10 = this.value;
        if (t10 != null) {
            return t10;
        }
        T t11 = this.lazyValue.get();
        this.value = t11;
        return t11;
    }

    public LazyCachedValue(@NonNull LazyValue<T> lazyValue) {
        this.lazyValue = lazyValue;
    }
}
