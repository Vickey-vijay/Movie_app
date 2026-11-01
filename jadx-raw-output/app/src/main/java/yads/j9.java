package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class j9 implements ep2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f78947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n9 f78948b = new n9();

    @Override // yads.ep2
    public final Map a() {
        Map mapO = kotlin.collections.a.o(mj.h.a("ad_type", this.f78947a.f76559a.f76868b));
        String str = this.f78947a.f76561c.f78158a;
        if (str != null) {
            mapO.put("ad_unit_id", str);
        }
        mapO.putAll(this.f78948b.a(this.f78947a.f76563e).f77471a);
        return mapO;
    }

    public j9(d4 d4Var) {
        this.f78947a = d4Var;
    }
}
