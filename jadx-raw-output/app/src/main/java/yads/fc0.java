package yads;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public final class fc0 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw f77343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f77344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f77345c;

    @Override // yads.ac2
    public final void a() {
        View view = (View) this.f77345c.get();
        if (view != null) {
            this.f77343a.b(view);
            this.f77344b.a(y30.f84801e);
        }
    }

    public fc0(View view, cw cwVar, z30 z30Var) {
        this.f77343a = cwVar;
        this.f77344b = z30Var;
        this.f77345c = new WeakReference(view);
    }
}
