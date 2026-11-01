package com.yandex.div.storage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import bk.a;
import bk.l;
import ck.i;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivStorageImpl;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import com.yandex.div.storage.database.DatabaseOpenHelperProvider;
import com.yandex.div.storage.database.ExecutionResult;
import com.yandex.div.storage.database.Migration;
import com.yandex.div.storage.database.ReadState;
import com.yandex.div.storage.database.SingleTransactionDataSavePerformer;
import com.yandex.div.storage.database.StorageStatementExecutor;
import com.yandex.div.storage.database.StorageStatements;
import com.yandex.div.storage.rawjson.RawJson;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.b;
import mj.g;
import mj.h;
import mj.r;
import nj.b0;
import nj.l0;
import nj.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStorageImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
public class DivStorageImpl implements DivStorage {
    public static final Companion Companion = new Companion(null);
    private final SingleTransactionDataSavePerformer dataSaveUseCase;
    private final String dbName;
    private final Migration defaultDropAllMigration;
    private final Map<Pair<Integer, Integer>, Migration> migrations;
    private final DatabaseOpenHelper openHelper;
    private final StorageStatementExecutor statementExecutor;

    /* JADX INFO: compiled from: DivStorageImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> String asSqlList(Collection<? extends T> collection) {
            return b0.p0(collection, "', '", "('", "')", 0, null, null, 56, null);
        }
    }

    /* JADX INFO: compiled from: DivStorageImpl.kt */
    public final class CursorDrivenRawJson implements RawJson, Closeable {
        private final Cursor cursor;
        private boolean cursorInvalid;
        private final g data$delegate;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final String f45866id;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.cursorInvalid = true;
        }

