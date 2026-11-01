package com.bytedance.sdk.component.ra.lh;

/* JADX INFO: loaded from: classes4.dex */
public class lh {
    private ouw ouw;
    private vt vt;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ra.lh.lh$lh, reason: collision with other inner class name */
    public static class C0096lh {
        private static final lh ouw = new lh(0);
    }

    public enum ouw {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public interface vt {
        void ouw(String str, String str2);
    }

    public /* synthetic */ lh(byte b10) {
        this();
    }

    public static void ouw(ouw ouwVar) {
        synchronized (lh.class) {
            C0096lh.ouw.ouw = ouwVar;
        }
    }

    private lh() {
        this.ouw = ouw.OFF;
        this.vt = new com.bytedance.sdk.component.ra.lh.vt();
    }

    public static void ouw(String str, String str2) {
        if (C0096lh.ouw.ouw.compareTo(ouw.ERROR) <= 0) {
            C0096lh.ouw.vt.ouw(str, str2);
        }
    }
}
