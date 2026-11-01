package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class sv implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns2 f82765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tv f82767d;

    @Override // yads.ns2
    public final void a() {
        this.f82765b.a();
    }

    public sv(tv tvVar, ns2 ns2Var) {
        this.f82767d = tvVar;
        this.f82765b = ns2Var;
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        if (this.f82767d.f83184e != -9223372036854775807L) {
            return -3;
        }
        if (this.f82766c) {
            sa0Var.f82731b = 4;
            return -4;
        }
        int iA = this.f82765b.a(nx0Var, sa0Var, i10);
        if (iA != -5) {
            tv tvVar = this.f82767d;
            long j10 = tvVar.f83186g;
            if (j10 == Long.MIN_VALUE || ((iA != -4 || sa0Var.f82570f < j10) && !(iA == -3 && tvVar.getBufferedPositionUs() == Long.MIN_VALUE && !sa0Var.f82569e))) {
                return iA;
            }
            sa0Var.b();
            sa0Var.f82731b = 4;
            this.f82766c = true;
            return -4;
        }
        mx0 mx0Var = nx0Var.f80854b;
        mx0Var.getClass();
        int i11 = mx0Var.C;
        if (i11 != 0 || mx0Var.D != 0) {
            tv tvVar2 = this.f82767d;
            if (tvVar2.f83185f != 0) {
                i11 = 0;
            }
            int i12 = tvVar2.f83186g == Long.MIN_VALUE ? mx0Var.D : 0;
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.A = i11;
            lx0Var.B = i12;
            nx0Var.f80854b = new mx0(lx0Var);
        }
        return -5;
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return this.f82767d.f83184e == -9223372036854775807L && this.f82765b.isReady();
    }

    @Override // yads.ns2
    public final int a(long j10) {
        if (this.f82767d.f83184e != -9223372036854775807L) {
            return -3;
        }
        return this.f82765b.a(j10);
    }
}
