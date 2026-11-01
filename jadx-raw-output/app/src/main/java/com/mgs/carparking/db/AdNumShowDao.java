package com.mgs.carparking.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.mgs.carparking.dbtable.AdNumShowEntry;
import java.util.ArrayList;
import t9.b;

/* JADX INFO: loaded from: classes7.dex */
public class AdNumShowDao {
    private static volatile AdNumShowDao mInstance;

    public synchronized boolean getAdStatus(int i10) {
        boolean z10;
        try {
            Cursor cursorQuery = null;
            boolean z11 = false;
            try {
                try {
                    cursorQuery = DBHelper.getInstance().getWritableDatabase().query(AdNumShowEntry.TABLE_NAME, null, "id=?", new String[]{"1"}, null, null, null);
                    loop0: while (true) {
                        z10 = false;
                        while (true) {
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    try {
                                        break loop0;
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                } else if (i10 == 1) {
                                    if (cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.CSJREWARDAD)) <= 0) {
                                        break;
                                    }
                                    z10 = true;
                                } else if (i10 == 2) {
                                    if (cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.GDTREWARDAD)) <= 0) {
                                        break;
                                    }
                                    z10 = true;
                                } else if (i10 != 4) {
                                    continue;
                                } else {
                                    if (cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.TDREWARDAD)) <= 0) {
                                        break;
                                    }
                                    z10 = true;
                                }
                            } catch (Exception unused) {
                                z11 = z10;
                                if (cursorQuery != null) {
                                    try {
                                        cursorQuery.close();
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                }
                                return z11;
                            }
                        }
                    }
                    cursorQuery.close();
                    return z10;
                } catch (Exception unused2) {
                }
            } catch (Throwable th2) {
                if (0 != 0) {
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
    }

    public synchronized int getNum(int i10) {
        int i11;
        try {
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = DBHelper.getInstance().getWritableDatabase().query(AdNumShowEntry.TABLE_NAME, null, "id=?", new String[]{"1"}, null, null, null);
                    i11 = 0;
                    while (cursorQuery.moveToNext()) {
                        if (i10 == 1) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHWXNUM));
                        } else if (i10 == 2) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHTDNUM));
                        } else if (i10 == 28) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHTHIRDNUM));
                        } else if (i10 == 83) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHMOBNUM));
                        } else if (i10 == 3) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONWXNUM));
                        } else if (i10 == 4) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONTDNUM));
                        } else if (i10 == 14) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONTHIRDNUM));
                        } else if (i10 == 84) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONMOBNUM));
                        } else if (i10 == 5) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.BANNERWXNUM));
                        } else if (i10 == 6) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.BANNERTDNUM));
                        } else if (i10 == 7) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYWXNUM));
                        } else if (i10 == 8) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTDNUM));
                        } else if (i10 == 29) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTHIRDNUM));
                        } else if (i10 == 80) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYMOBNUM));
                        } else if (i10 == 9) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADWXNUM));
                        } else if (i10 == 10) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADTDNUM));
                        } else if (i10 == 30) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADTHIRDNUM));
                        } else if (i10 == 82) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADMOBNUM));
                        } else if (i10 == 11) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYWXINFO));
                        } else if (i10 == 12) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTDINFO));
                        } else if (i10 == 13) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTHIRDINFO));
                        } else if (i10 == 81) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYMOBINFO));
                        } else if (i10 == 15) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.UPDATEWXNUM));
                        } else if (i10 == 16) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.UPDATETDNUM));
                        } else if (i10 == 85) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.UPDATEADSETNUM));
                        } else if (i10 == 17) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHWXINFO));
                        } else if (i10 == 18) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHTDINFO));
                        } else if (i10 == 19) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHTHIRDINFO));
                        } else if (i10 == 51) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYWXCENTER));
                        } else if (i10 == 52) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTDCENTER));
                        } else if (i10 == 53) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYTHIRDCENTER));
                        } else if (i10 == 71) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.CSJINTERSTITIALHOME));
                        } else if (i10 == 72) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.GDTINTERSTITIALHOME));
                        } else if (i10 == 21) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SPLASHINDEX));
                        } else if (i10 == 22) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.ROTATIONINDEX));
                        } else if (i10 == 23) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYINDEX));
                        } else if (i10 == 24) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.DOWNLOADINDEX));
                        } else if (i10 == 25) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYINFOINDEX));
                        } else if (i10 == 26) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.UPDATEINDEX));
                        } else if (i10 == 27) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHINDEX));
                        } else if (i10 == 50) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.PLAYCENTERINDEX));
                        } else if (i10 == 70) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.INTERSTITIALHOMEINDEX));
                        } else if (i10 == 90) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.INTERSTITIALHOMEINDEX3));
                        } else if (i10 == 91) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXINTERSTITIALHOME3));
                        } else if (i10 == 92) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.OPENSETINTERSTITIALHOME3));
                        } else if (i10 == 95) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.BANNERVIDEOPAUSEINDEX));
                        } else if (i10 == 96) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXBANNERVIDEOPAUSE));
                        } else if (i10 == 97) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.OSETVIDEOPAUSE));
                        } else if (i10 == 100) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.BANNERMOREINDEX));
                        } else if (i10 == 101) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXBANNERMORE));
                        } else if (i10 == 102) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.FLOATVIEWADINDEX));
                        } else if (i10 == 103) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXFLOATVIEWAD));
                        } else if (i10 == 104) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.RANKBANNERADINDEX));
                        } else if (i10 == 105) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXRANKBANNERAD));
                        } else if (i10 == 106) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.SEARCHBANNERADINDEX));
                        } else if (i10 == 107) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXSEARCHBANNERAD));
                        } else if (i10 == 108) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.CLINGREWARDADINDEX));
                        } else if (i10 == 109) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.WXCLINGREWARDAD));
                        } else if (i10 == 110) {
                            i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(AdNumShowEntry.OSETCLINGREWARDAD));
                        }
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
                    return 0;
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
        return i11;
    }

    public synchronized long insertHistory() {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = writableDatabase.rawQuery("select * from ad_shownum where id='1'", new String[0]);
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
        contentValues.put("id", (Integer) 1);
        return writableDatabase.insertWithOnConflict(AdNumShowEntry.TABLE_NAME, "id", contentValues, 5);
    }

    public synchronized ArrayList<AdNumShowEntry> queryHistory() {
        ArrayList<AdNumShowEntry> arrayList;
        Exception exc;
        ArrayList<AdNumShowEntry> arrayList2 = new ArrayList<>();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = DBHelper.getInstance().getWritableDatabase().rawQuery("select * from ad_shownum order by id desc", new String[0]);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        int columnIndex = cursorRawQuery.getColumnIndex("id");
                        int columnIndex2 = cursorRawQuery.getColumnIndex(AdNumShowEntry.SPLASHWXNUM);
                        int columnIndex3 = cursorRawQuery.getColumnIndex(AdNumShowEntry.SPLASHTDNUM);
                        int columnIndex4 = cursorRawQuery.getColumnIndex(AdNumShowEntry.SPLASHTHIRDNUM);
                        int columnIndex5 = cursorRawQuery.getColumnIndex(AdNumShowEntry.SPLASHMOBNUM);
                        int columnIndex6 = cursorRawQuery.getColumnIndex(AdNumShowEntry.ROTATIONWXNUM);
                        int columnIndex7 = cursorRawQuery.getColumnIndex(AdNumShowEntry.ROTATIONTDNUM);
                        int columnIndex8 = cursorRawQuery.getColumnIndex(AdNumShowEntry.ROTATIONTHIRDNUM);
                        int columnIndex9 = cursorRawQuery.getColumnIndex(AdNumShowEntry.ROTATIONMOBNUM);
                        int columnIndex10 = cursorRawQuery.getColumnIndex(AdNumShowEntry.BANNERWXNUM);
                        int columnIndex11 = cursorRawQuery.getColumnIndex(AdNumShowEntry.BANNERTDNUM);
                        int columnIndex12 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYWXNUM);
                        int columnIndex13 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYTDNUM);
                        int columnIndex14 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYTHIRDNUM);
                        ArrayList<AdNumShowEntry> arrayList3 = arrayList2;
                        try {
                            int columnIndex15 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYMOBNUM);
                            int columnIndex16 = cursorRawQuery.getColumnIndex(AdNumShowEntry.DOWNLOADWXNUM);
                            int columnIndex17 = cursorRawQuery.getColumnIndex(AdNumShowEntry.DOWNLOADWXNUM);
                            int columnIndex18 = cursorRawQuery.getColumnIndex(AdNumShowEntry.DOWNLOADTHIRDNUM);
                            int columnIndex19 = cursorRawQuery.getColumnIndex(AdNumShowEntry.DOWNLOADMOBNUM);
                            int columnIndex20 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYWXINFO);
                            int columnIndex21 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYTDINFO);
                            int columnIndex22 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYTHIRDINFO);
                            int columnIndex23 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYMOBINFO);
                            int columnIndex24 = cursorRawQuery.getColumnIndex(AdNumShowEntry.UPDATEWXNUM);
                            int columnIndex25 = cursorRawQuery.getColumnIndex(AdNumShowEntry.UPDATETDNUM);
                            int columnIndex26 = cursorRawQuery.getColumnIndex(AdNumShowEntry.UPDATEADSETNUM);
                            int columnIndex27 = cursorRawQuery.getColumnIndex(AdNumShowEntry.SPLASHINDEX);
                            int columnIndex28 = cursorRawQuery.getColumnIndex(AdNumShowEntry.ROTATIONINDEX);
                            int columnIndex29 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYINDEX);
                            int columnIndex30 = cursorRawQuery.getColumnIndex(AdNumShowEntry.DOWNLOADINDEX);
                            int columnIndex31 = cursorRawQuery.getColumnIndex(AdNumShowEntry.PLAYINFOINDEX);
                            int columnIndex32 = cursorRawQuery.getColumnIndex(AdNumShowEntry.UPDATEINDEX);
                            int columnIndex33 = cursorRawQuery.getColumnIndex(AdNumShowEntry.INTERSTITIALHOMEINDEX3);
                            int columnIndex34 = cursorRawQuery.getColumnIndex(AdNumShowEntry.WXINTERSTITIALHOME3);
                            int columnIndex35 = cursorRawQuery.getColumnIndex(AdNumShowEntry.OPENSETINTERSTITIALHOME3);
                            int columnIndex36 = cursorRawQuery.getColumnIndex(AdNumShowEntry.BANNERVIDEOPAUSEINDEX);
                            int columnIndex37 = cursorRawQuery.getColumnIndex(AdNumShowEntry.WXBANNERVIDEOPAUSE);
                            int columnIndex38 = cursorRawQuery.getColumnIndex(AdNumShowEntry.OSETVIDEOPAUSE);
                            int columnIndex39 = cursorRawQuery.getColumnIndex(AdNumShowEntry.BANNERMOREINDEX);
                            int columnIndex40 = cursorRawQuery.getColumnIndex(AdNumShowEntry.WXBANNERMORE);
                            int columnIndex41 = cursorRawQuery.getColumnIndex(AdNumShowEntry.FLOATVIEWADINDEX);
                            int columnIndex42 = cursorRawQuery.getColumnIndex(AdNumShowEntry.WXFLOATVIEWAD);
                            int columnIndex43 = cursorRawQuery.getColumnIndex(AdNumShowEntry.RANKBANNERADINDEX);
                            int columnIndex44 = cursorRawQuery.getColumnIndex(AdNumShowEntry.WXRANKBANNERAD);
                            int columnIndex45 = cursorRawQuery.getColumnIndex(AdNumShowEntry.SEARCHBANNERADINDEX);
                            int columnIndex46 = cursorRawQuery.getColumnIndex(AdNumShowEntry.WXSEARCHBANNERAD);
                            int columnIndex47 = cursorRawQuery.getColumnIndex(AdNumShowEntry.CLINGREWARDADINDEX);
                            int columnIndex48 = cursorRawQuery.getColumnIndex(AdNumShowEntry.WXCLINGREWARDAD);
                            int columnIndex49 = cursorRawQuery.getColumnIndex(AdNumShowEntry.OSETCLINGREWARDAD);
                            while (true) {
                                AdNumShowEntry adNumShowEntry = new AdNumShowEntry();
                                adNumShowEntry.setId(cursorRawQuery.getInt(columnIndex));
                                adNumShowEntry.setSplashWxNum(cursorRawQuery.getInt(columnIndex2));
                                adNumShowEntry.setSplashTdNum(cursorRawQuery.getInt(columnIndex3));
                                adNumShowEntry.setSplashThirdNum(cursorRawQuery.getInt(columnIndex4));
                                adNumShowEntry.setSplashMobNum(cursorRawQuery.getInt(columnIndex5));
                                adNumShowEntry.setRotationWxNum(cursorRawQuery.getInt(columnIndex6));
                                adNumShowEntry.setRotationTdNum(cursorRawQuery.getInt(columnIndex7));
                                adNumShowEntry.setRotationThirdNum(cursorRawQuery.getInt(columnIndex8));
                                adNumShowEntry.setRotationMobNum(cursorRawQuery.getInt(columnIndex9));
                                adNumShowEntry.setBannerWxNum(cursorRawQuery.getInt(columnIndex10));
                                adNumShowEntry.setBannerTdNum(cursorRawQuery.getInt(columnIndex11));
                                adNumShowEntry.setPlayWxNum(cursorRawQuery.getInt(columnIndex12));
                                adNumShowEntry.setPlayTdNum(cursorRawQuery.getInt(columnIndex13));
                                columnIndex14 = columnIndex14;
                                int i10 = columnIndex;
                                adNumShowEntry.setPlayThirdNum(cursorRawQuery.getInt(columnIndex14));
                                int i11 = columnIndex15;
                                int i12 = columnIndex2;
                                adNumShowEntry.setPlayMobNum(cursorRawQuery.getInt(i11));
                                int i13 = columnIndex16;
                                adNumShowEntry.setDownloadWxNum(cursorRawQuery.getInt(i13));
                                int i14 = columnIndex17;
                                adNumShowEntry.setDownloadTdNum(cursorRawQuery.getInt(i14));
                                int i15 = columnIndex18;
                                adNumShowEntry.setDownloadThirdNum(cursorRawQuery.getInt(i15));
                                int i16 = columnIndex19;
                                adNumShowEntry.setDownloadMobNum(cursorRawQuery.getInt(i16));
                                int i17 = columnIndex20;
                                adNumShowEntry.setPlaWxInfo(cursorRawQuery.getInt(i17));
                                int i18 = columnIndex21;
                                adNumShowEntry.setPlaTdInfo(cursorRawQuery.getInt(i18));
                                int i19 = columnIndex22;
                                adNumShowEntry.setPlayThirdInfo(cursorRawQuery.getInt(i19));
                                int i20 = columnIndex23;
                                adNumShowEntry.setPlayMobInfo(cursorRawQuery.getInt(i20));
                                int i21 = columnIndex24;
                                adNumShowEntry.setUpdateWxNum(cursorRawQuery.getInt(i21));
                                int i22 = columnIndex25;
                                adNumShowEntry.setUpdateTdNum(cursorRawQuery.getInt(i22));
                                int i23 = columnIndex26;
                                adNumShowEntry.setUpdateAdSetNum(cursorRawQuery.getInt(i23));
                                int i24 = columnIndex27;
                                adNumShowEntry.setSplashIndex(i24);
                                columnIndex27 = i24;
                                int i25 = columnIndex28;
                                adNumShowEntry.setRotationIndex(i25);
                                columnIndex28 = i25;
                                int i26 = columnIndex29;
                                adNumShowEntry.setPlayIndex(i26);
                                columnIndex29 = i26;
                                int i27 = columnIndex30;
                                adNumShowEntry.setDownloadIndex(i27);
                                columnIndex30 = i27;
                                int i28 = columnIndex31;
                                adNumShowEntry.setPlayInfoIndex(i28);
                                columnIndex31 = i28;
                                int i29 = columnIndex32;
                                adNumShowEntry.setUpdateIndex(i29);
                                columnIndex32 = i29;
                                int i30 = columnIndex33;
                                adNumShowEntry.setInterstitialhomeindex3(i30);
                                columnIndex33 = i30;
                                int i31 = columnIndex34;
                                adNumShowEntry.setWxInterstitialHome3(i31);
                                columnIndex34 = i31;
                                int i32 = columnIndex35;
                                adNumShowEntry.setOpensetinterstitialhome3(i32);
                                columnIndex35 = i32;
                                int i33 = columnIndex36;
                                adNumShowEntry.setBannerVideoPauseIndex(cursorRawQuery.getInt(i33));
                                int i34 = columnIndex37;
                                adNumShowEntry.setWxBannerVideoPause(cursorRawQuery.getInt(i34));
                                int i35 = columnIndex38;
                                adNumShowEntry.setOsetVideoPause(cursorRawQuery.getInt(i35));
                                int i36 = columnIndex39;
                                adNumShowEntry.setBannerMoreIndex(cursorRawQuery.getInt(i36));
                                int i37 = columnIndex40;
                                adNumShowEntry.setWxBannerMore(cursorRawQuery.getInt(i37));
                                int i38 = columnIndex41;
                                adNumShowEntry.setFloatViewAdIndex(cursorRawQuery.getInt(i38));
                                int i39 = columnIndex42;
                                adNumShowEntry.setWxFloatViewAd(cursorRawQuery.getInt(i39));
                                int i40 = columnIndex43;
                                adNumShowEntry.setRankBannerAdIndex(cursorRawQuery.getInt(i40));
                                int i41 = columnIndex44;
                                adNumShowEntry.setWxRankBannerAd(cursorRawQuery.getInt(i41));
                                int i42 = columnIndex45;
                                adNumShowEntry.setSearchBannerAdIndex(cursorRawQuery.getInt(i42));
                                int i43 = columnIndex46;
                                adNumShowEntry.setWxSearchBannerAd(cursorRawQuery.getInt(i43));
                                int i44 = columnIndex47;
                                adNumShowEntry.setClingRewardAdIndex(cursorRawQuery.getInt(i44));
                                int i45 = columnIndex48;
                                adNumShowEntry.setWxClingRewardAd(cursorRawQuery.getInt(i45));
                                int i46 = columnIndex49;
                                adNumShowEntry.setOsetClingRewardAd(cursorRawQuery.getInt(i46));
                                arrayList = arrayList3;
                                try {
                                    arrayList.add(adNumShowEntry);
                                    if (!cursorRawQuery.moveToNext()) {
                                        break;
                                    }
                                    arrayList3 = arrayList;
                                    columnIndex2 = i12;
                                    columnIndex15 = i11;
                                    columnIndex16 = i13;
                                    columnIndex17 = i14;
                                    columnIndex18 = i15;
                                    columnIndex19 = i16;
                                    columnIndex20 = i17;
                                    columnIndex21 = i18;
                                    columnIndex22 = i19;
                                    columnIndex23 = i20;
                                    columnIndex24 = i21;
                                    columnIndex25 = i22;
                                    columnIndex26 = i23;
                                    columnIndex36 = i33;
                                    columnIndex37 = i34;
                                    columnIndex38 = i35;
                                    columnIndex39 = i36;
                                    columnIndex40 = i37;
                                    columnIndex41 = i38;
                                    columnIndex42 = i39;
                                    columnIndex43 = i40;
                                    columnIndex44 = i41;
                                    columnIndex45 = i42;
                                    columnIndex46 = i43;
                                    columnIndex47 = i44;
                                    columnIndex48 = i45;
                                    columnIndex49 = i46;
                                    columnIndex = i10;
                                } catch (Exception e10) {
                                    e = e10;
                                    b.c("获取搜索历史数据库失败 >>> " + Log.getStackTraceString(e));
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

    public synchronized void update() {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.SPLASHTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.SPLASHTHIRDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.SPLASHMOBNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.ROTATIONWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.ROTATIONTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.ROTATIONTHIRDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.ROTATIONMOBNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.BANNERWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.BANNERTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTHIRDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYMOBNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.DOWNLOADWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.DOWNLOADTDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.DOWNLOADTHIRDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.DOWNLOADMOBNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYWXINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTDINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTHIRDINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYMOBINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.UPDATEWXNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.UPDATETDNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.UPDATEADSETNUM, (Integer) 0);
        contentValues.put(AdNumShowEntry.SEARCHWXINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.SEARCHTDINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.SEARCHTHIRDINFO, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYWXCENTER, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTDCENTER, (Integer) 0);
        contentValues.put(AdNumShowEntry.PLAYTHIRDCENTER, (Integer) 0);
        contentValues.put(AdNumShowEntry.CSJINTERSTITIALHOME, (Integer) 0);
        contentValues.put(AdNumShowEntry.GDTINTERSTITIALHOME, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXBANNERVIDEOPAUSE, (Integer) 0);
        contentValues.put(AdNumShowEntry.OSETVIDEOPAUSE, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXBANNERMORE, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXFLOATVIEWAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXRANKBANNERAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXSEARCHBANNERAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXCLINGREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.OSETCLINGREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.SPLASHINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.ROTATIONINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.BANNERMOREINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.PLAYINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.DOWNLOADINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.PLAYINFOINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.UPDATEINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.SEARCHINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.PLAYCENTERINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.INTERSTITIALHOMEINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.CSJREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.GDTREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.TDREWARDAD, (Integer) 0);
        contentValues.put(AdNumShowEntry.WXINTERSTITIALHOME3, (Integer) 0);
        contentValues.put(AdNumShowEntry.OPENSETINTERSTITIALHOME3, (Integer) 0);
        contentValues.put(AdNumShowEntry.INTERSTITIALHOMEINDEX3, (Integer) (-1));
        contentValues.put(AdNumShowEntry.BANNERVIDEOPAUSEINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.FLOATVIEWADINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.RANKBANNERADINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.SEARCHBANNERADINDEX, (Integer) (-1));
        contentValues.put(AdNumShowEntry.CLINGREWARDADINDEX, (Integer) (-1));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateAdsetNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.UPDATEADSETNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateBannerModeIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.BANNERMOREINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateBannerMoreNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXBANNERMORE, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateBannerVideoPauseIndexNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.BANNERVIDEOPAUSEINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateBannerWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.BANNERWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateCSJRewardAd(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.CSJREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateClingRewardIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.CLINGREWARDADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateClingRewardOsetNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.OSETCLINGREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateClingRewardWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXCLINGREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADMOBNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADTDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadThirdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADTHIRDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateDownloadWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.DOWNLOADWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateFloatAdIndexNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.FLOATVIEWADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateGDTRewardAd(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.GDTREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateHome3Index(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.INTERSTITIALHOMEINDEX3, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateHome3Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXINTERSTITIALHOME3, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateInterstitialHomeCSJ(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.CSJINTERSTITIALHOME, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateInterstitialHomeGDT(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.GDTINTERSTITIALHOME, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateInterstitialHomeIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.INTERSTITIALHOMEINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateOpenSetHome3Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.OPENSETINTERSTITIALHOME3, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateOsetVideoPauseNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.OSETVIDEOPAUSE, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayCenterIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYCENTERINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayCenterTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTDCENTER, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayCenterThirdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTHIRDCENTER, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayCenterWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYWXCENTER, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYINFOINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYMOBINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoTd1Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTHIRDINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTDINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayInfoWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYWXINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYMOBNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayThirdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYTHIRDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updatePlayWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.PLAYWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRankBannerAdIndexNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.RANKBANNERADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONMOBNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationTd1Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONTHIRDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONTDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateRotationWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.ROTATIONWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchBannerAdIndexNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHBANNERADINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchInfoTd1Num(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHTHIRDINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchInfoTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHTDINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSearchInfoWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SEARCHWXINFO, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashMobNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHMOBNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHTDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashThirdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHTHIRDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateSplashWxNum() {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.SPLASHWXNUM, Integer.valueOf(getNum(1) + 1));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateTDRewardAd(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.TDREWARDAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateUpdateIndex(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.UPDATEINDEX, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateUpdateTdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.UPDATETDNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateUpdateWxNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.UPDATEWXNUM, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateWxBannerVideoPauseNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXBANNERVIDEOPAUSE, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateWxFloatAdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXFLOATVIEWAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateWxRankBannerAdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXRANKBANNERAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public synchronized void updateWxSearchBannerAdNum(int i10) {
        SQLiteDatabase writableDatabase = DBHelper.getInstance().getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(AdNumShowEntry.WXSEARCHBANNERAD, Integer.valueOf(i10));
        writableDatabase.update(AdNumShowEntry.TABLE_NAME, contentValues, "id='1'", null);
    }

    public static AdNumShowDao getInstance() {
        if (mInstance == null) {
            synchronized (AdNumShowDao.class) {
                if (mInstance == null) {
                    mInstance = new AdNumShowDao();
                }
            }
        }
        return mInstance;
    }

    private AdNumShowDao() {
    }

    public void deleteAll() {
        DBHelper.getInstance().getWritableDatabase().delete(AdNumShowEntry.TABLE_NAME, null, null);
    }
}
