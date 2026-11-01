package com.mbridge.msdk.config.component.database;

import com.mbridge.msdk.foundation.tools.q0;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: compiled from: ComponentTablesSQL.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {
    public static final String CREATE_CLICK_TABLE = "CREATE TABLE IF NOT EXISTS ClickDB ( id INTEGER PRIMARY KEY AUTOINCREMENT, unitID TEXT, offerID TEXT, URL TEXT, bidToken TEXT, timestamp TEXT, timeout TEXT, jsonString TEXT )";
    public static final String CREATE_FILE_TABLE = "CREATE TABLE IF NOT EXISTS FileDB ( id INTEGER PRIMARY KEY AUTOINCREMENT, URL TEXT, filePath TEXT, touchTime TEXT, fileSize TEXT, status TEXT, createTime TEXT, successTime TEXT, md5 TEXT, jsonString TEXT )";
    public static final String CREATE_FREQUENCE_TABLE = "CREATE TABLE IF NOT EXISTS FrequenceDB ( id INTEGER PRIMARY KEY AUTOINCREMENT, offerID TEXT, timestamp TEXT, currentImpCount TEXT, maxImpCount TEXT, jsonString TEXT )";
    public static final String CREATE_OFFER_TABLE = "CREATE TABLE IF NOT EXISTS OfferDB ( id INTEGER PRIMARY KEY AUTOINCREMENT, adType TEXT, unitId TEXT, placementId TEXT, requestId TEXT, bidToken TEXT, timestamp TEXT, plct TEXT, plctb TEXT, state TEXT, lrid TEXT, jsonString TEXT )";
    public static final String CREATE_SETTING_TABLE = "CREATE TABLE IF NOT EXISTS SettingDB ( id INTEGER PRIMARY KEY AUTOINCREMENT, appID TEXT, unitID TEXT, type TEXT, timestamp TEXT, jsonString TEXT )";
    public static final String DROP_TABLE_CLICK = "DROP TABLE IF EXISTS ClickDB";
    public static final String DROP_TABLE_FILE = "DROP TABLE IF EXISTS FileDB";
    public static final String DROP_TABLE_FREQUENCY = "DROP TABLE IF EXISTS FrequenceDB";
    public static final String DROP_TABLE_OFFER = "DROP TABLE IF EXISTS OfferDB";
    public static final String DROP_TABLE_SETTING = "DROP TABLE IF EXISTS SettingDB";
    public static final String TABLE_CLICK_DB = "ClickDB";
    public static final String TABLE_FILE_DB = "FileDB";
    public static final String TABLE_FREQUENCY_DB = "FrequenceDB";
    public static final String TABLE_OFFER_DB = "OfferDB";
    public static final String TABLE_SETTING_DB = "SettingDB";

    public static ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            for (Field field : c.class.getDeclaredFields()) {
                if (field.getName().startsWith(str)) {
                    arrayList.add(String.valueOf(field.get(null)));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            q0.b("ComponentTablesSQL", th2.getMessage());
            return arrayList;
        }
    }
}
