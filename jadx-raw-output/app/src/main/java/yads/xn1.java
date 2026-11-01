package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R$layout;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class xn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ix1 f84646a = new ix1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax1 f84647b = new ax1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yw1 f84648c = new yw1();

    public final gv2 a(v9 v9Var, lu2 lu2Var, CustomizableMediaView customizableMediaView, mi2 mi2Var, List list, ao1 ao1Var, my2 my2Var) {
        vw1 vw1Var;
        Long l10;
        Context context = customizableMediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        bx1 bx1Var = new bx1(context, v9Var, lu2Var);
        jx1 jx1Var = new jx1(viewPager2);
        long jLongValue = (my2Var == null || (l10 = my2Var.f80464b) == null) ? 0L : l10.longValue();
        if (jLongValue > 0) {
            vw1Var = new vw1(viewPager2, jx1Var, bx1Var, new qh1());
            viewPager2.addOnAttachStateChangeListener(new fx1(vw1Var, jLongValue));
        } else {
            vw1Var = null;
        }
        viewPager2.registerOnPageChangeCallback(new gb2(bx1Var, vw1Var));
        ax1 ax1Var = this.f84647b;
        ax1Var.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        es2 es2Var = ax1Var.f75651a;
        int i10 = R$layout.monetization_ads_internal_multibanner_controls;
        es2Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) es2.a(context, MultiBannerControlsContainer.class, i10, null);
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.setLayoutParams(layoutParams);
        }
        if (multiBannerControlsContainer != null) {
            multiBannerControlsContainer.a(viewPager2);
            multiBannerControlsContainer.setOnClickLeftButtonListener(new vz(jx1Var, bx1Var, vw1Var));
            multiBannerControlsContainer.setOnClickRightButtonListener(new wz(jx1Var, bx1Var, vw1Var));
        }
        yw1 yw1Var = this.f84648c;
        yw1Var.getClass();
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context, null, 0, 6, null);
        yw1Var.f85134a.getClass();
        extendedViewContainer.setMeasureSpecProvider(new ok2((float) gx1.a(list), new hj1()));
        this.f84646a.getClass();
        if (!pr0.a(customizableMediaView.getContext(), or0.f81132e)) {
            customizableMediaView.removeAllViews();
        }
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        extendedViewContainer.addView(viewPager2, layoutParams2);
        if (multiBannerControlsContainer != null) {
            extendedViewContainer.addView(multiBannerControlsContainer, layoutParams2);
        }
        customizableMediaView.addView(extendedViewContainer, layoutParams2);
        return new gv2(customizableMediaView, ao1Var, new ik3(new kx1(viewPager2, mi2Var, ((iu3) lu2Var).a(), v9Var)));
    }
}
