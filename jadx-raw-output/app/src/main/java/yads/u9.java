package yads;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class u9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final GradientDrawable f83398a;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(0.0f);
        f83398a = gradientDrawable;
    }
}
