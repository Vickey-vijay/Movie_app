package com.inmobi.media;

import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class P5 extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f23312a;

    public P5(RelativeLayout.LayoutParams layoutParams) {
        this.f23312a = layoutParams;
    }

    @Override // com.inmobi.media.uo
    public final void a(Df df2, wo woVar) {
        ck.p.j(df2, "orientation");
        ck.p.j(woVar, "finalInsets");
        F3.a(woVar, this.f23312a, df2);
    }
}
