package yads;

import com.vungle.ads.internal.signals.SignalManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class ki2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zp0 f79424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final aq0 f79425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f79426e;

    public /* synthetic */ ki2() {
        this(SignalManager.TWENTY_FOUR_HOURS_MILLIS, 5, new zp0(), new aq0());
    }

    public final synchronized void a(ny0 ny0Var, Object obj) {
        a();
        if (this.f79426e.size() < this.f79423b) {
            ArrayList arrayList = this.f79426e;
            aq0 aq0Var = this.f79425d;
            long j10 = this.f79422a;
            aq0Var.getClass();
            arrayList.add(new ji2(ny0Var, obj, System.currentTimeMillis() + j10));
        }
    }

    public final synchronized boolean b() {
        a();
        return this.f79426e.size() < this.f79423b;
    }

    public ki2(long j10, int i10, zp0 zp0Var, aq0 aq0Var) {
        this.f79422a = j10;
        this.f79423b = i10;
        this.f79424c = zp0Var;
        this.f79425d = aq0Var;
        this.f79426e = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f79426e;
        zp0 zp0Var = this.f79424c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            zp0Var.getClass();
            if (System.currentTimeMillis() > ((ji2) ((yp0) obj)).f79054c) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f79426e.remove((ji2) it.next());
        }
    }

    public final synchronized Object a(ny0 ny0Var) {
        Object obj;
        Object next;
        Object obj2;
        a();
        Iterator it = this.f79426e.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ck.p.e(((ji2) next).f79052a, ny0Var));
        ji2 ji2Var = (ji2) next;
        if (ji2Var != null && (obj2 = ji2Var.f79053b) != null) {
            this.f79426e.remove(ji2Var);
            obj = obj2;
        }
        return obj;
    }
}
