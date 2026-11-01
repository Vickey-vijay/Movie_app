package com.mgs.carparking.shorttk;

import java.util.List;

/* JADX INFO: compiled from: FormatData.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f41724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<C0421a> f41725b;

    /* JADX INFO: renamed from: com.mgs.carparking.shorttk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FormatData.java */
    public static class C0421a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f41728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public LinkType f41729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f41730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f41731f;

        public C0421a(int i10, int i11, String str, LinkType linkType) {
            this.f41726a = i10;
            this.f41727b = i11;
            this.f41728c = str;
            this.f41729d = linkType;
        }

        public int a() {
            return this.f41727b;
        }

        public String b() {
            return this.f41730e;
        }

        public String c() {
            return this.f41731f;
        }

        public int d() {
            return this.f41726a;
        }

        public String e() {
            return this.f41728c;
        }

        public LinkType getType() {
            return this.f41729d;
        }

        public C0421a(int i10, int i11, String str, String str2, LinkType linkType) {
            this.f41726a = i10;
            this.f41727b = i11;
            this.f41730e = str;
            this.f41731f = str2;
            this.f41729d = linkType;
        }
    }

    public String a() {
        return this.f41724a;
    }

    public List<C0421a> b() {
        return this.f41725b;
    }

    public void c(String str) {
        this.f41724a = str;
    }

    public void d(List<C0421a> list) {
        this.f41725b = list;
    }
}
