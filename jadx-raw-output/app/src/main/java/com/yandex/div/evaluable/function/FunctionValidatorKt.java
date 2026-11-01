package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: FunctionValidator.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FunctionValidatorKt {
    public static final Exception getFunctionArgumentsException(String str, List<? extends EvaluableType> list, boolean z10) {
        p.j(str, "name");
        p.j(list, "args");
        if (z10) {
            return getMethodArgumentsException(str, list);
        }
        if (list.isEmpty()) {
            return new EvaluableException("Function requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Function has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list) + '.', null, 2, null);
    }

    public static /* synthetic */ Exception getFunctionArgumentsException$default(String str, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return getFunctionArgumentsException(str, list, z10);
    }

    public static final Exception getMethodArgumentsException(String str, List<? extends EvaluableType> list) {
        p.j(str, "name");
        p.j(list, "args");
        if (list.size() == 1) {
            return new EvaluableException("Method requires non empty argument list.", null, 2, null);
        }
        return new EvaluableException("Method has no matching overload for given argument types: " + EvaluableExceptionKt.toMessageFormat((List<? extends Object>) list.subList(1, list.size())) + '.', null, 2, null);
    }

    public static final Function withArgumentsValidation(Function function, List<? extends EvaluableType> list) {
        p.j(function, "<this>");
        p.j(list, "args");
        Function.MatchResult matchResultMatchesArguments$div_evaluable = function.matchesArguments$div_evaluable(list);
        if (matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.Ok) {
            return function;
        }
        if (matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.ArgCountMismatch) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(function.getHasVarArg$div_evaluable() ? "At least" : "Exactly");
            sb2.append(' ');
            sb2.append(((Function.MatchResult.ArgCountMismatch) matchResultMatchesArguments$div_evaluable).getExpected());
            sb2.append(" argument(s) expected.");
            throw new EvaluableException(sb2.toString(), null, 2, null);
        }
        if (!(matchResultMatchesArguments$div_evaluable instanceof Function.MatchResult.ArgTypeMismatch)) {
            throw new NoWhenBranchMatchedException();
        }
        if (p.e(function.matchesArgumentsWithCast$div_evaluable(list), Function.MatchResult.Ok.INSTANCE)) {
            return function;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid argument type: expected ");
        Function.MatchResult.ArgTypeMismatch argTypeMismatch = (Function.MatchResult.ArgTypeMismatch) matchResultMatchesArguments$div_evaluable;
        sb3.append(argTypeMismatch.getExpected());
        sb3.append(", got ");
        sb3.append(argTypeMismatch.getActual());
        sb3.append('.');
        throw new EvaluableException(sb3.toString(), null, 2, null);
    }
}
