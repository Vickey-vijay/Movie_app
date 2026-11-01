package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import bk.l;
import ck.p;
import com.yandex.div.storage.rawjson.RawJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import lk.c;
import mj.g;
import mj.r;
import nj.b0;
import yj.b;

/* JADX INFO: compiled from: StorageStatements.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StorageStatements {
    public static final StorageStatements INSTANCE = new StorageStatements();

    private StorageStatements() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> String asSqlList(Collection<? extends T> collection) {
        return b0.p0(collection, "', '", "('", "')", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StorageStatement replaceRawJsons$default(StorageStatements storageStatements, List list, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = new l<List<? extends String>, r>() { // from class: com.yandex.div.storage.database.StorageStatements.replaceRawJsons.1
                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(List<? extends String> list2) {
                    invoke2((List<String>) list2);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<String> list2) {
                    throw new SQLException("Insertion failed for raw jsons with ids: " + b0.p0(list2, null, null, null, 0, null, null, 63, null));
                }
            };
        }
        return storageStatements.replaceRawJsons(list, lVar);
    }

    public final StorageStatement deleteRawJsons(final Set<String> set) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements.deleteRawJsons.1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(SqlCompiler sqlCompiler) {
                sqlCompiler.compileStatement("DELETE FROM raw_json WHERE raw_json_id IN " + StorageStatements.INSTANCE.asSqlList(set)).executeUpdateDelete();
            }

            public String toString() {
                return "Deleting raw jsons with ids: " + set;
            }
        };
    }

    public final StorageStatement dropAllTables() {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements.dropAllTables.1
            public String toString() {
                return "Drop all database tables";
            }

            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(SqlCompiler sqlCompiler) throws IOException {
                ArrayList arrayList = new ArrayList();
                ReadState readStateCompileQuery = sqlCompiler.compileQuery("SELECT name FROM sqlite_master WHERE type='table'", new String[0]);
                try {
                    Cursor cursor = readStateCompileQuery.getCursor();
                    if (!cursor.moveToFirst()) {
                        b.a(readStateCompileQuery, null);
                        return;
                    }
                    do {
                        arrayList.add(cursor.getString(cursor.getColumnIndexOrThrow("name")));
                    } while (cursor.moveToNext());
                    r rVar = r.f64562a;
                    b.a(readStateCompileQuery, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sqlCompiler.compileStatement("DROP TABLE IF EXISTS " + ((String) it.next())).execute();
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(readStateCompileQuery, th2);
                        throw th3;
                    }
                }
            }
        };
    }

    public final StorageStatement readRawJsons(final l<? super ReadState, r> lVar) {
        return new StorageStatement() { // from class: com.yandex.div.storage.database.StorageStatements.readRawJsons.1
            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(SqlCompiler sqlCompiler) throws IOException {
                ReadState readStateCompileQuery = sqlCompiler.compileQuery("SELECT * FROM raw_json", new String[0]);
                try {
                    lVar.invoke(readStateCompileQuery);
                    b.a(readStateCompileQuery, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(readStateCompileQuery, th2);
                        throw th3;
                    }
                }
            }

            public String toString() {
                return "Selecting all raw jsons";
            }
        };
    }

    public final StorageStatement replaceRawJsons(List<? extends RawJson> list, l<? super List<String>, r> lVar) {
        return new StorageStatement(list, lVar) { // from class: com.yandex.div.storage.database.StorageStatements.replaceRawJsons.2
            public final /* synthetic */ l<List<String>, r> $onFailedTransactions;
            public final /* synthetic */ List<RawJson> $rawJsons;
            private final g cardIdsString$delegate;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$rawJsons = list;
                this.$onFailedTransactions = lVar;
                this.cardIdsString$delegate = kotlin.b.b(LazyThreadSafetyMode.NONE, new bk.a<String>() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public final String invoke() {
                        return b0.p0(list, null, null, null, 0, null, new l<RawJson, CharSequence>() { // from class: com.yandex.div.storage.database.StorageStatements$replaceRawJsons$2$cardIdsString$2.1
                            @Override // bk.l
                            public final CharSequence invoke(RawJson rawJson) {
                                return rawJson.getId();
                            }
                        }, 31, null);
                    }
                });
            }

            private final String getCardIdsString() {
                return (String) this.cardIdsString$delegate.getValue();
            }

            @Override // com.yandex.div.storage.database.StorageStatement
            public void execute(SqlCompiler sqlCompiler) {
                ArrayList arrayList = new ArrayList();
                SQLiteStatement sQLiteStatementCompileStatement = sqlCompiler.compileStatement("INSERT OR REPLACE INTO raw_json VALUES (?, ?)");
                Iterator<T> it = this.$rawJsons.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RawJson rawJson = (RawJson) it.next();
                    sQLiteStatementCompileStatement.bindString(1, rawJson.getId());
                    byte[] bytes = rawJson.getData().toString().getBytes(c.f63591b);
                    p.i(bytes, "this as java.lang.String).getBytes(charset)");
                    sQLiteStatementCompileStatement.bindBlob(2, bytes);
                    Long lValueOf = Long.valueOf(sQLiteStatementCompileStatement.executeInsert());
                    if (!(lValueOf.longValue() < 0)) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        lValueOf.longValue();
                        arrayList.add(rawJson.getId());
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.$onFailedTransactions.invoke(arrayList);
                }
            }

            public String toString() {
                return "Replace raw jsons (" + getCardIdsString() + ')';
            }
        };
    }
}
