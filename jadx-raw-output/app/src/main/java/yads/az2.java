package yads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes10.dex */
public abstract class az2 implements oa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy2 f75667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75668b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f75669c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f75670d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sa0[] f75671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ua0[] f75672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f75674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sa0 f75675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t43 f75676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f75677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f75678l;

    @Override // yads.oa0
    public final Object a() {
        ua0 ua0Var;
        synchronized (this.f75668b) {
            t43 t43Var = this.f75676j;
            if (t43Var != null) {
                throw t43Var;
            }
            ua0Var = this.f75670d.isEmpty() ? null : (ua0) this.f75670d.removeFirst();
        }
        return ua0Var;
    }

    public abstract t43 a(sa0 sa0Var, ua0 ua0Var, boolean z10);

    public abstract w43 c();

    public abstract ez2 d();

    @Override // yads.oa0
    public final Object b() {
        sa0 sa0Var;
        synchronized (this.f75668b) {
            t43 t43Var = this.f75676j;
            if (t43Var != null) {
                throw t43Var;
            }
            if (this.f75675i != null) {
                throw new IllegalStateException();
            }
            int i10 = this.f75673g;
            if (i10 == 0) {
                sa0Var = null;
            } else {
                sa0[] sa0VarArr = this.f75671e;
                int i11 = i10 - 1;
                this.f75673g = i11;
                sa0Var = sa0VarArr[i11];
            }
            this.f75675i = sa0Var;
        }
        return sa0Var;
    }

    public final boolean e() {
        t43 t43Var;
        t43 t43VarA;
        synchronized (this.f75668b) {
            while (!this.f75678l && (this.f75669c.isEmpty() || this.f75674h <= 0)) {
                this.f75668b.wait();
            }
            if (this.f75678l) {
                return false;
            }
            sa0 sa0Var = (sa0) this.f75669c.removeFirst();
            ua0[] ua0VarArr = this.f75672f;
            int i10 = this.f75674h - 1;
            this.f75674h = i10;
            ua0 ua0Var = ua0VarArr[i10];
            boolean z10 = this.f75677k;
            this.f75677k = false;
            if (sa0Var.b(4)) {
                ua0Var.f82731b = 4 | ua0Var.f82731b;
            } else {
                if (sa0Var.b(Integer.MIN_VALUE)) {
                    ua0Var.f82731b |= Integer.MIN_VALUE;
                }
                if (sa0Var.b(134217728)) {
                    ua0Var.f82731b = 134217728 | ua0Var.f82731b;
                }
                try {
                    t43VarA = a(sa0Var, ua0Var, z10);
                } catch (OutOfMemoryError e10) {
                    t43Var = new t43("Unexpected decode error", e10);
                    t43VarA = t43Var;
                } catch (RuntimeException e11) {
                    t43Var = new t43("Unexpected decode error", e11);
                    t43VarA = t43Var;
                }
                if (t43VarA != null) {
                    synchronized (this.f75668b) {
                        this.f75676j = t43VarA;
                    }
                    return false;
                }
            }
            synchronized (this.f75668b) {
                if (this.f75677k || ua0Var.b(Integer.MIN_VALUE)) {
                    ua0Var.b();
                } else {
                    this.f75670d.addLast(ua0Var);
                }
                sa0Var.b();
                sa0[] sa0VarArr = this.f75671e;
                int i11 = this.f75673g;
                this.f75673g = i11 + 1;
                sa0VarArr[i11] = sa0Var;
            }
            return true;
        }
    }

    public final void f() {
        if (this.f75669c.isEmpty() || this.f75674h <= 0) {
            return;
        }
        this.f75668b.notify();
    }

    @Override // yads.oa0
    public final void flush() {
        synchronized (this.f75668b) {
            this.f75677k = true;
            sa0 sa0Var = this.f75675i;
            if (sa0Var != null) {
                sa0Var.b();
                sa0[] sa0VarArr = this.f75671e;
                int i10 = this.f75673g;
                this.f75673g = i10 + 1;
                sa0VarArr[i10] = sa0Var;
                this.f75675i = null;
            }
            while (!this.f75669c.isEmpty()) {
                sa0 sa0Var2 = (sa0) this.f75669c.removeFirst();
                sa0Var2.b();
                sa0[] sa0VarArr2 = this.f75671e;
                int i11 = this.f75673g;
                this.f75673g = i11 + 1;
                sa0VarArr2[i11] = sa0Var2;
            }
            while (!this.f75670d.isEmpty()) {
                ((ua0) this.f75670d.removeFirst()).b();
            }
        }
    }

    public final void g() {
        int i10 = this.f75673g;
        sa0[] sa0VarArr = this.f75671e;
        if (i10 != sa0VarArr.length) {
            throw new IllegalStateException();
        }
        for (sa0 sa0Var : sa0VarArr) {
            sa0Var.c(1024);
        }
    }

    @Override // yads.oa0
    public final void release() {
        synchronized (this.f75668b) {
            this.f75678l = true;
            this.f75668b.notify();
        }
        try {
            this.f75667a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public az2(sa0[] sa0VarArr, ua0[] ua0VarArr) {
        this.f75671e = sa0VarArr;
        this.f75673g = sa0VarArr.length;
        for (int i10 = 0; i10 < this.f75673g; i10++) {
            this.f75671e[i10] = c();
        }
        this.f75672f = ua0VarArr;
        this.f75674h = ua0VarArr.length;
        for (int i11 = 0; i11 < this.f75674h; i11++) {
            this.f75672f[i11] = d();
        }
        zy2 zy2Var = new zy2((fz2) this);
        this.f75667a = zy2Var;
        zy2Var.start();
    }

    @Override // yads.oa0
    public final void a(w43 w43Var) {
        synchronized (this.f75668b) {
            t43 t43Var = this.f75676j;
            if (t43Var == null) {
                if (w43Var == this.f75675i) {
                    this.f75669c.addLast(w43Var);
                    if (!this.f75669c.isEmpty() && this.f75674h > 0) {
                        this.f75668b.notify();
                    }
                    this.f75675i = null;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw t43Var;
            }
        }
    }
}
