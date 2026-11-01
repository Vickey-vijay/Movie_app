package yads;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class tu2 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CopyOnWriteArrayList f83175f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f83176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nk.l0 f83177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ut1 f83178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f83179e;

    @Override // java.lang.Runnable
    public final void run() {
        zu2 zu2Var = new zu2(this.f83179e, this.f83176b, this.f83177c, new w5(), null, null, 2097136);
        f83175f.add(zu2Var);
        nk.j.d(this.f83177c, null, null, new su2(zu2Var, this, null), 3, null);
    }

    public tu2(Context context, iu3 iu3Var, nk.l0 l0Var, ut1 ut1Var) {
        this.f83176b = iu3Var;
        this.f83177c = l0Var;
        this.f83178d = ut1Var;
        this.f83179e = context.getApplicationContext();
    }
}
