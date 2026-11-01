package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.ironsource.Y5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: DatabaseHelper.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.d f33350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f33351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f33352c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f33353d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class RunnableC0310a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.c.a f33354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33356c;

        public RunnableC0310a(com.mbridge.msdk.config.component.load.downloader.database.c.a aVar, String str, String str2) {
            this.f33354a = aVar;
            this.f33355b = str;
            this.f33356c = str2;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Cursor cursorRawQuery;
            com.mbridge.msdk.config.component.load.downloader.database.c.a aVar;
            com.mbridge.msdk.config.component.load.downloader.database.c.a aVar2;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d)) {
                a aVar3 = a.this;
                aVar3.f33353d = aVar3.f33350a.getWritableDatabase();
            }
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = null;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d) || !a.this.f33353d.isOpen()) {
                if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f33354a)) {
                    this.f33354a.a(null);
                    return;
                }
                return;
            }
            try {
                cursorRawQuery = a.this.f33353d.rawQuery("SELECT * FROM " + a.this.f33352c + " WHERE URL = ? AND " + Y5.c.f27929c + " = ?", new String[]{this.f33355b, this.f33356c});
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(cursorRawQuery);
                            }
                        } catch (Exception e10) {
                            e = e10;
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            aVar2 = this.f33354a;
                            if (aVar2 == null) {
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        aVar = this.f33354a;
                        if (aVar != null) {
                            aVar.a(null);
                        }
                        throw th;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                aVar2 = this.f33354a;
                if (aVar2 == null) {
                    return;
                }
            } catch (Exception e11) {
                e = e11;
                cursorRawQuery = null;
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = null;
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                aVar = this.f33354a;
                if (aVar != null) {
                    aVar.a(null);
                }
                throw th;
            }
            aVar2.a(bVarA);
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f33358a;

        public b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f33358a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d)) {
                a aVar = a.this;
                aVar.f33353d = aVar.f33350a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d) || !a.this.f33353d.isOpen()) {
                return;
            }
            try {
                a.this.f33353d.beginTransaction();
                a.this.f33353d.insert(a.this.f33352c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33358a));
                a.this.f33353d.setTransactionSuccessful();
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            } finally {
                try {
                    if (a.this.f33353d.inTransaction()) {
                        a.this.f33353d.endTransaction();
                    }
                } catch (Throwable th2) {
                    q0.b(IDatabaseHelper.TAG, th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f33360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33361b;

        public c(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
            this.f33360a = bVar;
            this.f33361b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d)) {
                a aVar = a.this;
                aVar.f33353d = aVar.f33350a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d) || !a.this.f33353d.isOpen()) {
                return;
            }
            try {
                a.this.f33353d.update(a.this.f33352c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33360a), "URL = ? AND filePath = ?", new String[]{this.f33360a.c(), this.f33361b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f33363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f33365c;

        public d(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str, String str2) {
            this.f33363a = bVar;
            this.f33364b = str;
            this.f33365c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d)) {
                a aVar = a.this;
                aVar.f33353d = aVar.f33350a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d) || !a.this.f33353d.isOpen()) {
                return;
            }
            try {
                a.this.f33353d.update(a.this.f33352c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f33363a), "URL = ? AND filePath = ?", new String[]{this.f33364b, this.f33365c});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f33368b;

        public e(String str, String str2) {
            this.f33367a = str;
            this.f33368b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d)) {
                a aVar = a.this;
                aVar.f33353d = aVar.f33350a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d) || !a.this.f33353d.isOpen()) {
                return;
            }
            try {
                a.this.f33353d.execSQL("DELETE FROM " + a.this.f33352c + " WHERE URL = ? AND " + Y5.c.f27929c + " = ?", new Object[]{this.f33367a, this.f33368b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DatabaseHelper.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f33370a;

        public f(String str) {
            this.f33370a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d)) {
                a aVar = a.this;
                aVar.f33353d = aVar.f33350a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f33353d) || !a.this.f33353d.isOpen()) {
                return;
            }
            try {
                a.this.f33353d.execSQL("DELETE FROM " + a.this.f33352c + " WHERE URL = ?", new Object[]{this.f33370a});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str, String str2) {
        this.f33351b.post(new e(str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str) {
        this.f33351b.post(new f(str));
    }

    public a(Handler handler, com.mbridge.msdk.config.component.load.downloader.database.d dVar) {
        this.f33351b = handler;
        this.f33350a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.c.a aVar) {
        this.f33351b.post(new RunnableC0310a(aVar, str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f33351b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.f33351b.post(new c(bVar, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f33351b.post(new d(bVar, str, str2));
    }
}
