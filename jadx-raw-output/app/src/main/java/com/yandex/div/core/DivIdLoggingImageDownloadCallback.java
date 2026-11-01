package com.yandex.div.core;

import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.view2.Div2View;

/* JADX INFO: compiled from: DivIdLoggingImageDownloadCallback.kt */
/* JADX INFO: loaded from: classes11.dex */
public class DivIdLoggingImageDownloadCallback extends DivImageDownloadCallback {
    private final String divId;

    public DivIdLoggingImageDownloadCallback(String str) {
        this.divId = str;
    }

    public DivIdLoggingImageDownloadCallback(Div2View div2View) {
        this(div2View.getLogId());
    }
}
