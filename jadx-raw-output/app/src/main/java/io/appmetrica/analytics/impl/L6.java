package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class L6 extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f55508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M6 f55509b;

    public final synchronized void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            this.f55509b.getClass();
            arrayList2.add(Integer.valueOf(contentValues.getAsInteger("type").intValue()));
        }
        Iterator it2 = this.f55509b.f55558j.iterator();
        while (it2.hasNext()) {
            ((T8) it2.next()).a(arrayList2);
        }
        ((C4338l5) this.f55508a.f56214p).e();
    }

    public L6(M6 m10, Y4 y10) {
        this.f55509b = m10;
        this.f55508a = y10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ArrayList<ContentValues> arrayList;
        while (isRunning()) {
            try {
                synchronized (this) {
                    try {
                        if (M6.a(this.f55509b)) {
                            wait();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable unused) {
                stopRunning();
            }
            synchronized (this.f55509b.f55553e) {
                arrayList = new ArrayList(this.f55509b.f55554f);
                this.f55509b.f55554f.clear();
            }
            M6 m10 = this.f55509b;
            m10.getClass();
            if (!arrayList.isEmpty()) {
                m10.f55550b.lock();
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase writableDatabase = m10.f55551c.getWritableDatabase();
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.beginTransaction();
                            for (ContentValues contentValues : arrayList) {
                                writableDatabase.insertOrThrow("events", null, contentValues);
                                m10.f55557i.incrementAndGet();
                                m10.a(contentValues, "Event saved to db");
                            }
                            writableDatabase.setTransactionSuccessful();
                            m10.f55557i.get();
                        } catch (Throwable unused2) {
                            sQLiteDatabase = writableDatabase;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.endTransaction();
                            }
                        }
                    }
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                } catch (Throwable unused4) {
                }
                m10.f55550b.unlock();
            }
            a(arrayList);
        }
    }
}
