package me.goldze.mvvmhabit.base.bus.event;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public class SingleLiveEvent<T> extends MutableLiveData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f64428a = new AtomicBoolean(false);

    public class a implements Observer<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Observer f64429b;

        public a(Observer observer) {
            this.f64429b = observer;
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(@Nullable T t10) {
            if (SingleLiveEvent.this.f64428a.compareAndSet(true, false)) {
                this.f64429b.onChanged(t10);
            }
        }
    }

    @MainThread
    public void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    @MainThread
    public void setValue(@Nullable T t10) {
        this.f64428a.set(true);
        super.setValue(t10);
    }

    @Override // androidx.lifecycle.LiveData
    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
        if (hasActiveObservers()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.observe(lifecycleOwner, new a(observer));
    }
}
