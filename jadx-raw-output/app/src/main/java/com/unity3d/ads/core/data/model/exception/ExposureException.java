package com.unity3d.ads.core.data.model.exception;

import ck.p;

/* JADX INFO: compiled from: ExposureException.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ExposureException extends Exception {
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(String str, Object[] objArr) {
        super(str);
        p.j(str, "message");
        p.j(objArr, "parameters");
        this.parameters = objArr;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
