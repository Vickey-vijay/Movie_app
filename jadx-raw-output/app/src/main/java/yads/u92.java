package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public final class u92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f83399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y92 f83400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo2 f83401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dw2 f83402d;

    public final void a(w92 w92Var) {
        nt2 nt2VarA = this.f83402d.a(this.f83399a);
        String str = nt2VarA != null ? nt2VarA.Q : null;
        String strC = ((tg1) this.f83400b.f84866a).c("YmadOmSdkJsUrl");
        if (str == null || str.length() <= 0 || ck.p.e(str, strC)) {
            w92Var.a();
            return;
        }
        t92 t92Var = new t92(this, str, w92Var);
        h43 h43Var = new h43(str, t92Var, t92Var);
        h43Var.f81503q = "om_sdk_js_request_tag";
        xo2 xo2Var = this.f83401c;
        Context context = this.f83399a;
        synchronized (xo2Var) {
            r82.a(context).a(h43Var);
        }
    }

    public u92(Context context) {
        this.f83399a = context.getApplicationContext();
        this.f83400b = z92.a(context);
        Object obj = xo2.f84662a;
        this.f83401c = wo2.a();
        Object obj2 = dw2.f76819j;
        this.f83402d = cw2.a();
    }
}
