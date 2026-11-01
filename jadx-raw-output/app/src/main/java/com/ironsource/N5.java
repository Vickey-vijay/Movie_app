package com.ironsource;

import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class N5 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f27088e = "Content-Type";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f27089f = "application/json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private G7 f27090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f27091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<C5> f27093d;

    @Override // java.lang.Runnable
    public void run() {
        G7.a aVarA;
        G7.a aVar = new G7.a(this.f27093d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            Gd gdB = C3484g8.b(this.f27092c, this.f27091b, arrayList);
            aVarA = aVar.a(gdB.a()).a(gdB.f26675a);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e10.getLocalizedMessage());
            aVarA = aVar.a(e10 instanceof Fc).a(e10);
        }
        G7 g10 = this.f27090a;
        if (g10 != null) {
            g10.a(aVarA);
        }
    }

    public N5(G7 g10, String str, String str2, ArrayList<C5> arrayList) {
        this.f27090a = g10;
        this.f27091b = str;
        this.f27092c = str2;
        this.f27093d = arrayList;
    }
}
