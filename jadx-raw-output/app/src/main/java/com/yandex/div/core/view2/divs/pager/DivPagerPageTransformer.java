package com.yandex.div.core.view2.divs.pager;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivPageTransformation;
import com.yandex.div2.DivPageTransformationOverlap;
import com.yandex.div2.DivPageTransformationSlide;
import ik.k;

/* JADX INFO: compiled from: DivPagerPageTransformer.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivPagerPageTransformer implements ViewPager2.PageTransformer {
    private final boolean isHorizontal;
    private final DivPagerPageOffsetProvider offsetProvider;
    private final DivPageTransformation pageTransformation;
    private final SparseArray<Float> pageTranslations;
    private final int parentSize;
    private final RecyclerView recyclerView;
    private final ExpressionResolver resolver;

    private final void apply(DivPageTransformationSlide divPageTransformationSlide, View view, float f10) {
        applyAlphaAndScale(view, f10, divPageTransformationSlide.f48199a, divPageTransformationSlide.f48200b, divPageTransformationSlide.f48201c, divPageTransformationSlide.f48202d, divPageTransformationSlide.f48203e);
        applyOffset$default(this, view, f10, false, 2, null);
    }

    private final void applyAlphaAndScale(View view, float f10, Expression<DivAnimationInterpolator> expression, Expression<Double> expression2, Expression<Double> expression3, Expression<Double> expression4, Expression<Double> expression5) {
        float interpolation = 1 - DivUtilKt.getAndroidInterpolator(expression.evaluate(this.resolver)).getInterpolation(Math.abs(k.f(k.c(f10, -1.0f), 1.0f)));
        if (f10 > 0.0f) {
            applyPageAlpha(view, interpolation, expression2.evaluate(this.resolver).doubleValue());
            applyPageScale(view, interpolation, expression3.evaluate(this.resolver).doubleValue());
        } else {
            applyPageAlpha(view, interpolation, expression4.evaluate(this.resolver).doubleValue());
            applyPageScale(view, interpolation, expression5.evaluate(this.resolver).doubleValue());
        }
    }

    private final void applyEvaluatedOffset(View view, int i10, float f10) {
        this.pageTranslations.put(i10, Float.valueOf(f10));
        if (this.isHorizontal) {
            view.setTranslationX(f10);
        } else {
            view.setTranslationY(f10);
        }
    }

    private final void applyOffset(View view, float f10, boolean z10) {
        int childAdapterPosition = this.recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        float f11 = -(z10 ? this.parentSize * f10 : this.offsetProvider.getPageOffset(f10, childAdapterPosition, this.pageTransformation instanceof DivPageTransformation.b));
        if (this.isHorizontal && ViewsKt.isLayoutRtl(this.recyclerView)) {
            f11 = -f11;
        }
        applyEvaluatedOffset(view, childAdapterPosition, f11);
    }

    public static /* synthetic */ void applyOffset$default(DivPagerPageTransformer divPagerPageTransformer, View view, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        divPagerPageTransformer.applyOffset(view, f10, z10);
    }

    private final void applyPageAlpha(View view, float f10, double d10) {
        int childAdapterPosition = this.recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = this.recyclerView.getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter == null) {
            return;
        }
        view.setAlpha((float) getInterpolation(divPagerAdapter.getItemsToShow().get(childAdapterPosition).getDiv().b().o().evaluate(this.resolver).doubleValue(), d10, f10));
    }

    private final void applyPageScale(View view, float f10, double d10) {
        if (d10 == 1.0d) {
            return;
        }
        float interpolation = (float) getInterpolation(1.0d, d10, f10);
        view.setScaleX(interpolation);
        view.setScaleY(interpolation);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f10) {
        DivPageTransformation divPageTransformation = this.pageTransformation;
        Object objB = divPageTransformation != null ? divPageTransformation.b() : null;
        if (objB instanceof DivPageTransformationSlide) {
            apply((DivPageTransformationSlide) objB, view, f10);
        } else if (objB instanceof DivPageTransformationOverlap) {
            apply((DivPageTransformationOverlap) objB, view, f10);
        } else {
            applyOffset$default(this, view, f10, false, 2, null);
        }
    }

    public DivPagerPageTransformer(RecyclerView recyclerView, ExpressionResolver expressionResolver, SparseArray<Float> sparseArray, int i10, DivPageTransformation divPageTransformation, DivPagerPageOffsetProvider divPagerPageOffsetProvider, boolean z10) {
        this.recyclerView = recyclerView;
        this.resolver = expressionResolver;
        this.pageTranslations = sparseArray;
        this.parentSize = i10;
        this.pageTransformation = divPageTransformation;
        this.offsetProvider = divPagerPageOffsetProvider;
        this.isHorizontal = z10;
    }

    private final double getInterpolation(double d10, double d11, float f10) {
        return Math.min(d10, d11) + (Math.abs(d11 - d10) * ((double) f10));
    }

    private final void apply(DivPageTransformationOverlap divPageTransformationOverlap, View view, float f10) {
        applyAlphaAndScale(view, f10, divPageTransformationOverlap.f48156a, divPageTransformationOverlap.f48157b, divPageTransformationOverlap.f48158c, divPageTransformationOverlap.f48159d, divPageTransformationOverlap.f48160e);
        if (f10 <= 0.0f && (f10 >= 0.0f || !divPageTransformationOverlap.f48161f.evaluate(this.resolver).booleanValue())) {
            applyOffset(view, f10, true);
            view.setTranslationZ(-Math.abs(f10));
        } else {
            applyOffset$default(this, view, f10, false, 2, null);
            view.setTranslationZ(0.0f);
        }
    }
}
