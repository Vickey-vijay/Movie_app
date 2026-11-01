package androidx.lifecycle;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    LifecycleRegistry getLifecycle();
}
