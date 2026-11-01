package com.monetization.ads.nativeads.view.pager;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import ck.v;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R$id;
import ek.b;
import mj.r;
import yads.fj0;
import yads.im0;
import yads.og0;
import yads.zw1;

/* JADX INFO: loaded from: classes10.dex */
public final class MultiBannerControlsContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fj0 f43004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final im0 f43005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43006c;

    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43004a = new fj0();
        this.f43005b = new im0();
        this.f43006c = true;
    }

    public final void a(ViewPager2 viewPager2) {
        viewPager2.registerOnPageChangeCallback(new zw1(viewPager2, this));
        viewPager2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ob.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                MultiBannerControlsContainer.a(this.f65157b, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
    }

    public final void setOnClickLeftButtonListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public final void setOnClickRightButtonListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R$id.right_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public MultiBannerControlsContainer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43004a = new fj0();
        this.f43005b = new im0();
        this.f43006c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MultiBannerControlsContainer multiBannerControlsContainer, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (view instanceof ViewPager2) {
            boolean z10 = multiBannerControlsContainer.f43006c;
            im0 im0Var = multiBannerControlsContainer.f43005b;
            int i18 = i12 - i10;
            int i19 = i13 - i11;
            og0 og0Var = im0Var.f78697a;
            Context context = view.getContext();
            og0Var.getClass();
            int iA = og0.a(context, 144.0f);
            og0 og0Var2 = im0Var.f78697a;
            Context context2 = view.getContext();
            og0Var2.getClass();
            boolean z11 = i18 >= iA && i19 >= og0.a(context2, 96.0f);
            multiBannerControlsContainer.f43006c = z11;
            if (z11 != z10) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                multiBannerControlsContainer.a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(int i10, int i11) {
        View viewFindViewById = findViewById(R$id.left_scroll_control_button);
        ImageView imageView = viewFindViewById instanceof ImageView ? (ImageView) viewFindViewById : null;
        View viewFindViewById2 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView2 = viewFindViewById2 instanceof ImageView ? (ImageView) viewFindViewById2 : null;
        int i12 = R$id.dot_indicator;
        View viewFindViewById3 = findViewById(i12);
        ImageView imageView3 = viewFindViewById3 instanceof ImageView ? (ImageView) viewFindViewById3 : null;
        if (!this.f43006c) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View viewFindViewById4 = findViewById(i12);
        ImageView imageView4 = viewFindViewById4 instanceof ImageView ? (ImageView) viewFindViewById4 : null;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            fj0 fj0Var = this.f43004a;
            Context context = getContext();
            fj0Var.f77411a.getClass();
            int iA = og0.a(context, 6.0f);
            fj0Var.f77411a.getClass();
            int iC = b.c(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
            fj0Var.f77411a.getClass();
            int iC2 = b.c(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
            fj0Var.f77411a.getClass();
            int iC3 = b.c(TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics()));
            int i13 = (iA * i11) + ((i11 + 1) * iC);
            float f10 = iC3;
            RectF rectF = new RectF(0.0f, 0.0f, i13, f10);
            float[] fArr = new float[8];
            for (int i14 = 0; i14 < 8; i14++) {
                fArr[i14] = f10;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, rectF, null));
            shapeDrawable.setIntrinsicWidth(i13);
            shapeDrawable.setIntrinsicHeight(iC3);
            shapeDrawable.getPaint().setColor(ViewCompat.MEASURED_STATE_MASK);
            shapeDrawable.setAlpha(102);
            ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[i11];
            for (int i15 = 0; i15 < i11; i15++) {
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.setIntrinsicHeight(iA);
                shapeDrawable2.setIntrinsicWidth(iA);
                shapeDrawable2.getPaint().setColor(-1);
                if (i15 != i10) {
                    shapeDrawable2.setAlpha(102);
                }
                r rVar = r.f64562a;
                shapeDrawableArr[i15] = shapeDrawable2;
            }
            v vVar = new v(2);
            vVar.a(shapeDrawable);
            vVar.b(shapeDrawableArr);
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) vVar.d(new ShapeDrawable[vVar.c()]));
            int i16 = 0;
            while (i16 < i11) {
                int i17 = iC + iA;
                int i18 = (i17 * i16) + iC;
                i16++;
                layerDrawable.setLayerInset(i16, i18, iC2, i13 - (i17 * i16), iC2);
            }
            imageView4.setImageDrawable(layerDrawable);
        }
        View viewFindViewById5 = findViewById(R$id.left_scroll_control_button);
        ImageView imageView5 = viewFindViewById5 instanceof ImageView ? (ImageView) viewFindViewById5 : null;
        View viewFindViewById6 = findViewById(R$id.right_scroll_control_button);
        ImageView imageView6 = viewFindViewById6 instanceof ImageView ? (ImageView) viewFindViewById6 : null;
        if (imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
            return;
        }
        if (i10 == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i10 == i11 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }
}
