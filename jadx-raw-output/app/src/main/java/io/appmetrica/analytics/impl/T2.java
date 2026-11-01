package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class T2 implements IBinaryDataHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4688z6 f55889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55890b;

    /* JADX WARN: Code duplicated, block: B:15:0x003f A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0047, blocks: (B:7:0x001e, B:9:0x0024, B:11:0x002a, B:15:0x003f), top: B:27:0x001e }] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(@NonNull String str) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f55889a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    cursorQuery = sQLiteDatabaseA.query(this.f55890b, null, "data_key = ?", new String[]{str}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                                byte[] blob = cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("value"));
                                mo.a(cursorQuery);
                                this.f55889a.a(sQLiteDatabaseA);
                                return blob;
                            }
                            if (cursorQuery != null) {
                                cursorQuery.getCount();
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (cursorQuery != null) {
                        cursorQuery.getCount();
                    }
                } catch (Throwable unused2) {
                    cursorQuery = null;
                }
            } else {
                cursorQuery = null;
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
            sQLiteDatabaseA = null;
        }
        mo.a(cursorQuery);
        this.f55889a.a(sQLiteDatabaseA);
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(@NonNull String str, @NonNull byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = this.f55889a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabaseA.insertWithOnConflict(this.f55890b, null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f55889a.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(@NonNull String str) {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f55889a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabaseA.delete(this.f55890b, "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f55889a.a(sQLiteDatabaseA);
    }

    public T2(@NonNull InterfaceC4688z6 interfaceC4688z6, @NonNull String str) {
        this.f55889a = interfaceC4688z6;
        this.f55890b = str;
    }
}
