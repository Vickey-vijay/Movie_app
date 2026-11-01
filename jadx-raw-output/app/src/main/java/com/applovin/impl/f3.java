package com.applovin.impl;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f3 extends n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g3 f7469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListView f7470b;

    public class a implements s2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e3 f7471a;

        /* JADX INFO: renamed from: com.applovin.impl.f3$a$a, reason: collision with other inner class name */
        public class C0036a implements d.b {
            public C0036a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f7471a);
            }
        }

        public a(e3 e3Var) {
            this.f7471a = e3Var;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() == g3.a.TEST_ADS.ordinal()) {
                com.applovin.impl.sdk.k kVarO = this.f7471a.o();
                e3.b bVarY = this.f7471a.y();
                if (f3.this.f7469a.a(j2Var)) {
                    if (e3.b.READY == bVarY) {
                        d.a(f3.this, MaxDebuggerMultiAdActivity.class, kVarO.e(), new C0036a());
                        return;
                    } else if (e3.b.DISABLED == bVarY) {
                        kVarO.s0().a();
                        n7.a(r2Var.c(), r2Var.b(), f3.this);
                        return;
                    } else {
                        n7.a(r2Var.c(), r2Var.b(), f3.this);
                        return;
                    }
                }
                n7.a(r2Var.c(), r2Var.b(), f3.this);
                return;
            }
            n7.a(r2Var.c(), r2Var.b(), f3.this);
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
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7470b = listView;
        listView.setAdapter((ListAdapter) this.f7469a);
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        g3 g3Var = this.f7469a;
        if (g3Var != null) {
            return g3Var.h().o();
        }
        return null;
    }

    public f3() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public void initialize(e3 e3Var) {
        setTitle(e3Var.g());
        g3 g3Var = new g3(e3Var, this);
        this.f7469a = g3Var;
        g3Var.a(new a(e3Var));
    }

    @Override // com.applovin.impl.n3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f7469a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f7469a.k();
            this.f7469a.c();
        }
    }
}
