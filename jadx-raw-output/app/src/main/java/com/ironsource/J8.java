package com.ironsource;

import android.view.View;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private F8 f26860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f26861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f26862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f26863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f26864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f26865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f26866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f26867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f26868i;

    public interface a {
        void a(b bVar);

        void a(pg pgVar);
    }

    public enum b {
        Title("title"),
        Advertiser(C3426d4.i.F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(C3426d4.i.J0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26877a;

        public final String b() {
            return this.f26877a;
        }

        b(String str) {
            this.f26877a = str;
        }
    }

    public static final class c implements F8.a {
        public c() {
        }

        @Override // com.ironsource.F8.a
        public void a(pg pgVar) {
            ck.p.j(pgVar, "viewVisibilityParams");
            a aVarN = J8.this.n();
            if (aVarN != null) {
                aVarN.a(pgVar);
            }
        }
    }

    public J8(F8 f10, View view, View view2, View view3, View view4, View view5, View view6, View view7) {
        ck.p.j(f10, "containerView");
        ck.p.j(view7, "privacyIconView");
        this.f26860a = f10;
        this.f26861b = view;
        this.f26862c = view2;
        this.f26863d = view3;
        this.f26864e = view4;
        this.f26865f = view5;
        this.f26866g = view6;
        this.f26867h = view7;
        r();
        s();
    }

    public final F8 a() {
        return this.f26860a;
    }

    public final View b() {
        return this.f26861b;
    }

    public final View c() {
        return this.f26862c;
    }

    public final View d() {
        return this.f26863d;
    }

    public final View e() {
        return this.f26864e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J8)) {
            return false;
        }
        J8 j10 = (J8) obj;
        return ck.p.e(this.f26860a, j10.f26860a) && ck.p.e(this.f26861b, j10.f26861b) && ck.p.e(this.f26862c, j10.f26862c) && ck.p.e(this.f26863d, j10.f26863d) && ck.p.e(this.f26864e, j10.f26864e) && ck.p.e(this.f26865f, j10.f26865f) && ck.p.e(this.f26866g, j10.f26866g) && ck.p.e(this.f26867h, j10.f26867h);
    }

    public final View f() {
        return this.f26865f;
    }

    public final View g() {
        return this.f26866g;
    }

    private final void r() {
        a(this, this.f26861b, b.Title);
        a(this, this.f26862c, b.Advertiser);
        a(this, this.f26864e, b.Body);
        a(this, this.f26866g, b.Cta);
        a(this, this.f26863d, b.Icon);
        a(this, this.f26860a, b.Container);
        a(this, this.f26867h, b.PrivacyIcon);
    }

    private final void s() {
        this.f26860a.setListener$mediationsdk_release(new c());
    }

    public final J8 a(F8 f10, View view, View view2, View view3, View view4, View view5, View view6, View view7) {
        ck.p.j(f10, "containerView");
        ck.p.j(view7, "privacyIconView");
        return new J8(f10, view, view2, view3, view4, view5, view6, view7);
    }

    public final void b(View view) {
        this.f26864e = view;
    }

    public final void c(View view) {
        this.f26866g = view;
    }

    public final void d(View view) {
        this.f26863d = view;
    }

    public final void e(View view) {
        this.f26865f = view;
    }

    public final void f(View view) {
        ck.p.j(view, "<set-?>");
        this.f26867h = view;
    }

    public final void g(View view) {
        this.f26861b = view;
    }

    public final View h() {
        return this.f26867h;
    }

    public int hashCode() {
        int iHashCode = this.f26860a.hashCode() * 31;
        View view = this.f26861b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f26862c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f26863d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f26864e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f26865f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f26866g;
        return ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.f26867h.hashCode();
    }

    public final View i() {
        return this.f26862c;
    }

    public final View j() {
        return this.f26864e;
    }

    public final F8 k() {
        return this.f26860a;
    }

    public final View l() {
        return this.f26866g;
    }

    public final View m() {
        return this.f26863d;
    }

    public final a n() {
        return this.f26868i;
    }

    public final View o() {
        return this.f26865f;
    }

    public final View p() {
        return this.f26867h;
    }

    public final View q() {
        return this.f26861b;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f26860a + ", titleView=" + this.f26861b + ", advertiserView=" + this.f26862c + ", iconView=" + this.f26863d + ", bodyView=" + this.f26864e + ", mediaView=" + this.f26865f + ", ctaView=" + this.f26866g + ", privacyIconView=" + this.f26867h + ")";
    }

    public final void a(F8 f10) {
        ck.p.j(f10, "<set-?>");
        this.f26860a = f10;
    }

    public final void a(View view) {
        this.f26862c = view;
    }

    public final JSONObject t() throws JSONException {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        boolean z15 = true;
        if (this.f26861b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        JSONObject jSONObjectPut = jSONObjectJsonObjectInit.put("title", z10);
        if (this.f26862c != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put(C3426d4.i.F0, z11);
        if (this.f26864e != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("body", z12);
        if (this.f26866g != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        JSONObject jSONObjectPut4 = jSONObjectPut3.put("cta", z13);
        if (this.f26865f != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        JSONObject jSONObjectPut5 = jSONObjectPut4.put(C3426d4.i.I0, z14);
        if (this.f26863d == null) {
            z15 = false;
        }
        JSONObject jSONObjectPut6 = jSONObjectPut5.put("icon", z15);
        ck.p.i(jSONObjectPut6, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut6;
    }

    public final void a(a aVar) {
        this.f26868i = aVar;
    }

    private static final void a(final J8 j10, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.ii
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    J8.a(this.f29168b, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(J8 j10, b bVar, View view) {
        ck.p.j(j10, "this$0");
        ck.p.j(bVar, "$viewName");
        a aVar = j10.f26868i;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    public /* synthetic */ J8(F8 f10, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, ck.i iVar) {
        this(f10, (i10 & 2) != 0 ? null : view, (i10 & 4) != 0 ? null : view2, (i10 & 8) != 0 ? null : view3, (i10 & 16) != 0 ? null : view4, (i10 & 32) != 0 ? null : view5, (i10 & 64) != 0 ? null : view6, view7);
    }
}
