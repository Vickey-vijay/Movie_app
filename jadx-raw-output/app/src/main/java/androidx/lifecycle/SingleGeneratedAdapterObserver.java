package androidx.lifecycle;

import ck.p;

/* JADX INFO: compiled from: SingleGeneratedAdapterObserver.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    private final GeneratedAdapter generatedAdapter;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        p.j(generatedAdapter, "generatedAdapter");
        this.generatedAdapter = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        p.j(lifecycleOwner, "source");
        p.j(event, "event");
        this.generatedAdapter.callMethods(lifecycleOwner, event, false, null);
        this.generatedAdapter.callMethods(lifecycleOwner, event, true, null);
    }
}
