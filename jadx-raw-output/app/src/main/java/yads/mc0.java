package yads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class mc0 extends ko {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lc0 f80139e;

    @Override // yads.yj1
    public final long a() {
        long j10 = this.f79497d;
        if (j10 < this.f79495b || j10 > this.f79496c) {
            throw new NoSuchElementException();
        }
        return this.f80139e.a(j10);
    }

    @Override // yads.yj1
    public final long b() {
        long j10 = this.f79497d;
        if (j10 < this.f79495b || j10 > this.f79496c) {
            throw new NoSuchElementException();
        }
        lc0 lc0Var = this.f80139e;
        return lc0Var.f79746d.a(j10 - lc0Var.f79748f);
    }

    public mc0(lc0 lc0Var, long j10, long j11) {
        super(j10, j11);
        this.f80139e = lc0Var;
    }
}
