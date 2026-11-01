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
public abstract class d7 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f7293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f7294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private s2 f7295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f7296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f7297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListView f7298g;

    public class a extends s2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.s2
        public r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.s2
        public List c(int i10) {
            return i10 == c.BIDDERS.ordinal() ? d7.this.f7296e : d7.this.f7297f;
        }

        @Override // com.applovin.impl.s2
        public int d(int i10) {
            return i10 == c.BIDDERS.ordinal() ? d7.this.f7296e.size() : d7.this.f7297f.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i10) {
            return i10 == c.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
        }
    }

    public class b extends z3 {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ u2 f7300p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e3 e3Var, Context context, u2 u2Var) {
            super(e3Var, context);
            this.f7300p = u2Var;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int d() {
            if (d7.this.f7292a.s0().b() == null || !d7.this.f7292a.s0().b().equals(this.f7300p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public int e() {
            if (d7.this.f7292a.s0().b() == null || !d7.this.f7292a.s0().b().equals(this.f7300p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.r2
        public SpannedString k() {
            int i10;
            if (o()) {
                i10 = ViewCompat.MEASURED_STATE_MASK;
            } else {
                i10 = -7829368;
            }
            return StringUtils.createSpannedString(this.f7300p.a(), i10, 18, 1);
        }
    }

    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7298g = listView;
        listView.setAdapter((ListAdapter) this.f7295d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        List listB = a(j2Var).b();
        if (listB.equals(kVar.s0().b())) {
            kVar.s0().a((List) null);
        } else {
            kVar.s0().a(listB);
        }
        this.f7295d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f7292a;
    }

    public void initialize(List<u2> list, List<u2> list2, final com.applovin.impl.sdk.k kVar) {
        this.f7292a = kVar;
        this.f7293b = list;
        this.f7294c = list2;
        this.f7296e = a(list);
        this.f7297f = a(list2);
        a aVar = new a(this);
        this.f7295d = aVar;
        aVar.a(new s2.a() { // from class: com.applovin.impl.o9
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f8682a.a(kVar, j2Var, r2Var);
            }
        });
        this.f7295d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f7296e = a(this.f7293b);
        this.f7297f = a(this.f7294c);
        this.f7295d.c();
    }

    public d7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u2 u2Var = (u2) it.next();
            arrayList.add(new b(u2Var.d(), this, u2Var));
        }
        return arrayList;
    }

    private u2 a(j2 j2Var) {
        if (j2Var.b() == c.BIDDERS.ordinal()) {
            return (u2) this.f7293b.get(j2Var.a());
        }
        return (u2) this.f7294c.get(j2Var.a());
    }
}
