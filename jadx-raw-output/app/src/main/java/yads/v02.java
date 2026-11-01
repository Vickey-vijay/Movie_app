package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import yads.v02;

/* JADX INFO: loaded from: classes11.dex */
public final class v02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p02 f83717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f83718b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y5 f83719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c10 f83720d;

    public final void a(final l4 l4Var) {
        this.f83719c.a(l4Var.f79698b, l4Var.f79699c);
        this.f83718b.post(new Runnable() { // from class: cp.db
            @Override // java.lang.Runnable
            public final void run() {
                v02.a(this.f51290b, l4Var);
            }
        });
    }

    public v02(Context context, d4 d4Var, lu2 lu2Var, w5 w5Var, p02 p02Var) {
        this.f83717a = p02Var;
        this.f83719c = new y5(context, d4Var, lu2Var, w5Var);
    }

    public static final void a(v02 v02Var, l4 l4Var) {
        c10 c10Var = v02Var.f83720d;
        if (c10Var != null) {
            ((pt3) c10Var).a(l4Var);
        }
        p02 p02Var = v02Var.f83717a;
        o02 o02Var = (o02) p02Var.f81195a;
        o02Var.f80885e.a();
        o02Var.f80884d.remove(p02Var);
    }

    public final void a(final w02 w02Var) {
        d00 d00Var = e00.f76858c;
        p4.a("native");
        this.f83719c.a();
        this.f83718b.post(new Runnable() { // from class: cp.eb
            @Override // java.lang.Runnable
            public final void run() {
                v02.a(this.f51312b, w02Var);
            }
        });
    }

    public static final void a(v02 v02Var, w02 w02Var) {
        c10 c10Var = v02Var.f83720d;
        if (c10Var != null) {
            ((pt3) c10Var).a(w02Var);
        }
        p02 p02Var = v02Var.f83717a;
        o02 o02Var = (o02) p02Var.f81195a;
        o02Var.f80885e.a();
        o02Var.f80884d.remove(p02Var);
    }

    public final void a(final ArrayList arrayList) {
        d00 d00Var = e00.f76858c;
        p4.a("native");
        this.f83719c.a();
        this.f83718b.post(new Runnable() { // from class: cp.fb
            @Override // java.lang.Runnable
            public final void run() {
                v02.a(this.f51329b, arrayList);
            }
        });
    }

    public static final void a(v02 v02Var, List list) {
        v02Var.getClass();
        p02 p02Var = v02Var.f83717a;
        o02 o02Var = (o02) p02Var.f81195a;
        o02Var.f80885e.a();
        o02Var.f80884d.remove(p02Var);
    }

    public final void a(final v22 v22Var) {
        d00 d00Var = e00.f76858c;
        p4.a("native");
        this.f83719c.a();
        this.f83718b.post(new Runnable() { // from class: cp.gb
            @Override // java.lang.Runnable
            public final void run() {
                v02.a(this.f51348b, v22Var);
            }
        });
    }

    public static final void a(v02 v02Var, v22 v22Var) {
        v02Var.getClass();
        p02 p02Var = v02Var.f83717a;
        o02 o02Var = (o02) p02Var.f81195a;
        o02Var.f80885e.a();
        o02Var.f80884d.remove(p02Var);
    }

    public final void a(d4 d4Var) {
        this.f83719c.f84823e = new j9(d4Var);
    }

    public final void a(i12 i12Var) {
        this.f83719c.f84824f = i12Var;
    }
}
