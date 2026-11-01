package g5;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: EventDispatcher.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<b<T>> f53078a = new CopyOnWriteArrayList<>();

    /* JADX INFO: compiled from: EventDispatcher.java */
    public interface a<T> {
        void a(T t10);
    }

    /* JADX INFO: compiled from: EventDispatcher.java */
    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f53079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f53080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f53081c;

        public void e() {
            this.f53081c = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(a aVar) {
            if (this.f53081c) {
                return;
            }
            aVar.a(this.f53080b);
        }

        public void c(final a<T> aVar) {
            this.f53079a.post(new Runnable() { // from class: g5.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f53085b.d(aVar);
                }
            });
        }

        public b(Handler handler, T t10) {
            this.f53079a = handler;
            this.f53080b = t10;
        }
    }

    public void a(Handler handler, T t10) {
        g5.a.a((handler == null || t10 == null) ? false : true);
        c(t10);
        this.f53078a.add(new b<>(handler, t10));
    }

    public void b(a<T> aVar) {
        Iterator<b<T>> it = this.f53078a.iterator();
        while (it.hasNext()) {
            it.next().c(aVar);
        }
    }

    public void c(T t10) {
        for (b<T> bVar : this.f53078a) {
            if (bVar.f53080b == t10) {
                bVar.e();
                this.f53078a.remove(bVar);
            }
        }
    }
}
