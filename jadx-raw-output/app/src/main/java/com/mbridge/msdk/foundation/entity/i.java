package com.mbridge.msdk.foundation.entity;

import java.io.Serializable;

/* JADX INFO: compiled from: LoopEntity.java */
/* JADX INFO: loaded from: classes5.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34773c;

    public String d() {
        return this.f34772b;
    }

    public String g() {
        return this.f34773c;
    }

    public i(String str, String str2, int i10) {
        this.f34772b = str;
        this.f34773c = str2;
        this.f34771a = i10;
    }
}
