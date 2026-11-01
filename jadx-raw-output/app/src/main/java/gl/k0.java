package gl;

import android.os.Handler;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f53524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f53525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w1 f53526d;

    public k0(w1 w1Var, Handler handler, j1 j1Var) {
        this.f53526d = w1Var;
        this.f53524b = handler;
        this.f53525c = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f53524b.removeCallbacks(this);
        AdLog.d("getGoogleADID time out");
        this.f53526d.a("", this.f53525c);
    }
}
