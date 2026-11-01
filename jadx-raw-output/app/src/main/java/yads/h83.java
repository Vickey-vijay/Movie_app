package yads;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public final class h83 implements l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f78097d = {wb.a(h83.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o32 f78098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f78099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f78100c;

    @Override // yads.l1
    public final void a(Activity activity) {
        lm2 lm2Var = this.f78100c;
        jk.k kVar = f78097d[0];
        Context context = (Context) lm2Var.f79854a.get();
        if (context == null || !ck.p.e(context, activity)) {
            return;
        }
        this.f78098a.f80925a.h();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        lm2 lm2Var = this.f78100c;
        jk.k kVar = f78097d[0];
        Context context = (Context) lm2Var.f79854a.get();
        if (context == null || !ck.p.e(context, activity)) {
            return;
        }
        this.f78098a.f80925a.g();
    }

    public h83(Activity activity, o32 o32Var, w0 w0Var) {
        this.f78098a = o32Var;
        this.f78099b = w0Var;
        this.f78100c = mm2.a(activity);
    }
}
