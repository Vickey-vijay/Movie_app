package yads;

import android.content.Context;
import yads.ew2;

/* JADX INFO: loaded from: classes10.dex */
public final class ew2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1 f77213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f77214b;

    public final void a(Context context) {
        this.f77213a.getClass();
        Boolean bool = (Boolean) sh1.a(context, th1.f83036c.f83045b);
        if (bool == null || bool.booleanValue()) {
            lu2 lu2Var = this.f77214b;
            l00 l00Var = new l00() { // from class: cp.o1
                @Override // yads.l00
                public final void onInitializationCompleted() {
                    ew2.a();
                }
            };
            new lr0(new nh1()).a(new qu1(context, lu2Var, l00Var), new ru1(context, lu2Var, l00Var));
        }
    }

    public ew2(sh1 sh1Var, lu2 lu2Var) {
        this.f77213a = sh1Var;
        this.f77214b = lu2Var;
    }

    public static final void a() {
        boolean z10 = ad1.f75480a;
    }
}
