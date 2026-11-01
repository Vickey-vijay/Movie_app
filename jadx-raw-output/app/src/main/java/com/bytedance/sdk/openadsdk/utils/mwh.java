package com.bytedance.sdk.openadsdk.utils;

import java.io.Closeable;

/* JADX INFO: loaded from: classes7.dex */
public final class mwh {
    public static void ouw(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.ko.lh(th2.getMessage());
            }
        }
    }
}
