package yads;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;

/* JADX INFO: loaded from: classes8.dex */
public final class bi0 implements DivExtensionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh0 f75834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final di0 f75835b;

    public /* synthetic */ bi0(zh0 zh0Var) {
        this(zh0Var, new di0());
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, oe.e2 e2Var) {
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(oe.e2 e2Var) {
        return this.f75835b.a(e2Var) != null;
    }

    public bi0(zh0 zh0Var, di0 di0Var) {
        this.f75834a = zh0Var;
        this.f75835b = di0Var;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, oe.e2 e2Var) {
        Context context = view.getContext();
        ci0 ci0VarA = this.f75835b.a(e2Var);
        if (ci0VarA != null) {
            ou ouVar = new ou(context, new ai0(this.f75834a, ci0VarA));
            view.setOnTouchListener(ouVar);
            view.setOnClickListener(ouVar);
        }
    }
}
