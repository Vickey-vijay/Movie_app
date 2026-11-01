package wm;

import java.util.Arrays;

/* JADX INFO: compiled from: ServletMapping.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f74159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f74160b;

    public void c(String str) {
        this.f74159a = new String[]{str};
    }

    public String[] a() {
        return this.f74159a;
    }

    public String b() {
        return this.f74160b;
    }

    public void d(String str) {
        this.f74160b = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = this.f74159a;
        sb2.append(strArr == null ? "[]" : Arrays.asList(strArr).toString());
        sb2.append("=>");
        sb2.append(this.f74160b);
        return sb2.toString();
    }
}
