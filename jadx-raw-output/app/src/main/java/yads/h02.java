package yads;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes9.dex */
public final class h02 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f78005b = Color.parseColor("#eaeaea");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView[] f78006a;

    public final void a() {
        for (ImageView imageView : this.f78006a) {
            Drawable background = imageView.getBackground();
            ck.p.h(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            ColorDrawable colorDrawable = (ColorDrawable) background;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", 255, 0));
                objectAnimatorOfPropertyValuesHolder.setTarget(colorDrawable);
                objectAnimatorOfPropertyValuesHolder.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder.start();
                ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, 255));
                objectAnimatorOfPropertyValuesHolder2.setTarget(drawable);
                objectAnimatorOfPropertyValuesHolder2.setDuration(500L);
                objectAnimatorOfPropertyValuesHolder2.start();
            }
        }
    }

    public final void b() {
        for (ImageView imageView : this.f78006a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f78005b);
                }
            }
        }
    }

    public h02(ImageView... imageViewArr) {
        this.f78006a = imageViewArr;
        b();
    }
}
