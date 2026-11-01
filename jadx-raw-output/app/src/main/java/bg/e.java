package bg;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.r2;
import com.ironsource.Z7;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.AtomicFile;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.database.DatabaseIOException;
import io.bidmachine.media3.database.DatabaseProvider;
import io.bidmachine.media3.database.VersionTable;
import io.bidmachine.media3.datasource.cache.ContentMetadata;
import io.bidmachine.media3.datasource.cache.ContentMetadataMutations;
import io.bidmachine.media3.datasource.cache.DefaultContentMetadata;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: CachedContentIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public class e {
    public static final String FILE_NAME_ATOMIC = "cached_content_index.exi";
    private static final int INCREMENTAL_METADATA_READ_LENGTH = 10485760;
    private final SparseArray<String> idToKey;
    private final HashMap<String, d> keyToContent;
    private final SparseBooleanArray newIds;

    @Nullable
    private c previousStorage;
    private final SparseBooleanArray removedIds;
    private c storage;

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static final class a implements c {
        private static final String[] COLUMNS = {"id", "key", "metadata"};
        private static final String COLUMN_ID = "id";
        private static final int COLUMN_INDEX_ID = 0;
        private static final int COLUMN_INDEX_KEY = 1;
        private static final int COLUMN_INDEX_METADATA = 2;
        private static final String COLUMN_KEY = "key";
        private static final String COLUMN_METADATA = "metadata";
        private static final String TABLE_PREFIX = "ExoPlayerCacheIndex";
        private static final String TABLE_SCHEMA = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";
        private static final int TABLE_VERSION = 1;
        private static final String WHERE_ID_EQUALS = "id = ?";
        private final DatabaseProvider databaseProvider;
        private String hexUid;
        private final SparseArray<d> pendingUpdates = new SparseArray<>();
        private String tableName;

        public static void delete(DatabaseProvider databaseProvider, long j10) throws DatabaseIOException {
            delete(databaseProvider, Long.toHexString(j10));
        }

        private void addOrUpdateRow(SQLiteDatabase sQLiteDatabase, d dVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e.writeContentMetadata(dVar.getMetadata(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(dVar.f5351id));
            contentValues.put("key", dVar.key);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) Assertions.checkNotNull(this.tableName), null, contentValues);
        }

        private void deleteRow(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) Assertions.checkNotNull(this.tableName), WHERE_ID_EQUALS, new String[]{Integer.toString(i10)});
        }

        private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor getCursor() {
            return this.databaseProvider.getReadableDatabase().query((String) Assertions.checkNotNull(this.tableName), COLUMNS, null, null, null, null, null);
        }

        private static String getTableName(String str) {
            return TABLE_PREFIX + str;
        }

        private void initializeTable(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            VersionTable.setVersion(sQLiteDatabase, 1, (String) Assertions.checkNotNull(this.hexUid), 1);
            dropTable(sQLiteDatabase, (String) Assertions.checkNotNull(this.tableName));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.tableName + Z7.f27998r + TABLE_SCHEMA);
        }

        @Override // bg.e.c
        public void delete() throws DatabaseIOException {
            delete(this.databaseProvider, (String) Assertions.checkNotNull(this.hexUid));
        }

        @Override // bg.e.c
        public boolean exists() throws DatabaseIOException {
            try {
                return VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.hexUid)) != -1;
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // bg.e.c
        public void load(HashMap<String, d> map, SparseArray<String> sparseArray) throws IOException {
            Assertions.checkState(this.pendingUpdates.size() == 0);
            try {
                if (VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.hexUid)) != 1) {
                    SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        initializeTable(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursor = getCursor();
                while (cursor.moveToNext()) {
                    try {
                        d dVar = new d(cursor.getInt(0), (String) Assertions.checkNotNull(cursor.getString(1)), e.readContentMetadata(new DataInputStream(new ByteArrayInputStream(cursor.getBlob(2)))));
                        map.put(dVar.key, dVar);
                        sparseArray.put(dVar.f5351id, dVar.key);
                    } catch (Throwable th3) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursor.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e10);
            }
        }

        @Override // bg.e.c
        public void onRemove(d dVar, boolean z10) {
            if (z10) {
                this.pendingUpdates.delete(dVar.f5351id);
            } else {
                this.pendingUpdates.put(dVar.f5351id, null);
            }
        }

        @Override // bg.e.c
        public void onUpdate(d dVar) {
            this.pendingUpdates.put(dVar.f5351id, dVar);
        }

        @Override // bg.e.c
        public void storeFully(HashMap<String, d> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    initializeTable(writableDatabase);
                    Iterator<d> it = map.values().iterator();
                    while (it.hasNext()) {
                        addOrUpdateRow(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.pendingUpdates.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // bg.e.c
        public void storeIncremental(HashMap<String, d> map) throws IOException {
            if (this.pendingUpdates.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.pendingUpdates.size(); i10++) {
                    try {
                        d dVarValueAt = this.pendingUpdates.valueAt(i10);
                        if (dVarValueAt == null) {
                            deleteRow(writableDatabase, this.pendingUpdates.keyAt(i10));
                        } else {
                            addOrUpdateRow(writableDatabase, dVarValueAt);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.pendingUpdates.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        public a(DatabaseProvider databaseProvider) {
            this.databaseProvider = databaseProvider;
        }

        private static void delete(DatabaseProvider databaseProvider, String str) throws DatabaseIOException {
            try {
                String tableName = getTableName(str);
                SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.removeVersion(writableDatabase, 1, str);
                    dropTable(writableDatabase, tableName);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // bg.e.c
        public void initialize(long j10) {
            String hexString = Long.toHexString(j10);
            this.hexUid = hexString;
            this.tableName = getTableName(hexString);
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static class b implements c {
        private static final int FLAG_ENCRYPTED_INDEX = 1;
        private static final int VERSION = 2;
        private static final int VERSION_METADATA_INTRODUCED = 2;
        private final AtomicFile atomicFile;

        @Nullable
        private g bufferedOutputStream;
        private boolean changed;

        @Nullable
        private final Cipher cipher;
        private final boolean encrypt;

        @Nullable
        private final SecureRandom random;

        @Nullable
        private final SecretKeySpec secretKeySpec;

        private void writeFile(HashMap<String, d> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamStartWrite = this.atomicFile.startWrite();
                g gVar = this.bufferedOutputStream;
                if (gVar == null) {
                    this.bufferedOutputStream = new g(outputStreamStartWrite);
                } else {
                    gVar.reset(outputStreamStartWrite);
                }
                g gVar2 = this.bufferedOutputStream;
                DataOutputStream dataOutputStream2 = new DataOutputStream(gVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iHashCachedContent = 0;
                    dataOutputStream2.writeInt(this.encrypt ? 1 : 0);
                    if (this.encrypt) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) Util.castNonNull(this.random)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) Util.castNonNull(this.cipher)).init(1, (Key) Util.castNonNull(this.secretKeySpec), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(gVar2, this.cipher));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (d dVar : map.values()) {
                        writeCachedContent(dVar, dataOutputStream2);
                        iHashCachedContent += hashCachedContent(dVar, 2);
                    }
                    dataOutputStream2.writeInt(iHashCachedContent);
                    this.atomicFile.endWrite(dataOutputStream2);
                    Util.closeQuietly(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    Util.closeQuietly(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // bg.e.c
        public void initialize(long j10) {
        }

        @Override // bg.e.c
        public void onRemove(d dVar, boolean z10) {
            this.changed = true;
        }

        @Override // bg.e.c
        public void onUpdate(d dVar) {
            this.changed = true;
        }

        private int hashCachedContent(d dVar, int i10) {
            int i11;
            int iHashCode;
            int iHashCode2 = (dVar.f5351id * 31) + dVar.key.hashCode();
            if (i10 < 2) {
                long contentLength = ContentMetadata.getContentLength(dVar.getMetadata());
                i11 = iHashCode2 * 31;
                iHashCode = (int) (contentLength ^ (contentLength >>> 32));
            } else {
                i11 = iHashCode2 * 31;
                iHashCode = dVar.getMetadata().hashCode();
            }
            return i11 + iHashCode;
        }

        private boolean readFile(HashMap<String, d> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.atomicFile.exists()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.atomicFile.openRead());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.cipher == null) {
                                Util.closeQuietly(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.cipher.init(2, (Key) Util.castNonNull(this.secretKeySpec), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.cipher));
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.encrypt) {
                            this.changed = true;
                        }
                        int i11 = dataInputStream2.readInt();
                        int iHashCachedContent = 0;
                        for (int i12 = 0; i12 < i11; i12++) {
                            d cachedContent = readCachedContent(i10, dataInputStream2);
                            map.put(cachedContent.key, cachedContent);
                            sparseArray.put(cachedContent.f5351id, cachedContent.key);
                            iHashCachedContent += hashCachedContent(cachedContent, i10);
                        }
                        int i13 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i13 == iHashCachedContent && z10) {
                            Util.closeQuietly(dataInputStream2);
                            return true;
                        }
                        Util.closeQuietly(dataInputStream2);
                        return false;
                    }
                    Util.closeQuietly(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        Util.closeQuietly(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        Util.closeQuietly(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private void writeCachedContent(d dVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(dVar.f5351id);
            dataOutputStream.writeUTF(dVar.key);
            e.writeContentMetadata(dVar.getMetadata(), dataOutputStream);
        }

        @Override // bg.e.c
        public void delete() {
            this.atomicFile.delete();
        }

        @Override // bg.e.c
        public boolean exists() {
            return this.atomicFile.exists();
        }

        @Override // bg.e.c
        public void load(HashMap<String, d> map, SparseArray<String> sparseArray) {
            Assertions.checkState(!this.changed);
            if (readFile(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.atomicFile.delete();
        }

        @Override // bg.e.c
        public void storeIncremental(HashMap<String, d> map) throws Throwable {
            if (this.changed) {
                storeFully(map);
            }
        }

        public b(File file, @Nullable byte[] bArr, boolean z10) {
            boolean z11;
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            if (bArr == null && z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            Assertions.checkState(z11);
            if (bArr != null) {
                Assertions.checkArgument(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                Assertions.checkArgument(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.encrypt = z10;
            this.cipher = cipher;
            this.secretKeySpec = secretKeySpec;
            this.random = z10 ? new SecureRandom() : null;
            this.atomicFile = new AtomicFile(file);
        }

        private d readCachedContent(int i10, DataInputStream dataInputStream) throws IOException {
            DefaultContentMetadata contentMetadata;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 >= 2) {
                contentMetadata = e.readContentMetadata(dataInputStream);
            } else {
                long j10 = dataInputStream.readLong();
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                ContentMetadataMutations.setContentLength(contentMetadataMutations, j10);
                contentMetadata = DefaultContentMetadata.EMPTY.copyWithMutationsApplied(contentMetadataMutations);
            }
            return new d(i11, utf, contentMetadata);
        }

        @Override // bg.e.c
        public void storeFully(HashMap<String, d> map) throws Throwable {
            writeFile(map);
            this.changed = false;
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public interface c {
        void delete() throws IOException;

        boolean exists() throws IOException;

        void initialize(long j10);

        void load(HashMap<String, d> map, SparseArray<String> sparseArray) throws IOException;

        void onRemove(d dVar, boolean z10);

        void onUpdate(d dVar);

        void storeFully(HashMap<String, d> map) throws IOException;

        void storeIncremental(HashMap<String, d> map) throws IOException;
    }

    public e(DatabaseProvider databaseProvider) {
        this(databaseProvider, null, null, false, false);
    }

    public e(@Nullable DatabaseProvider databaseProvider, @Nullable File file, @Nullable byte[] bArr, boolean z10, boolean z11) {
        Assertions.checkState((databaseProvider == null && file == null) ? false : true);
        this.keyToContent = new HashMap<>();
        this.idToKey = new SparseArray<>();
        this.removedIds = new SparseBooleanArray();
        this.newIds = new SparseBooleanArray();
        a aVar = databaseProvider != null ? new a(databaseProvider) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z10) : null;
        if (aVar == null || (bVar != null && z11)) {
            this.storage = (c) Util.castNonNull(bVar);
            this.previousStorage = aVar;
        } else {
            this.storage = aVar;
            this.previousStorage = bVar;
        }
    }

    private d addNew(String str) {
        int newId = getNewId(this.idToKey);
        d dVar = new d(newId, str);
        this.keyToContent.put(str, dVar);
        this.idToKey.put(newId, str);
        this.newIds.put(newId, true);
        this.storage.onUpdate(dVar);
        return dVar;
    }

    public static boolean isIndexFile(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    @Nullable
    public d get(String str) {
        return this.keyToContent.get(str);
    }

    public Collection<d> getAll() {
        return Collections.unmodifiableCollection(this.keyToContent.values());
    }

    @Nullable
    public String getKeyForId(int i10) {
        return this.idToKey.get(i10);
    }

    public Set<String> getKeys() {
        return this.keyToContent.keySet();
    }

    public d getOrAdd(String str) {
        d dVar = this.keyToContent.get(str);
        return dVar == null ? addNew(str) : dVar;
    }

    @WorkerThread
    public void initialize(long j10) throws IOException {
        c cVar;
        this.storage.initialize(j10);
        c cVar2 = this.previousStorage;
        if (cVar2 != null) {
            cVar2.initialize(j10);
        }
        if (this.storage.exists() || (cVar = this.previousStorage) == null || !cVar.exists()) {
            this.storage.load(this.keyToContent, this.idToKey);
        } else {
            this.previousStorage.load(this.keyToContent, this.idToKey);
            this.storage.storeFully(this.keyToContent);
        }
        c cVar3 = this.previousStorage;
        if (cVar3 != null) {
            cVar3.delete();
            this.previousStorage = null;
        }
    }

    public void maybeRemove(String str) {
        d dVar = this.keyToContent.get(str);
        if (dVar != null && dVar.isEmpty() && dVar.isFullyUnlocked()) {
            this.keyToContent.remove(str);
            int i10 = dVar.f5351id;
            boolean z10 = this.newIds.get(i10);
            this.storage.onRemove(dVar, z10);
            if (z10) {
                this.idToKey.remove(i10);
                this.newIds.delete(i10);
            } else {
                this.idToKey.put(i10, null);
                this.removedIds.put(i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeEmpty() {
        r2 it = ImmutableSet.copyOf((Collection) this.keyToContent.keySet()).iterator();
        while (it.hasNext()) {
            maybeRemove((String) it.next());
        }
    }

    @WorkerThread
    public void store() throws IOException {
        this.storage.storeIncremental(this.keyToContent);
        int size = this.removedIds.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.idToKey.remove(this.removedIds.keyAt(i10));
        }
        this.removedIds.clear();
        this.newIds.clear();
    }

    @WorkerThread
    public static void delete(DatabaseProvider databaseProvider, long j10) throws DatabaseIOException {
        a.delete(databaseProvider, j10);
    }

    @VisibleForTesting
    public static int getNewId(SparseArray<String> sparseArray) {
        int iKeyAt;
        int size = sparseArray.size();
        int i10 = 0;
        if (size == 0) {
            iKeyAt = 0;
        } else {
            iKeyAt = sparseArray.keyAt(size - 1) + 1;
        }
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            return i10;
        }
        return iKeyAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DefaultContentMetadata readContentMetadata(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 >= 0) {
                int iMin = Math.min(i12, INCREMENTAL_METADATA_READ_LENGTH);
                byte[] bArrCopyOf = Util.EMPTY_BYTE_ARRAY;
                int i13 = 0;
                while (i13 != i12) {
                    int i14 = i13 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                    dataInputStream.readFully(bArrCopyOf, i13, iMin);
                    iMin = Math.min(i12 - i14, INCREMENTAL_METADATA_READ_LENGTH);
                    i13 = i14;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException("Invalid value size: " + i12);
            }
        }
        return new DefaultContentMetadata(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeContentMetadata(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = defaultContentMetadata.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void applyContentMetadataMutations(String str, ContentMetadataMutations contentMetadataMutations) {
        d orAdd = getOrAdd(str);
        if (orAdd.applyMetadataMutations(contentMetadataMutations)) {
            this.storage.onUpdate(orAdd);
        }
    }

    public int assignIdForKey(String str) {
        return getOrAdd(str).f5351id;
    }

    public ContentMetadata getContentMetadata(String str) {
        d dVar = get(str);
        if (dVar != null) {
            return dVar.getMetadata();
        }
        return DefaultContentMetadata.EMPTY;
    }
}
