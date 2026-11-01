package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.r;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final nj.i<OnBackPressedCallback> onBackPressedCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @RequiresApi(33)
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(bk.a aVar) {
            ck.p.j(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        @DoNotInline
        public final OnBackInvokedCallback createOnBackInvokedCallback(final bk.a<r> aVar) {
            ck.p.j(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.q
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(aVar);
                }
            };
        }

        @DoNotInline
        public final void registerOnBackInvokedCallback(Object obj, int i10, Object obj2) {
            ck.p.j(obj, "dispatcher");
            ck.p.j(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        public final void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            ck.p.j(obj, "dispatcher");
            ck.p.j(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @RequiresApi(34)
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @DoNotInline
        public final OnBackInvokedCallback createOnBackAnimationCallback(final bk.l<? super BackEventCompat, r> lVar, final bk.l<? super BackEventCompat, r> lVar2, final bk.a<r> aVar, final bk.a<r> aVar2) {
            ck.p.j(lVar, "onBackStarted");
            ck.p.j(lVar2, "onBackProgressed");
            ck.p.j(aVar, "onBackInvoked");
            ck.p.j(aVar2, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    aVar2.invoke();
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    aVar.invoke();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(BackEvent backEvent) {
                    ck.p.j(backEvent, "backEvent");
                    lVar2.invoke(new BackEventCompat(backEvent));
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(BackEvent backEvent) {
                    ck.p.j(backEvent, "backEvent");
                    lVar.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        public final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            ck.p.j(lifecycle, "lifecycle");
            ck.p.j(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            ck.p.j(lifecycleOwner, "source");
            ck.p.j(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                    return;
                }
                return;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        public final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            ck.p.j(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (ck.p.e(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            bk.a<r> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$addCallback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    public /* synthetic */ class C08111 extends FunctionReferenceImpl implements bk.a<r> {
        public C08111(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // bk.a
        public /* bridge */ /* synthetic */ r invoke() {
            invoke2();
            return r.f64562a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new nj.i<>();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.onBackInvokedCallback = i10 >= 34 ? Api34Impl.INSTANCE.createOnBackAnimationCallback(new bk.l<BackEventCompat, r>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(BackEventCompat backEventCompat) {
                    invoke2(backEventCompat);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BackEventCompat backEventCompat) {
                    ck.p.j(backEventCompat, "backEvent");
                    OnBackPressedDispatcher.this.onBackStarted(backEventCompat);
                }
            }, new bk.l<BackEventCompat, r>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(BackEventCompat backEventCompat) {
                    invoke2(backEventCompat);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BackEventCompat backEventCompat) {
                    ck.p.j(backEventCompat, "backEvent");
                    OnBackPressedDispatcher.this.onBackProgressed(backEventCompat);
                }
            }, new bk.a<r>() { // from class: androidx.activity.OnBackPressedDispatcher.3
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.onBackPressed();
                }
            }, new bk.a<r>() { // from class: androidx.activity.OnBackPressedDispatcher.4
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.onBackCancelled();
                }
            }) : Api33Impl.INSTANCE.createOnBackInvokedCallback(new bk.a<r>() { // from class: androidx.activity.OnBackPressedDispatcher.5
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OnBackPressedDispatcher.this.onBackPressed();
                }
            });
        }
    }

    @MainThread
    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        ck.p.j(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackCancelled() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            nj.i<OnBackPressedCallback> iVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = iVar.listIterator(iVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = null;
                    break;
                }
                onBackPressedCallbackPrevious = listIterator.previous();
            } while (!onBackPressedCallbackPrevious.isEnabled());
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            nj.i<OnBackPressedCallback> iVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = iVar.listIterator(iVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = null;
                    break;
                }
                onBackPressedCallbackPrevious = listIterator.previous();
            } while (!onBackPressedCallbackPrevious.isEnabled());
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackProgressed(backEventCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackStarted(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        nj.i<OnBackPressedCallback> iVar = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> listIterator = iVar.listIterator(iVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallbackPrevious = null;
                break;
            }
            onBackPressedCallbackPrevious = listIterator.previous();
        } while (!onBackPressedCallbackPrevious.isEnabled());
        OnBackPressedCallback onBackPressedCallback = onBackPressedCallbackPrevious;
        if (this.inProgressCallback != null) {
            onBackCancelled();
        }
        this.inProgressCallback = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackStarted(backEventCompat);
        }
    }

    @RequiresApi(33)
    private final void updateBackInvokedCallbackState(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.backInvokedCallbackRegistered) {
            Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (z10 || !this.backInvokedCallbackRegistered) {
                return;
            }
            Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z10 = this.hasEnabledCallbacks;
        nj.i<OnBackPressedCallback> iVar = this.onBackPressedCallbacks;
        boolean z11 = false;
        if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
            Iterator<OnBackPressedCallback> it = iVar.iterator();
            while (it.hasNext()) {
                if (it.next().isEnabled()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z11;
        if (z11 != z10) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z11);
            }
        }
    }

    @MainThread
    public final void addCallback(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        ck.p.j(lifecycleOwner, "owner");
        ck.p.j(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C08111(this));
    }

    @MainThread
    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        ck.p.j(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackProgressed(BackEventCompat backEventCompat) {
        ck.p.j(backEventCompat, "backEvent");
        onBackProgressed(backEventCompat);
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackStarted(BackEventCompat backEventCompat) {
        ck.p.j(backEventCompat, "backEvent");
        onBackStarted(backEventCompat);
    }

    @MainThread
    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    @MainThread
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            nj.i<OnBackPressedCallback> iVar = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = iVar.listIterator(iVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = null;
                    break;
                }
                onBackPressedCallbackPrevious = listIterator.previous();
            } while (!onBackPressedCallbackPrevious.isEnabled());
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        ck.p.j(onBackInvokedDispatcher, "invoker");
        this.invokedDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
