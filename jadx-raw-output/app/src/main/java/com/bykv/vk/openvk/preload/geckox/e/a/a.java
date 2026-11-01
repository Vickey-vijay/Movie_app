package com.bykv.vk.openvk.preload.geckox.e.a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: FileLoader.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f10654a;

    public abstract InputStream a(File file, String str) throws IOException;

    public abstract boolean b(File file, String str) throws IOException;

    public final InputStream a(String str) throws IOException {
        return a(this.f10654a, str);
    }

    public final boolean b(String str) throws IOException {
        return b(this.f10654a, str);
    }

    public a(File file) {
        this.f10654a = file;
    }
}
