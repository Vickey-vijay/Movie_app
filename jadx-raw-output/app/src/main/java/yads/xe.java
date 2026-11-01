package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ve f84539a;

    public static final dg a(Context context) {
        ve veVar;
        ve veVar2 = f84539a;
        if (veVar2 != null) {
            return veVar2;
        }
        synchronized (ve.f83883c) {
            Context contextA = uz.a(context);
            veVar = f84539a;
            if (veVar == null) {
                te teVar = new te(contextA);
                Object obj = og1.f81031d;
                veVar = new ve(teVar, ng1.a().a());
                f84539a = veVar;
            }
        }
        return veVar;
    }
}
