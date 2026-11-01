package com.yandex.div.evaluable.function;

import bk.l;
import ck.p;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import java.util.List;
import kotlin.text.Regex;
import lk.i;
import nj.r;

/* JADX INFO: compiled from: StringFunctions.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class EncodeRegex extends Function {
    private static final List<FunctionArgument> declaredArgs;
    private static final boolean isPure;
    private static final EvaluableType resultType;
    public static final EncodeRegex INSTANCE = new EncodeRegex();
    private static final String name = "encodeRegex";

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        declaredArgs = r.e(new FunctionArgument(evaluableType, false, 2, null));
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
        p.h(obj, "null cannot be cast to non-null type kotlin.String");
        return new Regex("[.*+?^${}()|\\[\\]\\\\]").replace((String) obj, new l<i, CharSequence>() { // from class: com.yandex.div.evaluable.function.EncodeRegex$evaluate$1
            @Override // bk.l
            public final CharSequence invoke(i iVar) {
                p.j(iVar, "it");
                return '\\' + iVar.getValue();
            }
        });
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

    private EncodeRegex() {
    }
}
