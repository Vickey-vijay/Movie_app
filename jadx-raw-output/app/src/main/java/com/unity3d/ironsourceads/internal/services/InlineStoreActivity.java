package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.C3676r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.EnumC3592m9;
import com.ironsource.InterfaceC3493h;
import com.ironsource.Lb;
import com.ironsource.S9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.v;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class InlineStoreActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45256c = "InlineStoreActivity";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f45257d = 1001;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f45258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f45259b = false;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC3493h f45262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f45263b;

        public b a(Intent intent) {
            this.f45263b = intent;
            return this;
        }

        public Intent a(Context context) {
            Intent intentA = this.f45262a.a(context);
            intentA.putExtra(a.f45260a, this.f45263b);
            return intentA;
        }

        public b(InterfaceC3493h interfaceC3493h) {
            this.f45262a = interfaceC3493h;
        }
    }

    private void a() {
        getWindow().setFlags(1024, 1024);
    }

    private void b() {
        requestWindowFeature(1);
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f45260a = "inline_store_intent";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f45261b = "destroy_inline_store";

        private a() {
        }
    }

    private void a(Intent intent) {
        safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(this, intent, 1001);
        v vVar = this.f45258a;
        if (vVar != null) {
            vVar.y();
        }
        a(D5.INLINE_STORE_LAUNCHED, (Map<String, Object>) null);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 1001) {
            v vVar = this.f45258a;
            if (vVar != null) {
                vVar.a(i11, this.f45259b);
            }
            Map<String, Object> map = new HashMap<>();
            String str = "resultCode:" + i11;
            if (this.f45259b) {
                str = str + ",destroyCalled:true";
            }
            map.put(IronSourceConstants.EVENTS_EXT1, str);
            a(D5.INLINE_STORE_CLOSED, map);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(f45256c, "onCreate()");
        try {
            this.f45258a = (v) S9.b((Context) this).a().k();
            b();
            a();
            a((Intent) getIntent().getExtras().getParcelable(a.f45260a));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            v vVar = this.f45258a;
            if (vVar != null) {
                vVar.j(e10.toString());
            }
            a(D5.INLINE_STORE_ACTIVITY_FAILED, (Map<String, Object>) null);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        v vVar = this.f45258a;
        if (vVar != null) {
            vVar.a(true, "inlineStoreClose");
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra(a.f45261b)) {
            IronLog.INTERNAL.verbose("onNewIntent() - destroy inline store request detected");
            this.f45259b = true;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        v vVar = this.f45258a;
        if (vVar != null) {
            vVar.a(false, "inlineStoreOpen");
        }
    }

    private void a(final D5 d10, final Map<String, Object> map) {
        new Thread(new Runnable() { // from class: com.unity3d.ironsourceads.internal.services.c
            @Override // java.lang.Runnable
            public final void run() {
                InlineStoreActivity.a(map, d10);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Map map, D5 d10) {
        try {
            HashMap map2 = map != null ? new HashMap(map) : new HashMap();
            String str = "strategy:" + EnumC3592m9.APP_ACTIVITY.b();
            Object obj = map2.get(IronSourceConstants.EVENTS_EXT1);
            if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                map2.put(IronSourceConstants.EVENTS_EXT1, str + StringUtils.COMMA + obj);
            } else {
                map2.put(IronSourceConstants.EVENTS_EXT1, str);
            }
            Lb.U().q().a(new C5(d10, new JSONObject(map2)));
        } catch (Exception e10) {
            C3676r4.d().a(e10);
        }
    }
}
