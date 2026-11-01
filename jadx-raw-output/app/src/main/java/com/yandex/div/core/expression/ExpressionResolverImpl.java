package com.yandex.div.core.expression;

import bk.a;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.core.expression.variables.VariableAndConstantController;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Evaluator;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.ParsingExceptionReason;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mj.r;
import nj.b0;
import org.json.JSONObject;

/* JADX INFO: compiled from: ExpressionResolverImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ExpressionResolverImpl implements ExpressionResolver {
    private final ErrorCollector errorCollector;
    private final Map<String, Object> evaluationsCache;
    private final Evaluator evaluator;
    private final Map<String, ObserverList<a<r>>> expressionObservers;
    private final String itemBuilderData;
    private final String path;
    private final RuntimeStore runtimeStore;
    private boolean suppressMissingVariableException;
    private final Map<String, Set<String>> varToExpressions;
    private final VariableController variableController;

    public ExpressionResolverImpl(String str, RuntimeStore runtimeStore, VariableController variableController, Evaluator evaluator, ErrorCollector errorCollector, String str2) {
        this.path = str;
        this.runtimeStore = runtimeStore;
        this.variableController = variableController;
        this.evaluator = evaluator;
        this.errorCollector = errorCollector;
        this.itemBuilderData = str2;
        this.evaluationsCache = new LinkedHashMap();
        this.varToExpressions = new LinkedHashMap();
        this.expressionObservers = new LinkedHashMap();
    }

    private static final <T> boolean safeConvert$fieldAwaitsStringButValueNotConverted(TypeHelper<T> typeHelper, T t10) {
        return (t10 == null || !(typeHelper.getTypeDefault() instanceof String) || typeHelper.isTypeValid(t10)) ? false : true;
    }

    private final <R> R getEvaluationResult(String str, Evaluable evaluable) {
        R r10 = (R) this.evaluationsCache.get(str);
        if (r10 == null) {
            r10 = (R) this.evaluator.eval(evaluable);
            if (evaluable.checkIsCacheable()) {
                for (String str2 : evaluable.getVariables()) {
                    Map<String, Set<String>> map = this.varToExpressions;
                    Set<String> linkedHashSet = map.get(str2);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>();
                        map.put(str2, linkedHashSet);
                    }
                    linkedHashSet.add(str);
                }
                this.evaluationsCache.put(str, r10);
            }
        }
        return r10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    private final <R, T> T safeConvert(String str, String str2, l<? super R, ? extends T> lVar, R r10, TypeHelper<T> typeHelper) {
        ?? Invoke = r10;
        if (lVar != null) {
            try {
                Invoke = lVar.invoke(r10);
            } catch (ClassCastException e10) {
                throw ParsingExceptionKt.typeMismatch(str, str2, r10, e10);
            } catch (Exception e11) {
                throw ParsingExceptionKt.invalidValue(str, str2, r10, e11);
            }
        } else if (r10 == 0) {
            Invoke = (T) null;
        }
        return safeConvert$fieldAwaitsStringButValueNotConverted(typeHelper, (Object) Invoke) ? (T) String.valueOf((Object) Invoke) : (T) Invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeToExpression$lambda$7(ExpressionResolverImpl expressionResolverImpl, String str, a aVar) {
        ObserverList<a<r>> observerList = expressionResolverImpl.expressionObservers.get(str);
        if (observerList != null) {
            observerList.removeObserver(aVar);
        }
    }

    private final String tryGetMissingVariableName(EvaluableException evaluableException) {
        if (evaluableException instanceof MissingVariableException) {
            return ((MissingVariableException) evaluableException).getVariableName();
        }
        return null;
    }

    public final Evaluator getEvaluator() {
        return this.evaluator;
    }

    public final String getItemBuilderData() {
        return this.itemBuilderData;
    }

    public final String getPath() {
        return this.path;
    }

    public final RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    public final VariableController getVariableController() {
        return this.variableController;
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public void notifyResolveFailed(ParsingException parsingException) {
        this.errorCollector.logError(parsingException);
    }

    public final void setSuppressMissingVariableException(boolean z10) {
        this.suppressMissingVariableException = z10;
    }

    public final void subscribeOnVariables$div_release() {
        this.variableController.setOnAnyVariableChangeCallback(this, new l<Variable, r>() { // from class: com.yandex.div.core.expression.ExpressionResolverImpl$subscribeOnVariables$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Variable variable) {
                invoke2(variable);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Variable variable) {
                Set set = (Set) this.this$0.varToExpressions.get(variable.getName());
                List listO0 = set != null ? b0.O0(set) : null;
                if (listO0 != null) {
                    ExpressionResolverImpl expressionResolverImpl = this.this$0;
                    Iterator it = listO0.iterator();
                    while (it.hasNext()) {
                        expressionResolverImpl.evaluationsCache.remove((String) it.next());
                    }
                }
                if (listO0 != null) {
                    ExpressionResolverImpl expressionResolverImpl2 = this.this$0;
                    Iterator it2 = listO0.iterator();
                    while (it2.hasNext()) {
                        ObserverList observerList = (ObserverList) expressionResolverImpl2.expressionObservers.get((String) it2.next());
                        if (observerList != null) {
                            Iterator<E> it3 = observerList.iterator();
                            while (it3.hasNext()) {
                                ((a) it3.next()).invoke();
                            }
                        }
                    }
                }
            }
        });
        this.variableController.restoreSubscriptions();
    }

    public final JSONObject validateItemBuilderDataElement(Object obj, int i10) {
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        this.errorCollector.logError(ParsingExceptionKt.typeMismatch(i10, obj));
        return null;
    }

    public final ExpressionResolverImpl withConstants$div_release(String str, ConstantsProvider constantsProvider) {
        VariableAndConstantController variableAndConstantController = new VariableAndConstantController(this.variableController, constantsProvider);
        return new ExpressionResolverImpl(this.path + '/' + str, this.runtimeStore, variableAndConstantController, new Evaluator(new EvaluationContext(variableAndConstantController, this.evaluator.getEvaluationContext().getStoredValueProvider(), this.evaluator.getEvaluationContext().getFunctionProvider(), this.evaluator.getEvaluationContext().getWarningSender())), this.errorCollector, str);
    }

    private final <T> void safeValidate(String str, String str2, ValueValidator<T> valueValidator, T t10) {
        try {
            if (valueValidator.isValid(t10)) {
            } else {
                throw ParsingExceptionKt.invalidValue(str2, t10);
            }
        } catch (ClassCastException e10) {
            throw ParsingExceptionKt.typeMismatch(str, str2, t10, e10);
        }
    }

    private final <R, T> T tryResolve(String str, String str2, Evaluable evaluable, l<? super R, ? extends T> lVar, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper) {
        try {
            T t10 = (T) getEvaluationResult(str2, evaluable);
            if (typeHelper.isTypeValid(t10)) {
                p.h(t10, "null cannot be cast to non-null type T of com.yandex.div.core.expression.ExpressionResolverImpl.tryResolve");
            } else {
                Object objSafeConvert = safeConvert(str, str2, lVar, t10, typeHelper);
                if (objSafeConvert != null) {
                    t10 = (T) objSafeConvert;
                } else {
                    throw ParsingExceptionKt.invalidValue(str, str2, t10);
                }
            }
            safeValidate(str, str2, valueValidator, t10);
            return t10;
        } catch (EvaluableException e10) {
            String strTryGetMissingVariableName = tryGetMissingVariableName(e10);
            if (strTryGetMissingVariableName != null) {
                throw ParsingExceptionKt.missingVariable(str, str2, strTryGetMissingVariableName, e10);
            }
            throw ParsingExceptionKt.resolveFailed(str, str2, e10);
        }
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public <R, T> T get(String str, String str2, Evaluable evaluable, l<? super R, ? extends T> lVar, ValueValidator<T> valueValidator, TypeHelper<T> typeHelper, ParsingErrorLogger parsingErrorLogger) {
        try {
            return (T) tryResolve(str, str2, evaluable, lVar, valueValidator, typeHelper);
        } catch (ParsingException e10) {
            if (e10.getReason() == ParsingExceptionReason.MISSING_VARIABLE) {
                if (this.suppressMissingVariableException) {
                    throw ParsingExceptionKt.getSILENT_PARSING_EXCEPTION();
                }
                throw e10;
            }
            parsingErrorLogger.logError(e10);
            this.errorCollector.logError(e10);
            return (T) tryResolve(str, str2, evaluable, lVar, valueValidator, typeHelper);
        }
    }

    @Override // com.yandex.div.json.expressions.ExpressionResolver
    public Disposable subscribeToExpression(final String str, List<String> list, final a<r> aVar) {
        for (String str2 : list) {
            Map<String, Set<String>> map = this.varToExpressions;
            Set<String> linkedHashSet = map.get(str2);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                map.put(str2, linkedHashSet);
            }
            linkedHashSet.add(str);
        }
        Map<String, ObserverList<a<r>>> map2 = this.expressionObservers;
        ObserverList<a<r>> observerList = map2.get(str);
        if (observerList == null) {
            observerList = new ObserverList<>();
            map2.put(str, observerList);
        }
        observerList.addObserver(aVar);
        return new Disposable() { // from class: qd.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ExpressionResolverImpl.subscribeToExpression$lambda$7(this.f66569b, str, aVar);
            }
        };
    }

    public /* synthetic */ ExpressionResolverImpl(String str, RuntimeStore runtimeStore, VariableController variableController, Evaluator evaluator, ErrorCollector errorCollector, String str2, int i10, i iVar) {
        this(str, runtimeStore, variableController, evaluator, errorCollector, (i10 & 32) != 0 ? null : str2);
    }
}
