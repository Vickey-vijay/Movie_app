package com.mbridge.msdk.foundation.same.net.exception;

/* JADX INFO: compiled from: CommonError.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f34993c;

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f34991a = i10;
        this.f34993c = aVar;
    }

    public a(int i10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar, String str) {
        this.f34991a = i10;
        this.f34993c = aVar;
        this.f34992b = str;
    }
}
