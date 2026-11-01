package f5;

import android.annotation.SuppressLint;
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
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import g5.k0;
import g5.y;
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
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: CachedContentIndex.java */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<String, g> f52855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<String> f52856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f52857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f52858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f52859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c f52860f;

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String[] f52861e = {"id", C3426d4.i.W, "metadata"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n3.a f52862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<g> f52863b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f52864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f52865d;

        public static void delete(n3.a aVar, long j10) throws DatabaseIOException {
            delete(aVar, Long.toHexString(j10));
        }

        public static void e(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String g(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // f5.h.c
        public void a(g gVar) {
            this.f52863b.put(gVar.f52850a, gVar);
        }

        @Override // f5.h.c
        public void b(g gVar, boolean z10) {
            if (z10) {
                this.f52863b.delete(gVar.f52850a);
            } else {
                this.f52863b.put(gVar.f52850a, null);
            }
        }

        public final void c(SQLiteDatabase sQLiteDatabase, g gVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            h.t(gVar.c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(gVar.f52850a));
            contentValues.put(C3426d4.i.W, gVar.f52851b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow(this.f52865d, null, contentValues);
        }

        public final void d(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete(this.f52865d, "id = ?", new String[]{Integer.toString(i10)});
        }

        @Override // f5.h.c
        public void delete() throws DatabaseIOException {
            delete(this.f52862a, this.f52864c);
        }

        @Override // f5.h.c
        public boolean exists() throws DatabaseIOException {
            return n3.c.b(this.f52862a.getReadableDatabase(), 1, this.f52864c) != -1;
        }

        public final Cursor f() {
            return this.f52862a.getReadableDatabase().query(this.f52865d, f52861e, null, null, null, null, null);
        }

        public final void h(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            n3.c.d(sQLiteDatabase, 1, this.f52864c, 1);
            e(sQLiteDatabase, this.f52865d);
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f52865d + Z7.f27998r + "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // f5.h.c
        public void load(HashMap<String, g> map, SparseArray<String> sparseArray) throws IOException {
            g5.a.f(this.f52863b.size() == 0);
            try {
                if (n3.c.b(this.f52862a.getReadableDatabase(), 1, this.f52864c) != 1) {
                    SQLiteDatabase writableDatabase = this.f52862a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        h(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursorF = f();
                while (cursorF.moveToNext()) {
                    try {
                        g gVar = new g(cursorF.getInt(0), cursorF.getString(1), h.q(new DataInputStream(new ByteArrayInputStream(cursorF.getBlob(2)))));
                        map.put(gVar.f52851b, gVar);
                        sparseArray.put(gVar.f52850a, gVar.f52851b);
                    } catch (Throwable th3) {
                        if (cursorF != null) {
                            try {
                                cursorF.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursorF.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e10);
            }
        }

        @Override // f5.h.c
        public void storeFully(HashMap<String, g> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f52862a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    h(writableDatabase);
                    Iterator<g> it = map.values().iterator();
                    while (it.hasNext()) {
                        c(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f52863b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // f5.h.c
        public void storeIncremental(HashMap<String, g> map) throws IOException {
            if (this.f52863b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f52862a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f52863b.size(); i10++) {
                    try {
                        g gVarValueAt = this.f52863b.valueAt(i10);
                        if (gVarValueAt == null) {
                            d(writableDatabase, this.f52863b.keyAt(i10));
                        } else {
                            c(writableDatabase, gVarValueAt);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f52863b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        public a(n3.a aVar) {
            this.f52862a = aVar;
        }

        private static void delete(n3.a aVar, String str) throws DatabaseIOException {
            try {
                String strG = g(str);
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    n3.c.c(writableDatabase, 1, str);
                    e(writableDatabase, strG);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // f5.h.c
        public void initialize(long j10) {
            String hexString = Long.toHexString(j10);
            this.f52864c = hexString;
            this.f52865d = g(hexString);
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f52866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Cipher f52867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final SecretKeySpec f52868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Random f52869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final g5.b f52870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f52871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public y f52872g;

        @Override // f5.h.c
        public void a(g gVar) {
            this.f52871f = true;
        }

        @Override // f5.h.c
        public void b(g gVar, boolean z10) {
            this.f52871f = true;
        }

        public final void g(HashMap<String, g> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamE = this.f52870e.e();
                y yVar = this.f52872g;
                if (yVar == null) {
                    this.f52872g = new y(outputStreamE);
                } else {
                    yVar.a(outputStreamE);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.f52872g);
                try {
                    dataOutputStream2.writeInt(2);
                    int iC = 0;
                    dataOutputStream2.writeInt(this.f52866a ? 1 : 0);
                    if (this.f52866a) {
                        byte[] bArr = new byte[16];
                        this.f52869d.nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            this.f52867b.init(1, this.f52868c, new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f52872g, this.f52867b));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (g gVar : map.values()) {
                        f(gVar, dataOutputStream2);
                        iC += c(gVar, 2);
                    }
                    dataOutputStream2.writeInt(iC);
                    this.f52870e.a(dataOutputStream2);
                    k0.n(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    k0.n(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // f5.h.c
        public void initialize(long j10) {
        }

        public final int c(g gVar, int i10) {
            int i11;
            int iHashCode;
            int iHashCode2 = (gVar.f52850a * 31) + gVar.f52851b.hashCode();
            if (i10 < 2) {
                long jA = i.a(gVar.c());
                i11 = iHashCode2 * 31;
                iHashCode = (int) (jA ^ (jA >>> 32));
            } else {
                i11 = iHashCode2 * 31;
                iHashCode = gVar.c().hashCode();
            }
            return i11 + iHashCode;
        }

        @Override // f5.h.c
        public void delete() {
            this.f52870e.delete();
        }

        public final boolean e(HashMap<String, g> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f52870e.b()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f52870e.c());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f52867b == null) {
                                k0.n(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f52867b.init(2, this.f52868c, new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f52867b));
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f52866a) {
                            this.f52871f = true;
                        }
                        int i11 = dataInputStream2.readInt();
                        int iC = 0;
                        for (int i12 = 0; i12 < i11; i12++) {
                            g gVarD = d(i10, dataInputStream2);
                            map.put(gVarD.f52851b, gVarD);
                            sparseArray.put(gVarD.f52850a, gVarD.f52851b);
                            iC += c(gVarD, i10);
                        }
                        int i13 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i13 == iC && z10) {
                            k0.n(dataInputStream2);
                            return true;
                        }
                        k0.n(dataInputStream2);
                        return false;
                    }
                    k0.n(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        k0.n(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        k0.n(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // f5.h.c
        public boolean exists() {
            return this.f52870e.b();
        }

        public final void f(g gVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(gVar.f52850a);
            dataOutputStream.writeUTF(gVar.f52851b);
            h.t(gVar.c(), dataOutputStream);
        }

        @Override // f5.h.c
        public void load(HashMap<String, g> map, SparseArray<String> sparseArray) {
            g5.a.f(!this.f52871f);
            if (e(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f52870e.delete();
        }

        @Override // f5.h.c
        public void storeIncremental(HashMap<String, g> map) throws Throwable {
            if (this.f52871f) {
                storeFully(map);
            }
        }

        public b(File file, @Nullable byte[] bArr, boolean z10) {
            Cipher cipherI;
            SecretKeySpec secretKeySpec;
            boolean z11;
            if (bArr != null) {
                if (bArr.length == 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                g5.a.a(z11);
                try {
                    cipherI = h.i();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                g5.a.a(!z10);
                cipherI = null;
                secretKeySpec = null;
            }
            this.f52866a = z10;
            this.f52867b = cipherI;
            this.f52868c = secretKeySpec;
            this.f52869d = z10 ? new Random() : null;
            this.f52870e = new g5.b(file);
        }

        public final g d(int i10, DataInputStream dataInputStream) throws IOException {
            k kVarQ;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 >= 2) {
                kVarQ = h.q(dataInputStream);
            } else {
                long j10 = dataInputStream.readLong();
                j jVar = new j();
                j.g(jVar, j10);
                kVarQ = k.f52875c.e(jVar);
            }
            return new g(i11, utf, kVarQ);
        }

        @Override // f5.h.c
        public void storeFully(HashMap<String, g> map) throws Throwable {
            g(map);
            this.f52871f = false;
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public interface c {
        void a(g gVar);

        void b(g gVar, boolean z10);

        void delete() throws IOException;

        boolean exists() throws IOException;

        void initialize(long j10);

        void load(HashMap<String, g> map, SparseArray<String> sparseArray) throws IOException;

        void storeFully(HashMap<String, g> map) throws IOException;

        void storeIncremental(HashMap<String, g> map) throws IOException;
    }

    @SuppressLint({"GetInstance"})
    public static Cipher i() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (k0.f53108a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    public static boolean o(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public final g d(String str) {
        int iL = l(this.f52856b);
        g gVar = new g(iL, str);
        this.f52855a.put(str, gVar);
        this.f52856b.put(iL, str);
        this.f52858d.put(iL, true);
        this.f52859e.a(gVar);
        return gVar;
    }

    public g g(String str) {
        return this.f52855a.get(str);
    }

    public Collection<g> h() {
        return this.f52855a.values();
    }

    public String k(int i10) {
        return this.f52856b.get(i10);
    }

    public g m(String str) {
        g gVar = this.f52855a.get(str);
        return gVar == null ? d(str) : gVar;
    }

    @WorkerThread
    public void n(long j10) throws IOException {
        c cVar;
        this.f52859e.initialize(j10);
        c cVar2 = this.f52860f;
        if (cVar2 != null) {
            cVar2.initialize(j10);
        }
        if (this.f52859e.exists() || (cVar = this.f52860f) == null || !cVar.exists()) {
            this.f52859e.load(this.f52855a, this.f52856b);
        } else {
            this.f52860f.load(this.f52855a, this.f52856b);
            this.f52859e.storeFully(this.f52855a);
        }
        c cVar3 = this.f52860f;
        if (cVar3 != null) {
            cVar3.delete();
            this.f52860f = null;
        }
    }

    public void p(String str) {
        g gVar = this.f52855a.get(str);
        if (gVar == null || !gVar.f() || gVar.g()) {
            return;
        }
        this.f52855a.remove(str);
        int i10 = gVar.f52850a;
        boolean z10 = this.f52858d.get(i10);
        this.f52859e.b(gVar, z10);
        if (z10) {
            this.f52856b.remove(i10);
            this.f52858d.delete(i10);
        } else {
            this.f52856b.put(i10, null);
            this.f52857c.put(i10, true);
        }
    }

    public void r() {
        int size = this.f52855a.size();
        String[] strArr = new String[size];
        this.f52855a.keySet().toArray(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            p(strArr[i10]);
        }
    }

    @WorkerThread
    public void s() throws IOException {
        this.f52859e.storeIncremental(this.f52855a);
        int size = this.f52857c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f52856b.remove(this.f52857c.keyAt(i10));
        }
        this.f52857c.clear();
        this.f52858d.clear();
    }

    public h(@Nullable n3.a aVar, @Nullable File file, @Nullable byte[] bArr, boolean z10, boolean z11) {
        boolean z12;
        a aVar2;
        if (aVar == null && file == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        g5.a.f(z12);
        this.f52855a = new HashMap<>();
        this.f52856b = new SparseArray<>();
        this.f52857c = new SparseBooleanArray();
        this.f52858d = new SparseBooleanArray();
        if (aVar != null) {
            aVar2 = new a(aVar);
        } else {
            aVar2 = null;
        }
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z10) : null;
        if (aVar2 != null && (bVar == null || !z11)) {
            this.f52859e = aVar2;
            this.f52860f = bVar;
        } else {
            this.f52859e = bVar;
            this.f52860f = aVar2;
        }
    }

    @WorkerThread
    public static void delete(n3.a aVar, long j10) throws DatabaseIOException {
        a.delete(aVar, j10);
    }

    @VisibleForTesting
    public static int l(SparseArray<String> sparseArray) {
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

    public static k q(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 >= 0) {
                int iMin = Math.min(i12, 10485760);
                byte[] bArrCopyOf = k0.f53113f;
                int i13 = 0;
                while (i13 != i12) {
                    int i14 = i13 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                    dataInputStream.readFully(bArrCopyOf, i13, iMin);
                    iMin = Math.min(i12 - i14, 10485760);
                    i13 = i14;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException("Invalid value size: " + i12);
            }
        }
        return new k(map);
    }

    public static void t(k kVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setF = kVar.f();
        dataOutputStream.writeInt(setF.size());
        for (Map.Entry<String, byte[]> entry : setF) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void e(String str, j jVar) {
        g gVarM = m(str);
        if (gVarM.b(jVar)) {
            this.f52859e.a(gVarM);
        }
    }

    public int f(String str) {
        return m(str).f52850a;
    }

    public i j(String str) {
        g gVarG = g(str);
        if (gVarG != null) {
            return gVarG.c();
        }
        return k.f52875c;
    }
}
