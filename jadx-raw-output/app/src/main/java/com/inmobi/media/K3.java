package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.inmobi.media.K3;
import com.squareup.picasso.Picasso;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk.l0 f22986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V3 f22987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3053n9 f22988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qk.k f22989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.g f22990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f22991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3040ml f22992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3063nj f22993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P3 f22994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U3 f22995j;

    public final void a(ArrayList arrayList) {
        ck.p.j(arrayList, "companionAds");
        if (arrayList.isEmpty()) {
            return;
        }
        if (!ck.p.e(this.f22994i, M3.f23133a)) {
            Objects.toString(this.f22994i);
            return;
        }
        Map mapA = AbstractC2939ik.a(this.f22987b.f23673a);
        Wj wj2 = Wj.f23753a;
        Wj.b("CompanionAdAvailable", mapA, EnumC2735ak.SDK);
        this.f22990e = nk.j.d(this.f22986a, null, null, new J3(this, arrayList, null), 3, null);
    }

    public K3(Context context, nk.l0 l0Var, V3 v10, C3053n9 c3053n9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(v10, "companionTelemetryHelper");
        this.f22986a = l0Var;
        this.f22987b = v10;
        this.f22988c = c3053n9;
        this.f22989d = qk.q.b(0, 0, null, 7, null);
        this.f22994i = M3.f23133a;
        this.f22995j = new U3(context, c3053n9);
    }

    public final void b() {
        View view = this.f22991f;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: b7.g2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    K3.a(this.f4939b, view2);
                }
            });
        }
    }

    public static final void a(K3 k10, View view) {
        C3040ml c3040ml = k10.f22992g;
        if (c3040ml != null) {
            List listY0 = nj.b0.y0(c3040ml.f24845b, c3040ml.f24846c);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listY0) {
                if (ck.p.e(((C3257ve) obj).f25569b, "click")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C3257ve) it.next()).f25568a);
            }
            P4.a(k10.f22989d, k10.f22986a, new Q3(arrayList2));
        }
    }

    public final void a() {
        ViewParent parent;
        C3053n9 c3053n9 = this.f22988c;
        if (c3053n9 != null) {
            c3053n9.a("CompanionAdManager", "destroy");
        }
        C3063nj c3063nj = this.f22993h;
        if (c3063nj != null) {
            Picasso picasso = Qf.f23387a;
            Qf.b(c3063nj.f24906a).cancelTag(c3063nj.f24908c);
        }
        H6.a(this.f22990e);
        View view = this.f22991f;
        if (view != null && (parent = view.getParent()) != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f22991f);
            }
        }
        this.f22990e = null;
        this.f22993h = null;
        this.f22991f = null;
        this.f22994i = M3.f23133a;
    }
}
