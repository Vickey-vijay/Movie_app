package com.yandex.div.core.util;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import ck.p;
import com.yandex.div.core.animation.EaseInInterpolator;
import com.yandex.div.core.animation.EaseInOutInterpolator;
import com.yandex.div.core.animation.EaseInterpolator;
import com.yandex.div.core.animation.EaseOutInterpolator;
import com.yandex.div.core.animation.ReverseInterpolatorKt;
import com.yandex.div.core.animation.SpringInterpolator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.drawable.CircleDrawable;
import com.yandex.div.internal.drawable.RoundedRectDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import com.yandex.div2.DivAspect;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivContentAlignmentHorizontal;
import com.yandex.div2.DivContentAlignmentVertical;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivDisappearAction;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeDrawable;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivState;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivVisibilityAction;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nj.b0;
import nj.r;
import nj.s;
import oe.c9;
import oe.e2;

/* JADX INFO: compiled from: DivUtil.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivUtilKt {

    /* JADX INFO: compiled from: DivUtil.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[DivAnimationInterpolator.values().length];
            try {
                iArr[DivAnimationInterpolator.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAnimationInterpolator.EASE_IN_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivAnimationInterpolator.SPRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivAnimationDirection.values().length];
            try {
                iArr2[DivAnimationDirection.REVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DivAnimationDirection.ALTERNATE_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DivAnimationDirection.ALTERNATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr3[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivAlignmentVertical.values().length];
            try {
                iArr4[DivAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[DivAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[DivAlignmentVertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[DivContentAlignmentHorizontal.values().length];
            try {
                iArr5[DivContentAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_AROUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[DivContentAlignmentHorizontal.SPACE_EVENLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[DivContentAlignmentVertical.values().length];
            try {
                iArr6[DivContentAlignmentVertical.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[DivContentAlignmentVertical.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr6[DivContentAlignmentVertical.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_BETWEEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr6[DivContentAlignmentVertical.SPACE_EVENLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr6[DivContentAlignmentVertical.BASELINE.ordinal()] = 7;
            } catch (NoSuchFieldError unused32) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[DivBlendMode.values().length];
            try {
                iArr7[DivBlendMode.SOURCE_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[DivBlendMode.SOURCE_ATOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr7[DivBlendMode.DARKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr7[DivBlendMode.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr7[DivBlendMode.MULTIPLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr7[DivBlendMode.SCREEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[DivImageScale.values().length];
            try {
                iArr8[DivImageScale.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr8[DivImageScale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr8[DivImageScale.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr8[DivImageScale.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused42) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public static final int evaluateGravity(DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        int i10 = divAlignmentHorizontal == null ? -1 : WhenMappings.$EnumSwitchMapping$2[divAlignmentHorizontal.ordinal()];
        int i11 = GravityCompat.START;
        if (i10 == 1) {
            i11 = 3;
        } else if (i10 == 2) {
            i11 = 1;
        } else if (i10 == 3) {
            i11 = 5;
        } else if (i10 != 4 && i10 == 5) {
            i11 = GravityCompat.END;
        }
        int i12 = divAlignmentVertical != null ? WhenMappings.$EnumSwitchMapping$3[divAlignmentVertical.ordinal()] : -1;
        int i13 = 48;
        if (i12 != 1) {
            if (i12 == 2) {
                i13 = 16;
            } else if (i12 == 3) {
                i13 = 80;
            }
        }
        return i13 | i11;
    }

    public static final Drawable toDrawable(DivDrawable divDrawable, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divDrawable instanceof DivDrawable.b) {
            return toDrawable(((DivDrawable.b) divDrawable).c(), displayMetrics, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toLayoutParamsSize(DivSize divSize, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams) {
        if (divSize == null) {
            return -2;
        }
        if (divSize instanceof DivSize.c) {
            return -1;
        }
        if (divSize instanceof DivSize.b) {
            return BaseDivViewExtensionsKt.toPx(((DivSize.b) divSize).c(), displayMetrics, expressionResolver);
        }
        if (!(divSize instanceof DivSize.d)) {
            throw new NoWhenBranchMatchedException();
        }
        Expression<Boolean> expression = ((DivSize.d) divSize).c().f50125a;
        return ((expression != null && expression.evaluate(expressionResolver).booleanValue()) && (layoutParams instanceof DivLayoutParams)) ? -3 : -2;
    }

    public static final Interpolator androidInterpolator(DivAnimationInterpolator divAnimationInterpolator, boolean z10) {
        return z10 ? ReverseInterpolatorKt.reversed(getAndroidInterpolator(divAnimationInterpolator)) : getAndroidInterpolator(divAnimationInterpolator);
    }

    private static final boolean canWrap(DivSize divSize, ExpressionResolver expressionResolver) {
        if (divSize instanceof DivSize.d) {
            Expression<Boolean> expression = ((DivSize.d) divSize).c().f50125a;
            if (!(expression != null && expression.evaluate(expressionResolver).booleanValue())) {
                return false;
            }
        }
        return true;
    }

    public static final Interpolator getAndroidInterpolator(DivAnimationInterpolator divAnimationInterpolator) {
        switch (WhenMappings.$EnumSwitchMapping$0[divAnimationInterpolator.ordinal()]) {
            case 1:
                return new LinearInterpolator();
            case 2:
                return new EaseInterpolator();
            case 3:
                return new EaseInInterpolator();
            case 4:
                return new EaseOutInterpolator();
            case 5:
                return new EaseInOutInterpolator();
            case 6:
                return new SpringInterpolator();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final float[] getCornerRadii(DivBorder divBorder, float f10, float f11, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Expression<Long> expression;
        Expression<Long> expression2;
        Expression<Long> expression3;
        Expression<Long> expression4;
        DivCornersRadius divCornersRadius = divBorder.f46538b;
        if (divCornersRadius == null || (expression = divCornersRadius.f46838c) == null) {
            expression = divBorder.f46537a;
        }
        float fDpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics);
        DivCornersRadius divCornersRadius2 = divBorder.f46538b;
        if (divCornersRadius2 == null || (expression2 = divCornersRadius2.f46839d) == null) {
            expression2 = divBorder.f46537a;
        }
        float fDpToPx2 = BaseDivViewExtensionsKt.dpToPx(expression2 != null ? expression2.evaluate(expressionResolver) : null, displayMetrics);
        DivCornersRadius divCornersRadius3 = divBorder.f46538b;
        if (divCornersRadius3 == null || (expression3 = divCornersRadius3.f46836a) == null) {
            expression3 = divBorder.f46537a;
        }
        float fDpToPx3 = BaseDivViewExtensionsKt.dpToPx(expression3 != null ? expression3.evaluate(expressionResolver) : null, displayMetrics);
        DivCornersRadius divCornersRadius4 = divBorder.f46538b;
        if (divCornersRadius4 == null || (expression4 = divCornersRadius4.f46837b) == null) {
            expression4 = divBorder.f46537a;
        }
        float fDpToPx4 = BaseDivViewExtensionsKt.dpToPx(expression4 != null ? expression4.evaluate(expressionResolver) : null, displayMetrics);
        Float f12 = (Float) Collections.min(s.n(Float.valueOf(f10 / (fDpToPx + fDpToPx2)), Float.valueOf(f10 / (fDpToPx3 + fDpToPx4)), Float.valueOf(f11 / (fDpToPx + fDpToPx3)), Float.valueOf(f11 / (fDpToPx2 + fDpToPx4))));
        if (f12.floatValue() > 0.0f && f12.floatValue() < 1.0f) {
            fDpToPx *= f12.floatValue();
            fDpToPx2 *= f12.floatValue();
            fDpToPx3 *= f12.floatValue();
            fDpToPx4 *= f12.floatValue();
        }
        return new float[]{fDpToPx, fDpToPx, fDpToPx2, fDpToPx2, fDpToPx4, fDpToPx4, fDpToPx3, fDpToPx3};
    }

    public static final DivState.State getDefaultState(DivState divState, ExpressionResolver expressionResolver) {
        Object next;
        Expression<String> expression = divState.f49032n;
        if (expression != null) {
            Iterator<T> it = divState.I.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p.e(((DivState.State) next).f49050d, expression.evaluate(expressionResolver)));
            DivState.State state = (DivState.State) next;
            if (state != null) {
                return state;
            }
        }
        return (DivState.State) b0.h0(divState.I);
    }

    public static final String getType(Div div) {
        if (div instanceof Div.q) {
            return "text";
        }
        if (div instanceof Div.g) {
            return "image";
        }
        if (div instanceof Div.e) {
            return "gif";
        }
        if (div instanceof Div.l) {
            return "separator";
        }
        if (div instanceof Div.h) {
            return "indicator";
        }
        if (div instanceof Div.m) {
            return "slider";
        }
        if (div instanceof Div.i) {
            return "input";
        }
        if (div instanceof Div.r) {
            return "video";
        }
        if (div instanceof Div.b) {
            return "container";
        }
        if (div instanceof Div.f) {
            return "grid";
        }
        if (div instanceof Div.n) {
            return "state";
        }
        if (div instanceof Div.d) {
            return "gallery";
        }
        if (div instanceof Div.j) {
            return "pager";
        }
        if (div instanceof Div.p) {
            return "tabs";
        }
        if (div instanceof Div.c) {
            return "custom";
        }
        if (div instanceof Div.k) {
            return "select";
        }
        if (div instanceof Div.o) {
            return "switch";
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final float getWidthPxF(DivStroke divStroke, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.unitToPxF(divStroke.f49134d.evaluate(expressionResolver), displayMetrics, divStroke.f49133c.evaluate(expressionResolver));
    }

    public static final boolean isAlternated(DivAnimationDirection divAnimationDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[divAnimationDirection.ordinal()];
        return i10 == 2 || i10 == 3;
    }

    public static final boolean isBranch(Div div) {
        if ((div instanceof Div.q) || (div instanceof Div.g) || (div instanceof Div.e) || (div instanceof Div.l) || (div instanceof Div.h) || (div instanceof Div.m) || (div instanceof Div.i) || (div instanceof Div.c) || (div instanceof Div.k) || (div instanceof Div.r) || (div instanceof Div.o)) {
            return false;
        }
        if ((div instanceof Div.b) || (div instanceof Div.f) || (div instanceof Div.d) || (div instanceof Div.j) || (div instanceof Div.p) || (div instanceof Div.n)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isHorizontal(DivContainer divContainer, ExpressionResolver expressionResolver) {
        return divContainer.I.evaluate(expressionResolver) == DivContainer.Orientation.HORIZONTAL;
    }

    public static final boolean isReversed(DivAnimationDirection divAnimationDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[divAnimationDirection.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public static final boolean isWrapContainer(DivContainer divContainer, ExpressionResolver expressionResolver) {
        if (divContainer.C.evaluate(expressionResolver) == DivContainer.LayoutMode.WRAP && divContainer.I.evaluate(expressionResolver) != DivContainer.Orientation.OVERLAP) {
            if (isHorizontal(divContainer, expressionResolver)) {
                return canWrap(divContainer.getWidth(), expressionResolver);
            }
            if (canWrap(divContainer.getHeight(), expressionResolver)) {
                return true;
            }
            DivAspect divAspect = divContainer.f46719i;
            if (divAspect != null) {
                return true ^ (((float) divAspect.f46506a.evaluate(expressionResolver).doubleValue()) == 0.0f);
            }
        }
        return false;
    }

    public static final DivAlignmentHorizontal toAlignmentHorizontal(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
        int i10 = WhenMappings.$EnumSwitchMapping$4[divContentAlignmentHorizontal.ordinal()];
        if (i10 == 1) {
            return DivAlignmentHorizontal.LEFT;
        }
        if (i10 == 2) {
            return DivAlignmentHorizontal.CENTER;
        }
        if (i10 == 3) {
            return DivAlignmentHorizontal.RIGHT;
        }
        if (i10 != 4) {
            return i10 != 5 ? DivAlignmentHorizontal.START : DivAlignmentHorizontal.END;
        }
        return DivAlignmentHorizontal.START;
    }

    public static final DivAlignmentVertical toAlignmentVertical(DivContentAlignmentVertical divContentAlignmentVertical) {
        int i10 = WhenMappings.$EnumSwitchMapping$5[divContentAlignmentVertical.ordinal()];
        if (i10 == 1) {
            return DivAlignmentVertical.TOP;
        }
        if (i10 == 2) {
            return DivAlignmentVertical.CENTER;
        }
        if (i10 != 3) {
            return i10 != 7 ? DivAlignmentVertical.TOP : DivAlignmentVertical.BASELINE;
        }
        return DivAlignmentVertical.BOTTOM;
    }

    public static final Drawable toDrawable(DivShapeDrawable divShapeDrawable, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        Drawable circleDrawable;
        Expression<Integer> expression;
        Expression<Integer> expression2;
        DivShape divShape = divShapeDrawable.f48789b;
        if (divShape instanceof DivShape.c) {
            DivShape.c cVar = (DivShape.c) divShape;
            float pxF = BaseDivViewExtensionsKt.toPxF(cVar.c().f48518d, displayMetrics, expressionResolver);
            float pxF2 = BaseDivViewExtensionsKt.toPxF(cVar.c().f48517c, displayMetrics, expressionResolver);
            Expression<Integer> expression3 = cVar.c().f48515a;
            if (expression3 == null) {
                expression3 = divShapeDrawable.f48788a;
            }
            int iIntValue = expression3.evaluate(expressionResolver).intValue();
            float pxF3 = BaseDivViewExtensionsKt.toPxF(cVar.c().f48516b, displayMetrics, expressionResolver);
            DivStroke divStroke = cVar.c().f48519e;
            if (divStroke == null) {
                divStroke = divShapeDrawable.f48790c;
            }
            Integer numEvaluate = (divStroke == null || (expression2 = divStroke.f49131a) == null) ? null : expression2.evaluate(expressionResolver);
            DivStroke divStroke2 = cVar.c().f48519e;
            if (divStroke2 == null) {
                divStroke2 = divShapeDrawable.f48790c;
            }
            circleDrawable = new RoundedRectDrawable(new RoundedRectDrawable.Params(pxF, pxF2, iIntValue, pxF3, numEvaluate, divStroke2 != null ? Float.valueOf(getWidthPxF(divStroke2, displayMetrics, expressionResolver)) : null));
        } else {
            if (!(divShape instanceof DivShape.a)) {
                return null;
            }
            DivShape.a aVar = (DivShape.a) divShape;
            float pxF4 = BaseDivViewExtensionsKt.toPxF(aVar.c().f46599b, displayMetrics, expressionResolver);
            Expression<Integer> expression4 = aVar.c().f46598a;
            if (expression4 == null) {
                expression4 = divShapeDrawable.f48788a;
            }
            int iIntValue2 = expression4.evaluate(expressionResolver).intValue();
            DivStroke divStroke3 = aVar.c().f46600c;
            if (divStroke3 == null) {
                divStroke3 = divShapeDrawable.f48790c;
            }
            Integer numEvaluate2 = (divStroke3 == null || (expression = divStroke3.f49131a) == null) ? null : expression.evaluate(expressionResolver);
            DivStroke divStroke4 = aVar.c().f46600c;
            if (divStroke4 == null) {
                divStroke4 = divShapeDrawable.f48790c;
            }
            circleDrawable = new CircleDrawable(new CircleDrawable.Params(pxF4, iIntValue2, numEvaluate2, divStroke4 != null ? Float.valueOf(getWidthPxF(divStroke4, displayMetrics, expressionResolver)) : null));
        }
        return circleDrawable;
    }

    public static final AspectImageView.Scale toImageScale(DivImageScale divImageScale) {
        int i10 = WhenMappings.$EnumSwitchMapping$7[divImageScale.ordinal()];
        if (i10 == 1) {
            return AspectImageView.Scale.NO_SCALE;
        }
        if (i10 == 2) {
            return AspectImageView.Scale.FIT;
        }
        if (i10 == 3) {
            return AspectImageView.Scale.FILL;
        }
        if (i10 == 4) {
            return AspectImageView.Scale.STRETCH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ int toLayoutParamsSize$default(DivSize divSize, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        return toLayoutParamsSize(divSize, displayMetrics, expressionResolver, layoutParams);
    }

    public static final PorterDuff.Mode toPorterDuffMode(DivBlendMode divBlendMode) {
        switch (WhenMappings.$EnumSwitchMapping$6[divBlendMode.ordinal()]) {
            case 1:
                return PorterDuff.Mode.SRC_IN;
            case 2:
                return PorterDuff.Mode.SRC_ATOP;
            case 3:
                return PorterDuff.Mode.DARKEN;
            case 4:
                return PorterDuff.Mode.LIGHTEN;
            case 5:
                return PorterDuff.Mode.MULTIPLY;
            case 6:
                return PorterDuff.Mode.SCREEN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean canBeReused(Div div, Div div2, ExpressionResolver expressionResolver) {
        if (!p.e(getType(div), getType(div2))) {
            return false;
        }
        e2 e2VarB = div.b();
        e2 e2VarB2 = div2.b();
        if ((e2VarB instanceof DivImage) && (e2VarB2 instanceof DivImage)) {
            return p.e(((DivImage) e2VarB).B.evaluate(expressionResolver), ((DivImage) e2VarB2).B.evaluate(expressionResolver));
        }
        if (e2VarB.getBackground() != e2VarB2.getBackground()) {
            return false;
        }
        return true;
    }

    public static final boolean containsStateInnerTransitions(Div div, ExpressionResolver expressionResolver) {
        e2 e2VarB = div.b();
        if (e2VarB.x() != null || e2VarB.j() != null || e2VarB.i() != null) {
            return true;
        }
        if (div instanceof Div.b) {
            List<DivItemBuilderResult> listBuildItems = DivCollectionExtensionsKt.buildItems(((Div.b) div).c(), expressionResolver);
            if (!(listBuildItems instanceof Collection) || !listBuildItems.isEmpty()) {
                for (DivItemBuilderResult divItemBuilderResult : listBuildItems) {
                    if (containsStateInnerTransitions(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver())) {
                        return true;
                    }
                }
            }
        } else if (div instanceof Div.f) {
            List<Div> nonNullItems = DivCollectionExtensionsKt.getNonNullItems(((Div.f) div).c());
            if (!(nonNullItems instanceof Collection) || !nonNullItems.isEmpty()) {
                Iterator<T> it = nonNullItems.iterator();
                while (it.hasNext()) {
                    if (containsStateInnerTransitions((Div) it.next(), expressionResolver)) {
                        return true;
                    }
                }
            }
        } else if (!(div instanceof Div.q) && !(div instanceof Div.g) && !(div instanceof Div.e) && !(div instanceof Div.l) && !(div instanceof Div.h) && !(div instanceof Div.n) && !(div instanceof Div.d) && !(div instanceof Div.j) && !(div instanceof Div.p) && !(div instanceof Div.c) && !(div instanceof Div.k) && !(div instanceof Div.m) && !(div instanceof Div.r) && !(div instanceof Div.i) && !(div instanceof Div.o)) {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public static final int evaluateGravity(DivContentAlignmentHorizontal divContentAlignmentHorizontal, DivContentAlignmentVertical divContentAlignmentVertical) {
        int i10 = divContentAlignmentHorizontal == null ? -1 : WhenMappings.$EnumSwitchMapping$4[divContentAlignmentHorizontal.ordinal()];
        int i11 = GravityCompat.START;
        switch (i10) {
            case 1:
                i11 = 3;
                break;
            case 2:
                i11 = 1;
                break;
            case 3:
                i11 = 5;
                break;
            case 5:
                i11 = GravityCompat.END;
                break;
            case 6:
                i11 = 16777216;
                break;
            case 7:
                i11 = 33554432;
                break;
            case 8:
                i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                break;
        }
        int i12 = 48;
        switch (divContentAlignmentVertical != null ? WhenMappings.$EnumSwitchMapping$5[divContentAlignmentVertical.ordinal()] : -1) {
            case 2:
                i12 = 16;
                break;
            case 3:
                i12 = 80;
                break;
            case 4:
                i12 = 268435456;
                break;
            case 5:
                i12 = 536870912;
                break;
            case 6:
                i12 = 1073741824;
                break;
        }
        return i12 | i11;
    }

    public static final List<DivVisibilityAction> getAllAppearActions(e2 e2Var) {
        List<DivVisibilityAction> listE;
        List<DivVisibilityAction> listA = e2Var.a();
        if (listA == null) {
            DivVisibilityAction divVisibilityActionV = e2Var.v();
            if (divVisibilityActionV != null) {
                listE = r.e(divVisibilityActionV);
            } else {
                listE = null;
            }
            List<DivVisibilityAction> list = listE;
            if (list == null) {
                return s.k();
            }
            return list;
        }
        return listA;
    }

    public static final List<DivDisappearAction> getAllDisappearActions(e2 e2Var) {
        List<DivDisappearAction> listK = e2Var.k();
        if (listK == null) {
            return s.k();
        }
        return listK;
    }

    public static final List<c9> getAllSightActions(e2 e2Var) {
        return b0.y0(getAllDisappearActions(e2Var), getAllAppearActions(e2Var));
    }

    public static final boolean getHasSightActions(e2 e2Var) {
        boolean z10;
        boolean z11;
        if (e2Var.v() == null) {
            List<DivVisibilityAction> listA = e2Var.a();
            if (listA != null && !listA.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                List<DivDisappearAction> listK = e2Var.k();
                if (listK != null && !listK.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean isLeaf(Div div) {
        return !isBranch(div);
    }
}
