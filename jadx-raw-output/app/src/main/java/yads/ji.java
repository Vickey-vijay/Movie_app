package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class ji {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f79048a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile hi f79049b;

    public static void a(Context context, at1 at1Var) {
        nk.l0 l0VarA = kotlinx.coroutines.d.a(nk.j2.b(null, 1, null).plus(nk.w0.b()).plus(new y10(at1Var)));
        if (f79048a.getAndSet(true)) {
            return;
        }
        nk.j.d(l0VarA, null, null, new ii(context, at1Var, l0VarA, null), 3, null);
    }
}
