package com.mgs.carparking.netbean;

import ck.p;

/* JADX INFO: compiled from: SetLanguageEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SetLanguageEntry {
    private String detailname;
    private boolean isSelector;
    private String name;

    public SetLanguageEntry(String str, String str2, boolean z10) {
        p.j(str, "name");
        p.j(str2, "detailname");
        this.name = str;
        this.detailname = str2;
        this.isSelector = z10;
    }

    public final String getDetailname() {
        return this.detailname;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setDetailname(String str) {
        p.j(str, "<set-?>");
        this.detailname = str;
    }

    public final void setName(String str) {
        p.j(str, "<set-?>");
        this.name = str;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }
}
