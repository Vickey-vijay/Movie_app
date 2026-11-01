package un;

import java.net.URI;

/* JADX INFO: compiled from: ModelDetails.java */
/* JADX INFO: loaded from: classes11.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f72957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f72958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public URI f72960d;

    public h() {
    }

    public h(String str, String str2, String str3, URI uri) {
        this.f72957a = str;
        this.f72958b = str2;
        this.f72959c = str3;
        this.f72960d = uri;
    }

    public String a() {
        return this.f72958b;
    }

    public String b() {
        return this.f72957a;
    }

    public String c() {
        return this.f72959c;
    }

    public URI d() {
        return this.f72960d;
    }

    public h(String str, String str2, String str3, String str4) throws IllegalArgumentException {
        this.f72957a = str;
        this.f72958b = str2;
        this.f72959c = str3;
        this.f72960d = URI.create(str4);
    }
}
