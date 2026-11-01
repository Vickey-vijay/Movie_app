package yads;

import android.os.Looper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class vf {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f83886j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile vf f83887k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f83890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nk.l0 f83891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jf f83892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pf f83893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d63 f83894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x10 f83895h = new x10();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f83896i = new AtomicBoolean(false);

    public static final void a(vf vfVar) {
        vfVar.f83894g.getClass();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        StackTraceElement[] stackTraceElementArr = allStackTraces.get(Looper.getMainLooper().getThread());
        if (stackTraceElementArr != null) {
            Set set = h33.f78052a;
            if (h33.a(stackTraceElementArr, vfVar.f83890c)) {
                vfVar.f83893f.f81393a.reportAnr(allStackTraces);
            }
        }
    }

    public vf(long j10, long j11, Set set, nk.l0 l0Var, jf jfVar, pf pfVar, d63 d63Var) {
        this.f83888a = j10;
        this.f83889b = j11;
        this.f83890c = set;
        this.f83891d = l0Var;
        this.f83892e = jfVar;
        this.f83893f = pfVar;
        this.f83894g = d63Var;
    }
}
