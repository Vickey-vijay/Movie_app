package com.digitalturbine.ignite.authenticator.events;

import io.bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    ENCRYPTION_EXCEPTION(1100),
    RAW_ONE_DT_ERROR(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE),
    ONE_DT_PARSE_ERROR(1102),
    ONE_DT_AUTHENTICATION_ERROR(1103),
    ONE_DT_BROADCAST_ERROR(1104),
    ONE_DT_REQUEST_ERROR(1105),
    ONE_DT_GENERAL_ERROR(1106);

    public int mVal;

    public final int a() {
        return this.mVal;
    }

    d(int i10) {
        this.mVal = i10;
    }
}
