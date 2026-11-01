package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.VideoShareEntry;
import java.util.ArrayList;
import t9.b;

/* JADX INFO: loaded from: classes11.dex */
public class VideoShareDao {
    private static volatile VideoShareDao instance;

    public synchronized void deleteStayTime(VideoShareEntry videoShareEntry) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoShareEntry.TABLE_NAME, "id='" + videoShareEntry.getId() + "'", new String[0]);
    }

    public synchronized long insertStayTime(VideoShareEntry videoShareEntry) {
        if (videoShareEntry == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(videoShareEntry.getId()));
        contentValues.put("name", videoShareEntry.getName());
        return writableDatabase.insertWithOnConflict(VideoShareEntry.TABLE_NAME, "id", contentValues, 5);
    }

    public synchronized boolean isExist(int i10) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_share where id='" + i10 + "'", new String[0]);
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

    public synchronized ArrayList<VideoShareEntry> queryItemHistory(int i10) {
        ArrayList<VideoShareEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_share where id='" + i10 + "'", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                    do {
                        VideoShareEntry videoShareEntry = new VideoShareEntry();
                        videoShareEntry.setId(cursorRawQuery.getInt(columnIndex));
                        videoShareEntry.setName(cursorRawQuery.getString(columnIndex2));
                        arrayList.add(videoShareEntry);
                    } while (cursorRawQuery.moveToNext());
                }
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                throw th2;
            }
        } catch (Exception e12) {
            b.c("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e12));
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e13) {
                    e = e13;
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public synchronized ArrayList<VideoShareEntry> queryStayTime() {
        ArrayList<VideoShareEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_share order by id desc", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                    do {
                        VideoShareEntry videoShareEntry = new VideoShareEntry();
                        videoShareEntry.setId(cursorRawQuery.getInt(columnIndex));
                        videoShareEntry.setName(cursorRawQuery.getString(columnIndex2));
                        arrayList.add(videoShareEntry);
                    } while (cursorRawQuery.moveToNext());
                }
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (Exception e11) {
                b.c("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e11));
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                    }
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
        return arrayList;
    }

    public static VideoShareDao getInstance() {
        if (instance == null) {
            synchronized (VideoShareDao.class) {
                if (instance == null) {
                    instance = new VideoShareDao();
                }
            }
        }
        return instance;
    }

    private VideoShareDao() {
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoShareEntry.TABLE_NAME, "", new String[0]);
    }
}
