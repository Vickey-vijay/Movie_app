package com.applovin.impl;

import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class u5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f9682g;

    public class a extends l6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, String str2, int i10) {
            if (TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "No developer URI found - response from the Play Store is empty");
                }
                u5.this.f9682g.a(b0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            Matcher matcher = Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                u5.this.f9682g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            String strGroup = matcher.group();
            if (!URLUtil.isValidUrl(strGroup)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "Developer URI (" + strGroup + ") is not valid");
                }
                u5.this.f9682g.a(b0.b.INVALID_DEVELOPER_URI);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Found developer URI: " + strGroup);
            }
            u5.this.f9682g.a(strGroup);
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, String str3) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i10);
            }
            u5.this.f9682g.a(b0.b.APP_DETAILS_NOT_FOUND);
        }
    }

    public interface b {
        void a(b0.b bVar);

        void a(String str);
    }

    public u5(com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchDeveloperUri", kVar);
        this.f9682g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strValueOf = String.valueOf(this.f7705a.A().G().get("package_name"));
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Looking up developer URI for package name: " + strValueOf);
        }
        this.f7705a.q0().a(new a(com.applovin.impl.sdk.network.a.a(this.f7705a).c("GET").b("https://play.google.com/store/apps/details?id=" + strValueOf).a((Object) "").a(false).a(), this.f7705a));
    }
}
