package cc;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import ec.i;

/* JADX INFO: compiled from: RefreshContent.java */
/* JADX INFO: loaded from: classes2.dex */
public interface b {
    void a(MotionEvent motionEvent);

    void b(boolean z10);

    ValueAnimator.AnimatorUpdateListener c(int i10);

    void d(e eVar, View view, View view2);

    void e(int i10, int i11, int i12);

    boolean f();

    @NonNull
    View g();

    @NonNull
    View getView();

    void h(i iVar);

    boolean i();
}
