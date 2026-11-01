package com.mbridge.msdk.mbsignalcommon.mapping;

/* JADX INFO: compiled from: Mapping.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f36070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36071b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f36070a = cls;
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.f36071b = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() != null) {
            return getClass().getName() + ": " + getCause();
        }
        return super.toString();
    }
}
