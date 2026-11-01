package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a63 extends ro implements Handler.Callback {
    public int A;
    public long B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f75414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z53 f75415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v43 f75416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nx0 f75417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f75418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f75419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f75420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f75421u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public mx0 f75422v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s43 f75423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public w43 f75424x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x43 f75425y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x43 f75426z;

    @Override // yads.ro
    public final void a(long j10, boolean z10) {
        List listEmptyList = Collections.emptyList();
        Handler handler = this.f75414n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            ((wn0) this.f75415o).a(listEmptyList);
            ((wn0) this.f75415o).a(new q20(listEmptyList));
        }
        this.f75418r = false;
        this.f75419s = false;
        this.B = -9223372036854775807L;
        if (this.f75421u != 0) {
            p();
            n();
        } else {
            o();
            s43 s43Var = this.f75423w;
            s43Var.getClass();
            s43Var.flush();
        }
    }

    @Override // yads.ro
    public final String d() {
        return "TextRenderer";
    }

    @Override // yads.ro
    public final boolean g() {
        return true;
    }

    @Override // yads.ro
    public final void h() {
        this.f75422v = null;
        this.B = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        Handler handler = this.f75414n;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            ((wn0) this.f75415o).a(listEmptyList);
            ((wn0) this.f75415o).a(new q20(listEmptyList));
        }
        p();
    }

    public final void n() {
        this.f75420t = true;
        v43 v43Var = this.f75416p;
        mx0 mx0Var = this.f75422v;
        mx0Var.getClass();
        this.f75423w = ((u43) v43Var).a(mx0Var);
    }

    public final void o() {
        this.f75424x = null;
        this.A = -1;
        x43 x43Var = this.f75425y;
        if (x43Var != null) {
            x43Var.b();
            this.f75425y = null;
        }
        x43 x43Var2 = this.f75426z;
        if (x43Var2 != null) {
            x43Var2.b();
            this.f75426z = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a63(wn0 wn0Var, Looper looper) {
        super(3);
        u43 u43Var = v43.f83742a;
        this.f75415o = (z53) ni.a(wn0Var);
        this.f75414n = looper == null ? null : ib3.a(looper, (Handler.Callback) this);
        this.f75416p = u43Var;
        this.f75417q = new nx0();
        this.B = -9223372036854775807L;
    }

    @Override // yads.ro
    public final boolean f() {
        return this.f75419s;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List list = (List) message.obj;
        ((wn0) this.f75415o).a(list);
        ((wn0) this.f75415o).a(new q20(list));
        return true;
    }

    public final long m() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        this.f75425y.getClass();
        if (this.A >= this.f75425y.a()) {
            return Long.MAX_VALUE;
        }
        return this.f75425y.a(this.A);
    }

    public final void p() {
        o();
        s43 s43Var = this.f75423w;
        s43Var.getClass();
        s43Var.release();
        this.f75423w = null;
        this.f75421u = 0;
    }

    @Override // yads.ro
    public final void a(mx0[] mx0VarArr, long j10, long j11) {
        this.f75422v = mx0VarArr[0];
        if (this.f75423w != null) {
            this.f75421u = 1;
        } else {
            n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    @Override // yads.ro
    public final void a(long j10, long j11) {
        boolean z10;
        List listB;
        Handler handler;
        if (this.f82364l) {
            long j12 = this.B;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                o();
                this.f75419s = true;
            }
        }
        if (this.f75419s) {
            return;
        }
        if (this.f75426z == null) {
            s43 s43Var = this.f75423w;
            s43Var.getClass();
            s43Var.a(j10);
            try {
                s43 s43Var2 = this.f75423w;
                s43Var2.getClass();
                this.f75426z = (x43) s43Var2.a();
            } catch (t43 e10) {
                ih1.b("TextRenderer", ih1.a("Subtitle decoding failed. streamFormat=" + this.f75422v, e10));
                List listEmptyList = Collections.emptyList();
                Handler handler2 = this.f75414n;
                if (handler2 != null) {
                    handler2.obtainMessage(0, listEmptyList).sendToTarget();
                } else {
                    ((wn0) this.f75415o).a(listEmptyList);
                    ((wn0) this.f75415o).a(new q20(listEmptyList));
                }
                p();
                n();
                return;
            }
        }
        if (this.f82359g != 2) {
            return;
        }
        if (this.f75425y != null) {
            long jM = m();
            z10 = false;
            while (jM <= j10) {
                this.A++;
                jM = m();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        x43 x43Var = this.f75426z;
        if (x43Var != null) {
            if (!x43Var.b(4)) {
                if (x43Var.f83403c <= j10) {
                    x43 x43Var2 = this.f75425y;
                    if (x43Var2 != null) {
                        x43Var2.b();
                    }
                    this.A = x43Var.a(j10);
                    this.f75425y = x43Var;
                    this.f75426z = null;
                }
                this.f75425y.getClass();
                listB = this.f75425y.b(j10);
                handler = this.f75414n;
                if (handler != null) {
                    handler.obtainMessage(0, listB).sendToTarget();
                } else {
                    ((wn0) this.f75415o).a(listB);
                    ((wn0) this.f75415o).a(new q20(listB));
                }
            } else if (!z10 && m() == Long.MAX_VALUE) {
                if (this.f75421u == 2) {
                    p();
                    n();
                } else {
                    o();
                    this.f75419s = true;
                }
            }
            if (z10) {
                this.f75425y.getClass();
                listB = this.f75425y.b(j10);
                handler = this.f75414n;
                if (handler != null) {
                    handler.obtainMessage(0, listB).sendToTarget();
                } else {
                    ((wn0) this.f75415o).a(listB);
                    ((wn0) this.f75415o).a(new q20(listB));
                }
            }
        } else if (z10) {
            this.f75425y.getClass();
            listB = this.f75425y.b(j10);
            handler = this.f75414n;
            if (handler != null) {
                handler.obtainMessage(0, listB).sendToTarget();
            } else {
                ((wn0) this.f75415o).a(listB);
                ((wn0) this.f75415o).a(new q20(listB));
            }
        }
        if (this.f75421u == 2) {
            return;
        }
        while (!this.f75418r) {
            try {
                w43 w43Var = this.f75424x;
                if (w43Var == null) {
                    s43 s43Var3 = this.f75423w;
                    s43Var3.getClass();
                    w43Var = (w43) s43Var3.b();
                    if (w43Var == null) {
                        return;
                    } else {
                        this.f75424x = w43Var;
                    }
                }
                if (this.f75421u == 1) {
                    w43Var.f82731b = 4;
                    s43 s43Var4 = this.f75423w;
                    s43Var4.getClass();
                    s43Var4.a(w43Var);
                    this.f75424x = null;
                    this.f75421u = 2;
                    return;
                }
                int iA = a(this.f75417q, w43Var, 0);
                if (iA == -4) {
                    if (w43Var.b(4)) {
                        this.f75418r = true;
                        this.f75420t = false;
                    } else {
                        mx0 mx0Var = this.f75417q.f80854b;
                        if (mx0Var == null) {
                            return;
                        }
                        w43Var.f84104j = mx0Var.f80433q;
                        w43Var.c();
                        this.f75420t &= !w43Var.b(1);
                    }
                    if (!this.f75420t) {
                        s43 s43Var5 = this.f75423w;
                        s43Var5.getClass();
                        s43Var5.a(w43Var);
                        this.f75424x = null;
                    }
                } else if (iA == -3) {
                    return;
                }
            } catch (t43 e11) {
                ih1.b("TextRenderer", ih1.a("Subtitle decoding failed. streamFormat=" + this.f75422v, e11));
                List listEmptyList2 = Collections.emptyList();
                Handler handler3 = this.f75414n;
                if (handler3 != null) {
                    handler3.obtainMessage(0, listEmptyList2).sendToTarget();
                } else {
                    ((wn0) this.f75415o).a(listEmptyList2);
                    ((wn0) this.f75415o).a(new q20(listEmptyList2));
                }
                p();
                n();
                return;
            }
        }
    }

    @Override // yads.ro
    public final int a(mx0 mx0Var) {
        if (((u43) this.f75416p).b(mx0Var)) {
            return ro.a(mx0Var.F == 0 ? 4 : 2, 0, 0);
        }
        if (ht1.e(mx0Var.f80429m)) {
            return ro.a(1, 0, 0);
        }
        return ro.a(0, 0, 0);
    }
}
