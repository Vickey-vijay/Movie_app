package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public final class InvalidPlacementIdException extends IllegalArgumentException {
    public InvalidPlacementIdException() {
        super("AdPlacement id value is not supplied in XML layout. Banner creation failed.");
    }
}
