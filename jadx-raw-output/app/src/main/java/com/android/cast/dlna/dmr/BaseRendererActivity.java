package com.android.cast.dlna.dmr;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import ck.p;
import lk.a0;
import y.b;

/* JADX INFO: compiled from: BaseRendererActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseRendererActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DLNARendererService f6200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ServiceConnection f6201d = new a();

    /* JADX INFO: compiled from: BaseRendererActivity.kt */
    public static final class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p.j(componentName, "name");
            p.j(iBinder, NotificationCompat.CATEGORY_SERVICE);
            BaseRendererActivity.this.f6200c = ((b) iBinder).a();
            BaseRendererActivity.this.onServiceConnected();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            p.j(componentName, "name");
            BaseRendererActivity.this.f6200c = null;
        }
    }

    public void onServiceConnected() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        unbindService(this.f6201d);
        DLNARendererService dLNARendererService = this.f6200c;
        if (dLNARendererService != null) {
            dLNARendererService.e(null);
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        p.j(intent, "newIntent");
        super.onNewIntent(intent);
        setIntent(intent);
        CastAction castActionK = k();
        String strC = castActionK != null ? castActionK.c() : null;
        if (strC == null || a0.n0(strC)) {
            return;
        }
        finish();
    }

    public final CastAction k() {
        return (CastAction) getIntent().getParcelableExtra("extra.castAction");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strC;
        boolean z10;
        super.onCreate(bundle);
        CastAction castActionK = k();
        if (castActionK != null) {
            strC = castActionK.c();
        } else {
            strC = null;
        }
        if (strC != null && !a0.n0(strC)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            finish();
        } else {
            bindService(new Intent(this, (Class<?>) DLNARendererService.class), this.f6201d, 1);
        }
    }
}
