package com.yandex.div.evaluable;

import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import ik.k;
import java.util.List;
import nj.b0;
import nj.s;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Function.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class Function {
    public static final Companion Companion = new Companion(null);
    public static final Function STUB = new Function() { // from class: com.yandex.div.evaluable.Function$Companion$STUB$1
        private final String name = "stub";
        private final List<FunctionArgument> declaredArgs = s.k();
        private final EvaluableType resultType = EvaluableType.BOOLEAN;
        private final boolean isPure = true;

        @Override // com.yandex.div.evaluable.Function
        /* JADX INFO: renamed from: evaluate-ex6DHhM */
        public Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
            p.j(evaluationContext, "evaluationContext");
            p.j(evaluable, "expressionContext");
            p.j(list, "args");
            return Boolean.TRUE;
        }

        @Override // com.yandex.div.evaluable.Function
        public List<FunctionArgument> getDeclaredArgs() {
            return this.declaredArgs;
        }

        @Override // com.yandex.div.evaluable.Function
        public String getName() {
            return this.name;
        }

        @Override // com.yandex.div.evaluable.Function
        public EvaluableType getResultType() {
            return this.resultType;
        }

        @Override // com.yandex.div.evaluable.Function
        public boolean isPure() {
            return this.isPure;
        }
    };

    /* JADX INFO: compiled from: Function.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Function.kt */
    public static abstract class MatchResult {

        /* JADX INFO: compiled from: Function.kt */
        public static final class ArgCountMismatch extends MatchResult {
            private final int expected;

            public ArgCountMismatch(int i10) {
                super(null);
                this.expected = i10;
            }

            public final int getExpected() {
                return this.expected;
            }
        }

        /* JADX INFO: compiled from: Function.kt */
        public static final class ArgTypeMismatch extends MatchResult {
            private final EvaluableType actual;
            private final EvaluableType expected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ArgTypeMismatch(EvaluableType evaluableType, EvaluableType evaluableType2) {
                super(null);
                p.j(evaluableType, "expected");
                p.j(evaluableType2, "actual");
                this.expected = evaluableType;
                this.actual = evaluableType2;
            }

            public final EvaluableType getActual() {
                return this.actual;
            }

            public final EvaluableType getExpected() {
                return this.expected;
            }
        }

        /* JADX INFO: compiled from: Function.kt */
        public static final class Ok extends MatchResult {
            public static final Ok INSTANCE = new Ok();

            private Ok() {
                super(null);
            }
        }

        private MatchResult() {
        }

        public /* synthetic */ MatchResult(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Function.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EvaluableType.values().length];
            try {
                iArr[EvaluableType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public abstract Object mo3298evaluateex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list);

    public abstract List<FunctionArgument> getDeclaredArgs();

    public abstract String getName();

    public abstract EvaluableType getResultType();

    public abstract boolean isPure();

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canCastTo(EvaluableType evaluableType, EvaluableType evaluableType2) {
        return evaluableType == EvaluableType.INTEGER && WhenMappings.$EnumSwitchMapping$0[evaluableType2.ordinal()] == 1;
    }

    /* JADX INFO: renamed from: invoke-ex6DHhM, reason: not valid java name */
    public final Object m3327invokeex6DHhM(EvaluationContext evaluationContext, Evaluable evaluable, List<? extends Object> list) {
        EvaluableType evaluableType;
        EvaluableType evaluableType2;
        p.j(evaluationContext, "evaluationContext");
        p.j(evaluable, "expressionContext");
        p.j(list, "args");
        Object objMo3298evaluateex6DHhM = mo3298evaluateex6DHhM(evaluationContext, evaluable, list);
        EvaluableType.Companion companion = EvaluableType.Companion;
        boolean z10 = objMo3298evaluateex6DHhM instanceof Long;
        if (z10) {
            evaluableType = EvaluableType.INTEGER;
        } else if (objMo3298evaluateex6DHhM instanceof Double) {
            evaluableType = EvaluableType.NUMBER;
        } else if (objMo3298evaluateex6DHhM instanceof Boolean) {
            evaluableType = EvaluableType.BOOLEAN;
        } else if (objMo3298evaluateex6DHhM instanceof String) {
            evaluableType = EvaluableType.STRING;
        } else if (objMo3298evaluateex6DHhM instanceof DateTime) {
            evaluableType = EvaluableType.DATETIME;
        } else if (objMo3298evaluateex6DHhM instanceof Color) {
            evaluableType = EvaluableType.COLOR;
        } else if (objMo3298evaluateex6DHhM instanceof Url) {
            evaluableType = EvaluableType.URL;
        } else if (objMo3298evaluateex6DHhM instanceof JSONObject) {
            evaluableType = EvaluableType.DICT;
        } else {
            if (!(objMo3298evaluateex6DHhM instanceof JSONArray)) {
                if (objMo3298evaluateex6DHhM == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to find type for ");
                p.g(objMo3298evaluateex6DHhM);
                sb2.append(objMo3298evaluateex6DHhM.getClass().getName());
                throw new EvaluableException(sb2.toString(), null, 2, null);
            }
            evaluableType = EvaluableType.ARRAY;
        }
        if (evaluableType == getResultType()) {
            return objMo3298evaluateex6DHhM;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Function ");
        sb3.append(this);
        sb3.append(" returned ");
        if (z10) {
            evaluableType2 = EvaluableType.INTEGER;
        } else if (objMo3298evaluateex6DHhM instanceof Double) {
            evaluableType2 = EvaluableType.NUMBER;
        } else if (objMo3298evaluateex6DHhM instanceof Boolean) {
            evaluableType2 = EvaluableType.BOOLEAN;
        } else if (objMo3298evaluateex6DHhM instanceof String) {
            evaluableType2 = EvaluableType.STRING;
        } else if (objMo3298evaluateex6DHhM instanceof DateTime) {
            evaluableType2 = EvaluableType.DATETIME;
        } else if (objMo3298evaluateex6DHhM instanceof Color) {
            evaluableType2 = EvaluableType.COLOR;
        } else if (objMo3298evaluateex6DHhM instanceof Url) {
            evaluableType2 = EvaluableType.URL;
        } else if (objMo3298evaluateex6DHhM instanceof JSONObject) {
            evaluableType2 = EvaluableType.DICT;
        } else {
            if (!(objMo3298evaluateex6DHhM instanceof JSONArray)) {
                if (objMo3298evaluateex6DHhM == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unable to find type for ");
                p.g(objMo3298evaluateex6DHhM);
                sb4.append(objMo3298evaluateex6DHhM.getClass().getName());
                throw new EvaluableException(sb4.toString(), null, 2, null);
            }
            evaluableType2 = EvaluableType.ARRAY;
        }
        sb3.append(evaluableType2);
        sb3.append(", but ");
        sb3.append(getResultType());
        sb3.append(" was expected.");
        throw new EvaluableException(sb3.toString(), null, 2, null);
    }

    public final MatchResult matchesArguments$div_evaluable(List<? extends EvaluableType> list) {
        p.j(list, "argTypes");
        return matchesArguments(list, new bk.p<EvaluableType, EvaluableType, Boolean>() { // from class: com.yandex.div.evaluable.Function.matchesArguments.1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Boolean mo1invoke(EvaluableType evaluableType, EvaluableType evaluableType2) {
                p.j(evaluableType, "type");
                p.j(evaluableType2, "declaredType");
                return Boolean.valueOf(evaluableType == evaluableType2);
            }
        });
    }

    public final MatchResult matchesArgumentsWithCast$div_evaluable(List<? extends EvaluableType> list) {
        p.j(list, "argTypes");
        return matchesArguments(list, new bk.p<EvaluableType, EvaluableType, Boolean>() { // from class: com.yandex.div.evaluable.Function$matchesArgumentsWithCast$1
            {
                super(2);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Boolean mo1invoke(EvaluableType evaluableType, EvaluableType evaluableType2) {
                p.j(evaluableType, "type");
                p.j(evaluableType2, "declaredType");
                return Boolean.valueOf(evaluableType == evaluableType2 || this.this$0.canCastTo(evaluableType, evaluableType2));
            }
        });
    }

    private final MatchResult matchesArguments(List<? extends EvaluableType> list, bk.p<? super EvaluableType, ? super EvaluableType, Boolean> pVar) {
        int size;
        int size2 = getDeclaredArgs().size();
        if (getHasVarArg$div_evaluable()) {
            size = Integer.MAX_VALUE;
        } else {
            size = getDeclaredArgs().size();
        }
        if (list.size() >= size2 && list.size() <= size) {
            int size3 = list.size();
            for (int i10 = 0; i10 < size3; i10++) {
                EvaluableType type = getDeclaredArgs().get(k.g(i10, s.m(getDeclaredArgs()))).getType();
                if (!pVar.mo1invoke(list.get(i10), type).booleanValue()) {
                    return new MatchResult.ArgTypeMismatch(type, list.get(i10));
                }
            }
            return MatchResult.Ok.INSTANCE;
        }
        return new MatchResult.ArgCountMismatch(size2);
    }

    public final boolean getHasVarArg$div_evaluable() {
        FunctionArgument functionArgument = (FunctionArgument) b0.s0(getDeclaredArgs());
        if (functionArgument != null) {
            return functionArgument.isVariadic();
        }
        return false;
    }

    public String toString() {
        return b0.p0(getDeclaredArgs(), null, getName() + '(', ")", 0, null, new l<FunctionArgument, CharSequence>() { // from class: com.yandex.div.evaluable.Function.toString.1
            @Override // bk.l
            public final CharSequence invoke(FunctionArgument functionArgument) {
                p.j(functionArgument, "arg");
                if (!functionArgument.isVariadic()) {
                    return functionArgument.getType().toString();
                }
                return "vararg " + functionArgument.getType();
            }
        }, 25, null);
    }
}
