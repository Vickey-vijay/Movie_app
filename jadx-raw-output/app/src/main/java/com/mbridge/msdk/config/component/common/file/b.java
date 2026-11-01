package com.mbridge.msdk.config.component.common.file;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: FileDescription.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f33071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f33072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33073f;

    public String a() {
        return this.f33070c + this.f33068a;
    }

    public void b(String str) {
        this.f33068a = str;
    }

    public void c(String str) {
        this.f33069b = str;
    }

    public String d() {
        return this.f33072e;
    }

    public void e(String str) {
        this.f33072e = str;
    }

    public void a(String str) {
        this.f33070c = str;
    }

    public String b() {
        return this.f33069b;
    }

    public String c() {
        return this.f33071d;
    }

    public void d(String str) {
        this.f33071d = str;
    }

    public boolean e() {
        return this.f33073f;
    }

    @NonNull
    public String toString() {
        return "FileDescription{fileName='" + this.f33068a + "', fileType='" + this.f33069b + "', dirPath='" + this.f33070c + "', unZipDirPath='" + this.f33071d + "', unZipFilePath='" + this.f33072e + "', fileExists=" + this.f33073f + '}';
    }

    public void a(boolean z10) {
        this.f33073f = z10;
    }
}
