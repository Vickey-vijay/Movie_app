package androidx.activity;

import androidx.annotation.MainThread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import mj.r;

/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private bk.a<r> enabledChangedCallback;
    private boolean isEnabled;

    @MainThread
    public void handleOnBackCancelled() {
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public void handleOnBackProgressed(BackEventCompat backEventCompat) {
        ck.p.j(backEventCompat, "backEvent");
    }

    @MainThread
    public void handleOnBackStarted(BackEventCompat backEventCompat) {
        ck.p.j(backEventCompat, "backEvent");
    }

    public final void addCancellable(Cancellable cancellable) {
        ck.p.j(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final bk.a<r> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @MainThread
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    public final void removeCancellable(Cancellable cancellable) {
        ck.p.j(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        bk.a<r> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(bk.a<r> aVar) {
        this.enabledChangedCallback = aVar;
    }

    public OnBackPressedCallback(boolean z10) {
        this.isEnabled = z10;
    }
}
