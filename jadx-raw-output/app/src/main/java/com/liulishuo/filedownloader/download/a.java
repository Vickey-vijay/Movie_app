package com.liulishuo.filedownloader.download;

import android.text.TextUtils;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w7.f;

/* JADX INFO: compiled from: ConnectTask.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileDownloadHeader f31814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.liulishuo.filedownloader.download.b f31815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f31816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, List<String>> f31817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<String> f31818g;

    /* JADX INFO: compiled from: ConnectTask.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f31819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f31820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f31821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public FileDownloadHeader f31822d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.liulishuo.filedownloader.download.b f31823e;

        public a a() {
            com.liulishuo.filedownloader.download.b bVar;
            Integer num = this.f31819a;
            if (num == null || (bVar = this.f31823e) == null || this.f31820b == null) {
                throw new IllegalArgumentException();
            }
            return new a(bVar, num.intValue(), this.f31820b, this.f31821c, this.f31822d);
        }

        public b b(com.liulishuo.filedownloader.download.b bVar) {
            this.f31823e = bVar;
            return this;
        }

        public b d(String str) {
            this.f31821c = str;
            return this;
        }

        public b e(FileDownloadHeader fileDownloadHeader) {
            this.f31822d = fileDownloadHeader;
            return this;
        }

        public b f(String str) {
            this.f31820b = str;
            return this;
        }

        public b c(int i10) {
            this.f31819a = Integer.valueOf(i10);
            return this;
        }
    }

    public a(com.liulishuo.filedownloader.download.b bVar, int i10, String str, String str2, FileDownloadHeader fileDownloadHeader) {
        this.f31812a = i10;
        this.f31813b = str;
        this.f31816e = str2;
        this.f31814c = fileDownloadHeader;
        this.f31815d = bVar;
    }

    public final void a(n7.b bVar) throws ProtocolException {
        if (bVar.f(this.f31816e, this.f31815d.f31824a)) {
            return;
        }
        if (!TextUtils.isEmpty(this.f31816e)) {
            bVar.c("If-Match", this.f31816e);
        }
        this.f31815d.a(bVar);
    }

    public final void b(n7.b bVar) {
        HashMap<String, List<String>> mapC;
        FileDownloadHeader fileDownloadHeader = this.f31814c;
        if (fileDownloadHeader == null || (mapC = fileDownloadHeader.c()) == null) {
            return;
        }
        if (w7.d.f73535a) {
            w7.d.h(this, "%d add outside header: %s", Integer.valueOf(this.f31812a), mapC);
        }
        for (Map.Entry<String, List<String>> entry : mapC.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    bVar.c(key, it.next());
                }
            }
        }
    }

    public final void d(n7.b bVar) {
        FileDownloadHeader fileDownloadHeader = this.f31814c;
        if (fileDownloadHeader == null || fileDownloadHeader.c().get("User-Agent") == null) {
            bVar.c("User-Agent", f.d());
        }
    }

    public String e() {
        List<String> list = this.f31818g;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> list2 = this.f31818g;
        return list2.get(list2.size() - 1);
    }

    public com.liulishuo.filedownloader.download.b f() {
        return this.f31815d;
    }

    public Map<String, List<String>> g() {
        return this.f31817f;
    }

    public boolean h() {
        return this.f31815d.f31825b > 0;
    }

    public void i(long j10) {
        com.liulishuo.filedownloader.download.b bVar = this.f31815d;
        long j11 = bVar.f31825b;
        if (j10 == j11) {
            w7.d.i(this, "no data download, no need to update", new Object[0]);
            return;
        }
        com.liulishuo.filedownloader.download.b bVarB = com.liulishuo.filedownloader.download.b.C0294b.b(bVar.f31824a, j10, bVar.f31826c, bVar.f31827d - (j10 - j11));
        this.f31815d = bVarB;
        if (w7.d.f73535a) {
            w7.d.e(this, "after update profile:%s", bVarB);
        }
    }

    public n7.b c() throws IllegalAccessException, IOException {
        n7.b bVarA = p7.a.j().a(this.f31813b);
        b(bVarA);
        a(bVarA);
        d(bVarA);
        this.f31817f = bVarA.d();
        if (w7.d.f73535a) {
            w7.d.a(this, "<---- %s request header %s", Integer.valueOf(this.f31812a), this.f31817f);
        }
        bVarA.execute();
        ArrayList arrayList = new ArrayList();
        this.f31818g = arrayList;
        n7.b bVarC = n7.d.c(this.f31817f, bVarA, arrayList);
        if (w7.d.f73535a) {
            w7.d.a(this, "----> %s response header %s", Integer.valueOf(this.f31812a), bVarC.e());
        }
        return bVarC;
    }
}
