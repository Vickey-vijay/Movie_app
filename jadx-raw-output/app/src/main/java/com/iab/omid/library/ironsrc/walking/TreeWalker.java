package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.ironsrc.internal.j;
import com.iab.omid.library.ironsrc.utils.f;
import com.iab.omid.library.ironsrc.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TreeWalker implements com.iab.omid.library.ironsrc.processor.a.InterfaceC0230a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f21827i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f21828j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f21829k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21830l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f21831m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21833b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21839h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21832a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21834c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.ironsrc.weakreference.a> f21835d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.a f21837f = new com.iab.omid.library.ironsrc.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.processor.b f21836e = new com.iab.omid.library.ironsrc.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.walking.b f21838g = new com.iab.omid.library.ironsrc.walking.b(new com.iab.omid.library.ironsrc.walking.async.c());

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
            TreeWalker.this.f21838g.b();
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
            if (TreeWalker.f21829k != null) {
                TreeWalker.f21829k.post(TreeWalker.f21830l);
                TreeWalker.f21829k.postDelayed(TreeWalker.f21831m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f21832a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21832a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21833b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21833b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.ironsrc.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.processor.a aVarB = this.f21836e.b();
        String strB = this.f21837f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.ironsrc.walking.a.C0232a c0232aB = this.f21837f.b(view);
        if (c0232aB == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, c0232aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f21837f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, strC);
        com.iab.omid.library.ironsrc.utils.c.a(jSONObject, Boolean.valueOf(this.f21837f.e(view)));
        com.iab.omid.library.ironsrc.utils.c.b(jSONObject, Boolean.valueOf(this.f21837f.c(strC)));
        this.f21837f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f21839h);
    }

    private void e() {
        this.f21833b = 0;
        this.f21835d.clear();
        this.f21834c = false;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f21834c = true;
                break;
            }
        }
        this.f21839h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21827i;
    }

    private void i() {
        if (f21829k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21829k = handler;
            handler.post(f21830l);
            f21829k.postDelayed(f21831m, 200L);
        }
    }

    private void k() {
        Handler handler = f21829k;
        if (handler != null) {
            handler.removeCallbacks(f21831m);
            f21829k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.ironsrc.processor.a.InterfaceC0230a
    public void a(View view, com.iab.omid.library.ironsrc.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.ironsrc.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f21837f.d(view)) != com.iab.omid.library.ironsrc.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.ironsrc.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f21834c && cVarD == com.iab.omid.library.ironsrc.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f21835d.add(new com.iab.omid.library.ironsrc.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f21833b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21832a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21832a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f21837f.e();
        long jB = f.b();
        com.iab.omid.library.ironsrc.processor.a aVarA = this.f21836e.a();
        if (this.f21837f.b().size() > 0) {
            for (String str : this.f21837f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21837f.a(str), jSONObjectA);
                com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21838g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f21837f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.ironsrc.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.ironsrc.utils.c.b(jSONObjectA2);
            this.f21838g.b(jSONObjectA2, this.f21837f.c(), jB);
            if (this.f21834c) {
                Iterator<com.iab.omid.library.ironsrc.adsession.a> it = com.iab.omid.library.ironsrc.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f21835d);
                }
            }
        } else {
            this.f21838g.b();
        }
        this.f21837f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f21832a.clear();
        f21828j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21832a.contains(treeWalkerTimeLogger)) {
            this.f21832a.remove(treeWalkerTimeLogger);
        }
    }
}
