package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.activity.OnBackPressedCallback;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewGroupKt;
import ck.p;
import com.yandex.div.R$id;
import com.yandex.div.core.util.AccessibilityStateProvider;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.DivTooltipMode;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import mj.h;

/* JADX INFO: compiled from: DivTooltipController.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTooltipControllerKt {

    /* JADX INFO: compiled from: DivTooltipController.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTooltip.Position.values().length];
            try {
                iArr[DivTooltip.Position.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTooltip.Position.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivTooltip.Position.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivTooltip.Position.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivTooltip.Position.TOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivTooltip.Position.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @VisibleForTesting
    public static final Point calcPopupLocation(View view, View view2, DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        int width;
        int height;
        DivDimension divDimension;
        DivDimension divDimension2;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int px = 0;
        Point point = new Point(iArr[0], iArr[1]);
        DivTooltip.Position positionEvaluate = divTooltip.f49847j.evaluate(expressionResolver);
        int i10 = point.x;
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        switch (iArr2[positionEvaluate.ordinal()]) {
            case 1:
            case 2:
            case 3:
                width = -view.getWidth();
                break;
            case 4:
            case 5:
            case 6:
                width = view2.getWidth();
                break;
            case 7:
            case 8:
            case 9:
                width = (view2.getWidth() - view.getWidth()) / 2;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.x = i10 + width;
        int i11 = point.y;
        switch (iArr2[positionEvaluate.ordinal()]) {
            case 1:
            case 5:
            case 9:
                height = (view2.getHeight() - view.getHeight()) / 2;
                break;
            case 2:
            case 4:
            case 7:
                height = -view.getHeight();
                break;
            case 3:
            case 6:
            case 8:
                height = view2.getHeight();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.y = i11 + height;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        int i12 = point.x;
        DivPoint divPoint = divTooltip.f49846i;
        point.x = i12 + ((divPoint == null || (divDimension2 = divPoint.f48418a) == null) ? 0 : BaseDivViewExtensionsKt.toPx(divDimension2, displayMetrics, expressionResolver));
        int i13 = point.y;
        DivPoint divPoint2 = divTooltip.f49846i;
        if (divPoint2 != null && (divDimension = divPoint2.f48419b) != null) {
            px = BaseDivViewExtensionsKt.toPx(divDimension, displayMetrics, expressionResolver);
        }
        point.y = i13 + px;
        return point;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<DivTooltip, View> findChildWithTooltip(String str, View view) {
        Object tag = view.getTag(R$id.div_tooltips_tag);
        List<DivTooltip> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (DivTooltip divTooltip : list) {
                if (p.e(divTooltip.f49844g, str)) {
                    return h.a(divTooltip, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                Pair<DivTooltip, View> pairFindChildWithTooltip = findChildWithTooltip(str, it.next());
                if (pairFindChildWithTooltip != null) {
                    return pairFindChildWithTooltip;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect getWindowFrame(Div2View div2View) {
        Rect rect = new Rect();
        div2View.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isModal(DivTooltip divTooltip) {
        return divTooltip.f49845h instanceof DivTooltipMode.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendAccessibilityEventUnchecked(int i10, View view, AccessibilityStateProvider accessibilityStateProvider) {
        if (view != null && accessibilityStateProvider.isAccessibilityEnabled(view.getContext())) {
            view.sendAccessibilityEventUnchecked(Build.VERSION.SDK_INT >= 30 ? new AccessibilityEvent(i10) : AccessibilityEvent.obtain(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldDismissByOutsideTouch(DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        return divTooltip.f49841d.evaluate(expressionResolver).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeBackPressedCallback(PopupWindow popupWindow, TooltipData tooltipData, AccessibilityStateProvider accessibilityStateProvider) {
        sendAccessibilityEventUnchecked(32, popupWindow.getContentView(), accessibilityStateProvider);
        OnBackPressedCallback onBackPressedCallback = tooltipData.getOnBackPressedCallback();
        if (onBackPressedCallback != null) {
            onBackPressedCallback.setEnabled(false);
        }
    }
}
