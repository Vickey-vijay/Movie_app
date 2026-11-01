package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oz2 implements t22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy1 f81180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aq2 f81181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n9 f81182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wy f81183d;

    @Override // yads.t22
    public final fo2 a(v9 v9Var, d4 d4Var, d12 d12Var) {
        aq2 aq2Var = this.f81181b;
        fy1 fy1Var = this.f81180a;
        fo2 fo2VarA = aq2Var.a(v9Var, d4Var);
        if (d12Var != null) {
            List listA = aq2Var.f75595b.a(d12Var);
            if (!listA.isEmpty()) {
                fo2VarA.a(listA, "image_sizes");
            }
        }
        fo2VarA.b(fy1Var.f77547c, CreativeInfo.f44321c);
        Map map = fy1Var.f77556l;
        if (map != null) {
            fo2VarA.f77471a.putAll(map);
        }
        return go2.a(go2.a(fo2VarA, this.f81182c.a(d4Var.f76563e)), this.f81183d.a(d4Var));
    }

    public oz2(fy1 fy1Var, aq2 aq2Var, n9 n9Var, wy wyVar) {
        this.f81180a = fy1Var;
        this.f81181b = aq2Var;
        this.f81182c = n9Var;
        this.f81183d = wyVar;
    }
}
