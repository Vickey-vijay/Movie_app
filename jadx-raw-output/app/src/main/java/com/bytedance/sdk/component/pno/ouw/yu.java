package com.bytedance.sdk.component.pno.ouw;

import com.bytedance.sdk.component.pno.ouw.lh;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class yu<T extends lh> {
    public BlockingQueue<T> vt = new LinkedBlockingQueue();
    public int ouw = 2;

    public final T ouw() {
        return this.vt.poll();
    }
}
