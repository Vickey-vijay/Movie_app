package com.yandex.div.core.view2.divs;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bk.l;
import com.yandex.div.R$id;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mj.r;
import nj.s;

/* JADX INFO: compiled from: DivActionBinder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionBinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void observe(View view, List<DivAction> list, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if ((view instanceof ExpressionSubscriber) && list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ExpressionSubscriber) view).addSubscription(((DivAction) it.next()).f46031b.observe(expressionResolver, lVar));
            }
        }
    }

    private static final boolean isPenetratingLongClickable(View view) {
        Object tag = view.getTag(R$id.div_penetrating_longtap_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<DivAction> onlyEnabled(List<DivAction> list, ExpressionResolver expressionResolver) {
        if (list == null) {
            return s.k();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((DivAction) obj).f46031b.evaluate(expressionResolver).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setPenetratingLongClickable(View view, Boolean bool) {
        view.setTag(R$id.div_penetrating_longtap_tag, bool);
    }

    public static /* synthetic */ void setPenetratingLongClickable$default(View view, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = Boolean.TRUE;
        }
        setPenetratingLongClickable(view, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureFocusIfNeeded(View view, Expression<Boolean> expression, InputFocusTracker inputFocusTracker, ExpressionResolver expressionResolver) {
        if (expression.evaluate(expressionResolver).booleanValue()) {
            BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
            view.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearFocusIfNeeded(View view, Expression<Boolean> expression, InputFocusTracker inputFocusTracker, ExpressionResolver expressionResolver) {
        if (expression.evaluate(expressionResolver).booleanValue()) {
            BaseDivViewExtensionsKt.clearFocusOnClick(view, inputFocusTracker);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parentIsLongClickable(View view) {
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return false;
        }
        if (!isPenetratingLongClickable(viewGroup) && !parentIsLongClickable(viewGroup)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void observe(View view, Expression<Boolean> expression, ExpressionResolver expressionResolver, l<Object, r> lVar) {
        if (view instanceof ExpressionSubscriber) {
            ((ExpressionSubscriber) view).addSubscription(expression.observe(expressionResolver, lVar));
        }
    }
}
