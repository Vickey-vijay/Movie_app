package gl;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IComCallback f53568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f53569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f53570d;

    public o(j0 j0Var, IComCallback iComCallback, Context context) {
        this.f53570d = j0Var;
        this.f53568b = iComCallback;
        this.f53569c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0 j0Var = this.f53570d;
        j0Var.f53512c = true;
        j0Var.f53513d = false;
        if (!j0Var.f53517h) {
            j0Var.f53514e = this.f53568b;
            if (j0Var.f53516g != null) {
                AdLog.i("doInitUmp");
                j0 j0Var2 = this.f53570d;
                j0Var2.f53517h = true;
                j0Var2.c((Activity) j0Var2.f53516g.get(), this.f53570d.f53514e);
                return;
            }
            return;
        }
        AdLog.i("doInitSdk");
        j0 j0Var3 = this.f53570d;
        Context context = this.f53569c;
        IComCallback iComCallback = this.f53568b;
        if (!j0Var3.f53515f) {
            MobileAds.initialize(context, new t0(j0Var3, System.currentTimeMillis(), iComCallback, context));
            return;
        }
        AdLog.i("Admob utils has success");
        j0Var3.h(true, "", iComCallback);
        j0Var3.d(context);
    }
}
