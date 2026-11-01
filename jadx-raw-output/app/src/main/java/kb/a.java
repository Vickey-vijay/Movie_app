package kb;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* JADX INFO: compiled from: MScroller.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends Scroller {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Interpolator f62740b = new InterpolatorC0560a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f62741a;

    /* JADX INFO: renamed from: kb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MScroller.java */
    public class InterpolatorC0560a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public a(Context context) {
        this(context, f62740b);
    }

    public a(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public void a(boolean z10) {
        this.f62741a = z10;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        if (this.f62741a) {
            super.startScroll(i10, i11, i12, i13, 0);
        } else {
            super.startScroll(i10, i11, i12, i13, i14);
        }
    }
}
