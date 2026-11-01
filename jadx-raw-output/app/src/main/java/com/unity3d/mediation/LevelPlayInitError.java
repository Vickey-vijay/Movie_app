package com.unity3d.mediation;

import ck.p;
import com.ironsource.C3617ne;

/* JADX INFO: loaded from: classes2.dex */
public final class LevelPlayInitError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f45325b;

    public LevelPlayInitError(int i10, String str) {
        p.j(str, "errorMessage");
        this.f45324a = i10;
        this.f45325b = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(C3617ne c3617ne) {
        this(c3617ne.c(), c3617ne.d());
        p.j(c3617ne, "sdkError");
    }

    public final int getErrorCode() {
        return this.f45324a;
    }

    public final String getErrorMessage() {
        return this.f45325b;
    }

    public String toString() {
        return "LevelPlayError(errorCode=" + this.f45324a + ", errorMessage='" + this.f45325b + "')";
    }
}
