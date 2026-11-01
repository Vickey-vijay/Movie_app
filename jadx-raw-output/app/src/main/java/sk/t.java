package sk;

import java.util.List;
import kotlin.KotlinNothingValueException;
import nk.y1;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f71988a = true;

    public static final u a(Throwable th2, String str) throws Throwable {
        if (f71988a) {
            return new u(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ u b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final boolean c(y1 y1Var) {
        return y1Var.n() instanceof u;
    }

    public static final y1 e(r rVar, List<? extends r> list) {
        try {
            return rVar.c(list);
        } catch (Throwable th2) {
            return a(th2, rVar.b());
        }
    }
}
