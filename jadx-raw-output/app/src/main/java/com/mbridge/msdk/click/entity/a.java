package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ClickResponseHeader.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f32811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f32812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f32815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f32816h;

    public String a() {
        return "statusCode=" + this.f32814f + ", location=" + this.f32809a + ", contentType=" + this.f32810b + ", contentLength=" + this.f32813e + ", contentEncoding=" + this.f32811c + ", referer=" + this.f32812d;
    }

    @NonNull
    public String toString() {
        return "ClickResponseHeader{location='" + this.f32809a + "', contentType='" + this.f32810b + "', contentEncoding='" + this.f32811c + "', referer='" + this.f32812d + "', contentLength=" + this.f32813e + ", statusCode=" + this.f32814f + ", url='" + this.f32815g + "', exception='" + this.f32816h + "'}";
    }
}
