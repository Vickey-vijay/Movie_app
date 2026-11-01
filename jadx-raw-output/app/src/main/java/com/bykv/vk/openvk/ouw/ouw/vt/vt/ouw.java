package com.bykv.vk.openvk.ouw.ouw.vt.vt;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw {
    public static boolean ouw() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }
}
