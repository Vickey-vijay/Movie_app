package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w6 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f9825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f9826b;

    public class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9827e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9828f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f9829g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f9827e = arrayList;
            this.f9828f = arrayList2;
            this.f9829g = z10;
        }

        @Override // com.applovin.impl.s2
        public List c(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f9827e : this.f9828f;
        }

        @Override // com.applovin.impl.s2
        public int d(int i10) {
            return i10 == b.TC_NETWORKS.ordinal() ? this.f9827e.size() : this.f9828f.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return new v4("TCF VENDORS (TC STRING)");
            }
            return new v4(this.f9829g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return b.values().length;
        }
    }

    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
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
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f9826b);
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f9825a;
    }

    public void initialize(List<a7> list, com.applovin.impl.sdk.k kVar) {
        this.f9825a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = p0.b().a(this);
        boolean zB = kVar.r0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (a7 a7Var : list) {
            Boolean boolA = a7Var.a();
            if (boolA != null) {
                if (a7Var.f() == a7.a.TCF_VENDOR) {
                    arrayList.add(a(a7Var.b(), String.valueOf(boolA)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK) {
                    arrayList2.add(a(a7Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && a7Var.f() == a7.a.ATP_NETWORK) {
                arrayList2.add(a(a7Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f9826b = aVar;
        aVar.notifyDataSetChanged();
    }

    private r2 a(String str, String str2) {
        return r2.a().d(str).c(str2).a();
    }
}
