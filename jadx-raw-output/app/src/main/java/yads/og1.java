package yads;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes9.dex */
public final class og1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f81031d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile og1 f81032e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ey1 f81033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f81034b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f81035c;

    public final Executor a() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f81031d) {
            if (this.f81034b.size() < 4) {
                executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f81033a);
                this.f81034b.add(executorNewSingleThreadExecutor);
            } else {
                ArrayList arrayList = this.f81034b;
                int i10 = this.f81035c;
                this.f81035c = i10 + 1;
                executorNewSingleThreadExecutor = (Executor) arrayList.get(i10);
                if (this.f81035c == 4) {
                    this.f81035c = 0;
                }
            }
        }
        return executorNewSingleThreadExecutor;
    }

    public og1(ey1 ey1Var) {
        this.f81033a = ey1Var;
    }
}
