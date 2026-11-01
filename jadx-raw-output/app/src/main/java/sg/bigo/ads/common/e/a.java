package sg.bigo.ads.common.e;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: sg.bigo.ads.common.e.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0702a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f69514a = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.common.e.a.a.1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                AbstractC0702a.this.a(z10);
            }
        };

        @RequiresApi(api = 18)
        public final ViewTreeObserver.OnWindowFocusChangeListener a() {
            Object obj = this.f69514a;
            if (obj instanceof ViewTreeObserver.OnWindowFocusChangeListener) {
                return (ViewTreeObserver.OnWindowFocusChangeListener) obj;
            }
            return null;
        }

        public abstract void a(boolean z10);
    }

    public static void a(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setZ(f10);
    }

    public static void a(View view, int i10) {
        if (view == null) {
            return;
        }
        view.setElevation(i10);
    }

    public static void a(@NonNull View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, AbstractC0702a abstractC0702a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListenerA;
        if (view == null || abstractC0702a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (onWindowFocusChangeListenerA = abstractC0702a.a()) == null) {
            return;
        }
        viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListenerA);
    }

    public static void b(View view, AbstractC0702a abstractC0702a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListenerA;
        if (view == null || abstractC0702a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (onWindowFocusChangeListenerA = abstractC0702a.a()) == null) {
            return;
        }
        viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListenerA);
    }
}
