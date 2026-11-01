package com.mgs.carparking.jiajia;

import android.os.Bundle;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.basecommon.ui.BarActivity;
import em.n;
import mi.a;
import mi.b;
import oi.g;
import x9.c0;

/* JADX INFO: loaded from: classes9.dex */
public class MJMainActivity extends BarActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f41069j;

    public void setDrawerHeaderAccount() {
    }

    public void m(b bVar) {
        if (this.f41069j == null) {
            this.f41069j = new a();
        }
        this.f41069j.b(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(c0 c0Var) throws Exception {
        setDrawerHeaderAccount();
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_majia_main, false);
        this.f41069j = new a();
        n.a(this);
        m(tl.a.a().d(c0.class).subscribe(new g() { // from class: s9.a
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f67049b.n((c0) obj);
            }
        }));
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f41069j.dispose();
    }
}
