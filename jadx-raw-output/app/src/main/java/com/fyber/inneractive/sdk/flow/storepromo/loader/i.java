package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15636a = b("app_screen_%d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15637b = "document.getElementById(\"app_screen_%d\").src = app_screen_%d;\n";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f15638c = b("app_video_url_%d");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f15639d = "document.getElementById(\"app_video_url_%d\").src = app_video_url_%d;\n";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f15640e = b("app_icon");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f15641f = "document.getElementById(\"app_icon\").src = app_icon;\n";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f15642g = b("app_name");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f15643h = a("app_name");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f15644i = b("app_pub_name");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f15645j = a("app_pub_name");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f15646k = b("app_label");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f15647l = a("app_label");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f15648m = b(CampaignEx.JSON_KEY_APP_SIZE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f15649n = a(CampaignEx.JSON_KEY_APP_SIZE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f15650o = b("app_rating");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f15651p = a("app_rating");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f15652q = b("app_rating_icon");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f15653r = "document.getElementById(\"app_rating_icon\").src = app_rating_icon;\n";

    public static String a(String str) {
        return "document.getElementById(\"" + str + "\").innerHTML = `${" + str + "}`;\n";
    }

    public static String a(boolean z10, String str) {
        StringBuilder sb2 = new StringBuilder("document.getElementById(\"");
        sb2.append(str);
        sb2.append("\").style.display = ");
        sb2.append(z10 ? "'block'" : "'none'");
        sb2.append(";\n");
        return sb2.toString();
    }

    public static String b(String str) {
        return "var " + str + " = `%s`;\n";
    }
}
