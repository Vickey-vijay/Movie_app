package com.bykv.vk.openvk.ouw.ouw.vt.ouw;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.lh;
import com.bykv.vk.openvk.ouw.ouw.vt.ouw.ouw.vt;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw extends MediaDataSource {
    public static final ConcurrentHashMap<String, ouw> ouw = new ConcurrentHashMap<>();
    private final Context fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final lh f10486lh;
    public final com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh vt;
    private long yu = -2147483648L;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("SdkMediaDataSource", "close: ", this.vt.pno());
        lh lhVar = this.f10486lh;
        if (lhVar != null) {
            lhVar.ouw();
        }
        ouw.remove(this.vt.bly());
    }

    public static ouw ouw(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        ouw ouwVar = new ouw(context, lhVar);
        ouw.put(lhVar.bly(), ouwVar);
        return ouwVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() throws IOException {
        if (this.yu == -2147483648L) {
            if (this.fkw == null || TextUtils.isEmpty(this.vt.pno())) {
                return -1L;
            }
            this.yu = this.f10486lh.vt();
            com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("SdkMediaDataSource", "getSize: " + this.yu);
        }
        return this.yu;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
        int iOuw = this.f10486lh.ouw(j10, bArr, i10, i11);
        com.bykv.vk.openvk.ouw.ouw.ouw.ra.lh.vt("SdkMediaDataSource", "readAt: position = ", Long.valueOf(j10), "  buffer.length =", Integer.valueOf(bArr.length), "  offset = ", Integer.valueOf(i10), " size =", Integer.valueOf(iOuw));
        return iOuw;
    }

    private ouw(Context context, com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar) {
        this.fkw = context;
        this.vt = lhVar;
        this.f10486lh = new vt(lhVar);
    }
}
