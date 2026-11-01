package yads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public final class za {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ExecutorService f85258d = Executors.newCachedThreadPool(new ey1(ey1.f77224b));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f85259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f85260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f85261c;

    public za(Context context, lu2 lu2Var, d4 d4Var) {
        this.f85259a = d4Var;
        this.f85260b = lu2Var;
        this.f85261c = context.getApplicationContext();
    }

    public static void a(za zaVar, String str, k83 k83Var) {
        Map mapJ = kotlin.collections.a.j();
        dd2 dd2Var = new dd2(zaVar.f85261c, zaVar.f85259a, zaVar.f85260b, k83Var);
        if (str.length() > 0) {
            f85258d.execute(new ya(str, dd2Var, mapJ));
        }
    }
}
