package io.bidmachine.util;

import android.app.Activity;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.util.taskmanager.TaskManager;
import io.bidmachine.util.taskmanager.handler.UIHandlerTaskManager;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: UiUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J%\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0007J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0007J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0007J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\rH\u0007J \u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0007R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lio/bidmachine/util/UiUtils;", "", "", "isUiThread", "Ljava/lang/Runnable;", "runnable", "onUiThread", "", "delayMs", "Lmj/r;", "cancelOnUiThread", "Landroid/view/Window;", "window", "", "color", "setWindowBackgroundColor", "(Landroid/view/Window;I)Lmj/r;", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "setActivityBackgroundColor", "(Landroid/app/Activity;I)Lmj/r;", "setNoActivityTransition", "finishActivityWithoutAnimation", "applyFullscreenActivity", "isNoStatusBar", "applySystemUiVisibility", "hideKeyboard", "(Landroid/app/Activity;)Ljava/lang/Boolean;", "width", "height", "defineOrientationBySize", "orientation", "", "orientationToString", "action", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "Landroid/view/MotionEvent;", "obtainMotionEvent", "Lio/bidmachine/util/taskmanager/TaskManager;", "TASK_MANAGER", "Lio/bidmachine/util/taskmanager/TaskManager;", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class UiUtils {
    public static final UiUtils INSTANCE = new UiUtils();
    private static final TaskManager TASK_MANAGER = new UIHandlerTaskManager();

    private UiUtils() {
    }

    public static final void applyFullscreenActivity(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        applyFullscreenActivity(activity, true);
    }

    public static final int defineOrientationBySize(int width, int height) {
        return width > height ? 2 : 1;
    }

    public static final boolean onUiThread(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        return TASK_MANAGER.executeSafely(runnable);
    }

    public static final String orientationToString(int orientation) {
        if (orientation == 0) {
            return "UNDEFINED";
        }
        if (orientation != 1) {
            return orientation != 2 ? "UNKNOWN" : "LANDSCAPE";
        }
        return "PORTRAIT";
    }

    public static final void applyFullscreenActivity(Activity activity, boolean z10) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        UiUtilsKt.applyFullscreenActivity(activity, z10);
    }

    public static /* synthetic */ void applyFullscreenActivity$default(Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        applyFullscreenActivity(activity, z10);
    }

    public static final void applySystemUiVisibility(Window window, boolean z10) {
        p.j(window, "window");
        UiUtilsKt.applySystemUiVisibility(window, z10);
    }

    public static final void cancelOnUiThread(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        TASK_MANAGER.cancel(runnable);
    }

    public static final void finishActivityWithoutAnimation(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        UiUtilsKt.finishActivityWithoutAnimation(activity);
    }

    public static final Boolean hideKeyboard(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        return UiUtilsKt.hideKeyboard(activity);
    }

    public static final boolean onUiThread(Runnable runnable, long delayMs) {
        if (runnable == null) {
            return false;
        }
        return TASK_MANAGER.scheduleSafely(runnable, delayMs);
    }

    public static final r setActivityBackgroundColor(Activity activity, @ColorInt int color) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        return UiUtilsKt.setActivityBackgroundColor(activity, color);
    }

    public static final void setNoActivityTransition(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        UiUtilsKt.setNoActivityTransition(activity);
    }

    public static final boolean isUiThread() {
        return p.e(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final MotionEvent obtainMotionEvent(int action, int x10, int y10) {
        MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), action, x10, y10, 0);
        p.i(motionEventObtain, "obtain(\n            Syst…,\n            0\n        )");
        return motionEventObtain;
    }

    public static final r setWindowBackgroundColor(Window window, @ColorInt int color) {
        return UiUtilsKt.setWindowBackgroundColor(window, color);
    }
}
