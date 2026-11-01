package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.webkit.internal.AssetHelper;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m3 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o3 f7954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f7955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f7956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ListView f7957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.a f7958e;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            m3.this.a();
            m3 m3Var = m3.this;
            m3Var.b((Context) m3Var);
        }
    }

    public class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.c f7960a;

        public class a implements com.applovin.impl.d.b {
            public a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(m3.this.f7954a.t());
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.m3$b$b, reason: collision with other inner class name */
        public class C0038b implements com.applovin.impl.d.b {
            public C0038b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(m3.this.f7954a.d(), m3.this.f7954a.t());
            }
        }

        public class c implements com.applovin.impl.d.b {
            public c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(m3.this.f7954a.d(), m3.this.f7954a.t());
            }
        }

        public class d implements com.applovin.impl.d.b {
            public d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f7954a.f(), false, m3.this.f7954a.t());
            }
        }

        public class e implements com.applovin.impl.d.b {
            public e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(m3.this.f7954a.k(), m3.this.f7954a.w(), m3.this.f7954a.t());
            }
        }

        public class f implements com.applovin.impl.d.b {
            public f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(m3.this.f7954a.v(), m3.this.f7954a.t());
            }
        }

        public class g implements com.applovin.impl.d.b {
            public g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f7954a.o(), true, m3.this.f7954a.t());
            }
        }

        public class h implements com.applovin.impl.d.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r2 f7969a;

            public h(r2 r2Var) {
                this.f7969a = r2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((z3) this.f7969a).r());
            }
        }

        public b(com.applovin.impl.c cVar) {
            this.f7960a = cVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            int iB = j2Var.b();
            if (iB == o3.e.APP_INFO.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), m3.this);
                return;
            }
            if (iB == o3.e.MAX.ordinal()) {
                if (m3.this.f7954a.a(r2Var)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerUnifiedFlowActivity.class, this.f7960a, new a());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB == o3.e.PRIVACY.ordinal()) {
                if (j2Var.a() != o3.d.CMP.ordinal()) {
                    if (j2Var.a() == o3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        com.applovin.impl.d.a(m3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f7960a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(m3.this.f7954a.t().r0().j())) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTcfInfoListActivity.class, this.f7960a, new C0038b());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB != o3.e.ADS.ordinal()) {
                if ((iB == o3.e.INCOMPLETE_NETWORKS.ordinal() || iB == o3.e.COMPLETED_NETWORKS.ordinal()) && (r2Var instanceof z3)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerDetailActivity.class, this.f7960a, new h(r2Var));
                    return;
                }
                return;
            }
            if (j2Var.a() == o3.b.AD_UNITS.ordinal()) {
                if (m3.this.f7954a.f().size() > 0) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f7960a, new d());
                    return;
                } else {
                    n7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", m3.this);
                    return;
                }
            }
            if (j2Var.a() == o3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (m3.this.f7954a.k().size() <= 0 && m3.this.f7954a.w().size() <= 0) {
                    n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
                    return;
                } else if (m3.this.f7954a.t().s0().c()) {
                    n7.a("Restart Required", r2Var.b(), m3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f7960a, new e());
                    return;
                }
            }
            if (j2Var.a() != o3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (j2Var.a() == o3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f7960a, new g());
                }
            } else if (!m3.this.f7954a.t().s0().c()) {
                m3.this.getSdk().s0().a();
                n7.a("Restart Required", r2Var.b(), m3.this);
            } else if (m3.this.f7954a.v().size() > 0) {
                com.applovin.impl.d.a(m3.this, MaxDebuggerTestModeNetworkActivity.class, this.f7960a, new f());
            } else {
                n7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
            }
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44955a);
        p10.startActivity(p11);
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f7956c = (FrameLayout) findViewById(android.R.id.content);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7957d = listView;
        listView.setAdapter((ListAdapter) this.f7954a);
    }

    private void b() {
        o3 o3Var = this.f7954a;
        if (o3Var == null) {
            return;
        }
        String strP = o3Var.p();
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", strP);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        o3 o3Var = this.f7954a;
        if (o3Var != null) {
            return o3Var.t();
        }
        return null;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    public void setListAdapter(o3 o3Var, c cVar) {
        DataSetObserver dataSetObserver;
        o3 o3Var2 = this.f7954a;
        if (o3Var2 != null && (dataSetObserver = this.f7955b) != null) {
            o3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f7954a = o3Var;
        this.f7955b = new a();
        b((Context) this);
        this.f7954a.registerDataSetObserver(this.f7955b);
        this.f7954a.a(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f7958e;
        if (aVar != null) {
            aVar.b();
            this.f7956c.removeView(this.f7958e);
            this.f7958e = null;
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, android.R.attr.progressBarStyleLarge);
        this.f7958e = aVar;
        aVar.setColor(-3355444);
        this.f7956c.addView(this.f7958e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f7956c.bringChildToFront(this.f7958e);
        this.f7958e.a();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o3 o3Var = this.f7954a;
        if (o3Var != null) {
            o3Var.unregisterDataSetObserver(this.f7955b);
            this.f7954a.a((s2.a) null);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        o3 o3Var = this.f7954a;
        if (o3Var != null && !o3Var.y()) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        n7.a(this.f7954a.i(), this.f7954a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f7954a.h()) || this.f7954a.x()) {
            return;
        }
        this.f7954a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.hc
            @Override // java.lang.Runnable
            public final void run() {
                this.f7642b.a(context);
            }
        });
    }
}
