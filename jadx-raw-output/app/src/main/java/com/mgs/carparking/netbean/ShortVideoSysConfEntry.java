package com.mgs.carparking.netbean;

import java.util.List;

/* JADX INFO: compiled from: ShortVideoSysConfEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ShortVideoSysConfEntry {
    private List<String> channel;
    private boolean isAudit;
    private int version;

    public final List<String> getChannel() {
        return this.channel;
    }

    public final int getVersion() {
        return this.version;
    }

    public final boolean isAudit() {
        return this.isAudit;
    }

    public final void setAudit(boolean z10) {
        this.isAudit = z10;
    }

    public final void setChannel(List<String> list) {
        this.channel = list;
    }

    public final void setVersion(int i10) {
        this.version = i10;
    }
}
