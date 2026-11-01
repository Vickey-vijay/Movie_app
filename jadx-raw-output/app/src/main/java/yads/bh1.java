package yads;

import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class bh1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f75822f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile bh1 f75823g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh1 f75824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dh1 f75825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dw2 f75826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ox2 f75827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f75828e;

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    public final Location a() {
        Location locationA;
        synchronized (f75822f) {
            if (this.f75826c.a()) {
                ox2 ox2Var = this.f75827d;
                Context context = this.f75828e;
                ox2Var.getClass();
                if (!ox2.a(context)) {
                    dh1 dh1Var = this.f75825b;
                    Context context2 = this.f75828e;
                    dh1Var.getClass();
                    ArrayList arrayListA = dh1.a(context2);
                    List listC = nj.r.c();
                    Iterator it = arrayListA.iterator();
                    while (it.hasNext()) {
                        Location locationA2 = ((ch1) it.next()).a();
                        if (locationA2 != null) {
                            listC.add(locationA2);
                        }
                    }
                    locationA = this.f75824a.a(nj.r.a(listC));
                } else {
                    locationA = null;
                }
            } else {
                locationA = null;
            }
        }
        return locationA;
    }

    public bh1(Context context, eh1 eh1Var, dh1 dh1Var, dw2 dw2Var, ox2 ox2Var) {
        this.f75824a = eh1Var;
        this.f75825b = dh1Var;
        this.f75826c = dw2Var;
        this.f75827d = ox2Var;
        this.f75828e = uz.a(context);
    }
}
