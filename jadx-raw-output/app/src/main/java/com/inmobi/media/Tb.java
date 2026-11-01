package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Tb {
    public static final boolean a(String str, String str2, String str3) {
        ck.p.j(str, "tag");
        ck.p.j(str2, "data");
        ck.p.j(str3, com.ironsource.Y5.c.f27929c);
        try {
            a(str3);
            File file = new File(str3);
            file.createNewFile();
            FileOutputStream fileOutputStreamFileOutputStreamCtor = InMobiFilesBridge.fileOutputStreamCtor(file);
            byte[] bytes = str2.getBytes(lk.c.f63591b);
            ck.p.i(bytes, "getBytes(...)");
            fileOutputStreamFileOutputStreamCtor.write(bytes);
            fileOutputStreamFileOutputStreamCtor.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    public static final String b(String str) {
        ck.p.j(str, com.ironsource.Y5.c.f27929c);
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                return yj.g.k(file, null, 1, null);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static final void a(String str) {
        ck.p.j(str, com.ironsource.Y5.c.f27929c);
        File file = new File(str);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
