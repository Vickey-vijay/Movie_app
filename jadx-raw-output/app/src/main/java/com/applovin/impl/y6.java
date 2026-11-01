package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class y6 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f10142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s2 f10143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f10144c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f10145d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f10146e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f10147f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f10148g = new ArrayList();

    public class a extends s2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.s2
        public List c(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? y6.this.c() : y6.this.a();
        }

        @Override // com.applovin.impl.s2
        public int d(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? new v4("IAB TCF Parameters") : new v4("CMP CONFIGURATION");
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return e.values().length;
        }
    }

    public class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z6 f10150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.sdk.k f10151b;

        public class a implements com.applovin.impl.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f10153a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f10154b;

            public a(String str, String str2) {
                this.f10153a = str;
                this.f10154b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f10153a, this.f10154b, b.this.f10151b);
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.y6$b$b, reason: collision with other inner class name */
        public class C0050b implements com.applovin.impl.d.b {
            public C0050b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(y6.this.f10146e, y6.this.f10147f, y6.this.f10144c, y6.this.f10145d, y6.this.f10148g, b.this.f10151b);
            }
        }

        public b(z6 z6Var, com.applovin.impl.sdk.k kVar) {
            this.f10150a = z6Var;
            this.f10151b = kVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            String strA;
            String strC;
            if (j2Var.b() == e.IAB_TCF_PARAMETERS.ordinal()) {
                if (j2Var.a() == d.TC_STRING.ordinal()) {
                    strA = z4.f10259x.a();
                    strC = this.f10150a.j();
                } else {
                    strA = z4.f10260y.a();
                    strC = this.f10150a.c();
                }
                com.applovin.impl.d.a(y6.this, MaxDebuggerTcfStringActivity.class, this.f10151b.e(), new a(strA, strC));
                return;
            }
            if (j2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                com.applovin.impl.d.a(y6.this, MaxDebuggerCmpNetworksListActivity.class, this.f10151b.e(), new C0050b());
            } else {
                n7.a(r2Var.c(), r2Var.b(), y6.this);
            }
        }
    }

    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
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
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f10143b);
    }

    private void a(List list) {
        boolean zB = this.f10142a.r0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a7 a7Var = (a7) it.next();
            if (a7Var.f() == a7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(a7Var.a())) {
                    a(a7Var, this.f10144c);
                } else {
                    a(a7Var, this.f10146e);
                }
            } else if (a7Var.f() != a7.a.ATP_NETWORK) {
                this.f10148g.add(a7Var);
            } else if (!zB) {
                this.f10148g.add(a7Var);
            } else if (Boolean.TRUE.equals(a7Var.a())) {
                a(a7Var, this.f10145d);
            } else {
                a(a7Var, this.f10147f);
            }
        }
    }

    private r2 b() {
        r2.b bVarA;
        String strA = z4.f10256u.a();
        Integer numE = this.f10142a.r0().e();
        if (StringUtils.isValidString(this.f10142a.r0().d())) {
            bVarA = r2.a(r2.c.RIGHT_DETAIL);
        } else {
            r2.b bVarB = r2.a(r2.c.DETAIL).b("Unknown CMP SDK ID");
            bVarA = bVarB.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strA + " is " + numE + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(m0.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numG = this.f10142a.r0().g();
        String strJ = this.f10142a.r0().j();
        String strC = this.f10142a.r0().c();
        arrayList.add(a(z4.f10258w.a(), numG));
        arrayList.add(a(z4.f10259x.a(), strJ, !c7.b(strJ)));
        arrayList.add(a(z4.f10260y.a(), strC, false));
        return arrayList;
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f10142a;
    }

    public void initialize(List<a7> list, com.applovin.impl.sdk.k kVar) {
        this.f10142a = kVar;
        z6 z6VarR0 = kVar.r0();
        a(list);
        a aVar = new a(this);
        this.f10143b = aVar;
        aVar.a(new b(z6VarR0, kVar));
        this.f10143b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.f10143b;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    private void a(a7 a7Var, List list) {
        if (a7Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (a7Var.d().equals(((a7) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(a7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f10146e.size() + this.f10147f.size();
        arrayList.add(b());
        arrayList.add(a(z4.f10257v.a(), this.f10142a.r0().f()));
        arrayList.add(r2.a(r2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        r2.b bVarD = r2.a(r2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = "";
        }
        arrayList.add(bVarD.c(str).c(size > 0 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).a(this).a(true).a());
        return arrayList;
    }

    private r2 a(String str, Integer num) {
        return r2.a(r2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? ViewCompat.MEASURED_STATE_MASK : SupportMenu.CATEGORY_MASK).a();
    }

    private r2 a(String str, String str2, boolean z10) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        r2.b bVarD = r2.a(r2.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        r2.b bVarA = bVarD.c(str2).c(z10 ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }
}
