package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class g3 extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e3 f7527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f7528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f7529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f7530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f7531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f7532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private SpannedString f7533k;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    private r2 f() {
        if (this.f7527e.H()) {
            return null;
        }
        return r2.a().d("Initialization Status").c(f(this.f7527e.i())).a(false).a();
    }

    public boolean a(j2 j2Var) {
        return j2Var.b() == a.TEST_ADS.ordinal() && j2Var.a() == this.f7532j.size() - 1;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f7528f;
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f7529g;
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f7530h;
        }
        return i10 == a.DEPENDENCIES.ordinal() ? this.f7531i : this.f7532j;
    }

    @Override // com.applovin.impl.s2
    public int d(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f7528f.size();
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f7529g.size();
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f7530h.size();
        }
        return i10 == a.DEPENDENCIES.ordinal() ? this.f7531i.size() : this.f7532j.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return new v4("INTEGRATIONS");
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return new v4("PERMISSIONS");
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return new v4("CONFIGURATION");
        }
        return i10 == a.DEPENDENCIES.ordinal() ? new v4("DEPENDENCIES") : new v4("TEST ADS");
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k1 k1Var = (k1) it.next();
                arrayList.add(a(k1Var.b(), k1Var.a(), k1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p4 p4Var = (p4) it.next();
                arrayList.add(a(p4Var.b(), p4Var.a(), p4Var.c(), true));
            }
        }
        return arrayList;
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f7527e.v())) {
            arrayList.add(r2.a(r2.c.DETAIL).d(this.f7527e.v()).a());
        }
        if (this.f7527e.y() == e3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f7527e.s() != null) {
            arrayList.add(c(this.f7527e.s()));
        }
        arrayList.add(a(this.f7527e.y()));
        return arrayList;
    }

    public e3 h() {
        return this.f7527e;
    }

    public g3(e3 e3Var, Context context) {
        super(context);
        this.f7527e = e3Var;
        if (e3Var.q() == e3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f7533k = new SpannedString(spannableString);
        } else {
            this.f7533k = new SpannedString("");
        }
        this.f7528f = g();
        this.f7529g = b(e3Var.n());
        this.f7530h = e();
        this.f7531i = a(e3Var.f());
        this.f7532j = j();
        notifyDataSetChanged();
    }

    private r2 i() {
        r2.b bVarC = r2.a().d("SDK").c(this.f7527e.p());
        if (TextUtils.isEmpty(this.f7527e.p())) {
            bVarC.a(a(this.f7527e.F())).b(b(this.f7527e.F()));
        }
        return bVarC.a();
    }

    public void k() {
        this.f7528f = g();
    }

    private String f(int i10) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i10 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i10 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i10) {
            return "Initialized";
        }
        if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10) {
            return "Failure";
        }
        return MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10 ? "Initializing..." : "Not Initialized";
    }

    private r2 a(e3.b bVar) {
        r2.b bVarA = r2.a();
        if (bVar == e3.b.READY) {
            bVarA.a(this.f9006a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z10) {
        return m0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f9006a);
    }

    private r2 c(List list) {
        return r2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private r2 d() {
        r2.b bVarC = r2.a().d("Adapter").c(this.f7527e.c());
        if (TextUtils.isEmpty(this.f7527e.c())) {
            bVarC.a(a(this.f7527e.z())).b(b(this.f7527e.z()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f7527e.D()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", com.applovin.impl.sdk.k.F0(), true));
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z10) {
        return m0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f9006a);
    }

    private r2 a(String str, String str2, boolean z10, boolean z11) {
        return r2.a(z10 ? r2.c.RIGHT_DETAIL : r2.c.DETAIL).d(str).a(z10 ? null : this.f7533k).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? m0.a(R.color.applovin_sdk_checkmarkColor, this.f9006a) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
