package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes9.dex */
public final class fn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9 f77460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final in2 f77461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f77462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77463d;

    public fn2(e9 e9Var, in2 in2Var) {
        this(e9Var, in2Var, new Handler(Looper.getMainLooper()));
    }

    public fn2(e9 e9Var, in2 in2Var, Handler handler) {
        this.f77460a = e9Var;
        this.f77461b = in2Var;
        this.f77462c = handler;
    }
}
