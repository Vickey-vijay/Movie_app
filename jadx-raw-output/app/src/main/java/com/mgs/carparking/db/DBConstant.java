package com.mgs.carparking.db;

import com.mgs.carparking.dbtable.AdNumShowEntry;
import com.mgs.carparking.dbtable.SearchHistoryEntity;
import com.mgs.carparking.dbtable.SpecialCollectionEntry;
import com.mgs.carparking.dbtable.VideoAdLookEntity;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.dbtable.VideoLookHistoryEntry;
import com.mgs.carparking.dbtable.VideoShareEntry;
import com.mgs.carparking.dbtable.VideoSkipEntry;
import com.mgs.carparking.dbtable.VideoStayTimeEntry;
import com.mgs.carparking.download.DownloadEntity;

/* JADX INFO: loaded from: classes11.dex */
public interface DBConstant {
    public static final String DB_NAME = "social_video_FREE.db";
    public static final int DB_VERSION = 35;
    public static final int DB_VERSION_COLLECT = 1;
    public static final Class<?>[] DB_COLLECT_CLASSES = new Class[0];
    public static final Class<?>[] DB_CLASSES = {SearchHistoryEntity.class, DownloadEntity.class, VideoLookHistoryEntry.class, VideoDownloadEntity.class, VideoStayTimeEntry.class, VideoCollectionEntry.class, SpecialCollectionEntry.class, VideoShareEntry.class, VideoAdLookEntity.class, AdNumShowEntry.class, VideoSkipEntry.class};
}
