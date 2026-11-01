package com.unity3d.ads.core.data.model;

import ck.p;
import java.util.Locale;

/* JADX INFO: compiled from: OperationType.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    GET_TOKEN,
    UNIVERSAL_EVENT;

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
