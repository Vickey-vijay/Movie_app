package com.iab.omid.library.appodeal.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.appodeal.internal.j;
import com.iab.omid.library.appodeal.utils.f;
import com.iab.omid.library.appodeal.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class TreeWalker implements com.iab.omid.library.appodeal.processor.a.InterfaceC0210a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f21165i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f21166j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f21167k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21168l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f21169m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21171b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21177h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21170a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21172c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.appodeal.weakreference.a> f21173d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.appodeal.walking.a f21175f = new com.iab.omid.library.appodeal.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.appodeal.processor.b f21174e = new com.iab.omid.library.appodeal.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.appodeal.walking.b f21176g = new com.iab.omid.library.appodeal.walking.b(new com.iab.omid.library.appodeal.walking.async.c());

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
            TreeWalker.this.f21176g.b();
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
            if (TreeWalker.f21167k != null) {
                TreeWalker.f21167k.post(TreeWalker.f21168l);
                TreeWalker.f21167k.postDelayed(TreeWalker.f21169m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f21170a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21170a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21171b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21171b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.appodeal.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.appodeal.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.appodeal.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.appodeal.processor.a aVarB = this.f21174e.b();
        String strB = this.f21175f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.appodeal.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.appodeal.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.appodeal.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.appodeal.walking.a.C0212a c0212aB = this.f21175f.b(view);
        if (c0212aB == null) {
            return false;
        }
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, c0212aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f21175f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, strC);
        com.iab.omid.library.appodeal.utils.c.a(jSONObject, Boolean.valueOf(this.f21175f.e(view)));
        com.iab.omid.library.appodeal.utils.c.b(jSONObject, Boolean.valueOf(this.f21175f.c(strC)));
        this.f21175f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f21177h);
    }

    private void e() {
        this.f21171b = 0;
        this.f21173d.clear();
        this.f21172c = false;
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = com.iab.omid.library.appodeal.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f21172c = true;
                break;
            }
        }
        this.f21177h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21165i;
    }

    private void i() {
        if (f21167k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21167k = handler;
            handler.post(f21168l);
            f21167k.postDelayed(f21169m, 200L);
        }
    }

    private void k() {
        Handler handler = f21167k;
        if (handler != null) {
            handler.removeCallbacks(f21169m);
            f21167k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.appodeal.processor.a.InterfaceC0210a
    public void a(View view, com.iab.omid.library.appodeal.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.appodeal.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f21175f.d(view)) != com.iab.omid.library.appodeal.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.appodeal.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f21172c && cVarD == com.iab.omid.library.appodeal.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f21173d.add(new com.iab.omid.library.appodeal.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f21171b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21170a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21170a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f21175f.e();
        long jB = f.b();
        com.iab.omid.library.appodeal.processor.a aVarA = this.f21174e.a();
        if (this.f21175f.b().size() > 0) {
            for (String str : this.f21175f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21175f.a(str), jSONObjectA);
                com.iab.omid.library.appodeal.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21176g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f21175f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.appodeal.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.appodeal.utils.c.b(jSONObjectA2);
            this.f21176g.b(jSONObjectA2, this.f21175f.c(), jB);
            if (this.f21172c) {
                Iterator<com.iab.omid.library.appodeal.adsession.a> it = com.iab.omid.library.appodeal.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f21173d);
                }
            }
        } else {
            this.f21176g.b();
        }
        this.f21175f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f21170a.clear();
        f21166j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21170a.contains(treeWalkerTimeLogger)) {
            this.f21170a.remove(treeWalkerTimeLogger);
        }
    }
}
