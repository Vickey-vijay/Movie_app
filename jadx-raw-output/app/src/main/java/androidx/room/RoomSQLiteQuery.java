package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class RoomSQLiteQuery implements SupportSQLiteQuery, SupportSQLiteProgram {
    private static final int BLOB = 5;

    @VisibleForTesting
    public static final int DESIRED_POOL_SIZE = 10;
    private static final int DOUBLE = 3;
    private static final int LONG = 2;
    private static final int NULL = 1;

    @VisibleForTesting
    public static final int POOL_LIMIT = 15;
    private static final int STRING = 4;

    @VisibleForTesting
    public static final TreeMap<Integer, RoomSQLiteQuery> sQueryPool = new TreeMap<>();

    @VisibleForTesting
    public int mArgCount;
    private final int[] mBindingTypes;

    @VisibleForTesting
    public final byte[][] mBlobBindings;

    @VisibleForTesting
    public final int mCapacity;

    @VisibleForTesting
    public final double[] mDoubleBindings;

    @VisibleForTesting
    public final long[] mLongBindings;
    private volatile String mQuery;

    @VisibleForTesting
    public final String[] mStringBindings;

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(SupportSQLiteProgram supportSQLiteProgram) {
        for (int i10 = 1; i10 <= this.mArgCount; i10++) {
            int i11 = this.mBindingTypes[i10];
            if (i11 == 1) {
                supportSQLiteProgram.bindNull(i10);
            } else if (i11 == 2) {
                supportSQLiteProgram.bindLong(i10, this.mLongBindings[i10]);
            } else if (i11 == 3) {
                supportSQLiteProgram.bindDouble(i10, this.mDoubleBindings[i10]);
            } else if (i11 == 4) {
                supportSQLiteProgram.bindString(i10, this.mStringBindings[i10]);
            } else if (i11 == 5) {
                supportSQLiteProgram.bindBlob(i10, this.mBlobBindings[i10]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public static RoomSQLiteQuery acquire(String str, int i10) {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = sQueryPool;
        synchronized (treeMap) {
            Map.Entry<Integer, RoomSQLiteQuery> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (entryCeilingEntry == null) {
                RoomSQLiteQuery roomSQLiteQuery = new RoomSQLiteQuery(i10);
                roomSQLiteQuery.init(str, i10);
                return roomSQLiteQuery;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            RoomSQLiteQuery value = entryCeilingEntry.getValue();
            value.init(str, i10);
            return value;
        }
    }

    private static void prunePoolLocked() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = sQueryPool;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i10 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i10;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int i10, byte[] bArr) {
        this.mBindingTypes[i10] = 5;
        this.mBlobBindings[i10] = bArr;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int i10, double d10) {
        this.mBindingTypes[i10] = 3;
        this.mDoubleBindings[i10] = d10;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int i10, long j10) {
        this.mBindingTypes[i10] = 2;
        this.mLongBindings[i10] = j10;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int i10) {
        this.mBindingTypes[i10] = 1;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int i10, String str) {
        this.mBindingTypes[i10] = 4;
        this.mStringBindings[i10] = str;
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void clearBindings() {
        Arrays.fill(this.mBindingTypes, 1);
        Arrays.fill(this.mStringBindings, (Object) null);
        Arrays.fill(this.mBlobBindings, (Object) null);
        this.mQuery = null;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public int getArgCount() {
        return this.mArgCount;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public String getSql() {
        return this.mQuery;
    }

    public void init(String str, int i10) {
        this.mQuery = str;
        this.mArgCount = i10;
    }

    public void release() {
        TreeMap<Integer, RoomSQLiteQuery> treeMap = sQueryPool;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.mCapacity), this);
            prunePoolLocked();
        }
    }

    private RoomSQLiteQuery(int i10) {
        this.mCapacity = i10;
        int i11 = i10 + 1;
        this.mBindingTypes = new int[i11];
        this.mLongBindings = new long[i11];
        this.mDoubleBindings = new double[i11];
        this.mStringBindings = new String[i11];
        this.mBlobBindings = new byte[i11][];
    }

    public static RoomSQLiteQuery copyFrom(SupportSQLiteQuery supportSQLiteQuery) {
        RoomSQLiteQuery roomSQLiteQueryAcquire = acquire(supportSQLiteQuery.getSql(), supportSQLiteQuery.getArgCount());
        supportSQLiteQuery.bindTo(new SupportSQLiteProgram() { // from class: androidx.room.RoomSQLiteQuery.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindBlob(int i10, byte[] bArr) {
                RoomSQLiteQuery.this.bindBlob(i10, bArr);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindDouble(int i10, double d10) {
                RoomSQLiteQuery.this.bindDouble(i10, d10);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindLong(int i10, long j10) {
                RoomSQLiteQuery.this.bindLong(i10, j10);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindNull(int i10) {
                RoomSQLiteQuery.this.bindNull(i10);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void bindString(int i10, String str) {
                RoomSQLiteQuery.this.bindString(i10, str);
            }

            @Override // androidx.sqlite.db.SupportSQLiteProgram
            public void clearBindings() {
                RoomSQLiteQuery.this.clearBindings();
            }
        });
        return roomSQLiteQueryAcquire;
    }

    public void copyArgumentsFrom(RoomSQLiteQuery roomSQLiteQuery) {
        int argCount = roomSQLiteQuery.getArgCount() + 1;
        System.arraycopy(roomSQLiteQuery.mBindingTypes, 0, this.mBindingTypes, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mLongBindings, 0, this.mLongBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mStringBindings, 0, this.mStringBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mBlobBindings, 0, this.mBlobBindings, 0, argCount);
        System.arraycopy(roomSQLiteQuery.mDoubleBindings, 0, this.mDoubleBindings, 0, argCount);
    }
}
