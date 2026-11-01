package com.yandex.div.evaluable.function;

import ck.p;
import com.google.android.material.datepicker.UtcDates;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import nj.s;

/* JADX INFO: compiled from: DateTimeFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FormatDateAsUTC extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final FormatDateAsUTC INSTANCE = new FormatDateAsUTC();
    private static final String name = "formatDateAsUTC";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = s.n(new FunctionArgument(EvaluableType.DATETIME, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.String");
        Date date = DateTimeFunctionsKt.toDate((DateTime) obj);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String) obj2, Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        String str = simpleDateFormat.format(date);
        p.i(str, "sdf.format(date)");
        return str;
    }

    @Override // com.yandex.div.evaluable.Function
    public List<FunctionArgument> getDeclaredArgs() {
        return declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    public EvaluableType getResultType() {
        return resultType;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return isPure;
    }

    private FormatDateAsUTC() {
    }
}
