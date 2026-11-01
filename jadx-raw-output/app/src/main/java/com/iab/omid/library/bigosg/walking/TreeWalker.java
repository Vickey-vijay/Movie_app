package com.iab.omid.library.bigosg.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bigosg.d.d;
import com.iab.omid.library.bigosg.d.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class TreeWalker implements com.iab.omid.library.bigosg.c.a.InterfaceC0214a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TreeWalker f21290a = new TreeWalker();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Handler f21291b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Handler f21292c = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Runnable f21293j = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.2
        @Override // java.lang.Runnable
        public final void run() {
            TreeWalker.getInstance().h();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Runnable f21294k = new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.3
        @Override // java.lang.Runnable
        public final void run() {
            if (TreeWalker.f21292c != null) {
                TreeWalker.f21292c.post(TreeWalker.f21293j);
                TreeWalker.f21292c.postDelayed(TreeWalker.f21294k, 200L);
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21296e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f21300i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21295d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f21298g = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bigosg.c.b f21297f = new com.iab.omid.library.bigosg.c.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f21299h = new b(new com.iab.omid.library.bigosg.walking.a.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    private void a(long j10) {
        if (this.f21295d.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21295d) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21296e, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21296e, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject, c cVar) {
        aVar.a(view, jSONObject, this, cVar == c.PARENT_VIEW);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bigosg.c.a aVarB = this.f21297f.b();
        String strA = this.f21298g.a(str);
        if (strA != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA, str);
            com.iab.omid.library.bigosg.d.b.b(jSONObjectA, strA);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        String strA = this.f21298g.a(view);
        if (strA == null) {
            return false;
        }
        com.iab.omid.library.bigosg.d.b.a(jSONObject, strA);
        this.f21298g.e();
        return true;
    }

    private void b(View view, JSONObject jSONObject) {
        a.C0215a c0215aB = this.f21298g.b(view);
        if (c0215aB != null) {
            com.iab.omid.library.bigosg.d.b.a(jSONObject, c0215aB);
        }
    }

    public static TreeWalker getInstance() {
        return f21290a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        i();
        d();
        j();
    }

    private void i() {
        this.f21296e = 0;
        this.f21300i = d.a();
    }

    private void j() {
        a(d.a() - this.f21300i);
    }

    private void k() {
        if (f21292c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21292c = handler;
            handler.post(f21293j);
            f21292c.postDelayed(f21294k, 200L);
        }
    }

    private void l() {
        Handler handler = f21292c;
        if (handler != null) {
            handler.removeCallbacks(f21294k);
            f21292c = null;
        }
    }

    public void a() {
        k();
    }

    @Override // com.iab.omid.library.bigosg.c.a.InterfaceC0214a
    public void a(View view, com.iab.omid.library.bigosg.c.a aVar, JSONObject jSONObject) {
        c cVarC;
        if (f.d(view) && (cVarC = this.f21298g.c(view)) != c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bigosg.d.b.a(jSONObject, jSONObjectA);
            if (!a(view, jSONObjectA)) {
                b(view, jSONObjectA);
                a(view, aVar, jSONObjectA, cVarC);
            }
            this.f21296e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21295d.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21295d.add(treeWalkerTimeLogger);
    }

    public void b() {
        c();
        this.f21295d.clear();
        f21291b.post(new Runnable() { // from class: com.iab.omid.library.bigosg.walking.TreeWalker.1
            @Override // java.lang.Runnable
            public void run() {
                TreeWalker.this.f21299h.a();
            }
        });
    }

    public void c() {
        l();
    }

    @VisibleForTesting
    public void d() {
        this.f21298g.c();
        long jA = d.a();
        com.iab.omid.library.bigosg.c.a aVarA = this.f21297f.a();
        if (this.f21298g.b().size() > 0) {
            for (String str : this.f21298g.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21298g.b(str), jSONObjectA);
                com.iab.omid.library.bigosg.d.b.a(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21299h.b(jSONObjectA, hashSet, jA);
            }
        }
        if (this.f21298g.a().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, c.PARENT_VIEW);
            com.iab.omid.library.bigosg.d.b.a(jSONObjectA2);
            this.f21299h.a(jSONObjectA2, this.f21298g.a(), jA);
        } else {
            this.f21299h.a();
        }
        this.f21298g.d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21295d.contains(treeWalkerTimeLogger)) {
            this.f21295d.remove(treeWalkerTimeLogger);
        }
    }
}
