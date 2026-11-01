package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class pw1 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f81633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj1 f81634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f81635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qw1 f81636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9 f81637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f81638h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw1(Context context, oj1 oj1Var, String str, qw1 qw1Var, v9 v9Var, boolean z10, rj.c cVar) {
        super(2, cVar);
        this.f81633c = context;
        this.f81634d = oj1Var;
        this.f81635e = str;
        this.f81636f = qw1Var;
        this.f81637g = v9Var;
        this.f81638h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new pw1(this.f81633c, this.f81634d, this.f81635e, this.f81636f, this.f81637g, this.f81638h, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((pw1) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        vn3 vn3Var;
        gw1 gw1Var;
        Object objF = sj.a.f();
        int i10 = this.f81632b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            sw1 sw1VarA = sw1.f82785c.a(this.f81633c);
            if (sw1VarA.f82788b.size() != sw1VarA.f82787a) {
                if (!sw1VarA.f82788b.containsKey(this.f81634d) && this.f81635e != null) {
                    fs2 fs2Var = this.f81636f.f82014a;
                    Context context = this.f81633c;
                    String str = this.f81637g.G;
                    if (str != null) {
                        vn3.f83961c.getClass();
                        vn3Var = (vn3) vn3.f83962d.get(str);
                        if (vn3Var == null) {
                            vn3Var = vn3.f83963e;
                        }
                    } else {
                        vn3Var = vn3.f83963e;
                    }
                    tn3 tn3Var = new tn3(vn3Var);
                    fs2Var.getClass();
                    try {
                        gw1Var = new gw1(context, tn3Var, 4);
                    } catch (Throwable unused) {
                        gw1Var = null;
                    }
                    if (gw1Var != null) {
                        oj1 oj1Var = this.f81634d;
                        String str2 = this.f81635e;
                        boolean z10 = this.f81638h;
                        this.f81632b = 1;
                        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(this), 1);
                        cVar.J();
                        nw1 nw1Var = new nw1(sw1VarA, oj1Var, new ow1(z10, cVar));
                        if (sw1VarA.f82788b.size() < sw1VarA.f82787a) {
                            sw1VarA.f82788b.put(oj1Var, gw1Var);
                        }
                        gw1Var.a(str2, nw1Var);
                        if (!z10 && cVar.isActive()) {
                            Result.a aVar = Result.Companion;
                            cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
                        }
                        Object objB = cVar.B();
                        if (objB == sj.a.f()) {
                            tj.f.c(this);
                        }
                        if (objB == objF) {
                            return objF;
                        }
                    } else {
                        return mj.r.f64562a;
                    }
                }
            }
            return mj.r.f64562a;
        }
        return mj.r.f64562a;
    }
}
