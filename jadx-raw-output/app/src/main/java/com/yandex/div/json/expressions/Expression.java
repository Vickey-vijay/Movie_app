package com.yandex.div.json.expressions;

import bk.a;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.CompositeDisposableKt;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.LiteralsEscaper;
import com.yandex.div.internal.parser.JsonParsers;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.c;
import lk.a0;
import mj.r;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: Expression.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Expression<T> {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: Expression.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ Expression constant$default(Companion companion, Object obj, ParsingErrorLogger parsingErrorLogger, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                parsingErrorLogger = ParsingErrorLogger.LOG;
            }
            return companion.constant(obj, parsingErrorLogger);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> Expression<T> constant(T t10, ParsingErrorLogger parsingErrorLogger) {
            return t10 instanceof String ? new StringConstantExpression((String) t10, null, parsingErrorLogger, 2, null) : new ConstantExpression(t10);
        }

        public final boolean mayBeExpression(Object obj) {
            return (obj instanceof String) && a0.X((CharSequence) obj, "@{", false, 2, null);
        }
    }

    /* JADX INFO: compiled from: Expression.kt */
    public static class ConstantExpression<T> extends Expression<T> {
        private final T value;

        @Override // com.yandex.div.json.expressions.Expression
        public T evaluate(ExpressionResolver expressionResolver) {
            return this.value;
        }

        @Override // com.yandex.div.json.expressions.Expression
        public Object getRawValue() {
            T t10 = this.value;
            p.h(t10, "null cannot be cast to non-null type kotlin.Any");
            return t10;
        }

        @Override // com.yandex.div.json.expressions.Expression
        public Disposable observe(ExpressionResolver expressionResolver, l<? super T, r> lVar) {
            return Disposable.NULL;
        }

        @Override // com.yandex.div.json.expressions.Expression
        public Disposable observeAndGet(ExpressionResolver expressionResolver, l<? super T, r> lVar) {
            lVar.invoke(this.value);
            return Disposable.NULL;
        }

        public ConstantExpression(T t10) {
            this.value = t10;
        }
    }

    /* JADX INFO: compiled from: Expression.kt */
    public static final class MutableExpression<R, T> extends Expression<T> {
        private final l<R, T> converter;
        private Evaluable evaluable;
        private final String expressionKey;
        private final Expression<T> fieldDefaultValue;
        private T lastValidValue;
        private final ParsingErrorLogger logger;
        private final String rawExpression;
        private final String rawValue;
        private final TypeHelper<T> typeHelper;
        private final ValueValidator<T> validator;

        private final List<Evaluable> getDynamicVariables() {
            Object objM3458constructorimpl;
            try {
                Result.a aVar = Result.Companion;
                Evaluable evaluable = this.evaluable;
                objM3458constructorimpl = Result.m3458constructorimpl(evaluable != null ? evaluable.getDynamicVariables() : null);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
            }
            return (List) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
        }

        @Override // com.yandex.div.json.expressions.Expression
        public Disposable observe(final ExpressionResolver expressionResolver, final l<? super T, r> lVar) {
            List<String> variables = getVariables(expressionResolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (variables.isEmpty()) {
                if (dynamicVariables == null || dynamicVariables.isEmpty()) {
                    return Disposable.NULL;
                }
            }
            final a<r> aVar = new a<r>() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$callbackWithValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    lVar.invoke((T) this.evaluate(expressionResolver));
                }
            };
            Disposable disposableSubscribeToExpression = expressionResolver.subscribeToExpression(this.rawExpression, variables, aVar);
            if (dynamicVariables == null || dynamicVariables.isEmpty()) {
                return disposableSubscribeToExpression;
            }
            final CompositeDisposable compositeDisposable = new CompositeDisposable();
            CompositeDisposableKt.plusAssign(compositeDisposable, disposableSubscribeToExpression);
            CompositeDisposableKt.plusAssign(compositeDisposable, observe(dynamicVariables, expressionResolver, aVar));
            for (final Evaluable evaluable : dynamicVariables) {
                a<r> aVar2 = new a<r>() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$1$dynamicVarCallback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        CompositeDisposableKt.plusAssign(compositeDisposable, this.observe(evaluable, expressionResolver, (a<r>) aVar));
                    }
                };
                CompositeDisposableKt.plusAssign(compositeDisposable, expressionResolver.subscribeToExpression(evaluable.toString(), evaluable.getVariables(), aVar2));
                CompositeDisposableKt.plusAssign(compositeDisposable, observe(evaluable.getDynamicVariables(), expressionResolver, aVar2));
            }
            return compositeDisposable;
        }

        private final Evaluable getEvaluable() {
            Evaluable evaluable = this.evaluable;
            if (evaluable != null) {
                return evaluable;
            }
            try {
                Evaluable evaluableLazy = Evaluable.Companion.lazy(this.rawExpression);
                this.evaluable = evaluableLazy;
                return evaluableLazy;
            } catch (EvaluableException e10) {
                throw ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e10);
            }
        }

        private final void logError(ParsingException parsingException, ExpressionResolver expressionResolver) {
            this.logger.logError(parsingException);
            expressionResolver.notifyResolveFailed(parsingException);
        }

        private final String resolveVariableName(Evaluable evaluable, ExpressionResolver expressionResolver) {
            return (String) expressionResolver.get(this.expressionKey, evaluable.toString(), evaluable, JsonParsers.doNotConvert(), JsonParsers.alwaysValid(), TypeHelpersKt.TYPE_HELPER_STRING, this.logger);
        }

        private final T tryResolve(ExpressionResolver expressionResolver) {
            T t10 = (T) expressionResolver.get(this.expressionKey, this.rawExpression, getEvaluable(), this.converter, this.validator, this.typeHelper, this.logger);
            if (t10 == null) {
                throw ParsingExceptionKt.resolveFailed$default(this.expressionKey, this.rawExpression, null, 4, null);
            }
            if (this.typeHelper.isTypeValid(t10)) {
                return t10;
            }
            throw ParsingExceptionKt.typeMismatch$default(this.expressionKey, this.rawExpression, t10, null, 8, null);
        }

        @Override // com.yandex.div.json.expressions.Expression
        public String getRawValue() {
            return this.rawValue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MutableExpression(String str, String str2, l<? super R, ? extends T> lVar, ValueValidator<T> valueValidator, ParsingErrorLogger parsingErrorLogger, TypeHelper<T> typeHelper, Expression<T> expression) {
            this.expressionKey = str;
            this.rawExpression = str2;
            this.converter = lVar;
            this.validator = valueValidator;
            this.logger = parsingErrorLogger;
            this.typeHelper = typeHelper;
            this.fieldDefaultValue = expression;
            this.rawValue = str2;
        }

        private final List<String> getVariables(ExpressionResolver expressionResolver) {
            try {
                return getEvaluable().getVariables();
            } catch (Exception e10) {
                logError(ParsingExceptionKt.resolveFailed(this.expressionKey, this.rawExpression, e10), expressionResolver);
                return s.k();
            }
        }

        private final T tryResolveOrUseLast(ExpressionResolver expressionResolver) {
            boolean z10;
            T tEvaluate;
            try {
                T tTryResolve = tryResolve(expressionResolver);
                this.lastValidValue = tTryResolve;
                return tTryResolve;
            } catch (ParsingException e10) {
                String message = e10.getMessage();
                if (message != null && message.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    logError(e10, expressionResolver);
                }
                T t10 = this.lastValidValue;
                if (t10 != null) {
                    return t10;
                }
                try {
                    Expression<T> expression = this.fieldDefaultValue;
                    if (expression != null && (tEvaluate = expression.evaluate(expressionResolver)) != null) {
                        this.lastValidValue = tEvaluate;
                        return tEvaluate;
                    }
                    return this.typeHelper.getTypeDefault();
                } catch (ParsingException e11) {
                    logError(e11, expressionResolver);
                    throw e11;
                }
            }
        }

        @Override // com.yandex.div.json.expressions.Expression
        public T evaluate(ExpressionResolver expressionResolver) {
            return tryResolveOrUseLast(expressionResolver);
        }

        public final List<String> getVariablesName(ExpressionResolver expressionResolver) {
            ArrayList arrayList;
            boolean z10;
            List<String> variables = getVariables(expressionResolver);
            List<Evaluable> dynamicVariables = getDynamicVariables();
            if (dynamicVariables != null) {
                arrayList = new ArrayList();
                Iterator<T> it = dynamicVariables.iterator();
                while (it.hasNext()) {
                    String strResolveVariableName = resolveVariableName((Evaluable) it.next(), expressionResolver);
                    if (strResolveVariableName != null) {
                        arrayList.add(strResolveVariableName);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return b0.y0(variables, arrayList);
            }
            return variables;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Disposable observe(Evaluable evaluable, ExpressionResolver expressionResolver, a<r> aVar) {
            String strResolveVariableName = resolveVariableName(evaluable, expressionResolver);
            return strResolveVariableName == null ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, nj.r.e(strResolveVariableName), aVar);
        }

        private final Disposable observe(List<? extends Evaluable> list, ExpressionResolver expressionResolver, a<r> aVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String strResolveVariableName = resolveVariableName((Evaluable) it.next(), expressionResolver);
                if (strResolveVariableName != null) {
                    arrayList.add(strResolveVariableName);
                }
            }
            return arrayList.isEmpty() ? Disposable.NULL : expressionResolver.subscribeToExpression(this.rawExpression, arrayList, aVar);
        }
    }

    /* JADX INFO: compiled from: Expression.kt */
    public static final class StringConstantExpression extends ConstantExpression<String> {
        private String cachedValue;
        private final String defaultValue;
        private final ParsingErrorLogger logger;
        private final String value;

        public /* synthetic */ StringConstantExpression(String str, String str2, ParsingErrorLogger parsingErrorLogger, int i10, i iVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? ParsingErrorLogger.LOG : parsingErrorLogger);
        }

        @Override // com.yandex.div.json.expressions.Expression.ConstantExpression, com.yandex.div.json.expressions.Expression
        public String evaluate(ExpressionResolver expressionResolver) {
            String str = this.cachedValue;
            if (str != null) {
                return str;
            }
            try {
                String strProcess$default = LiteralsEscaper.process$default(LiteralsEscaper.INSTANCE, this.value, null, 2, null);
                this.cachedValue = strProcess$default;
                return strProcess$default;
            } catch (EvaluableException e10) {
                this.logger.logError(e10);
                String str2 = this.defaultValue;
                this.cachedValue = str2;
                return str2;
            }
        }

        public StringConstantExpression(String str, String str2, ParsingErrorLogger parsingErrorLogger) {
            super(str);
            this.value = str;
            this.defaultValue = str2;
            this.logger = parsingErrorLogger;
        }
    }

    public static final <T> Expression<T> constant(T t10, ParsingErrorLogger parsingErrorLogger) {
        return Companion.constant(t10, parsingErrorLogger);
    }

    public static final boolean mayBeExpression(Object obj) {
        return Companion.mayBeExpression(obj);
    }

    public abstract T evaluate(ExpressionResolver expressionResolver);

    public abstract Object getRawValue();

    public abstract Disposable observe(ExpressionResolver expressionResolver, l<? super T, r> lVar);

    public boolean equals(Object obj) {
        if (obj instanceof Expression) {
            return p.e(getRawValue(), ((Expression) obj).getRawValue());
        }
        return false;
    }

    public int hashCode() {
        return getRawValue().hashCode() * 16;
    }

    public Disposable observeAndGet(ExpressionResolver expressionResolver, l<? super T, r> lVar) {
        T tEvaluate;
        try {
            tEvaluate = evaluate(expressionResolver);
        } catch (ParsingException unused) {
            tEvaluate = null;
        }
        if (tEvaluate != null) {
            lVar.invoke(tEvaluate);
        }
        return observe(expressionResolver, lVar);
    }
}
