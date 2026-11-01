package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes9.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final int f45;

    public static ISAdQualityDeviceIdType fromInt(int i10) {
        if (i10 == 0) {
            return NONE;
        }
        if (i10 == 1) {
            return GAID;
        }
        if (i10 != 2) {
            return null;
        }
        return IDFA;
    }

    public final int getValue() {
        return this.f45;
    }

    ISAdQualityDeviceIdType(int i10) {
        this.f45 = i10;
    }
}
