package yads;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class hd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f78177a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wl1 f78178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gd0 f78179c;

    public static gd0 a(wl1 wl1Var) {
        pd0 pd0Var = new pd0();
        pd0Var.f81373b = null;
        Uri uri = wl1Var.f84254b;
        w11 w11Var = new w11(uri != null ? uri.toString() : null, wl1Var.f84258f, pd0Var);
        ja3 it = wl1Var.f84255c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (w11Var.f84076d) {
                w11Var.f84076d.put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = jr.f79149a;
        mn0 mn0Var = wx0.f84372d;
        ae0 ae0Var = new ae0(0);
        UUID uuid2 = wl1Var.f84253a;
        mn0 mn0Var2 = wx0.f84372d;
        uuid2.getClass();
        mn0Var2.getClass();
        boolean z10 = wl1Var.f84256d;
        boolean z11 = wl1Var.f84257e;
        int[] iArrA = td1.a(wl1Var.f84259g);
        for (int i10 : iArrA) {
            if (i10 != 2 && i10 != 1) {
                throw new IllegalArgumentException();
            }
        }
        gd0 gd0Var = new gd0(uuid2, mn0Var2, w11Var, map, z10, (int[]) iArrA.clone(), z11, ae0Var, 300000L);
        byte[] bArrA = wl1Var.a();
        if (!gd0Var.f77752m.isEmpty()) {
            throw new IllegalStateException();
        }
        gd0Var.f77761v = 0;
        gd0Var.f77762w = bArrA;
        return gd0Var;
    }

    public final sk0 a(fm1 fm1Var) {
        gd0 gd0Var;
        fm1Var.f77444c.getClass();
        wl1 wl1Var = fm1Var.f77444c.f85474c;
        if (wl1Var != null && ib3.f78556a >= 18) {
            synchronized (this.f78177a) {
                if (!ib3.a(wl1Var, this.f78178b)) {
                    this.f78178b = wl1Var;
                    this.f78179c = a(wl1Var);
                }
                gd0Var = this.f78179c;
                gd0Var.getClass();
            }
            return gd0Var;
        }
        return sk0.f82673a;
    }
}
