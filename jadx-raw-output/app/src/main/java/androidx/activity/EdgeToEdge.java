package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EdgeToEdge {
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    public static final void enable(ComponentActivity componentActivity) {
        ck.p.j(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle systemBarStyle) {
        ck.p.j(componentActivity, "<this>");
        ck.p.j(systemBarStyle, "statusBarStyle");
        enable$default(componentActivity, systemBarStyle, null, 2, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2) {
        ck.p.j(componentActivity, "<this>");
        ck.p.j(systemBarStyle, "statusBarStyle");
        ck.p.j(systemBarStyle2, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        ck.p.i(decorView, "window.decorView");
        bk.l<Resources, Boolean> detectDarkMode$activity_release = systemBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        ck.p.i(resources, "view.resources");
        boolean zBooleanValue = detectDarkMode$activity_release.invoke(resources).booleanValue();
        bk.l<Resources, Boolean> detectDarkMode$activity_release2 = systemBarStyle2.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        ck.p.i(resources2, "view.resources");
        boolean zBooleanValue2 = detectDarkMode$activity_release2.invoke(resources2).booleanValue();
        EdgeToEdgeImpl edgeToEdgeApi26 = Impl;
        if (edgeToEdgeApi26 == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                edgeToEdgeApi26 = new EdgeToEdgeApi30();
            } else if (i10 >= 29) {
                edgeToEdgeApi26 = new EdgeToEdgeApi29();
            } else if (i10 >= 28) {
                edgeToEdgeApi26 = new EdgeToEdgeApi28();
            } else {
                edgeToEdgeApi26 = i10 >= 26 ? new EdgeToEdgeApi26() : new EdgeToEdgeApi23();
            }
        }
        Window window = componentActivity.getWindow();
        ck.p.i(window, "window");
        edgeToEdgeApi26.setUp(systemBarStyle, systemBarStyle2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        ck.p.i(window2, "window");
        edgeToEdgeApi26.adjustLayoutInDisplayCutoutMode(window2);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }
}
