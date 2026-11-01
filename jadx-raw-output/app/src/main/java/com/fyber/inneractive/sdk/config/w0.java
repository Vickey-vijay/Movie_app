package com.fyber.inneractive.sdk.config;

import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes3.dex */
public enum w0 {
    NO_CLICK("0"),
    CTA_BUTTON("1"),
    COMPANION("2"),
    VIDEO(ExifInterface.GPS_MEASUREMENT_3D),
    APP_INFO("4"),
    STORE_PROMO(CampaignEx.CLICKMODE_ON);

    public String value;

    public final String a() {
        return this.value;
    }

    w0(String str) {
        this.value = str;
    }
}
