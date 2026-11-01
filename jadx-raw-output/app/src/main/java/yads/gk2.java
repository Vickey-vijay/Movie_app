package yads;

import yads.cr;
import yads.gk2;
import yads.ye2;

/* JADX INFO: loaded from: classes11.dex */
public final class gk2 implements xm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o30 f77837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj2 f77838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hd0 f77839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ae0 f77840d;

    public gk2(o30 o30Var, final rq0 rq0Var) {
        this(o30Var, new yj2() { // from class: cp.c2
            @Override // yads.yj2
            public final cr a(ye2 ye2Var) {
                return gk2.a(rq0Var, ye2Var);
            }
        });
    }

    @Override // yads.xm1
    public final mo a(fm1 fm1Var) {
        fm1Var.f77444c.getClass();
        Object obj = fm1Var.f77444c.f85478g;
        return new hk2(fm1Var, this.f77837a, this.f77838b, this.f77839c.a(fm1Var), this.f77840d, 1048576);
    }

    public gk2(o30 o30Var, yj2 yj2Var) {
        this(o30Var, yj2Var, new hd0(), new ae0());
    }

    public gk2(o30 o30Var, yj2 yj2Var, hd0 hd0Var, ae0 ae0Var) {
        this.f77837a = o30Var;
        this.f77838b = yj2Var;
        this.f77839c = hd0Var;
        this.f77840d = ae0Var;
    }

    @Override // yads.xm1
    public final xm1 a(hd0 hd0Var) {
        if (hd0Var != null) {
            this.f77839c = hd0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    @Override // yads.xm1
    public final xm1 a(ae0 ae0Var) {
        if (ae0Var != null) {
            this.f77840d = ae0Var;
            return this;
        }
        throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
    }

    public static /* synthetic */ cr a(rq0 rq0Var, ye2 ye2Var) {
        return new cr(rq0Var);
    }
}
