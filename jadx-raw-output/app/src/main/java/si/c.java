package si;

import ii.r;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: BlockingBaseObserver.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c<T> extends CountDownLatch implements r<T>, mi.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f71911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f71912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mi.b f71913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f71914e;

    public c() {
        super(1);
    }

    @Override // mi.b
    public final void dispose() {
        this.f71914e = true;
        mi.b bVar = this.f71913d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // mi.b
    public final boolean isDisposed() {
        return this.f71914e;
    }

    @Override // ii.r
    public final void onSubscribe(mi.b bVar) {
        this.f71913d = bVar;
        if (this.f71914e) {
            bVar.dispose();
        }
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                bj.c.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw ExceptionHelper.d(e10);
            }
        }
        Throwable th2 = this.f71912c;
        if (th2 == null) {
            return this.f71911b;
        }
        throw ExceptionHelper.d(th2);
    }

    @Override // ii.r
    public final void onComplete() {
        countDown();
    }
}
