package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;
import ck.p;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class SdkNotInitializedException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkNotInitializedException(String str) {
        super("Please initialize the SDK before creating " + str + " ad");
        p.j(str, "adType");
    }
}
