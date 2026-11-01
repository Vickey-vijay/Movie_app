package yads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f75427a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile sp0 f75428b;

    public static final void a(sp0 sp0Var) {
        f75428b = sp0Var;
        for (me2 me2Var : f75427a) {
            if (f75428b != null) {
                sp0 sp0Var2 = f75428b;
                if (sp0Var2 != null) {
                    ((zn0) sp0Var2.f82716a).a(me2Var);
                }
            } else {
                f75427a.add(me2Var);
            }
        }
    }
}
