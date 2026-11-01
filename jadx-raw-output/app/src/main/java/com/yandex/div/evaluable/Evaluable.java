package com.yandex.div.evaluable;

import ck.i;
import ck.p;
import com.yandex.div.evaluable.function.GetBooleanValue;
import com.yandex.div.evaluable.function.GetColorValue;
import com.yandex.div.evaluable.function.GetColorValueString;
import com.yandex.div.evaluable.function.GetIntegerValue;
import com.yandex.div.evaluable.function.GetNumberValue;
import com.yandex.div.evaluable.function.GetStringValue;
import com.yandex.div.evaluable.function.GetUrlValueWithStringFallback;
import com.yandex.div.evaluable.function.GetUrlValueWithUrlFallback;
import com.yandex.div.evaluable.internal.Parser;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.internal.Tokenizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import nj.b0;
import nj.q0;
import nj.r;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: Evaluable.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Evaluable {
    public static final Companion Companion = new Companion(null);
    private static final Set<String> functionsWithVariableName = q0.j(GetIntegerValue.INSTANCE.getName(), GetNumberValue.INSTANCE.getName(), GetStringValue.INSTANCE.getName(), GetColorValue.INSTANCE.getName(), GetColorValueString.INSTANCE.getName(), GetUrlValueWithUrlFallback.INSTANCE.getName(), GetUrlValueWithStringFallback.INSTANCE.getName(), GetBooleanValue.INSTANCE.getName());
    private boolean evalCalled;
    private boolean isCacheable;
    private final String rawExpr;

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Binary extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final Evaluable left;
        private final String rawExpression;
        private final Evaluable right;
        private final Token.Operator.Binary token;
        private final List<String> variables;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Binary)) {
                return false;
            }
            Binary binary = (Binary) obj;
            return p.e(this.token, binary.token) && p.e(this.left, binary.left) && p.e(this.right, binary.right) && p.e(this.rawExpression, binary.rawExpression);
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.left.hashCode()) * 31) + this.right.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(Token.Operator.Binary binary, Evaluable evaluable, Evaluable evaluable2, String str) {
            super(str);
            p.j(binary, "token");
            p.j(evaluable, "left");
            p.j(evaluable2, "right");
            p.j(str, "rawExpression");
            this.token = binary;
            this.left = evaluable;
            this.right = evaluable2;
            this.rawExpression = str;
            this.variables = b0.y0(evaluable.getVariables(), evaluable2.getVariables());
            this.dynamicVariables = b0.y0(evaluable.getDynamicVariables(), evaluable2.getDynamicVariables());
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalBinary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Evaluable getLeft() {
            return this.left;
        }

        public final Evaluable getRight() {
            return this.right;
        }

        public final Token.Operator.Binary getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.left);
            sb2.append(' ');
            sb2.append(this.token);
            sb2.append(' ');
            sb2.append(this.right);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final Evaluable lazy(String str) {
            p.j(str, "expr");
            return new Lazy(str);
        }

        public final Set<String> getFunctionsWithVariableName$div_evaluable() {
            return Evaluable.functionsWithVariableName;
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class FunctionCall extends Evaluable {
        private final List<Evaluable> arguments;
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final Token.Function token;
        private final List<String> variables;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FunctionCall)) {
                return false;
            }
            FunctionCall functionCall = (FunctionCall) obj;
            return p.e(this.token, functionCall.token) && p.e(this.arguments, functionCall.arguments) && p.e(this.rawExpression, functionCall.rawExpression);
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FunctionCall(Token.Function function, List<? extends Evaluable> list, String str) {
            Object obj;
            super(str);
            p.j(function, "token");
            p.j(list, "arguments");
            p.j(str, "rawExpression");
            this.token = function;
            this.arguments = list;
            this.rawExpression = str;
            ArrayList arrayList = new ArrayList(t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = b0.y0((List) next, (List) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list2 = (List) obj;
            this.variables = list2 == null ? s.k() : list2;
            this.dynamicVariables = findDynamicVariables();
        }

        private final List<Evaluable> findDynamicVariables() {
            Object obj;
            List<Evaluable> listK = Evaluable.Companion.getFunctionsWithVariableName$div_evaluable().contains(this.token.getName()) ? this.arguments : s.k();
            List<Evaluable> list = this.arguments;
            ArrayList arrayList = new ArrayList(t.v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getDynamicVariables());
            }
            Iterator it2 = b0.y0(arrayList, r.e(listK)).iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = b0.y0((List) next, (List) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<Evaluable> list2 = (List) obj;
            return list2 == null ? s.k() : list2;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalFunctionCall$div_evaluable(this);
        }

        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            return this.token.getName() + '(' + b0.p0(this.arguments, Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null) + ')';
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Lazy extends Evaluable {
        private final String expr;
        private Evaluable expression;
        private final List<Token> tokens;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lazy(String str) {
            super(str);
            p.j(str, "expr");
            this.expr = str;
            this.tokens = Tokenizer.INSTANCE.tokenize(str);
        }

        private final void initExpression() {
            if (this.expression == null) {
                this.expression = Parser.INSTANCE.parse(this.tokens, getRawExpr());
            }
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            initExpression();
            Evaluable evaluable = this.expression;
            Evaluable evaluable2 = null;
            if (evaluable == null) {
                p.B("expression");
                evaluable = null;
            }
            Object objEval$div_evaluable = evaluable.eval$div_evaluable(evaluator);
            Evaluable evaluable3 = this.expression;
            if (evaluable3 == null) {
                p.B("expression");
            } else {
                evaluable2 = evaluable3;
            }
            updateIsCacheable$div_evaluable(evaluable2.isCacheable);
            return objEval$div_evaluable;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            Evaluable evaluable = this.expression;
            if (evaluable != null) {
                if (evaluable == null) {
                    p.B("expression");
                    evaluable = null;
                }
                return evaluable.getVariables();
            }
            List<Token> list = this.tokens;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof Token.Operand.Variable) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(t.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Token.Operand.Variable) it.next()).m3364unboximpl());
            }
            return arrayList2;
        }

        public String toString() {
            return this.expr;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            initExpression();
            mj.r rVar = mj.r.f64562a;
            Evaluable evaluable = this.expression;
            if (evaluable == null) {
                p.B("expression");
                evaluable = null;
            }
            return evaluable.getDynamicVariables();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class MethodCall extends Evaluable {
        private final List<Evaluable> arguments;
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final Token.Function token;
        private final List<String> variables;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodCall)) {
                return false;
            }
            MethodCall methodCall = (MethodCall) obj;
            return p.e(this.token, methodCall.token) && p.e(this.arguments, methodCall.arguments) && p.e(this.rawExpression, methodCall.rawExpression);
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.arguments.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MethodCall(Token.Function function, List<? extends Evaluable> list, String str) {
            Object next;
            super(str);
            p.j(function, "token");
            p.j(list, "arguments");
            p.j(str, "rawExpression");
            this.token = function;
            this.arguments = list;
            this.rawExpression = str;
            ArrayList arrayList = new ArrayList(t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            Object next2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                while (it2.hasNext()) {
                    next = b0.y0((List) next, (List) it2.next());
                }
            } else {
                next = null;
            }
            List<String> list2 = (List) next;
            this.variables = list2 == null ? s.k() : list2;
            List<Evaluable> list3 = this.arguments;
            ArrayList arrayList2 = new ArrayList(t.v(list3, 10));
            Iterator<T> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                next2 = it4.next();
                while (it4.hasNext()) {
                    next2 = b0.y0((List) next2, (List) it4.next());
                }
            }
            List<Evaluable> list4 = (List) next2;
            this.dynamicVariables = list4 == null ? s.k() : list4;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalMethodCall$div_evaluable(this);
        }

        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Token.Function getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            String strP0;
            if (this.arguments.size() > 1) {
                List<Evaluable> list = this.arguments;
                strP0 = b0.p0(list.subList(1, list.size()), Token.Function.ArgumentDelimiter.INSTANCE.toString(), null, null, 0, null, null, 62, null);
            } else {
                strP0 = "";
            }
            return b0.f0(this.arguments) + '.' + this.token.getName() + '(' + strP0 + ')';
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class StringTemplate extends Evaluable {
        private final List<Evaluable> arguments;
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final List<String> variables;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringTemplate)) {
                return false;
            }
            StringTemplate stringTemplate = (StringTemplate) obj;
            return p.e(this.arguments, stringTemplate.arguments) && p.e(this.rawExpression, stringTemplate.rawExpression);
        }

        public int hashCode() {
            return (this.arguments.hashCode() * 31) + this.rawExpression.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StringTemplate(List<? extends Evaluable> list, String str) {
            super(str);
            p.j(list, "arguments");
            p.j(str, "rawExpression");
            this.arguments = list;
            this.rawExpression = str;
            ArrayList arrayList = new ArrayList(t.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).getVariables());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = b0.y0((List) next, (List) it2.next());
            }
            this.variables = (List) next;
            List<Evaluable> list2 = this.arguments;
            ArrayList arrayList2 = new ArrayList(t.v(list2, 10));
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((Evaluable) it3.next()).getDynamicVariables());
            }
            Iterator it4 = arrayList2.iterator();
            if (!it4.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next2 = it4.next();
            while (it4.hasNext()) {
                next2 = b0.y0((List) next2, (List) it4.next());
            }
            this.dynamicVariables = (List) next2;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalStringTemplate$div_evaluable(this);
        }

        public final List<Evaluable> getArguments() {
            return this.arguments;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            return b0.p0(this.arguments, "", null, null, 0, null, null, 62, null);
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Ternary extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final Evaluable firstExpression;
        private final String rawExpression;
        private final Evaluable secondExpression;
        private final Evaluable thirdExpression;
        private final Token.Operator token;
        private final List<String> variables;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ternary)) {
                return false;
            }
            Ternary ternary = (Ternary) obj;
            return p.e(this.token, ternary.token) && p.e(this.firstExpression, ternary.firstExpression) && p.e(this.secondExpression, ternary.secondExpression) && p.e(this.thirdExpression, ternary.thirdExpression) && p.e(this.rawExpression, ternary.rawExpression);
        }

        public int hashCode() {
            return (((((((this.token.hashCode() * 31) + this.firstExpression.hashCode()) * 31) + this.secondExpression.hashCode()) * 31) + this.thirdExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ternary(Token.Operator operator, Evaluable evaluable, Evaluable evaluable2, Evaluable evaluable3, String str) {
            super(str);
            p.j(operator, "token");
            p.j(evaluable, "firstExpression");
            p.j(evaluable2, "secondExpression");
            p.j(evaluable3, "thirdExpression");
            p.j(str, "rawExpression");
            this.token = operator;
            this.firstExpression = evaluable;
            this.secondExpression = evaluable2;
            this.thirdExpression = evaluable3;
            this.rawExpression = str;
            this.variables = b0.y0(b0.y0(evaluable.getVariables(), evaluable2.getVariables()), evaluable3.getVariables());
            this.dynamicVariables = b0.y0(b0.y0(evaluable.getDynamicVariables(), evaluable2.getDynamicVariables()), evaluable3.getDynamicVariables());
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalTernary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Evaluable getFirstExpression() {
            return this.firstExpression;
        }

        public final Evaluable getSecondExpression() {
            return this.secondExpression;
        }

        public final Evaluable getThirdExpression() {
            return this.thirdExpression;
        }

        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            Token.Operator.TernaryIf ternaryIf = Token.Operator.TernaryIf.INSTANCE;
            Token.Operator.TernaryElse ternaryElse = Token.Operator.TernaryElse.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.firstExpression);
            sb2.append(' ');
            sb2.append(ternaryIf);
            sb2.append(' ');
            sb2.append(this.secondExpression);
            sb2.append(' ');
            sb2.append(ternaryElse);
            sb2.append(' ');
            sb2.append(this.thirdExpression);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Try extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final Evaluable fallbackExpression;
        private final String rawExpression;
        private final Token.Operator.Try token;
        private final Evaluable tryExpression;
        private final List<String> variables;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Try)) {
                return false;
            }
            Try r10 = (Try) obj;
            return p.e(this.token, r10.token) && p.e(this.tryExpression, r10.tryExpression) && p.e(this.fallbackExpression, r10.fallbackExpression) && p.e(this.rawExpression, r10.rawExpression);
        }

        public int hashCode() {
            return (((((this.token.hashCode() * 31) + this.tryExpression.hashCode()) * 31) + this.fallbackExpression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Try(Token.Operator.Try r10, Evaluable evaluable, Evaluable evaluable2, String str) {
            super(str);
            p.j(r10, "token");
            p.j(evaluable, "tryExpression");
            p.j(evaluable2, "fallbackExpression");
            p.j(str, "rawExpression");
            this.token = r10;
            this.tryExpression = evaluable;
            this.fallbackExpression = evaluable2;
            this.rawExpression = str;
            this.variables = b0.y0(evaluable.getVariables(), evaluable2.getVariables());
            this.dynamicVariables = b0.y0(evaluable.getDynamicVariables(), evaluable2.getDynamicVariables());
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalTry$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Evaluable getFallbackExpression() {
            return this.fallbackExpression;
        }

        public final Evaluable getTryExpression() {
            return this.tryExpression;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(this.tryExpression);
            sb2.append(' ');
            sb2.append(this.token);
            sb2.append(' ');
            sb2.append(this.fallbackExpression);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Unary extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final Evaluable expression;
        private final String rawExpression;
        private final Token.Operator token;
        private final List<String> variables;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unary)) {
                return false;
            }
            Unary unary = (Unary) obj;
            return p.e(this.token, unary.token) && p.e(this.expression, unary.expression) && p.e(this.rawExpression, unary.rawExpression);
        }

        public int hashCode() {
            return (((this.token.hashCode() * 31) + this.expression.hashCode()) * 31) + this.rawExpression.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unary(Token.Operator operator, Evaluable evaluable, String str) {
            super(str);
            p.j(operator, "token");
            p.j(evaluable, "expression");
            p.j(str, "rawExpression");
            this.token = operator;
            this.expression = evaluable;
            this.rawExpression = str;
            this.variables = evaluable.getVariables();
            this.dynamicVariables = evaluable.getDynamicVariables();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalUnary$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Evaluable getExpression() {
            return this.expression;
        }

        public final Token.Operator getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.token);
            sb2.append(this.expression);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Value extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final Token.Operand.Literal token;
        private final List<String> variables;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return p.e(this.token, value.token) && p.e(this.rawExpression, value.rawExpression);
        }

        public int hashCode() {
            return (this.token.hashCode() * 31) + this.rawExpression.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(Token.Operand.Literal literal, String str) {
            super(str);
            p.j(literal, "token");
            p.j(str, "rawExpression");
            this.token = literal;
            this.rawExpression = str;
            this.variables = s.k();
            this.dynamicVariables = s.k();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalValue$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        public final Token.Operand.Literal getToken() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            Token.Operand.Literal literal = this.token;
            if (literal instanceof Token.Operand.Literal.Str) {
                return '\'' + ((Token.Operand.Literal.Str) this.token).m3357unboximpl() + '\'';
            }
            if (literal instanceof Token.Operand.Literal.Num) {
                return ((Token.Operand.Literal.Num) literal).m3351unboximpl().toString();
            }
            if (literal instanceof Token.Operand.Literal.Bool) {
                return String.valueOf(((Token.Operand.Literal.Bool) literal).m3345unboximpl());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: Evaluable.kt */
    public static final class Variable extends Evaluable {
        private final List<Evaluable> dynamicVariables;
        private final String rawExpression;
        private final String token;
        private final List<String> variables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Variable(String str, String str2) {
            super(str2);
            p.j(str, "token");
            p.j(str2, "rawExpression");
            this.token = str;
            this.rawExpression = str2;
            this.variables = r.e(str);
            this.dynamicVariables = s.k();
        }

        public /* synthetic */ Variable(String str, String str2, i iVar) {
            this(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Variable)) {
                return false;
            }
            Variable variable = (Variable) obj;
            return Token.Operand.Variable.m3361equalsimpl0(this.token, variable.token) && p.e(this.rawExpression, variable.rawExpression);
        }

        public int hashCode() {
            return (Token.Operand.Variable.m3362hashCodeimpl(this.token) * 31) + this.rawExpression.hashCode();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public Object evalImpl(Evaluator evaluator) {
            p.j(evaluator, "evaluator");
            return evaluator.evalVariable$div_evaluable(this);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<Evaluable> getDynamicVariables() {
            return this.dynamicVariables;
        }

        /* JADX INFO: renamed from: getToken-A4lXSVo, reason: not valid java name */
        public final String m3325getTokenA4lXSVo() {
            return this.token;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        public List<String> getVariables() {
            return this.variables;
        }

        public String toString() {
            return this.token;
        }
    }

    public abstract Object evalImpl(Evaluator evaluator) throws EvaluableException;

    public abstract List<Evaluable> getDynamicVariables();

    public abstract List<String> getVariables();

    public Evaluable(String str) {
        p.j(str, "rawExpr");
        this.rawExpr = str;
        this.isCacheable = true;
    }

    public final boolean checkIsCacheable() {
        return this.isCacheable;
    }

    public final Object eval$div_evaluable(Evaluator evaluator) throws EvaluableException {
        p.j(evaluator, "evaluator");
        Object objEvalImpl = evalImpl(evaluator);
        this.evalCalled = true;
        return objEvalImpl;
    }

    public final String getRawExpr() {
        return this.rawExpr;
    }

    public final void updateIsCacheable$div_evaluable(boolean z10) {
        this.isCacheable = this.isCacheable && z10;
    }
}
