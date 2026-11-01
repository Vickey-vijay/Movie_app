package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes8.dex */
public final class ke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f79399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z52 f79400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d72 f79401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f79402d;

    public /* synthetic */ ke0(Context context, w5 w5Var) {
        this(w5Var, new z52(context), new d72());
    }

    public final void a(String str) {
        mj0 mj0Var;
        synchronized (this.f79402d) {
            z52 z52Var = this.f79400b;
            if (z52Var.f85225b.containsKey(str) && (mj0Var = z52Var.f85224a) != null) {
                mj0Var.f80189c++;
                mj0Var.f80187a.obtainMessage(3, 1, 0, str).sendToTarget();
            }
            mj.r rVar = mj.r.f64562a;
        }
    }

    public ke0(w5 w5Var, z52 z52Var, d72 d72Var) {
        this.f79399a = w5Var;
        this.f79400b = z52Var;
        this.f79401c = d72Var;
        this.f79402d = new Object();
    }

    public final void a(ry1 ry1Var, g62 g62Var, z30 z30Var) {
        synchronized (this.f79402d) {
            d12 d12Var = ry1Var.f82466a;
            d72 d72Var = this.f79401c;
            d72Var.getClass();
            List<Pair> listT = SequencesKt___SequencesKt.T(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.K(SequencesKt___SequencesKt.L(SequencesKt___SequencesKt.E(nj.b0.S(d12Var.f76509a), new a72(d72Var)), b72.f75752b), y62.f84832b), z62.f85230b));
            if (listT.isEmpty()) {
                g62Var.a();
                return;
            }
            je0 je0Var = new je0(this.f79399a, listT.size(), g62Var, z30Var);
            this.f79399a.a(v5.f83756p, null);
            for (Pair pair : listT) {
                this.f79400b.a((String) pair.component1(), je0Var, (String) pair.component2());
            }
            mj.r rVar = mj.r.f64562a;
        }
    }
}
