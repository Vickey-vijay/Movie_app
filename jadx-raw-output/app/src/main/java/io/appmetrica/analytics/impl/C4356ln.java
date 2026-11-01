package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4356ln implements InterfaceC4330kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f57233a;

    @VisibleForTesting(otherwise = 5)
    public final HashMap<String, List<String>> a() {
        return this.f57233a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4330kn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry entry : this.f57233a.entrySet()) {
                try {
                    Cursor cursorQuery = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        mo.a(cursorQuery);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= list.equals(listAsList);
                    mo.a(cursorQuery);
                } catch (Throwable th2) {
                    mo.a((Cursor) null);
                    throw th2;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }

    public C4356ln(@NonNull String str, @NonNull HashMap<String, List<String>> map) {
        this.f57233a = map;
    }
}
