package yads;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

/* JADX INFO: loaded from: classes11.dex */
public final class ov0 extends Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle.State f81155a = Lifecycle.State.STARTED;

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver lifecycleObserver) {
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver lifecycleObserver) {
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return this.f81155a;
    }
}
