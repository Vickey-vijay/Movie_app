package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4061ac implements InterfaceC4688z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4304jn f56350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z9 f56351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z6 f56352e;

    public C4061ac(Context context, String str, @NonNull C4304jn c4304jn) {
        this(context, str, new Z9(str), c4304jn);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4688z6
    @Nullable
    @WorkerThread
    public final synchronized SQLiteDatabase a() {
        Z6 z10;
        try {
            this.f56351d.a();
            z10 = new Z6(this.f56348a, this.f56349b, this.f56350c, PublicLogger.getAnonymousInstance());
            this.f56352e = z10;
        } catch (Throwable unused) {
            return null;
        }
        return z10.getWritableDatabase();
    }

    @VisibleForTesting
    public C4061ac(@NonNull Context context, @NonNull String str, @NonNull Z9 z10, @NonNull C4304jn c4304jn) {
        this.f56348a = context;
        this.f56349b = str;
        this.f56351d = z10;
        this.f56350c = c4304jn;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4688z6
    @WorkerThread
    public final synchronized void a(@Nullable SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        mo.a((Closeable) this.f56352e);
        this.f56351d.b();
        this.f56352e = null;
    }
}
