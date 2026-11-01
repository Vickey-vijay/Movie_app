package o7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ironsource.C3426d4;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w7.f;

/* JADX INFO: compiled from: SqliteDatabaseImpl.java */
/* JADX INFO: loaded from: classes9.dex */
public class d implements o7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f65125a = new e(w7.c.a()).getWritableDatabase();

    /* JADX INFO: compiled from: SqliteDatabaseImpl.java */
    public class a implements o7.a.InterfaceC0597a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<FileDownloadModel> f65126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f65127c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<FileDownloadModel> f65128d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<List<t7.a>> f65129e;

        public a(d dVar) {
            this(null, null);
        }

        @Override // o7.a.InterfaceC0597a
        public void b(FileDownloadModel fileDownloadModel) {
        }

        public a(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<t7.a>> sparseArray2) {
            this.f65126b = new SparseArray<>();
            this.f65128d = sparseArray;
            this.f65129e = sparseArray2;
        }

        @Override // o7.a.InterfaceC0597a
        public void a(FileDownloadModel fileDownloadModel) {
            SparseArray<FileDownloadModel> sparseArray = this.f65128d;
            if (sparseArray != null) {
                sparseArray.put(fileDownloadModel.g(), fileDownloadModel);
            }
        }

        @Override // o7.a.InterfaceC0597a
        public void d(int i10, FileDownloadModel fileDownloadModel) {
            this.f65126b.put(i10, fileDownloadModel);
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            b bVar = d.this.new b();
            this.f65127c = bVar;
            return bVar;
        }

        @Override // o7.a.InterfaceC0597a
        public void k() {
            b bVar = this.f65127c;
            if (bVar != null) {
                bVar.b();
            }
            int size = this.f65126b.size();
            if (size < 0) {
                return;
            }
            d.this.f65125a.beginTransaction();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    int iKeyAt = this.f65126b.keyAt(i10);
                    FileDownloadModel fileDownloadModel = this.f65126b.get(iKeyAt);
                    d.this.f65125a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(iKeyAt)});
                    d.this.f65125a.insert("filedownloader", null, fileDownloadModel.D());
                    if (fileDownloadModel.c() > 1) {
                        List<t7.a> listM = d.this.m(iKeyAt);
                        if (listM.size() > 0) {
                            d.this.f65125a.delete("filedownloaderConnection", "id = ?", new String[]{String.valueOf(iKeyAt)});
                            for (t7.a aVar : listM) {
                                aVar.i(fileDownloadModel.g());
                                d.this.f65125a.insert("filedownloaderConnection", null, aVar.l());
                            }
                        }
                    }
                } catch (Throwable th2) {
                    d.this.f65125a.endTransaction();
                    throw th2;
                }
            }
            SparseArray<FileDownloadModel> sparseArray = this.f65128d;
            if (sparseArray != null && this.f65129e != null) {
                int size2 = sparseArray.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    int iG = this.f65128d.valueAt(i11).g();
                    List<t7.a> listM2 = d.this.m(iG);
                    if (listM2 != null && listM2.size() > 0) {
                        this.f65129e.put(iG, listM2);
                    }
                }
            }
            d.this.f65125a.setTransactionSuccessful();
            d.this.f65125a.endTransaction();
        }
    }

    /* JADX INFO: compiled from: SqliteDatabaseImpl.java */
    public class b implements Iterator<FileDownloadModel> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cursor f65131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<Integer> f65132c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f65133d;

        public b() {
            this.f65131b = d.this.f65125a.rawQuery("SELECT * FROM filedownloader", null);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel next() {
            FileDownloadModel fileDownloadModelS = d.s(this.f65131b);
            this.f65133d = fileDownloadModelS.g();
            return fileDownloadModelS;
        }

        public void b() {
            this.f65131b.close();
            if (this.f65132c.isEmpty()) {
                return;
            }
            String strJoin = TextUtils.join(", ", this.f65132c);
            if (w7.d.f73535a) {
                w7.d.a(this, "delete %s", strJoin);
            }
            d.this.f65125a.execSQL(f.o("DELETE FROM %s WHERE %s IN (%s);", "filedownloader", "_id", strJoin));
            d.this.f65125a.execSQL(f.o("DELETE FROM %s WHERE %s IN (%s);", "filedownloaderConnection", "id", strJoin));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f65131b.moveToNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f65132c.add(Integer.valueOf(this.f65133d));
        }
    }

    @Override // o7.a
    public void f(int i10) {
    }

    @Override // o7.a
    public void i(int i10) {
    }

    @Override // o7.a
    public FileDownloadModel n(int i10) throws Throwable {
        Throwable th2;
        Cursor cursorRawQuery;
        try {
            cursorRawQuery = this.f65125a.rawQuery(f.o("SELECT * FROM %s WHERE %s = ?", "filedownloader", "_id"), new String[]{Integer.toString(i10)});
            try {
                if (!cursorRawQuery.moveToNext()) {
                    cursorRawQuery.close();
                    return null;
                }
                FileDownloadModel fileDownloadModelS = s(cursorRawQuery);
                cursorRawQuery.close();
                return fileDownloadModelS;
            } catch (Throwable th3) {
                th2 = th3;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            cursorRawQuery = null;
        }
    }

    @Override // o7.a
    public void update(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            w7.d.i(this, "update but model == null!", new Object[0]);
        } else if (n(fileDownloadModel.g()) == null) {
            insert(fileDownloadModel);
        } else {
            this.f65125a.update("filedownloader", fileDownloadModel.D(), "_id = ? ", new String[]{String.valueOf(fileDownloadModel.g())});
        }
    }

    public static FileDownloadModel s(Cursor cursor) {
        FileDownloadModel fileDownloadModel = new FileDownloadModel();
        fileDownloadModel.x(cursor.getInt(cursor.getColumnIndex("_id")));
        fileDownloadModel.C(cursor.getString(cursor.getColumnIndex("url")));
        fileDownloadModel.y(cursor.getString(cursor.getColumnIndex("path")), cursor.getShort(cursor.getColumnIndex("pathAsDirectory")) == 1);
        fileDownloadModel.A((byte) cursor.getShort(cursor.getColumnIndex("status")));
        fileDownloadModel.z(cursor.getLong(cursor.getColumnIndex("sofar")));
        fileDownloadModel.B(cursor.getLong(cursor.getColumnIndex(C3426d4.i.f28550l)));
        fileDownloadModel.v(cursor.getString(cursor.getColumnIndex("errMsg")));
        fileDownloadModel.u(cursor.getString(cursor.getColumnIndex(DownloadModel.ETAG)));
        fileDownloadModel.w(cursor.getString(cursor.getColumnIndex("filename")));
        fileDownloadModel.t(cursor.getInt(cursor.getColumnIndex("connectionCount")));
        return fileDownloadModel;
    }

    @Override // o7.a
    public void a(int i10, Throwable th2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th2.toString());
        contentValues.put("status", (Byte) (byte) 5);
        update(i10, contentValues);
    }

    @Override // o7.a
    public void b(int i10, String str, long j10, long j11, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sofar", Long.valueOf(j10));
        contentValues.put(C3426d4.i.f28550l, Long.valueOf(j11));
        contentValues.put(DownloadModel.ETAG, str);
        contentValues.put("connectionCount", Integer.valueOf(i11));
        update(i10, contentValues);
    }

    @Override // o7.a
    public void c(int i10, int i11, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("currentOffset", Long.valueOf(j10));
        this.f65125a.update("filedownloaderConnection", contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i10), Integer.toString(i11)});
    }

    @Override // o7.a
    public void clear() {
        this.f65125a.delete("filedownloader", null, null);
        this.f65125a.delete("filedownloaderConnection", null, null);
    }

    @Override // o7.a
    public void d(int i10) {
        this.f65125a.execSQL("DELETE FROM filedownloaderConnection WHERE id = " + i10);
    }

    @Override // o7.a
    public void e(t7.a aVar) {
        this.f65125a.insert("filedownloaderConnection", null, aVar.l());
    }

    @Override // o7.a
    public o7.a.InterfaceC0597a g() {
        return new a(this);
    }

    @Override // o7.a
    public void insert(FileDownloadModel fileDownloadModel) {
        this.f65125a.insert("filedownloader", null, fileDownloadModel.D());
    }

    @Override // o7.a
    public void j(int i10, Throwable th2, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th2.toString());
        contentValues.put("status", (Byte) (byte) -1);
        contentValues.put("sofar", Long.valueOf(j10));
        update(i10, contentValues);
    }

    @Override // o7.a
    public void k(int i10, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 3);
        contentValues.put("sofar", Long.valueOf(j10));
        update(i10, contentValues);
    }

    @Override // o7.a
    public void l(int i10, long j10, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 2);
        contentValues.put(C3426d4.i.f28550l, Long.valueOf(j10));
        contentValues.put(DownloadModel.ETAG, str);
        contentValues.put("filename", str2);
        update(i10, contentValues);
    }

    @Override // o7.a
    public List<t7.a> m(int i10) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f65125a.rawQuery(f.o("SELECT * FROM %s WHERE %s = ?", "filedownloaderConnection", "id"), new String[]{Integer.toString(i10)});
            while (cursorRawQuery.moveToNext()) {
                t7.a aVar = new t7.a();
                aVar.i(i10);
                aVar.j(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("connectionIndex")));
                aVar.k(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("startOffset")));
                aVar.g(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("currentOffset")));
                aVar.h(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("endOffset")));
                arrayList.add(aVar);
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @Override // o7.a
    public void o(int i10, int i11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("connectionCount", Integer.valueOf(i11));
        this.f65125a.update("filedownloader", contentValues, "_id = ? ", new String[]{Integer.toString(i10)});
    }

    @Override // o7.a
    public void p(int i10, long j10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) -2);
        contentValues.put("sofar", Long.valueOf(j10));
        update(i10, contentValues);
    }

    @Override // o7.a
    public boolean remove(int i10) {
        return this.f65125a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(i10)}) != 0;
    }

    public o7.a.InterfaceC0597a t(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<t7.a>> sparseArray2) {
        return new a(sparseArray, sparseArray2);
    }

    @Override // o7.a
    public void h(int i10, long j10) {
        remove(i10);
    }

    private void update(int i10, ContentValues contentValues) {
        this.f65125a.update("filedownloader", contentValues, "_id = ? ", new String[]{String.valueOf(i10)});
    }
}
