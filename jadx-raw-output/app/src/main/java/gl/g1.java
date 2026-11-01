package gl;

import android.app.Activity;
import com.yk.e.object.MainParams;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f53493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f53494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainParams f53495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f53496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Runnable f53497f;

    public g1(int i10, Activity activity, MainParams mainParams, String str, Runnable runnable) {
        this.f53493b = i10;
        this.f53494c = activity;
        this.f53495d = mainParams;
        this.f53496e = str;
        this.f53497f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdLog.d("forceAdClick adType " + this.f53493b);
        if (c.f53460b == null) {
            c.f53460b = new c();
        }
        c.f53460b.a(this.f53494c, this.f53493b, this.f53495d, this.f53496e, false);
        Runnable runnable = this.f53497f;
        if (runnable != null) {
            runnable.run();
        }
    }
}
