package yads;

import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ko2 extends lo2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f79498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pl2 f79499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vz2 f79500h;

    @Override // yads.lo2
    public final String c() {
        return this.f79498f;
    }

    @Override // yads.lo2
    public final i30 d() {
        return this.f79500h;
    }

    @Override // yads.lo2
    public final pl2 e() {
        return this.f79499g;
    }

    public ko2(long j10, mx0 mx0Var, p51 p51Var, gx2 gx2Var, ArrayList arrayList) {
        super(mx0Var, p51Var, gx2Var, arrayList);
        Uri.parse(((uo) p51Var.get(0)).f83549a);
        pl2 pl2VarB = gx2Var.b();
        this.f79499g = pl2VarB;
        this.f79498f = null;
        this.f79500h = pl2VarB == null ? new vz2(new pl2(null, 0L, -1L)) : null;
    }
}
