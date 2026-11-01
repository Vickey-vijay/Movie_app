package yads;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class d41 implements up2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f76575b;

    public d41(k41 k41Var, String str) {
        this.f76575b = k41Var;
        this.f76574a = str;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        k41 k41Var = this.f76575b;
        String str = this.f76574a;
        ((t82) k41Var.f79298b).a(str, bitmap);
        g41 g41Var = (g41) k41Var.f79299c.remove(str);
        if (g41Var != null) {
            g41Var.f77625b = bitmap;
            k41Var.f79300d.put(str, g41Var);
            if (k41Var.f79302f == null) {
                f41 f41Var = new f41(k41Var);
                k41Var.f79302f = f41Var;
                k41Var.f79301e.postDelayed(f41Var, 100);
            }
        }
    }
}
