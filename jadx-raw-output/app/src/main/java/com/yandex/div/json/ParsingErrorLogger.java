package com.yandex.div.json;

import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;
import com.yandex.div.json.ParsingErrorLogger;

/* JADX INFO: loaded from: classes7.dex */
public interface ParsingErrorLogger {
    public static final ParsingErrorLogger LOG = new ParsingErrorLogger() { // from class: le.a
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ParsingErrorLogger.lambda$static$0(exc);
        }
    };
    public static final ParsingErrorLogger ASSERT = new ParsingErrorLogger() { // from class: le.b
        @Override // com.yandex.div.json.ParsingErrorLogger
        public final void logError(Exception exc) {
            ParsingErrorLogger.lambda$static$1(exc);
        }
    };

    void logError(@NonNull Exception exc);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$0(Exception exc) {
        if (Log.isEnabled()) {
            Log.e("ParsingErrorLogger", "An error occurred during parsing process", exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$static$1(Exception exc) {
        if (Assert.isEnabled()) {
            Assert.fail(exc.getMessage(), exc);
        }
    }

    default void logTemplateError(@NonNull Exception exc, @NonNull String str) {
        logError(exc);
    }
}
