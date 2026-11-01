package com.ironsource.mediationsdk.logger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class IronSourceLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f29860b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    public IronSourceLogger(String str) {
        this.f29860b = str;
        this.f29859a = 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IronSourceLogger)) {
            return false;
        }
        IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
        String str = this.f29860b;
        return str != null && str.equals(ironSourceLogger.f29860b);
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th2);

    public int a() {
        return this.f29859a;
    }

    public String b() {
        return this.f29860b;
    }

    public void setDebugLevel(int i10) {
        this.f29859a = i10;
    }

    public IronSourceLogger(String str, int i10) {
        this.f29860b = str;
        this.f29859a = i10;
    }
}
