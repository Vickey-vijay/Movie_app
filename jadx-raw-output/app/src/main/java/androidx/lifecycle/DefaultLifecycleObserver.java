package androidx.lifecycle;

import ck.p;

/* JADX INFO: compiled from: DefaultLifecycleObserver.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner lifecycleOwner) {
        p.j(lifecycleOwner, "owner");
    }

    default void onDestroy(LifecycleOwner lifecycleOwner) {
        p.j(lifecycleOwner, "owner");
    }

    default void onPause(LifecycleOwner lifecycleOwner) {
        p.j(lifecycleOwner, "owner");
    }

    default void onResume(LifecycleOwner lifecycleOwner) {
        p.j(lifecycleOwner, "owner");
    }

    default void onStart(LifecycleOwner lifecycleOwner) {
        p.j(lifecycleOwner, "owner");
    }

    default void onStop(LifecycleOwner lifecycleOwner) {
        p.j(lifecycleOwner, "owner");
    }
}
