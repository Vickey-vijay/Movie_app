package yads;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import yads.qp2;

/* JADX INFO: loaded from: classes2.dex */
public final class mj0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mp2 f80186h = new mp2(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jj0 f80187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f80188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f80190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f80193g;

    public final boolean a(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f80193g = Collections.unmodifiableList((List) message.obj);
            boolean zA = a();
            Iterator it = this.f80188b.iterator();
            while (it.hasNext()) {
                ((kj0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = this.f80188b.iterator();
                while (it2.hasNext()) {
                    ((kj0) it2.next()).getClass();
                }
            }
        } else if (i10 == 1) {
            int i11 = message.arg1;
            int i12 = message.arg2;
            int i13 = this.f80189c - i11;
            this.f80189c = i13;
            if (i12 == 0 && i13 == 0) {
                Iterator it3 = this.f80188b.iterator();
                while (it3.hasNext()) {
                    ((kj0) it3.next()).getClass();
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            ij0 ij0Var = (ij0) message.obj;
            this.f80193g = Collections.unmodifiableList(ij0Var.f78677c);
            gj0 gj0Var = ij0Var.f78675a;
            boolean zA2 = a();
            if (ij0Var.f78676b) {
                Iterator it4 = this.f80188b.iterator();
                while (it4.hasNext()) {
                    ((kj0) it4.next()).getClass();
                }
            } else {
                Iterator it5 = this.f80188b.iterator();
                while (it5.hasNext()) {
                    rn3 rn3Var = (rn3) ((kj0) it5.next());
                    rn3Var.getClass();
                    if (ck.p.e(gj0Var.f77816a.f81422b, rn3Var.f82352a)) {
                        if (rn3.f82349d.contains(Integer.valueOf(gj0Var.f77817b))) {
                            lm2 lm2Var = rn3Var.f82353b;
                            jk.k kVar = rn3.f82348c[0];
                            zg3 zg3Var = (zg3) lm2Var.f79854a.get();
                            if (zg3Var != null) {
                                zg3Var.a();
                            }
                        }
                        if (rn3.f82350e.contains(Integer.valueOf(gj0Var.f77817b))) {
                            lm2 lm2Var2 = rn3Var.f82353b;
                            jk.k kVar2 = rn3.f82348c[0];
                            zg3 zg3Var2 = (zg3) lm2Var2.f79854a.get();
                            if (zg3Var2 != null) {
                                zg3Var2.c();
                            }
                        }
                        if (rn3.f82351f.contains(Integer.valueOf(gj0Var.f77817b))) {
                            this.f80188b.remove(rn3Var);
                        }
                    }
                }
            }
            if (zA2) {
                Iterator it6 = this.f80188b.iterator();
                while (it6.hasNext()) {
                    ((kj0) it6.next()).getClass();
                }
            }
        }
        return true;
    }

    public mj0(Context context, rc0 rc0Var, sc0 sc0Var) {
        context.getApplicationContext();
        this.f80190d = true;
        this.f80193g = Collections.emptyList();
        this.f80188b = new CopyOnWriteArraySet();
        Handler handlerB = ib3.b(new Handler.Callback() { // from class: cp.j6
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f51392b.a(message);
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        jj0 jj0Var = new jj0(handlerThread, rc0Var, sc0Var, handlerB, this.f80190d);
        this.f80187a = jj0Var;
        int iC = new qp2(context, new op2() { // from class: cp.k6
            @Override // yads.op2
            public final void a(qp2 qp2Var, int i10) {
                this.f51409a.a(qp2Var, i10);
            }
        }).c();
        this.f80191e = iC;
        this.f80189c = 1;
        jj0Var.obtainMessage(0, iC, 0).sendToTarget();
    }

    public final void a(qp2 qp2Var, int i10) {
        mp2 mp2Var = qp2Var.f81924c;
        if (this.f80191e != i10) {
            this.f80191e = i10;
            this.f80189c++;
            this.f80187a.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean zA = a();
        Iterator it = this.f80188b.iterator();
        while (it.hasNext()) {
            ((kj0) it.next()).getClass();
        }
        if (zA) {
            Iterator it2 = this.f80188b.iterator();
            while (it2.hasNext()) {
                ((kj0) it2.next()).getClass();
            }
        }
    }

    public final boolean a() {
        boolean z10;
        if (!this.f80190d && this.f80191e != 0) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f80193g.size()) {
                    z10 = false;
                    break;
                }
                if (((gj0) this.f80193g.get(i10)).f77817b == 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        } else {
            z10 = false;
            break;
        }
        boolean z11 = this.f80192f != z10;
        this.f80192f = z10;
        return z11;
    }
}
