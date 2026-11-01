package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.vungle.internal.j;
import com.iab.omid.library.vungle.utils.f;
import com.iab.omid.library.vungle.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TreeWalker implements com.iab.omid.library.vungle.processor.a.InterfaceC0243a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f22231i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f22232j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f22233k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f22234l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f22235m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22237b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22243h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f22236a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22238c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.vungle.weakreference.a> f22239d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.a f22241f = new com.iab.omid.library.vungle.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.vungle.processor.b f22240e = new com.iab.omid.library.vungle.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.vungle.walking.b f22242g = new com.iab.omid.library.vungle.walking.b(new com.iab.omid.library.vungle.walking.async.c());

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
            TreeWalker.this.f22242g.b();
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
            if (TreeWalker.f22233k != null) {
                TreeWalker.f22233k.post(TreeWalker.f22234l);
                TreeWalker.f22233k.postDelayed(TreeWalker.f22235m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f22236a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f22236a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f22237b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f22237b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.vungle.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.vungle.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.vungle.processor.a aVarB = this.f22240e.b();
        String strB = this.f22241f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.vungle.walking.a.C0245a c0245aB = this.f22241f.b(view);
        if (c0245aB == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, c0245aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f22241f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.vungle.utils.c.a(jSONObject, strC);
        com.iab.omid.library.vungle.utils.c.a(jSONObject, Boolean.valueOf(this.f22241f.e(view)));
        com.iab.omid.library.vungle.utils.c.b(jSONObject, Boolean.valueOf(this.f22241f.c(strC)));
        this.f22241f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f22243h);
    }

    private void e() {
        this.f22237b = 0;
        this.f22239d.clear();
        this.f22238c = false;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f22238c = true;
                break;
            }
        }
        this.f22243h = f.b();
    }

    public static TreeWalker getInstance() {
        return f22231i;
    }

    private void i() {
        if (f22233k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f22233k = handler;
            handler.post(f22234l);
            f22233k.postDelayed(f22235m, 200L);
        }
    }

    private void k() {
        Handler handler = f22233k;
        if (handler != null) {
            handler.removeCallbacks(f22235m);
            f22233k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.vungle.processor.a.InterfaceC0243a
    public void a(View view, com.iab.omid.library.vungle.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.vungle.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f22241f.d(view)) != com.iab.omid.library.vungle.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.vungle.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f22238c && cVarD == com.iab.omid.library.vungle.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f22239d.add(new com.iab.omid.library.vungle.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f22237b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22236a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f22236a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f22241f.e();
        long jB = f.b();
        com.iab.omid.library.vungle.processor.a aVarA = this.f22240e.a();
        if (this.f22241f.b().size() > 0) {
            for (String str : this.f22241f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f22241f.a(str), jSONObjectA);
                com.iab.omid.library.vungle.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f22242g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f22241f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.vungle.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.vungle.utils.c.b(jSONObjectA2);
            this.f22242g.b(jSONObjectA2, this.f22241f.c(), jB);
            if (this.f22238c) {
                Iterator<com.iab.omid.library.vungle.adsession.a> it = com.iab.omid.library.vungle.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f22239d);
                }
            }
        } else {
            this.f22242g.b();
        }
        this.f22241f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f22236a.clear();
        f22232j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22236a.contains(treeWalkerTimeLogger)) {
            this.f22236a.remove(treeWalkerTimeLogger);
        }
    }
}
