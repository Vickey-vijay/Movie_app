package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import bk.l;
import bk.p;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import java.util.List;
import mj.r;
import oe.e2;

/* JADX INFO: loaded from: classes11.dex */
public final class BaseDivViewExtensionsKt {
    public static final int dpToPx(Long l10, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPx(l10, displayMetrics);
    }

    public static final int spToPx(Long l10, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPx(l10, displayMetrics);
    }

    public static final int toPx(long j10, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(j10, divSizeUnit, displayMetrics);
    }

    public static final float toPxF(long j10, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPxF(j10, divSizeUnit, displayMetrics);
    }

    public static final int unitToPx(Long l10, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPx(l10, displayMetrics, divSizeUnit);
    }

    public static final <T extends Number> int dpToPx(T t10, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPx(t10, displayMetrics);
    }

    public static final <T extends Number> int spToPx(T t10, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPx(t10, displayMetrics);
    }

    public static final int toPx(DivDimension divDimension, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(divDimension, displayMetrics, expressionResolver);
    }

    public static final float toPxF(DivFixedSize divFixedSize, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPxF(divFixedSize, displayMetrics, expressionResolver);
    }

    public static final <T extends Number> int unitToPx(T t10, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPx(t10, displayMetrics, divSizeUnit);
    }

    public static final void applyAlignment(View view, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAlignment(view, divAlignmentHorizontal, divAlignmentVertical);
    }

    public static final void applyBitmapFilters(View view, BindingContext bindingContext, Bitmap bitmap, List<? extends DivFilter> list, l<? super Bitmap, r> lVar) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyBitmapFilters(view, bindingContext, bitmap, list, lVar);
    }

    public static final void applyDivActions(View view, BindingContext bindingContext, DivAction divAction, List<DivAction> list, List<DivAction> list2, List<DivAction> list3, List<DivAction> list4, List<DivAction> list5, List<DivAction> list6, List<DivAction> list7, DivAnimation divAnimation, Expression<Boolean> expression) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyDivActions(view, bindingContext, divAction, list, list2, list3, list4, list5, list6, list7, divAnimation, expression);
    }

    public static final void applyMargins(View view, DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyMargins(view, divEdgeInsets, expressionResolver);
    }

    public static final void applyPaddings(View view, DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyPaddings(view, divEdgeInsets, expressionResolver);
    }

    public static final void applyTransform(View view, e2 e2Var, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
    }

    public static final void bindAspectRatio(View view, DivAspect divAspect, DivAspect divAspect2, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindAspectRatio(view, divAspect, divAspect2, expressionResolver);
    }

    public static final void bindClipChildren(ViewGroup viewGroup, Expression<Boolean> expression, Expression<Boolean> expression2, ExpressionResolver expressionResolver) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindClipChildren(viewGroup, expression, expression2, expressionResolver);
    }

    public static final void bindItemBuilder(DivCollectionItemBuilder divCollectionItemBuilder, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindItemBuilder(divCollectionItemBuilder, expressionResolver, lVar);
    }

    public static final void bindStates(View view, BindingContext bindingContext, DivBinder divBinder) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindStates(view, bindingContext, divBinder);
    }

    public static final void clearFocusOnClick(View view, InputFocusTracker inputFocusTracker) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
    }

    public static final p<View, MotionEvent, Boolean> createAnimatedTouchListener(View view, BindingContext bindingContext, DivAnimation divAnimation, DivGestureListener divGestureListener) {
        return BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, divAnimation, divGestureListener);
    }

    public static final <T extends Number> float dpToPxF(T t10, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.dpToPxF(t10, displayMetrics);
    }

    public static final void drawShadow(View view, Canvas canvas) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.drawShadow(view, canvas);
    }

    public static final float fontSizeToPx(long j10, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.fontSizeToPx(j10, divSizeUnit, displayMetrics);
    }

    public static final void gainAccessibilityFocus(View view) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.gainAccessibilityFocus(view);
    }

    public static final BindingContext getBindingContext(View view) {
        return BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getBindingContext(view);
    }

    public static final <T extends Number> int pxToDp(T t10, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDp(t10, displayMetrics);
    }

    public static final <T extends Number> float pxToDpF(T t10, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.pxToDpF(t10, displayMetrics);
    }

    public static final <T extends Number> float spToPxF(T t10, DisplayMetrics displayMetrics) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.spToPxF(t10, displayMetrics);
    }

    public static final int toAndroidUnit(DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toAndroidUnit(divSizeUnit);
    }

    public static final int toPx(DivFixedSize divFixedSize, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(divFixedSize, displayMetrics, expressionResolver);
    }

    @MainThread
    public static final void trackVisibilityActions(ViewGroup viewGroup, Div2View div2View, List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.trackVisibilityActions(viewGroup, div2View, list, list2);
    }

    public static final <T extends Number> float unitToPxF(T t10, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.unitToPxF(t10, displayMetrics, divSizeUnit);
    }

    public static final int toPx(DivSizeUnitValue divSizeUnitValue, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt__SizeUnitUtilsKt.toPx(divSizeUnitValue, displayMetrics, expressionResolver);
    }
}
