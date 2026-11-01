package yads;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;

/* JADX INFO: loaded from: classes10.dex */
public final class nw extends DivActionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mw f80835a;

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression<Uri> expression = divAction.f46040k;
        boolean z10 = false;
        if (expression != null) {
            String string = expression.evaluate(expressionResolver).toString();
            if (ck.p.e(string, "close_ad")) {
                mw mwVar = this.f80835a;
                ng0.a(mwVar.f80405a);
                mwVar.f80406b.e();
            } else if (ck.p.e(string, "close_dialog")) {
                ng0.a(this.f80835a.f80405a);
            }
            z10 = true;
        }
        return z10 ? z10 : super.handleAction(divAction, divViewFacade, expressionResolver);
    }

    public nw(mw mwVar) {
        this.f80835a = mwVar;
    }
}
