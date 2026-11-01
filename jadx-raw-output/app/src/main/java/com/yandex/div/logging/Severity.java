package com.yandex.div.logging;

/* JADX INFO: compiled from: Severity.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum Severity {
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;

    public final boolean isAtLeast(Severity severity) {
        if (ordinal() >= severity.ordinal()) {
            return true;
        }
        return false;
    }
}
