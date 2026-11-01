package yads;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.concurrent.Callable;
import yads.ts2;

/* JADX INFO: loaded from: classes11.dex */
public final class ts2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k53 f83164a;

    public /* synthetic */ ts2() {
        this(new k53());
    }

    public final Point a(Context context) {
        Object systemService = context.getSystemService("window");
        ck.p.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        final WindowManager windowManager = (WindowManager) systemService;
        k53 k53Var = this.f83164a;
        Callable callable = new Callable() { // from class: cp.pa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ts2.a(windowManager);
            }
        };
        k53Var.getClass();
        final Display display = (Display) k53.a(callable, windowManager, "getting display", "WindowManager");
        final Point point = new Point(0, 0);
        k53 k53Var2 = this.f83164a;
        Callable callable2 = new Callable() { // from class: cp.qa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ts2.a(display, point, this);
            }
        };
        k53Var2.getClass();
        Object objA = k53.a(callable2, display, "getting display metrics", "Display");
        Object obj = point;
        if (objA != null) {
            obj = objA;
        }
        return (Point) obj;
    }

    public ts2(k53 k53Var) {
        this.f83164a = k53Var;
    }

    public static final Display a(WindowManager windowManager) {
        return windowManager.getDefaultDisplay();
    }

    public static final Point a(Display display, Point point, ts2 ts2Var) {
        if (display == null) {
            return point;
        }
        ts2Var.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
