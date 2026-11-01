package yads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public final class jp2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f79145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79146b;

    @Override // yads.zf0
    public final void c() {
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        if (this.f79146b == 1) {
            ((q2) this.f79145a).a(7);
        } else {
            ((q2) this.f79145a).a(6);
        }
    }

    public jp2(f2 f2Var, int i10) {
        this.f79145a = f2Var;
        this.f79146b = i10;
    }
}
