package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: CachePolicy.java */
/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f10557a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f10559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f10560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f10561e;

    public abstract void a();

    static {
        new f();
        f10558b = new e();
    }

    public void a(a aVar, File file, List<String> list) {
        this.f10559c = aVar;
        this.f10560d = file;
        this.f10561e = list;
    }
}
