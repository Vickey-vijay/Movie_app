package io;

import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.support.model.WriteStatus;

/* JADX INFO: compiled from: DIDLObject.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f54303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f54304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f54305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f54306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WriteStatus f54307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0490a f54308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<e> f54309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Object> f54310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<Object> f54311j;

    /* JADX INFO: renamed from: io.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DIDLObject.java */
    public static class C0490a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f54312a;

        public String a() {
            return this.f54312a;
        }

        public C0490a(String str) {
            this.f54312a = str;
        }
    }

    public a() {
        this.f54306e = true;
        this.f54309h = new ArrayList();
        this.f54310i = new ArrayList();
        this.f54311j = new ArrayList();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f54302a.equals(((a) obj).f54302a);
    }

    public C0490a a() {
        return this.f54308g;
    }

    public List<e> getResources() {
        return this.f54309h;
    }

    public int hashCode() {
        return this.f54302a.hashCode();
    }

    public a(String str, String str2, String str3, String str4, boolean z10, WriteStatus writeStatus, C0490a c0490a, List<e> list, List<Object> list2, List<Object> list3) {
        this.f54306e = true;
        this.f54309h = new ArrayList();
        this.f54310i = new ArrayList();
        new ArrayList();
        this.f54302a = str;
        this.f54303b = str2;
        this.f54304c = str3;
        this.f54305d = str4;
        this.f54306e = z10;
        this.f54307f = writeStatus;
        this.f54308g = c0490a;
        this.f54309h = list;
        this.f54310i = list2;
        this.f54311j = list3;
    }
}
