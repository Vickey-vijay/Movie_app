package yads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class rz2 implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f82477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tz2 f82478d;

    @Override // yads.ns2
    public final void a() throws IOException {
        tz2 tz2Var = this.f82478d;
        if (tz2Var.f83272l) {
            return;
        }
        tz2Var.f83270j.a(Integer.MIN_VALUE);
    }

    public rz2(tz2 tz2Var) {
        this.f82478d = tz2Var;
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return this.f82478d.f83273m;
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        if (!this.f82477c) {
            tz2 tz2Var = this.f82478d;
            bn1 bn1Var = tz2Var.f83266f;
            bn1Var.a(new hm1(1, ht1.d(tz2Var.f83271k.f80429m), this.f82478d.f83271k, 0, null, bn1Var.a(0L), -9223372036854775807L));
            this.f82477c = true;
        }
        tz2 tz2Var2 = this.f82478d;
        boolean z10 = tz2Var2.f83273m;
        if (z10 && tz2Var2.f83274n == null) {
            this.f82476b = 2;
        }
        int i11 = this.f82476b;
        if (i11 == 2) {
            sa0Var.f82731b |= 4;
            return -4;
        }
        if ((i10 & 2) != 0 || i11 == 0) {
            nx0Var.f80854b = tz2Var2.f83271k;
            this.f82476b = 1;
            return -5;
        }
        if (!z10) {
            return -3;
        }
        tz2Var2.f83274n.getClass();
        sa0Var.f82731b |= 1;
        sa0Var.f82570f = 0L;
        if ((i10 & 4) == 0) {
            sa0Var.c(this.f82478d.f83275o);
            ByteBuffer byteBuffer = sa0Var.f82568d;
            tz2 tz2Var3 = this.f82478d;
            byteBuffer.put(tz2Var3.f83274n, 0, tz2Var3.f83275o);
        }
        if ((i10 & 1) == 0) {
            this.f82476b = 2;
        }
        return -4;
    }

    @Override // yads.ns2
    public final int a(long j10) {
        if (!this.f82477c) {
            tz2 tz2Var = this.f82478d;
            bn1 bn1Var = tz2Var.f83266f;
            bn1Var.a(new hm1(1, ht1.d(tz2Var.f83271k.f80429m), this.f82478d.f83271k, 0, null, bn1Var.a(0L), -9223372036854775807L));
            this.f82477c = true;
        }
        if (j10 <= 0 || this.f82476b == 2) {
            return 0;
        }
        this.f82476b = 2;
        return 1;
    }
}
