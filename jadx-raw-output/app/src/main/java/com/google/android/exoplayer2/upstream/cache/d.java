package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import e5.h;
import java.io.IOException;

/* JADX INFO: compiled from: CacheUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f5.d f20151a = new f5.d() { // from class: f5.f
        @Override // f5.d
        public final String a(e5.h hVar) {
            return com.google.android.exoplayer2.upstream.cache.d.d(hVar);
        }
    };

    public static boolean c(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String d(h hVar) {
        String str = hVar.f52381h;
        return str != null ? str : b(hVar.f52374a);
    }

    public static String b(Uri uri) {
        return uri.toString();
    }
}
