package com.unity3d.services.core.extensions;

import ck.p;

/* JADX INFO: compiled from: TaskExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AbortRetryException extends Exception {
    private final String reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbortRetryException(String str) {
        super(str);
        p.j(str, "reason");
        this.reason = str;
    }
}
