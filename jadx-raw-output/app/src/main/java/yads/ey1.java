package yads;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class ey1 implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f77224b = "YandexAds.UrlTracker";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f77225c = "YandexAds.BaseController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77226a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f77226a);
    }

    public ey1(String str) {
        this.f77226a = str;
    }
}
