package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class qu1 extends Lambda implements bk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f81973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lu2 f81974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l00 f81975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu1(Context context, lu2 lu2Var, l00 l00Var) {
        super(0);
        this.f81973b = context;
        this.f81974c = lu2Var;
        this.f81975d = l00Var;
    }

    @Override // bk.a
    public final Object invoke() {
        Context context = this.f81973b;
        lu2 lu2Var = this.f81974c;
        l00 l00Var = this.f81975d;
        if (!new rl().a()) {
            iu3 iu3Var = (iu3) lu2Var;
            nk.j.d(kotlinx.coroutines.d.a(nk.j2.b(null, 1, null).plus(nk.w0.b()).plus(new y10(iu3Var.a()))), null, null, new su1(context, iu3Var, null), 3, null);
            new yn3(new cj2()).a();
            Context applicationContext = context.getApplicationContext();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            if (ub.a(applicationContext) && !d63.a() && !atomicBoolean.getAndSet(true)) {
                lc1.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
            }
            Object obj = ut1.f83601f;
            st1.a(lu2Var).a(context, l00Var);
        }
        return mj.r.f64562a;
    }
}
