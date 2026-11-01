package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3546k implements qg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f29305a;

    @Override // com.ironsource.qg
    public void a() {
        Activity activity = this.f29305a.get();
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets$Type.statusBars());
        }
    }

    public C3546k(Activity activity) {
        this.f29305a = new WeakReference<>(activity);
    }
}
