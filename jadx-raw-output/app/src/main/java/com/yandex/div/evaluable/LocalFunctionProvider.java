package com.yandex.div.evaluable;

import bk.l;
import ck.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: LocalFunctionProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class LocalFunctionProvider implements FunctionProvider {
    private final List<Function> functions;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalFunctionProvider(List<? extends Function> list) {
        p.j(list, "functions");
        this.functions = list;
    }

    private final Function findFunction(String str, l<? super Function, ? extends Function.MatchResult> lVar) {
        List<Function> list = this.functions;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Function function = (Function) next;
            if (p.e(function.getName(), str) && p.e(lVar.invoke(function), Function.MatchResult.Ok.INSTANCE)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (Function) arrayList.get(0);
        }
        throw new EvaluableException("Function " + arrayList.get(0) + " declared multiple times.", null, 2, null);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function get(String str, final List<? extends EvaluableType> list) {
        p.j(str, "name");
        p.j(list, "args");
        Function functionFindFunction = findFunction(str, new l<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.get.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public final Function.MatchResult invoke(Function function) {
                p.j(function, "$this$findFunction");
                return function.matchesArguments$div_evaluable(list);
            }
        });
        if (functionFindFunction != null) {
            return functionFindFunction;
        }
        Function functionFindFunction2 = findFunction(str, new l<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.get.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public final Function.MatchResult invoke(Function function) {
                p.j(function, "$this$findFunction");
                return function.matchesArgumentsWithCast$div_evaluable(list);
            }
        });
        if (functionFindFunction2 != null) {
            return functionFindFunction2;
        }
        throw new MissingLocalFunctionException(str, list);
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    public Function getMethod(String str, final List<? extends EvaluableType> list) {
        p.j(str, "name");
        p.j(list, "args");
        Function functionFindFunction = findFunction(str, new l<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.getMethod.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public final Function.MatchResult invoke(Function function) {
                p.j(function, "$this$findFunction");
                return function.matchesArguments$div_evaluable(list);
            }
        });
        if (functionFindFunction != null) {
            return functionFindFunction;
        }
        Function functionFindFunction2 = findFunction(str, new l<Function, Function.MatchResult>() { // from class: com.yandex.div.evaluable.LocalFunctionProvider.getMethod.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public final Function.MatchResult invoke(Function function) {
                p.j(function, "$this$findFunction");
                return function.matchesArgumentsWithCast$div_evaluable(list);
            }
        });
        if (functionFindFunction2 != null) {
            return functionFindFunction2;
        }
        throw new MissingLocalFunctionException(str, list);
    }
}
