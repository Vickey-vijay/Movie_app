package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class lj0 extends Thread implements qj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pj0 f79805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rj0 f79806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nj0 f79807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f79808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f79809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile jj0 f79810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f79811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Exception f79812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f79813j = -1;

    public final void a(boolean z10) {
        if (z10) {
            this.f79810g = null;
        }
        if (this.f79811h) {
            return;
        }
        this.f79811h = true;
        this.f79806c.cancel();
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f79808e) {
                this.f79806c.remove();
            } else {
                long j10 = -1;
                int i10 = 0;
                while (!this.f79811h) {
                    try {
                        this.f79806c.a(this);
                        break;
                    } catch (IOException e10) {
                        if (!this.f79811h) {
                            long j11 = this.f79807d.f80677a;
                            if (j11 != j10) {
                                i10 = 0;
                                j10 = j11;
                            }
                            int i11 = i10 + 1;
                            if (i11 > this.f79809f) {
                                throw e10;
                            }
                            Thread.sleep(Math.min(i10 * 1000, 5000));
                            i10 = i11;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e11) {
            this.f79812i = e11;
        }
        jj0 jj0Var = this.f79810g;
        if (jj0Var != null) {
            jj0Var.obtainMessage(9, this).sendToTarget();
        }
    }

    public lj0(pj0 pj0Var, rj0 rj0Var, nj0 nj0Var, boolean z10, int i10, jj0 jj0Var) {
        this.f79805b = pj0Var;
        this.f79806c = rj0Var;
        this.f79807d = nj0Var;
        this.f79808e = z10;
        this.f79809f = i10;
        this.f79810g = jj0Var;
    }

    public final void a(long j10, long j11, float f10) {
        this.f79807d.f80677a = j11;
        this.f79807d.f80678b = f10;
        if (j10 != this.f79813j) {
            this.f79813j = j10;
            jj0 jj0Var = this.f79810g;
            if (jj0Var != null) {
                jj0Var.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }
}
