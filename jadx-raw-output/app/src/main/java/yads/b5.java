package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5 f75723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f75724b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5() {
        this(d5.a(), new c5());
        Object obj = e5.f76915c;
    }

    public final String a(Context context) {
        List listO0;
        e5 e5Var = this.f75723a;
        e5Var.getClass();
        synchronized (e5.f76915c) {
            listO0 = nj.b0.O0(e5Var.f76918b);
        }
        return a(context, listO0);
    }

    public final String b(Context context) {
        List listO0;
        e5 e5Var = this.f75723a;
        e5Var.getClass();
        synchronized (e5.f76915c) {
            listO0 = nj.b0.O0(e5Var.f76917a);
        }
        return a(context, listO0);
    }

    public b5(e5 e5Var, c5 c5Var) {
        this.f75723a = e5Var;
        this.f75724b = c5Var;
    }

    public final String a(Context context, List list) {
        int i10;
        this.f75724b.getClass();
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || (i10 = nt2VarA.f80755a) == 0) {
            i10 = 5;
        }
        return nj.b0.p0(list.subList(list.size() - ik.k.g(i10, list.size()), list.size()), StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }
}
