package e8;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* JADX INFO: compiled from: ImmersiveManager.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {
    public static void a(AppCompatActivity appCompatActivity, int i10, int i11, boolean z10) {
        b(appCompatActivity, false, false, i10, i11, z10);
    }

    public static void b(AppCompatActivity appCompatActivity, boolean z10, boolean z11, int i10, int i11, boolean z12) {
        boolean z13;
        try {
            Window window = appCompatActivity.getWindow();
            boolean z14 = false;
            boolean z15 = true;
            if (z10 && z11) {
                window.clearFlags(201326592);
                if (i10 == 0) {
                    z14 = true;
                }
                b.d(appCompatActivity, true, true, z14, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else if (!z10 && !z11) {
                window.requestFeature(1);
                window.clearFlags(201326592);
                if (i10 != 0) {
                    z15 = false;
                }
                b.d(appCompatActivity, false, false, z15, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else if (!z10) {
                window.requestFeature(1);
                window.clearFlags(201326592);
                if (i10 == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                b.d(appCompatActivity, false, true, z13, z12);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                return;
            }
            window.setStatusBarColor(i10);
            window.setNavigationBarColor(i11);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void c(Activity activity, boolean z10) {
        Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.setStatusBarColor(0);
        View decorView = window.getDecorView();
        if (z10) {
            decorView.setSystemUiVisibility(9472);
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
        }
        View childAt = ((ViewGroup) window.findViewById(R.id.content)).getChildAt(0);
        if (childAt != null) {
            childAt.setFitsSystemWindows(false);
            ViewCompat.requestApplyInsets(childAt);
        }
    }
}
