package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f78670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f78672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y9 f78673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i22 f78674e;

    public /* synthetic */ ij(o5 o5Var, e00 e00Var, String str) {
        this(e00Var, str, o5Var.a(), o5Var.b());
    }

    public final fo2 a() {
        fo2 fo2VarA = this.f78673d.a();
        fo2VarA.b(this.f78670a.f76868b, "ad_type");
        fo2VarA.a(this.f78671b, CreativeInfo.f44321c);
        fo2VarA.f77471a.putAll(this.f78672c.a());
        i22 i22Var = this.f78674e;
        return i22Var != null ? go2.a(fo2VarA, i22Var.a()) : fo2VarA;
    }

    public ij(e00 e00Var, String str, r2 r2Var, y9 y9Var) {
        this.f78670a = e00Var;
        this.f78671b = str;
        this.f78672c = r2Var;
        this.f78673d = y9Var;
    }
}
