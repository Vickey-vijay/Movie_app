package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class tw1 implements f92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c92 f83217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n32 f83218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f83219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final va f83220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final za f83221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dw2 f83222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k73 f83223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d83 f83224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d61 f83225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f83226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f83227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f83228m = new ArrayList();

    public final synchronized void a(List list) {
        qy2 qy2Var;
        this.f83228m.clear();
        d83 d83Var = this.f83224i;
        va vaVar = this.f83220e;
        d83Var.getClass();
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((py2) it.next()).f81652d);
        }
        Set setT0 = nj.b0.T0(arrayList);
        int iOrdinal = vaVar.ordinal();
        if (iOrdinal == 0) {
            if (!(setT0 instanceof Collection) || !setT0.isEmpty()) {
                Iterator it2 = setT0.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((qy2) it2.next()) == qy2.f82039c) {
                            qy2Var = null;
                            break;
                        }
                    }
                }
            }
            qy2Var = qy2.f82038b;
            break;
        }
        if (iOrdinal == 1) {
            qy2Var = qy2.f82039c;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qy2Var = qy2.f82038b;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<py2> arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((py2) obj).f81650b != null) {
                arrayList3.add(obj);
            }
        }
        for (py2 py2Var : arrayList3) {
            String str = py2Var.f81650b;
            long j10 = py2Var.f81649a;
            int i10 = py2Var.f81651c;
            qy2 qy2Var2 = py2Var.f81652d;
            qy2 qy2Var3 = (qy2Var2 != qy2.f82040d || qy2Var == null) ? qy2Var2 : qy2Var;
            if (str != null) {
                arrayList2.add(new c83(i10, j10, qy2Var3, str));
            }
        }
        this.f83228m.addAll(arrayList2);
    }

    public final synchronized void b() {
        boolean z10 = ad1.f75480a;
        this.f83223h.b();
        Iterator it = this.f83228m.iterator();
        while (it.hasNext()) {
            ((c83) it.next()).f76213e = null;
        }
    }

    public tw1(Context context, c92 c92Var, n32 n32Var, String str, va vaVar, za zaVar, dw2 dw2Var, k73 k73Var, d83 d83Var) {
        this.f83216a = context;
        this.f83217b = c92Var;
        this.f83218c = n32Var;
        this.f83219d = str;
        this.f83220e = vaVar;
        this.f83221f = zaVar;
        this.f83222g = dw2Var;
        this.f83223h = k73Var;
        this.f83224i = d83Var;
    }

    public final tb3 b(c83 c83Var) {
        tb3 tb3VarB = this.f83218c.b(c83Var.a());
        Objects.toString(tb3VarB);
        boolean z10 = ad1.f75480a;
        return tb3VarB;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0013, B:12:0x0019), top: B:18:0x0001 }] */
    public final synchronized void a(rc2 rc2Var, boolean z10) {
        Objects.toString(rc2Var);
        boolean z11 = ad1.f75480a;
        int iOrdinal = rc2Var.ordinal();
        if (iOrdinal == 0) {
            if (z10) {
                a();
            }
        } else if (iOrdinal == 1) {
            b();
        } else if (iOrdinal == 2) {
            if (z10) {
                a();
            }
        }
    }

    public final synchronized void a() {
        boolean z10 = ad1.f75480a;
        if (wc2.f84159h.a(this.f83216a).a() && (!this.f83228m.isEmpty()) && !this.f83223h.a()) {
            this.f83223h.a(this);
        }
    }

    public final synchronized void a(c83 c83Var, rb3 rb3Var) {
        za.a(this.f83221f, c83Var.f76209a, k83.f79336h);
        if (!this.f83226k) {
            this.f83226k = true;
            d61 d61Var = this.f83225j;
            if (d61Var != null) {
                d61Var.c();
            }
        }
        if (!this.f83227l && this.f83228m.isEmpty()) {
            this.f83227l = true;
            d61 d61Var2 = this.f83225j;
            if (d61Var2 != null) {
                d61Var2.g();
            }
        }
        this.f83217b.a(c83Var.f76212d, rb3Var);
        c92 c92Var = this.f83217b;
        qy2 qy2Var = c83Var.f76212d;
        ArrayList arrayList = this.f83228m;
        ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((c83) it.next()).f76212d);
        }
        c92Var.a(qy2Var, arrayList2, rb3Var);
    }

    public final synchronized void a(v9 v9Var, List list) {
        boolean z10 = ad1.f75480a;
        this.f83217b.a(v9Var);
        this.f83228m.clear();
        this.f83217b.invalidate();
        this.f83227l = false;
        b();
        a(list);
    }

    public final tb3 a(c83 c83Var) {
        tb3 tb3VarA;
        nt2 nt2VarA = this.f83222g.a(this.f83216a);
        if (nt2VarA != null && nt2VarA.g()) {
            tb3VarA = this.f83218c.b(c83Var.a());
        } else {
            tb3VarA = this.f83218c.a(c83Var.a());
        }
        Objects.toString(tb3VarA);
        boolean z10 = ad1.f75480a;
        return tb3VarA;
    }
}
