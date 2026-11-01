package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class s5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f9031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f9033i;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "No app-ads.txt found");
                }
                s5.this.f9031g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f9033i);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.a(this.f7706b, "Found app-ads.txt");
                }
                s5.this.f9031g.a(str2, s5.this.f9033i);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to fetch app-ads.txt due to: " + str2 + ", and received error code: " + i10);
            }
            s5.this.f9031g.a(b0.b.APPADSTXT_NOT_FOUND, s5.this.f9033i);
        }
    }

    public interface b {
        void a(b0.b bVar, String str);

        void a(String str, String str2);
    }

    public s5(com.applovin.impl.sdk.k kVar, String str, b bVar) {
        super("TaskFetchAppAdsContent", kVar);
        this.f9032h = str;
        this.f9031g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList(Arrays.asList(Uri.parse(this.f9032h).getAuthority().split("\\.")));
        if (arrayList.size() > 0) {
            String str = (String) arrayList.get(0);
            if ("www".equals(str) || InneractiveMediationDefs.GENDER_MALE.equals(str)) {
                arrayList.remove(0);
            }
        }
        String strJoin = TextUtils.join(".", arrayList);
        Uri uriBuild = new Uri.Builder().scheme("https").authority(strJoin).appendPath("app-ads.txt").build();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f7705a).c("GET").b(uriBuild.toString()).a(new Uri.Builder().scheme("http").authority(strJoin).appendPath("app-ads.txt").build().toString()).a((Object) "").a(false).a();
        this.f9033i = uriBuild.toString();
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Looking up app-ads.txt at " + this.f9033i);
        }
        this.f7705a.q0().a(new a(aVarA, this.f7705a));
    }
}
