package com.yandex.div.evaluable.function;

import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import java.lang.Number;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import nj.b0;
import nj.q0;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbsDecimalFormat<T extends Number> extends Function {
    private static final Companion Companion = new Companion(null);
    private static final Set<Character> SUPPORTED_FORMAT_SYMBOLS = q0.j('#', '0', ',', '.');
    private final EvaluableType resultType = EvaluableType.STRING;
    private final boolean isPure = true;

    /* JADX INFO: compiled from: StringFunctions.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public abstract String format(DecimalFormat decimalFormat, T t10);

    public abstract Locale getLocale(List<? extends Object> list);

    public abstract T getValue(Object obj);

    /* JADX INFO: renamed from: throwIllegalFormatException-ec-iVKA, reason: not valid java name */
    private final Void m3328throwIllegalFormatExceptioneciVKA(Evaluable evaluable, List<? extends Object> list, Exception exc) {
        throw new EvaluableException("Failed to evaluate [" + formatCallReference(list, evaluable instanceof Evaluable.MethodCall) + "]. Incorrect format pattern.", exc);
    }

    /* JADX INFO: renamed from: throwIllegalFormatException-ec-iVKA$default, reason: not valid java name */
    public static /* synthetic */ Void m3329throwIllegalFormatExceptioneciVKA$default(AbsDecimalFormat absDecimalFormat, Evaluable evaluable, List list, Exception exc, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throwIllegalFormatException-ec-iVKA");
        }
        if ((i10 & 4) != 0) {
            exc = null;
        }
        return absDecimalFormat.m3328throwIllegalFormatExceptioneciVKA(evaluable, list, exc);
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        boolean z10 = false;
        Number value = getValue(list.get(0));
        Object obj = list.get(1);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Locale locale = getLocale(list);
        if (str.length() == 0) {
            m3329throwIllegalFormatExceptioneciVKA$default(this, evaluable, list, null, 4, null);
            throw new KotlinNothingValueException();
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (!SUPPORTED_FORMAT_SYMBOLS.contains(Character.valueOf(str.charAt(i10)))) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            m3329throwIllegalFormatExceptioneciVKA$default(this, evaluable, list, null, 4, null);
            throw new KotlinNothingValueException();
        }
        try {
            return format(new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale)), value);
        } catch (Exception e10) {
            m3328throwIllegalFormatExceptioneciVKA(evaluable, list, e10);
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return this.resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }

    private final String formatCallReference(List<? extends Object> list, boolean z10) {
        return b0.p0(b0.X(list, z10 ? 1 : 0), null, getName() + '(', ")", 0, null, new l<Object, CharSequence>() { // from class: com.yandex.div.evaluable.function.AbsDecimalFormat$formatCallReference$callReference$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final CharSequence invoke(Object obj) {
                p.j(obj, "arg");
                return EvaluableExceptionKt.toMessageFormat(obj);
            }
        }, 25, null);
    }
}
