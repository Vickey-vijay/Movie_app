package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes8.dex */
public final class RawResourceDataSource implements DataSource {
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private InputStream inputStream;
    private final TransferListener<? super RawResourceDataSource> listener;
    private boolean opened;
    private final Resources resources;
    private Uri uri;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        this(context, null);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003d */
    /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        /*
            r4 = this;
            r0 = 0
            r4.uri = r0
            r1 = 0
            java.io.InputStream r2 = r4.inputStream     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
        Lb:
            r4.inputStream = r0
            android.content.res.AssetFileDescriptor r2 = r4.assetFileDescriptor     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
        L14:
            r4.assetFileDescriptor = r0
            boolean r0 = r4.opened
            if (r0 == 0) goto L23
            r4.opened = r1
            com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener<? super com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource> r0 = r4.listener
            if (r0 == 0) goto L23
            r0.onTransferEnd(r4)
        L23:
            return
        L24:
            r2 = move-exception
            goto L2d
        L26:
            r2 = move-exception
            com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r3 = new com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L24
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L2d:
            r4.assetFileDescriptor = r0
            boolean r0 = r4.opened
            if (r0 == 0) goto L3c
            r4.opened = r1
            com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener<? super com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource> r0 = r4.listener
            if (r0 == 0) goto L3c
            r0.onTransferEnd(r4)
        L3c:
            throw r2
        L3d:
            r2 = move-exception
            goto L46
        L3f:
            r2 = move-exception
            com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r3 = new com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L46:
            r4.inputStream = r0
            android.content.res.AssetFileDescriptor r3 = r4.assetFileDescriptor     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
            if (r3 == 0) goto L4f
            r3.close()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
        L4f:
            r4.assetFileDescriptor = r0
            boolean r0 = r4.opened
            if (r0 == 0) goto L5e
            r4.opened = r1
            com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener<? super com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource> r0 = r4.listener
            if (r0 == 0) goto L5e
            r0.onTransferEnd(r4)
        L5e:
            throw r2
        L5f:
            r2 = move-exception
            goto L68
        L61:
            r2 = move-exception
            com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r3 = new com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L68:
            r4.assetFileDescriptor = r0
            boolean r0 = r4.opened
            if (r0 == 0) goto L77
            r4.opened = r1
            com.mbridge.msdk.playercommon.exoplayer2.upstream.TransferListener<? super com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource> r0 = r4.listener
            if (r0 == 0) goto L77
            r0.onTransferEnd(r4)
        L77:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource.close():void");
    }

    public RawResourceDataSource(Context context, TransferListener<? super RawResourceDataSource> transferListener) {
        this.resources = context.getResources();
        this.listener = transferListener;
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        try {
            Uri uri = dataSpec.uri;
            this.uri = uri;
            if (!TextUtils.equals("rawresource", uri.getScheme())) {
                throw new RawResourceDataSourceException("URI must use scheme rawresource");
            }
            try {
                this.assetFileDescriptor = this.resources.openRawResourceFd(Integer.parseInt(this.uri.getLastPathSegment()));
                FileInputStream fileInputStream = new FileInputStream(this.assetFileDescriptor.getFileDescriptor());
                this.inputStream = fileInputStream;
                fileInputStream.skip(this.assetFileDescriptor.getStartOffset());
                if (this.inputStream.skip(dataSpec.position) < dataSpec.position) {
                    throw new EOFException();
                }
                long j10 = dataSpec.length;
                long j11 = -1;
                if (j10 != -1) {
                    this.bytesRemaining = j10;
                } else {
                    long length = this.assetFileDescriptor.getLength();
                    if (length != -1) {
                        j11 = length - dataSpec.position;
                    }
                    this.bytesRemaining = j11;
                }
                this.opened = true;
                TransferListener<? super RawResourceDataSource> transferListener = this.listener;
                if (transferListener != null) {
                    transferListener.onTransferStart(this, dataSpec);
                }
                return this.bytesRemaining;
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.");
            }
        } catch (IOException e10) {
            throw new RawResourceDataSourceException(e10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.bytesRemaining;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(e10);
            }
        }
        int i12 = this.inputStream.read(bArr, i10, i11);
        if (i12 == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j11 = this.bytesRemaining;
        if (j11 != -1) {
            this.bytesRemaining = j11 - ((long) i12);
        }
        TransferListener<? super RawResourceDataSource> transferListener = this.listener;
        if (transferListener != null) {
            transferListener.onBytesTransferred(this, i12);
        }
        return i12;
    }
}
