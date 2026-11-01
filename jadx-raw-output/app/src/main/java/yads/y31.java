package yads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import yads.y31;

/* JADX INFO: loaded from: classes10.dex */
public final class y31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k41 f84805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f84806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d51 f84807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f84808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f84809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final js1 f84810f;

    public final void a(Map map) {
        if (this.f84809e.decrementAndGet() == 0) {
            this.f84807c.a(map);
        }
    }

    public y31(k41 k41Var, Set set, d51 d51Var, Handler handler, AtomicInteger atomicInteger, js1 js1Var) {
        this.f84805a = k41Var;
        this.f84806b = set;
        this.f84807c = d51Var;
        this.f84808d = handler;
        this.f84809e = atomicInteger;
        this.f84810f = js1Var;
    }

    public final boolean a(u41 u41Var) {
        int iA = u41Var.a();
        int iB = u41Var.b();
        this.f84810f.getClass();
        if (js1.a() >= (iA * iB * 4) + 1048576.0f) {
            return true;
        }
        boolean z10 = ad1.f75480a;
        return false;
    }

    public final void a() {
        final HashMap map = new HashMap();
        for (final u41 u41Var : this.f84806b) {
            final String str = u41Var.f83368c;
            final int i10 = u41Var.f83367b;
            final int i11 = u41Var.f83366a;
            boolean z10 = ad1.f75480a;
            if (a(u41Var)) {
                this.f84808d.post(new Runnable() { // from class: cp.rc
                    @Override // java.lang.Runnable
                    public final void run() {
                        y31.a(this.f51559b, str, i11, i10, map, u41Var);
                    }
                });
            } else {
                a(map);
            }
        }
    }

    public static final void a(y31 y31Var, String str, int i10, int i11, Map map, u41 u41Var) {
        y31Var.f84805a.a(str, new x31(y31Var, map, u41Var), i10, i11);
    }
}
