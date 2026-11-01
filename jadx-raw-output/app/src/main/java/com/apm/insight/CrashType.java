package com.apm.insight;

/* JADX INFO: loaded from: classes2.dex */
public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL("all");

    private String mName;

    public final String getName() {
        return this.mName;
    }

    CrashType(String str) {
        this.mName = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return getName();
    }
}
