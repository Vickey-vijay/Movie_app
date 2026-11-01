package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.SearchHistoryEntity;
import java.util.ArrayList;
import t9.b;

/* JADX INFO: loaded from: classes2.dex */
public class SearchHistoryDao {
    private static volatile SearchHistoryDao instance;

    public synchronized void deleteHistory(SearchHistoryEntity searchHistoryEntity) {
        DBHelper.getInstance().getWritableDatabase().delete(SearchHistoryEntity.TABLE_NAME, "CONTENT='" + searchHistoryEntity.getContent() + "'", new String[0]);
    }

    public synchronized long insertHistory(SearchHistoryEntity searchHistoryEntity) {
        if (searchHistoryEntity == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = writableDatabase.rawQuery("select * from VIDEO_SEARCH_HISTORY where CONTENT='" + searchHistoryEntity.getContent() + "'", new String[0]);
                if (cursorRawQuery.getCount() > 0) {
                    b.c("数据已存在");
                    try {
                        cursorRawQuery.close();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    return 0L;
                }
                ArrayList<SearchHistoryEntity> arrayListQueryHistory = queryHistory();
                if (arrayListQueryHistory != null && arrayListQueryHistory.size() == 10) {
                    deleteHistory(arrayListQueryHistory.get(0));
                }
                try {
                    cursorRawQuery.close();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("CONTENT", searchHistoryEntity.getContent());
                contentValues.put(SearchHistoryEntity.CREATE_TIME, Long.valueOf(searchHistoryEntity.getCreateTime()));
                return writableDatabase.insertWithOnConflict(SearchHistoryEntity.TABLE_NAME, "CONTENT", contentValues, 5);
            } catch (Exception e12) {
                b.c("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e12));
                if (0 != 0) {
                    try {
                        cursor.close();
                    } catch (Exception e13) {
                        e = e13;
                        e.printStackTrace();
                    }
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
            throw th2;
        }
    }

    public synchronized ArrayList<SearchHistoryEntity> queryHistory() {
        ArrayList<SearchHistoryEntity> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from VIDEO_SEARCH_HISTORY order by create_time asc", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("CONTENT");
                    int columnIndex2 = cursorRawQuery.getColumnIndex(SearchHistoryEntity.CREATE_TIME);
                    do {
                        SearchHistoryEntity searchHistoryEntity = new SearchHistoryEntity();
                        searchHistoryEntity.setContent(cursorRawQuery.getString(columnIndex));
                        searchHistoryEntity.setCreateTime(columnIndex2);
                        arrayList.add(searchHistoryEntity);
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

    public static SearchHistoryDao getInstance() {
        if (instance == null) {
            synchronized (SearchHistoryDao.class) {
                if (instance == null) {
                    instance = new SearchHistoryDao();
                }
            }
        }
        return instance;
    }

    private SearchHistoryDao() {
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(SearchHistoryEntity.TABLE_NAME, "", new String[0]);
    }
}
