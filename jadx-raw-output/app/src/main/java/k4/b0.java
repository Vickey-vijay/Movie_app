package k4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes8.dex */
public interface b0 {

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final r.a f62371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0558a> f62372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f62373d;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void C(e5.h hVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
            E(new b(hVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)), iOException, z10);
        }

        public void G(e5.h hVar, int i10, long j10) {
            F(hVar, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10);
        }

        public void N(int i10, long j10, long j11) {
            O(new c(1, i10, null, 3, null, k(j10), k(j11)));
        }

        public void l(int i10, @Nullable Format format, int i11, @Nullable Object obj, long j10) {
            m(new c(1, i10, format, i11, obj, k(j10), -9223372036854775807L));
        }

        public void w(e5.h hVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
            y(new b(hVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        public void z(e5.h hVar, Uri uri, Map<String, List<String>> map, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
            B(new b(hVar, uri, map, j12, j13, j14), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        /* JADX INFO: renamed from: k4.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        public static final class C0558a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f62374a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b0 f62375b;

            public C0558a(Handler handler, b0 b0Var) {
                this.f62374a = handler;
                this.f62375b = b0Var;
            }
        }

        public a(CopyOnWriteArrayList<C0558a> copyOnWriteArrayList, int i10, @Nullable r.a aVar, long j10) {
            this.f62372c = copyOnWriteArrayList;
            this.f62370a = i10;
            this.f62371b = aVar;
            this.f62373d = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(b0 b0Var, c cVar) {
            b0Var.j(this.f62370a, this.f62371b, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(b0 b0Var, b bVar, c cVar) {
            b0Var.l(this.f62370a, this.f62371b, bVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(b0 b0Var, b bVar, c cVar) {
            b0Var.d(this.f62370a, this.f62371b, bVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(b0 b0Var, b bVar, c cVar, IOException iOException, boolean z10) {
            b0Var.u(this.f62370a, this.f62371b, bVar, cVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(b0 b0Var, b bVar, c cVar) {
            b0Var.e(this.f62370a, this.f62371b, bVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(b0 b0Var, r.a aVar) {
            b0Var.f(this.f62370a, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t(b0 b0Var, r.a aVar) {
            b0Var.w(this.f62370a, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void u(b0 b0Var, r.a aVar) {
            b0Var.n(this.f62370a, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void v(b0 b0Var, r.a aVar, c cVar) {
            b0Var.h(this.f62370a, aVar, cVar);
        }

        public void A(e5.h hVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12) {
            z(hVar, uri, map, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12);
        }

        public void B(final b bVar, final c cVar) {
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62633b.p(b0Var, bVar, cVar);
                    }
                });
            }
        }

        public void D(e5.h hVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12, IOException iOException, boolean z10) {
            C(hVar, uri, map, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, iOException, z10);
        }

        public void E(final b bVar, final c cVar, final IOException iOException, final boolean z10) {
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62610b.q(b0Var, bVar, cVar, iOException, z10);
                    }
                });
            }
        }

        public void F(e5.h hVar, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12) {
            H(new b(hVar, hVar.f52374a, Collections.emptyMap(), j12, 0L, 0L), new c(i10, i11, format, i12, obj, k(j10), k(j11)));
        }

        public void H(final b bVar, final c cVar) {
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62622b.r(b0Var, bVar, cVar);
                    }
                });
            }
        }

        public void I() {
            final r.a aVar = (r.a) g5.a.e(this.f62371b);
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62616b.s(b0Var, aVar);
                    }
                });
            }
        }

        public void J() {
            final r.a aVar = (r.a) g5.a.e(this.f62371b);
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62630b.t(b0Var, aVar);
                    }
                });
            }
        }

        public void L() {
            final r.a aVar = (r.a) g5.a.e(this.f62371b);
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62619b.u(b0Var, aVar);
                    }
                });
            }
        }

        public void M(b0 b0Var) {
            for (C0558a c0558a : this.f62372c) {
                if (c0558a.f62375b == b0Var) {
                    this.f62372c.remove(c0558a);
                }
            }
        }

        public void O(final c cVar) {
            final r.a aVar = (r.a) g5.a.e(this.f62371b);
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62626b.v(b0Var, aVar, cVar);
                    }
                });
            }
        }

        @CheckResult
        public a P(int i10, @Nullable r.a aVar, long j10) {
            return new a(this.f62372c, i10, aVar, j10);
        }

        public void j(Handler handler, b0 b0Var) {
            g5.a.a((handler == null || b0Var == null) ? false : true);
            this.f62372c.add(new C0558a(handler, b0Var));
        }

        public void m(final c cVar) {
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62607b.n(b0Var, cVar);
                    }
                });
            }
        }

        public void x(e5.h hVar, Uri uri, Map<String, List<String>> map, int i10, long j10, long j11, long j12) {
            w(hVar, uri, map, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j10, j11, j12);
        }

        public void y(final b bVar, final c cVar) {
            for (C0558a c0558a : this.f62372c) {
                final b0 b0Var = c0558a.f62375b;
                K(c0558a.f62374a, new Runnable() { // from class: k4.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62361b.o(b0Var, bVar, cVar);
                    }
                });
            }
        }

        public final void K(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public final long k(long j10) {
            long jB = k3.k.b(j10);
            if (jB == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f62373d + jB;
        }
    }

    default void d(int i10, @Nullable r.a aVar, b bVar, c cVar) {
    }

    default void e(int i10, @Nullable r.a aVar, b bVar, c cVar) {
    }

    default void f(int i10, r.a aVar) {
    }

    default void h(int i10, r.a aVar, c cVar) {
    }

    default void j(int i10, @Nullable r.a aVar, c cVar) {
    }

    default void l(int i10, @Nullable r.a aVar, b bVar, c cVar) {
    }

    default void n(int i10, r.a aVar) {
    }

    default void u(int i10, @Nullable r.a aVar, b bVar, c cVar, IOException iOException, boolean z10) {
    }

    default void w(int i10, r.a aVar) {
    }

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e5.h f62376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f62377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, List<String>> f62378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f62379d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f62380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f62381f;

        public b(e5.h hVar, Uri uri, Map<String, List<String>> map, long j10, long j11, long j12) {
            this.f62376a = hVar;
            this.f62377b = uri;
            this.f62378c = map;
            this.f62379d = j10;
            this.f62380e = j11;
            this.f62381f = j12;
        }
    }

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f62382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f62383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Format f62384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f62385d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Object f62386e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f62387f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f62388g;

        public c(int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11) {
            this.f62382a = i10;
            this.f62383b = i11;
            this.f62384c = format;
            this.f62385d = i12;
            this.f62386e = obj;
            this.f62387f = j10;
            this.f62388g = j11;
        }
    }
}
