package yads;

import android.content.Context;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
public final class o42 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f80940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f80941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q42 f80942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d4 f80943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f80944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ry1 f80945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mi2 f80946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z30 f80947i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o42(q42 q42Var, d4 d4Var, Context context, ry1 ry1Var, mi2 mi2Var, z30 z30Var, rj.c cVar) {
        super(2, cVar);
        this.f80942d = q42Var;
        this.f80943e = d4Var;
        this.f80944f = context;
        this.f80945g = ry1Var;
        this.f80946h = mi2Var;
        this.f80947i = z30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        o42 o42Var = new o42(this.f80942d, this.f80943e, this.f80944f, this.f80945g, this.f80946h, this.f80947i, cVar);
        o42Var.f80941c = obj;
        return o42Var;
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((o42) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM3458constructorimpl;
        Object objF = sj.a.f();
        int i10 = this.f80940b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                q42 q42Var = this.f80942d;
                d4 d4Var = this.f80943e;
                Context context = this.f80944f;
                ry1 ry1Var = this.f80945g;
                mi2 mi2Var = this.f80946h;
                z30 z30Var = this.f80947i;
                Result.a aVar = Result.Companion;
                j42 j42Var = q42Var.f81705b;
                this.f80940b = 1;
                j42Var.getClass();
                obj = nk.h.g(nk.w0.b(), new i42(d4Var, j42Var, context, ry1Var, z30Var, mi2Var, null), this);
                if (obj == objF) {
                    return objF;
                }
            }
            objM3458constructorimpl = Result.m3458constructorimpl((ry1) obj);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            return null;
        }
        return objM3458constructorimpl;
    }
}
