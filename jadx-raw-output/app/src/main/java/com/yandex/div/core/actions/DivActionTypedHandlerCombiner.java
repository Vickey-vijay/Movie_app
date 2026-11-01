package com.yandex.div.core.actions;

import ck.i;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.KLog;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivActionTyped;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: DivActionTypedHandlerCombiner.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionTypedHandlerCombiner {
    private static final Companion Companion = new Companion(null);
    private final Set<DivActionTypedHandler> handlers;

    /* JADX INFO: compiled from: DivActionTypedHandlerCombiner.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final boolean handleAction(String str, DivActionTyped divActionTyped, Div2View div2View, ExpressionResolver expressionResolver) {
        Object next;
        Iterator<T> it = this.handlers.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((DivActionTypedHandler) next).handleAction(str, divActionTyped, div2View, expressionResolver));
        boolean z10 = next != null;
        if (!z10) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.DEBUG)) {
                kLog.print(3, "DivTypedActionHandlerCombiner", "Unexpected " + divActionTyped.getClass() + " was not handled");
            }
        }
        return z10;
    }

    public DivActionTypedHandlerCombiner(Set<DivActionTypedHandler> set) {
        this.handlers = set;
    }
}
