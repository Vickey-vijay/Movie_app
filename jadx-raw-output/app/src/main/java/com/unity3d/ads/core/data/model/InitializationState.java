package com.unity3d.ads.core.data.model;

import ck.p;
import java.util.Locale;

/* JADX INFO: compiled from: InitializationState.kt */
/* JADX INFO: loaded from: classes10.dex */
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    @Override // java.lang.Enum
    public String toString() {
        String string = super.toString();
        Locale locale = Locale.getDefault();
        p.i(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