        public CursorDrivenRawJson(Cursor cursor) {
            this.cursor = cursor;
            this.f45866id = cursor.getString(DivStorageImpl.this.indexOf(cursor, "raw_json_id"));
            this.data$delegate = b.b(LazyThreadSafetyMode.NONE, new a<JSONObject>() { // from class: com.yandex.div.storage.DivStorageImpl$CursorDrivenRawJson$data$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final JSONObject invoke() {
                    if (this.this$0.cursorInvalid) {
                        throw new IllegalStateException("Data no longer valid!");
                    }
                    return divStorageImpl.toJSONObject(this.this$0.getCursor().getBlob(divStorageImpl.indexOf(this.this$0.getCursor(), "raw_json_data")));
                }
            });
        }

        public final Cursor getCursor() {
            return this.cursor;
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        public JSONObject getData() {
            return (JSONObject) this.data$delegate.getValue();
        }

        @Override // com.yandex.div.storage.rawjson.RawJson
        public String getId() {
            return this.f45866id;
        }
    }

    @AnyThread
    private List<RawJson> collectsRawJsons(final Set<String> set) throws IOException, SQLException {
        ArrayList arrayList = new ArrayList(set.size());
        ReadState stateFor = readStateFor(new l<DatabaseOpenHelper.Database, Cursor>() { // from class: com.yandex.div.storage.DivStorageImpl.collectsRawJsons.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public final Cursor invoke(DatabaseOpenHelper.Database database) {
                return database.rawQuery("\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n " + DivStorageImpl.Companion.asSqlList(set), new String[0]);
            }
        });
        try {
            Cursor cursor = stateFor.getCursor();
            if (cursor.getCount() != 0 && cursor.moveToFirst()) {
                do {
                    CursorDrivenRawJson cursorDrivenRawJson = new CursorDrivenRawJson(cursor);
                    arrayList.add(new RawJson.Ready(cursorDrivenRawJson.getId(), cursorDrivenRawJson.getData()));
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
            r rVar = r.f64562a;
            yj.b.a(stateFor, null);
            return arrayList;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                yj.b.a(stateFor, th2);
                throw th3;
            }
        }
    }

    @AnyThread
    private Set<String> collectsRawJsonsIdsFor(final l<? super RawJson, Boolean> lVar) throws SQLException {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        getStatementExecutor().execute(StorageStatements.INSTANCE.readRawJsons(new l<ReadState, r>() { // from class: com.yandex.div.storage.DivStorageImpl.collectsRawJsonsIdsFor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(ReadState readState) {
                invoke2(readState);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ReadState readState) {
                Cursor cursor = readState.getCursor();
                if (cursor.getCount() == 0 || !cursor.moveToFirst()) {
                    return;
                }
                do {
                    CursorDrivenRawJson cursorDrivenRawJson = DivStorageImpl.this.new CursorDrivenRawJson(cursor);
                    if (lVar.invoke(cursorDrivenRawJson).booleanValue()) {
                        linkedHashSet.add(cursorDrivenRawJson.getId());
                    }
                    cursorDrivenRawJson.close();
                } while (cursor.moveToNext());
            }
        }));
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void migrations$lambda$0(DatabaseOpenHelper.Database database) {
        try {
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e10) {
            throw new SQLException("Create \"raw_json\" table", e10);
        }
    }

    @AnyThread
    private ReadState readStateFor(final l<? super DatabaseOpenHelper.Database, ? extends Cursor> lVar) {
        final DatabaseOpenHelper.Database readableDatabase = this.openHelper.getReadableDatabase();
        return new ReadState(new a<r>() { // from class: com.yandex.div.storage.DivStorageImpl.readStateFor.1
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                SqlExtensionsKt.closeSilently(readableDatabase);
            }
        }, new jj.a() { // from class: me.b
            @Override // jj.a
            public final Object get() {
                return DivStorageImpl.readStateFor$lambda$12(readableDatabase, lVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject toJSONObject(byte[] bArr) {
        return new JSONObject(new String(bArr, StandardCharsets.UTF_8));
    }

    private DivStorageErrorException toStorageException(Exception exc, String str, String str2) {
        return new DivStorageErrorException("Unexpected exception on database access: " + str, exc, str2);
    }

    public static /* synthetic */ DivStorageErrorException toStorageException$default(DivStorageImpl divStorageImpl, Exception exc, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toStorageException");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return divStorageImpl.toStorageException(exc, str, str2);
    }

    @VisibleForTesting
    public void createTables(DatabaseOpenHelper.Database database) throws SQLException {
        try {
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)");
            database.execSQL("\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)");
        } catch (SQLException e10) {
            throw new SQLException("Create tables", e10);
        }
    }

    @VisibleForTesting
    public void dropTables(final DatabaseOpenHelper.Database database) throws SQLException {
        new StorageStatementExecutor(new a<DatabaseOpenHelper.Database>() { // from class: com.yandex.div.storage.DivStorageImpl.dropTables.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final DatabaseOpenHelper.Database invoke() {
                return database;
            }
        }).execute(StorageStatements.INSTANCE.dropAllTables());
    }

    public Map<Pair<Integer, Integer>, Migration> getMigrations() {
        return this.migrations;
    }

    public StorageStatementExecutor getStatementExecutor() {
        return this.statementExecutor;
    }

    @VisibleForTesting
    public void onUpgrade(DatabaseOpenHelper.Database database, int i10, int i11) {
        KAssert kAssert = KAssert.INSTANCE;
        Integer numValueOf = Integer.valueOf(i11);
        if (Assert.isEnabled()) {
            Assert.assertEquals("", numValueOf, 3);
        }
        if (i10 == 3) {
            return;
        }
        Migration migration = getMigrations().get(h.a(Integer.valueOf(i10), Integer.valueOf(i11)));
        if (migration == null) {
            migration = this.defaultDropAllMigration;
        }
        try {
            migration.migrate(database);
        } catch (SQLException e10) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Migration from " + i10 + " to " + i11 + " throws exception", e10);
            }
            this.defaultDropAllMigration.migrate(database);
        }
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    public DivStorage.LoadDataResult<RawJson> readRawJsons(Set<String> set) throws IOException {
        String str = "Read raw jsons with ids: " + set;
        ArrayList arrayList = new ArrayList();
        List<RawJson> listK = s.k();
        try {
            listK = collectsRawJsons(set);
        } catch (SQLException e10) {
            arrayList.add(toStorageException$default(this, e10, str, null, 2, null));
        } catch (IllegalStateException e11) {
            arrayList.add(toStorageException$default(this, e11, str, null, 2, null));
        }
        return new DivStorage.LoadDataResult<>(listK, arrayList);
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    public ExecutionResult saveRawJsons(List<? extends RawJson> list, DivDataRepository.ActionOnError actionOnError) {
        return this.dataSaveUseCase.saveRawJsons(list, actionOnError);
    }

    public DivStorageImpl(Context context, DatabaseOpenHelperProvider databaseOpenHelperProvider, String str) {
        boolean z10;
        String str2;
        if (str.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str2 = "div-storage.db";
        } else {
            str2 = str + "-div-storage.db";
        }
        String str3 = str2;
        this.dbName = str3;
        this.openHelper = databaseOpenHelperProvider.provide(context, str3, 3, new DivStorageImpl$openHelper$1(this), new DivStorageImpl$openHelper$2(this));
        this.statementExecutor = new StorageStatementExecutor(new a<DatabaseOpenHelper.Database>() { // from class: com.yandex.div.storage.DivStorageImpl$statementExecutor$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final DatabaseOpenHelper.Database invoke() {
                return this.this$0.openHelper.getWritableDatabase();
            }
        });
        this.dataSaveUseCase = new SingleTransactionDataSavePerformer(getStatementExecutor());
        this.migrations = l0.g(h.a(h.a(2, 3), new Migration() { // from class: me.c
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.migrations$lambda$0(database);
            }
        }));
        this.defaultDropAllMigration = new Migration() { // from class: me.d
            @Override // com.yandex.div.storage.database.Migration
            public final void migrate(DatabaseOpenHelper.Database database) {
                DivStorageImpl.defaultDropAllMigration$lambda$1(this.f64394a, database);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void defaultDropAllMigration$lambda$1(DivStorageImpl divStorageImpl, DatabaseOpenHelper.Database database) {
        divStorageImpl.dropTables(database);
        divStorageImpl.createTables(database);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        throw new IllegalStateException("Column '" + str + "' not found in cursor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor readStateFor$lambda$12(DatabaseOpenHelper.Database database, l lVar) {
        return (Cursor) lVar.invoke(database);
    }

    @VisibleForTesting
    public void onCreate(DatabaseOpenHelper.Database database) {
        createTables(database);
    }

    @Override // com.yandex.div.storage.DivStorage
    @AnyThread
    public DivStorage.RemoveResult removeRawJsons(l<? super RawJson, Boolean> lVar) {
        Set<String> setCollectsRawJsonsIdsFor = collectsRawJsonsIdsFor(lVar);
        return new DivStorage.RemoveResult(setCollectsRawJsonsIdsFor, getStatementExecutor().execute(DivDataRepository.ActionOnError.SKIP_ELEMENT, StorageStatements.INSTANCE.deleteRawJsons(setCollectsRawJsonsIdsFor)).getErrors());
    }
}
