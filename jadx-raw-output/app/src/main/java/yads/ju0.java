package yads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public final class ju0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f79186d = Color.parseColor("#66000000");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f79187e = Color.parseColor("#00000000");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f79188f = Color.parseColor("#7f7f7f");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f79189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y00 f79190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ku0 f79191c;

    public static void a(FrameLayout frameLayout, GradientDrawable gradientDrawable, int i10) {
        frameLayout.setPadding(0, 0, 0, i10);
        frameLayout.setBackground(gradientDrawable);
    }

    public ju0(Context context, y00 y00Var, ku0 ku0Var) {
        this.f79189a = context;
        this.f79190b = y00Var;
        this.f79191c = ku0Var;
    }
}
