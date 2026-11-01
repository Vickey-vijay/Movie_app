package androidx.lifecycle;

import ck.p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {
    private final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        p.j(savedStateHandlesProvider, IronSourceConstants.EVENTS_PROVIDER);
        this.provider = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        boolean z10;
        p.j(lifecycleOwner, "source");
        p.j(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.provider.performRestore();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
