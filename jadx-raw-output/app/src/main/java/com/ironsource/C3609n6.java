package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;

/* JADX INFO: renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3609n6 implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f30282a;

    public C3609n6(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f30282a = activity;
    }

    @Override // com.ironsource.J
    public void a(C3571l6 c3571l6) {
        ck.p.j(c3571l6, "fullscreenAdInstance");
        c3571l6.a(this.f30282a);
    }
}
