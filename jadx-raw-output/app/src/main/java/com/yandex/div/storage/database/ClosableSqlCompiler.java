package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: StorageStatementExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
final class ClosableSqlCompiler implements SqlCompiler, Closeable {

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private final DatabaseOpenHelper.Database f45867db;
    private final List<SQLiteStatement> createdStatements = new ArrayList();
    private final List<Cursor> createdCursors = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor compileQuery$lambda$2(ClosableSqlCompiler closableSqlCompiler, String str, String[] strArr) {
        Cursor cursorRawQuery = closableSqlCompiler.f45867db.rawQuery(str, strArr);
        closableSqlCompiler.createdCursors.add(cursorRawQuery);
        return cursorRawQuery;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<T> it = this.createdStatements.iterator();
        while (it.hasNext()) {
            SqlExtensionsKt.closeSilently((SQLiteStatement) it.next());
        }
        this.createdStatements.clear();
        for (Cursor cursor : this.createdCursors) {
            if (!cursor.isClosed()) {
                SqlExtensionsKt.closeSilently(cursor);
            }
        }
        this.createdCursors.clear();
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    public ReadState compileQuery(final String str, final String... strArr) {
        return new ReadState(null, new jj.a() { // from class: com.yandex.div.storage.database.a
            @Override // jj.a
            public final Object get() {
                return ClosableSqlCompiler.compileQuery$lambda$2(this.f45868a, str, strArr);
            }
        }, 1, null);
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    public SQLiteStatement compileStatement(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f45867db.compileStatement(str);
        this.createdStatements.add(sQLiteStatementCompileStatement);
        return sQLiteStatementCompileStatement;
    }

    public ClosableSqlCompiler(DatabaseOpenHelper.Database database) {
        this.f45867db = database;
    }
}
