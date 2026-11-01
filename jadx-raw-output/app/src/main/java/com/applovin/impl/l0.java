package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l0 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f7856b;

    public class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f7857e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List f7858f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f7859g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List f7860h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f7861i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f7857e = list;
            this.f7858f = list2;
            this.f7859g = list3;
            this.f7860h = list4;
            this.f7861i = list5;
        }

        @Override // com.applovin.impl.s2
        public List c(int i10) {
            List list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f7857e;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f7858f;
            } else {
                if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f7859g;
                } else {
                    list = i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f7860h : this.f7861i;
                }
                z10 = false;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l0.this.a((a7) it.next(), z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        public int d(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f7857e.size();
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f7858f.size();
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f7859g.size();
            }
            return i10 == c.LISTED_AC_NETWORKS.ordinal() ? this.f7860h.size() : this.f7861i.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return new v4("MISSING TCF VENDORS (TC STRING)");
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return new v4("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return new v4("LISTED TCF VENDORS (TC STRING)");
            }
            return i10 == c.LISTED_AC_NETWORKS.ordinal() ? new v4("LISTED ATP NETWORKS (AC STRING)") : new v4("NON-CONFIGURABLE NETWORKS");
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return c.values().length;
        }
    }

    public class b implements s2.a {
        public b() {
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            n7.a(r2Var.c(), r2Var.b(), l0.this);
        }
    }

    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f7856b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(a7 a7Var, boolean z10) {
        r2.b bVarA = r2.a();
        boolean zB = this.f7855a.r0().b();
        a7.a aVarF = a7Var.f();
        a7.a aVar = a7.a.TCF_VENDOR;
        if (aVarF == aVar || (a7Var.f() == a7.a.ATP_NETWORK && zB)) {
            String strC = a7Var.c();
            String str = a7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            bVarA.d(strC).d(z10 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).b(strC).a(str + a7Var.d()).a(true);
        } else {
            bVarA.d(a7Var.b());
        }
        return bVarA.a();
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f7855a;
    }

    public void initialize(List<a7> list, List<a7> list2, List<a7> list3, List<a7> list4, List<a7> list5, com.applovin.impl.sdk.k kVar) {
        this.f7855a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f7856b = aVar;
        aVar.a(new b());
        this.f7856b.notifyDataSetChanged();
    }
}
