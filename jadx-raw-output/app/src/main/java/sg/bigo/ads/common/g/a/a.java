package sg.bigo.ads.common.g.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.t;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f69620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AtomicBoolean f69621b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static SQLiteDatabase f69622c;

    /* JADX INFO: renamed from: sg.bigo.ads.common.g.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0706a {
        void a();

        void a(String str);
    }

    public static int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f69622c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.update(str, contentValues, str2, strArr);
        } catch (SQLException unused) {
            sg.bigo.ads.common.t.a.a(0, "DbHelper", "Failed: ".concat(String.valueOf(contentValues)));
            return 0;
        }
    }

    public static long a(String str, ContentValues contentValues) {
        b();
        if (f69622c != null && !sg.bigo.ads.common.x.a.q()) {
            try {
                return f69622c.insert(str, null, contentValues);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static Cursor a(String str, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f69622c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Cursor a(String str, String str2, String[] strArr, String str3, int i10) {
        b();
        SQLiteDatabase sQLiteDatabase = f69622c;
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            return sQLiteDatabase.query(str, null, str2, strArr, null, null, str3, Integer.toString(i10));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a() {
        t.a();
    }

    public static void a(@NonNull Context context) {
        f69621b.set(false);
        f69620a = null;
        a(context, (InterfaceC0706a) null);
    }

    public static void a(@NonNull Context context, @Nullable String str) {
        File databasePath = context.getDatabasePath("bigo_ads_sdk.db");
        sg.bigo.ads.common.t.a.a(0, "DbHelper", String.format("exception path:%s exists:%s isfile:%s read:%s write:%s exec:%s hidden:%s errormsg:%s", databasePath.getPath(), Boolean.valueOf(databasePath.exists()), Boolean.valueOf(databasePath.isFile()), Boolean.valueOf(databasePath.canRead()), Boolean.valueOf(databasePath.canWrite()), Boolean.valueOf(databasePath.canExecute()), Boolean.valueOf(databasePath.isHidden()), str));
        sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "deleteDatabase start");
        context.deleteDatabase("bigo_ads_sdk.db");
        b.a();
        sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "deleteDatabase end");
    }

    public static void a(@NonNull final Context context, final InterfaceC0706a interfaceC0706a) {
        c cVar = new c();
        f69620a = cVar;
        c.a aVar = new c.a(new Runnable() { // from class: sg.bigo.ads.common.g.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "init start");
                try {
                    a.f69622c = b.a(context).getWritableDatabase();
                } catch (Throwable th2) {
                    a.a(context, Log.getStackTraceString(th2));
                    try {
                        a.f69622c = b.a(context).getWritableDatabase();
                    } catch (Throwable th3) {
                        sg.bigo.ads.common.t.a.a(0, "DbHelper", "can't get db final," + th3.getMessage());
                        a.f69622c = null;
                    }
                }
                a.f69621b.set(true);
                a.f69620a = null;
                InterfaceC0706a interfaceC0706a2 = interfaceC0706a;
                if (interfaceC0706a2 != null) {
                    if (a.f69622c != null) {
                        interfaceC0706a2.a();
                    } else {
                        interfaceC0706a2.a("");
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DbHelper", "init end");
            }
        });
        Runnable runnable = aVar.f69634b;
        synchronized (cVar.f69628b) {
            cVar.f69627a.add(runnable);
        }
        cVar.f69629c.execute(new Runnable() { // from class: sg.bigo.ads.common.g.a.c.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ a f69630a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Runnable f69631b;

            public AnonymousClass1() {
                aVar = aVar;
                runnable = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aVar.run();
                runnable.run();
                synchronized (c.this.f69628b) {
                    c.this.f69627a.remove(runnable);
                }
            }
        });
    }

    public static int b(String str, String str2, String[] strArr) {
        b();
        SQLiteDatabase sQLiteDatabase = f69622c;
        if (sQLiteDatabase == null) {
            return 0;
        }
        try {
            return sQLiteDatabase.delete(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long b(String str, ContentValues contentValues) {
        b();
        if (f69622c != null && !sg.bigo.ads.common.x.a.q()) {
            try {
                return f69622c.insertWithOnConflict(str, null, contentValues, 5);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    private static void b() {
        Runnable runnablePoll;
        c cVar = f69620a;
        if (cVar == null || f69621b.get()) {
            return;
        }
        while (true) {
            synchronized (cVar.f69628b) {
                runnablePoll = cVar.f69627a.poll();
            }
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }
}
