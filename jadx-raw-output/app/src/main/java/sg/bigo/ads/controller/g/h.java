package sg.bigo.ads.controller.g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends a<sg.bigo.ads.controller.a.f> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final sg.bigo.ads.controller.b f70925j;

    public h(@NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.controller.a.b bVar, long j10, @NonNull sg.bigo.ads.controller.b bVar2) {
        super(gVar, bVar, j10);
        this.f70925j = bVar2;
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(int i10, int i11, String str) {
        this.f70925j.a(a(), i10, i11, str, null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        this.f70925j.a(a(), str);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void a(@NonNull a.b bVar) {
        bVar.a("req_status", Integer.valueOf(sg.bigo.ads.common.f.b.c()));
        sg.bigo.ads.common.b bVarAc = this.f70894b.ac();
        bVar.a("bat_stat", bVarAc != null ? String.valueOf(bVarAc.f69491c) : "");
        bVar.a("bat_num", bVarAc != null ? String.valueOf(bVarAc.f69489a) : "");
        bVar.a("bat_scale", bVarAc != null ? String.valueOf(bVarAc.f69490b) : "");
        bVar.a("coppa", Integer.valueOf(sg.bigo.ads.common.x.a.p()));
    }

    @Override // sg.bigo.ads.controller.g.a
    @Nullable
    public final sg.bigo.ads.common.n.e c() {
        return sg.bigo.ads.common.u.a.e.d();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final long e() {
        sg.bigo.ads.controller.a.b bVar = this.f70895c;
        return bVar != null ? bVar.f70407a.f70339l.f70405d : super.e();
    }

    @Override // sg.bigo.ads.controller.g.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.common.u.a f() {
        String str = this.f70901i;
        return str != null ? this.f70895c.b("/Ad/GetUniConfig", str) : this.f70895c.b("/Ad/GetUniConfig", null);
    }

    @Override // sg.bigo.ads.controller.g.a
    public final void i() {
        sg.bigo.ads.common.x.a.w();
    }

    @Override // sg.bigo.ads.controller.g.a
    public final boolean j() {
        return sg.bigo.ads.api.a.i.f69318a.c() && sg.bigo.ads.common.x.a.v();
    }
}
