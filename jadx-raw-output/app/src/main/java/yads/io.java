package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import yads.io;

/* JADX INFO: loaded from: classes11.dex */
public final class io implements hd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rh1 f78759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh1 f78760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd1 f78761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f78762e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w00 f78763f;

    @Override // yads.hd1
    public final void a(final g9 g9Var) {
        this.f78759b.a();
        if (this.f78763f == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on loading start. Please, use setAdLoadListener before loading Ad.", new Object[0]);
        }
        this.f78760c.a(new Runnable() { // from class: cp.f3
            @Override // java.lang.Runnable
            public final void run() {
                io.a(this.f51321b, g9Var);
            }
        });
    }

    public io(Context context, rh1 rh1Var, mh1 mh1Var, gd1 gd1Var) {
        this.f78758a = context;
        this.f78759b = rh1Var;
        this.f78760c = mh1Var;
        this.f78761d = gd1Var;
    }

    public static final void a(io ioVar, g9 g9Var) {
        fd1 fd1VarA = ioVar.f78761d.a(ioVar.f78758a, ioVar, g9Var, null);
        ioVar.f78762e.add(fd1VarA);
        String str = g9Var.f77696a;
        fd1VarA.f85497c.a(str);
        fd1VarA.F.f82679f = str;
        fd1VarA.a(ioVar.f78763f);
        fd1VarA.b(g9Var);
    }

    @Override // yads.r5
    public final void a(fy0 fy0Var) {
        fd1 fd1Var = (fd1) fy0Var;
        if (this.f78763f == null) {
            lc1.c("InterstitialAdLoader. InterstitialAdLoadListener is null on finished ad loading. Please, keep active listener until ad loading finished or use cancelLoading().", new Object[0]);
        }
        fd1Var.a((w00) null);
        this.f78762e.remove(fd1Var);
    }

    @Override // yads.hd1
    public final void a(ct3 ct3Var) {
        this.f78759b.a();
        this.f78763f = ct3Var;
        Iterator it = this.f78762e.iterator();
        while (it.hasNext()) {
            ((fd1) it.next()).a((w00) ct3Var);
        }
    }
}
