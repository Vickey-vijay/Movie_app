package com.fyber.inneractive.sdk.config.enums;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public enum CreativeType {
    PLAYABLE,
    NOT_SET;

    public static CreativeType fromValue(String str) {
        if (str == null) {
            return NOT_SET;
        }
        return "playable".equals(str.toLowerCase(Locale.US)) ? PLAYABLE : NOT_SET;
    }
}
