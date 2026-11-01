package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewGroupKt;
import bk.q;
import ck.p;
import com.yandex.div.R$id;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivTooltipRestrictor;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivVisibilityActionTracker;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivTooltip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import mj.r;

/* JADX INFO: compiled from: DivTooltipController.kt */
/* JADX INFO: loaded from: classes10.dex */
public class DivTooltipController {
    private final AccessibilityStateProvider accessibilityStateProvider;
    private final q<View, Integer, Integer, SafePopupWindow> createPopup;
    private final DivPreloader divPreloader;
    private final DivTooltipViewBuilder divTooltipViewBuilder;
    private final DivVisibilityActionTracker divVisibilityActionTracker;
    private final ErrorCollectors errorCollectors;
    private final Handler mainThreadHandler;
    private final DivTooltipRestrictor tooltipRestrictor;
    private final Map<String, TooltipData> tooltips;

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public DivTooltipController(DivTooltipRestrictor divTooltipRestrictor, DivVisibilityActionTracker divVisibilityActionTracker, DivPreloader divPreloader, ErrorCollectors errorCollectors, DivTooltipViewBuilder divTooltipViewBuilder, AccessibilityStateProvider accessibilityStateProvider, q<? super View, ? super Integer, ? super Integer, ? extends SafePopupWindow> qVar) {
        this.tooltipRestrictor = divTooltipRestrictor;
        this.divVisibilityActionTracker = divVisibilityActionTracker;
        this.divPreloader = divPreloader;
        this.errorCollectors = errorCollectors;
        this.divTooltipViewBuilder = divTooltipViewBuilder;
        this.accessibilityStateProvider = accessibilityStateProvider;
        this.createPopup = qVar;
        this.tooltips = new LinkedHashMap();
        this.mainThreadHandler = new Handler(Looper.getMainLooper());
    }

