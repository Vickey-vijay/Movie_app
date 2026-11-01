package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.inmobi.internal.j;
import com.iab.omid.library.inmobi.utils.f;
import com.iab.omid.library.inmobi.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TreeWalker implements com.iab.omid.library.inmobi.processor.a.InterfaceC0226a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f21692i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f21693j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f21694k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21695l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f21696m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21698b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21704h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21697a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21699c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.inmobi.weakreference.a> f21700d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.a f21702f = new com.iab.omid.library.inmobi.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.inmobi.processor.b f21701e = new com.iab.omid.library.inmobi.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.b f21703g = new com.iab.omid.library.inmobi.walking.b(new com.iab.omid.library.inmobi.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f21703g.b();
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f21694k != null) {
                TreeWalker.f21694k.post(TreeWalker.f21695l);
                TreeWalker.f21694k.postDelayed(TreeWalker.f21696m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f21697a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21697a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21698b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21698b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.inmobi.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.processor.a aVarB = this.f21701e.b();
        String strB = this.f21702f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.walking.a.C0228a c0228aB = this.f21702f.b(view);
        if (c0228aB == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, c0228aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f21702f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, strC);
        com.iab.omid.library.inmobi.utils.c.a(jSONObject, Boolean.valueOf(this.f21702f.e(view)));
        com.iab.omid.library.inmobi.utils.c.b(jSONObject, Boolean.valueOf(this.f21702f.c(strC)));
        this.f21702f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f21704h);
    }

    private void e() {
        this.f21698b = 0;
        this.f21700d.clear();
        this.f21699c = false;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f21699c = true;
                break;
            }
        }
        this.f21704h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21692i;
    }

    private void i() {
        if (f21694k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21694k = handler;
            handler.post(f21695l);
            f21694k.postDelayed(f21696m, 200L);
        }
    }

    private void k() {
        Handler handler = f21694k;
        if (handler != null) {
            handler.removeCallbacks(f21696m);
            f21694k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.inmobi.processor.a.InterfaceC0226a
    public void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.inmobi.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f21702f.d(view)) != com.iab.omid.library.inmobi.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f21699c && cVarD == com.iab.omid.library.inmobi.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f21700d.add(new com.iab.omid.library.inmobi.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f21698b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21697a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21697a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f21702f.e();
        long jB = f.b();
        com.iab.omid.library.inmobi.processor.a aVarA = this.f21701e.a();
        if (this.f21702f.b().size() > 0) {
            for (String str : this.f21702f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21702f.a(str), jSONObjectA);
                com.iab.omid.library.inmobi.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21703g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f21702f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.inmobi.utils.c.b(jSONObjectA2);
            this.f21703g.b(jSONObjectA2, this.f21702f.c(), jB);
            if (this.f21699c) {
                Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f21700d);
                }
            }
        } else {
            this.f21703g.b();
        }
        this.f21702f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f21697a.clear();
        f21693j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21697a.contains(treeWalkerTimeLogger)) {
            this.f21697a.remove(treeWalkerTimeLogger);
        }
    }
}
