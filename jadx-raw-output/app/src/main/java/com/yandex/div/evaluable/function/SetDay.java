package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.List;
import kotlin.KotlinNothingValueException;
import nj.s;

/* JADX INFO: compiled from: DateTimeFunctions.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class SetDay extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final SetDay INSTANCE = new SetDay();
    private static final String name = "setDay";

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null));
        resultType = evaluableType;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) throws EvaluableException {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.DateTime");
        DateTime dateTime = (DateTime) obj;
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) obj2).longValue();
        Calendar calendar = DateTimeFunctionsKt.toCalendar(dateTime);
        if (1 <= jLongValue && jLongValue <= ((long) calendar.getActualMaximum(5))) {
            calendar.set(5, (int) jLongValue);
        } else {
            if (jLongValue != -1) {
                EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), list, "Unable to set day " + jLongValue + " for date " + dateTime + '.', null, 8, null);
                throw new KotlinNothingValueException();
            }
            calendar.set(5, 0);
        }
        return new DateTime(calendar.getTimeInMillis(), dateTime.getTimezone$div_evaluable());
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

    private SetDay() {
    }
}
