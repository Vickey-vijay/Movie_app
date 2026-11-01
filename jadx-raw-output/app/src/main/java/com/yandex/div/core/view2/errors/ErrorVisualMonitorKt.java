package com.yandex.div.core.view2.errors;

import android.os.TransactionTooLargeException;

/* JADX INFO: compiled from: ErrorVisualMonitor.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ErrorVisualMonitorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean causedByTransactionTooLargeException(Throwable th2) {
        if (!(th2 instanceof TransactionTooLargeException)) {
            Throwable cause = th2.getCause();
            if (!(cause != null && causedByTransactionTooLargeException(cause))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getFullStackMessage(Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th2.getMessage());
        for (Throwable cause = th2.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append('\n');
            sb2.append(cause.getMessage());
        }
        return sb2.toString();
    }
}
