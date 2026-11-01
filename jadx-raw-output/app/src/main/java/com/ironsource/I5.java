package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class I5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f26797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private J7 f26798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f26800f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f26801a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private J7 f26804d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26802b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f26803c = "POST";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f26805e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ArrayList<Pair<String, String>> f26806f = new ArrayList<>();

        public a a(J7 j10) {
            this.f26804d = j10;
            return this;
        }

        public a b(boolean z10) {
            this.f26802b = z10;
            return this;
        }

        public a c() {
            this.f26803c = "POST";
            return this;
        }

        public a a(Pair<String, String> pair) {
            this.f26806f.add(pair);
            return this;
        }

        public a b() {
            this.f26803c = "GET";
            return this;
        }

        public a(String str) {
            this.f26801a = "";
            if (str != null && !str.isEmpty()) {
                this.f26801a = str;
            }
        }

        public a a(List<Pair<String, String>> list) {
            this.f26806f.addAll(list);
            return this;
        }

        public a a(boolean z10) {
            this.f26805e = z10;
            return this;
        }

        public I5 a() {
            return new I5(this);
        }
    }

    public boolean a() {
        return this.f26796b;
    }

    public String b() {
        return this.f26795a;
    }

    public J7 c() {
        return this.f26798d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f26800f);
    }

    public String e() {
        return this.f26797c;
    }

    public boolean f() {
        return this.f26799e;
    }

    public I5(a aVar) {
        this.f26799e = false;
        this.f26795a = aVar.f26801a;
        this.f26796b = aVar.f26802b;
        this.f26797c = aVar.f26803c;
        this.f26798d = aVar.f26804d;
        this.f26799e = aVar.f26805e;
        if (aVar.f26806f != null) {
            this.f26800f = new ArrayList<>(aVar.f26806f);
        }
    }
}
