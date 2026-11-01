package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4503rl implements InterfaceC4688z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z6 f57613a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4688z6
    public final void a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4688z6
    @Nullable
    public final SQLiteDatabase a() {
        try {
            return this.f57613a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    public C4503rl(Z6 z10) {
        this.f57613a = z10;
    }
}
