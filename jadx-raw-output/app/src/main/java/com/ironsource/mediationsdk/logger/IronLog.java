package com.ironsource.mediationsdk.logger;

import com.ironsource.C3523ib;

/* JADX INFO: loaded from: classes5.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IronSourceLogger.IronSourceTag f29856a;

    public void error(String str, Throwable th2) {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib(str, 3), th2);
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib(str, 2));
    }

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f29856a = ironSourceTag;
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib("", 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f29856a, new C3523ib("", 3));
    }
}
