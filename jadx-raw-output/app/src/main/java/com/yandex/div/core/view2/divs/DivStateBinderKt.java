package com.yandex.div.core.view2.divs;

import androidx.transition.Transition;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.VerticalTranslation;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAnimation;
import ik.k;

/* JADX INFO: compiled from: DivStateBinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivStateBinderKt {

    /* JADX INFO: compiled from: DivStateBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivAnimation.Name.values().length];
            try {
                iArr[DivAnimation.Name.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimation.Name.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimation.Name.NO_ANIMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final Float alphaValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(k.j((float) d10.doubleValue(), 0.0f, 1.0f));
        }
        return null;
    }

    private static final Float scaleValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(k.c((float) d10.doubleValue(), 0.0f));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4  */
    public static final Transition toTransition(DivAnimation divAnimation, boolean z10, ExpressionResolver expressionResolver) {
        Float fTranslateValue;
        Float fTranslateValue2;
        Float fScaleValue;
        Float fAlphaValue;
        int i10 = WhenMappings.$EnumSwitchMapping$0[divAnimation.f46439e.evaluate(expressionResolver).ordinal()];
        Transition verticalTranslation = null;
        if (i10 != 1) {
            if (i10 == 2) {
                if (z10) {
                    Expression<Double> expression = divAnimation.f46442h;
                    fScaleValue = scaleValue(expression != null ? expression.evaluate(expressionResolver) : null);
                } else {
                    Expression<Double> expression2 = divAnimation.f46436b;
                    fScaleValue = scaleValue(expression2 != null ? expression2.evaluate(expressionResolver) : null);
                }
                verticalTranslation = new Scale(fScaleValue != null ? fScaleValue.floatValue() : 1.0f, 0.0f, 0.0f, 6, null);
            } else if (i10 != 3) {
                if (z10) {
                    Expression<Double> expression3 = divAnimation.f46442h;
                    fAlphaValue = alphaValue(expression3 != null ? expression3.evaluate(expressionResolver) : null);
                } else {
                    Expression<Double> expression4 = divAnimation.f46436b;
                    fAlphaValue = alphaValue(expression4 != null ? expression4.evaluate(expressionResolver) : null);
                }
                Fade fade = new Fade(fAlphaValue != null ? fAlphaValue.floatValue() : 1.0f);
                fade.setMode(z10 ? 1 : 2);
                verticalTranslation = fade;
            }
        } else {
            if (z10) {
                Expression<Double> expression5 = divAnimation.f46442h;
                if (expression5 != null) {
                    fTranslateValue = translateValue(Double.valueOf(expression5.evaluate(expressionResolver).doubleValue()));
                } else {
                    fTranslateValue = null;
                }
            } else {
                Expression<Double> expression6 = divAnimation.f46436b;
                if (expression6 != null) {
                    fTranslateValue = translateValue(Double.valueOf(expression6.evaluate(expressionResolver).doubleValue()));
                } else {
                    fTranslateValue = null;
                }
            }
            if (z10) {
                Expression<Double> expression7 = divAnimation.f46436b;
                fTranslateValue2 = translateValue(expression7 != null ? expression7.evaluate(expressionResolver) : null);
            } else {
                Expression<Double> expression8 = divAnimation.f46442h;
                fTranslateValue2 = translateValue(expression8 != null ? expression8.evaluate(expressionResolver) : null);
            }
            verticalTranslation = new VerticalTranslation(fTranslateValue != null ? fTranslateValue.floatValue() : -1.0f, fTranslateValue2 != null ? fTranslateValue2.floatValue() : 0.0f);
        }
        return verticalTranslation;
    }

    private static final Float translateValue(Double d10) {
        if (d10 != null) {
            return Float.valueOf(k.j((float) d10.doubleValue(), -1.0f, 1.0f));
        }
        return null;
    }
}
