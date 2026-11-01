package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.ResultReceiver;
import com.safedk.android.analytics.events.base.StatsEvent;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CounterConfigurationReporterType f55338a;

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:59:0x0182  */
    public final G6 a(SQLiteDatabase sQLiteDatabase, String str, int i10, String str2, boolean z10) {
        Cursor cursorRawQuery;
        ArrayList<ContentValues> arrayList;
        C4352lj c4352lj;
        N3 n10;
        Integer num;
        int iDelete = 0;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s, %s, %s FROM %s WHERE %s", "global_number", "type", "event_description", "events", str), null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        arrayList = new ArrayList(cursorRawQuery.getCount());
                        while (cursorRawQuery.moveToNext()) {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                            arrayList.add(contentValues);
                        }
                    } else {
                        arrayList = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        Rj rj2 = AbstractC4452pj.f57520a;
                        rj2.getClass();
                        rj2.a(new C4477qj("select_rows_to_delete_exception", th));
                        mo.a(cursorRawQuery);
                        arrayList = null;
                    } catch (Throwable th3) {
                        mo.a(cursorRawQuery);
                        throw th3;
                    }
                }
            } else {
                arrayList = null;
            }
            mo.a(cursorRawQuery);
        } catch (Throwable th4) {
            th = th4;
            cursorRawQuery = null;
        }
        try {
            iDelete = sQLiteDatabase.delete("events", str, null);
        } catch (Throwable unused) {
        }
        if (arrayList != null && arrayList.size() != 0 && iDelete == arrayList.size() && z10) {
            C4402nj c4402nj = C4418oa.I.f57408f;
            if (str2 != null && c4402nj != null) {
                CounterConfigurationReporterType counterConfigurationReporterType = this.f55338a;
                synchronized (c4402nj) {
                    c4352lj = (C4352lj) c4402nj.f57362c.get(str2);
                    if (c4352lj == null) {
                        c4352lj = new C4352lj(str2, c4402nj.f57361b, counterConfigurationReporterType, c4402nj.f57360a);
                        c4402nj.f57362c.put(str2, c4352lj);
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    for (ContentValues contentValues2 : arrayList) {
                        Integer asInteger = contentValues2.getAsInteger("global_number");
                        Integer asInteger2 = contentValues2.getAsInteger("type");
                        if (asInteger != null && asInteger2 != null) {
                            jSONArray.put(asInteger);
                            EnumC4112cb enumC4112cbA = EnumC4112cb.a(asInteger2.intValue());
                            if (enumC4112cbA == null) {
                                Map map = Qf.f55798a;
                                num = null;
                            } else {
                                num = (Integer) Qf.f55800c.get(enumC4112cbA);
                            }
                            jSONArray2.put(num);
                        }
                    }
                    jSONObject.put("global_number", jSONArray).put(StatsEvent.f44666z, jSONArray2);
                    JSONObject jSONObjectPut = new JSONObject().put("details", new JSONObject().put("reason", H6.a(i10)).put("cleared", jSONObject).put("actual_deleted_number", iDelete));
                    PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(str2);
                    String string = jSONObjectPut.toString();
                    Set set = AbstractC4641x9.f57918a;
                    EnumC4112cb enumC4112cb = EnumC4112cb.EVENT_TYPE_UNDEFINED;
                    n10 = new N3(string, "", 12290, 0, orCreatePublicLogger);
                } catch (Throwable unused2) {
                    n10 = null;
                }
                if (n10 != null && c4352lj.f57223c != null) {
                    try {
                        CounterConfiguration counterConfiguration = new CounterConfiguration(c4352lj.f57221a);
                        counterConfiguration.setReporterType(c4352lj.f57223c);
                        ((C1) c4352lj.f57224d.f57450a).reportData(1, n10.d(new Gh(new Cf(c4352lj.f57222b, (ResultReceiver) null), counterConfiguration, new E8(new C4528sl(LoggerStorage.getOrCreatePublicLogger(c4352lj.f57221a), "Crash Environment")), null).c()));
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
        return new G6(arrayList, iDelete);
    }

    public I6(CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f55338a = counterConfigurationReporterType;
    }
}
