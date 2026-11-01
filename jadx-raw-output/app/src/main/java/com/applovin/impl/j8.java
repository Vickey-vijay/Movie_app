package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j8 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s2 f7767c;

    public class a extends s2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f7768e;

        @Override // com.applovin.impl.s2
        public int b() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f7768e = list;
        }

        @Override // com.applovin.impl.s2
        public r2 a() {
            return new r2.b(r2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.s2
        public List c(int i10) {
            return this.f7768e;
        }

        @Override // com.applovin.impl.s2
        public int d(int i10) {
            return this.f7768e.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i10) {
            return new v4("SEGMENT TARGETING");
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
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f7765a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f7767c);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(r2.a(r2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f7766b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.k kVar) {
        this.f7765a = str;
        this.f7766b = kVar;
        a aVar = new a(this, a(list));
        this.f7767c = aVar;
        aVar.notifyDataSetChanged();
    }
}
