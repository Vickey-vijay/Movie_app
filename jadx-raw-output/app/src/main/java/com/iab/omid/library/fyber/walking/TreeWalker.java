package com.iab.omid.library.fyber.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.fyber.internal.j;
import com.iab.omid.library.fyber.utils.f;
import com.iab.omid.library.fyber.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements com.iab.omid.library.fyber.processor.a.InterfaceC0221a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f21551i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f21552j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f21553k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21554l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f21555m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21557b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21563h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21556a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21558c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.fyber.weakreference.a> f21559d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.fyber.walking.a f21561f = new com.iab.omid.library.fyber.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.fyber.processor.b f21560e = new com.iab.omid.library.fyber.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.fyber.walking.b f21562g = new com.iab.omid.library.fyber.walking.b(new com.iab.omid.library.fyber.walking.async.c());

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
            TreeWalker.this.f21562g.b();
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
            if (TreeWalker.f21553k != null) {
                TreeWalker.f21553k.post(TreeWalker.f21554l);
                TreeWalker.f21553k.postDelayed(TreeWalker.f21555m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f21556a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21556a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21557b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21557b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.fyber.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.fyber.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.fyber.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.fyber.processor.a aVarB = this.f21560e.b();
        String strB = this.f21561f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.fyber.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.fyber.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.fyber.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.fyber.walking.a.C0223a c0223aB = this.f21561f.b(view);
        if (c0223aB == null) {
            return false;
        }
        com.iab.omid.library.fyber.utils.c.a(jSONObject, c0223aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f21561f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.fyber.utils.c.a(jSONObject, strC);
        com.iab.omid.library.fyber.utils.c.a(jSONObject, Boolean.valueOf(this.f21561f.e(view)));
        com.iab.omid.library.fyber.utils.c.b(jSONObject, Boolean.valueOf(this.f21561f.c(strC)));
        this.f21561f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f21563h);
    }

    private void e() {
        this.f21557b = 0;
        this.f21559d.clear();
        this.f21558c = false;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = com.iab.omid.library.fyber.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f21558c = true;
                break;
            }
        }
        this.f21563h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21551i;
    }

    private void i() {
        if (f21553k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21553k = handler;
            handler.post(f21554l);
            f21553k.postDelayed(f21555m, 200L);
        }
    }

    private void k() {
        Handler handler = f21553k;
        if (handler != null) {
            handler.removeCallbacks(f21555m);
            f21553k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.fyber.processor.a.InterfaceC0221a
    public void a(View view, com.iab.omid.library.fyber.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.fyber.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f21561f.d(view)) != com.iab.omid.library.fyber.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.fyber.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f21558c && cVarD == com.iab.omid.library.fyber.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f21559d.add(new com.iab.omid.library.fyber.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f21557b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21556a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21556a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f21561f.e();
        long jB = f.b();
        com.iab.omid.library.fyber.processor.a aVarA = this.f21560e.a();
        if (this.f21561f.b().size() > 0) {
            for (String str : this.f21561f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21561f.a(str), jSONObjectA);
                com.iab.omid.library.fyber.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21562g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f21561f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.fyber.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.fyber.utils.c.b(jSONObjectA2);
            this.f21562g.b(jSONObjectA2, this.f21561f.c(), jB);
            if (this.f21558c) {
                Iterator<com.iab.omid.library.fyber.adsession.a> it = com.iab.omid.library.fyber.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f21559d);
                }
            }
        } else {
            this.f21562g.b();
        }
        this.f21561f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f21556a.clear();
        f21552j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21556a.contains(treeWalkerTimeLogger)) {
            this.f21556a.remove(treeWalkerTimeLogger);
        }
    }
}
