package yads;

import android.os.Handler;
import android.os.SystemClock;
import yads.ok0;

/* JADX INFO: loaded from: classes9.dex */
public final class fd0 implements uc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gd0 f77354a;

    public fd0(gd0 gd0Var) {
        this.f77354a = gd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[DONT_INVERT] */
    public final void a(final zc0 zc0Var, int i10) {
        gd0 gd0Var;
        ed0 ed0Var;
        gd0 gd0Var2;
        if (i10 == 1) {
            gd0 gd0Var3 = this.f77354a;
            if (gd0Var3.f77755p > 0 && gd0Var3.f77751l != -9223372036854775807L) {
                gd0Var3.f77754o.add(zc0Var);
                Handler handler = this.f77354a.f77760u;
                handler.getClass();
                handler.postAtTime(new Runnable() { // from class: cp.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        zc0Var.a((ok0) null);
                    }
                }, zc0Var, SystemClock.uptimeMillis() + this.f77354a.f77751l);
            } else if (i10 == 0) {
                this.f77354a.f77752m.remove(zc0Var);
                gd0Var = this.f77354a;
                if (gd0Var.f77757r == zc0Var) {
                    gd0Var.f77757r = null;
                }
                if (gd0Var.f77758s == zc0Var) {
                    gd0Var.f77758s = null;
                }
                ed0Var = gd0Var.f77748i;
                ed0Var.f77031a.remove(zc0Var);
                if (ed0Var.f77032b == zc0Var) {
                    ed0Var.f77032b = null;
                    if (!ed0Var.f77031a.isEmpty()) {
                        zc0 zc0Var2 = (zc0) ed0Var.f77031a.iterator().next();
                        ed0Var.f77032b = zc0Var2;
                        nn0 nn0VarA = zc0Var2.f85316b.a();
                        zc0Var2.f85338x = nn0VarA;
                        vc0 vc0Var = zc0Var2.f85332r;
                        int i11 = ib3.f78556a;
                        nn0VarA.getClass();
                        vc0Var.getClass();
                        vc0Var.obtainMessage(0, new wc0(vf1.f83897a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA)).sendToTarget();
                    }
                }
                gd0Var2 = this.f77354a;
                if (gd0Var2.f77751l != -9223372036854775807L) {
                    Handler handler2 = gd0Var2.f77760u;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(zc0Var);
                    this.f77354a.f77754o.remove(zc0Var);
                }
            }
        } else if (i10 == 0) {
            this.f77354a.f77752m.remove(zc0Var);
            gd0Var = this.f77354a;
            if (gd0Var.f77757r == zc0Var) {
                gd0Var.f77757r = null;
            }
            if (gd0Var.f77758s == zc0Var) {
                gd0Var.f77758s = null;
            }
            ed0Var = gd0Var.f77748i;
            ed0Var.f77031a.remove(zc0Var);
            if (ed0Var.f77032b == zc0Var) {
                ed0Var.f77032b = null;
                if (!ed0Var.f77031a.isEmpty()) {
                    zc0 zc0Var3 = (zc0) ed0Var.f77031a.iterator().next();
                    ed0Var.f77032b = zc0Var3;
                    nn0 nn0VarA2 = zc0Var3.f85316b.a();
                    zc0Var3.f85338x = nn0VarA2;
                    vc0 vc0Var2 = zc0Var3.f85332r;
                    int i12 = ib3.f78556a;
                    nn0VarA2.getClass();
                    vc0Var2.getClass();
                    vc0Var2.obtainMessage(0, new wc0(vf1.f83897a.getAndIncrement(), true, SystemClock.elapsedRealtime(), nn0VarA2)).sendToTarget();
                }
            }
            gd0Var2 = this.f77354a;
            if (gd0Var2.f77751l != -9223372036854775807L) {
                Handler handler3 = gd0Var2.f77760u;
                handler3.getClass();
                handler3.removeCallbacksAndMessages(zc0Var);
                this.f77354a.f77754o.remove(zc0Var);
            }
        }
        gd0 gd0Var4 = this.f77354a;
        if (gd0Var4.f77756q != null && gd0Var4.f77755p == 0 && gd0Var4.f77752m.isEmpty() && gd0Var4.f77753n.isEmpty()) {
            on0 on0Var = gd0Var4.f77756q;
            on0Var.getClass();
            on0Var.release();
            gd0Var4.f77756q = null;
        }
    }
}
