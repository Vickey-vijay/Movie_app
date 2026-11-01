package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import bk.l;
import ck.p;
import com.yandex.div.R$id;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ReleasablesKt;
import com.yandex.div.core.view.OnPreDrawListeners;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivAccessibilityBinder;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivData;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivSwitch;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTransform;
import com.yandex.div2.DivTransitionTrigger;
import com.yandex.div2.DivVisibility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import lk.x;
import mj.r;
import oe.e2;

/* JADX INFO: compiled from: DivBaseBinder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivBaseBinder {
    private final DivAccessibilityBinder divAccessibilityBinder;
    private final DivBackgroundBinder divBackgroundBinder;
    private final DivFocusBinder divFocusBinder;
    private final DivLayoutParamsBinder layoutParamsBinder;
    private final DivTooltipController tooltipController;

    /* JADX INFO: compiled from: DivBaseBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivVisibility.values().length];
            try {
                iArr[DivVisibility.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivVisibility.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivVisibility.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void applyAlpha(View view, double d10) {
        view.setAlpha((float) d10);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports != null) {
            divBorderSupports.invalidateBorder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindLayoutProvider$lambda$4(View view, DivBaseBinder divBaseBinder, Div2View div2View, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, BindingContext bindingContext, String str2, View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str, divLayoutProviderVariablesHolder, i10, i12, i14, i16, bindingContext.getExpressionResolver());
        divBaseBinder.updateSizeVariable(div2View, displayMetrics, str2, divLayoutProviderVariablesHolder, i11, i13, i15, i17, bindingContext.getExpressionResolver());
    }

    public final void bindBackground$div_release(BindingContext bindingContext, View view, e2 e2Var, e2 e2Var2, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        bindBackground(view, bindingContext, e2Var, e2Var2, expressionSubscriber, drawable);
        bindPaddings(view, e2Var, e2Var2, bindingContext.getExpressionResolver(), expressionSubscriber);
    }

    private final void applyFocusableState(View view, e2 e2Var) {
        if ((e2Var instanceof DivInput) || (e2Var instanceof DivSwitch)) {
            return;
        }
        view.setFocusable(e2Var.p() != null);
    }

    private final void bind(View view, BindingContext bindingContext, e2 e2Var, e2 e2Var2) {
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        Div2View divView = bindingContext.getDivView();
        ExpressionSubscriber expressionSubscriber = ReleasablesKt.getExpressionSubscriber(view);
        if (Build.VERSION.SDK_INT >= 26) {
            view.setDefaultFocusHighlightEnabled(false);
        }
        bindId(view, divView, e2Var, e2Var2);
        bindLayoutParams(view, bindingContext, e2Var, e2Var2, expressionSubscriber);
        bindMargins(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindAlignment(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindLayoutProvider(view, bindingContext, e2Var, e2Var2);
        bindAccessibility(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindAlpha(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindBackground$default(this, view, bindingContext, e2Var, e2Var2, expressionSubscriber, null, 16, null);
        bindBorder(view, bindingContext, e2Var);
        bindPaddings(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindNextFocus(view, divView, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        DivFocus divFocusP = e2Var.p();
        List<DivAction> list = divFocusP != null ? divFocusP.f47208e : null;
        DivFocus divFocusP2 = e2Var.p();
        bindFocusActions(view, bindingContext, list, divFocusP2 != null ? divFocusP2.f47207d : null);
        bindVisibility(view, divView, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        bindTransform(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
        List<DivTooltip> listH = e2Var.h();
        if (listH != null) {
            this.tooltipController.mapTooltip(view, listH);
        }
        applyFocusableState(view, e2Var);
    }

    private final void bindAccessibility(View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        this.divAccessibilityBinder.bind(view, e2Var, e2Var2, expressionResolver, expressionSubscriber);
    }

    private final void bindBackground(View view, BindingContext bindingContext, e2 e2Var, e2 e2Var2, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        DivFocus divFocusP;
        DivBackgroundBinder divBackgroundBinder = this.divBackgroundBinder;
        List<DivBackground> background = e2Var.getBackground();
        List<DivBackground> background2 = e2Var2 != null ? e2Var2.getBackground() : null;
        DivFocus divFocusP2 = e2Var.p();
        divBackgroundBinder.bindBackground(bindingContext, view, background, background2, divFocusP2 != null ? divFocusP2.f47204a : null, (e2Var2 == null || (divFocusP = e2Var2.p()) == null) ? null : divFocusP.f47204a, expressionSubscriber, drawable);
    }

    public static /* synthetic */ void bindBackground$default(DivBaseBinder divBaseBinder, View view, BindingContext bindingContext, e2 e2Var, e2 e2Var2, ExpressionSubscriber expressionSubscriber, Drawable drawable, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            drawable = null;
        }
        divBaseBinder.bindBackground(view, bindingContext, e2Var, e2Var2, expressionSubscriber, drawable);
    }

    private final void bindBorder(View view, BindingContext bindingContext, e2 e2Var) {
        DivFocusBinder divFocusBinder = this.divFocusBinder;
        DivFocus divFocusP = e2Var.p();
        divFocusBinder.bindDivBorder(view, bindingContext, divFocusP != null ? divFocusP.f47205b : null, e2Var.z());
    }

    private final void bindFocusActions(View view, BindingContext bindingContext, List<DivAction> list, List<DivAction> list2) {
        this.divFocusBinder.bindDivFocusActions(view, bindingContext, list, list2);
    }

    private final void bindLayoutParams(View view, BindingContext bindingContext, e2 e2Var, e2 e2Var2, ExpressionSubscriber expressionSubscriber) {
        this.layoutParamsBinder.bindLayoutParams(bindingContext, view, e2Var, e2Var2, expressionSubscriber);
    }

    private final void bindLayoutProvider(final View view, final BindingContext bindingContext, e2 e2Var, e2 e2Var2) {
        DivLayoutProvider divLayoutProviderT;
        DivLayoutProvider divLayoutProviderT2;
        DivLayoutProvider divLayoutProviderT3;
        final Div2View divView = bindingContext.getDivView();
        DivData divData = divView.getDivData();
        if (divData == null || (divLayoutProviderT = e2Var.t()) == null) {
            return;
        }
        if (x.F(divLayoutProviderT.f48028b, (e2Var2 == null || (divLayoutProviderT3 = e2Var2.t()) == null) ? null : divLayoutProviderT3.f48028b, false, 2, null)) {
            if (x.F(divLayoutProviderT.f48027a, (e2Var2 == null || (divLayoutProviderT2 = e2Var2.t()) == null) ? null : divLayoutProviderT2.f48027a, false, 2, null)) {
                return;
            }
        }
        if ((e2Var2 != null ? e2Var2.t() : null) != null) {
            clearLayoutProviderVariables(view);
        }
        final String str = divLayoutProviderT.f48028b;
        final String str2 = divLayoutProviderT.f48027a;
        if (str == null || str.length() == 0) {
            if (str2 == null || str2.length() == 0) {
                DivActionTypedUtilsKt.logError(divView, new Throwable("Neither width_variable_name nor height_variable_name found."));
                return;
            }
        }
        DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder = divView.getVariablesHolders$div_release().get(divData);
        if (divLayoutProviderVariablesHolder == null) {
            divLayoutProviderVariablesHolder = new DivLayoutProviderVariablesHolder();
            divLayoutProviderVariablesHolder.observeDivData(divData, bindingContext);
            divView.getVariablesHolders$div_release().put(divData, divLayoutProviderVariablesHolder);
        }
        final DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder2 = divLayoutProviderVariablesHolder;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: yd.j
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                DivBaseBinder.bindLayoutProvider$lambda$4(view, this, divView, str, divLayoutProviderVariablesHolder2, bindingContext, str2, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        if (view.getWidth() > 0 || view.getHeight() > 0) {
            onLayoutChangeListener.onLayoutChange(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), 0, 0, 0, 0);
        }
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        view.setTag(R$id.div_layout_provider_listener_id, onLayoutChangeListener);
        if (divView.getClearVariablesListener$div_release() != null) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListenerOnPreDrawListener$default = OnPreDrawListeners.onPreDrawListener$default(null, new bk.a<Boolean>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindLayoutProvider$clearVariablesListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final Boolean invoke() {
                divLayoutProviderVariablesHolder2.clear();
                Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = divView.getLayoutSizes$div_release();
                Div2View div2View = divView;
                for (Map.Entry<ExpressionResolver, Map<String, Integer>> entry : layoutSizes$div_release.entrySet()) {
                    ExpressionResolver key = entry.getKey();
                    for (Map.Entry<String, Integer> entry2 : entry.getValue().entrySet()) {
                        VariableMutationHandler.Companion.setVariable(div2View, entry2.getKey(), String.valueOf(entry2.getValue().intValue()), key);
                    }
                }
                divView.getLayoutSizes$div_release().clear();
                return Boolean.TRUE;
            }
        }, 1, null);
        divView.setClearVariablesListener$div_release(onPreDrawListenerOnPreDrawListener$default);
        divView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListenerOnPreDrawListener$default);
    }

    private final void bindPaddings(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        if (view instanceof DivPagerView) {
            return;
        }
        if (DivDataExtensionsKt.equalsToConstant(e2Var.r(), e2Var2 != null ? e2Var2.r() : null)) {
            return;
        }
        BaseDivViewExtensionsKt.applyPaddings(view, e2Var.r(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(e2Var.r())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, e2Var.r(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindPaddings.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                BaseDivViewExtensionsKt.applyPaddings(view, e2Var.r(), expressionResolver);
            }
        });
    }

    private final void clearLayoutProviderVariables(View view) {
        Object tag = view.getTag(R$id.div_layout_provider_listener_id);
        view.removeOnLayoutChangeListener(tag instanceof View.OnLayoutChangeListener ? (View.OnLayoutChangeListener) tag : null);
    }

    private final void updateSizeVariable(Div2View div2View, DisplayMetrics displayMetrics, String str, DivLayoutProviderVariablesHolder divLayoutProviderVariablesHolder, int i10, int i11, int i12, int i13, ExpressionResolver expressionResolver) {
        int i14;
        if ((str == null || str.length() == 0) || (i14 = i11 - i10) == i13 - i12) {
            return;
        }
        if (divLayoutProviderVariablesHolder.contains(str)) {
            DivActionTypedUtilsKt.logError(div2View, new Throwable("Size subscriber affects original view size. Relayout was prevented."));
            return;
        }
        Map<ExpressionResolver, Map<String, Integer>> layoutSizes$div_release = div2View.getLayoutSizes$div_release();
        Map<String, Integer> linkedHashMap = layoutSizes$div_release.get(expressionResolver);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            layoutSizes$div_release.put(expressionResolver, linkedHashMap);
        }
        linkedHashMap.put(str, Integer.valueOf(BaseDivViewExtensionsKt.pxToDp(Integer.valueOf(i14), displayMetrics)));
    }

    public final void bindId$div_release(Div2View div2View, View view, String str) {
        applyId(view, str, str == null ? -1 : div2View.getViewComponent$div_release().getViewIdProvider().getViewId(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindView(BindingContext bindingContext, View view, Div div, Div div2) {
        p.h(view, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.widgets.DivHolderView<com.yandex.div2.Div>");
        DivHolderView divHolderView = (DivHolderView) view;
        divHolderView.closeAllSubscription();
        divHolderView.setDiv(div);
        divHolderView.setBindingContext(bindingContext);
        bind(view, bindingContext, div.b(), div2 != null ? div2.b() : null);
    }

    public DivBaseBinder(DivBackgroundBinder divBackgroundBinder, DivTooltipController divTooltipController, DivFocusBinder divFocusBinder, DivAccessibilityBinder divAccessibilityBinder, DivLayoutParamsBinder divLayoutParamsBinder) {
        this.divBackgroundBinder = divBackgroundBinder;
        this.tooltipController = divTooltipController;
        this.divFocusBinder = divFocusBinder;
        this.divAccessibilityBinder = divAccessibilityBinder;
        this.layoutParamsBinder = divLayoutParamsBinder;
    }

    private final void applyId(View view, String str, int i10) {
        view.setTag(str);
        view.setId(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    public final void applyVisibility(View view, Div2View div2View, e2 e2Var, ExpressionResolver expressionResolver, boolean z10) {
        int i10;
        Transition transitionCreateAndroidTransition;
        DivTransitionHandler divTransitionHandler$div_release = div2View.getDivTransitionHandler$div_release();
        int i11 = WhenMappings.$EnumSwitchMapping$0[e2Var.getVisibility().evaluate(expressionResolver).ordinal()];
        boolean z11 = false;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    i10 = 8;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i10 = 4;
            }
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            view.clearAnimation();
        }
        int visibility = view.getVisibility();
        List<DivTransitionTrigger> listM = e2Var.m();
        if (listM != null && !DivTransitionsKt.allowsTransitionsOnVisibilityChange(listM)) {
            z11 = true;
        }
        Transition transition = null;
        if (!z11) {
            DivTransitionHandler.ChangeType.Visibility lastChange = divTransitionHandler$div_release.getLastChange(view);
            if (lastChange != null) {
                visibility = lastChange.getNew();
            }
            DivTransitionBuilder transitionBuilder = div2View.getViewComponent$div_release().getTransitionBuilder();
            if ((visibility == 4 || visibility == 8) && i10 == 0) {
                transitionCreateAndroidTransition = transitionBuilder.createAndroidTransition(e2Var.x(), 1, expressionResolver);
            } else {
                if ((i10 == 4 || i10 == 8) && visibility == 0 && !z10) {
                    transitionCreateAndroidTransition = transitionBuilder.createAndroidTransition(e2Var.i(), 2, expressionResolver);
                } else if (lastChange != null) {
                    TransitionManager.endTransitions(div2View);
                }
                if (transition != null) {
                    transition.addTarget(view);
                }
            }
            transition = transitionCreateAndroidTransition;
            if (transition != null) {
                transition.addTarget(view);
            }
        }
        if (transition != null) {
            divTransitionHandler$div_release.putTransition(transition, view, new DivTransitionHandler.ChangeType.Visibility(i10));
        } else {
            view.setVisibility(i10);
        }
        div2View.trackChildrenVisibility();
    }

    private final void bindAlignment(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<DivAlignmentHorizontal> expressionG;
        DivAlignmentHorizontal divAlignmentHorizontalEvaluate;
        DivAlignmentVertical divAlignmentVerticalEvaluate;
        Disposable disposableObserve;
        Expression<DivAlignmentVertical> expressionN;
        Expression<DivAlignmentHorizontal> expressionG2 = e2Var.g();
        Disposable disposableObserve2 = null;
        if (e2Var2 != null) {
            expressionG = e2Var2.g();
        } else {
            expressionG = null;
        }
        if (ExpressionsKt.equalsToConstant(expressionG2, expressionG)) {
            Expression<DivAlignmentVertical> expressionN2 = e2Var.n();
            if (e2Var2 != null) {
                expressionN = e2Var2.n();
            } else {
                expressionN = null;
            }
            if (ExpressionsKt.equalsToConstant(expressionN2, expressionN)) {
                return;
            }
        }
        Expression<DivAlignmentHorizontal> expressionG3 = e2Var.g();
        if (expressionG3 != null) {
            divAlignmentHorizontalEvaluate = expressionG3.evaluate(expressionResolver);
        } else {
            divAlignmentHorizontalEvaluate = null;
        }
        Expression<DivAlignmentVertical> expressionN3 = e2Var.n();
        if (expressionN3 != null) {
            divAlignmentVerticalEvaluate = expressionN3.evaluate(expressionResolver);
        } else {
            divAlignmentVerticalEvaluate = null;
        }
        BaseDivViewExtensionsKt.applyAlignment(view, divAlignmentHorizontalEvaluate, divAlignmentVerticalEvaluate);
        if (ExpressionsKt.isConstantOrNull(e2Var.g()) && ExpressionsKt.isConstantOrNull(e2Var.n())) {
            return;
        }
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                View view2 = view;
                Expression<DivAlignmentHorizontal> expressionG4 = e2Var.g();
                DivAlignmentHorizontal divAlignmentHorizontalEvaluate2 = expressionG4 != null ? expressionG4.evaluate(expressionResolver) : null;
                Expression<DivAlignmentVertical> expressionN4 = e2Var.n();
                BaseDivViewExtensionsKt.applyAlignment(view2, divAlignmentHorizontalEvaluate2, expressionN4 != null ? expressionN4.evaluate(expressionResolver) : null);
            }
        };
        Expression<DivAlignmentHorizontal> expressionG4 = e2Var.g();
        if (expressionG4 != null) {
            disposableObserve = expressionG4.observe(expressionResolver, lVar);
        } else {
            disposableObserve = null;
        }
        expressionSubscriber.addSubscription(disposableObserve);
        Expression<DivAlignmentVertical> expressionN4 = e2Var.n();
        if (expressionN4 != null) {
            disposableObserve2 = expressionN4.observe(expressionResolver, lVar);
        }
        expressionSubscriber.addSubscription(disposableObserve2);
    }

    private final void bindAlpha(final View view, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<Double> expressionO;
        Expression<Double> expressionO2 = e2Var.o();
        if (e2Var2 != null) {
            expressionO = e2Var2.o();
        } else {
            expressionO = null;
        }
        if (ExpressionsKt.equalsToConstant(expressionO2, expressionO)) {
            return;
        }
        applyAlpha(view, e2Var.o().evaluate(expressionResolver).doubleValue());
        if (ExpressionsKt.isConstant(e2Var.o())) {
            return;
        }
        expressionSubscriber.addSubscription(e2Var.o().observe(expressionResolver, new l<Double, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindAlpha.1
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
                DivBaseBinder.this.applyAlpha(view, d10);
            }
        }));
    }

    private final void bindId(View view, Div2View div2View, e2 e2Var, e2 e2Var2) {
        String id2;
        String id3 = e2Var.getId();
        if (e2Var2 != null) {
            id2 = e2Var2.getId();
        } else {
            id2 = null;
        }
        if (p.e(id3, id2)) {
            return;
        }
        applyId(view, e2Var.getId(), div2View.getViewComponent$div_release().getViewIdProvider().getViewId(e2Var.getId()));
    }

    private final void bindMargins(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivEdgeInsets divEdgeInsetsD;
        DivEdgeInsets divEdgeInsetsD2 = e2Var.d();
        if (e2Var2 != null) {
            divEdgeInsetsD = e2Var2.d();
        } else {
            divEdgeInsetsD = null;
        }
        if (DivDataExtensionsKt.equalsToConstant(divEdgeInsetsD2, divEdgeInsetsD)) {
            return;
        }
        BaseDivViewExtensionsKt.applyMargins(view, e2Var.d(), expressionResolver);
        if (DivDataExtensionsKt.isConstant(e2Var.d())) {
            return;
        }
        ExpressionSubscribersKt.observeEdgeInsets(expressionSubscriber, e2Var.d(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindMargins.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                BaseDivViewExtensionsKt.applyMargins(view, e2Var.d(), expressionResolver);
            }
        });
    }

    private final void bindNextFocus(final View view, Div2View div2View, e2 e2Var, e2 e2Var2, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<String> expression;
        Expression<String> expression2;
        Expression<String> expression3;
        Expression<String> expression4;
        Expression<String> expression5;
        Expression<String> expression6;
        Expression<String> expression7;
        Expression<String> expression8;
        Expression<String> expression9;
        Expression<String> expression10;
        String strEvaluate;
        DivFocus divFocusP;
        DivFocus.NextFocusIds nextFocusIds;
        DivFocus.NextFocusIds nextFocusIds2;
        String strEvaluate2;
        Disposable disposableObserve;
        DivFocus divFocusP2;
        DivFocus.NextFocusIds nextFocusIds3;
        DivFocus.NextFocusIds nextFocusIds4;
        String strEvaluate3;
        Disposable disposableObserve2;
        DivFocus divFocusP3;
        DivFocus.NextFocusIds nextFocusIds5;
        DivFocus.NextFocusIds nextFocusIds6;
        String strEvaluate4;
        Disposable disposableObserve3;
        DivFocus divFocusP4;
        DivFocus.NextFocusIds nextFocusIds7;
        DivFocus.NextFocusIds nextFocusIds8;
        String strEvaluate5;
        Disposable disposableObserve4;
        DivFocus divFocusP5;
        DivFocus.NextFocusIds nextFocusIds9;
        DivFocus.NextFocusIds nextFocusIds10;
        final DivViewIdProvider viewIdProvider = div2View.getViewComponent$div_release().getViewIdProvider();
        DivFocus divFocusP6 = e2Var.p();
        Disposable disposableObserve5 = null;
        if (divFocusP6 != null && (nextFocusIds10 = divFocusP6.f47206c) != null) {
            expression = nextFocusIds10.f47213b;
        } else {
            expression = null;
        }
        if (e2Var2 != null && (divFocusP5 = e2Var2.p()) != null && (nextFocusIds9 = divFocusP5.f47206c) != null) {
            expression2 = nextFocusIds9.f47213b;
        } else {
            expression2 = null;
        }
        if (!ExpressionsKt.equalsToConstant(expression, expression2)) {
            if (expression != null) {
                strEvaluate5 = expression.evaluate(expressionResolver);
            } else {
                strEvaluate5 = null;
            }
            view.setNextFocusForwardId(viewIdProvider.getViewId(strEvaluate5));
            view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(strEvaluate5));
            if (!ExpressionsKt.isConstantOrNull(expression)) {
                if (expression != null) {
                    disposableObserve4 = expression.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(String str) {
                            invoke2(str);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String str) {
                            view.setNextFocusForwardId(viewIdProvider.getViewId(str));
                            view.setAccessibilityTraversalBefore(viewIdProvider.getViewId(str));
                        }
                    });
                } else {
                    disposableObserve4 = null;
                }
                expressionSubscriber.addSubscription(disposableObserve4);
            }
        }
        DivFocus divFocusP7 = e2Var.p();
        if (divFocusP7 != null && (nextFocusIds8 = divFocusP7.f47206c) != null) {
            expression3 = nextFocusIds8.f47214c;
        } else {
            expression3 = null;
        }
        if (e2Var2 != null && (divFocusP4 = e2Var2.p()) != null && (nextFocusIds7 = divFocusP4.f47206c) != null) {
            expression4 = nextFocusIds7.f47214c;
        } else {
            expression4 = null;
        }
        if (!ExpressionsKt.equalsToConstant(expression3, expression4)) {
            if (expression3 != null) {
                strEvaluate4 = expression3.evaluate(expressionResolver);
            } else {
                strEvaluate4 = null;
            }
            view.setNextFocusLeftId(viewIdProvider.getViewId(strEvaluate4));
            if (!ExpressionsKt.isConstantOrNull(expression3)) {
                if (expression3 != null) {
                    disposableObserve3 = expression3.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(String str) {
                            invoke2(str);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String str) {
                            view.setNextFocusLeftId(viewIdProvider.getViewId(str));
                        }
                    });
                } else {
                    disposableObserve3 = null;
                }
                expressionSubscriber.addSubscription(disposableObserve3);
            }
        }
        DivFocus divFocusP8 = e2Var.p();
        if (divFocusP8 != null && (nextFocusIds6 = divFocusP8.f47206c) != null) {
            expression5 = nextFocusIds6.f47215d;
        } else {
            expression5 = null;
        }
        if (e2Var2 != null && (divFocusP3 = e2Var2.p()) != null && (nextFocusIds5 = divFocusP3.f47206c) != null) {
            expression6 = nextFocusIds5.f47215d;
        } else {
            expression6 = null;
        }
        if (!ExpressionsKt.equalsToConstant(expression5, expression6)) {
            if (expression5 != null) {
                strEvaluate3 = expression5.evaluate(expressionResolver);
            } else {
                strEvaluate3 = null;
            }
            view.setNextFocusRightId(viewIdProvider.getViewId(strEvaluate3));
            if (!ExpressionsKt.isConstantOrNull(expression5)) {
                if (expression5 != null) {
                    disposableObserve2 = expression5.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(String str) {
                            invoke2(str);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String str) {
                            view.setNextFocusRightId(viewIdProvider.getViewId(str));
                        }
                    });
                } else {
                    disposableObserve2 = null;
                }
                expressionSubscriber.addSubscription(disposableObserve2);
            }
        }
        DivFocus divFocusP9 = e2Var.p();
        if (divFocusP9 != null && (nextFocusIds4 = divFocusP9.f47206c) != null) {
            expression7 = nextFocusIds4.f47216e;
        } else {
            expression7 = null;
        }
        if (e2Var2 != null && (divFocusP2 = e2Var2.p()) != null && (nextFocusIds3 = divFocusP2.f47206c) != null) {
            expression8 = nextFocusIds3.f47216e;
        } else {
            expression8 = null;
        }
        if (!ExpressionsKt.equalsToConstant(expression7, expression8)) {
            if (expression7 != null) {
                strEvaluate2 = expression7.evaluate(expressionResolver);
            } else {
                strEvaluate2 = null;
            }
            view.setNextFocusUpId(viewIdProvider.getViewId(strEvaluate2));
            if (!ExpressionsKt.isConstantOrNull(expression7)) {
                if (expression7 != null) {
                    disposableObserve = expression7.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(String str) {
                            invoke2(str);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String str) {
                            view.setNextFocusUpId(viewIdProvider.getViewId(str));
                        }
                    });
                } else {
                    disposableObserve = null;
                }
                expressionSubscriber.addSubscription(disposableObserve);
            }
        }
        DivFocus divFocusP10 = e2Var.p();
        if (divFocusP10 != null && (nextFocusIds2 = divFocusP10.f47206c) != null) {
            expression9 = nextFocusIds2.f47212a;
        } else {
            expression9 = null;
        }
        if (e2Var2 != null && (divFocusP = e2Var2.p()) != null && (nextFocusIds = divFocusP.f47206c) != null) {
            expression10 = nextFocusIds.f47212a;
        } else {
            expression10 = null;
        }
        if (!ExpressionsKt.equalsToConstant(expression9, expression10)) {
            if (expression9 != null) {
                strEvaluate = expression9.evaluate(expressionResolver);
            } else {
                strEvaluate = null;
            }
            view.setNextFocusDownId(viewIdProvider.getViewId(strEvaluate));
            if (!ExpressionsKt.isConstantOrNull(expression9)) {
                if (expression9 != null) {
                    disposableObserve5 = expression9.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder$bindNextFocus$$inlined$bindNextFocusId$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // bk.l
                        public /* bridge */ /* synthetic */ r invoke(String str) {
                            invoke2(str);
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String str) {
                            view.setNextFocusDownId(viewIdProvider.getViewId(str));
                        }
                    });
                }
                expressionSubscriber.addSubscription(disposableObserve5);
            }
        }
    }

    private final void bindTransform(final View view, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        DivTransform divTransformL;
        DivTransform divTransformL2 = e2Var.l();
        if (e2Var2 != null) {
            divTransformL = e2Var2.l();
        } else {
            divTransformL = null;
        }
        if (DivDataExtensionsKt.equalsToConstant(divTransformL2, divTransformL)) {
            return;
        }
        BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
        if (DivDataExtensionsKt.isConstant(e2Var.l())) {
            return;
        }
        ExpressionSubscribersKt.observeTransform(expressionSubscriber, e2Var.l(), expressionResolver, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindTransform.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                BaseDivViewExtensionsKt.applyTransform(view, e2Var, expressionResolver);
            }
        });
    }

    private final void bindVisibility(final View view, final Div2View div2View, final e2 e2Var, e2 e2Var2, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        Expression<DivVisibility> visibility;
        boolean z10;
        Expression<DivVisibility> visibility2 = e2Var.getVisibility();
        if (e2Var2 != null) {
            visibility = e2Var2.getVisibility();
        } else {
            visibility = null;
        }
        if (ExpressionsKt.equalsToConstant(visibility2, visibility)) {
            return;
        }
        if (e2Var2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        applyVisibility(view, div2View, e2Var, expressionResolver, z10);
        if (ExpressionsKt.isConstant(e2Var.getVisibility())) {
            return;
        }
        expressionSubscriber.addSubscription(e2Var.getVisibility().observe(expressionResolver, new l<DivVisibility, r>() { // from class: com.yandex.div.core.view2.divs.DivBaseBinder.bindVisibility.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivVisibility divVisibility) {
                invoke2(divVisibility);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivVisibility divVisibility) {
                DivBaseBinder.this.applyVisibility(view, div2View, e2Var, expressionResolver, false);
            }
        }));
    }
}
