package nk;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l1 {
    public static final Executor a(h0 h0Var) {
        Executor executorN;
        j1 j1Var = h0Var instanceof j1 ? (j1) h0Var : null;
        return (j1Var == null || (executorN = j1Var.n()) == null) ? new v0(h0Var) : executorN;
    }

    public static final h0 b(Executor executor) {
        h0 h0Var;
        v0 v0Var = executor instanceof v0 ? (v0) executor : null;
        return (v0Var == null || (h0Var = v0Var.f64824b) == null) ? new k1(executor) : h0Var;
    }

    public static final j1 c(ExecutorService executorService) {
        return new k1(executorService);
    }
}
