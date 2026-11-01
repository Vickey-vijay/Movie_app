package yads;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ev0 implements pb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pb2 f77205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f77206b;

    @Override // yads.pb2
    public final Object a(Uri uri, r30 r30Var) {
        dv0 dv0Var = (dv0) this.f77205a.a(uri, r30Var);
        List list = this.f77206b;
        if (list == null || list.isEmpty()) {
            return dv0Var;
        }
        return ((c30) dv0Var).a(this.f77206b);
    }

    public ev0(e30 e30Var, List list) {
        this.f77205a = e30Var;
        this.f77206b = list;
    }
}
