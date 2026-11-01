package yads;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import yads.mo;
import yads.s63;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ry extends mo {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f82462h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f82463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r83 f82464j;

    public ym1 a(Object obj, ym1 ym1Var) {
        return ym1Var;
    }

    @Override // yads.mo
    public final void a() {
        for (qy qyVar : this.f82462h.values()) {
            qyVar.f82024a.a(qyVar.f82025b);
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(Object obj, mo moVar, s63 s63Var);

    @Override // yads.mo
    public final void b() {
        for (qy qyVar : this.f82462h.values()) {
            qyVar.f82024a.b(qyVar.f82025b);
        }
    }

    @Override // yads.mo
    public void d() {
        Iterator it = this.f82462h.values().iterator();
        while (it.hasNext()) {
            ((qy) it.next()).f82024a.d();
        }
    }

    @Override // yads.mo
    public void e() {
        for (qy qyVar : this.f82462h.values()) {
            qyVar.f82024a.c(qyVar.f82025b);
            qyVar.f82024a.a((cn1) qyVar.f82026c);
            qyVar.f82024a.a((pk0) qyVar.f82026c);
        }
        this.f82462h.clear();
    }

    public final void a(final Object obj, mo moVar) {
        if (!this.f82462h.containsKey(obj)) {
            zm1 zm1Var = new zm1() { // from class: cp.s9
                @Override // yads.zm1
                public final void a(mo moVar2, s63 s63Var) {
                    this.f51583a.a(obj, moVar2, s63Var);
                }
            };
            py pyVar = new py(this, obj);
            this.f82462h.put(obj, new qy(moVar, zm1Var, pyVar));
            Handler handler = this.f82463i;
            handler.getClass();
            moVar.getClass();
            bn1 bn1Var = moVar.f80295c;
            bn1Var.getClass();
            bn1Var.f75912c.add(new an1(handler, pyVar));
            Handler handler2 = this.f82463i;
            handler2.getClass();
            ok0 ok0Var = moVar.f80296d;
            ok0Var.getClass();
            ok0Var.f81064c.add(new nk0(handler2, pyVar));
            r83 r83Var = this.f82464j;
            ye2 ye2Var = this.f80299g;
            if (ye2Var != null) {
                Looper looperMyLooper = Looper.myLooper();
                Looper looper = moVar.f80297e;
                if (looper != null && looper != looperMyLooper) {
                    throw new IllegalArgumentException();
                }
                moVar.f80299g = ye2Var;
                s63 s63Var = moVar.f80298f;
                moVar.f80293a.add(zm1Var);
                if (moVar.f80297e == null) {
                    moVar.f80297e = looperMyLooper;
                    moVar.f80294b.add(zm1Var);
                    moVar.a(r83Var);
                } else if (s63Var != null) {
                    moVar.b(zm1Var);
                    zm1Var.a(moVar, s63Var);
                }
                if (!this.f80294b.isEmpty()) {
                    return;
                }
                moVar.a(zm1Var);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }
}
