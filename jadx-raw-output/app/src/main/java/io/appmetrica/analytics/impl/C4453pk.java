package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4453pk implements Jc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xo f57521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57522b = "startup_state";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AESEncrypter f57523c;

    public static void a(xo xoVar, C4303jm c4303jm, Bb bb2) {
        String strOptStringOrNull;
        synchronized (xoVar) {
            strOptStringOrNull = JsonUtils.optStringOrNull(xoVar.f57978a.a(), "device_id");
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(bb2.f55019d)) {
                xoVar.a(bb2.f55019d);
            }
            if (!TextUtils.isEmpty(bb2.f55020e)) {
                xoVar.b(bb2.f55020e);
            }
            if (TextUtils.isEmpty(bb2.f55016a)) {
                return;
            }
            c4303jm.f57030a = bb2.f55016a;
        }
    }

    public C4453pk(xo xoVar) {
        this.f57521a = xoVar;
        C4048a c4048a = new C4048a(C4418oa.k().g());
        this.f57523c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4048a.b(), c4048a.a());
    }

    @Override // io.appmetrica.analytics.impl.Jc
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C4418oa.I.B().f(context).getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Bb bbA = a(readableDatabase);
                C4303jm c4303jm = new C4303jm(new C4362m4(new C4311k4()));
                if (bbA != null) {
                    a(this.f57521a, c4303jm, bbA);
                    c4303jm.f57045p = bbA.f55018c;
                    c4303jm.f57047r = bbA.f55017b;
                }
                C4329km c4329km = new C4329km(c4303jm);
                Sm sm2 = (Sm) Qm.a(C4329km.class);
                sm2.a(context, sm2.b(context)).save(c4329km);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0048 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004d, blocks: (B:5:0x001d, B:7:0x0023, B:9:0x0029, B:13:0x0048), top: B:21:0x001d }] */
    public final Bb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        try {
            cursorQuery = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f57522b}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                        Bb bb2 = (Bb) MessageNano.mergeFrom(new Bb(), this.f57523c.decrypt(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursorQuery);
                        return bb2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.getCount();
                    }
                } catch (Throwable unused) {
                }
            } else if (cursorQuery != null) {
                cursorQuery.getCount();
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        CloseableUtilsKt.closeSafely(cursorQuery);
        return null;
    }
}
