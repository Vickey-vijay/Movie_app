package com.mgs.carparking.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mgs.carparking.dbtable.AdNumShowEntry;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import em.r;

/* JADX INFO: loaded from: classes7.dex */
public class DBHelper extends SQLiteOpenHelper {
    private static volatile DBHelper instance;

    private DBHelper(Context context) {
        this(context, DBConstant.DB_NAME, null, 35);
    }

    private DBHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        super(context, str, cursorFactory, i10);
    }

    public static DBHelper getInstance() {
        if (instance == null) {
            synchronized (DBHelper.class) {
                if (instance == null) {
                    instance = new DBHelper(r.a());
                }
            }
        }
        return instance;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        TableHelper.createTablesByClasses(sQLiteDatabase, DBConstant.DB_CLASSES);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        switch (i10) {
            case 25:
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.PLAYMOBNUM, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.PLAYMOBINFO, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.DOWNLOADMOBNUM, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.ROTATIONMOBNUM, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.SPLASHMOBNUM, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.AUDIOTYPE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoDownloadEntity.class, VideoDownloadEntity.AUDIO_TYPE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.INTERSTITIALHOMEINDEX3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.BANNERVIDEOPAUSEINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXBANNERVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.BANNERMOREINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXBANNERMORE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.FLOATVIEWADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXFLOATVIEWAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.RANKBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXRANKBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.SEARCHBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXSEARCHBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OPENSETINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.CLINGREWARDADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.SUBTITLETYPE, 0);
                break;
            case 26:
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.AUDIOTYPE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoDownloadEntity.class, VideoDownloadEntity.AUDIO_TYPE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.INTERSTITIALHOMEINDEX3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.BANNERVIDEOPAUSEINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXBANNERVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.BANNERMOREINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXBANNERMORE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.FLOATVIEWADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXFLOATVIEWAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.RANKBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXRANKBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.SEARCHBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXSEARCHBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OPENSETINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.CLINGREWARDADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.SUBTITLETYPE, 0);
                break;
            case 28:
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.INTERSTITIALHOMEINDEX3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.BANNERVIDEOPAUSEINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXBANNERVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.BANNERMOREINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXBANNERMORE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.FLOATVIEWADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXFLOATVIEWAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.RANKBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXRANKBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.SEARCHBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXSEARCHBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OPENSETINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.CLINGREWARDADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.SUBTITLETYPE, 0);
                break;
            case 30:
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.RANKBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXRANKBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.SEARCHBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXSEARCHBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OPENSETINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.CLINGREWARDADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.SUBTITLETYPE, 0);
                break;
            case 31:
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.SEARCHBANNERADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXSEARCHBANNERAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OPENSETINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.CLINGREWARDADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.SUBTITLETYPE, 0);
                break;
            case 32:
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OPENSETINTERSTITIALHOME3, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETVIDEOPAUSE, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.CLINGREWARDADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.SUBTITLETYPE, 0);
                break;
            case 33:
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.WXCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.CLINGREWARDADINDEX, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, AdNumShowEntry.class, AdNumShowEntry.OSETCLINGREWARDAD, 0);
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.SUBTITLETYPE, 0);
                break;
            case 34:
                TableHelper.addColumnInteger(sQLiteDatabase, VideoLookHistoryEntry.class, VideoLookHistoryEntry.SUBTITLETYPE, 0);
                break;
        }
    }
}
