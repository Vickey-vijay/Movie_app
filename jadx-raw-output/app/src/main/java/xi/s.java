package xi;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableDelay.java */
/* JADX INFO: loaded from: classes11.dex */
public final class s<T> extends xi.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f74789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ii.s f74790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f74791f;

    /* JADX INFO: compiled from: ObservableDelay.java */
    public static final class a<T> implements ii.r<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeUnit f74794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ii.s.c f74795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f74796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public mi.b f74797g;

        /* JADX INFO: renamed from: xi.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class RunnableC0792a implements Runnable {
            public RunnableC0792a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f74792b.onComplete();
                } finally {
                    a.this.f74795e.dispose();
                }
            }
        }

        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Throwable f74799b;

            public b(Throwable th2) {
                this.f74799b = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f74792b.onError(this.f74799b);
                } finally {
                    a.this.f74795e.dispose();
                }
            }
        }

        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final T f74801b;

            public c(T t10) {
                this.f74801b = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f74792b.onNext(this.f74801b);
            }
        }

        @Override // mi.b
        public void dispose() {
            this.f74797g.dispose();
            this.f74795e.dispose();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74795e.isDisposed();
        }

        @Override // ii.r
        public void onComplete() {
            this.f74795e.c(new RunnableC0792a(), this.f74793c, this.f74794d);
        }

        @Override // ii.r
        public void onError(Throwable th2) {
            this.f74795e.c(new b(th2), this.f74796f ? this.f74793c : 0L, this.f74794d);
        }

        @Override // ii.r
        public void onNext(T t10) {
            this.f74795e.c(new c(t10), this.f74793c, this.f74794d);
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
            if (DisposableHelper.validate(this.f74797g, bVar)) {
                this.f74797g = bVar;
                this.f74792b.onSubscribe(this);
            }
        }

        public a(ii.r<? super T> rVar, long j10, TimeUnit timeUnit, ii.s.c cVar, boolean z10) {
            this.f74792b = rVar;
            this.f74793c = j10;
            this.f74794d = timeUnit;
            this.f74795e = cVar;
            this.f74796f = z10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        this.f74487b.subscribe(new a(this.f74791f ? rVar : new dj.e(rVar), this.f74788c, this.f74789d, this.f74790e.a(), this.f74791f));
    }

    public s(ii.p<T> pVar, long j10, TimeUnit timeUnit, ii.s sVar, boolean z10) {
        super(pVar);
        this.f74788c = j10;
        this.f74789d = timeUnit;
        this.f74790e = sVar;
        this.f74791f = z10;
    }
}
