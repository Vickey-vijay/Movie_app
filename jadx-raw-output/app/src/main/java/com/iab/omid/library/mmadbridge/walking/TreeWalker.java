package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.mmadbridge.internal.j;
import com.iab.omid.library.mmadbridge.utils.f;
import com.iab.omid.library.mmadbridge.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class TreeWalker implements com.iab.omid.library.mmadbridge.processor.a.InterfaceC0234a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f21962i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f21963j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f21964k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21965l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f21966m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21968b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21974h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21967a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21969c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.mmadbridge.weakreference.a> f21970d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.a f21972f = new com.iab.omid.library.mmadbridge.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.processor.b f21971e = new com.iab.omid.library.mmadbridge.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.walking.b f21973g = new com.iab.omid.library.mmadbridge.walking.b(new com.iab.omid.library.mmadbridge.walking.async.c());

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
            TreeWalker.this.f21973g.b();
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
            if (TreeWalker.f21964k != null) {
                TreeWalker.f21964k.post(TreeWalker.f21965l);
                TreeWalker.f21964k.postDelayed(TreeWalker.f21966m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f21967a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21967a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21968b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21968b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.mmadbridge.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.processor.a aVarB = this.f21971e.b();
        String strB = this.f21972f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.mmadbridge.walking.a.C0236a c0236aB = this.f21972f.b(view);
        if (c0236aB == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, c0236aB);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strC = this.f21972f.c(view);
        if (strC == null) {
            return false;
        }
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, strC);
        com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, Boolean.valueOf(this.f21972f.e(view)));
        com.iab.omid.library.mmadbridge.utils.c.b(jSONObject, Boolean.valueOf(this.f21972f.c(strC)));
        this.f21972f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f21974h);
    }

    private void e() {
        this.f21968b = 0;
        this.f21970d.clear();
        this.f21969c = false;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f21969c = true;
                break;
            }
        }
        this.f21974h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21962i;
    }

    private void i() {
        if (f21964k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21964k = handler;
            handler.post(f21965l);
            f21964k.postDelayed(f21966m, 200L);
        }
    }

    private void k() {
        Handler handler = f21964k;
        if (handler != null) {
            handler.removeCallbacks(f21966m);
            f21964k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
        j.b().a();
    }

    @Override // com.iab.omid.library.mmadbridge.processor.a.InterfaceC0234a
    public void a(View view, com.iab.omid.library.mmadbridge.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.mmadbridge.walking.c cVarD;
        if (h.f(view) && (cVarD = this.f21972f.d(view)) != com.iab.omid.library.mmadbridge.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.mmadbridge.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f21969c && cVarD == com.iab.omid.library.mmadbridge.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f21970d.add(new com.iab.omid.library.mmadbridge.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarD, z11);
            }
            this.f21968b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21967a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21967a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f21972f.e();
        long jB = f.b();
        com.iab.omid.library.mmadbridge.processor.a aVarA = this.f21971e.a();
        if (this.f21972f.b().size() > 0) {
            for (String str : this.f21972f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21972f.a(str), jSONObjectA);
                com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21973g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f21972f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.mmadbridge.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.mmadbridge.utils.c.b(jSONObjectA2);
            this.f21973g.b(jSONObjectA2, this.f21972f.c(), jB);
            if (this.f21969c) {
                Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = com.iab.omid.library.mmadbridge.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f21970d);
                }
            }
        } else {
            this.f21973g.b();
        }
        this.f21972f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f21967a.clear();
        f21963j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21967a.contains(treeWalkerTimeLogger)) {
            this.f21967a.remove(treeWalkerTimeLogger);
        }
    }
}
