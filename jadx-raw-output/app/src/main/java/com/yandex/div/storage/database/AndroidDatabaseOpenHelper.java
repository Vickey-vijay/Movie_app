package com.yandex.div.storage.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.yandex.div.internal.Assert;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AndroidDatabaseOpenHelper.kt */
/* JADX INFO: loaded from: classes9.dex */
public class AndroidDatabaseOpenHelper implements DatabaseOpenHelper {
    private final DatabaseManager databaseManager;
    private final SQLiteOpenHelper mSQLiteOpenHelper;
    private final Object mOpenCloseLock = new Object();
    private final Map<SQLiteDatabase, OpenCloseInfo> mOpenCloseInfoMap = new HashMap();

    /* JADX INFO: compiled from: AndroidDatabaseOpenHelper.kt */
    public final class AndroidSQLiteDatabase implements DatabaseOpenHelper.Database {
        private final SQLiteDatabase mDb;
        private final OpenCloseInfo mOpenCloseInfo;

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
            return this.mDb.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }

        public AndroidSQLiteDatabase(SQLiteDatabase sQLiteDatabase, OpenCloseInfo openCloseInfo) {
            this.mDb = sQLiteDatabase;
            this.mOpenCloseInfo = openCloseInfo;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void beginTransaction() {
            this.mDb.beginTransaction();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            AndroidDatabaseOpenHelper.this.databaseManager.closeDatabase(this.mDb);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public SQLiteStatement compileStatement(String str) {
            return this.mDb.compileStatement(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void endTransaction() {
            this.mDb.endTransaction();
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void execSQL(String str) {
            this.mDb.execSQL(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public Cursor rawQuery(String str, String[] strArr) {
            return this.mDb.rawQuery(str, strArr);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void setTransactionSuccessful() {
            this.mDb.setTransactionSuccessful();
        }
    }

    /* JADX INFO: compiled from: AndroidDatabaseOpenHelper.kt */
    public static final class OpenCloseInfo {
        private int currentlyOpenedCount;

        public final int getCurrentlyOpenedCount() {
            return this.currentlyOpenedCount;
        }

        public final void setCurrentlyOpenedCount(int i10) {
            this.currentlyOpenedCount = i10;
        }
    }

    /* JADX INFO: compiled from: AndroidDatabaseOpenHelper.kt */
    public static final class DatabaseManager {
        private final SQLiteOpenHelper databaseHelper;
        private SQLiteDatabase readableDatabase;
        private int readableUsersCount;
        private SQLiteDatabase writableDatabase;
        private int writableUsersCount;
        private final Set<Thread> readableUsers = new LinkedHashSet();
        private final Set<Thread> writableUsers = new LinkedHashSet();

        public final synchronized void closeDatabase(SQLiteDatabase sQLiteDatabase) {
            if (p.e(sQLiteDatabase, this.writableDatabase)) {
                this.writableUsers.remove(Thread.currentThread());
                if (this.writableUsers.isEmpty()) {
                    while (true) {
                        int i10 = this.writableUsersCount;
                        this.writableUsersCount = i10 - 1;
                        if (i10 <= 0) {
                            break;
                        }
                        SQLiteDatabase sQLiteDatabase2 = this.writableDatabase;
                        p.g(sQLiteDatabase2);
                        sQLiteDatabase2.close();
                    }
                }
            } else if (p.e(sQLiteDatabase, this.readableDatabase)) {
                this.readableUsers.remove(Thread.currentThread());
                if (this.readableUsers.isEmpty()) {
                    while (true) {
                        int i11 = this.readableUsersCount;
                        this.readableUsersCount = i11 - 1;
                        if (i11 <= 0) {
                            break;
                        }
                        SQLiteDatabase sQLiteDatabase3 = this.readableDatabase;
                        p.g(sQLiteDatabase3);
                        sQLiteDatabase3.close();
                    }
                }
            } else {
                Assert.fail("Trying to close unknown database from DatabaseManager");
                sQLiteDatabase.close();
            }
        }

        public final synchronized SQLiteDatabase openReadableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.readableDatabase = this.databaseHelper.getReadableDatabase();
            this.readableUsersCount++;
            this.readableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.readableDatabase;
            p.g(sQLiteDatabase);
            return sQLiteDatabase;
        }

        public final synchronized SQLiteDatabase openWritableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.writableDatabase = this.databaseHelper.getWritableDatabase();
            this.writableUsersCount++;
            this.writableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.writableDatabase;
            p.g(sQLiteDatabase);
            return sQLiteDatabase;
        }

        public DatabaseManager(SQLiteOpenHelper sQLiteOpenHelper) {
            this.databaseHelper = sQLiteOpenHelper;
        }
    }

    private OpenCloseInfo getOpenCloseInfo(SQLiteDatabase sQLiteDatabase) {
        OpenCloseInfo openCloseInfo;
        synchronized (this.mOpenCloseLock) {
            openCloseInfo = this.mOpenCloseInfoMap.get(sQLiteDatabase);
            if (openCloseInfo == null) {
                openCloseInfo = new OpenCloseInfo();
                this.mOpenCloseInfoMap.put(sQLiteDatabase, openCloseInfo);
            }
            openCloseInfo.setCurrentlyOpenedCount(openCloseInfo.getCurrentlyOpenedCount() + 1);
            openCloseInfo.getCurrentlyOpenedCount();
        }
        return openCloseInfo;
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    public DatabaseOpenHelper.Database getReadableDatabase() {
        return wrapDataBase(this.databaseManager.openReadableDatabase());
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    public DatabaseOpenHelper.Database getWritableDatabase() {
        return wrapDataBase(this.databaseManager.openWritableDatabase());
    }

    @VisibleForTesting
    public DatabaseOpenHelper.Database wrapDataBase(SQLiteDatabase sQLiteDatabase) {
        return new AndroidSQLiteDatabase(sQLiteDatabase, getOpenCloseInfo(sQLiteDatabase));
    }

    public AndroidDatabaseOpenHelper(Context context, String str, int i10, final DatabaseOpenHelper.CreateCallback createCallback, final DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
        SQLiteOpenHelper sQLiteOpenHelper = new SQLiteOpenHelper(context, str, i10) { // from class: com.yandex.div.storage.database.AndroidDatabaseOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                createCallback.onCreate(this.wrapDataBase(sQLiteDatabase));
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
                upgradeCallback.onUpgrade(this.wrapDataBase(sQLiteDatabase), i11, i12);
            }
        };
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
        this.databaseManager = new DatabaseManager(sQLiteOpenHelper);
    }
}
