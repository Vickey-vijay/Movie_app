package com.yandex.div.core.expression.variables;

import com.yandex.div.data.Variable;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivVariable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;

/* JADX INFO: compiled from: DivVariablesParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivVariablesParserKt {
    public static final Variable toVariable(DivVariable divVariable, ExpressionResolver expressionResolver) {
        if (divVariable instanceof DivVariable.b) {
            DivVariable.b bVar = (DivVariable.b) divVariable;
            return new Variable.BooleanVariable(bVar.c().f45897a, bVar.c().f45898b.evaluate(expressionResolver).booleanValue());
        }
        if (divVariable instanceof DivVariable.f) {
            DivVariable.f fVar = (DivVariable.f) divVariable;
            return new Variable.IntegerVariable(fVar.c().f50155a, fVar.c().f50156b.evaluate(expressionResolver).longValue());
        }
        if (divVariable instanceof DivVariable.g) {
            DivVariable.g gVar = (DivVariable.g) divVariable;
            return new Variable.DoubleVariable(gVar.c().f50476a, gVar.c().f50477b.evaluate(expressionResolver).doubleValue());
        }
        if (divVariable instanceof DivVariable.i) {
            DivVariable.i iVar = (DivVariable.i) divVariable;
            return new Variable.StringVariable(iVar.c().f50527a, iVar.c().f50528b.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.c) {
            DivVariable.c cVar = (DivVariable.c) divVariable;
            return new Variable.ColorVariable(cVar.c().f45913a, cVar.c().f45914b.evaluate(expressionResolver).intValue());
        }
        if (divVariable instanceof DivVariable.j) {
            DivVariable.j jVar = (DivVariable.j) divVariable;
            return new Variable.UrlVariable(jVar.c().f50543a, jVar.c().f50544b.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.e) {
            DivVariable.e eVar = (DivVariable.e) divVariable;
            return new Variable.DictVariable(eVar.c().f45943a, eVar.c().f45944b.evaluate(expressionResolver));
        }
        if (divVariable instanceof DivVariable.a) {
            DivVariable.a aVar = (DivVariable.a) divVariable;
            return new Variable.ArrayVariable(aVar.c().f45881a, aVar.c().f45882b.evaluate(expressionResolver));
        }
        if (!(divVariable instanceof DivVariable.h)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError("An operation is not implemented: Support property variables");
    }
}
