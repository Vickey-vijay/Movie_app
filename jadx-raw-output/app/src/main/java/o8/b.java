package o8;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.motion.widget.Key;

/* JADX INFO: compiled from: AnimUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {
    public static void a(ImageView imageView, boolean z10) {
        float f10 = 0.0f;
        float f11 = 180.0f;
        if (!z10) {
            f11 = 0.0f;
            f10 = 180.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, Key.ROTATION, f10, f11);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.start();
    }

    public static void b(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 1.05f, 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.05f, 1.0f));
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.start();
    }
}
