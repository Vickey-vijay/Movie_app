package yads;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class ej2 extends Animation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f77096c;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        ProgressBar progressBar = (ProgressBar) this.f77096c.get();
        if (progressBar != null) {
            super.applyTransformation(f10, transformation);
            int i10 = this.f77094a;
            progressBar.setProgress(Math.round(((this.f77095b - i10) * f10) + i10));
        }
    }

    public ej2(ProgressBar progressBar, int i10, int i11) {
        this.f77094a = i10;
        this.f77095b = i11;
        this.f77096c = new WeakReference(progressBar);
        setInterpolator(new LinearInterpolator());
    }
}
