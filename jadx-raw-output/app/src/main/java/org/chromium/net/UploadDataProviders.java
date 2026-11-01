package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadDataProviders {

    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f65480a;

        public a(File file) {
            this.f65480a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel h() throws IOException {
            return new FileInputStream(this.f65480a).getChannel();
        }
    }

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f65481a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f65481a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel h() throws IOException {
            if (this.f65481a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f65481a).getChannel();
            }
            this.f65481a.close();
            throw new IllegalArgumentException("Not a file: " + this.f65481a);
        }
    }

    public static final class c extends UploadDataProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f65482b;

        public /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        public c(ByteBuffer byteBuffer) {
            this.f65482b = byteBuffer;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.f65482b.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.f65482b.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() >= this.f65482b.remaining()) {
                    byteBuffer.put(this.f65482b);
                } else {
                    int iLimit = this.f65482b.limit();
                    ByteBuffer byteBuffer2 = this.f65482b;
                    byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                    byteBuffer.put(this.f65482b);
                    this.f65482b.limit(iLimit);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
    }

    public interface d {
        FileChannel h() throws IOException;
    }

    public static final class e extends UploadDataProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile FileChannel f65483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f65484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f65485d;

        public /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        public e(d dVar) {
            this.f65485d = new Object();
            this.f65484c = dVar;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.f65483b;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        public final FileChannel d() throws IOException {
            if (this.f65483b == null) {
                synchronized (this.f65485d) {
                    if (this.f65483b == null) {
                        this.f65483b = this.f65484c.h();
                    }
                }
            }
            return this.f65483b;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return d().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasRemaining()) {
                FileChannel fileChannelD = d();
                int i10 = 0;
                while (i10 == 0) {
                    int i11 = fileChannelD.read(byteBuffer);
                    if (i11 == -1) {
                        break;
                    } else {
                        i10 += i11;
                    }
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            d().position(0L);
            uploadDataSink.onRewindSucceeded();
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new c(ByteBuffer.wrap(bArr, i10, i11).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
