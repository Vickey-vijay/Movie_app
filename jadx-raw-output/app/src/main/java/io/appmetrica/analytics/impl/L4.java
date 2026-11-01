package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* JADX INFO: loaded from: classes6.dex */
public final class L4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K4 f55505a = new K4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J4 f55506b = new J4();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) {
        this.f55505a.runScript(sQLiteDatabase);
        this.f55506b.runScript(sQLiteDatabase);
    }
}
