package com.liulishuo.filedownloader.event;

import q7.b;

/* JADX INFO: loaded from: classes9.dex */
public class DownloadServiceConnectChangedEvent extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConnectStatus f31867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<?> f31868d;

    public enum ConnectStatus {
        connected,
        disconnected,
        lost
    }

    public DownloadServiceConnectChangedEvent(ConnectStatus connectStatus, Class<?> cls) {
        super("event.service.connect.changed");
        this.f31867c = connectStatus;
        this.f31868d = cls;
    }

    public ConnectStatus b() {
        return this.f31867c;
    }
}
