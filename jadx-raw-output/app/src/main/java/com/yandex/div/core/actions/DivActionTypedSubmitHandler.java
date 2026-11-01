package com.yandex.div.core.actions;

import ck.p;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.expression.RuntimeStoreProviderKt;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivTreeVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionSubmit;
import com.yandex.div2.DivActionTyped;
import com.yandex.div2.DivData;
import com.yandex.div2.DivVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.r;
import nj.b0;
import nj.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedSubmitHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivActionTypedSubmitHandler implements DivActionTypedHandler {
    private final DivRequestExecutor requestExecutor;

    /* JADX INFO: compiled from: DivActionTypedSubmitHandler.kt */
    public static final class ContainerFinder extends DivTreeVisitor<r> {
        private final List<DivItemBuilderResult> containers;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f45802id;

        public ContainerFinder(String str) {
            super(null, 1, null);
            this.f45802id = str;
            this.containers = new ArrayList();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ r defaultVisit(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(div, bindingContext, divStatePath);
            return r.f64562a;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        public void defaultVisit2(Div div, BindingContext bindingContext, DivStatePath divStatePath) {
            if (p.e(div.b().getId(), this.f45802id)) {
                this.containers.add(DivCollectionExtensionsKt.toItemBuilderResult(div, bindingContext.getExpressionResolver()));
            }
        }

        public final DivItemBuilderResult findContainer(Div2View div2View) {
            DivData divData = div2View.getDivData();
            if (divData == null) {
                return null;
            }
            for (DivData.State state : divData.f46937c) {
                visit(state.f46946a, div2View.getBindingContext$div_release(), DivStatePath.Companion.fromState$div_release(state));
            }
            if (this.containers.isEmpty()) {
                DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Error resolving container. Elements that respond to id '" + this.f45802id + "' are not found."));
                return null;
            }
            if (this.containers.size() > 1) {
                DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Error resolving container. Found multiple elements that respond to id '" + this.f45802id + "'."));
                return null;
            }
            return (DivItemBuilderResult) b0.f0(this.containers);
        }
    }

    private final DivRequestExecutor.Callback createCallback(final List<DivAction> list, final List<DivAction> list2, final Div2View div2View, final ExpressionResolver expressionResolver) {
        if (list == null || list.isEmpty()) {
            if (list2 == null || list2.isEmpty()) {
                return null;
            }
        }
        return new DivRequestExecutor.Callback() { // from class: com.yandex.div.core.actions.DivActionTypedSubmitHandler.createCallback.1
        };
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        DivActionSubmit divActionSubmitC;
        DivItemBuilderResult divItemBuilderResultFindContainer;
        ArrayList arrayList = null;
        DivActionTyped.s sVar = divActionTyped instanceof DivActionTyped.s ? (DivActionTyped.s) divActionTyped : null;
        if (sVar == null || (divActionSubmitC = sVar.c()) == null || (divItemBuilderResultFindContainer = new ContainerFinder(divActionSubmitC.f46280a.evaluate(expressionResolver)).findContainer(div2View)) == null) {
            return false;
        }
        List<DivActionSubmit.Request.Header> list = divActionSubmitC.f46283d.f46288a;
        if (list != null) {
            arrayList = new ArrayList(t.v(list, 10));
            for (DivActionSubmit.Request.Header header : list) {
                arrayList.add(new DivRequestExecutor.Header(header.f46294a.evaluate(expressionResolver), header.f46295b.evaluate(expressionResolver)));
            }
        }
        div2View.addLoadReference(this.requestExecutor.execute(new DivRequestExecutor.Request(divActionSubmitC.f46283d.f46290c.evaluate(expressionResolver), divActionSubmitC.f46283d.f46289b.evaluate(expressionResolver).toString(), arrayList, createBody(divItemBuilderResultFindContainer, div2View)), createCallback(divActionSubmitC.f46282c, divActionSubmitC.f46281b, div2View, expressionResolver)), div2View);
        return true;
    }

    public DivActionTypedSubmitHandler(DivRequestExecutor divRequestExecutor) {
        this.requestExecutor = divRequestExecutor;
    }

    private final String createBody(DivItemBuilderResult divItemBuilderResult, Div2View div2View) {
        boolean z10;
        VariableController variableController;
        List<DivVariable> listC = divItemBuilderResult.getDiv().b().c();
        if (listC != null && !listC.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || (variableController = UtilsKt.getVariableController(divItemBuilderResult.getExpressionResolver())) == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            String name = RuntimeStoreProviderKt.getName((DivVariable) it.next());
            Object obj = variableController.get(name);
            if (obj == null || jSONObject.put(name, obj) == null) {
                DivActionTypedUtilsKt.logError(div2View, new MissingVariableException(name, null, 2, null));
                r rVar = r.f64562a;
            }
        }
        return jSONObject.toString();
    }
}
