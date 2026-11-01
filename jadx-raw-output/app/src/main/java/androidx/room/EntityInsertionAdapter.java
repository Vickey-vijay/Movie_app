package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    public abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t10);

    public final void insert(T t10) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t10);
            supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> collection) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i10 = 0;
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                jArr[i10] = supportSQLiteStatementAcquire.executeInsert();
                i10++;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> collection) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Long[] lArr = new Long[collection.size()];
            int i10 = 0;
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                lArr[i10] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
                i10++;
            }
            release(supportSQLiteStatementAcquire);
            return lArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(tArr.length);
            int i10 = 0;
            for (T t10 : tArr) {
                bind(supportSQLiteStatementAcquire, t10);
                arrayList.add(i10, Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
                i10++;
            }
            release(supportSQLiteStatementAcquire);
            return arrayList;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final long insertAndReturnId(T t10) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            bind(supportSQLiteStatementAcquire, t10);
            return supportSQLiteStatementAcquire.executeInsert();
        } finally {
            release(supportSQLiteStatementAcquire);
        }
    }

    public final void insert(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            for (T t10 : tArr) {
                bind(supportSQLiteStatementAcquire, t10);
                supportSQLiteStatementAcquire.executeInsert();
            }
            release(supportSQLiteStatementAcquire);
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final long[] insertAndReturnIdsArray(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            long[] jArr = new long[tArr.length];
            int i10 = 0;
            for (T t10 : tArr) {
                bind(supportSQLiteStatementAcquire, t10);
                jArr[i10] = supportSQLiteStatementAcquire.executeInsert();
                i10++;
            }
            release(supportSQLiteStatementAcquire);
            return jArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(T[] tArr) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Long[] lArr = new Long[tArr.length];
            int i10 = 0;
            for (T t10 : tArr) {
                bind(supportSQLiteStatementAcquire, t10);
                lArr[i10] = Long.valueOf(supportSQLiteStatementAcquire.executeInsert());
                i10++;
            }
            release(supportSQLiteStatementAcquire);
            return lArr;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> collection) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            int i10 = 0;
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                arrayList.add(i10, Long.valueOf(supportSQLiteStatementAcquire.executeInsert()));
                i10++;
            }
            release(supportSQLiteStatementAcquire);
            return arrayList;
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }

    public final void insert(Iterable<? extends T> iterable) {
        SupportSQLiteStatement supportSQLiteStatementAcquire = acquire();
        try {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                bind(supportSQLiteStatementAcquire, it.next());
                supportSQLiteStatementAcquire.executeInsert();
            }
            release(supportSQLiteStatementAcquire);
        } catch (Throwable th2) {
            release(supportSQLiteStatementAcquire);
            throw th2;
        }
    }
}
