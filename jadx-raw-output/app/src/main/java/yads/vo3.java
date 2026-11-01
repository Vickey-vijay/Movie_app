package yads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes8.dex */
public abstract class vo3 {
    public static vg0 a(Context context) {
        if (ub.a(30)) {
            Object systemService = context.getSystemService("window");
            ck.p.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowInsets windowInsets = ((WindowManager) systemService).getCurrentWindowMetrics().getWindowInsets();
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets$Type.systemBars());
            Insets insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(WindowInsets$Type.displayCutout());
            wl3 wl3Var = kl3.f79470a;
            float f10 = context.getResources().getDisplayMetrics().density;
            return new vg0(kl3.b(insetsIgnoringVisibility.left, f10), kl3.b(insetsIgnoringVisibility.top, f10), kl3.b(insetsIgnoringVisibility.right, f10), kl3.b(insetsIgnoringVisibility.bottom, f10), kl3.b(insetsIgnoringVisibility2.top, f10), kl3.b(insetsIgnoringVisibility2.bottom, f10));
        }
        if (!ub.a(28)) {
            return vg0.f83903g;
        }
        Activity activityA = j1.a();
        if (activityA == null) {
            return vg0.f83903g;
        }
        WindowInsets rootWindowInsets = activityA.getWindow().getDecorView().getRootWindowInsets();
        if (rootWindowInsets == null) {
            return vg0.f83903g;
        }
        wl3 wl3Var2 = kl3.f79470a;
        float f11 = context.getResources().getDisplayMetrics().density;
        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
        return new vg0(kl3.b(rootWindowInsets.getSystemWindowInsetLeft(), f11), kl3.b(rootWindowInsets.getSystemWindowInsetTop(), f11), kl3.b(rootWindowInsets.getSystemWindowInsetRight(), f11), kl3.b(rootWindowInsets.getSystemWindowInsetBottom(), f11), kl3.b(displayCutout != null ? displayCutout.getSafeInsetTop() : 0, f11), kl3.b(displayCutout != null ? displayCutout.getSafeInsetBottom() : 0, f11));
    }

    public static final vg0 b(Context context) {
        try {
            return a(context);
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
            return vg0.f83903g;
        }
    }
}
