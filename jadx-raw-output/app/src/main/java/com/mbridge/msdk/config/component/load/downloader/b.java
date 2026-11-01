package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.foundation.tools.q0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DownloadMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f33244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, Object> f33247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f33248e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f33249f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f33250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f33251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f33253j;

    public void a(String str, Object obj) {
        if (this.f33247d == null) {
            this.f33247d = new HashMap(4);
        }
        this.f33247d.put(str, obj);
    }

    public b(T t10, String str, String str2, int i10) {
        this.f33244a = t10;
        this.f33250g = str2;
        this.f33245b = i10;
        try {
            URL url = new URL(str);
            this.f33246c = url.getProtocol() + "://" + url.getHost() + url.getPath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("resourceUrl: ");
            sb2.append(this.f33246c);
            q0.a("DownloadMessage", sb2.toString());
        } catch (MalformedURLException e10) {
            q0.b("DownloadMessage", e10.getMessage(), e10);
        }
    }

    public float b() {
        return this.f33253j;
    }

    public int c() {
        return this.f33245b;
    }

    public String d() {
        return this.f33246c;
    }

    public String e() {
        return this.f33250g;
    }

    public String f() {
        return this.f33249f;
    }

    public boolean g() {
        return this.f33251h;
    }

    public void a(String str) {
        this.f33249f = str;
    }

    public void a(boolean z10) {
        this.f33251h = z10;
    }

    public long a() {
        return this.f33252i;
    }

    public void a(long j10) {
        this.f33252i = j10;
    }

    public void a(float f10) {
        this.f33253j = f10;
    }
}
