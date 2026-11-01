package com.yandex.div.core.expression.variables;

import androidx.annotation.MainThread;
import bk.l;
import ck.p;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div2.DivData;
import kotlin.jvm.internal.Ref$ObjectRef;
import mj.r;

/* JADX INFO: compiled from: TwoWayVariableBinder.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class TwoWayVariableBinder<T> {
    private final ErrorCollectors errorCollectors;

    /* JADX INFO: compiled from: TwoWayVariableBinder.kt */
    public interface Callbacks<T> {
        @MainThread
        void onVariableChanged(T t10);

        void setViewStateChangeListener(l<? super T, r> lVar);
    }

    public abstract String toStringValue(T t10);

    public TwoWayVariableBinder(ErrorCollectors errorCollectors) {
        this.errorCollectors = errorCollectors;
    }

    public Disposable bindVariable(final BindingContext bindingContext, final String str, final Callbacks<T> callbacks, DivStatePath divStatePath) {
        final Div2View divView = bindingContext.getDivView();
        DivData divData = divView.getDivData();
        if (divData == null) {
            return Disposable.NULL;
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        DivDataTag dataTag = divView.getDataTag();
        VariableController variableController = UtilsKt.getVariableController(bindingContext.getExpressionResolver());
        if (variableController == null) {
            return Disposable.NULL;
        }
        callbacks.setViewStateChangeListener(new l<T, r>() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder.bindVariable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t10) {
                if (p.e(ref$ObjectRef.element, t10)) {
                    return;
                }
                ref$ObjectRef.element = t10;
                VariableMutationHandler.Companion.setVariable(divView, str, this.toStringValue(t10), bindingContext.getExpressionResolver());
            }
        });
        return variableController.subscribeToVariableChange(str, this.errorCollectors.getOrCreate(dataTag, divData), true, new l<Variable, r>() { // from class: com.yandex.div.core.expression.variables.TwoWayVariableBinder.bindVariable.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Variable variable) {
                invoke2(variable);
                return r.f64562a;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Variable variable) {
                T t10 = (T) variable.getValue();
                if (t10 == null) {
                    t10 = null;
                }
                if (p.e(ref$ObjectRef.element, t10)) {
                    return;
                }
                ref$ObjectRef.element = t10;
                callbacks.onVariableChanged(t10);
            }
        });
    }
}
