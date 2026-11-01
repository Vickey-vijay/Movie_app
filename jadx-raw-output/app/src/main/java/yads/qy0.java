package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.Q6;
import java.util.List;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qy0 extends u73 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d4 f82027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final by0 f82028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m5 f82029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w5 f82030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n43 f82031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d9 f82032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c1 f82033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public iy0 f82034l;

    public /* synthetic */ qy0(Context context, v9 v9Var, d4 d4Var, lu2 lu2Var, by0 by0Var, m5 m5Var) {
        w5 w5Var = new w5();
        n43 n43Var = n43.f80556b;
        n43 n43VarA = m43.a();
        i12 i12Var = new i12(d4Var);
        i12Var.a(v9Var);
        iu3 iu3Var = (iu3) lu2Var;
        this(context, v9Var, d4Var, lu2Var, by0Var, m5Var, w5Var, n43VarA, new d9(context, v9Var, d4Var, w5Var, i12Var, iu3Var.a()), new c1(iu3Var.a(), d4Var, v9Var));
    }

    @Override // yads.y51
    public final void a(j5 j5Var) {
        iy0 iy0Var = this.f82034l;
        if (iy0Var != null) {
            iy0Var.a(j5Var);
        }
    }

    public abstract qy0 f();

    @Override // yads.g1
    public final void onReturnedToApplication() {
    }

    @Override // yads.u73, yads.f4
    public void a(int i10, Bundle bundle) {
        getClass().toString();
        boolean z10 = ad1.f75480a;
        if (i10 == 0) {
            this.f82030h.a(v5.f83746f);
            d9 d9Var = this.f82032j;
            fo2 fo2VarA = d9Var.f76596c.a();
            fo2VarA.b(bo2.f75924a, Q6.G1);
            fo2VarA.f77471a.putAll(d9Var.f76598e.a());
            a03 a03Var = d9Var.f76595b.f76562d.f75685a;
            if (a03Var != null) {
                fo2VarA.b(a03Var.b().f85668b, "size_type");
                fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
                fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
            }
            nt2 nt2Var = d9Var.f76599f;
            if (nt2Var != null) {
                fo2VarA.b(nt2Var.O, "banner_size_calculation_type");
            }
            c cVar = d9Var.f76594a.f83817i;
            fo2VarA.f77472b = cVar;
            d9Var.f76597d.a(new eo2(co2.f76353d.a(), kotlin.collections.a.B(fo2VarA.f77471a), cVar));
            iy0 iy0Var = this.f82034l;
            if (iy0Var != null) {
                iy0Var.onAdShown();
                return;
            }
            return;
        }
        if (i10 == 16) {
            if (bundle == null) {
                a((j5) null);
                return;
            } else {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                a(parcelable instanceof j5 ? (j5) parcelable : null);
                return;
            }
        }
        if (i10 == 17) {
            iy0 iy0Var2 = this.f82034l;
            if (iy0Var2 != null) {
                iy0Var2.onAdClicked();
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.f82033k.b();
            return;
        }
        if (i10 == 3) {
            this.f82033k.a();
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.a(i10, bundle);
            }
        } else {
            this.f82031i.a(ie1.f78607c, this);
            iy0 iy0Var3 = this.f82034l;
            if (iy0Var3 != null) {
                iy0Var3.onAdDismissed();
            }
        }
    }

    public final c00 d() {
        List listB = this.f82028f.b();
        m5 m5Var = this.f82029g;
        Context context = this.f80711a;
        v9 v9Var = this.f80712b;
        d4 d4Var = this.f82027e;
        String adInfo = this.f82028f.getAdInfo();
        m5Var.getClass();
        String str = v9Var.f83813e;
        if (str == null && (str = d4Var.f76561c.f78158a) == null) {
            str = "";
        }
        nv0 nv0VarC = v9Var.c();
        if (nv0VarC.f80817c == 0 || nv0VarC.f80818d == 0) {
            nv0VarC = null;
        }
        return new c00(str, nv0VarC != null ? new la(nv0VarC.c(context), nv0VarC.a(context)) : null, adInfo, listB);
    }

    public final List e() {
        return this.f82028f.a();
    }

    public final void g() {
        iy0 iy0Var = this.f82034l;
        if (iy0Var != null) {
            iy0Var.onAdClicked();
        }
    }

    public qy0(Context context, v9 v9Var, d4 d4Var, lu2 lu2Var, by0 by0Var, m5 m5Var, w5 w5Var, n43 n43Var, d9 d9Var, c1 c1Var) {
        super(context, v9Var, lu2Var, d4Var);
        this.f82027e = d4Var;
        this.f82028f = by0Var;
        this.f82029g = m5Var;
        this.f82030h = w5Var;
        this.f82031i = n43Var;
        this.f82032j = d9Var;
        this.f82033k = c1Var;
        k2.f79282b.a().a("window_type_fullscreen", new d2(lu2Var));
    }

    public final void a(iy0 iy0Var) {
        this.f82034l = iy0Var;
    }

    public final Object a(Activity activity) {
        Result.a aVar = Result.Companion;
        Result.m3458constructorimpl(kotlin.c.a(o7.f80954b));
        synchronized (this) {
        }
        w5 w5Var = this.f82030h;
        v5 v5Var = v5.f83746f;
        w5Var.a(v5Var, null);
        n43 n43Var = this.f82031i;
        ie1 ie1Var = ie1.f78607c;
        n43Var.b(ie1Var, this);
        Object objA = this.f82028f.a(f(), activity);
        if (Result.m3461exceptionOrNullimpl(objA) != null) {
            this.f82030h.a(v5Var);
            if (!tb.a((mu) this)) {
                this.f82031i.a(ie1Var, this);
                this.f82028f.a(this.f80711a);
                super.c();
            }
        }
        return objA;
    }
}
