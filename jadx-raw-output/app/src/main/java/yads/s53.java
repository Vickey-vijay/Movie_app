package yads;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class s53 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f82529a;

    public s53(TextView textView) {
        this.f82529a = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Integer) {
            this.f82529a.setTextColor(((Number) animatedValue).intValue());
        }
    }
}
