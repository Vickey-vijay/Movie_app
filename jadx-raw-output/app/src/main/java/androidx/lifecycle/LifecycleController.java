package androidx.lifecycle;

import androidx.annotation.MainThread;
import ck.p;

/* JADX INFO: compiled from: LifecycleController.kt */
/* JADX INFO: loaded from: classes.dex */
@MainThread
public final class LifecycleController {
    private final DispatchQueue dispatchQueue;
    private final Lifecycle lifecycle;
    private final Lifecycle.State minState;
    private final LifecycleEventObserver observer;

    private final void handleDestroy(kotlinx.coroutines.g gVar) {
        kotlinx.coroutines.g.a.a(gVar, null, 1, null);
        finish();
    }

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, final kotlinx.coroutines.g gVar) {
        p.j(lifecycle, "lifecycle");
        p.j(state, "minState");
        p.j(dispatchQueue, "dispatchQueue");
        p.j(gVar, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.d
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(this.f3934b, gVar, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
            finish();
        }
    }

    @MainThread
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController lifecycleController, kotlinx.coroutines.g gVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        p.j(lifecycleController, "this$0");
        p.j(gVar, "$parentJob");
        p.j(lifecycleOwner, "source");
        p.j(event, "<anonymous parameter 1>");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
            lifecycleController.finish();
        } else if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(lifecycleController.minState) < 0) {
            lifecycleController.dispatchQueue.pause();
        } else {
            lifecycleController.dispatchQueue.resume();
        }
    }
}
