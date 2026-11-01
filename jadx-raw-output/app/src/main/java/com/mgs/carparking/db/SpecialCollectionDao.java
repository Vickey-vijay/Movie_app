package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.SpecialCollectionEntry;
import java.util.ArrayList;
import t9.b;

/* JADX INFO: loaded from: classes10.dex */
public class SpecialCollectionDao {
    private static volatile SpecialCollectionDao instance;

    public synchronized void delete(SpecialCollectionEntry specialCollectionEntry) {
        DBHelper.getInstance().getWritableDatabase().delete(SpecialCollectionEntry.TABLE_NAME, "id='" + specialCollectionEntry.getId() + "'", new String[0]);
    }

    public synchronized void deleteById(int i10) {
        DBHelper.getInstance().getWritableDatabase().delete(SpecialCollectionEntry.TABLE_NAME, "id='" + i10 + "'", new String[0]);
    }

    public synchronized long insert(SpecialCollectionEntry specialCollectionEntry) {
        if (specialCollectionEntry == null) {
            return 0L;
        }
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(specialCollectionEntry.getId()));
        contentValues.put("name", specialCollectionEntry.getName());
        contentValues.put("icon", specialCollectionEntry.getIcon());
        contentValues.put("content", specialCollectionEntry.getContent());
        return writableDatabase.insertWithOnConflict(SpecialCollectionEntry.TABLE_NAME, "id", contentValues, 5);
    }

    public synchronized boolean isExist(int i10) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from special_collection where id='" + i10 + "'", new String[0]);
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

    public synchronized ArrayList<SpecialCollectionEntry> query() {
        ArrayList<SpecialCollectionEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from special_collection order by id desc", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                    int columnIndex3 = cursorRawQuery.getColumnIndex("content");
                    int columnIndex4 = cursorRawQuery.getColumnIndex("icon");
                    do {
                        SpecialCollectionEntry specialCollectionEntry = new SpecialCollectionEntry();
                        specialCollectionEntry.setId(cursorRawQuery.getInt(columnIndex));
                        specialCollectionEntry.setName(cursorRawQuery.getString(columnIndex2));
                        specialCollectionEntry.setContent(cursorRawQuery.getString(columnIndex3));
                        specialCollectionEntry.setIcon(cursorRawQuery.getString(columnIndex4));
                        arrayList.add(specialCollectionEntry);
                    } while (cursorRawQuery.moveToNext());
                }
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (Exception e11) {
                b.c("获取收藏影片数据库失败 >>> " + Log.getStackTraceString(e11));
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

    public synchronized ArrayList<SpecialCollectionEntry> queryItemHistory(int i10) {
        ArrayList<SpecialCollectionEntry> arrayList;
        arrayList = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from special_collection where id='" + i10 + "'", new String[0]);
                if (cursorRawQuery.moveToFirst()) {
                    int columnIndex = cursorRawQuery.getColumnIndex("id");
                    int columnIndex2 = cursorRawQuery.getColumnIndex("name");
                    int columnIndex3 = cursorRawQuery.getColumnIndex("content");
                    int columnIndex4 = cursorRawQuery.getColumnIndex("icon");
                    do {
                        SpecialCollectionEntry specialCollectionEntry = new SpecialCollectionEntry();
                        specialCollectionEntry.setId(cursorRawQuery.getInt(columnIndex));
                        specialCollectionEntry.setName(cursorRawQuery.getString(columnIndex2));
                        specialCollectionEntry.setContent(cursorRawQuery.getString(columnIndex3));
                        specialCollectionEntry.setIcon(cursorRawQuery.getString(columnIndex4));
                        arrayList.add(specialCollectionEntry);
                    } while (cursorRawQuery.moveToNext());
                }
                try {
                    cursorRawQuery.close();
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } catch (Exception e11) {
                b.c("获取收藏数据库失败 >>> " + Log.getStackTraceString(e11));
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

    public static SpecialCollectionDao getInstance() {
        if (instance == null) {
            synchronized (SpecialCollectionDao.class) {
                if (instance == null) {
                    instance = new SpecialCollectionDao();
                }
            }
        }
        return instance;
    }

    private SpecialCollectionDao() {
    }

    public void clearHistory() {
        DBHelper.getInstance().getWritableDatabase().delete(SpecialCollectionEntry.TABLE_NAME, "", new String[0]);
    }
}
