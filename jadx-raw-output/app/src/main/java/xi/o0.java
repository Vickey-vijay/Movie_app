package xi;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableGenerate.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o0<T, S> extends ii.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<S> f74736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oi.c<S, ii.d<T>, S> f74737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oi.g<? super S> f74738d;

    /* JADX INFO: compiled from: ObservableGenerate.java */
    public static final class a<T, S> implements ii.d<T>, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ii.r<? super T> f74739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final oi.c<S, ? super ii.d<T>, S> f74740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final oi.g<? super S> f74741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public S f74742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f74743f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74744g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74745h;

        @Override // mi.b
        public void dispose() {
            this.f74743f = true;
        }

        public final void a(S s10) {
            try {
                this.f74741d.accept(s10);
            } catch (Throwable th2) {
                ni.a.b(th2);
                ej.a.s(th2);
            }
        }

        public void b() {
            S sApply = this.f74742e;
            if (this.f74743f) {
                this.f74742e = null;
                a(sApply);
                return;
            }
            oi.c<S, ? super ii.d<T>, S> cVar = this.f74740c;
            while (!this.f74743f) {
                this.f74745h = false;
                try {
                    sApply = cVar.apply(sApply, this);
                    if (this.f74744g) {
                        this.f74743f = true;
                        this.f74742e = null;
                        a(sApply);
                        return;
                    }
                } catch (Throwable th2) {
                    ni.a.b(th2);
                    this.f74742e = null;
                    this.f74743f = true;
                    onError(th2);
                    a(sApply);
                    return;
                }
            }
            this.f74742e = null;
            a(sApply);
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f74743f;
        }

        @Override // ii.d
        public void onError(Throwable th2) {
            if (this.f74744g) {
                ej.a.s(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f74744g = true;
            this.f74739b.onError(th2);
        }

        public a(ii.r<? super T> rVar, oi.c<S, ? super ii.d<T>, S> cVar, oi.g<? super S> gVar, S s10) {
            this.f74739b = rVar;
            this.f74740c = cVar;
            this.f74741d = gVar;
            this.f74742e = s10;
        }
    }

    @Override // ii.k
    public void subscribeActual(ii.r<? super T> rVar) {
        try {
            a aVar = new a(rVar, this.f74737c, this.f74738d, this.f74736b.call());
            rVar.onSubscribe(aVar);
            aVar.b();
        } catch (Throwable th2) {
            ni.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }

    public o0(Callable<S> callable, oi.c<S, ii.d<T>, S> cVar, oi.g<? super S> gVar) {
        this.f74736b = callable;
        this.f74737c = cVar;
        this.f74738d = gVar;
    }
}
