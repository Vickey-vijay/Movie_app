package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fy0 extends h11 {
    public final i12 A;
    public final dy0 B;
    public by0 C;
    public by0 D;
    public qy0 E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gy0 f77543y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ly0 f77544z;

    public /* synthetic */ fy0(Context context, d4 d4Var, lu2 lu2Var, gy0 gy0Var, w5 w5Var, ly0 ly0Var, i12 i12Var) {
        this(context, d4Var, lu2Var, gy0Var, w5Var, ly0Var, i12Var, new dy0(lu2Var));
    }

    public abstract by0 a(cy0 cy0Var);

    @Override // yads.zn
    public final void a(l4 l4Var) {
        this.f77543y.a(l4Var);
    }

    @Override // yads.zn
    public final void i() {
        this.f77543y.a(h9.f78108h);
    }

    @Override // yads.zn
    public final void j() {
        qy0 qy0Var = this.E;
        if (qy0Var != null) {
            this.f77543y.a(qy0Var);
        } else {
            this.f77543y.a(h9.f78102b);
        }
    }

    public fy0(Context context, d4 d4Var, lu2 lu2Var, gy0 gy0Var, w5 w5Var, ly0 ly0Var, i12 i12Var, dy0 dy0Var) {
        super(context, d4Var, lu2Var, w5Var);
        this.f77543y = gy0Var;
        this.f77544z = ly0Var;
        this.A = i12Var;
        this.B = dy0Var;
        a(ma.f80133a.a());
    }

    @Override // yads.up2
    public void a(v9 v9Var) {
        cy0 uv2Var;
        synchronized (this) {
            this.f85496b.a(v5.f83759s);
            this.f85516v = v9Var;
        }
        this.A.f78451d = v9Var;
        dy0 dy0Var = this.B;
        dy0Var.getClass();
        hq1 hq1Var = v9Var.f83825q;
        if (hq1Var != null) {
            uv2Var = new fp1(v9Var, hq1Var);
        } else {
            uv2Var = new uv2(dy0Var.f76842a);
        }
        by0 by0VarA = a(uv2Var);
        this.D = this.C;
        this.C = by0VarA;
        this.E = this.f77544z.a(v9Var, this.f85497c, by0VarA);
        Context contextA = j1.a();
        if (contextA != null) {
            boolean z10 = ad1.f75480a;
        }
        if (contextA == null) {
            contextA = this.f85495a;
        }
        by0VarA.a(contextA, v9Var);
    }
}
