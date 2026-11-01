package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$string;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class x70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f84465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eq1 f84466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fr1 f84467c;

    public final void a(List list, b50 b50Var) {
        x80 x80Var;
        if (b50Var.a() instanceof z40) {
            x80Var = new x80(this.f84465a.getString(R$string.not_integrated), 0, null, 0, 14);
        } else {
            String strF = b50Var.f();
            if (strF == null || lk.a0.n0(strF)) {
                x80Var = new x80(this.f84465a.getString(R$string.sdk_undefined), 0, null, 0, 14);
            } else {
                String lowerCase = b50Var.f().toLowerCase(Locale.ROOT);
                ck.p.i(lowerCase, "toLowerCase(...)");
                x80Var = new x80("SDK " + lowerCase, 0, null, 0, 14);
            }
        }
        x80 x80Var2 = x80Var;
        a50 a50VarA = b50Var.a();
        dr1 dr1Var = (a50VarA instanceof y40 ? (y40) a50VarA : null) != null ? dr1.INVALID_MEDIATION_ADAPTER_VERSION : null;
        StringBuilder sb2 = new StringBuilder();
        if (b50Var.b() != null) {
            sb2.append("Adapter " + b50Var.b() + "  ");
        }
        if (b50Var.c() != null) {
            sb2.append("Latest " + b50Var.c());
        }
        String string = sb2.toString();
        ck.p.i(string, "toString(...)");
        String strB = b50Var.b();
        list.add(new y90(b50Var.e(), b50Var.d(), x80Var2, new q50(string, (strB == null || lk.a0.n0(strB) || this.f84466b.a(b50Var.b(), b50Var.c())) ? R$attr.debug_panel_label_secondary : R$attr.debug_panel_color_orange), this.f84467c.a(dr1Var), null, null, null, null, null, b50Var.f(), 992));
    }

    public x70(Context context, eq1 eq1Var, fr1 fr1Var) {
        this.f84465a = context;
        this.f84466b = eq1Var;
        this.f84467c = fr1Var;
    }

    public final x80 a(Boolean bool) {
        if (ck.p.e(bool, Boolean.TRUE)) {
            return new x80(this.f84465a.getString(R$string.yes), 0, null, 0, 14);
        }
        if (ck.p.e(bool, Boolean.FALSE)) {
            return new x80(this.f84465a.getString(R$string.f50955no), 0, null, 0, 14);
        }
        if (bool == null) {
            return new x80(this.f84465a.getString(R$string.no_value_set), 0, null, 0, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
