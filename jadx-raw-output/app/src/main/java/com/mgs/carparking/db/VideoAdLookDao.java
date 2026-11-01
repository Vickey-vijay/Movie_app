package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.VideoAdLookEntity;
import em.o;
import java.util.ArrayList;
import t9.b;

/* JADX INFO: loaded from: classes3.dex */
public class VideoAdLookDao {
    private static volatile VideoAdLookDao instance;

    public synchronized void deleteItem(String str) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoAdLookEntity.TABLE_NAME, "CONTENT='" + str + "'", new String[0]);
    }

    public synchronized long getVideoLookTime(String str) {
        long j10;
        try {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = DBHelper.getInstance().getWritableDatabase().query(VideoAdLookEntity.TABLE_NAME, null, "content=?", new String[]{str}, null, null, null);
                    j10 = 0;
                    while (cursorQuery.moveToNext()) {
                        j10 = cursorQuery.getLong(cursorQuery.getColumnIndex(VideoAdLookEntity.VIDEOLOOKTIME));
                    }
                    try {
                        cursorQuery.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    return 0L;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return j10;
    }

    public synchronized long insertVideoAd(String str) {
        if (o.b(str)) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = writableDatabase.rawQuery("select * from VIDEO_AD_LOOK where CONTENT='" + str + "'", new String[0]);
                if (cursorRawQuery.getCount() > 0) {
                    b.c("数据已存在");
                    try {
                        cursorRawQuery.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    return 0L;
                }
                try {
                    cursorRawQuery.close();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("CONTENT", str);
                return writableDatabase.insertWithOnConflict(VideoAdLookEntity.TABLE_NAME, "CONTENT", contentValues, 5);
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
        } catch (Exception e13) {
            b.c("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e13));
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception e14) {
                    e = e14;
                    e.printStackTrace();
                }
            }
        }
        throw th;
    }

    public synchronized boolean isExist(String str) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from VIDEO_AD_LOOK where CONTENT='" + str + "'", new String[0]);
            if (cursorRawQuery.getCount() > 0) {
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
            return false;
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
    }

    public synchronized ArrayList<VideoAdLookEntity> queryItem(String str) {
        ArrayList<VideoAdLookEntity> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_collection where CONTENT='" + str + "'", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("CONTENT");
                    do {
                        VideoAdLookEntity videoAdLookEntity = new VideoAdLookEntity();
                        videoAdLookEntity.setContent(cursorRawQuery.getString(columnIndex));
                        arrayList.add(videoAdLookEntity);
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

    public synchronized void updateVideoLookTime(String str, long j10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(VideoAdLookEntity.VIDEOLOOKTIME, Long.valueOf(j10));
        writableDatabase.update(VideoAdLookEntity.TABLE_NAME, contentValues, "CONTENT='" + str + "'", null);
    }

    public static VideoAdLookDao getInstance() {
        if (instance == null) {
            synchronized (VideoAdLookDao.class) {
                if (instance == null) {
                    instance = new VideoAdLookDao();
                }
            }
        }
        return instance;
    }

    private VideoAdLookDao() {
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoAdLookEntity.TABLE_NAME, "", new String[0]);
    }
}
