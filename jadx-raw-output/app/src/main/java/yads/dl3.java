package yads;

import android.content.Context;
import com.ironsource.C3426d4;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dl3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n9 f76724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f76725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xa2 f76726c;

    public /* synthetic */ dl3(Context context, lu2 lu2Var) {
        n9 n9Var = new n9();
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f81606a;
        this(n9Var, cf.a(context, iu3Var.b()), new xa2());
    }

    public final void a(bl3 bl3Var, d4 d4Var) {
        String str;
        zz2 zz2VarB;
        g9 g9Var = d4Var.f76563e;
        fo2 fo2VarA = g9Var != null ? this.f76724a.a(g9Var) : new fo2((Map) null, 3);
        g9 g9Var2 = d4Var.f76563e;
        if (g9Var2 != null) {
            go2.a(fo2VarA, this.f76724a.a(g9Var2));
        }
        fo2VarA.b(d4Var.f76561c.f78158a, "ad_unit_id");
        xa2 xa2Var = this.f76726c;
        int i10 = d4Var.f76572n;
        xa2Var.getClass();
        if (i10 != 1) {
            str = i10 != 2 ? "undefined" : C3426d4.i.C;
        } else {
            str = C3426d4.i.D;
        }
        fo2VarA.b(str, "orientation");
        a03 a03Var = d4Var.f76562d.f75685a;
        fo2VarA.a((a03Var == null || (zz2VarB = a03Var.b()) == null) ? null : zz2VarB.f85668b, "size_type");
        a03 a03Var2 = d4Var.f76562d.f75685a;
        fo2VarA.a(a03Var2 != null ? Integer.valueOf(a03Var2.getWidth()) : null, "size_info_width");
        a03 a03Var3 = d4Var.f76562d.f75685a;
        fo2VarA.a(a03Var3 != null ? Integer.valueOf(a03Var3.getHeight()) : null, "size_info_height");
        fo2VarA.b(Integer.valueOf(bl3Var.f75885a.f75560a), "view_width");
        fo2VarA.b(Integer.valueOf(bl3Var.f75885a.f75561b), "view_height");
        fo2VarA.a(bl3Var.f75886b.f75497a, "layout_width");
        fo2VarA.a(bl3Var.f75886b.f75498b, "layout_height");
        fo2VarA.b(Integer.valueOf(bl3Var.f75887c.f79067a.f79427a), "measured_width");
        String strName = bl3Var.f75887c.f79067a.f79428b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        ck.p.i(lowerCase, "toLowerCase(...)");
        fo2VarA.b(lowerCase, "measured_width_mode");
        fo2VarA.b(Integer.valueOf(bl3Var.f75887c.f79068b.f79427a), "measured_height");
        String lowerCase2 = bl3Var.f75887c.f79068b.f79428b.name().toLowerCase(locale);
        ck.p.i(lowerCase2, "toLowerCase(...)");
        fo2VarA.b(lowerCase2, "measured_height_mode");
        co2 co2Var = co2.f76352c;
        this.f76725b.a(new eo2("ad_view_size_info", kotlin.collections.a.B(fo2VarA.f77471a), fo2VarA.f77472b));
    }

    public dl3(n9 n9Var, io2 io2Var, xa2 xa2Var) {
        this.f76724a = n9Var;
        this.f76725b = io2Var;
        this.f76726c = xa2Var;
    }
}
