package yads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ea2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iw3 f77000a = new iw3();

    public static void a(Context context) {
        iw3 iw3Var = f77000a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Application Context cannot be null");
        }
        if (iw3Var.f78844a) {
            return;
        }
        iw3Var.f78844a = true;
        jx3 jx3VarA = jx3.a();
        jx3VarA.f79234c.getClass();
        ov3 ov3Var = new ov3();
        ax3 ax3Var = jx3VarA.f79233b;
        Handler handler = new Handler();
        ax3Var.getClass();
        jx3VarA.f79235d = new vw3(handler, applicationContext, ov3Var, jx3VarA);
        bw3.f75999d.a(applicationContext);
        sv3.a(applicationContext);
        WindowManager windowManager = lw3.f79952a;
        lw3.f79954c = applicationContext.getResources().getDisplayMetrics().density;
        lw3.f79952a = (WindowManager) applicationContext.getSystemService("window");
        applicationContext.registerReceiver(new ww3(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        fx3.f77541b.f77542a = applicationContext.getApplicationContext();
        pv3 pv3Var = pv3.f81620f;
        if (!pv3Var.f81623c) {
            pv3Var.f81624d.a(applicationContext);
            rw3 rw3Var = pv3Var.f81624d;
            rw3Var.f82449c = pv3Var;
            rw3Var.b();
            pv3Var.f81625e = pv3Var.f81624d.f82448b;
            pv3Var.f81623c = true;
        }
        lx3.f79987d.f79988a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new kx3(), intentFilter);
    }
}
