package com.bytedance.sdk.openadsdk.core.ryl.ouw;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public enum ouw {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(TypedValues.Custom.TYPE_INT);

    public final int pno;

    ouw(int i10) {
        this.pno = i10;
    }
}
