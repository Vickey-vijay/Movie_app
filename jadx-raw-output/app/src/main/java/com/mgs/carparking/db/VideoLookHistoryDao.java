package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import em.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class VideoLookHistoryDao {
    private static volatile VideoLookHistoryDao instance;

    public synchronized void deleteHistory(VideoLookHistoryEntry videoLookHistoryEntry) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoLookHistoryEntry.TABLE_NAME, "id='" + videoLookHistoryEntry.getId() + "'", new String[0]);
    }

    public synchronized long insertHistory(VideoLookHistoryEntry videoLookHistoryEntry) {
        if (videoLookHistoryEntry == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = writableDatabase.rawQuery("select * from video_history where id='" + videoLookHistoryEntry.getId() + "'", new String[0]);
            if (cursorRawQuery.getCount() > 0) {
                deleteHistory(videoLookHistoryEntry);
            } else {
                ArrayList<VideoLookHistoryEntry> arrayListQueryHistory = queryHistory();
                if (arrayListQueryHistory != null && arrayListQueryHistory.size() == 50) {
                    deleteHistory(arrayListQueryHistory.get(49));
                }
            }
            try {
                cursorRawQuery.close();
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
            }
        } catch (Exception unused) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            throw th2;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(videoLookHistoryEntry.getId()));
        contentValues.put("name", videoLookHistoryEntry.getName());
        contentValues.put("coverUrl", videoLookHistoryEntry.getCoverUrl());
        contentValues.put("videoType", Integer.valueOf(videoLookHistoryEntry.getVideoType()));
        contentValues.put(VideoLookHistoryEntry.VIDEO_DESC, videoLookHistoryEntry.getVideoDesc());
        contentValues.put("updateTime", Long.valueOf(videoLookHistoryEntry.getUpdateTime()));
        contentValues.put("url", videoLookHistoryEntry.getUrl());
        contentValues.put(VideoLookHistoryEntry.CURRNET, Integer.valueOf(videoLookHistoryEntry.getCurrent()));
        contentValues.put(VideoLookHistoryEntry.CONTENNT_POSITION, Long.valueOf(videoLookHistoryEntry.getContentPosition()));
        contentValues.put("duration", Long.valueOf(videoLookHistoryEntry.getDuration()));
        contentValues.put(VideoLookHistoryEntry.ISNOTSHARE, Integer.valueOf(videoLookHistoryEntry.is_not_share()));
        contentValues.put("collection", Integer.valueOf(videoLookHistoryEntry.getCollection()));
        contentValues.put(VideoLookHistoryEntry.AUDIOTYPE, videoLookHistoryEntry.getAudiotype());
        contentValues.put(VideoLookHistoryEntry.SUBTITLETYPE, videoLookHistoryEntry.getSubtitletype());
        return writableDatabase.insertWithOnConflict(VideoLookHistoryEntry.TABLE_NAME, "name", contentValues, 5);
    }

    public synchronized ArrayList<VideoLookHistoryEntry> queryHistory() {
        ArrayList<VideoLookHistoryEntry> arrayList;
        Exception exc;
        ArrayList<VideoLookHistoryEntry> arrayList2 = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_history order by updateTime desc", new String[0]);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("id");
                        int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                        int columnIndex3 = cursorRawQuery.getColumnIndex("coverUrl");
                        int columnIndex4 = cursorRawQuery.getColumnIndex("videoType");
                        int columnIndex5 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.VIDEO_DESC);
                        int columnIndex6 = cursorRawQuery.getColumnIndex("updateTime");
                        int columnIndex7 = cursorRawQuery.getColumnIndex("url");
                        int columnIndex8 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.CURRNET);
                        int columnIndex9 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.CONTENNT_POSITION);
                        int columnIndex10 = cursorRawQuery.getColumnIndex("duration");
                        int columnIndex11 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.ISNOTSHARE);
                        int columnIndex12 = cursorRawQuery.getColumnIndex("collection");
                        int columnIndex13 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.AUDIOTYPE);
                        int columnIndex14 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.SUBTITLETYPE);
                        ArrayList<VideoLookHistoryEntry> arrayList3 = arrayList2;
                        while (true) {
                            try {
                                VideoLookHistoryEntry videoLookHistoryEntry = new VideoLookHistoryEntry();
                                int i10 = columnIndex14;
                                videoLookHistoryEntry.setId(cursorRawQuery.getInt(columnIndex));
                                videoLookHistoryEntry.setName(cursorRawQuery.getString(columnIndex2));
                                videoLookHistoryEntry.setCoverUrl(cursorRawQuery.getString(columnIndex3));
                                videoLookHistoryEntry.setVideoType(cursorRawQuery.getInt(columnIndex4));
                                videoLookHistoryEntry.setVideoDesc(cursorRawQuery.getString(columnIndex5));
                                int i11 = columnIndex2;
                                int i12 = columnIndex3;
                                videoLookHistoryEntry.setUpdateTime(cursorRawQuery.getLong(columnIndex6));
                                videoLookHistoryEntry.setUrl(cursorRawQuery.getString(columnIndex7));
                                videoLookHistoryEntry.setCurrent(cursorRawQuery.getInt(columnIndex8));
                                videoLookHistoryEntry.setContentPosition(cursorRawQuery.getLong(columnIndex9));
                                videoLookHistoryEntry.setDuration(cursorRawQuery.getLong(columnIndex10));
                                videoLookHistoryEntry.set_not_share(cursorRawQuery.getInt(columnIndex11));
                                videoLookHistoryEntry.setCollection(cursorRawQuery.getInt(columnIndex12));
                                videoLookHistoryEntry.setAudiotype(cursorRawQuery.getString(columnIndex13));
                                videoLookHistoryEntry.setSubtitletype(cursorRawQuery.getString(i10));
                                arrayList = arrayList3;
                                try {
                                    arrayList.add(videoLookHistoryEntry);
                                    if (!cursorRawQuery.moveToNext()) {
                                        break;
                                    }
                                    arrayList3 = arrayList;
                                    columnIndex3 = i12;
                                    columnIndex14 = i10;
                                    columnIndex2 = i11;
                                } catch (Exception e10) {
                                    e = e10;
                                    g.b("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e));
                                    if (cursorRawQuery != null) {
                                        try {
                                            cursorRawQuery.close();
                                        } catch (Exception e11) {
                                            exc = e11;
                                            exc.printStackTrace();
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                arrayList = arrayList3;
                            }
                        }
                        cursorRawQuery.close();
                    } else {
                        arrayList = arrayList2;
                    }
                    cursorRawQuery.close();
                } catch (Exception e13) {
                    exc = e13;
                    exc.printStackTrace();
                }
            } catch (Throwable th2) {
                if (cursorRawQuery == null) {
                    throw th2;
                }
                try {
                    cursorRawQuery.close();
                    throw th2;
                } catch (Exception e14) {
                    e14.printStackTrace();
                    throw th2;
                }
            }
        } catch (Exception e15) {
            e = e15;
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public synchronized ArrayList<VideoLookHistoryEntry> queryItemHistory(int i10) {
        ArrayList<VideoLookHistoryEntry> arrayList;
        Exception exc;
        ArrayList<VideoLookHistoryEntry> arrayList2 = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_history where id='" + i10 + "'", new String[0]);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("id");
                        int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                        int columnIndex3 = cursorRawQuery.getColumnIndex("coverUrl");
                        int columnIndex4 = cursorRawQuery.getColumnIndex("videoType");
                        int columnIndex5 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.VIDEO_DESC);
                        int columnIndex6 = cursorRawQuery.getColumnIndex("updateTime");
                        int columnIndex7 = cursorRawQuery.getColumnIndex("url");
                        int columnIndex8 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.CURRNET);
                        int columnIndex9 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.CONTENNT_POSITION);
                        int columnIndex10 = cursorRawQuery.getColumnIndex("duration");
                        int columnIndex11 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.ISNOTSHARE);
                        int columnIndex12 = cursorRawQuery.getColumnIndex("collection");
                        int columnIndex13 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.AUDIOTYPE);
                        int columnIndex14 = cursorRawQuery.getColumnIndex(VideoLookHistoryEntry.SUBTITLETYPE);
                        ArrayList<VideoLookHistoryEntry> arrayList3 = arrayList2;
                        while (true) {
                            try {
                                VideoLookHistoryEntry videoLookHistoryEntry = new VideoLookHistoryEntry();
                                int i11 = columnIndex14;
                                videoLookHistoryEntry.setId(cursorRawQuery.getInt(columnIndex));
                                videoLookHistoryEntry.setName(cursorRawQuery.getString(columnIndex2));
                                videoLookHistoryEntry.setCoverUrl(cursorRawQuery.getString(columnIndex3));
                                videoLookHistoryEntry.setVideoType(cursorRawQuery.getInt(columnIndex4));
                                videoLookHistoryEntry.setVideoDesc(cursorRawQuery.getString(columnIndex5));
                                int i12 = columnIndex2;
                                int i13 = columnIndex3;
                                videoLookHistoryEntry.setUpdateTime(cursorRawQuery.getLong(columnIndex6));
                                videoLookHistoryEntry.setUrl(cursorRawQuery.getString(columnIndex7));
                                videoLookHistoryEntry.setCurrent(cursorRawQuery.getInt(columnIndex8));
                                videoLookHistoryEntry.setContentPosition(cursorRawQuery.getLong(columnIndex9));
                                videoLookHistoryEntry.setDuration(cursorRawQuery.getLong(columnIndex10));
                                videoLookHistoryEntry.set_not_share(cursorRawQuery.getInt(columnIndex11));
                                videoLookHistoryEntry.setCollection(cursorRawQuery.getInt(columnIndex12));
                                videoLookHistoryEntry.setAudiotype(cursorRawQuery.getString(columnIndex13));
                                videoLookHistoryEntry.setSubtitletype(cursorRawQuery.getString(i11));
                                arrayList = arrayList3;
                                try {
                                    arrayList.add(videoLookHistoryEntry);
                                    if (!cursorRawQuery.moveToNext()) {
                                        break;
                                    }
                                    arrayList3 = arrayList;
                                    columnIndex3 = i13;
                                    columnIndex14 = i11;
                                    columnIndex2 = i12;
                                } catch (Exception e10) {
                                    e = e10;
                                    g.b("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e));
                                    if (cursorRawQuery != null) {
                                        try {
                                            cursorRawQuery.close();
                                        } catch (Exception e11) {
                                            exc = e11;
                                            exc.printStackTrace();
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                arrayList = arrayList3;
                            }
                        }
                        cursorRawQuery.close();
                    } else {
                        arrayList = arrayList2;
                    }
                    cursorRawQuery.close();
                } catch (Exception e13) {
                    exc = e13;
                    exc.printStackTrace();
                }
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                try {
                    cursorRawQuery.close();
                    throw th2;
                } catch (Exception e14) {
                    e14.printStackTrace();
                    throw th2;
                }
            }
        } catch (Exception e15) {
            e = e15;
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public synchronized void updateHistory(int i10, int i11) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(VideoLookHistoryEntry.ISNOTSHARE, Integer.valueOf(i10));
        writableDatabase.update(VideoLookHistoryEntry.TABLE_NAME, contentValues, "id='" + i11 + "'", null);
    }

    public static VideoLookHistoryDao getInstance() {
        if (instance == null) {
            synchronized (VideoLookHistoryDao.class) {
                if (instance == null) {
                    instance = new VideoLookHistoryDao();
                }
            }
        }
        return instance;
    }

    private VideoLookHistoryDao() {
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoLookHistoryEntry.TABLE_NAME, "", new String[0]);
    }
}
