package androidx.lifecycle;

import androidx.annotation.MainThread;
import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: LiveData.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class LiveDataKt {
    @MainThread
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner lifecycleOwner, final l<? super T, r> lVar) {
        p.j(liveData, "<this>");
        p.j(lifecycleOwner, "owner");
        p.j(lVar, "onChanged");
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t10) {
                lVar.invoke(t10);
            }
        };
        liveData.observe(lifecycleOwner, observer);
        return observer;
    }
}
