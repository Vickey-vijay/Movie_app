package com.mgs.carparking.netbean;

import ck.p;

/* JADX INFO: compiled from: FeedbackTypeEntry.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class FeedbackTypeEntry {
    private boolean isFlag;
    private String name;

    public FeedbackTypeEntry(String str, boolean z10) {
        p.j(str, "name");
        this.name = str;
        this.isFlag = z10;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isFlag() {
        return this.isFlag;
    }

    public final void setFlag(boolean z10) {
        this.isFlag = z10;
    }

    public final void setName(String str) {
        p.j(str, "<set-?>");
        this.name = str;
    }
}
