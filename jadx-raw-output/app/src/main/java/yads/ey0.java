package yads;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import yads.ey0;

/* JADX INFO: loaded from: classes10.dex */
public final class ey0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f77223a;

    public static void b(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: cp.r1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ey0.b(view, windowInsetsCompat);
            }
        });
    }

    public static void c(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: cp.p1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ey0.c(view, windowInsetsCompat);
            }
        });
    }

    public final void a(Window window, RelativeLayout relativeLayout) {
        WindowCompat.setDecorFitsSystemWindows(window, false);
        if (ub.a(30)) {
            window.getAttributes().layoutInDisplayCutoutMode = 3;
        } else if (ub.a(28)) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        if (this.f77223a == e00.f76864i) {
            b(relativeLayout);
        } else if (Build.VERSION.SDK_INT >= 28) {
            a(relativeLayout);
        } else {
            c(relativeLayout);
        }
    }

    public static final WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat) {
        return WindowInsetsCompat.CONSUMED;
    }

    public static final WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        view.setPadding(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        return windowInsetsCompat;
    }

    public ey0(e00 e00Var) {
        this.f77223a = e00Var;
    }

    public static void a(RelativeLayout relativeLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(relativeLayout, new OnApplyWindowInsetsListener() { // from class: cp.q1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return ey0.a(view, windowInsetsCompat);
            }
        });
    }

    public static final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        view.setPadding(insets.left, insets.f3822top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
