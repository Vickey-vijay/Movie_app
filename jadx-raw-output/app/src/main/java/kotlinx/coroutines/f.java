package kotlinx.coroutines;

import ck.p;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import mj.r;
import nk.f0;
import nk.j0;
import nk.o2;
import nk.u0;
import nk.z;
import sk.k0;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class f<T> extends uk.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f63084d;

    public void a(Object obj, Throwable th2) {
    }

    public abstract rj.c<T> e();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T g(Object obj) {
        return obj;
    }

    public abstract Object i();

    public Throwable f(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f64844a;
        }
        return null;
    }

    public final void h(Throwable th2) {
        j0.a(e().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public f(int i10) {
        this.f63084d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o2<?> o2VarM;
        try {
            rj.c<T> cVarE = e();
            p.h(cVarE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            sk.g gVar = (sk.g) cVarE;
            rj.c<T> cVar = gVar.f71948f;
            Object obj = gVar.f71950h;
            kotlin.coroutines.d context = cVar.getContext();
            Object objI = k0.i(context, obj);
            g gVar2 = null;
            if (objI != k0.f71955a) {
                o2VarM = f0.m(cVar, context, objI);
            } else {
                o2VarM = null;
            }
            try {
                kotlin.coroutines.d context2 = cVar.getContext();
                Object objI2 = i();
                Throwable thF = f(objI2);
                if (thF == null && u0.b(this.f63084d)) {
                    gVar2 = (g) context2.get(g.E8);
                }
                if (gVar2 != null && !gVar2.isActive()) {
                    CancellationException cancellationExceptionB = gVar2.B();
                    a(objI2, cancellationExceptionB);
                    Result.a aVar = Result.Companion;
                    cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(cancellationExceptionB)));
                } else if (thF != null) {
                    Result.a aVar2 = Result.Companion;
                    cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(thF)));
                } else {
                    Result.a aVar3 = Result.Companion;
                    cVar.resumeWith(Result.m3458constructorimpl(g(objI2)));
                }
                r rVar = r.f64562a;
            } finally {
                if (o2VarM == null || o2VarM.j1()) {
                    k0.f(context, objI);
                }
            }
        } catch (DispatchException e10) {
            j0.a(e().getContext(), e10.getCause());
        } catch (Throwable th2) {
            h(th2);
        }
    }
}
