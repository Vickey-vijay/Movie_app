package com.bytedance.sdk.openadsdk.vm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.vungle.ads.internal.signals.SignalManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw {
    private static Context fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static final long f13459le = System.currentTimeMillis();
    public static final long ouw = com.bytedance.sdk.openadsdk.vm.yu.ouw.ouw();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.vm.lh.ouw f13460lh;
    private vt vt;
    private Boolean yu;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f13461ra = 0;
    private final ArrayList<yu> pno = new ArrayList<>();
    private final Runnable bly = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vm.ouw.2
        @Override // java.lang.Runnable
        public final void run() {
            ouw ouwVar = ouw.this;
            ouwVar.yu = Boolean.valueOf(ouwVar.vt.isMonitorOpen());
            if (!ouw.this.yu.booleanValue() || ouw.this.pno.isEmpty()) {
                return;
            }
            ouw.ouw(ouw.this.pno);
            ouw.this.pno.clear();
        }
    };
    private Runnable tlj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.vm.ouw.4
        @Override // java.lang.Runnable
        public final void run() {
            String str = "is_init";
            String str2 = "mediation";
            try {
                SQLiteDatabase sQLiteDatabaseVt = com.bytedance.sdk.openadsdk.vm.ouw.ouw.vt();
                if (sQLiteDatabaseVt != null) {
                    String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
                    String str3 = "extra";
                    String[] strArr2 = {String.valueOf(ouw.this.vt.getOnceLogInterval() < 86400000 ? ouw.f13459le : ouw.ouw)};
                    int iMax = Math.max(10, ouw.this.vt.getOnceLogCount());
                    if (iMax > 100) {
                        iMax = 10;
                    }
                    Cursor cursorQuery = sQLiteDatabaseVt.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(iMax));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        int i10 = iMax;
                        ArrayList arrayList2 = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            try {
                                com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                                if (cursorQuery.getColumnIndex("_id") >= 0) {
                                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                    ouwVar.ouw = j10;
                                    arrayList2.add(String.valueOf(j10));
                                }
                                if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                    ouwVar.vt = cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version"));
                                }
                                if (cursorQuery.getColumnIndex("scene") >= 0) {
                                    ouwVar.f13464lh = cursorQuery.getString(cursorQuery.getColumnIndex("scene"));
                                }
                                if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                    ouwVar.yu = cursorQuery.getInt(cursorQuery.getColumnIndex("start_count"));
                                }
                                if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                    ouwVar.fkw = cursorQuery.getInt(cursorQuery.getColumnIndex("success_count"));
                                }
                                if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                    ouwVar.f13463le = cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count"));
                                }
                                if (cursorQuery.getColumnIndex("rit") >= 0) {
                                    ouwVar.f13465ra = cursorQuery.getString(cursorQuery.getColumnIndex("rit"));
                                }
                                if (cursorQuery.getColumnIndex("tag") >= 0) {
                                    ouwVar.pno = cursorQuery.getString(cursorQuery.getColumnIndex("tag"));
                                }
                                if (cursorQuery.getColumnIndex("label") >= 0) {
                                    ouwVar.bly = cursorQuery.getString(cursorQuery.getColumnIndex("label"));
                                }
                                if (cursorQuery.getColumnIndex("timestamp") >= 0) {
                                    ouwVar.tlj = cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp"));
                                }
                                String str4 = str2;
                                if (cursorQuery.getColumnIndex(str4) >= 0) {
                                    ouwVar.f13462cf = cursorQuery.getString(cursorQuery.getColumnIndex(str4));
                                }
                                String str5 = str;
                                if (cursorQuery.getColumnIndex(str5) >= 0) {
                                    ouwVar.ryl = cursorQuery.getInt(cursorQuery.getColumnIndex(str5));
                                }
                                String str6 = str3;
                                if (cursorQuery.getColumnIndex(str6) >= 0) {
                                    ouwVar.mwh = cursorQuery.getString(cursorQuery.getColumnIndex(str6));
                                }
                                ArrayList arrayList3 = arrayList;
                                arrayList3.add(ouwVar);
                                str3 = str6;
                                arrayList = arrayList3;
                                str = str5;
                                str2 = str4;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        ArrayList arrayList4 = arrayList;
                        cursorQuery.close();
                        if (arrayList4.isEmpty()) {
                            return;
                        }
                        ouw.this.vt.onMonitorUpload(arrayList4);
                        SQLiteDatabase sQLiteDatabaseOuw = com.bytedance.sdk.openadsdk.vm.ouw.ouw.ouw();
                        if (sQLiteDatabaseOuw != null && sQLiteDatabaseOuw.isOpen()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("_id IN (");
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                sb2.append("?");
                                if (i11 < arrayList2.size() - 1) {
                                    sb2.append(StringUtils.COMMA);
                                }
                            }
                            sb2.append(")");
                            sQLiteDatabaseOuw.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                            if (ouw.this.f13460lh != null) {
                                ouw.this.f13460lh.ouw(ouw.f13459le);
                            }
                        }
                        if (arrayList4.size() < i10 || ouw.this.f13461ra > 1000) {
                            return;
                        }
                        ouw.this.ouw(false);
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    };

    public static /* synthetic */ int fkw(ouw ouwVar) {
        int i10 = ouwVar.f13461ra;
        ouwVar.f13461ra = i10 + 1;
        return i10;
    }

    private ouw(vt vtVar) {
        try {
            this.vt = new BusMonitorDependWrapper(vtVar);
            this.f13460lh = new com.bytedance.sdk.openadsdk.vm.lh.ouw(vtVar.getContext());
            fkw = vtVar.getContext();
        } catch (Throwable unused) {
        }
    }

    public static ouw ouw(vt vtVar) {
        return new ouw(vtVar);
    }

    public static Context ouw() {
        Context context = fkw;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public final void ouw(final boolean z10) {
        vt vtVar = this.vt;
        if (vtVar == null || vtVar.getHandler() == null || this.vt.getContext() == null || this.f13460lh == null || !this.vt.isMonitorOpen()) {
            return;
        }
        this.vt.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vm.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ouw.fkw(ouw.this);
                    if (z10) {
                        long j10 = ouw.this.f13460lh.ouw.getLong("last_upload_time", 0L);
                        if (j10 == 0) {
                            ouw.this.f13460lh.ouw(System.currentTimeMillis());
                            return;
                        } else {
                            if ((j10 - (j10 % SignalManager.TWENTY_FOUR_HOURS_MILLIS) == com.bytedance.sdk.openadsdk.vm.yu.ouw.ouw()) && System.currentTimeMillis() - j10 < ouw.this.vt.getUploadIntervalTime()) {
                                return;
                            }
                        }
                    }
                    if (ouw.this.vt.getHandler() != null) {
                        ouw.this.vt.getHandler().post(ouw.this.tlj);
                    }
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.vt.getOnceLogInterval(), 10000));
    }

    public final void ouw(final yu yuVar) {
        vt vtVar;
        vt vtVar2;
        boolean z10 = true;
        if (this.yu != null ? (vtVar = this.vt) == null || vtVar.getContext() == null || !this.vt.isMonitorOpen() || this.vt.getHandler() == null : (vtVar2 = this.vt) == null || vtVar2.getContext() == null || this.vt.getHandler() == null) {
            z10 = false;
        }
        if (z10) {
            this.vt.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.vm.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw ouwVar = ouw.this;
                    ouwVar.yu = Boolean.valueOf(ouwVar.vt.isMonitorOpen());
                    if (ouw.this.yu.booleanValue()) {
                        ouw.this.pno.add(yuVar);
                        if (ouw.this.pno.size() >= 10) {
                            ouw.this.vt.getHandler().removeCallbacks(ouw.this.bly);
                            ouw.ouw(ouw.this.pno);
                            ouw.this.pno.clear();
                        }
                    }
                }
            });
            this.vt.getHandler().removeCallbacks(this.bly);
            this.vt.getHandler().postDelayed(this.bly, 5000L);
        }
    }

    public static /* synthetic */ void ouw(List list) {
        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVarOuw;
        SQLiteDatabase sQLiteDatabase = null;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    SQLiteDatabase sQLiteDatabaseOuw = com.bytedance.sdk.openadsdk.vm.ouw.ouw.ouw();
                    if (sQLiteDatabaseOuw != null) {
                        try {
                            sQLiteDatabaseOuw.beginTransaction();
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                yu yuVar = (yu) list.get(i10);
                                if (yuVar != null && (ouwVarOuw = yuVar.ouw()) != null) {
                                    Cursor cursorQuery = sQLiteDatabaseOuw.query("monitor_table", new String[]{"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"}, new StringBuilder("sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?").toString(), new String[]{ouwVarOuw.vt, ouwVarOuw.f13464lh, ouwVarOuw.f13465ra, ouwVarOuw.pno, ouwVarOuw.bly, ouwVarOuw.f13462cf, String.valueOf(ouwVarOuw.ryl), String.valueOf(ouwVarOuw.tlj), ouwVarOuw.mwh}, null, null, null);
                                    if (cursorQuery != null) {
                                        if (cursorQuery.moveToNext()) {
                                            int columnIndex = cursorQuery.getColumnIndex("_id");
                                            if (columnIndex >= 0) {
                                                ouwVarOuw.ouw = cursorQuery.getLong(columnIndex);
                                            }
                                            int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                            if (columnIndex2 >= 0) {
                                                ouwVarOuw.yu = cursorQuery.getInt(columnIndex2) + ouwVarOuw.yu;
                                            }
                                            int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                            if (columnIndex3 >= 0) {
                                                ouwVarOuw.fkw = cursorQuery.getInt(columnIndex3) + ouwVarOuw.fkw;
                                            }
                                            int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                            if (columnIndex4 >= 0) {
                                                ouwVarOuw.f13463le = cursorQuery.getInt(columnIndex4) + ouwVarOuw.f13463le;
                                            }
                                        }
                                        cursorQuery.close();
                                    }
                                    ContentValues contentValues = new ContentValues();
                                    long j10 = ouwVarOuw.ouw;
                                    if (j10 > 0) {
                                        contentValues.put("_id", Long.valueOf(j10));
                                    }
                                    contentValues.put("sdk_version", ouwVarOuw.vt);
                                    contentValues.put("scene", ouwVarOuw.f13464lh);
                                    contentValues.put("start_count", Integer.valueOf(ouwVarOuw.yu));
                                    contentValues.put("success_count", Integer.valueOf(ouwVarOuw.fkw));
                                    contentValues.put("fail_count", Integer.valueOf(ouwVarOuw.f13463le));
                                    contentValues.put("rit", ouwVarOuw.f13465ra);
                                    contentValues.put("tag", ouwVarOuw.pno);
                                    contentValues.put("label", ouwVarOuw.bly);
                                    contentValues.put("timestamp", Long.valueOf(ouwVarOuw.tlj));
                                    contentValues.put("mediation", ouwVarOuw.f13462cf);
                                    contentValues.put("is_init", Integer.valueOf(ouwVarOuw.ryl));
                                    contentValues.put("extra", ouwVarOuw.mwh);
                                    sQLiteDatabaseOuw.insertWithOnConflict("monitor_table", null, contentValues, 5);
                                }
                            }
                            sQLiteDatabaseOuw.setTransactionSuccessful();
                        } catch (Throwable unused) {
                            sQLiteDatabase = sQLiteDatabaseOuw;
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    sQLiteDatabase = sQLiteDatabaseOuw;
                }
            } catch (Throwable unused3) {
            }
        }
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused4) {
            }
        }
    }
}
