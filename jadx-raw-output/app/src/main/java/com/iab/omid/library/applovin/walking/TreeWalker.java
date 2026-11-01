package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class TreeWalker implements com.iab.omid.library.applovin.processor.a.InterfaceC0206a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f21030i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f21031j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f21032k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21033l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f21034m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21036b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21042h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21035a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21037c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.applovin.weakreference.a> f21038d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.a f21040f = new com.iab.omid.library.applovin.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.applovin.processor.b f21039e = new com.iab.omid.library.applovin.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.applovin.walking.b f21041g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

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
            TreeWalker.this.f21041g.b();
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
            if (TreeWalker.f21032k != null) {
                TreeWalker.f21032k.post(TreeWalker.f21033l);
                TreeWalker.f21032k.postDelayed(TreeWalker.f21034m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f21035a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21035a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21036b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21036b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a aVarB = this.f21039e.b();
        String strB = this.f21040f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.walking.a.C0208a c0208aB = this.f21040f.b(view);
        if (c0208aB == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c0208aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f21040f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, strC);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f21040f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f21040f.c(strC)));
        this.f21040f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f21042h);
    }

    private void e() {
        this.f21036b = 0;
        this.f21038d.clear();
        this.f21037c = false;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().g()) {
                this.f21037c = true;
                break;
            }
        }
        this.f21042h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21030i;
    }

    private void i() {
        if (f21032k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21032k = handler;
            handler.post(f21033l);
            f21032k.postDelayed(f21034m, 200L);
        }
    }

    private void k() {
        Handler handler = f21032k;
        if (handler != null) {
            handler.removeCallbacks(f21034m);
            f21032k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.applovin.processor.a.InterfaceC0206a
    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.applovin.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f21040f.d(view)) != com.iab.omid.library.applovin.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f21037c && cVarD == com.iab.omid.library.applovin.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f21038d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f21036b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21035a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21035a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f21040f.e();
        long jB = f.b();
        com.iab.omid.library.applovin.processor.a aVarA = this.f21039e.a();
        if (this.f21040f.b().size() > 0) {
            for (String str : this.f21040f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21040f.a(str), jSONObjectA);
                com.iab.omid.library.applovin.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21041g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f21040f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.applovin.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.applovin.utils.c.b(jSONObjectA2);
            this.f21041g.b(jSONObjectA2, this.f21040f.c(), jB);
            if (this.f21037c) {
                Iterator<com.iab.omid.library.applovin.adsession.a> it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f21038d);
                }
            }
        } else {
            this.f21041g.b();
        }
        this.f21040f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f21035a.clear();
        f21031j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21035a.contains(treeWalkerTimeLogger)) {
            this.f21035a.remove(treeWalkerTimeLogger);
        }
    }
}
