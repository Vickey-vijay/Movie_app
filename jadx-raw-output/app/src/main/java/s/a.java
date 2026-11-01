package s;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: compiled from: AnimUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: s.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimUtils.java */
    public interface InterfaceC0634a {
        void a(boolean z10);
    }

    /* JADX INFO: compiled from: AnimUtils.java */
    public interface b {
        void b(long j10, long j11, long j12);
    }

    public static ViewPropertyAnimatorCompat a(View view) {
        return ViewCompat.animate(view).translationY(0.0f).alpha(1.0f).setDuration(500L);
    }

    public static ViewPropertyAnimatorCompat b(View view) {
        return ViewCompat.animate(view).alpha(1.0f).setDuration(300L);
    }

    public static ViewPropertyAnimatorCompat c(View view) {
        return ViewCompat.animate(view).translationX(0.0f).setDuration(500L).alpha(1.0f);
    }

    public static ViewPropertyAnimatorCompat d(View view, boolean z10) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate = ViewCompat.animate(view);
        int height = view.getHeight();
        if (!z10) {
            height = -height;
        }
        return viewPropertyAnimatorCompatAnimate.translationY(height).setDuration(500L).alpha(0.1f);
    }

    public static ViewPropertyAnimatorCompat e(View view) {
        return ViewCompat.animate(view).alpha(0.0f).setDuration(300L);
    }

    public static ViewPropertyAnimatorCompat f(View view, boolean z10) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatAnimate = ViewCompat.animate(view);
        int width = view.getWidth();
        if (!z10) {
            width = -width;
        }
        return viewPropertyAnimatorCompatAnimate.translationX(width).setDuration(500L).alpha(0.1f);
    }
}
