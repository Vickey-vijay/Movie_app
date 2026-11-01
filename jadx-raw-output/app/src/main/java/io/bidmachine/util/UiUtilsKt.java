package io.bidmachine.util;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorInt;
import ck.p;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: UiUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00062\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\n\u0010\t\u001a\u00020\u0003*\u00020\u0006\u001a\n\u0010\n\u001a\u00020\u0003*\u00020\u0006\u001a\u0014\u0010\r\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u0014\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b*\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/view/Window;", "", "color", "Lmj/r;", "setWindowBackgroundColor", "(Landroid/view/Window;I)Lmj/r;", "Landroid/app/Activity;", "setActivityBackgroundColor", "(Landroid/app/Activity;I)Lmj/r;", "setNoActivityTransition", "finishActivityWithoutAnimation", "", "isNoStatusBar", "applyFullscreenActivity", "applySystemUiVisibility", "hideKeyboard", "(Landroid/app/Activity;)Ljava/lang/Boolean;", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class UiUtilsKt {
    public static /* synthetic */ void applyFullscreenActivity$default(Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        applyFullscreenActivity(activity, z10);
    }

    public static /* synthetic */ void applySystemUiVisibility$default(Window window, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        applySystemUiVisibility(window, z10);
    }

    public static final void applyFullscreenActivity(Activity activity, boolean z10) {
        p.j(activity, "<this>");
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            applySystemUiVisibility(window, z10);
        }
        hideKeyboard(activity);
    }

    public static final void applySystemUiVisibility(Window window, boolean z10) {
        p.j(window, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
                if (z10) {
                    windowInsetsController.hide(WindowInsets$Type.statusBars());
                    return;
                }
                return;
            }
            return;
        }
        int i10 = 0;
        if (z10) {
            window.setFlags(1024, 1024);
            i10 = 4;
        }
        if (i10 > 0) {
            window.getDecorView().setSystemUiVisibility(i10);
        }
    }

    public static final void finishActivityWithoutAnimation(Activity activity) {
        p.j(activity, "<this>");
        activity.finish();
        setNoActivityTransition(activity);
    }

    public static final Boolean hideKeyboard(Activity activity) {
        p.j(activity, "<this>");
        InputMethodManager inputMethodManager = UtilsKt.getInputMethodManager(activity);
        if (inputMethodManager == null) {
            return null;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        return Boolean.valueOf(inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0));
    }

    public static final r setActivityBackgroundColor(Activity activity, @ColorInt int i10) {
        p.j(activity, "<this>");
        return UiUtils.setWindowBackgroundColor(activity.getWindow(), i10);
    }

    public static final void setNoActivityTransition(Activity activity) {
        p.j(activity, "<this>");
        if (Build.VERSION.SDK_INT < 34) {
            activity.overridePendingTransition(0, 0);
        } else {
            activity.overrideActivityTransition(0, 0, 0);
            activity.overrideActivityTransition(1, 0, 0);
        }
    }

    public static final r setWindowBackgroundColor(Window window, @ColorInt int i10) {
        if (window == null) {
            return null;
        }
        window.setBackgroundDrawable(new ColorDrawable(i10));
        return r.f64562a;
    }
}
