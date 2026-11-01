package me.goldze.mvvmhabit.base;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;
import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes2.dex */
public class IBaseViewModel_LifecycleAdapter implements GeneratedAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBaseViewModel f64424a;

    @Override // androidx.lifecycle.GeneratedAdapter
    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z10, MethodCallsLogger methodCallsLogger) {
        boolean z11 = methodCallsLogger != null;
        if (z10) {
            if (!z11 || methodCallsLogger.approveCall("onAny", 4)) {
                this.f64424a.onAny(lifecycleOwner, event);
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_CREATE) {
            if (!z11 || methodCallsLogger.approveCall("onCreate", 1)) {
                this.f64424a.onCreate();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            if (!z11 || methodCallsLogger.approveCall("onDestroy", 1)) {
                this.f64424a.onDestroy();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            if (!z11 || methodCallsLogger.approveCall("onStart", 1)) {
                this.f64424a.onStart();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_STOP) {
            if (!z11 || methodCallsLogger.approveCall("onStop", 1)) {
                this.f64424a.onStop();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            if (!z11 || methodCallsLogger.approveCall(C3426d4.i.f28569u0, 1)) {
                this.f64424a.onResume();
                return;
            }
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            if (!z11 || methodCallsLogger.approveCall(C3426d4.i.f28567t0, 1)) {
                this.f64424a.onPause();
            }
        }
    }

    public IBaseViewModel_LifecycleAdapter(IBaseViewModel iBaseViewModel) {
        this.f64424a = iBaseViewModel;
    }
}
