package ok;

import android.os.Handler;
import android.os.Looper;
import ck.i;
import ck.p;
import ik.k;
import java.util.concurrent.CancellationException;
import mj.r;
import nk.a2;
import nk.l;
import nk.t1;
import nk.w0;
import nk.y0;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f65397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f65399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f65400e;

    public f(Handler handler, String str, boolean z10) {
        super(null);
        this.f65397b = handler;
        this.f65398c = str;
        this.f65399d = z10;
        this.f65400e = z10 ? this : new f(handler, str, true);
    }

    public static final void C(f fVar, Runnable runnable) {
        fVar.f65397b.removeCallbacks(runnable);
    }

    public static final void D(l lVar, f fVar) {
        lVar.z(fVar, r.f64562a);
    }

    public static final r J(f fVar, Runnable runnable, Throwable th2) {
        fVar.f65397b.removeCallbacks(runnable);
        return r.f64562a;
    }

    @Override // nk.h0
    public void dispatch(kotlin.coroutines.d dVar, Runnable runnable) {
        if (this.f65397b.post(runnable)) {
            return;
        }
        x(dVar, runnable);
    }

    @Override // nk.r0
    public void e(long j10, final l<? super r> lVar) {
        final Runnable runnable = new Runnable() { // from class: ok.d
            @Override // java.lang.Runnable
            public final void run() {
                f.D(lVar, this);
            }
        };
        if (this.f65397b.postDelayed(runnable, k.h(j10, 4611686018427387903L))) {
            lVar.p(new bk.l() { // from class: ok.e
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return f.J(this.f65395b, runnable, (Throwable) obj);
                }
            });
        } else {
            x(lVar.getContext(), runnable);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.f65397b == this.f65397b && fVar.f65399d == this.f65399d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f65397b) ^ (this.f65399d ? 1231 : 1237);
    }

    @Override // nk.h0
    public boolean isDispatchNeeded(kotlin.coroutines.d dVar) {
        return (this.f65399d && p.e(Looper.myLooper(), this.f65397b.getLooper())) ? false : true;
    }

    @Override // ok.g, nk.r0
    public y0 j(long j10, final Runnable runnable, kotlin.coroutines.d dVar) {
        if (this.f65397b.postDelayed(runnable, k.h(j10, 4611686018427387903L))) {
            return new y0() { // from class: ok.c
                @Override // nk.y0
                public final void dispose() {
                    f.C(this.f65391b, runnable);
                }
            };
        }
        x(dVar, runnable);
        return a2.f64759b;
    }

    public final void x(kotlin.coroutines.d dVar, Runnable runnable) {
        t1.c(dVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        w0.b().dispatch(dVar, runnable);
    }

    @Override // nk.y1
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public f n() {
        return this.f65400e;
    }

    @Override // nk.y1, nk.h0
    public String toString() {
        String strP = p();
        if (strP == null) {
            String string = this.f65398c;
            if (string == null) {
                string = this.f65397b.toString();
            }
            if (this.f65399d) {
                return string + ".immediate";
            }
            return string;
        }
        return strP;
    }

    public /* synthetic */ f(Handler handler, String str, int i10, i iVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str) {
        this(handler, str, false);
    }
}
