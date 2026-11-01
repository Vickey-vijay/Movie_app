package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class xs2 implements y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f84682a;

    @Override // yads.y9
    public final fo2 a() {
        fo2 fo2Var = new fo2((Map) null, 3);
        fo2Var.b(this.f84682a.f83820l, "ad_source");
        fo2Var.b(this.f84682a.f83810b, "ad_type_format");
        fo2Var.b(this.f84682a.f83813e, "ad_unit_id");
        fo2Var.b(this.f84682a.f83812d, "product_type");
        fo2Var.a(this.f84682a.f83823o, "server_log_id");
        fo2Var.b(this.f84682a.c().f80815a.f85668b, "size_type");
        fo2Var.b(Integer.valueOf(this.f84682a.c().f80817c), "width");
        fo2Var.b(Integer.valueOf(this.f84682a.c().f80818d), "height");
        fo2Var.f77472b = this.f84682a.f83817i;
        return fo2Var;
    }

    public xs2(v9 v9Var) {
        this.f84682a = v9Var;
    }
}
