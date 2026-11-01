package kk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j<T> extends k<T> implements Iterator<T>, rj.c<mj.r>, dk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f62860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f62861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator<? extends T> f62862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rj.c<? super mj.r> f62863e;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kk.k
    public Object a(T t10, rj.c<? super mj.r> cVar) {
        this.f62861c = t10;
        this.f62860b = 3;
        this.f62863e = cVar;
        Object objF = sj.a.f();
        if (objF == sj.a.f()) {
            tj.f.c(cVar);
        }
        return objF == sj.a.f() ? objF : mj.r.f64562a;
    }

    public final Throwable f() {
        int i10 = this.f62860b;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f62860b);
    }

    @Override // rj.c
    public kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final void h(rj.c<? super mj.r> cVar) {
        this.f62863e = cVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f62860b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw f();
                }
                Iterator<? extends T> it = this.f62862d;
                ck.p.g(it);
                if (it.hasNext()) {
                    this.f62860b = 2;
                    return true;
                }
                this.f62862d = null;
            }
            this.f62860b = 5;
            rj.c<? super mj.r> cVar = this.f62863e;
            ck.p.g(cVar);
            this.f62863e = null;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.f62860b;
        if (i10 == 0 || i10 == 1) {
            return g();
        }
        if (i10 == 2) {
            this.f62860b = 1;
            Iterator<? extends T> it = this.f62862d;
            ck.p.g(it);
            return it.next();
        }
        if (i10 != 3) {
            throw f();
        }
        this.f62860b = 0;
        T t10 = this.f62861c;
        this.f62861c = null;
        return t10;
    }

    @Override // kk.k
    public Object b(Iterator<? extends T> it, rj.c<? super mj.r> cVar) {
        if (!it.hasNext()) {
            return mj.r.f64562a;
        }
        this.f62862d = it;
        this.f62860b = 2;
        this.f62863e = cVar;
        Object objF = sj.a.f();
        if (objF == sj.a.f()) {
            tj.f.c(cVar);
        }
        if (objF == sj.a.f()) {
            return objF;
        }
        return mj.r.f64562a;
    }

    public final T g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // rj.c
    public void resumeWith(Object obj) throws Throwable {
        kotlin.c.b(obj);
        this.f62860b = 4;
    }
}
