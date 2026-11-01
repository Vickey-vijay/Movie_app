package com.bytedance.sdk.component.vt.ouw;

/* JADX INFO: loaded from: classes.dex */
public class mwh {
    public byte[] fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ouw f11940le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public bly f11941lh;
    public String yu;

    public enum ouw {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public mwh() {
    }

    private mwh(bly blyVar, String str, ouw ouwVar) {
        this.f11941lh = blyVar;
        this.yu = str;
        this.f11940le = ouwVar;
    }

    public static mwh ouw(bly blyVar, String str) {
        return new mwh(blyVar, str, ouw.STRING_TYPE);
    }

    public mwh(bly blyVar, byte[] bArr, ouw ouwVar) {
        this.f11941lh = blyVar;
        this.fkw = bArr;
        this.f11940le = ouwVar;
    }
}
