package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f17813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f17814b;

    public final FileInputStream a() {
        if (this.f17814b.exists()) {
            this.f17813a.delete();
            this.f17814b.renameTo(this.f17813a);
        }
        return new FileInputStream(this.f17813a);
    }

    public final b b() throws IOException {
        if (this.f17813a.exists()) {
            if (this.f17814b.exists()) {
                this.f17813a.delete();
            } else if (!this.f17813a.renameTo(this.f17814b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f17813a + " to backup file " + this.f17814b);
            }
        }
        try {
            return new b(this.f17813a);
        } catch (FileNotFoundException unused) {
            if (!this.f17813a.getParentFile().mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f17813a);
            }
            try {
                return new b(this.f17813a);
            } catch (FileNotFoundException unused2) {
                throw new IOException("Couldn't create " + this.f17813a);
            }
        }
    }

    public c(File file) {
        this.f17813a = file;
        this.f17814b = new File(file.getPath() + ".bak");
    }
}
