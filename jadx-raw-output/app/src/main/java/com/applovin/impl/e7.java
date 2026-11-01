package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e7 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f7427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f7428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f7429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ListView f7430e;

    public class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f7431e;

        @Override // com.applovin.impl.s2
        public int b() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f7431e = list;
        }

        @Override // com.applovin.impl.s2
        public r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.s2
        public List c(int i10) {
            return e7.this.f7429d;
        }

        @Override // com.applovin.impl.s2
        public int d(int i10) {
            return this.f7431e.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i10) {
            return new v4("TEST MODE NETWORKS");
        }
    }

    public class b implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f7433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.applovin.impl.sdk.k f7434b;

        public b(List list, com.applovin.impl.sdk.k kVar) {
            this.f7433a = list;
            this.f7434b = kVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            List listU = ((e3) this.f7433a.get(j2Var.a())).u();
            if (listU.equals(this.f7434b.s0().b())) {
                this.f7434b.s0().a((List) null);
            } else {
                this.f7434b.s0().a(listU);
            }
            e7.this.f7428c.notifyDataSetChanged();
        }
    }

    public class c extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ e3 f7436p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e3 e3Var, Context context, e3 e3Var2) {
            super(e3Var, context);
            this.f7436p = e3Var2;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int d() {
            if (this.f7436p.u().equals(e7.this.f7426a.s0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int e() {
            if (this.f7436p.u().equals(e7.this.f7426a.s0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.r2
        public SpannedString k() {
            int i10;
            if (o()) {
                i10 = ViewCompat.MEASURED_STATE_MASK;
            } else {
                i10 = -7829368;
            }
            return StringUtils.createSpannedString(this.f7436p.g(), i10, 18, 1);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7430e = listView;
        listView.setAdapter((ListAdapter) this.f7428c);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            arrayList.add(new c(e3Var, this, e3Var));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f7426a;
    }

    public void initialize(List<e3> list, com.applovin.impl.sdk.k kVar) {
        this.f7426a = kVar;
        this.f7427b = list;
        this.f7429d = a(list);
        a aVar = new a(this, list);
        this.f7428c = aVar;
        aVar.a(new b(list, kVar));
        this.f7428c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f7429d = a(this.f7427b);
        this.f7428c.notifyDataSetChanged();
    }

    public e7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }
}
