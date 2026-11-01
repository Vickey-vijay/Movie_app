package com.yandex.div.core.view2.divs;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SizeUnitUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
final /* synthetic */ class BaseDivViewExtensionsKt__SizeUnitUtilsKt {

    /* JADX INFO: compiled from: SizeUnitUtils.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSizeUnit.values().length];
            try {
                iArr[DivSizeUnit.DP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSizeUnit.PX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T extends Number> int dpToPx(T t10, DisplayMetrics displayMetrics) {
        return ek.b.c(BaseDivViewExtensionsKt.dpToPxF(t10, displayMetrics));
    }

    public static final <T extends Number> int spToPx(T t10, DisplayMetrics displayMetrics) {
        return ek.b.c(BaseDivViewExtensionsKt.spToPxF(t10, displayMetrics));
    }

    public static final int toPx(long j10, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPx(Long.valueOf(j10), displayMetrics);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        long j11 = j10 >> 31;
        if (j11 == 0 || j11 == -1) {
            return (int) j10;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable convert '" + j10 + "' to Int");
        }
        return j10 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final float toPxF(DivFixedSize divFixedSize, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        return BaseDivViewExtensionsKt.toPxF(divFixedSize.f47188b.evaluate(expressionResolver).longValue(), divFixedSize.f47187a.evaluate(expressionResolver), displayMetrics);
    }

    public static final <T extends Number> int unitToPx(T t10, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        return ek.b.c(BaseDivViewExtensionsKt.unitToPxF(t10, displayMetrics, divSizeUnit));
    }

    public static final int dpToPx(Long l10, DisplayMetrics displayMetrics) {
        Integer numValueOf;
        int i10;
        if (l10 != null) {
            long jLongValue = l10.longValue();
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
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        return BaseDivViewExtensionsKt.dpToPx(numValueOf, displayMetrics);
    }

    public static final <T extends Number> float dpToPxF(T t10, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, t10 != null ? t10.floatValue() : 0.0f, displayMetrics);
    }

    public static final float fontSizeToPx(long j10, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        Number numberValueOf;
        int i10 = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i10 == 1) {
            numberValueOf = Integer.valueOf(BaseDivViewExtensionsKt.dpToPx(Long.valueOf(j10), displayMetrics));
        } else if (i10 == 2) {
            numberValueOf = Integer.valueOf(BaseDivViewExtensionsKt.spToPx(Long.valueOf(j10), displayMetrics));
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            numberValueOf = Long.valueOf(j10);
        }
        return numberValueOf.floatValue();
    }

    public static final <T extends Number> float pxToDpF(T t10, DisplayMetrics displayMetrics) {
        if (Build.VERSION.SDK_INT >= 34) {
            return TypedValue.deriveDimension(1, t10 != null ? t10.floatValue() : 0.0f, displayMetrics);
        }
        return (t10 != null ? t10.floatValue() : 0.0f) / displayMetrics.density;
    }

    public static final int spToPx(Long l10, DisplayMetrics displayMetrics) {
        Integer numValueOf;
        int i10;
        if (l10 != null) {
            long jLongValue = l10.longValue();
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
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        return BaseDivViewExtensionsKt.spToPx(numValueOf, displayMetrics);
    }

    public static final <T extends Number> float spToPxF(T t10, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, t10 != null ? t10.floatValue() : 0.0f, displayMetrics);
    }

    public static final int toAndroidUnit(DivSizeUnit divSizeUnit) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final float toPxF(long j10, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divSizeUnit.ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(j10), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPxF(Long.valueOf(j10), displayMetrics);
        }
        if (i10 == 3) {
            return j10;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int unitToPx(Long l10, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        Integer numValueOf;
        int i10;
        if (l10 != null) {
            long jLongValue = l10.longValue();
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
            numValueOf = Integer.valueOf(i10);
        } else {
            numValueOf = null;
        }
        return BaseDivViewExtensionsKt.unitToPx(numValueOf, displayMetrics, divSizeUnit);
    }

    public static final <T extends Number> int pxToDp(T t10, DisplayMetrics displayMetrics) {
        return ek.b.c(BaseDivViewExtensionsKt.pxToDpF(t10, displayMetrics));
    }

    public static final <T extends Number> float unitToPxF(T t10, DisplayMetrics displayMetrics, DivSizeUnit divSizeUnit) {
        float fFloatValue;
        int androidUnit = BaseDivViewExtensionsKt.toAndroidUnit(divSizeUnit);
        if (t10 != null) {
            fFloatValue = t10.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        return TypedValue.applyDimension(androidUnit, fFloatValue, displayMetrics);
    }

    public static final int toPx(DivFixedSize divFixedSize, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divFixedSize.f47187a.evaluate(expressionResolver).ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPx(divFixedSize.f47188b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPx(divFixedSize.f47188b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 3) {
            long jLongValue = divFixedSize.f47188b.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                return (int) jLongValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            return jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toPx(DivSizeUnitValue divSizeUnitValue, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divSizeUnitValue.f48816a.evaluate(expressionResolver).ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPx(divSizeUnitValue.f48817b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPx(divSizeUnitValue.f48817b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 3) {
            long jLongValue = divSizeUnitValue.f48817b.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                return (int) jLongValue;
            }
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue + "' to Int");
            }
            return jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int toPx(DivDimension divDimension, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divDimension.f46982a.evaluate(expressionResolver).ordinal()];
        if (i10 == 1) {
            return BaseDivViewExtensionsKt.dpToPx(divDimension.f46983b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 2) {
            return BaseDivViewExtensionsKt.spToPx(divDimension.f46983b.evaluate(expressionResolver), displayMetrics);
        }
        if (i10 == 3) {
            return (int) divDimension.f46983b.evaluate(expressionResolver).doubleValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
