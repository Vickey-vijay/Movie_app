package si;

import ii.u;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: BlockingMultiObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f<T> extends CountDownLatch implements u<T>, ii.b, ii.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f71915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f71916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mi.b f71917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f71918e;

    public f() {
        super(1);
    }

    public void b() {
        this.f71918e = true;
        mi.b bVar = this.f71917d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // ii.u
    public void onError(Throwable th2) {
        this.f71916c = th2;
        countDown();
    }

    @Override // ii.u
    public void onSubscribe(mi.b bVar) {
        this.f71917d = bVar;
        if (this.f71918e) {
            bVar.dispose();
        }
    }

    @Override // ii.u
    public void onSuccess(T t10) {
        this.f71915b = t10;
        countDown();
    }

    public T a() {
        if (getCount() != 0) {
            try {
                bj.c.b();
                await();
            } catch (InterruptedException e10) {
                b();
                throw ExceptionHelper.d(e10);
            }
        }
        Throwable th2 = this.f71916c;
        if (th2 == null) {
            return this.f71915b;
        }
        throw ExceptionHelper.d(th2);
    }

    @Override // ii.b
    public void onComplete() {
        countDown();
    }
}
