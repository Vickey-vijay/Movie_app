package yads;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;

/* JADX INFO: loaded from: classes8.dex */
public final class vn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f83958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r41 f83959b;

    public /* synthetic */ vn1(v9 v9Var) {
        this(v9Var, new r41());
    }

    public vn1(v9 v9Var, r41 r41Var) {
        this.f83958a = v9Var;
        this.f83959b = r41Var;
    }

    public final ev2 a(CustomizableMediaView customizableMediaView, mi2 mi2Var, ao1 ao1Var) {
        ImageView imageView = new ImageView(customizableMediaView.getContext());
        this.f83959b.getClass();
        if (!pr0.a(customizableMediaView.getContext(), or0.f81132e)) {
            customizableMediaView.removeAllViews();
        }
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        customizableMediaView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        return new ev2(customizableMediaView, ao1Var, new ik3(new c51(imageView, mi2Var, this.f83958a)));
    }
}
