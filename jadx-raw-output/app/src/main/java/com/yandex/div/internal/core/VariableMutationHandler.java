package com.yandex.div.internal.core;

import bk.l;
import ck.i;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Result;
import kotlin.c;
import mj.r;

/* JADX INFO: compiled from: VariableMutationHandler.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class VariableMutationHandler {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: VariableMutationHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final VariableMutationException setVariable(Div2View div2View, String str, String str2, ExpressionResolver expressionResolver) {
            Object objM3458constructorimpl;
            Variable variableFindVariable = findVariable(str, expressionResolver);
            if (variableFindVariable == null) {
                return createAndReportError(null, div2View, "Variable '" + str + "' not defined!");
            }
            try {
                Result.a aVar = Result.Companion;
                variableFindVariable.set(str2);
                objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
            }
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl == null) {
                return null;
            }
            return VariableMutationHandler.Companion.createAndReportError(thM3461exceptionOrNullimpl, div2View, "Variable '" + str + "' mutation failed!");
        }

        private final VariableMutationException createAndReportError(Throwable th2, Div2View div2View, String str) {
            VariableMutationException variableMutationException = new VariableMutationException(str, th2);
            DivActionTypedUtilsKt.logError(div2View, variableMutationException);
            return variableMutationException;
        }

        private final Variable findVariable(String str, ExpressionResolver expressionResolver) {
            VariableController variableController = UtilsKt.getVariableController(expressionResolver);
            if (variableController != null) {
                return variableController.getMutableVariable(str);
            }
            return null;
        }

        public final <T extends Variable> VariableMutationException setVariable(Div2View div2View, String str, ExpressionResolver expressionResolver, l<? super T, ? extends T> lVar) {
            Object objM3458constructorimpl;
            Variable variableFindVariable = findVariable(str, expressionResolver);
            if (variableFindVariable == null) {
                return createAndReportError(null, div2View, "Variable '" + str + "' not defined!");
            }
            try {
                Result.a aVar = Result.Companion;
                variableFindVariable.setValue(lVar.invoke(variableFindVariable));
                objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
            }
            Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(objM3458constructorimpl);
            if (thM3461exceptionOrNullimpl == null) {
                return null;
            }
            return VariableMutationHandler.Companion.createAndReportError(thM3461exceptionOrNullimpl, div2View, "Variable '" + str + "' mutation failed!");
        }
    }

    public static final VariableMutationException setVariable(Div2View div2View, String str, String str2, ExpressionResolver expressionResolver) {
        return Companion.setVariable(div2View, str, str2, expressionResolver);
    }
}
