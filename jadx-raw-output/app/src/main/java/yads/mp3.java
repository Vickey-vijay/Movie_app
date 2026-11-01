package yads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class mp3 implements fp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fg3 f80317a;

    @Override // yads.fp2
    public final eo2 a(Object obj) {
        Map mapA = this.f80317a.a();
        co2 co2Var = co2.f76352c;
        return new eo2("vast_wrapper_request", kotlin.collections.a.B(mapA), null);
    }

    public mp3(fg3 fg3Var) {
        this.f80317a = fg3Var;
    }

    @Override // yads.fp2
    public final eo2 a(vp2 vp2Var, int i10, Object obj) {
        do2 do2Var;
        List list = vp2Var != null ? (List) vp2Var.f83980a : null;
        if (204 == i10) {
            do2Var = do2.f76758e;
        } else if (list != null && i10 == 200) {
            do2Var = list.isEmpty() ? do2.f76758e : do2.f76756c;
        } else {
            do2Var = do2.f76757d;
        }
        Map mapQ = kotlin.collections.a.q(this.f80317a.a(), nj.l0.g(mj.h.a("status", do2Var.f76760b)));
        co2 co2Var = co2.f76352c;
        return new eo2("vast_wrapper_response", kotlin.collections.a.B(mapQ), null);
    }
}
