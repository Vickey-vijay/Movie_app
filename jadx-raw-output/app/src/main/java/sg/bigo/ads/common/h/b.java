package sg.bigo.ads.common.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.common.h.b.e;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f69684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f69685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f69686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList<sg.bigo.ads.common.h.a> f69687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f69688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final sg.bigo.ads.common.h.a.a f69689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f69690g;

    public interface a {
        void a(sg.bigo.ads.common.h.a aVar);

        void a(sg.bigo.ads.common.h.a aVar, int i10, long j10);

        void a(sg.bigo.ads.common.h.a aVar, String str, long j10, long j11);
    }

    public b(@NonNull Context context, sg.bigo.ads.common.h.a.a aVar, boolean z10, @NonNull a aVar2) {
        this.f69690g = context;
        this.f69688e = aVar2;
        sg.bigo.ads.common.h.b.b.a(z10);
        this.f69689f = aVar;
        this.f69684a = new CopyOnWriteArrayList<>();
        this.f69685b = new CopyOnWriteArrayList<>();
        this.f69686c = new CopyOnWriteArrayList<>();
        this.f69687d = new CopyOnWriteArrayList<>();
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return null;
        }
        for (sg.bigo.ads.common.h.a aVar : list) {
            if (TextUtils.equals(str, aVar.f69661c) && TextUtils.equals(str2, aVar.f69662d)) {
                return aVar;
            }
        }
        return null;
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, sg.bigo.ads.common.h.a aVar) {
        int iIndexOf = list.indexOf(aVar);
        if (iIndexOf < 0) {
            return null;
        }
        try {
            return list.get(iIndexOf);
        } catch (Exception e10) {
            a("getExistDownloadInfo e=" + e10.getMessage(), (sg.bigo.ads.common.h.a) null);
            return null;
        }
    }

    private static sg.bigo.ads.common.h.a a(List<sg.bigo.ads.common.h.a> list, boolean z10) {
        for (sg.bigo.ads.common.h.a aVar : list) {
            boolean z11 = true;
            if (z10) {
                int i10 = aVar.f69669k >= 3 ? 1800000 : 300000;
                if (aVar.f69670l <= 0 || System.currentTimeMillis() - aVar.f69670l <= i10) {
                    z11 = false;
                }
            }
            if (z11) {
                return aVar;
            }
            a("no download info execute.", aVar);
        }
        return null;
    }

    private void a(Context context, sg.bigo.ads.common.h.a aVar) {
        aVar.f69671m = SystemClock.elapsedRealtime();
        a("execute download start", aVar);
        if (f.b(aVar.f69661c, aVar.f69662d)) {
            a("executeDownload use local file", aVar);
            f.c(aVar.f69661c, aVar.f69662d);
            aVar.f69668j = 3;
            aVar.f69667i = f.a(aVar.a(), 1);
            this.f69684a.remove(aVar);
            this.f69685b.add(aVar);
            this.f69688e.a(aVar, 0, 0L);
            a();
            return;
        }
        if (!p.b()) {
            this.f69684a.remove(aVar);
            this.f69688e.a(aVar, "internal storage is not enough", SystemClock.elapsedRealtime() - aVar.f69671m, 0L);
            a();
        } else {
            sg.bigo.ads.common.h.b.b.a(context, aVar);
            sg.bigo.ads.common.h.b.b.a(aVar.f69659a, this);
            a("execute downloader", aVar);
            sg.bigo.ads.common.h.b.b.b(aVar.f69659a);
        }
    }

    public static void a(String str, sg.bigo.ads.common.h.a aVar) {
        sg.bigo.ads.common.t.a.a(0, 3, "DownloadManager", str + ", download info = " + (aVar != null ? aVar.toString() : null));
    }

    public static boolean a(List<sg.bigo.ads.common.h.a> list, String str) {
        if (!q.a((CharSequence) str) && !k.a((Collection) list)) {
            Iterator<sg.bigo.ads.common.h.a> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next().f69660b)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean b() {
        return this.f69684a.size() < this.f69689f.f69680a;
    }

    public final sg.bigo.ads.common.h.a a(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return null;
        }
        sg.bigo.ads.common.h.a aVarA = a(this.f69684a, str, str2);
        if (aVarA == null) {
            aVarA = a(this.f69685b, str, str2);
        }
        if (aVarA == null) {
            aVarA = a(this.f69686c, str, str2);
        }
        return aVarA == null ? a(this.f69687d, str, str2) : aVarA;
    }

    public final void a() {
        if (sg.bigo.ads.common.x.a.q()) {
            return;
        }
        a("continue to execute download task", (sg.bigo.ads.common.h.a) null);
        if (!b()) {
            a("no idle download thread", (sg.bigo.ads.common.h.a) null);
            return;
        }
        sg.bigo.ads.common.h.a aVarA = a((List<sg.bigo.ads.common.h.a>) this.f69686c, false);
        if (aVarA != null) {
            a("waiting to downloading", aVarA);
            this.f69686c.remove(aVarA);
        }
        if (aVarA == null && (aVarA = a((List<sg.bigo.ads.common.h.a>) this.f69687d, true)) != null) {
            a("failed to downloading", aVarA);
            this.f69687d.remove(aVarA);
        }
        if (aVarA == null) {
            a("no download info execute.", (sg.bigo.ads.common.h.a) null);
        } else {
            this.f69684a.add(aVarA);
            a(this.f69690g, aVarA);
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void a(String str) {
        final sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
        if (aVarA == null) {
            a("onStart info is null.", (sg.bigo.ads.common.h.a) null);
        } else {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.f69688e.a(aVarA);
                }
            });
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void a(final String str, final String str2, final long j10) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.4
            @Override // java.lang.Runnable
            public final void run() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
                if (aVarA == null) {
                    return;
                }
                b.a("download failed", aVarA);
                aVarA.f69668j = 4;
                if (!aVarA.f69672n) {
                    aVarA.f69669k++;
                }
                aVarA.f69670l = System.currentTimeMillis();
                b.this.f69688e.a(aVarA, str2, jElapsedRealtime - aVarA.f69671m, j10);
                b.a("download failed update fail count", aVarA);
                b.this.f69684a.remove(aVarA);
                b.this.f69687d.add(aVarA);
                b.a("downloading to failed", aVarA);
                b.this.a();
            }
        });
    }

    @SuppressLint({"ConcurrentModification"})
    public final void a(sg.bigo.ads.common.h.a aVar, boolean z10) {
        a("start the download, force=".concat(String.valueOf(z10)), aVar);
        if (f.b(aVar.a())) {
            a("downloaded and exist local file", aVar);
            f.c(aVar.f69661c, aVar.f69662d);
            this.f69688e.a(aVar, 0, 0L);
            return;
        }
        if (a(this.f69684a, aVar) != null) {
            a("downloading", aVar);
            return;
        }
        if (this.f69689f.b()) {
            this.f69688e.a(aVar, "Unable to download media file.", 0L, 0L);
            return;
        }
        sg.bigo.ads.common.h.a aVarA = a(this.f69686c, aVar);
        if (aVarA != null) {
            a("waiting", aVar);
            aVarA.f69660b = aVar.f69660b;
            if (!z10 && !b()) {
                a("waiting not executing", aVar);
                return;
            }
        }
        sg.bigo.ads.common.h.a aVarA2 = a(this.f69687d, aVar);
        if (aVarA2 != null) {
            a(C3426d4.i.f28566t, aVar);
            this.f69687d.remove(aVarA2);
            aVarA2.f69660b = aVar.f69660b;
            aVarA2.f69668j = 0;
            aVar = aVarA2;
        }
        if (!b() && !z10) {
            a("join download waiting queue", aVar);
            this.f69686c.add(aVar);
        } else {
            a("execute download", aVar);
            aVar.f69672n = z10;
            this.f69684a.add(aVar);
            a(this.f69690g, aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    @Override // sg.bigo.ads.common.h.b.e
    public final void b(String str) {
        boolean z10;
        boolean z11;
        final sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
        if (aVarA == null) {
            a("onLoading info is null.", (sg.bigo.ads.common.h.a) null);
            return;
        }
        if (aVarA.f69668j != 1) {
            a("onLoading", aVarA);
            aVarA.f69668j = 1;
        }
        long j10 = aVarA.f69667i;
        if (j10 > 0) {
            long j11 = aVarA.f69665g;
            if ((j11 - aVarA.f69666h) * 100 > j10 * 10) {
                aVarA.f69666h = j11;
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (z10 && aVarA.h()) {
            int iA = sg.bigo.ads.common.aa.c.a(this.f69690g);
            if (!(iA == 3)) {
                if (!(iA == 4)) {
                    z11 = iA == 5;
                }
            }
            if (z11) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - aVarA.f69671m;
                a("partial download callback", aVarA);
                sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.f69688e.a(aVarA, 2, jElapsedRealtime);
                    }
                });
            }
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void c(String str) {
        sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
        if (aVarA != null) {
            aVarA.f69668j = 2;
        }
    }

    @Override // sg.bigo.ads.common.h.b.e
    public final void d(final String str) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.common.h.b.3
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.h.a aVarA = sg.bigo.ads.common.h.b.b.a(str);
                if (aVarA == null) {
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                b.a("download succeed", aVarA);
                aVarA.f69668j = 3;
                b.this.f69684a.remove(aVarA);
                b.this.f69685b.add(aVarA);
                b.this.f69688e.a(aVarA, 1, jElapsedRealtime - aVarA.f69671m);
                b.a("downloading to downloaded", aVarA);
                sg.bigo.ads.common.h.b.b.a(aVarA.f69659a);
                b.this.a();
            }
        });
    }
}
