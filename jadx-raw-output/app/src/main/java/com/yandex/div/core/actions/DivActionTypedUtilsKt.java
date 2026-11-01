package com.yandex.div.core.actions;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivTypedValue;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DivActionTypedUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionTypedUtilsKt {
    public static final Integer colorIntValue(DivTypedValue divTypedValue, ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.c) {
            return ((DivTypedValue.c) divTypedValue).c().f45906a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final Double doubleValue(DivTypedValue divTypedValue, ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.f) {
            return Double.valueOf(((DivTypedValue.f) divTypedValue).c().f50148a.evaluate(expressionResolver).longValue());
        }
        if (divTypedValue instanceof DivTypedValue.g) {
            return ((DivTypedValue.g) divTypedValue).c().f50469a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final Object evaluate(DivTypedValue divTypedValue, ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.f) {
            return ((DivTypedValue.f) divTypedValue).c().f50148a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.h) {
            return ((DivTypedValue.h) divTypedValue).c().f50520a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.b) {
            return ((DivTypedValue.b) divTypedValue).c().f45890a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.c) {
            return ((DivTypedValue.c) divTypedValue).c().f45906a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.g) {
            return ((DivTypedValue.g) divTypedValue).c().f50469a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.i) {
            return ((DivTypedValue.i) divTypedValue).c().f50536a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.a) {
            return ((DivTypedValue.a) divTypedValue).c().f45874a.evaluate(expressionResolver);
        }
        if (divTypedValue instanceof DivTypedValue.e) {
            return ((DivTypedValue.e) divTypedValue).c().f45936a.evaluate(expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Long longValue(DivTypedValue divTypedValue, ExpressionResolver expressionResolver) {
        if (divTypedValue instanceof DivTypedValue.f) {
            return ((DivTypedValue.f) divTypedValue).c().f50148a.evaluate(expressionResolver);
        }
        return null;
    }

    public static final void closeKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    public static final void logError(Div2View div2View, Throwable th2) {
        div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logError(th2);
    }

    public static final void logWarning(Div2View div2View, Throwable th2) {
        div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDataTag(), div2View.getDivData()).logWarning(th2);
    }

    public static final void openKeyboard(DivInputView divInputView) {
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(divInputView.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(divInputView, 1);
        }
    }
}
