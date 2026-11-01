package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import yads.Cif;

/* JADX INFO: renamed from: yads.if, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class Cif extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf f78611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f78612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(jf jfVar, long j10, rj.c cVar) {
        super(2, cVar);
        this.f78611c = jfVar;
        this.f78612d = j10;
    }

    public static final void a(nk.u uVar) {
        uVar.i(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new Cif(this.f78611c, this.f78612d, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return new Cif(this.f78611c, this.f78612d, (rj.c) obj2).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f78610b;
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            final nk.u uVarC = nk.w.c(null, 1, null);
            this.f78611c.f79022b.post(new Runnable() { // from class: cp.t2
                @Override // java.lang.Runnable
                public final void run() {
                    Cif.a(uVarC);
                }
            });
            long j10 = this.f78612d;
            hf hfVar = new hf(uVarC, null);
            this.f78610b = 1;
            obj = TimeoutKt.d(j10, hfVar, this);
            if (obj == objF) {
                return objF;
            }
        }
        if (obj == null) {
            z10 = false;
        }
        return tj.a.a(z10);
    }
}
