package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import yads.wc2;

/* JADX INFO: loaded from: classes.dex */
public final class wc2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uc2 f84159h = new uc2();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile wc2 f84160i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f84161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw2 f84162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tc2 f84163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sc2 f84164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f84165e = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f84166f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rc2 f84167g = rc2.f82193d;

    public static final void a(wc2 wc2Var) {
        rc2 rc2VarA = wc2Var.f84163c.a();
        wc2Var.f84167g = rc2VarA;
        Objects.toString(rc2VarA);
        boolean z10 = ad1.f75480a;
        try {
            wc2Var.f84164d.getClass();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (Build.VERSION.SDK_INT >= 33) {
                wc2Var.f84161a.registerReceiver(wc2Var, intentFilter, 2);
            } else {
                wc2Var.f84161a.registerReceiver(wc2Var, intentFilter);
            }
        } catch (Exception unused) {
            boolean z11 = ad1.f75480a;
        }
    }

    public final void b(vc2 vc2Var) {
        synchronized (this.f84166f) {
            this.f84165e.remove(vc2Var);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        rc2 rc2Var;
        rc2 rc2Var2;
        HashSet hashSet;
        synchronized (this.f84166f) {
            rc2 rc2Var3 = this.f84167g;
            String action = intent.getAction();
            if (ck.p.e(action, "android.intent.action.SCREEN_OFF")) {
                rc2Var = rc2.f82192c;
            } else if (ck.p.e(action, "android.intent.action.USER_PRESENT")) {
                rc2Var = rc2.f82193d;
            } else {
                rc2Var = (this.f84167g == rc2.f82193d || !ck.p.e(action, "android.intent.action.SCREEN_ON")) ? this.f84167g : rc2.f82191b;
            }
            this.f84167g = rc2Var;
            if (rc2Var3 != rc2Var) {
                Objects.toString(rc2Var);
                boolean z10 = ad1.f75480a;
            }
            rc2Var2 = this.f84167g;
            hashSet = new HashSet(this.f84165e.keySet());
            mj.r rVar = mj.r.f64562a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((vc2) it.next()).a(rc2Var2);
        }
    }

    public wc2(Context context, Executor executor, dw2 dw2Var, tc2 tc2Var, sc2 sc2Var) {
        this.f84161a = context;
        this.f84162b = dw2Var;
        this.f84163c = tc2Var;
        this.f84164d = sc2Var;
        executor.execute(new Runnable() { // from class: cp.rb
            @Override // java.lang.Runnable
            public final void run() {
                wc2.a(this.f51558b);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000e, B:8:0x0012, B:10:0x0018, B:13:0x001d), top: B:22:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    public final boolean a() {
        boolean z10;
        nt2 nt2VarA = this.f84162b.a(this.f84161a);
        synchronized (this.f84166f) {
            z10 = true;
            if (nt2VarA != null) {
                if (nt2VarA.f80769h) {
                    rc2 rc2Var = this.f84167g;
                    if (rc2Var != rc2.f82191b && rc2Var != rc2.f82193d) {
                        z10 = false;
                    }
                } else if (this.f84167g != rc2.f82193d) {
                    z10 = false;
                }
            } else if (this.f84167g != rc2.f82193d) {
                z10 = false;
            }
            throw th;
        }
        return z10;
    }

    public final void a(vc2 vc2Var) {
        synchronized (this.f84166f) {
            this.f84165e.put(vc2Var, null);
            mj.r rVar = mj.r.f64562a;
        }
    }
}
