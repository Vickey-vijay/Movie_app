package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import em.g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class VideoDownloadDao {
    private static volatile VideoDownloadDao instance;

    public synchronized void deleteHistory(VideoDownloadEntity videoDownloadEntity) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoDownloadEntity.TABLE_NAME, "streamid='" + videoDownloadEntity.getStreamid() + "'", new String[0]);
    }

    public synchronized long insertHistory(VideoDownloadEntity videoDownloadEntity) {
        if (videoDownloadEntity == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = writableDatabase.rawQuery("select * from video_download where streamid='" + videoDownloadEntity.getStreamid() + "'", new String[0]);
            if (cursorRawQuery.getCount() > 0) {
                g.b("数据已存在");
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
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(videoDownloadEntity.getId()));
        contentValues.put("name", videoDownloadEntity.getName());
        contentValues.put(VideoDownloadEntity.LAST_NAME, videoDownloadEntity.getLastName());
        contentValues.put("coverUrl", videoDownloadEntity.getCoverUrl());
        contentValues.put("videoType", Integer.valueOf(videoDownloadEntity.getVideoType()));
        contentValues.put("updateTime", Long.valueOf(videoDownloadEntity.getUpdateTime()));
        contentValues.put("url", videoDownloadEntity.getUrl());
        contentValues.put("complete", Integer.valueOf(videoDownloadEntity.getComplete()));
        contentValues.put("size", Long.valueOf(videoDownloadEntity.getSize()));
        contentValues.put(VideoDownloadEntity.COMPLETE_NAME, videoDownloadEntity.getComplete_name());
        contentValues.put(VideoDownloadEntity.STREAMID, videoDownloadEntity.getStreamid());
        contentValues.put("status", Integer.valueOf(videoDownloadEntity.getStatus()));
        contentValues.put(VideoDownloadEntity.ORGINAL_URL, videoDownloadEntity.getOrginal_url());
        contentValues.put("collection", Integer.valueOf(videoDownloadEntity.getCollection()));
        contentValues.put(VideoDownloadEntity.DOWN_URL, videoDownloadEntity.getDown_url());
        contentValues.put(VideoDownloadEntity.VIDEO_POSITION, Integer.valueOf(videoDownloadEntity.getVideo_position()));
        contentValues.put(VideoDownloadEntity.AUDIO_TYPE, Integer.valueOf(videoDownloadEntity.getAudio_type()));
        return writableDatabase.insertWithOnConflict(VideoDownloadEntity.TABLE_NAME, "name", contentValues, 5);
    }

    public synchronized ArrayList<VideoDownloadEntity> queryHistory() {
        ArrayList<VideoDownloadEntity> arrayList;
        Exception exc;
        ArrayList<VideoDownloadEntity> arrayList2 = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_download order by updateTime desc", new String[0]);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("id");
                        int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                        int columnIndex3 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.LAST_NAME);
                        int columnIndex4 = cursorRawQuery.getColumnIndex("coverUrl");
                        int columnIndex5 = cursorRawQuery.getColumnIndex("videoType");
                        int columnIndex6 = cursorRawQuery.getColumnIndex("updateTime");
                        int columnIndex7 = cursorRawQuery.getColumnIndex("url");
                        int columnIndex8 = cursorRawQuery.getColumnIndex("complete");
                        int columnIndex9 = cursorRawQuery.getColumnIndex("size");
                        int columnIndex10 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.COMPLETE_NAME);
                        int columnIndex11 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.STREAMID);
                        int columnIndex12 = cursorRawQuery.getColumnIndex("status");
                        int columnIndex13 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.ORGINAL_URL);
                        int columnIndex14 = cursorRawQuery.getColumnIndex("collection");
                        ArrayList<VideoDownloadEntity> arrayList3 = arrayList2;
                        try {
                            int columnIndex15 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.DOWN_URL);
                            int columnIndex16 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.VIDEO_POSITION);
                            int columnIndex17 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.AUDIO_TYPE);
                            while (true) {
                                VideoDownloadEntity videoDownloadEntity = new VideoDownloadEntity();
                                int i10 = columnIndex14;
                                videoDownloadEntity.setId(cursorRawQuery.getInt(columnIndex));
                                videoDownloadEntity.setName(cursorRawQuery.getString(columnIndex2));
                                videoDownloadEntity.setLastName(cursorRawQuery.getString(columnIndex3));
                                videoDownloadEntity.setCoverUrl(cursorRawQuery.getString(columnIndex4));
                                videoDownloadEntity.setVideoType(cursorRawQuery.getInt(columnIndex5));
                                int i11 = columnIndex2;
                                int i12 = columnIndex3;
                                videoDownloadEntity.setUpdateTime(cursorRawQuery.getLong(columnIndex6));
                                videoDownloadEntity.setUrl(cursorRawQuery.getString(columnIndex7));
                                videoDownloadEntity.setComplete(cursorRawQuery.getInt(columnIndex8));
                                videoDownloadEntity.setSize(cursorRawQuery.getLong(columnIndex9));
                                videoDownloadEntity.setComplete_name(cursorRawQuery.getString(columnIndex10));
                                videoDownloadEntity.setStreamid(cursorRawQuery.getString(columnIndex11));
                                videoDownloadEntity.setStatus(cursorRawQuery.getInt(columnIndex12));
                                videoDownloadEntity.setOrginal_url(cursorRawQuery.getString(columnIndex13));
                                videoDownloadEntity.setCollection(cursorRawQuery.getInt(i10));
                                int i13 = columnIndex15;
                                int i14 = columnIndex;
                                videoDownloadEntity.setDown_url(cursorRawQuery.getString(i13));
                                int i15 = columnIndex16;
                                videoDownloadEntity.setVideo_position(cursorRawQuery.getInt(i15));
                                columnIndex16 = i15;
                                int i16 = columnIndex17;
                                videoDownloadEntity.setAudio_type(cursorRawQuery.getInt(i16));
                                columnIndex17 = i16;
                                arrayList = arrayList3;
                                try {
                                    arrayList.add(videoDownloadEntity);
                                    if (!cursorRawQuery.moveToNext()) {
                                        break;
                                    }
                                    arrayList3 = arrayList;
                                    columnIndex2 = i11;
                                    columnIndex = i14;
                                    columnIndex14 = i10;
                                    columnIndex15 = i13;
                                    columnIndex3 = i12;
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
                            }
                            cursorRawQuery.close();
                        } catch (Exception e12) {
                            e = e12;
                            arrayList = arrayList3;
                        }
                    } else {
                        arrayList = arrayList2;
                    }
                    cursorRawQuery.close();
                } catch (Exception e13) {
                    exc = e13;
                    exc.printStackTrace();
                }
            } catch (Exception e14) {
                e = e14;
                arrayList = arrayList2;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery == null) {
                throw th2;
            }
            try {
                cursorRawQuery.close();
                throw th2;
            } catch (Exception e15) {
                e15.printStackTrace();
                throw th2;
            }
        }
        return arrayList;
    }

    public synchronized ArrayList<VideoDownloadEntity> queryItemHistory(int i10) {
        ArrayList<VideoDownloadEntity> arrayList;
        Exception exc;
        ArrayList<VideoDownloadEntity> arrayList2 = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from video_download where id='" + i10 + "'", new String[0]);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("id");
                        int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                        int columnIndex3 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.LAST_NAME);
                        int columnIndex4 = cursorRawQuery.getColumnIndex("coverUrl");
                        int columnIndex5 = cursorRawQuery.getColumnIndex("videoType");
                        int columnIndex6 = cursorRawQuery.getColumnIndex("updateTime");
                        int columnIndex7 = cursorRawQuery.getColumnIndex("url");
                        int columnIndex8 = cursorRawQuery.getColumnIndex("complete");
                        int columnIndex9 = cursorRawQuery.getColumnIndex("size");
                        int columnIndex10 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.COMPLETE_NAME);
                        int columnIndex11 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.STREAMID);
                        int columnIndex12 = cursorRawQuery.getColumnIndex("status");
                        int columnIndex13 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.ORGINAL_URL);
                        int columnIndex14 = cursorRawQuery.getColumnIndex("collection");
                        ArrayList<VideoDownloadEntity> arrayList3 = arrayList2;
                        try {
                            int columnIndex15 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.DOWN_URL);
                            int columnIndex16 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.VIDEO_POSITION);
                            int columnIndex17 = cursorRawQuery.getColumnIndex(VideoDownloadEntity.AUDIO_TYPE);
                            while (true) {
                                VideoDownloadEntity videoDownloadEntity = new VideoDownloadEntity();
                                int i11 = columnIndex14;
                                videoDownloadEntity.setId(cursorRawQuery.getInt(columnIndex));
                                videoDownloadEntity.setName(cursorRawQuery.getString(columnIndex2));
                                videoDownloadEntity.setLastName(cursorRawQuery.getString(columnIndex3));
                                videoDownloadEntity.setCoverUrl(cursorRawQuery.getString(columnIndex4));
                                videoDownloadEntity.setVideoType(cursorRawQuery.getInt(columnIndex5));
                                int i12 = columnIndex2;
                                int i13 = columnIndex3;
                                videoDownloadEntity.setUpdateTime(cursorRawQuery.getLong(columnIndex6));
                                videoDownloadEntity.setUrl(cursorRawQuery.getString(columnIndex7));
                                videoDownloadEntity.setComplete(cursorRawQuery.getInt(columnIndex8));
                                videoDownloadEntity.setSize(cursorRawQuery.getLong(columnIndex9));
                                videoDownloadEntity.setComplete_name(cursorRawQuery.getString(columnIndex10));
                                videoDownloadEntity.setStreamid(cursorRawQuery.getString(columnIndex11));
                                videoDownloadEntity.setStatus(cursorRawQuery.getInt(columnIndex12));
                                videoDownloadEntity.setOrginal_url(cursorRawQuery.getString(columnIndex13));
                                videoDownloadEntity.setCollection(cursorRawQuery.getInt(i11));
                                int i14 = columnIndex15;
                                int i15 = columnIndex;
                                videoDownloadEntity.setDown_url(cursorRawQuery.getString(i14));
                                int i16 = columnIndex16;
                                videoDownloadEntity.setVideo_position(cursorRawQuery.getInt(i16));
                                columnIndex16 = i16;
                                int i17 = columnIndex17;
                                videoDownloadEntity.setAudio_type(cursorRawQuery.getInt(i17));
                                columnIndex17 = i17;
                                arrayList = arrayList3;
                                try {
                                    arrayList.add(videoDownloadEntity);
                                    if (!cursorRawQuery.moveToNext()) {
                                        break;
                                    }
                                    columnIndex = i15;
                                    arrayList3 = arrayList;
                                    columnIndex15 = i14;
                                    columnIndex2 = i12;
                                    columnIndex14 = i11;
                                    columnIndex3 = i13;
                                } catch (Exception e10) {
                                    e = e10;
                                    g.b("获取下载数据库失败 >>> " + Log.getStackTraceString(e));
                                    if (cursorRawQuery != null) {
                                        try {
                                            cursorRawQuery.close();
                                        } catch (Exception e11) {
                                            exc = e11;
                                            exc.printStackTrace();
                                        }
                                    }
                                }
                            }
                            cursorRawQuery.close();
                        } catch (Exception e12) {
                            e = e12;
                            arrayList = arrayList3;
                        }
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

    public synchronized void updateHistory(int i10, String str, long j10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("complete", Integer.valueOf(i10));
        contentValues.put("size", Long.valueOf(j10));
        writableDatabase.update(VideoDownloadEntity.TABLE_NAME, contentValues, "streamid='" + str + "'", null);
    }

    public static VideoDownloadDao getInstance() {
        if (instance == null) {
            synchronized (VideoDownloadDao.class) {
                if (instance == null) {
                    instance = new VideoDownloadDao();
                }
            }
        }
        return instance;
    }

    private VideoDownloadDao() {
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(VideoDownloadEntity.TABLE_NAME, "", new String[0]);
    }

    public synchronized void deleteHistory(String str) {
        DBHelper.getInstance().getWritableDatabase().delete(VideoDownloadEntity.TABLE_NAME, "streamid='" + str + "'", new String[0]);
    }
}
