package com.yandex.div.core.tooltip;

import android.animation.TimeInterpolator;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.widget.PopupWindow;
import androidx.annotation.RequiresApi;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import com.yandex.div2.DivTooltip;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DivTooltipAnimation.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTooltipAnimationKt {

    /* JADX INFO: compiled from: DivTooltipAnimation.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.TRANSLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimation.Name.SET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAnimation.Name.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @RequiresApi(23)
    private static final void removeTransition(PopupWindow popupWindow) {
        popupWindow.setEnterTransition(null);
        popupWindow.setExitTransition(null);
    }

    private static final TransitionSet defaultTransition(DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new TranslateAnimation(divTooltip.f49847j.evaluate(expressionResolver), null, 2, null)).setInterpolator((TimeInterpolator) new SpringInterpolator());
    }

    public static final void setupAnimation(PopupWindow popupWindow, DivTooltip divTooltip, ExpressionResolver expressionResolver) {
        DivAnimation divAnimation = divTooltip.f49838a;
        popupWindow.setEnterTransition(divAnimation != null ? toTransition(divAnimation, divTooltip.f49847j.evaluate(expressionResolver), true, expressionResolver) : defaultTransition(divTooltip, expressionResolver));
        DivAnimation divAnimation2 = divTooltip.f49839b;
        popupWindow.setExitTransition(divAnimation2 != null ? toTransition(divAnimation2, divTooltip.f49847j.evaluate(expressionResolver), false, expressionResolver) : defaultTransition(divTooltip, expressionResolver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.transition.Fade] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.yandex.div.core.tooltip.TranslateAnimation] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.yandex.div.core.tooltip.Scale] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.transition.Transition] */
    private static final Transition toTransition(DivAnimation divAnimation, DivTooltip.Position position, boolean z10, ExpressionResolver expressionResolver) {
        ?? fade;
        Transition duration;
        switch (WhenMappings.$EnumSwitchMapping$0[divAnimation.f46439e.evaluate(expressionResolver).ordinal()]) {
            case 1:
                fade = new Fade();
                break;
            case 2:
                Expression<Double> expression = z10 ? divAnimation.f46442h : divAnimation.f46436b;
                fade = new TranslateAnimation(position, expression != null ? Float.valueOf((float) expression.evaluate(expressionResolver).doubleValue()) : null);
                break;
            case 3:
                Expression<Double> expression2 = z10 ? divAnimation.f46442h : divAnimation.f46436b;
                fade = new Scale(expression2 != null ? (float) expression2.evaluate(expressionResolver).doubleValue() : 1.0f);
                break;
            case 4:
                fade = new TransitionSet();
                List<DivAnimation> list = divAnimation.f46438d;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        fade.addTransition(toTransition((DivAnimation) it.next(), position, z10, expressionResolver));
                    }
                }
                break;
            case 5:
            case 6:
                fade = 0;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (fade == 0 || (duration = fade.setDuration(divAnimation.f46435a.evaluate(expressionResolver).longValue())) == null) {
            return null;
        }
        return duration.setInterpolator(DivUtilKt.getAndroidInterpolator(divAnimation.f46437c.evaluate(expressionResolver)));
    }

    public static final void clearAnimation(PopupWindow popupWindow) {
        removeTransition(popupWindow);
    }
}
