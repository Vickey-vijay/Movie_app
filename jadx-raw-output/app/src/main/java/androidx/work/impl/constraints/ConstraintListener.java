package androidx.work.impl.constraints;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface ConstraintListener<T> {
    @MainThread
    void onConstraintChanged(@Nullable T t10);
}
