package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class te0 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f03 f82999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f83000b;

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f83000b.get();
        if (view != null) {
            this.f82999a.b(view);
        }
    }

    public te0(View view, f03 f03Var) {
        this.f82999a = f03Var;
        this.f83000b = new WeakReference(view);
    }
}
