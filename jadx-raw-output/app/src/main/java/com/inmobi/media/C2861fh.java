package com.inmobi.media;

import android.content.Context;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.inmobi.media.C2861fh;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2861fh implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2961jh f24378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bk.l f24379b;

    public static final void a(bk.l lVar, AbstractC2835eh abstractC2835eh) {
        lVar.invoke(abstractC2835eh);
    }

    public C2861fh(bk.l lVar, C2961jh c2961jh) {
        this.f24378a = c2961jh;
        this.f24379b = lVar;
    }

    public static final void a(bk.l lVar, C2961jh c2961jh) {
        c2961jh.getClass();
        lVar.invoke(new C2784ch("Billing Service Disconnected", -1));
    }

    public final void onBillingServiceDisconnected() {
        this.f24378a.getClass();
        final bk.l lVar = this.f24379b;
        final C2961jh c2961jh = this.f24378a;
        Runnable runnable = new Runnable() { // from class: b7.w6
            @Override // java.lang.Runnable
            public final void run() {
                C2861fh.a(lVar, c2961jh);
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        final AbstractC2835eh c2784ch;
        ck.p.j(billingResult, "billingResult");
        this.f24378a.getClass();
        Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            c2784ch = C2810dh.f24245a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            ck.p.i(debugMessage, "getDebugMessage(...)");
            c2784ch = new C2784ch(debugMessage, responseCode);
        }
        final bk.l lVar = this.f24379b;
        Runnable runnable = new Runnable() { // from class: b7.x6
            @Override // java.lang.Runnable
            public final void run() {
                C2861fh.a(lVar, c2784ch);
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }
}
