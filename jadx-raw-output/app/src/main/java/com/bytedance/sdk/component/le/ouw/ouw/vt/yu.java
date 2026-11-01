package com.bytedance.sdk.component.le.ouw.ouw.vt;

import com.bytedance.sdk.component.le.ouw.yu.ouw;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yu<T extends com.bytedance.sdk.component.le.ouw.yu.ouw> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Queue<String> f11809lh;
    private com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouw;
    private Queue<T> vt = new ConcurrentLinkedQueue();
    private String yu;

    public final void ouw(T t10) {
        Queue<T> queue = this.vt;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public final synchronized boolean vt(int i10) {
        int size = this.vt.size();
        int i11 = this.ouw.ouw;
        com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
        if (i10 != 2 && i10 != 1) {
            return size >= i11;
        }
        com.bytedance.sdk.component.le.ouw.lh.ouw.yu();
        return size >= i11;
    }

    public yu(com.bytedance.sdk.component.le.ouw.yu.vt.ouw ouwVar, Queue<String> queue, String str) {
        this.ouw = ouwVar;
        this.f11809lh = queue;
        this.yu = str;
    }

    public final synchronized List<com.bytedance.sdk.component.le.ouw.yu.ouw> ouw(int i10) {
        if (!vt(i10)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.ouw.ouw);
        do {
            T tPoll = this.vt.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.ouw.vt);
        return arrayList;
    }

    public final synchronized void ouw(int i10, List<T> list) {
        try {
            if (i10 != -1 && i10 != 200 && i10 != 509) {
                this.vt.addAll(list);
            } else {
                this.vt.size();
                com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
