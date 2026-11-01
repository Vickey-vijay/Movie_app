package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h {
    public static TokenParametersOuterClass$TokenParameters.NullableString a(String str) {
        y yVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableString.newBuilder();
        if (!TextUtils.isEmpty(str)) {
            yVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableString) yVarNewBuilder.f18286b).setData(str);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableString) yVarNewBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.NullableBool a(Boolean bool) {
        v vVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder();
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            vVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableBool) vVarNewBuilder.f18286b).setData(zBooleanValue);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableBool) vVarNewBuilder.a();
    }

    public static TokenParametersOuterClass$TokenParameters.NullableUInt32 a(int i10) {
        z zVarNewBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i10 > 0) {
            zVarNewBuilder.c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.f18286b).setData(i10);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableUInt32) zVarNewBuilder.a();
    }
}
