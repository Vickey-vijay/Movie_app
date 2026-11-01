package yads;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w92 implements ld3, ck.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x92 f84131a;

    public w92(x92 x92Var) {
        this.f84131a = x92Var;
    }

    @Override // yads.ld3
    public final void a() {
        x92 x92Var = this.f84131a;
        synchronized (x92Var.f84502a) {
            x92Var.f84507f = true;
            mj.r rVar = mj.r.f64562a;
        }
        x92Var.c();
        x92Var.f84505d.b();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ld3) && (obj instanceof ck.l)) {
            return ck.p.e(getFunctionDelegate(), ((ck.l) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // ck.l
    public final mj.e getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.f84131a, x92.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
