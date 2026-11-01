package fm;

import androidx.databinding.ObservableList;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: AdapterReferenceCollector.java */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReferenceQueue<Object> f52979a = new ReferenceQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f52980b;

    /* JADX INFO: compiled from: AdapterReferenceCollector.java */
    public static class b<T, A extends fm.b<T>> extends WeakReference<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ObservableList<T> f52981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ObservableList.OnListChangedCallback f52982b;

        public b(A a10, ObservableList<T> observableList, ObservableList.OnListChangedCallback onListChangedCallback) {
            super(a10, a.f52979a);
            this.f52981a = observableList;
            this.f52982b = onListChangedCallback;
        }

        public void a() {
            this.f52981a.removeOnListChangedCallback(this.f52982b);
        }
    }

    /* JADX INFO: compiled from: AdapterReferenceCollector.java */
    public static class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Reference<? extends Object> referenceRemove = a.f52979a.remove();
                    if (referenceRemove instanceof b) {
                        ((b) referenceRemove).a();
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }

    public static <T, A extends fm.b<T>> WeakReference<A> a(A a10, ObservableList<T> observableList, ObservableList.OnListChangedCallback onListChangedCallback) {
        c cVar = f52980b;
        if (cVar == null || !cVar.isAlive()) {
            c cVar2 = new c();
            f52980b = cVar2;
            cVar2.start();
        }
        return new b(a10, observableList, onListChangedCallback);
    }
}
