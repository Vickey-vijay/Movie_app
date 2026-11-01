package com.iab.omid.library.unity3d.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.unity3d.utils.f;
import com.iab.omid.library.unity3d.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class TreeWalker implements com.iab.omid.library.unity3d.processor.a.InterfaceC0238a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f22091i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f22092j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f22093k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f22094l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f22095m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22097b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22103h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f22096a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22098c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.unity3d.weakreference.a> f22099d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.a f22101f = new com.iab.omid.library.unity3d.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.unity3d.processor.b f22100e = new com.iab.omid.library.unity3d.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.unity3d.walking.b f22102g = new com.iab.omid.library.unity3d.walking.b(new com.iab.omid.library.unity3d.walking.async.c());

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
            TreeWalker.this.f22102g.b();
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
            if (TreeWalker.f22093k != null) {
                TreeWalker.f22093k.post(TreeWalker.f22094l);
                TreeWalker.f22093k.postDelayed(TreeWalker.f22095m, 200L);
            }
        }
    }

    private void a(long j10) {
        if (this.f22096a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f22096a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f22097b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f22097b, j10);
                }
            }
        }
    }

    private void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.unity3d.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, z10);
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.unity3d.processor.a aVarB = this.f22100e.b();
        String strB = this.f22101f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.unity3d.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.unity3d.walking.a.C0240a c0240aC = this.f22101f.c(view);
        if (c0240aC == null) {
            return false;
        }
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, c0240aC);
        return true;
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f22101f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, strD);
        com.iab.omid.library.unity3d.utils.c.a(jSONObject, Boolean.valueOf(this.f22101f.f(view)));
        this.f22101f.d();
        return true;
    }

    private void d() {
        a(f.b() - this.f22103h);
    }

    private void e() {
        this.f22097b = 0;
        this.f22099d.clear();
        this.f22098c = false;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f22098c = true;
                break;
            }
        }
        this.f22103h = f.b();
    }

    public static TreeWalker getInstance() {
        return f22091i;
    }

    private void i() {
        if (f22093k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f22093k = handler;
            handler.post(f22094l);
            f22093k.postDelayed(f22095m, 200L);
        }
    }

    private void k() {
        Handler handler = f22093k;
        if (handler != null) {
            handler.removeCallbacks(f22095m);
            f22093k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    @Override // com.iab.omid.library.unity3d.processor.a.InterfaceC0238a
    public void a(View view, com.iab.omid.library.unity3d.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.unity3d.walking.c cVarE;
        if (h.d(view) && (cVarE = this.f22101f.e(view)) != com.iab.omid.library.unity3d.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.unity3d.utils.c.a(jSONObject, jSONObjectA);
            if (!b(view, jSONObjectA)) {
                boolean z11 = z10 || a(view, jSONObjectA);
                if (this.f22098c && cVarE == com.iab.omid.library.unity3d.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f22099d.add(new com.iab.omid.library.unity3d.weakreference.a(view));
                }
                a(view, aVar, jSONObjectA, cVarE, z11);
            }
            this.f22097b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22096a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f22096a.add(treeWalkerTimeLogger);
    }

    @VisibleForTesting
    public void f() {
        this.f22101f.e();
        long jB = f.b();
        com.iab.omid.library.unity3d.processor.a aVarA = this.f22100e.a();
        if (this.f22101f.b().size() > 0) {
            for (String str : this.f22101f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f22101f.a(str), jSONObjectA);
                com.iab.omid.library.unity3d.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f22102g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f22101f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            a(null, aVarA, jSONObjectA2, com.iab.omid.library.unity3d.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.unity3d.utils.c.b(jSONObjectA2);
            this.f22102g.b(jSONObjectA2, this.f22101f.c(), jB);
            if (this.f22098c) {
                Iterator<com.iab.omid.library.unity3d.adsession.a> it = com.iab.omid.library.unity3d.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(this.f22099d);
                }
            }
        } else {
            this.f22102g.b();
        }
        this.f22101f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f22096a.clear();
        f22092j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f22096a.contains(treeWalkerTimeLogger)) {
            this.f22096a.remove(treeWalkerTimeLogger);
        }
    }
}
