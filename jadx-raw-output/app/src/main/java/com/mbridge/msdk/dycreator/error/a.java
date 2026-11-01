package com.mbridge.msdk.dycreator.error;

/* JADX INFO: compiled from: DyError.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34436b;

    public a(b bVar) {
        if (bVar != null) {
            this.f34435a = bVar.d();
            this.f34436b = bVar.g();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.f34435a + '}';
    }

    public a(int i10, String str) {
        this.f34435a = i10;
        this.f34436b = str;
    }
}
