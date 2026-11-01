package com.iab.omid.library.bigosg.b;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static b f21236a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f21238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f21241f;

    public interface a {
        void a(boolean z10);
    }

    private b() {
    }

    public static b a() {
        return f21236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        if (this.f21240e != z10) {
            this.f21240e = z10;
            if (this.f21239d) {
                g();
                a aVar = this.f21241f;
                if (aVar != null) {
                    aVar.a(d());
                }
            }
        }
    }

    private void e() {
        this.f21238c = new BroadcastReceiver() { // from class: com.iab.omid.library.bigosg.b.b.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent == null) {
                    return;
                }
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    b.this.a(true);
                    return;
                }
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    b.this.a(false);
                } else {
                    if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return;
                    }
                    b.this.a(false);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f21237b.registerReceiver(this.f21238c, intentFilter);
    }

    private void f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f21237b;
        if (context == null || (broadcastReceiver = this.f21238c) == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
        this.f21238c = null;
    }

    private void g() {
        boolean z10 = !this.f21240e;
        Iterator<com.iab.omid.library.bigosg.adsession.a> it = com.iab.omid.library.bigosg.b.a.a().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    public void a(@NonNull Context context) {
        this.f21237b = context.getApplicationContext();
    }

    public void a(a aVar) {
        this.f21241f = aVar;
    }

    public void b() {
        e();
        this.f21239d = true;
        g();
    }

    public void c() {
        f();
        this.f21239d = false;
        this.f21240e = false;
        this.f21241f = null;
    }

    public boolean d() {
        return !this.f21240e;
    }
}
