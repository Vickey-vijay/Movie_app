package com.bytedance.sdk.openadsdk.vt;

import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ra;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ouw {
    public boolean ouw = false;
    private final ExecutorService vt = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.vt.ouw$ouw, reason: collision with other inner class name */
    public class CallableC0156ouw implements Callable<Void> {
        private final File vt;

        public /* synthetic */ CallableC0156ouw(ouw ouwVar, File file, byte b10) {
            this(file);
        }

        private CallableC0156ouw(File file) {
            this.vt = file;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Void call() throws Exception {
            ouw.ouw(ouw.this, this.vt);
            return null;
        }
    }

    public final void ouw(File file) throws IOException {
        this.vt.submit(new CallableC0156ouw(this, file, (byte) 0));
    }

    public abstract void ouw(List<File> list);

    public abstract boolean ouw(int i10);

    public abstract boolean vt(int i10);

    public static /* synthetic */ void ouw(ouw ouwVar, File file) throws IOException {
        if (ouwVar.ouw) {
            List<File> listOuw = ra.ouw(file);
            ko.ouw("LruDiskFile", "touchInBackground", listOuw.toString());
            ouwVar.ouw(listOuw);
        } else {
            try {
                ra.vt(file);
            } catch (Throwable th2) {
                ko.ouw("LruDiskFile", "setLastModifiedNowError", th2);
            }
            ouwVar.ouw(ra.ouw(file.getParentFile()));
        }
    }

    public static long vt(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
