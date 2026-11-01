package com.mbridge.msdk.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.safedk.android.internal.d;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes2.dex */
public class BannerSize {
    public static final int DEV_SET_TYPE = 5;
    public static final int LARGE_TYPE = 1;
    public static final int MEDIUM_TYPE = 2;
    public static final int SMART_TYPE = 3;
    public static final int STANDARD_TYPE = 4;
    private int height;
    private int width;

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public BannerSize(int i10, int i11, int i12) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            this.height = i12;
                            this.width = i11;
                            return;
                        }
                        return;
                    }
                    this.height = 50;
                    this.width = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
                    return;
                }
                setSmartMode();
                return;
            }
            this.height = 250;
            this.width = d.f44769a;
            return;
        }
        this.height = 90;
        this.width = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
    }

    private void setSmartMode() {
        if (m0.m(c.n().d()) < 720) {
            this.height = 50;
            this.width = Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE;
        } else {
            this.height = 90;
            this.width = 728;
        }
    }
}
