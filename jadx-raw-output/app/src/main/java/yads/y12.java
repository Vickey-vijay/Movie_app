package yads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class y12 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f84790g = {wb.a(y12.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), wb.a(y12.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), wb.a(y12.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), wb.a(y12.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0), wb.a(y12.class, "customAssets", "getCustomAssets()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f84791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lm2 f84792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f84793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f84794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2 f84795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f84796f;

    public final View a(String str) {
        WeakReference weakReference = (WeakReference) this.f84796f.get(str);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public y12(x12 x12Var) {
        this.f84791a = mm2.a(x12Var.e());
        this.f84792b = mm2.a(x12Var.c());
        this.f84793c = mm2.a(x12Var.d());
        this.f84794d = mm2.a(x12Var.f());
        this.f84795e = mm2.a(x12Var.b());
        this.f84796f = ki1.a(x12Var.a());
    }

    public final View a() {
        lm2 lm2Var = this.f84791a;
        jk.k kVar = f84790g[0];
        return (View) lm2Var.f79854a.get();
    }
}
