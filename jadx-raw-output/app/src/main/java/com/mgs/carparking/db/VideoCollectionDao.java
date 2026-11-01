package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import java.util.ArrayList;
import t9.b;

/* JADX INFO: loaded from: classes2.dex */
public class VideoCollectionDao {
    private static volatile VideoCollectionDao instance;

    public synchronized void delete(VideoCollectionEntry videoCollectionEntry) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoCollectionEntry.TABLE_NAME, "id='" + videoCollectionEntry.getId() + "'", new String[0]);
    }

    public synchronized long insert(VideoCollectionEntry videoCollectionEntry) {
        if (videoCollectionEntry == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(videoCollectionEntry.getId()));
        contentValues.put(VideoCollectionEntry.VOD_NAME, videoCollectionEntry.getVod_name());
        contentValues.put(VideoCollectionEntry.VOD_PIC, videoCollectionEntry.getVod_pic());
        contentValues.put(VideoCollectionEntry.TYPE_PID, Integer.valueOf(videoCollectionEntry.getType_pid()));
        contentValues.put(VideoCollectionEntry.VOD_YEAR, videoCollectionEntry.getVod_year());
        contentValues.put(VideoCollectionEntry.VOD_AREA, videoCollectionEntry.getVod_area());
        contentValues.put(VideoCollectionEntry.VOD_DIRECTOR, videoCollectionEntry.getVod_director());
        contentValues.put(VideoCollectionEntry.VOD_DOUBAN_SCORE, videoCollectionEntry.getVod_douban_score());
        contentValues.put(VideoCollectionEntry.VOD_ACTOR, videoCollectionEntry.getVod_actor());
        return writableDatabase.insertWithOnConflict(VideoCollectionEntry.TABLE_NAME, "id", contentValues, 5);
    }

    public synchronized boolean isExist(int i10) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_collection where id='" + i10 + "'", new String[0]);
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

    public synchronized ArrayList<VideoCollectionEntry> query() {
        ArrayList<VideoCollectionEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_collection order by id desc", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_NAME);
                    int columnIndex3 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_PIC);
                    int columnIndex4 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.TYPE_PID);
                    int columnIndex5 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_YEAR);
                    int columnIndex6 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_AREA);
                    int columnIndex7 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_DIRECTOR);
                    int columnIndex8 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_DOUBAN_SCORE);
                    int columnIndex9 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_ACTOR);
                    do {
                        VideoCollectionEntry videoCollectionEntry = new VideoCollectionEntry();
                        videoCollectionEntry.setId(cursorRawQuery.getInt(columnIndex));
                        videoCollectionEntry.setVod_name(cursorRawQuery.getString(columnIndex2));
                        videoCollectionEntry.setVod_pic(cursorRawQuery.getString(columnIndex3));
                        videoCollectionEntry.setVod_year(cursorRawQuery.getString(columnIndex5));
                        videoCollectionEntry.setType_pid(cursorRawQuery.getInt(columnIndex4));
                        videoCollectionEntry.setVod_area(cursorRawQuery.getString(columnIndex6));
                        videoCollectionEntry.setVod_director(cursorRawQuery.getString(columnIndex7));
                        videoCollectionEntry.setVod_douban_score(cursorRawQuery.getString(columnIndex8));
                        videoCollectionEntry.setVod_actor(cursorRawQuery.getString(columnIndex9));
                        arrayList.add(videoCollectionEntry);
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
            b.c("获取收藏影片数据库失败 >>> " + Log.getStackTraceString(e12));
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

    public synchronized ArrayList<VideoCollectionEntry> queryItemHistory(int i10) {
        ArrayList<VideoCollectionEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_collection where id='" + i10 + "'", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_NAME);
                    int columnIndex3 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_PIC);
                    int columnIndex4 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.TYPE_PID);
                    int columnIndex5 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_YEAR);
                    int columnIndex6 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_AREA);
                    int columnIndex7 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_DIRECTOR);
                    int columnIndex8 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_DOUBAN_SCORE);
                    int columnIndex9 = cursorRawQuery.getColumnIndex(VideoCollectionEntry.VOD_ACTOR);
                    do {
                        VideoCollectionEntry videoCollectionEntry = new VideoCollectionEntry();
                        videoCollectionEntry.setId(cursorRawQuery.getInt(columnIndex));
                        videoCollectionEntry.setVod_name(cursorRawQuery.getString(columnIndex2));
                        videoCollectionEntry.setVod_pic(cursorRawQuery.getString(columnIndex3));
                        videoCollectionEntry.setVod_year(cursorRawQuery.getString(columnIndex5));
                        videoCollectionEntry.setType_pid(cursorRawQuery.getInt(columnIndex4));
                        videoCollectionEntry.setVod_area(cursorRawQuery.getString(columnIndex6));
                        videoCollectionEntry.setVod_director(cursorRawQuery.getString(columnIndex7));
                        videoCollectionEntry.setVod_douban_score(cursorRawQuery.getString(columnIndex8));
                        videoCollectionEntry.setVod_actor(cursorRawQuery.getString(columnIndex9));
                        arrayList.add(videoCollectionEntry);
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
            b.c("获取收藏数据库失败 >>> " + Log.getStackTraceString(e12));
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

    public static VideoCollectionDao getInstance() {
        if (instance == null) {
            synchronized (VideoCollectionDao.class) {
                if (instance == null) {
                    instance = new VideoCollectionDao();
                }
            }
        }
        return instance;
    }

    private VideoCollectionDao() {
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoCollectionEntry.TABLE_NAME, "", new String[0]);
    }

    public synchronized void delete(int i10) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoCollectionEntry.TABLE_NAME, "id='" + i10 + "'", new String[0]);
    }
}
