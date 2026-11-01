package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;

/* JADX INFO: loaded from: classes9.dex */
public final class ny2 extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qu f80872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oh0 f80873b;

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        oh0 oh0Var;
        return super.handleAction(divAction, divViewFacade, expressionResolver) || ((oh0Var = this.f80873b) != null && oh0Var.handleAction(divAction, divViewFacade, expressionResolver));
    }

    public final void a(oh0 oh0Var) {
        oh0 oh0Var2 = this.f80873b;
        if (oh0Var2 != null) {
            oh0Var2.f81040c.f85396b = null;
        }
        if (oh0Var != null) {
            oh0Var.f81040c.f85396b = this.f80872a;
        }
        this.f80873b = oh0Var;
    }

    public ny2(qu quVar) {
        this.f80872a = quVar;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(oe.c9 c9Var, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        oh0 oh0Var;
        return super.handleAction(c9Var, divViewFacade, expressionResolver) || ((oh0Var = this.f80873b) != null && oh0Var.handleAction(c9Var, divViewFacade, expressionResolver));
    }
}
