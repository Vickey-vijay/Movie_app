package yads;

import android.view.View;
import com.ironsource.C3426d4;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public final class mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f80185a;

    public /* synthetic */ mj() {
        this(nj.s.k());
    }

    public final r12 a(View view, iy1 iy1Var) {
        q12 q12Var = new q12(view, q22.f81687c, kotlin.collections.a.j());
        q12Var.f81681e.put("age", iy1Var.h(view));
        q12Var.f81681e.put("body", iy1Var.a(view));
        q12Var.f81681e.put("call_to_action", iy1Var.e(view));
        q12Var.f81681e.put(C3426d4.j.D, iy1Var.n(view));
        q12Var.f81681e.put("favicon", iy1Var.g(view));
        q12Var.f81681e.put("feedback", iy1Var.l(view));
        q12Var.f81681e.put("icon", iy1Var.o(view));
        q12Var.f81681e.put(C3426d4.i.I0, iy1Var.c(view));
        q12Var.f81679c = iy1Var.b(view);
        q12Var.f81680d = iy1Var.k(view);
        q12Var.f81681e.put("price", iy1Var.d(view));
        View viewI = iy1Var.i(view);
        if (!(viewI instanceof tl2)) {
            viewI = null;
        }
        q12Var.f81681e.put("rating", viewI);
        q12Var.f81681e.put("review_count", iy1Var.p(view));
        q12Var.f81681e.put("sponsored", iy1Var.m(view));
        q12Var.f81681e.put("title", iy1Var.j(view));
        q12Var.f81681e.put("warning", iy1Var.f(view));
        for (String str : this.f80185a) {
            View viewA = iy1Var.a(view, str);
            if (viewA != null) {
                q12Var.f81681e.put(str, viewA);
            }
        }
        return new r12(q12Var);
    }

    public mj(Collection collection) {
        this.f80185a = collection;
    }
}
