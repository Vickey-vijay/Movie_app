package com.yandex.div.core.extension;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivExtension;
import java.util.List;
import oe.e2;

/* JADX INFO: compiled from: DivExtensionController.kt */
/* JADX INFO: loaded from: classes11.dex */
public class DivExtensionController {
    private final List<DivExtensionHandler> extensionHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public DivExtensionController(List<? extends DivExtensionHandler> list) {
        this.extensionHandlers = list;
    }

    private boolean hasExtensions(e2 e2Var) {
        boolean z10;
        List<DivExtension> extensions = e2Var.getExtensions();
        if (extensions != null && !extensions.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || !(!this.extensionHandlers.isEmpty())) {
            return false;
        }
        return true;
    }

    public void beforeBindView(Div2View div2View, ExpressionResolver expressionResolver, View view, e2 e2Var) {
        if (!hasExtensions(e2Var)) {
            return;
        }
        for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
            if (divExtensionHandler.matches(e2Var)) {
                divExtensionHandler.beforeBindView(div2View, expressionResolver, view, e2Var);
            }
        }
    }

    public void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, e2 e2Var) {
        if (!hasExtensions(e2Var)) {
            return;
        }
        for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
            if (divExtensionHandler.matches(e2Var)) {
                divExtensionHandler.bindView(div2View, expressionResolver, view, e2Var);
            }
        }
    }

    public void preprocessExtensions(e2 e2Var, ExpressionResolver expressionResolver) {
        if (!hasExtensions(e2Var)) {
            return;
        }
        for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
            if (divExtensionHandler.matches(e2Var)) {
                divExtensionHandler.preprocess(e2Var, expressionResolver);
            }
        }
    }

    public void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, e2 e2Var) {
        if (!hasExtensions(e2Var)) {
            return;
        }
        for (DivExtensionHandler divExtensionHandler : this.extensionHandlers) {
            if (divExtensionHandler.matches(e2Var)) {
                divExtensionHandler.unbindView(div2View, expressionResolver, view, e2Var);
            }
        }
    }
}
