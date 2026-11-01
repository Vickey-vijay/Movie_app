package r9;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mgs.carparking.db.DBHelper;
import com.mgs.carparking.dbtable.SearchHistoryEntity;
import com.mgs.carparking.download.DownloadEntity;

/* JADX INFO: compiled from: DownloadDao.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile a f66719a;

    public static a a() {
        if (f66719a == null) {
            synchronized (a.class) {
                if (f66719a == null) {
                    f66719a = new a();
                }
            }
        }
        return f66719a;
    }

    public int b(String str, String str2, int i10, long j10, long j11) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i10));
        contentValues.put("curr_position", Long.valueOf(j10));
        contentValues.put("length", Long.valueOf(j11));
        return writableDatabase.update("download_history", contentValues, "file_name=? AND url=?", new String[]{str2, str});
    }

    public int delete(String str, String str2) {
        return DBHelper.getInstance().getWritableDatabase().delete("download_history", "file_name=? AND url=?", new String[]{str2, str});
    }

    public long update(DownloadEntity downloadEntity) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", downloadEntity.getUrl());
        contentValues.put(DownloadModel.FILE_NAME, downloadEntity.h());
        contentValues.put("file_type", Integer.valueOf(downloadEntity.i()));
        contentValues.put("length", Long.valueOf(downloadEntity.getLength()));
        contentValues.put("status", Integer.valueOf(downloadEntity.k()));
        contentValues.put(SearchHistoryEntity.CREATE_TIME, Long.valueOf(downloadEntity.d()));
        contentValues.put("local_path", downloadEntity.getLocalPath());
        contentValues.put("origin_file_name", downloadEntity.j());
        contentValues.put("curr_position", Long.valueOf(downloadEntity.g()));
        return writableDatabase.replace("download_history", null, contentValues);
    }
}
