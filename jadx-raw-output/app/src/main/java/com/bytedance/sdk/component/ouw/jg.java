package com.bytedance.sdk.component.ouw;

/* JADX INFO: loaded from: classes5.dex */
public final class jg {
    public final String fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final String f11869le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final String f11870lh;
    public final int ouw;
    public final String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f11871ra;
    public final String vt;
    public final String yu;

    public static final class ouw {
        public String fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public String f11872le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f11873lh;
        public String ouw;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public String f11874ra;
        public String vt;
        public String yu;

        public /* synthetic */ ouw(byte b10) {
            this();
        }

        private ouw() {
        }
    }

    public /* synthetic */ jg(ouw ouwVar, byte b10) {
        this(ouwVar);
    }

    public jg(String str) {
        this.vt = null;
        this.f11870lh = null;
        this.yu = null;
        this.fkw = null;
        this.f11869le = str;
        this.f11871ra = null;
        this.ouw = -1;
        this.pno = null;
    }

    public final String toString() {
        return "methodName: " + this.yu + ", params: " + this.fkw + ", callbackId: " + this.f11869le + ", type: " + this.f11870lh + ", version: " + this.vt + ", ";
    }

    private jg(ouw ouwVar) {
        this.vt = ouwVar.ouw;
        this.f11870lh = ouwVar.vt;
        this.yu = ouwVar.f11873lh;
        this.fkw = ouwVar.yu;
        this.f11869le = ouwVar.fkw;
        this.f11871ra = ouwVar.f11872le;
        this.ouw = 1;
        this.pno = ouwVar.f11874ra;
    }
}
