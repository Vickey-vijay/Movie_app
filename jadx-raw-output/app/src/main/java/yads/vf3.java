package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class vf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf3 f83898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf3 f83899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f83900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83901d;

    public /* synthetic */ vf3(hf3 hf3Var, rf3 rf3Var) {
        this(hf3Var, rf3Var, new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        if (this.f83901d) {
            this.f83899b.b();
            this.f83900c.removeCallbacksAndMessages(null);
            this.f83901d = false;
        }
    }

    public vf3(hf3 hf3Var, rf3 rf3Var, Handler handler) {
        this.f83898a = hf3Var;
        this.f83899b = rf3Var;
        this.f83900c = handler;
    }
}
