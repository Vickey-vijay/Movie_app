package com.yandex.div.evaluable;

import androidx.core.app.NotificationCompat;
import bk.a;
import ck.i;
import ck.p;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import com.yandex.div.evaluable.types.Url;
import ik.k;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.c;
import mj.h;
import nj.b0;
import nj.s;
import nj.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Evaluator.kt */
/* JADX INFO: loaded from: classes9.dex */
public class Evaluator {
    public static final Companion Companion = new Companion(null);
    private final EvaluationContext evaluationContext;

    /* JADX INFO: compiled from: Evaluator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        
            if (ck.p.e(r19, -1L) != false) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object evalFactor$div_evaluable(com.yandex.div.evaluable.internal.Token.Operator.Binary.Factor r17, java.lang.Object r18, java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 456
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.Evaluator.Companion.evalFactor$div_evaluable(com.yandex.div.evaluable.internal.Token$Operator$Binary$Factor, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        public final Object evalSum$div_evaluable(Token.Operator.Binary.Sum sum, Object obj, Object obj2) {
            double dDoubleValue;
            p.j(sum, "operator");
            p.j(obj, "left");
            p.j(obj2, "right");
            if ((obj instanceof String) && (obj2 instanceof String)) {
                if (!(sum instanceof Token.Operator.Binary.Sum.Plus)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(sum, obj, obj2);
                    throw new KotlinNothingValueException();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(obj2);
                return sb2.toString();
            }
            if (!(obj instanceof Long) || !(obj2 instanceof Long)) {
                if (!(obj instanceof Double) || !(obj2 instanceof Double)) {
                    EvaluableExceptionKt.throwExceptionOnEvaluationFailed(sum, obj, obj2);
                    throw new KotlinNothingValueException();
                }
                if (sum instanceof Token.Operator.Binary.Sum.Plus) {
                    dDoubleValue = ((Number) obj).doubleValue() + ((Number) obj2).doubleValue();
                } else {
                    if (!(sum instanceof Token.Operator.Binary.Sum.Minus)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dDoubleValue = ((Number) obj).doubleValue() - ((Number) obj2).doubleValue();
                }
                return Double.valueOf(dDoubleValue);
            }
            if (sum instanceof Token.Operator.Binary.Sum.Plus) {
                Number number = (Number) obj;
                Number number2 = (Number) obj2;
                long jLongValue = number.longValue() + number2.longValue();
                if (((number.longValue() ^ jLongValue) & (number2.longValue() ^ jLongValue)) >= 0) {
                    return Long.valueOf(jLongValue);
                }
                throw new IntegerOverflow(obj + " + " + obj2, null, 2, null);
            }
            if (!(sum instanceof Token.Operator.Binary.Sum.Minus)) {
                throw new NoWhenBranchMatchedException();
            }
            Number number3 = (Number) obj;
            Number number4 = (Number) obj2;
            long jLongValue2 = number3.longValue() - number4.longValue();
            if (((number3.longValue() ^ number4.longValue()) & (number3.longValue() ^ jLongValue2)) >= 0) {
                return Long.valueOf(jLongValue2);
            }
            throw new IntegerOverflow(obj + " - " + obj2, null, 2, null);
        }
    }

    /* JADX INFO: compiled from: Evaluator.kt */
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

    public Evaluator(EvaluationContext evaluationContext) {
        p.j(evaluationContext, "evaluationContext");
        this.evaluationContext = evaluationContext;
    }

