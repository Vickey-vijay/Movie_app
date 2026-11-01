package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mgs.carparking.dbtable.VideoSkipEntry;
import java.util.ArrayList;
import t9.b;

/* JADX INFO: loaded from: classes8.dex */
public class VideoSkipDao {
    private static volatile VideoSkipDao instance;

    public synchronized void deleteSkipVideo(VideoSkipEntry videoSkipEntry) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoSkipEntry.TABLE_NAME, "id='" + videoSkipEntry.getId() + "'", new String[0]);
    }

    public synchronized void deleteSkipVideoById(int i10) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoSkipEntry.TABLE_NAME, "id='" + i10 + "'", new String[0]);
    }

    public synchronized long insertSkipVideo(VideoSkipEntry videoSkipEntry) {
        if (videoSkipEntry == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = writableDatabase.rawQuery("select * from video_skip where id='" + videoSkipEntry.getId() + "'", new String[0]);
            if (cursorRawQuery.getCount() > 0) {
                deleteSkipVideo(videoSkipEntry);
            }
            try {
                cursorRawQuery.close();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
            }
        } catch (Exception unused) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            throw th2;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(videoSkipEntry.getId()));
        contentValues.put(VideoSkipEntry.PROGRESS_HEAD, Integer.valueOf(videoSkipEntry.getProgress_head()));
        contentValues.put(VideoSkipEntry.PROGRESS_END, Integer.valueOf(videoSkipEntry.getProgress_end()));
        return writableDatabase.insertWithOnConflict(VideoSkipEntry.TABLE_NAME, "id", contentValues, 5);
    }

    public synchronized boolean isExist(int i10) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_skip where id='" + i10 + "'", new String[0]);
            if (cursorRawQuery.getCount() > 0) {
                b.c("数据已存在");
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return true;
            }
            try {
                cursorRawQuery.close();
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (Exception unused) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e12) {
                    e = e12;
                    e.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            throw th2;
        }
        return false;
    }

    public synchronized ArrayList<VideoSkipEntry> queryItemSkipVideo(int i10) {
        ArrayList<VideoSkipEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_skip where id='" + i10 + "'", new String[0]);
            if (cursorRawQuery.moveToFirst()) {
                int columnIndex = cursorRawQuery.getColumnIndex("id");
                int columnIndex2 = cursorRawQuery.getColumnIndex(VideoSkipEntry.PROGRESS_HEAD);
                int columnIndex3 = cursorRawQuery.getColumnIndex(VideoSkipEntry.PROGRESS_END);
                do {
                    VideoSkipEntry videoSkipEntry = new VideoSkipEntry();
                    videoSkipEntry.setId(cursorRawQuery.getInt(columnIndex));
                    videoSkipEntry.setProgress_head(cursorRawQuery.getInt(columnIndex2));
                    videoSkipEntry.setProgress_end(cursorRawQuery.getInt(columnIndex3));
                    arrayList.add(videoSkipEntry);
                } while (cursorRawQuery.moveToNext());
            }
            try {
                cursorRawQuery.close();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
            }
        } catch (Exception unused) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            throw th2;
        }
        return arrayList;
    }

    public static VideoSkipDao getInstance() {
        if (instance == null) {
            synchronized (VideoSkipDao.class) {
                if (instance == null) {
                    instance = new VideoSkipDao();
                }
            }
        }
        return instance;
    }

    private VideoSkipDao() {
    }

    public void clearAll() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoSkipEntry.TABLE_NAME, "", new String[0]);
    }
}
