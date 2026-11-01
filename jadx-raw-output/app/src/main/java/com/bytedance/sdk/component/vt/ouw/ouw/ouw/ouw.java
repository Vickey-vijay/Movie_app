package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw extends com.bytedance.sdk.component.vt.ouw.yu {
    public static volatile tlj ouw;
    private ExecutorService yu;
    public List<com.bytedance.sdk.component.vt.ouw.vt> vt = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private List<com.bytedance.sdk.component.vt.ouw.vt> f11945lh = new CopyOnWriteArrayList();

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final void ouw() {
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final int vt() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final List<com.bytedance.sdk.component.vt.ouw.vt> fkw() {
        return this.f11945lh;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final ExecutorService lh() {
        ExecutorService executorServiceOuw = ouw != null ? ouw.ouw() : null;
        return executorServiceOuw != null ? executorServiceOuw : this.yu;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final List<com.bytedance.sdk.component.vt.ouw.vt> yu() {
        return this.vt;
    }

    public ouw(ExecutorService executorService) {
        this.yu = executorService;
    }
}
