package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile c31 f84584a;

    public static final c31 a(Context context) {
        if (f84584a == null) {
            synchronized (c31.f76138h) {
                if (f84584a == null) {
                    Context applicationContext = context.getApplicationContext();
                    f84584a = new c31(applicationContext, pg.a(applicationContext), new yg(), new wg(new ug(), pg.a(applicationContext)), new bj1(ug1.a(applicationContext, "YadPreferenceFile")));
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        c31 c31Var = f84584a;
        ck.p.g(c31Var);
        return c31Var;
    }
}