    private String dismissTooltip(DivTooltip divTooltip) {
        TooltipData tooltipData = this.tooltips.get(divTooltip.f49844g);
        if (tooltipData == null) {
            return null;
        }
        return dismissTooltip(tooltipData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$18(TooltipData tooltipData, final View view, final DivTooltipController divTooltipController, final Div2View div2View, final DivTooltip divTooltip, boolean z10, final DivTooltipContainer divTooltipContainer, final SafePopupWindow safePopupWindow, final View view2, final ExpressionResolver expressionResolver, final BindingContext bindingContext, final Div div, boolean z11) {
        if (z11 || tooltipData.getDismissed() || !view.isAttachedToWindow() || !divTooltipController.tooltipRestrictor.canShowTooltip(div2View, view, divTooltip, z10)) {
            return;
        }
        if (!ViewsKt.isActuallyLaidOut(divTooltipContainer) || divTooltipContainer.isLayoutRequested()) {
            divTooltipContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view3.removeOnLayoutChangeListener(this);
                    Rect windowFrame = DivTooltipControllerKt.getWindowFrame(div2View);
                    Point pointCalcPopupLocation = DivTooltipControllerKt.calcPopupLocation(view2, view, divTooltip, expressionResolver);
                    int iMin = Math.min(view2.getWidth(), windowFrame.width());
                    int iMin2 = Math.min(view2.getHeight(), windowFrame.height());
                    if (iMin < view2.getWidth()) {
                        divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
                    }
                    if (iMin2 < view2.getHeight()) {
                        divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
                    }
                    safePopupWindow.update(pointCalcPopupLocation.x, pointCalcPopupLocation.y, iMin, iMin2);
                    divTooltipController.startVisibilityTracking(bindingContext, div, divTooltipContainer);
                    DivTooltipRestrictor.DivTooltipShownCallback tooltipShownCallback = divTooltipController.tooltipRestrictor.getTooltipShownCallback();
                    if (tooltipShownCallback != null) {
                        tooltipShownCallback.onDivTooltipShown(div2View, view, divTooltip);
                    }
                }
            });
        } else {
            Rect windowFrame = DivTooltipControllerKt.getWindowFrame(div2View);
            Point pointCalcPopupLocation = DivTooltipControllerKt.calcPopupLocation(view2, view, divTooltip, expressionResolver);
            int iMin = Math.min(view2.getWidth(), windowFrame.width());
            int iMin2 = Math.min(view2.getHeight(), windowFrame.height());
            if (iMin < view2.getWidth()) {
                divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip width > screen size, width was changed"));
            }
            if (iMin2 < view2.getHeight()) {
                divTooltipController.errorCollectors.getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(new Throwable("Tooltip height > screen size, height was changed"));
            }
            safePopupWindow.update(pointCalcPopupLocation.x, pointCalcPopupLocation.y, iMin, iMin2);
            divTooltipController.startVisibilityTracking(bindingContext, div, divTooltipContainer);
            DivTooltipRestrictor.DivTooltipShownCallback tooltipShownCallback = divTooltipController.tooltipRestrictor.getTooltipShownCallback();
            if (tooltipShownCallback != null) {
                tooltipShownCallback.onDivTooltipShown(div2View, view, divTooltip);
            }
        }
        safePopupWindow.showAtLocation(view, 0, 0, 0);
        DivTooltipControllerKt.sendAccessibilityEventUnchecked(32, view2, divTooltipController.accessibilityStateProvider);
        if (divTooltip.f49843f.evaluate(expressionResolver).longValue() != 0) {
            divTooltipController.mainThreadHandler.postDelayed(new Runnable() { // from class: com.yandex.div.core.tooltip.DivTooltipController$tryShowTooltip$lambda$18$$inlined$postDelayed$default$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.hideTooltip(divTooltip.f49844g, div2View);
                }
            }, divTooltip.f49843f.evaluate(expressionResolver).longValue());
        }
    }

    public void cancelTooltips(Div2View div2View) {
        p.h(div2View, "null cannot be cast to non-null type android.view.View");
        cancelTooltips((View) div2View);
    }

    public void showTooltip(String str, BindingContext bindingContext, boolean z10) {
        r rVar;
        Pair pairFindChildWithTooltip = DivTooltipControllerKt.findChildWithTooltip(str, bindingContext.getDivView());
        if (pairFindChildWithTooltip != null) {
            showTooltip(bindingContext, (DivTooltip) pairFindChildWithTooltip.component1(), (View) pairFindChildWithTooltip.component2(), z10);
            rVar = r.f64562a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            DivActionTypedUtilsKt.logError(bindingContext.getDivView(), new IllegalStateException("Unable to find view for tooltip '" + str + '\''));
        }
    }

    private void cancelTooltips(View view) {
        Object tag = view.getTag(R$id.div_tooltips_tag);
        List list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strDismissTooltip = dismissTooltip((DivTooltip) it.next());
                if (strDismissTooltip != null) {
                    arrayList.add(strDismissTooltip);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.tooltips.remove((String) it2.next());
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it3 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it3.hasNext()) {
                cancelTooltips(it3.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.activity.OnBackPressedCallback, com.yandex.div.core.tooltip.DivTooltipController$createOnBackPressCallback$1] */
    private C39741 createOnBackPressCallback(final DivTooltip divTooltip, final Div2View div2View) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (!this.accessibilityStateProvider.isAccessibilityEnabled(div2View.getContext())) {
            return null;
        }
        ?? r10 = new OnBackPressedCallback() { // from class: com.yandex.div.core.tooltip.DivTooltipController.createOnBackPressCallback.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                DivTooltipController.this.hideTooltip(divTooltip.f49844g, div2View);
            }
        };
        OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = ViewTreeOnBackPressedDispatcherOwner.get(div2View);
        if (onBackPressedDispatcherOwner != null && (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) != 0) {
            onBackPressedDispatcher.addCallback(r10);
            return r10;
        }
        DivActionTypedUtilsKt.logError(div2View, new AssertionError("Can't find onBackPressedDispatcher to set on back press listener on tooltip."));
        Assert.fail("Can't find onBackPressedDispatcher to set on back press listener on tooltip.");
        r rVar = r.f64562a;
        return r10;
    }

    public static /* synthetic */ void showTooltip$default(DivTooltipController divTooltipController, String str, BindingContext bindingContext, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTooltip");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        divTooltipController.showTooltip(str, bindingContext, z10);
    }

    private void stopVisibilityTracking(BindingContext bindingContext, Div div) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), null, div, null, null, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryShowTooltip(final View view, final DivTooltip divTooltip, final BindingContext bindingContext, final boolean z10) {
        final Div2View divView = bindingContext.getDivView();
        if (this.tooltipRestrictor.canShowTooltip(divView, view, divTooltip, z10)) {
            final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
            final Div div = divTooltip.f49842e;
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            int layoutParamsSize$default = DivUtilKt.toLayoutParamsSize$default(divTooltip.f49842e.b().getWidth(), displayMetrics, expressionResolver, null, 4, null);
            int layoutParamsSize$default2 = DivUtilKt.toLayoutParamsSize$default(divTooltip.f49842e.b().getHeight(), displayMetrics, expressionResolver, null, 4, null);
            final DivTooltipContainer divTooltipContainerBuildTooltipView = this.divTooltipViewBuilder.buildTooltipView(bindingContext, div, layoutParamsSize$default, layoutParamsSize$default2);
            final View tooltipView = divTooltipContainerBuildTooltipView.getTooltipView();
            if (tooltipView == null) {
                return;
            }
            final SafePopupWindow safePopupWindowInvoke = this.createPopup.invoke(divTooltipContainerBuildTooltipView, Integer.valueOf(layoutParamsSize$default), Integer.valueOf(layoutParamsSize$default2));
            safePopupWindowInvoke.setTouchable(true);
            safePopupWindowInvoke.setOutsideTouchable(DivTooltipControllerKt.shouldDismissByOutsideTouch(divTooltip, expressionResolver));
            if (Build.VERSION.SDK_INT >= 29) {
                safePopupWindowInvoke.setFocusable(true);
                safePopupWindowInvoke.setTouchModal(DivTooltipControllerKt.isModal(divTooltip));
            } else {
                safePopupWindowInvoke.setFocusable(DivTooltipControllerKt.isModal(divTooltip));
            }
            safePopupWindowInvoke.setTouchInterceptor(new PopupWindowTouchListener(safePopupWindowInvoke, tooltipView, DivTooltipControllerKt.isModal(divTooltip), safePopupWindowInvoke.isOutsideTouchable(), divTooltip.f49848k, bindingContext));
            DivTooltipAnimationKt.setupAnimation(safePopupWindowInvoke, divTooltip, expressionResolver);
            final TooltipData tooltipData = new TooltipData(divTooltip.f49844g, bindingContext, div, safePopupWindowInvoke, null, createOnBackPressCallback(divTooltip, divView), false, 64, null);
            safePopupWindowInvoke.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.yandex.div.core.tooltip.a
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    DivTooltipController.tryShowTooltip$lambda$15(this.f45808b, divTooltip, bindingContext, divTooltipContainerBuildTooltipView, divView, view, safePopupWindowInvoke, tooltipData);
                }
            });
            this.tooltips.put(divTooltip.f49844g, tooltipData);
            DivPreloader.Ticket ticketPreload = this.divPreloader.preload(div, expressionResolver, new DivPreloader.Callback() { // from class: com.yandex.div.core.tooltip.b
                @Override // com.yandex.div.core.DivPreloader.Callback
                public final void finish(boolean z11) {
                    DivTooltipController.tryShowTooltip$lambda$18(tooltipData, view, this, divView, divTooltip, z10, divTooltipContainerBuildTooltipView, safePopupWindowInvoke, tooltipView, expressionResolver, bindingContext, div, z11);
                }
            });
            TooltipData tooltipData2 = this.tooltips.get(divTooltip.f49844g);
            if (tooltipData2 == null) {
                return;
            }
            tooltipData2.setTicket(ticketPreload);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowTooltip$lambda$15(DivTooltipController divTooltipController, DivTooltip divTooltip, BindingContext bindingContext, DivTooltipContainer divTooltipContainer, Div2View div2View, View view, SafePopupWindow safePopupWindow, TooltipData tooltipData) {
        divTooltipController.tooltips.remove(divTooltip.f49844g);
        divTooltipController.stopVisibilityTracking(bindingContext, divTooltip.f49842e);
        Div div = divTooltipController.divVisibilityActionTracker.getDivWithWaitingDisappearActions().get(divTooltipContainer);
        if (div != null) {
            divTooltipController.divVisibilityActionTracker.trackDetachedView(bindingContext, divTooltipContainer, div);
        }
        DivTooltipRestrictor.DivTooltipShownCallback tooltipShownCallback = divTooltipController.tooltipRestrictor.getTooltipShownCallback();
        if (tooltipShownCallback != null) {
            tooltipShownCallback.onDivTooltipDismissed(div2View, view, divTooltip);
        }
        DivTooltipControllerKt.removeBackPressedCallback(safePopupWindow, tooltipData, divTooltipController.accessibilityStateProvider);
    }

    public View findViewWithTag(String str) {
        Set<Map.Entry<String, TooltipData>> setEntrySet = this.tooltips.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            View contentView = ((TooltipData) ((Map.Entry) it.next()).getValue()).getPopupWindow().getContentView();
            if (contentView != null) {
                arrayList.add(contentView);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View viewFindViewWithTag = ((View) it2.next()).findViewWithTag(str);
            if (viewFindViewWithTag != null) {
                return viewFindViewWithTag;
            }
        }
        return null;
    }

    public void hideTooltip(String str, Div2View div2View) {
        SafePopupWindow popupWindow;
        TooltipData tooltipData = this.tooltips.get(str);
        if (tooltipData == null || (popupWindow = tooltipData.getPopupWindow()) == null) {
            return;
        }
        popupWindow.dismiss();
    }

    public void mapTooltip(View view, List<DivTooltip> list) {
        view.setTag(R$id.div_tooltips_tag, list);
    }

    private String dismissTooltip(TooltipData tooltipData) {
        tooltipData.setDismissed(true);
        DivPreloader.Ticket ticket = tooltipData.getTicket();
        if (ticket != null) {
            ticket.cancel();
        }
        if (tooltipData.getPopupWindow().isShowing()) {
            DivTooltipAnimationKt.clearAnimation(tooltipData.getPopupWindow());
            tooltipData.getPopupWindow().dismiss();
            return null;
        }
        stopVisibilityTracking(tooltipData.getBindingContext(), tooltipData.getDiv());
        return tooltipData.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startVisibilityTracking(BindingContext bindingContext, Div div, View view) {
        stopVisibilityTracking(bindingContext, div);
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(this.divVisibilityActionTracker, bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, div, null, null, 48, null);
    }

    private void showTooltip(final BindingContext bindingContext, final DivTooltip divTooltip, final View view, final boolean z10) {
        if (this.tooltips.containsKey(divTooltip.f49844g)) {
            return;
        }
        if (ViewsKt.isActuallyLaidOut(view) && !view.isLayoutRequested()) {
            tryShowTooltip(view, divTooltip, bindingContext, z10);
        } else {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.tooltip.DivTooltipController$showTooltip$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view2.removeOnLayoutChangeListener(this);
                    this.this$0.tryShowTooltip(view, divTooltip, bindingContext, z10);
                }
            });
        }
        if (ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            return;
        }
        view.requestLayout();
    }

    public DivTooltipController(DivTooltipRestrictor divTooltipRestrictor, DivVisibilityActionTracker divVisibilityActionTracker, DivPreloader divPreloader, DivTooltipViewBuilder divTooltipViewBuilder, AccessibilityStateProvider accessibilityStateProvider, ErrorCollectors errorCollectors) {
        this(divTooltipRestrictor, divVisibilityActionTracker, divPreloader, errorCollectors, divTooltipViewBuilder, accessibilityStateProvider, new q<View, Integer, Integer, SafePopupWindow>() { // from class: com.yandex.div.core.tooltip.DivTooltipController.1
            public final SafePopupWindow invoke(View view, int i10, int i11) {
                return new DivTooltipWindow(view, i10, i11, false, 8, null);
            }

            @Override // bk.q
            public /* bridge */ /* synthetic */ SafePopupWindow invoke(View view, Integer num, Integer num2) {
                return invoke(view, num.intValue(), num2.intValue());
            }
        });
    }
}
