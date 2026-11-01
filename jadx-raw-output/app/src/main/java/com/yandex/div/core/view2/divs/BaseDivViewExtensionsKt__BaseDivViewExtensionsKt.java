package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.MainThread;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import bk.l;
import bk.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.animations.UtilsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotFixed;
import com.yandex.div2.DivPivotPercentage;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivVisibilityAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.sequences.SequencesKt___SequencesKt;
import mj.r;
import nj.b0;
import nj.x;
import oe.c9;
import oe.e2;

/* JADX INFO: compiled from: BaseDivViewExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class BaseDivViewExtensionsKt__BaseDivViewExtensionsKt {

    /* JADX INFO: compiled from: BaseDivViewExtensions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyBitmapFilters(final View view, BindingContext bindingContext, final Bitmap bitmap, final List<? extends DivFilter> list, final l<? super Bitmap, r> lVar) {
        int i10;
        if (list == null || list.isEmpty()) {
            lVar.invoke(bitmap);
            return;
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final BitmapEffectHelper bitmapEffectHelper = bindingContext.getDivView().getDiv2Component$div_release().getBitmapEffectHelper();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyBitmapFilters$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    int i19;
                    view2.removeOnLayoutChangeListener(this);
                    float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
                    Bitmap bitmap2 = bitmap;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
                    for (DivFilter divFilter : list) {
                        if (divFilter instanceof DivFilter.a) {
                            long jLongValue = ((DivFilter.a) divFilter).c().f46529a.evaluate(expressionResolver).longValue();
                            long j10 = jLongValue >> 31;
                            if (j10 != 0 && j10 != -1) {
                                KAssert kAssert = KAssert.INSTANCE;
                                if (Assert.isEnabled()) {
                                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                                }
                                if (jLongValue > 0) {
                                    i19 = Integer.MAX_VALUE;
                                } else {
                                    i19 = Integer.MIN_VALUE;
                                }
                            } else {
                                i19 = (int) jLongValue;
                            }
                            bitmapCreateScaledBitmap = bitmapEffectHelper.blurBitmap(bitmapCreateScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i19), view.getResources().getDisplayMetrics()));
                        } else if ((divFilter instanceof DivFilter.c) && ViewsKt.isLayoutRtl(view)) {
                            bitmapCreateScaledBitmap = bitmapEffectHelper.mirrorBitmap(bitmapCreateScaledBitmap);
                        }
                    }
                    lVar.invoke(bitmapCreateScaledBitmap);
                }
            });
            return;
        }
        float fMax = Math.max(view.getHeight() / bitmap.getHeight(), view.getWidth() / bitmap.getWidth());
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMax), (int) (fMax * bitmap.getHeight()), false);
        for (DivFilter divFilter : list) {
            if (divFilter instanceof DivFilter.a) {
                long jLongValue = ((DivFilter.a) divFilter).c().f46529a.evaluate(expressionResolver).longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i10 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                bitmapCreateScaledBitmap = bitmapEffectHelper.blurBitmap(bitmapCreateScaledBitmap, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), view.getResources().getDisplayMetrics()));
            } else if ((divFilter instanceof DivFilter.c) && ViewsKt.isLayoutRtl(view)) {
                bitmapCreateScaledBitmap = bitmapEffectHelper.mirrorBitmap(bitmapCreateScaledBitmap);
            }
        }
        lVar.invoke(bitmapCreateScaledBitmap);
    }

    public static final void applyDivActions(View view, BindingContext bindingContext, DivAction divAction, List<DivAction> list, List<DivAction> list2, List<DivAction> list3, List<DivAction> list4, List<DivAction> list5, List<DivAction> list6, List<DivAction> list7, DivAnimation divAnimation, Expression<Boolean> expression) {
        List<DivAction> listE;
        DivActionBinder actionBinder = bindingContext.getDivView().getDiv2Component$div_release().getActionBinder();
        if (list == null || list.isEmpty()) {
            listE = divAction != null ? nj.r.e(divAction) : null;
        } else {
            listE = list;
        }
        actionBinder.bindDivActions(bindingContext, view, listE, list2, list3, list4, list5, list6, list7, divAnimation, expression);
    }

    public static final void applyPaddings(View view, DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver) {
        if (divEdgeInsets == null) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        DivSizeUnit divSizeUnitEvaluate = divEdgeInsets.f47060g.evaluate(expressionResolver);
        Expression<Long> expression = divEdgeInsets.f47058e;
        if (expression == null && divEdgeInsets.f47055b == null) {
            view.setPadding(BaseDivViewExtensionsKt.toPx(divEdgeInsets.f47056c.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(divEdgeInsets.f47059f.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(divEdgeInsets.f47057d.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics), BaseDivViewExtensionsKt.toPx(divEdgeInsets.f47054a.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics));
            return;
        }
        int px = expression != null ? BaseDivViewExtensionsKt.toPx(expression.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics) : 0;
        int px2 = BaseDivViewExtensionsKt.toPx(divEdgeInsets.f47059f.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics);
        Expression<Long> expression2 = divEdgeInsets.f47055b;
        view.setPaddingRelative(px, px2, expression2 != null ? BaseDivViewExtensionsKt.toPx(expression2.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics) : 0, BaseDivViewExtensionsKt.toPx(divEdgeInsets.f47054a.evaluate(expressionResolver).longValue(), divSizeUnitEvaluate, displayMetrics));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static final p<View, MotionEvent, Boolean> createAnimatedTouchListener(View view, BindingContext bindingContext, DivAnimation divAnimation, DivGestureListener divGestureListener) {
        final GestureDetector gestureDetector;
        final p<View, MotionEvent, r> pVarAsTouchListener = divAnimation != null ? UtilsKt.asTouchListener(divAnimation, bindingContext.getExpressionResolver(), view) : null;
        if (divGestureListener == null) {
            gestureDetector = null;
        } else {
            if ((!(divGestureListener.getOnSingleTapListener() == null && divGestureListener.getOnDoubleTapListener() == null) ? divGestureListener : null) != null) {
                gestureDetector = new GestureDetector(bindingContext.getDivView().getContext$div_release(), divGestureListener, new Handler(Looper.getMainLooper()));
            } else {
                gestureDetector = null;
            }
        }
        if (pVarAsTouchListener == null && gestureDetector == null) {
            return null;
        }
        return new p<View, MotionEvent, Boolean>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.createAnimatedTouchListener.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Boolean mo1invoke(View view2, MotionEvent motionEvent) {
                p<View, MotionEvent, r> pVar = pVarAsTouchListener;
                if (pVar != null) {
                    pVar.mo1invoke(view2, motionEvent);
                }
                GestureDetector gestureDetector2 = gestureDetector;
                return Boolean.valueOf(gestureDetector2 != null ? gestureDetector2.onTouchEvent(motionEvent) : false);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(AspectView aspectView, Double d10) {
        aspectView.setAspectRatio(d10 != null ? (float) d10.doubleValue() : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(ViewGroup viewGroup, boolean z10) {
        DivHolderView divHolderView = viewGroup instanceof DivHolderView ? (DivHolderView) viewGroup : null;
        if (divHolderView != null) {
            divHolderView.setNeedClipping(z10);
        }
        ViewParent parent = viewGroup.getParent();
        if (z10 || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindAspectRatio(final View view, DivAspect divAspect, DivAspect divAspect2, ExpressionResolver expressionResolver) {
        Expression<Double> expression;
        Expression<Double> expression2;
        if (view instanceof AspectView) {
            Disposable disposableObserve = null;
            if (ExpressionsKt.equalsToConstant(divAspect != null ? divAspect.f46506a : null, divAspect2 != null ? divAspect2.f46506a : null)) {
                return;
            }
            applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, (divAspect == null || (expression2 = divAspect.f46506a) == null) ? null : expression2.evaluate(expressionResolver));
            if (ExpressionsKt.isConstantOrNull(divAspect != null ? divAspect.f46506a : null) || !(view instanceof ExpressionSubscriber)) {
                return;
            }
            ExpressionSubscriber expressionSubscriber = (ExpressionSubscriber) view;
            if (divAspect != null && (expression = divAspect.f46506a) != null) {
                disposableObserve = expression.observe(expressionResolver, new l<Double, r>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindAspectRatio.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(Double d10) {
                        invoke(d10.doubleValue());
                        return r.f64562a;
                    }

                    public final void invoke(double d10) {
                        BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyAspectRatio$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt((AspectView) view, Double.valueOf(d10));
                    }
                });
            }
            expressionSubscriber.addSubscription(disposableObserve);
        }
    }

    public static final void bindItemBuilder(DivCollectionItemBuilder divCollectionItemBuilder, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        divCollectionItemBuilder.f46622a.observe(expressionResolver, lVar);
        ExpressionResolver itemResolver = DivCollectionExtensionsKt.getItemResolver(divCollectionItemBuilder, expressionResolver);
        Iterator<T> it = divCollectionItemBuilder.f46624c.iterator();
        while (it.hasNext()) {
            ((DivCollectionItemBuilder.Prototype) it.next()).f46631c.observe(itemResolver, lVar);
        }
    }

    public static final void bindStates(View view, final BindingContext bindingContext, final DivBinder divBinder) {
        traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, new l<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindStates.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public final Boolean invoke(View view2) {
                DivStatePath path;
                if (!(view2 instanceof DivStateLayout)) {
                    return Boolean.TRUE;
                }
                DivStateLayout divStateLayout = (DivStateLayout) view2;
                Div.n div = divStateLayout.getDiv();
                if (div != null && (path = divStateLayout.getPath()) != null) {
                    divBinder.bind(bindingContext, view2, div, path.parentState());
                    return Boolean.FALSE;
                }
                return Boolean.FALSE;
            }
        });
    }

    public static final void gainAccessibilityFocus(View view) {
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final BindingContext getBindingContext(View view) {
        DivHolderView divHolderView = view instanceof DivHolderView ? (DivHolderView) view : null;
        if (divHolderView != null) {
            return divHolderView.getBindingContext();
        }
        return null;
    }

    public static final void applyAlignment(View view, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        boolean z10;
        applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        if (divAlignmentVertical == DivAlignmentVertical.BASELINE) {
            z10 = true;
        } else {
            z10 = false;
        }
        applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, z10);
    }

    private static final void applyBaselineAlignment$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, boolean z10) {
        DivLayoutParams divLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        } else {
            divLayoutParams = null;
        }
        if (divLayoutParams != null && divLayoutParams.isBaselineAligned() != z10) {
            divLayoutParams.setBaselineAligned(z10);
            view.requestLayout();
        }
    }

    private static final void applyGravity$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof DivLayoutParams) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.getGravity() != i10) {
                divLayoutParams.setGravity(i10);
                view.requestLayout();
                return;
            }
            return;
        }
        Log.e("DivView", "tag=" + view.getTag() + ": Can't cast " + layoutParams + " to get gravity");
    }

    public static final void applyMargins(View view, DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iUnitToPx;
        int iUnitToPx2;
        int iUnitToPx3;
        int iUnitToPx4;
        Integer num;
        int iIntValue;
        Integer numValueOf;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Integer numValueOf2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams == null) {
            return;
        }
        int iIntValue2 = 0;
        if (divEdgeInsets != null) {
            DivSizeUnit divSizeUnitEvaluate = divEdgeInsets.f47060g.evaluate(expressionResolver);
            iUnitToPx = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f47056c.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            iUnitToPx2 = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f47059f.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            iUnitToPx3 = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f47057d.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            iUnitToPx4 = BaseDivViewExtensionsKt.unitToPx(divEdgeInsets.f47054a.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate);
            Expression<Long> expression = divEdgeInsets.f47058e;
            if (expression != null) {
                numValueOf = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(expression.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate));
            } else {
                numValueOf = null;
            }
            Expression<Long> expression2 = divEdgeInsets.f47055b;
            if (expression2 != null) {
                numValueOf2 = Integer.valueOf(BaseDivViewExtensionsKt.unitToPx(expression2.evaluate(expressionResolver), displayMetrics, divSizeUnitEvaluate));
            }
            num = numValueOf2;
            numValueOf2 = numValueOf;
        } else {
            iUnitToPx = 0;
            iUnitToPx2 = 0;
            iUnitToPx3 = 0;
            iUnitToPx4 = 0;
            num = null;
        }
        if (marginLayoutParams.leftMargin != iUnitToPx || marginLayoutParams.topMargin != iUnitToPx2 || marginLayoutParams.rightMargin != iUnitToPx3 || marginLayoutParams.bottomMargin != iUnitToPx4 || ((numValueOf2 != null && marginLayoutParams.getMarginStart() != numValueOf2.intValue()) || (num != null && marginLayoutParams.getMarginEnd() != num.intValue()))) {
            marginLayoutParams.topMargin = iUnitToPx2;
            marginLayoutParams.bottomMargin = iUnitToPx4;
            if (numValueOf2 == null && num == null) {
                marginLayoutParams.leftMargin = iUnitToPx;
                marginLayoutParams.rightMargin = iUnitToPx3;
            } else {
                if (numValueOf2 != null) {
                    iIntValue = numValueOf2.intValue();
                } else {
                    iIntValue = 0;
                }
                marginLayoutParams.setMarginStart(iIntValue);
                if (num != null) {
                    iIntValue2 = num.intValue();
                }
                marginLayoutParams.setMarginEnd(iIntValue2);
            }
            view.requestLayout();
        }
    }

    public static final void applyTransform(final View view, e2 e2Var, final ExpressionResolver expressionResolver) {
        r rVar;
        Expression<Double> expression;
        final DivTransform divTransformL = e2Var.l();
        if (divTransformL != null && (expression = divTransformL.f49901c) != null) {
            view.setRotation((float) expression.evaluate(expressionResolver).doubleValue());
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            view.setRotation(0.0f);
        } else if (view.getWidth() == 0 && view.getHeight() == 0) {
            OneShotPreDrawListener.add(view, new Runnable() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$applyTransform$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = view;
                    view2.setPivotX(BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view2, view2.getWidth(), divTransformL.f49899a, expressionResolver));
                    View view3 = view;
                    view3.setPivotY(BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view3, view3.getHeight(), divTransformL.f49900b, expressionResolver));
                }
            });
        } else {
            view.setPivotX(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getWidth(), divTransformL.f49899a, expressionResolver));
            view.setPivotY(getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(view, view.getHeight(), divTransformL.f49900b, expressionResolver));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindClipChildren(final ViewGroup viewGroup, Expression<Boolean> expression, Expression<Boolean> expression2, ExpressionResolver expressionResolver) {
        DivHolderView divHolderView;
        if (ExpressionsKt.equalsToConstant(expression, expression2)) {
            return;
        }
        applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, expression.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(expression)) {
            return;
        }
        if (viewGroup instanceof DivHolderView) {
            divHolderView = (DivHolderView) viewGroup;
        } else {
            divHolderView = null;
        }
        if (divHolderView != null) {
            divHolderView.addSubscription(expression.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.bindClipChildren.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return r.f64562a;
                }

                public final void invoke(boolean z10) {
                    BaseDivViewExtensionsKt__BaseDivViewExtensionsKt.applyClipChildren$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(viewGroup, z10);
                }
            }));
        }
    }

    public static final void clearFocusOnClick(View view, InputFocusTracker inputFocusTracker) {
        if (!view.isFocused() && view.isInTouchMode()) {
            inputFocusTracker.removeFocusFromFocusedInput();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawShadow(View view, Canvas canvas) {
        DivBorderSupports divBorderSupports;
        DivBorderDrawer divBorderDrawer;
        int iSave = canvas.save();
        try {
            canvas.translate(view.getX(), view.getY());
            canvas.rotate(view.getRotation(), view.getPivotX(), view.getPivotY());
            if (view instanceof DivBorderSupports) {
                divBorderSupports = (DivBorderSupports) view;
            } else {
                divBorderSupports = null;
            }
            if (divBorderSupports != null && (divBorderDrawer = divBorderSupports.getDivBorderDrawer()) != null) {
                divBorderDrawer.drawShadow(canvas);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getPivotValue$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, int i10, DivPivot divPivot, ExpressionResolver expressionResolver) {
        Object objB = divPivot.b();
        if (objB instanceof DivPivotFixed) {
            DivPivotFixed divPivotFixed = (DivPivotFixed) objB;
            Expression<Long> expression = divPivotFixed.f48392b;
            if (expression != null) {
                float fLongValue = expression.evaluate(expressionResolver).longValue();
                int i11 = WhenMappings.$EnumSwitchMapping$0[divPivotFixed.f48391a.evaluate(expressionResolver).ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            return BaseDivViewExtensionsKt.spToPxF(Float.valueOf(fLongValue), view.getResources().getDisplayMetrics());
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return fLongValue;
                }
                return BaseDivViewExtensionsKt.dpToPxF(Float.valueOf(fLongValue), view.getResources().getDisplayMetrics());
            }
            return i10 / 2.0f;
        }
        if (objB instanceof DivPivotPercentage) {
            return i10 * (((float) ((DivPivotPercentage) objB).f48407a.evaluate(expressionResolver).doubleValue()) / 100.0f);
        }
        return i10 / 2.0f;
    }

    @MainThread
    public static final void trackVisibilityActions(final ViewGroup viewGroup, final Div2View div2View, final List<DivItemBuilderResult> list, List<DivItemBuilderResult> list2) {
        boolean z10;
        final DivVisibilityActionTracker visibilityActionTracker = div2View.getDiv2Component$div_release().getVisibilityActionTracker();
        if (list2 != null && !list2.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                x.C(arrayList, DivUtilKt.getAllSightActions(((DivItemBuilderResult) it.next()).getDiv().b()));
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                hashSet.add(((c9) it2.next()).b());
            }
            for (DivItemBuilderResult divItemBuilderResult : list2) {
                List<DivVisibilityAction> allAppearActions = DivUtilKt.getAllAppearActions(divItemBuilderResult.getDiv().b());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : allAppearActions) {
                    if (!hashSet.contains(((DivVisibilityAction) obj).b())) {
                        arrayList2.add(obj);
                    }
                }
                List<DivDisappearAction> allDisappearActions = DivUtilKt.getAllDisappearActions(divItemBuilderResult.getDiv().b());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : allDisappearActions) {
                    if (!hashSet.contains(((DivDisappearAction) obj2).b())) {
                        arrayList3.add(obj2);
                    }
                }
                visibilityActionTracker.trackVisibilityActionsOf(div2View, divItemBuilderResult.getExpressionResolver(), null, divItemBuilderResult.getDiv(), arrayList2, arrayList3);
            }
        }
        if (!list.isEmpty()) {
            viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$trackVisibilityActions$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    for (Pair pair : SequencesKt___SequencesKt.W(ViewGroupKt.getChildren(viewGroup), b0.S(list))) {
                        View view2 = (View) pair.component1();
                        DivItemBuilderResult divItemBuilderResult2 = (DivItemBuilderResult) pair.component2();
                        DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, div2View, divItemBuilderResult2.getExpressionResolver(), view2, divItemBuilderResult2.getDiv(), null, null, 48, null);
                    }
                }
            });
        }
    }

    private static final void traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(View view, l<? super View, Boolean> lVar) {
        if (lVar.invoke(view).booleanValue() && (view instanceof ViewGroup)) {
            Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                traverseViewHierarchy$BaseDivViewExtensionsKt__BaseDivViewExtensionsKt(it.next(), lVar);
            }
        }
    }
}
