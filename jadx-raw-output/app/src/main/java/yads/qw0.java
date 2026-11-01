package yads;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes2.dex */
public final class qw0 extends SuspendLambda implements bk.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f82011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw0 f82012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sw0 f82013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw0(byte[] bArr, rw0 rw0Var, sw0 sw0Var, rj.c cVar) {
        super(2, cVar);
        this.f82011c = bArr;
        this.f82012d = rw0Var;
        this.f82013e = sw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final rj.c create(Object obj, rj.c cVar) {
        return new qw0(this.f82011c, this.f82012d, this.f82013e, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        return ((qw0) create((nk.l0) obj, (rj.c) obj2)).invokeSuspend(mj.r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.f82010b;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            byte[] bArr = this.f82011c;
            if (bArr == null) {
                return null;
            }
            hx0 hx0Var = this.f82012d.f82446b;
            sw0 sw0Var = this.f82013e;
            this.f82010b = 1;
            hw0 hw0Var = hx0Var.f78404a;
            hw0Var.getClass();
            Object objG = nk.h.g(nk.w0.b(), new gw0(hw0Var, sw0Var, bArr, null), this);
            if (objG != sj.a.f()) {
                objG = mj.r.f64562a;
            }
            if (objG == objF) {
                return objF;
            }
        }
        return mj.r.f64562a;
    }
}
