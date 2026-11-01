package gl;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f53534b;

    public l1(j0 j0Var) {
        this.f53534b = j0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f53534b.f53516g = new WeakReference(activity);
        j0 j0Var = this.f53534b;
        if (!j0Var.f53512c || j0Var.f53517h) {
            return;
        }
        j0Var.f53517h = true;
        j0Var.c((Activity) j0Var.f53516g.get(), this.f53534b.f53514e);
    }
}
