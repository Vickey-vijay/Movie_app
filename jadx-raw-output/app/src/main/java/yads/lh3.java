package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import yads.lh3;

/* JADX INFO: loaded from: classes10.dex */
public final class lh3 implements wh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f79787a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jv3 f79788b;

    public final void a() {
        this.f79787a.post(new Runnable() { // from class: cp.e6
            @Override // java.lang.Runnable
            public final void run() {
                lh3.a(this.f51307b);
            }
        });
    }

    public static final void a(lh3 lh3Var) {
        jv3 jv3Var = lh3Var.f79788b;
        if (jv3Var != null) {
            new CallbackStackTraceMarker(new iv3(jv3Var));
        }
    }
}
