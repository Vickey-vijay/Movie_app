package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes9.dex */
public final class jx3 implements pw3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static jx3 f79231f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f79232a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax3 f79233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw3 f79234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vw3 f79235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public nw3 f79236e;

    @Override // yads.pw3
    public final void a(boolean z10) {
        if (!z10) {
            x83.f84484g.getClass();
            Handler handler = x83.f84486i;
            if (handler != null) {
                handler.removeCallbacks(x83.f84488k);
                x83.f84486i = null;
                return;
            }
            return;
        }
        x83.f84484g.getClass();
        if (x83.f84486i == null) {
            Handler handler2 = new Handler(Looper.getMainLooper());
            x83.f84486i = handler2;
            handler2.post(x83.f84487j);
            x83.f84486i.postDelayed(x83.f84488k, 200L);
        }
    }

    public jx3(ax3 ax3Var, aw3 aw3Var) {
        this.f79233b = ax3Var;
        this.f79234c = aw3Var;
    }

    public static jx3 a() {
        if (f79231f == null) {
            f79231f = new jx3(new ax3(), new aw3());
        }
        return f79231f;
    }
}
