package io.appmetrica.analytics.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4094bj {
    public static ScreenInfo a(Context context) {
        Point point;
        Display display;
        try {
            if (AndroidUtils.isApiAchieved(30)) {
                try {
                    display = context.getDisplay();
                } catch (Throwable unused) {
                    display = null;
                }
            } else {
                display = null;
            }
            if (display == null) {
                display = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            }
            point = display != null ? (Point) SystemServiceUtils.accessSystemServiceSafely(display, "getting display metrics", "Display", new C4068aj()) : null;
        } catch (Throwable unused2) {
        }
        if (point == null) {
            return null;
        }
        int iMax = Math.max(point.x, point.y);
        int iMin = Math.min(point.x, point.y);
        int i10 = 0;
        float f10 = 0.0f;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            i10 = displayMetrics.densityDpi;
            f10 = displayMetrics.density;
        } catch (Throwable unused3) {
        }
        return new ScreenInfo(iMax, iMin, i10, f10);
    }
}
