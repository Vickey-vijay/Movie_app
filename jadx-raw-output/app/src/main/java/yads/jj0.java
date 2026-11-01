package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import cp.k3;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class jj0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f79056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final np3 f79057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj0 f79058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f79059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f79060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f79061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f79062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f79063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f79064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f79065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f79066k;

    public static int a(gj0 gj0Var, gj0 gj0Var2) {
        long j10 = gj0Var.f77818c;
        long j11 = gj0Var2.f77818c;
        int i10 = ib3.f78556a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final void b() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f79060e.size(); i11++) {
            gj0 gj0Var = (gj0) this.f79060e.get(i11);
            lj0 lj0Var = (lj0) this.f79061f.get(gj0Var.f77816a.f81422b);
            int i12 = gj0Var.f77817b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        lj0Var.getClass();
                        if (!(!lj0Var.f79808e)) {
                            throw new IllegalStateException();
                        }
                        if (this.f79063h || this.f79062g != 0 || i10 >= this.f79064i) {
                            a(gj0Var, 0, 0);
                            lj0Var.a(false);
                        }
                    } else {
                        if (i12 != 5 && i12 != 7) {
                            throw new IllegalStateException();
                        }
                        if (lj0Var == null) {
                            lj0 lj0Var2 = new lj0(gj0Var.f77816a, ((sc0) this.f79058c).a(gj0Var.f77816a), gj0Var.f77823h, true, this.f79065j, this);
                            this.f79061f.put(gj0Var.f77816a.f81422b, lj0Var2);
                            lj0Var2.start();
                        } else if (!lj0Var.f79808e) {
                            lj0Var.a(false);
                        }
                    }
                } else if (lj0Var != null) {
                    if (!(!lj0Var.f79808e)) {
                        throw new IllegalStateException();
                    }
                    lj0Var.a(false);
                }
            } else if (lj0Var != null) {
                if (!(!lj0Var.f79808e)) {
                    throw new IllegalStateException();
                }
                lj0Var.a(false);
            } else if (this.f79063h || this.f79062g != 0 || this.f79066k >= this.f79064i) {
                lj0Var = null;
            } else {
                gj0 gj0VarA = a(gj0Var, 2, 0);
                lj0Var = new lj0(gj0VarA.f77816a, ((sc0) this.f79058c).a(gj0VarA.f77816a), gj0VarA.f77823h, false, this.f79065j, this);
                this.f79061f.put(gj0VarA.f77816a.f81422b, lj0Var);
                int i13 = this.f79066k;
                this.f79066k = i13 + 1;
                if (i13 == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                lj0Var.start();
            }
            if (lj0Var != null && !lj0Var.f79808e) {
                i10++;
            }
        }
    }

    public final gj0 a(String str, boolean z10) {
        int iA = a(str);
        if (iA != -1) {
            return (gj0) this.f79060e.get(iA);
        }
        if (!z10) {
            return null;
        }
        try {
            return ((rc0) this.f79057b).b(str);
        } catch (IOException e10) {
            ih1.b("DownloadManager", ih1.a("Failed to load download: " + str, e10));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        ?? EmptyList;
        qc0 qc0Var = null;
        i = 0;
        int i10 = 0;
        switch (message.what) {
            case 0:
                this.f79062g = message.arg1;
                try {
                    try {
                        ((rc0) this.f79057b).b();
                        int[] iArr = {0, 1, 2, 5, 7};
                        rc0 rc0Var = (rc0) this.f79057b;
                        rc0Var.a();
                        StringBuilder sb2 = new StringBuilder("state IN (");
                        for (int i11 = 0; i11 < 5; i11++) {
                            if (i11 > 0) {
                                sb2.append(',');
                            }
                            sb2.append(iArr[i11]);
                        }
                        sb2.append(')');
                        qc0 qc0Var2 = new qc0(rc0Var.a(sb2.toString(), (String[]) null));
                        while (qc0Var2.f81823a.moveToPosition(qc0Var2.f81823a.getPosition() + 1)) {
                            try {
                                this.f79060e.add(rc0.a(qc0Var2.f81823a));
                            } catch (IOException e10) {
                                e = e10;
                                qc0Var = qc0Var2;
                                ih1.b("DownloadManager", ih1.a("Failed to load index.", e));
                                this.f79060e.clear();
                                ib3.a((Closeable) qc0Var);
                            } catch (Throwable th2) {
                                th = th2;
                                qc0Var = qc0Var2;
                                ib3.a((Closeable) qc0Var);
                                throw th;
                            }
                        }
                        ib3.a((Closeable) qc0Var2);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e11) {
                    e = e11;
                }
                this.f79059d.obtainMessage(0, new ArrayList(this.f79060e)).sendToTarget();
                b();
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 1:
                this.f79063h = message.arg1 != 0;
                b();
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 2:
                this.f79062g = message.arg1;
                b();
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 3:
                String str = (String) message.obj;
                int i12 = message.arg1;
                if (str != null) {
                    gj0 gj0VarA = a(str, false);
                    if (gj0VarA != null) {
                        a(gj0VarA, i12);
                    } else {
                        try {
                            ((rc0) this.f79057b).a(i12, str);
                        } catch (IOException e12) {
                            ih1.b("DownloadManager", ih1.a("Failed to set manual stop reason: ".concat(str), e12));
                        }
                    }
                    break;
                } else {
                    for (int i13 = 0; i13 < this.f79060e.size(); i13++) {
                        a((gj0) this.f79060e.get(i13), i12);
                    }
                    try {
                        rc0 rc0Var2 = (rc0) this.f79057b;
                        rc0Var2.a();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("stop_reason", Integer.valueOf(i12));
                            rc0Var2.f82184b.getWritableDatabase().update(rc0Var2.f82183a, contentValues, rc0.f82181e, null);
                        } catch (Throwable th4) {
                            throw new v30(th4);
                        }
                    } catch (IOException e13) {
                        ih1.b("DownloadManager", ih1.a("Failed to set manual stop reason", e13));
                    }
                    break;
                }
                b();
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 4:
                this.f79064i = message.arg1;
                b();
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 5:
                this.f79065j = message.arg1;
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 6:
                pj0 pj0Var = (pj0) message.obj;
                int i14 = message.arg1;
                gj0 gj0VarA2 = a(pj0Var.f81422b, true);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gj0VarA2 != null) {
                    int i15 = gj0VarA2.f77817b;
                    long j10 = (i15 == 5 || i15 == 3 || i15 == 4) ? jCurrentTimeMillis : gj0VarA2.f77818c;
                    int i16 = (i15 == 5 || i15 == 7) ? 7 : i14 != 0 ? 1 : 0;
                    pj0 pj0Var2 = gj0VarA2.f77816a;
                    if (!pj0Var2.f81422b.equals(pj0Var.f81422b)) {
                        throw new IllegalArgumentException();
                    }
                    if (pj0Var2.f81425e.isEmpty() || pj0Var.f81425e.isEmpty()) {
                        EmptyList = Collections.emptyList();
                    } else {
                        EmptyList = new ArrayList(pj0Var2.f81425e);
                        for (int i17 = 0; i17 < pj0Var.f81425e.size(); i17++) {
                            v33 v33Var = (v33) pj0Var.f81425e.get(i17);
                            if (!EmptyList.contains(v33Var)) {
                                EmptyList.add(v33Var);
                            }
                        }
                    }
                    a(new gj0(new pj0(pj0Var2.f81422b, pj0Var.f81423c, pj0Var.f81424d, EmptyList, pj0Var.f81426f, pj0Var.f81427g, pj0Var.f81428h), i16, j10, jCurrentTimeMillis, -1L, i14, 0, new nj0()));
                } else {
                    a(new gj0(pj0Var, i14 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i14, 0, new nj0()));
                }
                b();
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 7:
                String str2 = (String) message.obj;
                gj0 gj0VarA3 = a(str2, true);
                if (gj0VarA3 == null) {
                    ih1.b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                } else {
                    a(gj0VarA3, 5, 0);
                    b();
                }
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 8:
                a();
                i10 = 1;
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 9:
                lj0 lj0Var = (lj0) message.obj;
                String str3 = lj0Var.f79805b.f81422b;
                this.f79061f.remove(str3);
                boolean z10 = lj0Var.f79808e;
                if (!z10) {
                    int i18 = this.f79066k - 1;
                    this.f79066k = i18;
                    if (i18 == 0) {
                        removeMessages(11);
                    }
                }
                if (!lj0Var.f79811h) {
                    Exception exc = lj0Var.f79812i;
                    if (exc != null) {
                        ih1.b("DownloadManager", ih1.a("Task failed: " + lj0Var.f79805b + ", " + z10, exc));
                    }
                    gj0 gj0VarA4 = a(str3, false);
                    gj0VarA4.getClass();
                    int i19 = gj0VarA4.f77817b;
                    if (i19 != 2) {
                        if (i19 != 5 && i19 != 7) {
                            throw new IllegalStateException();
                        }
                        if (!z10) {
                            throw new IllegalStateException();
                        }
                        if (i19 == 7) {
                            int i20 = gj0VarA4.f77821f;
                            a(gj0VarA4, i20 == 0 ? 0 : 1, i20);
                            b();
                        } else {
                            this.f79060e.remove(a(gj0VarA4.f77816a.f81422b));
                            try {
                                np3 np3Var = this.f79057b;
                                String str4 = gj0VarA4.f77816a.f81422b;
                                rc0 rc0Var3 = (rc0) np3Var;
                                rc0Var3.a();
                                try {
                                    rc0Var3.f82184b.getWritableDatabase().delete(rc0Var3.f82183a, "id = ?", new String[]{str4});
                                } catch (Throwable th5) {
                                    throw new v30(th5);
                                }
                            } catch (IOException unused) {
                                ih1.b("DownloadManager", "Failed to remove from database");
                            }
                            this.f79059d.obtainMessage(2, new ij0(gj0VarA4, true, new ArrayList(this.f79060e), null)).sendToTarget();
                        }
                    } else {
                        if (!(!z10)) {
                            throw new IllegalStateException();
                        }
                        gj0 gj0Var = new gj0(gj0VarA4.f77816a, exc == null ? 3 : 4, gj0VarA4.f77818c, System.currentTimeMillis(), gj0VarA4.f77820e, gj0VarA4.f77821f, exc == null ? 0 : 1, gj0VarA4.f77823h);
                        this.f79060e.remove(a(gj0Var.f77816a.f81422b));
                        try {
                            ((rc0) this.f79057b).a(gj0Var);
                        } catch (IOException e14) {
                            ih1.b("DownloadManager", ih1.a("Failed to update index.", e14));
                        }
                        this.f79059d.obtainMessage(2, new ij0(gj0Var, false, new ArrayList(this.f79060e), exc)).sendToTarget();
                    }
                    b();
                    break;
                } else {
                    b();
                }
                this.f79059d.obtainMessage(1, i10, this.f79061f.size()).sendToTarget();
                return;
            case 10:
                lj0 lj0Var2 = (lj0) message.obj;
                int i21 = message.arg1;
                int i22 = message.arg2;
                int i23 = ib3.f78556a;
                long j11 = ((((long) i21) & 4294967295L) << 32) | (4294967295L & ((long) i22));
                gj0 gj0VarA5 = a(lj0Var2.f79805b.f81422b, false);
                gj0VarA5.getClass();
                if (j11 == gj0VarA5.f77820e || j11 == -1) {
                    return;
                }
                a(new gj0(gj0VarA5.f77816a, gj0VarA5.f77817b, gj0VarA5.f77818c, System.currentTimeMillis(), j11, gj0VarA5.f77821f, gj0VarA5.f77822g, gj0VarA5.f77823h));
                return;
            case 11:
                for (int i24 = 0; i24 < this.f79060e.size(); i24++) {
                    gj0 gj0Var2 = (gj0) this.f79060e.get(i24);
                    if (gj0Var2.f77817b == 2) {
                        try {
                            ((rc0) this.f79057b).a(gj0Var2);
                        } catch (IOException e15) {
                            ih1.b("DownloadManager", ih1.a("Failed to update index.", e15));
                        }
                    }
                }
                sendEmptyMessageDelayed(11, 5000L);
                return;
            case 12:
                Iterator it = this.f79061f.values().iterator();
                while (it.hasNext()) {
                    ((lj0) it.next()).a(true);
                }
                try {
                    ((rc0) this.f79057b).b();
                    break;
                } catch (IOException e16) {
                    ih1.b("DownloadManager", ih1.a("Failed to update index.", e16));
                }
                this.f79060e.clear();
                this.f79056a.quit();
                synchronized (this) {
                    notifyAll();
                    break;
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    public jj0(HandlerThread handlerThread, rc0 rc0Var, sc0 sc0Var, Handler handler, boolean z10) {
        super(handlerThread.getLooper());
        this.f79056a = handlerThread;
        this.f79057b = rc0Var;
        this.f79058c = sc0Var;
        this.f79059d = handler;
        this.f79064i = 3;
        this.f79065j = 5;
        this.f79063h = z10;
        this.f79060e = new ArrayList();
        this.f79061f = new HashMap();
    }

    public final int a(String str) {
        for (int i10 = 0; i10 < this.f79060e.size(); i10++) {
            if (((gj0) this.f79060e.get(i10)).f77816a.f81422b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final gj0 a(gj0 gj0Var) {
        int i10 = gj0Var.f77817b;
        if (i10 != 3 && i10 != 4) {
            int iA = a(gj0Var.f77816a.f81422b);
            if (iA == -1) {
                this.f79060e.add(gj0Var);
                Collections.sort(this.f79060e, new k3());
            } else {
                boolean z10 = gj0Var.f77818c != ((gj0) this.f79060e.get(iA)).f77818c;
                this.f79060e.set(iA, gj0Var);
                if (z10) {
                    Collections.sort(this.f79060e, new k3());
                }
            }
            try {
                ((rc0) this.f79057b).a(gj0Var);
            } catch (IOException e10) {
                ih1.b("DownloadManager", ih1.a("Failed to update index.", e10));
            }
            this.f79059d.obtainMessage(2, new ij0(gj0Var, false, new ArrayList(this.f79060e), null)).sendToTarget();
            return gj0Var;
        }
        throw new IllegalStateException();
    }

    public final gj0 a(gj0 gj0Var, int i10, int i11) {
        if (i10 != 3 && i10 != 4) {
            return a(new gj0(gj0Var.f77816a, i10, gj0Var.f77818c, System.currentTimeMillis(), gj0Var.f77820e, i11, 0, gj0Var.f77823h));
        }
        throw new IllegalStateException();
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        try {
            int[] iArr = {3, 4};
            rc0 rc0Var = (rc0) this.f79057b;
            rc0Var.a();
            StringBuilder sb2 = new StringBuilder("state IN (");
            for (int i10 = 0; i10 < 2; i10++) {
                if (i10 > 0) {
                    sb2.append(',');
                }
                sb2.append(iArr[i10]);
            }
            sb2.append(')');
            Cursor cursorA = rc0Var.a(sb2.toString(), (String[]) null);
            while (cursorA.moveToPosition(cursorA.getPosition() + 1)) {
                try {
                    arrayList.add(rc0.a(cursorA));
                } catch (Throwable th2) {
                    try {
                        cursorA.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            cursorA.close();
        } catch (IOException unused) {
            ih1.b("DownloadManager", "Failed to load downloads.");
        }
        for (int i11 = 0; i11 < this.f79060e.size(); i11++) {
            ArrayList arrayList2 = this.f79060e;
            gj0 gj0Var = (gj0) arrayList2.get(i11);
            arrayList2.set(i11, new gj0(gj0Var.f77816a, 5, gj0Var.f77818c, System.currentTimeMillis(), gj0Var.f77820e, 0, 0, gj0Var.f77823h));
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ArrayList arrayList3 = this.f79060e;
            gj0 gj0Var2 = (gj0) arrayList.get(i12);
            arrayList3.add(new gj0(gj0Var2.f77816a, 5, gj0Var2.f77818c, System.currentTimeMillis(), gj0Var2.f77820e, 0, 0, gj0Var2.f77823h));
        }
        Collections.sort(this.f79060e, new k3());
        try {
            ((rc0) this.f79057b).c();
        } catch (IOException e10) {
            ih1.b("DownloadManager", ih1.a("Failed to update index.", e10));
        }
        ArrayList arrayList4 = new ArrayList(this.f79060e);
        for (int i13 = 0; i13 < this.f79060e.size(); i13++) {
            this.f79059d.obtainMessage(2, new ij0((gj0) this.f79060e.get(i13), false, arrayList4, null)).sendToTarget();
        }
        b();
    }

    public final void a(gj0 gj0Var, int i10) {
        if (i10 == 0) {
            if (gj0Var.f77817b == 1) {
                a(gj0Var, 0, 0);
            }
        } else if (i10 != gj0Var.f77821f) {
            int i11 = gj0Var.f77817b;
            if (i11 == 0 || i11 == 2) {
                i11 = 1;
            }
            a(new gj0(gj0Var.f77816a, i11, gj0Var.f77818c, System.currentTimeMillis(), gj0Var.f77820e, i10, 0, gj0Var.f77823h));
        }
    }
}
