package com.yandex.div.evaluable.function;

import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.KotlinNothingValueException;
import lk.x;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TestRegex extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final TestRegex INSTANCE = new TestRegex();
    private static final String name = "testRegex";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = s.n(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(evaluableType, false, 2, null));
        resultType = EvaluableType.BOOLEAN;
        isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object obj = list.get(0);
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = list.get(1);
        p.h(obj2, "null cannot be cast to non-null type kotlin.String");
        try {
            return Boolean.valueOf(Pattern.compile((String) obj2).matcher(str).find());
        } catch (PatternSyntaxException unused) {
            ArrayList arrayList = new ArrayList(t.v(list, 10));
            for (Object objN : list) {
                if (objN instanceof String) {
                    objN = x.N((String) objN, "\\", "\\\\", false, 4, null);
                }
                arrayList.add(objN);
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), arrayList, "Invalid regular expression.", null, 8, null);
            throw new KotlinNothingValueException();
        }
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

    private TestRegex() {
    }
}
