package io.bidmachine.analytics.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ironsource.G5;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lio/bidmachine/analytics/internal/c;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/database/sqlite/SQLiteDatabase;", "db", "Lkotlin/Result;", "Lmj/r;", "a", "(Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "onDowngrade", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4733c extends SQLiteOpenHelper {
    public C4733c(Context context) {
        super(context, "BMAnalytics.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    private final Object a(SQLiteDatabase db2) {
        try {
            Result.a aVar = Result.Companion;
            Cursor cursorQuery = db2.query("sqlite_master", new String[]{"name"}, "type = ?", new String[]{G5.Q}, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    try {
                        Result.a aVar2 = Result.Companion;
                        String string = cursorQuery.getString(0);
                        if (!ck.p.e(string, "android_metadata") && !ck.p.e(string, "sqlite_master")) {
                            db2.execSQL("DROP TABLE IF EXISTS " + string);
                        }
                        Result.m3458constructorimpl(mj.r.f64562a);
                    } catch (Throwable th2) {
                        Result.a aVar3 = Result.Companion;
                        Result.m3458constructorimpl(kotlin.c.a(th2));
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        yj.b.a(cursorQuery, th3);
                        throw th4;
                    }
                }
            }
            mj.r rVar = mj.r.f64562a;
            yj.b.a(cursorQuery, null);
            return Result.m3458constructorimpl(rVar);
        } catch (Throwable th5) {
            Result.a aVar4 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th5));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE monitor_record (id TEXT,name TEXT,timestamp INTEGER,session_id TEXT,data BLOB,error BLOB,is_reserved INTEGER DEFAULT 0)");
        db2.execSQL("CREATE TABLE reader_record (id TEXT,name TEXT,timestamp INTEGER,data_hash TEXT,rule TEXT,error BLOB,is_dirty INTEGER,is_reserved INTEGER DEFAULT 0)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
        onUpgrade(db2, oldVersion, newVersion);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db2, int oldVersion, int newVersion) {
        a(db2);
        db2.execSQL("DROP TABLE IF EXISTS monitor_record");
        db2.execSQL("DROP TABLE IF EXISTS reader_record");
        onCreate(db2);
    }
}
