package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class TreeWalker implements com.iab.omid.library.bytedance2.processor.a.InterfaceC0217a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f21416i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f21417j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f21418k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f21419l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f21420m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21422b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f21428h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f21421a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21423c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f21424d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f21426f = new com.iab.omid.library.bytedance2.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f21425e = new com.iab.omid.library.bytedance2.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f21427g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f21427g.b();
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
            if (TreeWalker.f21418k != null) {
                TreeWalker.f21418k.post(TreeWalker.f21419l);
                TreeWalker.f21418k.postDelayed(TreeWalker.f21420m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f21421a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f21421a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f21422b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f21422b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f21425e.b();
        String strB = this.f21426f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.walking.a.C0219a c0219aC = this.f21426f.c(view);
        if (c0219aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0219aC);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f21426f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f21426f.f(view)));
        this.f21426f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f21428h);
    }

    private void e() {
        this.f21422b = 0;
        this.f21424d.clear();
        this.f21423c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f21423c = true;
                break;
            }
        }
        this.f21428h = f.b();
    }

    public static TreeWalker getInstance() {
        return f21416i;
    }

    private void i() {
        if (f21418k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f21418k = handler;
            handler.post(f21419l);
            f21418k.postDelayed(f21420m, 200L);
        }
    }

    private void k() {
        Handler handler = f21418k;
        if (handler != null) {
            handler.removeCallbacks(f21420m);
            f21418k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0217a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        if (h.d(view) && (cVarE = this.f21426f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f21423c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f21424d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarE, z11);
            }
            this.f21422b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21421a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f21421a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f21426f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f21425e.a();
        if (this.f21426f.b().size() > 0) {
            for (String str : this.f21426f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f21426f.a(str), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f21427g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f21426f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            this.f21427g.b(jSONObjectA2, this.f21426f.c(), jB);
            if (this.f21423c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f21424d);
                }
            }
        } else {
            this.f21427g.b();
        }
        this.f21426f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f21421a.clear();
        f21417j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f21421a.contains(treeWalkerTimeLogger)) {
            this.f21421a.remove(treeWalkerTimeLogger);
        }
    }
}
