package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f80301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ep1 f80302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ro1 f80303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final go1 f80304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80305e;

    public mo1(List list, ep1 ep1Var, ro1 ro1Var, go1 go1Var) {
        this.f80301a = list;
        this.f80302b = ep1Var;
        this.f80303c = ro1Var;
        this.f80304d = go1Var;
    }

    public final co1 a(Context context, Class cls) {
        while (this.f80305e < this.f80301a.size()) {
            List list = this.f80301a;
            int i10 = this.f80305e;
            this.f80305e = i10 + 1;
            qq1 qq1Var = (qq1) list.get(i10);
            com.monetization.ads.mediation.base.a aVarA = this.f80303c.a(context, qq1Var, cls);
            if (aVarA != null) {
                this.f80304d.getClass();
                return new co1(aVarA, qq1Var, new fo1(aVarA), this.f80302b);
            }
        }
        return null;
    }

    public /* synthetic */ mo1(List list, ep1 ep1Var, xo1 xo1Var) {
        this(list, ep1Var, new ro1(xo1Var), new go1());
    }
}
