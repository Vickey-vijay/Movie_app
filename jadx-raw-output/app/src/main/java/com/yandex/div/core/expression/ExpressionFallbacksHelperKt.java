package com.yandex.div.core.expression;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;

/* JADX INFO: compiled from: ExpressionFallbacksHelper.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ExpressionFallbacksHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpressionResolveFail(ParsingException parsingException) {
        if (parsingException.getReason() != ParsingExceptionReason.MISSING_VARIABLE && parsingException.getReason() != ParsingExceptionReason.INVALID_VALUE && parsingException.getReason() != ParsingExceptionReason.TYPE_MISMATCH) {
            return false;
        }
        return true;
    }
}
