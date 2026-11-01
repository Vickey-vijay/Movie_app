package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableElementAtSingle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d0<T> extends ii.t<T> implements ri.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii.p<T> f74545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f74547c;

    /* JADX INFO: compiled from: ObservableElementAtSingle.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.u<? super T> f74548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final T f74550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public mi.b f74551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f74552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74553g;

        @Override // mi.b
        public void dispose() {
            this.f74551e.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74551e.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            if (this.f74553g) {
                return;
            }
            this.f74553g = true;
            T t10 = this.f74550d;
            if (t10 != null) {
                this.f74548b.onSuccess(t10);
            } else {
                this.f74548b.onError(new NoSuchElementException());
            }
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            if (this.f74553g) {
                ej.a.s(th2);
            } else {
                this.f74553g = true;
                this.f74548b.onError(th2);
            }
        }

        @Override // ii.r
        public void onNext(T t10) {
            if (this.f74553g) {
                return;
            }
            long j10 = this.f74552f;
            if (j10 != this.f74549c) {
                this.f74552f = j10 + 1;
                return;
            }
            this.f74553g = true;
            this.f74551e.dispose();
            this.f74548b.onSuccess(t10);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74551e, bVar)) {
                this.f74551e = bVar;
                this.f74548b.onSubscribe(this);
            }
        }

        public a(ii.u<? super T> uVar, long j10, T t10) {
            this.f74548b = uVar;
            this.f74549c = j10;
            this.f74550d = t10;
        }
    }

    @Override // ri.b
    public ii.k<T> a() {
        return ej.a.o(new b0(this.f74545a, this.f74546b, this.f74547c, true));
    }

    @Override // ii.t
    public void m(ii.u<? super T> uVar) {
        this.f74545a.subscribe(new a(uVar, this.f74546b, this.f74547c));
    }

    public d0(ii.p<T> pVar, long j10, T t10) {
        this.f74545a = pVar;
        this.f74546b = j10;
        this.f74547c = t10;
    }
}
