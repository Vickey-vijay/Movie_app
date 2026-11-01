package com.mgs.carparking.netbean;

import ck.p;

/* JADX INFO: compiled from: VideoSetSpeedEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class VideoSetSpeedEntry {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f41517id;
    private boolean isSelector;
    private String name;

    public VideoSetSpeedEntry(int i10, String str, boolean z10) {
        p.j(str, "name");
        this.f41517id = i10;
        this.name = str;
        this.isSelector = z10;
    }

    public final int getId() {
        return this.f41517id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setId(int i10) {
        this.f41517id = i10;
    }

    public final void setName(String str) {
        p.j(str, "<set-?>");
        this.name = str;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }
}
