package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class El {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f55203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f55204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f55206f;

    public El(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f55201a = str;
        this.f55202b = str2;
        this.f55203c = num;
        this.f55204d = num2;
        this.f55205e = str3;
        this.f55206f = bool;
    }

    public El(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
