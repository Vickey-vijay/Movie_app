package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;

/* JADX INFO: renamed from: com.inmobi.media.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2772c5 extends CustomTabsServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2823e5 f24113a;

    public C2772c5(C2823e5 c2823e5) {
        this.f24113a = c2823e5;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        ck.p.j(componentName, "name");
        this.f24113a.f24292a = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        int iA;
        Ya ya2;
        Rh rh2;
        ck.p.j(componentName, "name");
        ck.p.j(customTabsClient, "client");
        C2823e5 c2823e5 = this.f24113a;
        c2823e5.f24292a = customTabsClient;
        R2 r10 = c2823e5.f24294c;
        if (r10 != null) {
            try {
                C2823e5 c2823e6 = r10.f23425e;
                CustomTabsSession customTabsSessionNewSession = c2823e6.f24295d;
                if (customTabsSessionNewSession == null) {
                    CustomTabsClient customTabsClient2 = c2823e6.f24292a;
                    customTabsSessionNewSession = customTabsClient2 != null ? customTabsClient2.newSession(new C2798d5(c2823e6)) : null;
                    c2823e6.f24295d = customTabsSessionNewSession;
                }
                if (customTabsSessionNewSession != null) {
                    Bundle bundle = Bundle.EMPTY;
                    if (customTabsSessionNewSession.isEngagementSignalsApiAvailable(bundle)) {
                        customTabsSessionNewSession.setEngagementSignalsCallback(new Q2(r10), bundle);
                    }
                }
            } catch (RemoteException | Error unused) {
            }
            try {
                try {
                    Uri uri = Uri.parse(r10.f23421a);
                    ck.p.i(uri, "Uri.parse(this)");
                    r10.a(uri);
                } catch (Exception unused2) {
                    iA = 9;
                    ya2 = r10.f23423c;
                    if (ya2 != null) {
                        ya2.f23836f = "EX_NATIVE";
                    }
                    if (iA != 0 || iA == 1) {
                        rh2 = (Rh) r10.f23429i.get();
                        if (rh2 != null) {
                            J2.a(rh2, Na.LPStartSuccess, r10.f23423c);
                        }
                    }
                    Rh rh3 = (Rh) r10.f23429i.get();
                    if (rh3 != null) {
                        Na na2 = Na.LPBrowserOpenFailed;
                        Ya ya3 = r10.f23423c;
                        Integer numValueOf = Integer.valueOf(iA);
                        ck.p.j(na2, "landingPageFunnelState");
                        rh3.f23466a.getLandingPageHandler().a(na2, ya3, numValueOf);
                    }
                }
            } catch (Throwable unused3) {
                Context context = r10.f23426f;
                String str = r10.f23421a;
                Object obj = r10.f23430j.get();
                ck.p.g(obj);
                iA = AbstractC3296x3.a(context, str, (InterfaceC3061nh) obj, r10.f23424d);
                ya2 = r10.f23423c;
                if (ya2 != null) {
                    ya2.f23836f = "EX_NATIVE";
                }
                if (iA != 0) {
                }
                rh2 = (Rh) r10.f23429i.get();
                if (rh2 != null) {
                    J2.a(rh2, Na.LPStartSuccess, r10.f23423c);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        C2823e5 c2823e5 = this.f24113a;
        c2823e5.f24292a = null;
        R2 r10 = c2823e5.f24294c;
        if (r10 != null) {
            Ya ya2 = r10.f23423c;
            if (ya2 != null) {
                ya2.f23836f = "IN_NATIVE";
            }
            Rh rh2 = (Rh) r10.f23429i.get();
            if (rh2 != null) {
                Na na2 = Na.LPBrowserOpenFailed;
                Ya ya3 = r10.f23423c;
                ck.p.j(na2, "landingPageFunnelState");
                rh2.f23466a.getLandingPageHandler().a(na2, ya3, (Integer) 8009);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ck.p.j(componentName, "name");
        this.f24113a.f24292a = null;
    }
}
