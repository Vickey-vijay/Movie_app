package com.yandex.div.storage.database;

import android.database.SQLException;
import androidx.annotation.AnyThread;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.util.SqlExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: StorageStatementExecutor.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class StorageStatementExecutor {
    private final bk.a<DatabaseOpenHelper.Database> dbProvider;

    /* JADX INFO: compiled from: StorageStatementExecutor.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivDataRepository.ActionOnError.values().length];
            try {
                iArr[DivDataRepository.ActionOnError.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivDataRepository.ActionOnError.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0061 A[PHI: r15
  0x0061: PHI (r15v4 com.yandex.div.storage.database.DatabaseOpenHelper$Database) = 
  (r15v3 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
  (r15v5 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
  (r15v7 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
 binds: [B:40:0x00a7, B:49:0x00c6, B:11:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, com.yandex.div.storage.database.StorageStatement] */
    @AnyThread
    public final ExecutionResult execute(DivDataRepository.ActionOnError actionOnError, StorageStatement... storageStatementArr) throws Throwable {
        ClosableSqlCompiler closableSqlCompiler;
        IllegalStateException illegalStateException;
        DatabaseOpenHelper.Database databaseInvoke;
        ClosableSqlCompiler closableSqlCompiler2;
        SQLException sQLException;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 1;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ArrayList arrayList = new ArrayList();
        DatabaseOpenHelper.Database database = null;
        try {
            try {
                databaseInvoke = this.dbProvider.invoke();
                try {
                    ClosableSqlCompiler closableSqlCompiler3 = new ClosableSqlCompiler(databaseInvoke);
                    try {
                        databaseInvoke.beginTransaction();
                        int length = storageStatementArr.length;
                        int i10 = 0;
                        while (i10 < length) {
                            ?? r10 = storageStatementArr[i10];
                            ref$ObjectRef.element = r10;
                            int i11 = i10;
                            int i12 = length;
                            closableSqlCompiler2 = closableSqlCompiler3;
                            try {
                                execute$executeCatchingSqlException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, this, arrayList, closableSqlCompiler3, r10);
                                ref$IntRef.element++;
                                i10 = i11 + 1;
                                length = i12;
                                closableSqlCompiler3 = closableSqlCompiler2;
                            } catch (SQLException e10) {
                                e = e10;
                                sQLException = e;
                                arrayList.add(new DivStorageErrorException("Error during statements execution.", sQLException, null, 4, null));
                                if (databaseInvoke != null) {
                                    SqlExtensionsKt.endTransactionSilently(databaseInvoke);
                                }
                                if (closableSqlCompiler2 != null) {
                                    closableSqlCompiler2.close();
                                }
                                if (databaseInvoke != null) {
                                    SqlExtensionsKt.closeSilently(databaseInvoke);
                                }
                                return new ExecutionResult(arrayList);
                            } catch (IllegalStateException e11) {
                                e = e11;
                                illegalStateException = e;
                                arrayList.add(new DivStorageErrorException("Error during statements execution.", illegalStateException, null, 4, null));
                                if (databaseInvoke != null) {
                                    SqlExtensionsKt.endTransactionSilently(databaseInvoke);
                                }
                                if (closableSqlCompiler2 != null) {
                                    closableSqlCompiler2.close();
                                }
                                if (databaseInvoke != null) {
                                    SqlExtensionsKt.closeSilently(databaseInvoke);
                                }
                                return new ExecutionResult(arrayList);
                            }
                        }
                        closableSqlCompiler2 = closableSqlCompiler3;
                        databaseInvoke.setTransactionSuccessful();
                        SqlExtensionsKt.endTransactionSilently(databaseInvoke);
                        closableSqlCompiler2.close();
                    } catch (SQLException e12) {
                        e = e12;
                        closableSqlCompiler2 = closableSqlCompiler3;
                    } catch (IllegalStateException e13) {
                        e = e13;
                        closableSqlCompiler2 = closableSqlCompiler3;
                    } catch (Throwable th2) {
                        th = th2;
                        closableSqlCompiler = closableSqlCompiler3;
                        database = databaseInvoke;
                        if (database != null) {
                            SqlExtensionsKt.endTransactionSilently(database);
                        }
                        if (closableSqlCompiler != null) {
                            closableSqlCompiler.close();
                        }
                        if (database != null) {
                            SqlExtensionsKt.closeSilently(database);
                        }
                        throw th;
                    }
                } catch (SQLException e14) {
                    sQLException = e14;
                    closableSqlCompiler2 = null;
                } catch (IllegalStateException e15) {
                    illegalStateException = e15;
                    closableSqlCompiler2 = null;
                } catch (Throwable th3) {
                    th = th3;
                    closableSqlCompiler = null;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (SQLException e16) {
            sQLException = e16;
            databaseInvoke = null;
            closableSqlCompiler2 = null;
        } catch (IllegalStateException e17) {
            illegalStateException = e17;
            databaseInvoke = null;
            closableSqlCompiler2 = null;
        } catch (Throwable th5) {
            th = th5;
            closableSqlCompiler = null;
            if (database != null) {
                SqlExtensionsKt.endTransactionSilently(database);
            }
            if (closableSqlCompiler != null) {
                closableSqlCompiler.close();
            }
            if (database != null) {
                SqlExtensionsKt.closeSilently(database);
            }
            throw th;
        }
        SqlExtensionsKt.closeSilently(databaseInvoke);
        return new ExecutionResult(arrayList);
    }

    private static final void execute$executeCatchingSqlException(Ref$ObjectRef<StorageStatement> ref$ObjectRef, Ref$IntRef ref$IntRef, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, ClosableSqlCompiler closableSqlCompiler, StorageStatement storageStatement) {
        try {
            storageStatement.execute(closableSqlCompiler);
        } catch (SQLException e10) {
            execute$handleException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, storageStatementExecutor, list, e10);
        } catch (IllegalStateException e11) {
            execute$handleException(ref$ObjectRef, ref$IntRef, storageStatementArr, actionOnError, storageStatementExecutor, list, e11);
        }
    }

    private static final void execute$handleException(Ref$ObjectRef<StorageStatement> ref$ObjectRef, Ref$IntRef ref$IntRef, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, Exception exc) {
        String str = "Exception at statement '" + ref$ObjectRef.element + "' (" + ref$IntRef.element + " out " + storageStatementArr.length + ')';
        int i10 = WhenMappings.$EnumSwitchMapping$0[actionOnError.ordinal()];
        if (i10 == 1) {
            storageStatementExecutor.throwWithLogging(str, exc);
            throw new KotlinNothingValueException();
        }
        if (i10 != 2) {
            return;
        }
        list.add(new DivStorageErrorException(str, exc, null, 4, null));
    }

    private final Void throwWithLogging(String str, Exception exc) throws SQLException {
        throw new SQLException(str, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StorageStatementExecutor(bk.a<? extends DatabaseOpenHelper.Database> aVar) {
        this.dbProvider = aVar;
    }

    @AnyThread
    public final ExecutionResult execute(StorageStatement... storageStatementArr) throws SQLException {
        return execute(DivDataRepository.ActionOnError.ABORT_TRANSACTION, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }
}
