package io.bidmachine.rendering.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.utils.taskmanager.TaskManager;
import io.bidmachine.rendering.utils.taskmanager.UITaskManager;
import io.bidmachine.util.Executable;
import io.bidmachine.util.ViewUtils;

/* JADX INFO: loaded from: classes7.dex */
public class UiUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TaskManager f60941a = new UITaskManager();

    public static void applyInsets(@NonNull Activity activity, @NonNull View view) {
        applyInsets(activity, view, true);
    }

    public static void cancelOnUiThread(@NonNull Runnable runnable) {
        f60941a.cancel(runnable);
    }

    public static int dpToPx(@NonNull Context context, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return io.bidmachine.iab.utils.Utils.dpToPx(context, f10);
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    @NonNull
    public static Rect getLocationInWindow(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static float getNotOverlappedAreaPercent(@NonNull Rect rect, @NonNull Rect rect2) {
        int iWidth = rect.width() * rect.height();
        if (iWidth == 0) {
            return 0.0f;
        }
        return (iWidth - (Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)))) / iWidth;
    }

    public static boolean isViewTransparent(@NonNull View view) {
        return view.getAlpha() == 0.0f;
    }

    public static boolean isViewVisible(int i10) {
        return i10 == 0;
    }

    public static void onUiThread(@NonNull Runnable runnable) {
        f60941a.execute(runnable);
    }

    public static <I> void onUiThreadWithArgSafely(final I i10, @Nullable final Executable<I> executable) {
        if (executable == null) {
            return;
        }
        io.bidmachine.util.UiUtils.onUiThread(new n() { // from class: di.a
            @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
            public final void onRun() {
                executable.execute(i10);
            }
        });
    }

    public static void setActivityBackgroundColor(@NonNull Activity activity, @ColorInt int i10) {
        setWindowBackgroundColor(activity.getWindow(), i10);
    }

    public static void setDefaultActivityTransition(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT < 34) {
            activity.overridePendingTransition(0, 0);
        } else {
            activity.overrideActivityTransition(0, 0, 0);
            activity.overrideActivityTransition(1, 0, 0);
        }
    }

    public static void setWindowBackgroundColor(@Nullable Window window, @ColorInt int i10) {
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(i10));
    }

    public static void setupActivityOrientation(@NonNull Activity activity, @Nullable Orientation orientation) {
        activity.setRequestedOrientation(orientation != null ? orientation.getActivityOrientation() : 4);
    }

    @NonNull
    public static String toString(int i10) {
        if (i10 == 0) {
            return "VISIBLE";
        }
        if (i10 != 4) {
            return i10 != 8 ? "unknown" : "GONE";
        }
        return "INVISIBLE";
    }

    public static void applyInsets(@NonNull Activity activity, @NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : view;
            view.setPadding(0, 0, 0, 0);
            ViewUtils.setInsetsChanger(decorView);
            if (z10) {
                decorView.requestApplyInsets();
            }
        }
    }

    public static void onUiThread(@NonNull Runnable runnable, long j10) {
        f60941a.schedule(runnable, j10);
    }
}
