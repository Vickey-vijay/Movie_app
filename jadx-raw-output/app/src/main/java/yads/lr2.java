package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class lr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f79892a;

    public final void a() {
        View view = (View) this.f79892a.get();
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public lr2(WeakReference weakReference) {
        this.f79892a = weakReference;
    }
}
