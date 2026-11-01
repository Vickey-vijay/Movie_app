package com.mbridge.msdk.mbsignalcommon.windvane;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: compiled from: MimeTypeEnum.java */
/* JADX INFO: loaded from: classes11.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML(CreativeInfo.f44315al, "text/html");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f36128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36129b;

    public String d() {
        return this.f36129b;
    }

    public String g() {
        return this.f36128a;
    }

    d(String str, String str2) {
        this.f36128a = str;
        this.f36129b = str2;
    }
}