    private Object castIfPossible(Object obj, EvaluableType evaluableType) {
        return ((obj instanceof Long) && WhenMappings.$EnumSwitchMapping$0[evaluableType.ordinal()] == 1) ? Double.valueOf(((Number) obj).longValue()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000d  */
    private <T extends Comparable<? super T>> Object evalComparableTypes(Token.Operator.Binary.Comparison comparison, T t10, T t11) {
        boolean z10 = true;
        if (comparison instanceof Token.Operator.Binary.Comparison.Less) {
            if (t10.compareTo(t11) >= 0) {
                z10 = false;
            }
        } else if (comparison instanceof Token.Operator.Binary.Comparison.LessOrEqual) {
            if (t10.compareTo(t11) > 0) {
                z10 = false;
            }
        } else if (comparison instanceof Token.Operator.Binary.Comparison.GreaterOrEqual) {
            if (t10.compareTo(t11) < 0) {
                z10 = false;
            }
        } else {
            if (!(comparison instanceof Token.Operator.Binary.Comparison.Greater)) {
                throw new NoWhenBranchMatchedException();
            }
            if (t10.compareTo(t11) <= 0) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }

    private Object evalComparison(Token.Operator.Binary.Comparison comparison, Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Double)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        if ((obj instanceof Long) && (obj2 instanceof Long)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        if ((obj instanceof DateTime) && (obj2 instanceof DateTime)) {
            return evalComparableTypes(comparison, (Comparable) obj, (Comparable) obj2);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(comparison, obj, obj2);
        throw new KotlinNothingValueException();
    }

    private Object evalEquality(Token.Operator.Binary.Equality equality, Object obj, Object obj2) {
        boolean zE;
        if (equality instanceof Token.Operator.Binary.Equality.Equal) {
            zE = p.e(obj, obj2);
        } else {
            if (!(equality instanceof Token.Operator.Binary.Equality.NotEqual)) {
                throw new NoWhenBranchMatchedException();
            }
            zE = !p.e(obj, obj2);
        }
        return Boolean.valueOf(zE);
    }

    private Object evalLogical(Token.Operator.Binary.Logical logical, Object obj, a<? extends Object> aVar) {
        if (!(obj instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(obj + ' ' + logical + " ...", '\'' + logical + "' must be called with boolean operands.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        boolean z10 = logical instanceof Token.Operator.Binary.Logical.Or;
        if (z10 && ((Boolean) obj).booleanValue()) {
            return obj;
        }
        if ((logical instanceof Token.Operator.Binary.Logical.And) && !((Boolean) obj).booleanValue()) {
            return obj;
        }
        Object objInvoke = aVar.invoke();
        if (!(objInvoke instanceof Boolean)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(logical, obj, objInvoke);
            throw new KotlinNothingValueException();
        }
        boolean z11 = true;
        if (!z10 ? !((Boolean) obj).booleanValue() || !((Boolean) objInvoke).booleanValue() : !((Boolean) obj).booleanValue() && !((Boolean) objInvoke).booleanValue()) {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public <T> T eval(Evaluable evaluable) throws EvaluableException {
        p.j(evaluable, "expr");
        try {
            return (T) evaluable.eval$div_evaluable(this);
        } catch (EvaluableException e10) {
            throw e10;
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            throw new EvaluableException(message, e11);
        }
    }

    public Object evalBinary$div_evaluable(final Evaluable.Binary binary) {
        p.j(binary, BuildConfig.SDK_DEPENDENCY);
        Object objEval = eval(binary.getLeft());
        binary.updateIsCacheable$div_evaluable(binary.getLeft().checkIsCacheable());
        if (binary.getToken() instanceof Token.Operator.Binary.Logical) {
            return evalLogical((Token.Operator.Binary.Logical) binary.getToken(), objEval, new a<Object>() { // from class: com.yandex.div.evaluable.Evaluator$evalBinary$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final Object invoke() {
                    Object objEval2 = this.this$0.eval(binary.getRight());
                    Evaluable.Binary binary2 = binary;
                    binary2.updateIsCacheable$div_evaluable(binary2.getRight().checkIsCacheable());
                    return objEval2;
                }
            });
        }
        Object objEval2 = eval(binary.getRight());
        binary.updateIsCacheable$div_evaluable(binary.getRight().checkIsCacheable());
        Pair<Object, Object> pairCastArgumentsIfNeeded = castArgumentsIfNeeded(objEval, objEval2);
        Object objComponent1 = pairCastArgumentsIfNeeded.component1();
        Object objComponent2 = pairCastArgumentsIfNeeded.component2();
        if (!p.e(objComponent1.getClass(), objComponent2.getClass())) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), objComponent1, objComponent2);
            throw new KotlinNothingValueException();
        }
        Token.Operator.Binary token = binary.getToken();
        if (token instanceof Token.Operator.Binary.Equality) {
            return evalEquality((Token.Operator.Binary.Equality) binary.getToken(), objComponent1, objComponent2);
        }
        if (token instanceof Token.Operator.Binary.Sum) {
            return Companion.evalSum$div_evaluable((Token.Operator.Binary.Sum) binary.getToken(), objComponent1, objComponent2);
        }
        if (token instanceof Token.Operator.Binary.Factor) {
            return Companion.evalFactor$div_evaluable((Token.Operator.Binary.Factor) binary.getToken(), objComponent1, objComponent2);
        }
        if (token instanceof Token.Operator.Binary.Comparison) {
            return evalComparison((Token.Operator.Binary.Comparison) binary.getToken(), objComponent1, objComponent2);
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed(binary.getToken(), objComponent1, objComponent2);
        throw new KotlinNothingValueException();
    }

    public Object evalFunctionCall$div_evaluable(Evaluable.FunctionCall functionCall) {
        EvaluableType evaluableType;
        p.j(functionCall, "functionCall");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : functionCall.getArguments()) {
            arrayList.add(eval(evaluable));
            functionCall.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        ArrayList arrayList2 = new ArrayList(t.v(arrayList, 10));
        for (Object obj : arrayList) {
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to find type for ");
                    p.g(obj);
                    sb2.append(obj.getClass().getName());
                    throw new EvaluableException(sb2.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function function = getEvaluationContext().getFunctionProvider().get(functionCall.getToken().getName(), arrayList2);
            Evaluable evaluableM3326constructorimpl = ExpressionContext.m3326constructorimpl(functionCall);
            functionCall.updateIsCacheable$div_evaluable(function.isPure());
            try {
                return function.m3327invokeex6DHhM(getEvaluationContext(), evaluableM3326constructorimpl, castEvalArgumentsIfNeeded(function, arrayList));
            } catch (IntegerOverflow unused) {
                throw new IntegerOverflow(EvaluableExceptionKt.functionToMessageFormat(function.getName(), arrayList), null, 2, null);
            }
        } catch (EvaluableException e10) {
            String name = functionCall.getToken().getName();
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(name, arrayList, message, null, 8, null);
            throw new KotlinNothingValueException();
        }
    }

    public Object evalMethodCall$div_evaluable(Evaluable.MethodCall methodCall) {
        EvaluableType evaluableType;
        p.j(methodCall, "methodCall");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : methodCall.getArguments()) {
            arrayList.add(eval(evaluable));
            methodCall.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        ArrayList arrayList2 = new ArrayList(t.v(arrayList, 10));
        for (Object obj : arrayList) {
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (obj instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (obj instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (obj instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (obj instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (obj instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (obj instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (obj instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (obj instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else {
                if (!(obj instanceof JSONArray)) {
                    if (obj == null) {
                        throw new EvaluableException("Unable to find type for null", null, 2, null);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to find type for ");
                    p.g(obj);
                    sb2.append(obj.getClass().getName());
                    throw new EvaluableException(sb2.toString(), null, 2, null);
                }
                evaluableType = EvaluableType.ARRAY;
            }
            arrayList2.add(evaluableType);
        }
        try {
            Function method = getEvaluationContext().getFunctionProvider().getMethod(methodCall.getToken().getName(), arrayList2);
            Evaluable evaluableM3326constructorimpl = ExpressionContext.m3326constructorimpl(methodCall);
            methodCall.updateIsCacheable$div_evaluable(method.isPure());
            return method.m3327invokeex6DHhM(getEvaluationContext(), evaluableM3326constructorimpl, castEvalArgumentsIfNeeded(method, arrayList));
        } catch (EvaluableException e10) {
            String name = methodCall.getToken().getName();
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            EvaluableExceptionKt.throwExceptionOnMethodEvaluationFailed(name, arrayList, message, e10);
            throw new KotlinNothingValueException();
        }
    }

    public String evalStringTemplate$div_evaluable(Evaluable.StringTemplate stringTemplate) {
        p.j(stringTemplate, "stringTemplate");
        ArrayList arrayList = new ArrayList();
        for (Evaluable evaluable : stringTemplate.getArguments()) {
            arrayList.add(eval(evaluable).toString());
            stringTemplate.updateIsCacheable$div_evaluable(evaluable.checkIsCacheable());
        }
        return b0.p0(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public Object evalTernary$div_evaluable(Evaluable.Ternary ternary) {
        p.j(ternary, "ternary");
        if (!(ternary.getToken() instanceof Token.Operator.TernaryIfElse)) {
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getRawExpr(), ternary.getToken() + " was incorrectly parsed as a ternary operator.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        Object objEval = eval(ternary.getFirstExpression());
        ternary.updateIsCacheable$div_evaluable(ternary.getFirstExpression().checkIsCacheable());
        if (objEval instanceof Boolean) {
            if (((Boolean) objEval).booleanValue()) {
                Object objEval2 = eval(ternary.getSecondExpression());
                ternary.updateIsCacheable$div_evaluable(ternary.getSecondExpression().checkIsCacheable());
                return objEval2;
            }
            Object objEval3 = eval(ternary.getThirdExpression());
            ternary.updateIsCacheable$div_evaluable(ternary.getThirdExpression().checkIsCacheable());
            return objEval3;
        }
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(ternary.getFirstExpression() + " ? " + ternary.getSecondExpression() + " : " + ternary.getThirdExpression(), "Ternary must be called with a Boolean value as a condition.", null, 4, null);
        throw new KotlinNothingValueException();
    }

    public Object evalTry$div_evaluable(Evaluable.Try r10) {
        Object objM3458constructorimpl;
        p.j(r10, "tryEvaluable");
        try {
            Result.a aVar = Result.Companion;
            Object objEval = eval(r10.getTryExpression());
            r10.updateIsCacheable$div_evaluable(r10.getTryExpression().checkIsCacheable());
            objM3458constructorimpl = Result.m3458constructorimpl(objEval);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) == null) {
            return objM3458constructorimpl;
        }
        Object objEval2 = eval(r10.getFallbackExpression());
        r10.updateIsCacheable$div_evaluable(r10.getFallbackExpression().checkIsCacheable());
        return objEval2;
    }

    public Object evalUnary$div_evaluable(Evaluable.Unary unary) {
        p.j(unary, "unary");
        Object objEval = eval(unary.getExpression());
        unary.updateIsCacheable$div_evaluable(unary.getExpression().checkIsCacheable());
        Token.Operator token = unary.getToken();
        if (token instanceof Token.Operator.Unary.Plus) {
            if (objEval instanceof Long) {
                return Long.valueOf(((Number) objEval).longValue());
            }
            if (objEval instanceof Double) {
                return Double.valueOf(((Number) objEval).doubleValue());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append('+');
            sb2.append(objEval);
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(sb2.toString(), "A Number is expected after a unary plus.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        if (token instanceof Token.Operator.Unary.Minus) {
            if (objEval instanceof Long) {
                return Long.valueOf(-((Number) objEval).longValue());
            }
            if (objEval instanceof Double) {
                return Double.valueOf(-((Number) objEval).doubleValue());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append('-');
            sb3.append(objEval);
            EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(sb3.toString(), "A Number is expected after a unary minus.", null, 4, null);
            throw new KotlinNothingValueException();
        }
        if (!p.e(token, Token.Operator.Unary.Not.INSTANCE)) {
            throw new EvaluableException(unary.getToken() + " was incorrectly parsed as a unary operator.", null, 2, null);
        }
        if (objEval instanceof Boolean) {
            return Boolean.valueOf(!((Boolean) objEval).booleanValue());
        }
        String str = objEval instanceof String ? "'" : "";
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default('!' + str + objEval + str, "A Boolean is expected after a unary not.", null, 4, null);
        throw new KotlinNothingValueException();
    }

    public Object evalValue$div_evaluable(Evaluable.Value value) {
        p.j(value, NotificationCompat.CATEGORY_CALL);
        Token.Operand.Literal token = value.getToken();
        if (token instanceof Token.Operand.Literal.Num) {
            return ((Token.Operand.Literal.Num) token).m3351unboximpl();
        }
        if (token instanceof Token.Operand.Literal.Bool) {
            return Boolean.valueOf(((Token.Operand.Literal.Bool) token).m3345unboximpl());
        }
        if (token instanceof Token.Operand.Literal.Str) {
            return ((Token.Operand.Literal.Str) token).m3357unboximpl();
        }
        throw new NoWhenBranchMatchedException();
    }

    public Object evalVariable$div_evaluable(Evaluable.Variable variable) {
        p.j(variable, NotificationCompat.CATEGORY_CALL);
        Object obj = getEvaluationContext().getVariableProvider().get(variable.m3325getTokenA4lXSVo());
        if (obj != null) {
            return obj;
        }
        throw new MissingVariableException(variable.m3325getTokenA4lXSVo(), null, 2, null);
    }

    public EvaluationContext getEvaluationContext() {
        return this.evaluationContext;
    }

    private Pair<Object, Object> castArgumentsIfNeeded(Object obj, Object obj2) {
        if (p.e(obj.getClass(), obj2.getClass())) {
            return h.a(obj, obj2);
        }
        if ((obj instanceof Long) && (obj2 instanceof Double)) {
            return h.a(Double.valueOf(((Number) obj).longValue()), obj2);
        }
        if ((obj instanceof Double) && (obj2 instanceof Long)) {
            return h.a(obj, Double.valueOf(((Number) obj2).longValue()));
        }
        return h.a(obj, obj2);
    }

    private List<Object> castEvalArgumentsIfNeeded(Function function, List<? extends Object> list) {
        EvaluableType evaluableType;
        List<FunctionArgument> declaredArgs = function.getDeclaredArgs();
        ArrayList arrayList = new ArrayList(t.v(list, 10));
        int i10 = 0;
        for (Object objCastIfPossible : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.u();
            }
            EvaluableType type = declaredArgs.get(k.g(i10, s.m(declaredArgs))).getType();
            EvaluableType.Companion companion = EvaluableType.Companion;
            if (objCastIfPossible instanceof Long) {
                evaluableType = EvaluableType.INTEGER;
            } else if (objCastIfPossible instanceof Double) {
                evaluableType = EvaluableType.NUMBER;
            } else if (objCastIfPossible instanceof Boolean) {
                evaluableType = EvaluableType.BOOLEAN;
            } else if (objCastIfPossible instanceof String) {
                evaluableType = EvaluableType.STRING;
            } else if (objCastIfPossible instanceof DateTime) {
                evaluableType = EvaluableType.DATETIME;
            } else if (objCastIfPossible instanceof Color) {
                evaluableType = EvaluableType.COLOR;
            } else if (objCastIfPossible instanceof Url) {
                evaluableType = EvaluableType.URL;
            } else if (objCastIfPossible instanceof JSONObject) {
                evaluableType = EvaluableType.DICT;
            } else if (objCastIfPossible instanceof JSONArray) {
                evaluableType = EvaluableType.ARRAY;
            } else {
                if (objCastIfPossible == null) {
                    throw new EvaluableException("Unable to find type for null", null, 2, null);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to find type for ");
                p.g(objCastIfPossible);
                sb2.append(objCastIfPossible.getClass().getName());
                throw new EvaluableException(sb2.toString(), null, 2, null);
            }
            if (type != evaluableType) {
                objCastIfPossible = castIfPossible(objCastIfPossible, type);
            }
            arrayList.add(objCastIfPossible);
            i10 = i11;
        }
        return arrayList;
    }
}
