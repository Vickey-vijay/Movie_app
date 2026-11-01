package com.inmobi.media;

import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class Q8 extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f23377a;

    public Q8(RelativeLayout.LayoutParams layoutParams) {
        this.f23377a = layoutParams;
    }

    @Override // com.inmobi.media.uo
    public final void a(Df df2, wo woVar) {
        ck.p.j(df2, "orientation");
        ck.p.j(woVar, "finalInsets");
        F3.a(woVar, this.f23377a, df2);
    }
}
