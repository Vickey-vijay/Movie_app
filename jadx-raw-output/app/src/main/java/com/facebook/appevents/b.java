package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

/* JADX INFO: compiled from: AnalyticsUserIDStore.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0002H\u0002R\u001c\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/b;", "", "Lmj/r;", "d", "", "b", "c", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "userID", "", "e", "Z", "initialized", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f14174a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = b.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static String userID;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean initialized;

    public static final String b() {
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            f14174a.c();
        }
        lock.readLock().lock();
        try {
            return userID;
        } finally {
            lock.readLock().unlock();
        }
    }

    public static final void d() {
        if (initialized) {
            return;
        }
        x.INSTANCE.b().execute(new Runnable() { // from class: com.facebook.appevents.a
            @Override // java.lang.Runnable
            public final void run() {
                b.e();
            }
        });
    }

    public static final void e() {
        f14174a.c();
    }

    public final void c() {
        if (initialized) {
            return;
        }
        lock.writeLock().lock();
        try {
            if (initialized) {
                return;
            }
            userID = PreferenceManager.getDefaultSharedPreferences(q1.t.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            initialized = true;
        } finally {
            lock.writeLock().unlock();
        }
    }
}
