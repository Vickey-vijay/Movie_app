package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class kj2 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw f79429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f79430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f79431c;

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f79431c.get();
        if (view != null) {
            this.f79429a.b(view);
            this.f79430b.a(y30.f84801e);
        }
    }

    public kj2(View view, am0 am0Var, z30 z30Var) {
        this.f79429a = am0Var;
        this.f79430b = z30Var;
        this.f79431c = new WeakReference(view);
    }
}
