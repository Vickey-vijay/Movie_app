package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C3524ic implements InterfaceC3747v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29155a = C3524ic.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29156b = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3764w7 f29157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f29158d;

    /* JADX INFO: renamed from: com.ironsource.ic$a */
    public class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f29159a;

        public a(Context context) {
            this.f29159a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C3524ic.this.f29157c.a(C3372a4.a(network, this.f29159a), C3372a4.a(this.f29159a, network));
                return;
            }
            InterfaceC3764w7 interfaceC3764w7 = C3524ic.this.f29157c;
            String strB = C3372a4.b(this.f29159a);
            Context context = this.f29159a;
            interfaceC3764w7.a(strB, C3372a4.a(context, C3372a4.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C3524ic.this.f29157c.b(C3372a4.a(network, this.f29159a), C3372a4.a(this.f29159a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C3524ic.this.f29157c.b(C3372a4.a(network, this.f29159a), C3372a4.a(this.f29159a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (C3372a4.b(this.f29159a).equals("none")) {
                C3524ic.this.f29157c.a();
            }
        }
    }

    @Override // com.ironsource.InterfaceC3747v7
    @SuppressLint({"NewApi"})
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f29156b || this.f29158d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f29158d);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            Log.e(this.f29155a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC3747v7
    @SuppressLint({"NewApi", "MissingPermission"})
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f29156b) {
            a(context);
            if (C3372a4.b(context).equals("none")) {
                this.f29157c.a();
            }
            if (this.f29158d == null) {
                this.f29158d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.f29158d);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                Log.e(this.f29155a, "NetworkCallback was not able to register");
            }
        }
    }

    public C3524ic(InterfaceC3764w7 interfaceC3764w7) {
        this.f29157c = interfaceC3764w7;
    }

    @Override // com.ironsource.InterfaceC3747v7
    public JSONObject c(Context context) {
        return C3372a4.a(context, C3372a4.a(context));
    }

    @Override // com.ironsource.InterfaceC3747v7
    public void a() {
        this.f29158d = null;
    }
}
