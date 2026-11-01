package com.mgs.carparking.netbean;

import java.io.Serializable;

/* JADX INFO: compiled from: ApiconfEntry.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ApiconfEntry implements Serializable {
    private String api;
    private int is_open;

    public final String getApi() {
        return this.api;
    }

    public final int is_open() {
        return this.is_open;
    }

    public final void setApi(String str) {
        this.api = str;
    }

    public final void set_open(int i10) {
        this.is_open = i10;
    }
}
