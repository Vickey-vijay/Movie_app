package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ox2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz f81173a;

    public /* synthetic */ ox2() {
        this(new dz());
    }

    public static boolean a(Context context) {
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        return nt2VarA == null || nt2VarA.f80773j;
    }

    public final boolean b(Context context) {
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA == null || !nt2VarA.f80771i || a(context)) {
            return true;
        }
        this.f81173a.getClass();
        return (ck.p.e(cw2.a().b(), nt2VarA.M) ^ true) && ck.p.e(cw2.a().b(), Boolean.TRUE);
    }

    public ox2(dz dzVar) {
        this.f81173a = dzVar;
    }
}
