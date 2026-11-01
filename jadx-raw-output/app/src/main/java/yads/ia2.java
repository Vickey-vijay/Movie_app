package yads;

import android.app.Activity;
import android.os.Build;
import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ia2 {
    public static fa2 a(Activity activity, w1 w1Var) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Build.VERSION.SDK_INT >= 33 ? new ha2(activity, w1Var) : new ga2());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            boolean z10 = ad1.f75480a;
            objM3458constructorimpl = new ga2();
        }
        return (fa2) objM3458constructorimpl;
    }
}
