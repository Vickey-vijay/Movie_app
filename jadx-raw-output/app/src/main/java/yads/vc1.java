package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class vc1 implements uc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final km f83878a;

    @Override // yads.uc1
    public final void a(Context context, View view) {
    }

    @Override // yads.uc1
    public final void onAttachedToWindow() {
        int i10 = tb.f82950b;
        if (tb.a((mu) this.f83878a)) {
            return;
        }
        this.f83878a.m();
    }

    @Override // yads.uc1
    public final void onDetachedFromWindow() {
        int i10 = tb.f82950b;
        if (tb.a((mu) this.f83878a)) {
            return;
        }
        this.f83878a.n();
    }

    public vc1(km kmVar) {
        this.f83878a = kmVar;
    }
}
