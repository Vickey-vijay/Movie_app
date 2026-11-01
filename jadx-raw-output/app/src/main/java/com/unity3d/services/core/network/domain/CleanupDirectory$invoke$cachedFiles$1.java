package com.unity3d.services.core.network.domain;

import bk.l;
import ck.p;
import com.ironsource.D8;
import java.io.File;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: CleanupDirectory.kt */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class CleanupDirectory$invoke$cachedFiles$1 extends FunctionReferenceImpl implements l<File, Boolean> {
    public static final CleanupDirectory$invoke$cachedFiles$1 INSTANCE = new CleanupDirectory$invoke$cachedFiles$1();

    public CleanupDirectory$invoke$cachedFiles$1() {
        super(1, File.class, D8.f26327d, "isFile()Z", 0);
    }

    @Override // bk.l
    public final Boolean invoke(File file) {
        p.j(file, "p0");
        return Boolean.valueOf(file.isFile());
    }
}
