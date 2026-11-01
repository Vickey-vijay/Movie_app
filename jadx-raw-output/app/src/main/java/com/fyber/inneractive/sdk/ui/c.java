package com.fyber.inneractive.sdk.ui;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FyberAdIdentifierLocal f18540a;

    public c(FyberAdIdentifierLocal fyberAdIdentifierLocal) {
        this.f18540a = fyberAdIdentifierLocal;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        FyberAdIdentifierLocal fyberAdIdentifierLocal = this.f18540a;
        fyberAdIdentifierLocal.f18518q = this.f18540a.f18515n.getWidth() + fyberAdIdentifierLocal.f18515n.getWidth();
        FyberAdIdentifierLocal fyberAdIdentifierLocal2 = this.f18540a;
        IFyberAdIdentifier.Corner corner = fyberAdIdentifierLocal2.f18536k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            fyberAdIdentifierLocal2.f18518q *= -1.0f;
        }
        fyberAdIdentifierLocal2.f18515n.setTranslationX(fyberAdIdentifierLocal2.f18518q);
        FyberAdIdentifierLocal fyberAdIdentifierLocal3 = this.f18540a;
        if (fyberAdIdentifierLocal3.f18516o) {
            fyberAdIdentifierLocal3.a();
        }
    }
}
