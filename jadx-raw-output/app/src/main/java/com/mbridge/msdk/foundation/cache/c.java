package com.mbridge.msdk.foundation.cache;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: CandidateResult.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f34543i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f34544j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f34545k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f34546l = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f34547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34549c = 21;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34550d = f34544j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<String> f34551e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<String> f34552f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f34553g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f34554h = new ArrayList();

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f34547a = copyOnWriteArrayList;
    }

    public String b() {
        List<String> list = this.f34554h;
        return list == null ? "" : list.toString();
    }

    public CopyOnWriteArrayList<CampaignEx> c() {
        return this.f34547a;
    }

    public String d() {
        List<String> list = this.f34553g;
        return list == null ? "" : list.toString();
    }

    public String a() {
        ArrayList<String> arrayList = this.f34551e;
        return arrayList == null ? "" : arrayList.toString();
    }

    public void c(String str) {
        try {
            List<String> list = this.f34552f;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String e() {
        return this.f34548b;
    }

    public String f() {
        List<String> list = this.f34552f;
        return list == null ? "" : list.toString();
    }

    public int g() {
        return this.f34550d;
    }

    public void b(String str) {
        try {
            List<String> list = this.f34553g;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void d(String str) {
        this.f34548b = str;
    }

    public void a(String str) {
        try {
            ArrayList<String> arrayList = this.f34551e;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f34550d = i10;
    }
}
