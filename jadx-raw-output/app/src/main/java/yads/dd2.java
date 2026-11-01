package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class dd2 implements wa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k83 f76643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f83 f76644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xo2 f76645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final be0 f76646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f76647e;

    public /* synthetic */ dd2(Context context, d4 d4Var, lu2 lu2Var, k83 k83Var) {
        f83 f83Var = new f83(context, d4Var, lu2Var);
        Object obj = xo2.f84662a;
        this(context, k83Var, f83Var, wo2.a(), new be0());
    }

    @Override // yads.wa3
    public final void a(String str, Map map) {
        String strA = this.f76646d.a(str, map);
        Object obj = dw2.f76819j;
        bd2 bd2Var = new bd2(this.f76647e, strA, new cd2(str, cw2.a().a(this.f76647e), this.f76644b, this.f76643a));
        xo2 xo2Var = this.f76645c;
        Context context = this.f76647e;
        synchronized (xo2Var) {
            r82.a(context).a(bd2Var);
        }
    }

    public dd2(Context context, k83 k83Var, f83 f83Var, xo2 xo2Var, be0 be0Var) {
        this.f76643a = k83Var;
        this.f76644b = f83Var;
        this.f76645c = xo2Var;
        this.f76646d = be0Var;
        this.f76647e = context.getApplicationContext();
    }
}
