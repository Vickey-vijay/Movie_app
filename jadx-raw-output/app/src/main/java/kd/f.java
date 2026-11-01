package kd;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: ImageHeaderParser.java */
/* JADX INFO: loaded from: classes9.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f62764b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f62765c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f62766a;

    /* JADX INFO: compiled from: ImageHeaderParser.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f62767a;

        public short a(int i10) {
            return this.f62767a.getShort(i10);
        }

        public int b(int i10) {
            return this.f62767a.getInt(i10);
        }

        public int c() {
            return this.f62767a.remaining();
        }

        public void d(ByteOrder byteOrder) {
            this.f62767a.order(byteOrder);
        }

        public a(byte[] bArr, int i10) {
            this.f62767a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }
    }

    /* JADX INFO: compiled from: ImageHeaderParser.java */
    public interface b {
        int getUInt16() throws IOException;

        short getUInt8() throws IOException;

        int read(byte[] bArr, int i10) throws IOException;

        long skip(long j10) throws IOException;
    }

    /* JADX INFO: compiled from: ImageHeaderParser.java */
    public static class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f62768a;

        @Override // kd.f.b
        public int read(byte[] bArr, int i10) throws IOException {
            int i11 = i10;
            while (i11 > 0) {
                int i12 = this.f62768a.read(bArr, i10 - i11, i11);
                if (i12 == -1) {
                    break;
                }
                i11 -= i12;
            }
            return i10 - i11;
        }

        @Override // kd.f.b
        public int getUInt16() throws IOException {
            return ((this.f62768a.read() << 8) & 65280) | (this.f62768a.read() & 255);
        }

        @Override // kd.f.b
        public short getUInt8() throws IOException {
            return (short) (this.f62768a.read() & 255);
        }

        @Override // kd.f.b
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f62768a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f62768a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }

        public c(InputStream inputStream) {
            this.f62768a = inputStream;
        }
    }

    public static int a(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    public static boolean h(int i10) {
        return (i10 & DefaultImageHeaderParser.EXIF_MAGIC_NUMBER) == 65496 || i10 == 19789 || i10 == 18761;
    }

    public static int k(a aVar) {
        ByteOrder byteOrder;
        short sA = aVar.a(6);
        if (sA == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (sA == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.d(byteOrder);
        int iB = aVar.b(10) + 6;
        short sA2 = aVar.a(iB);
        for (int i10 = 0; i10 < sA2; i10++) {
            int iA = a(iB, i10);
            short sA3 = aVar.a(iA);
            if (sA3 == 274) {
                short sA4 = aVar.a(iA + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = aVar.b(iA + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got tagIndex=" + i10 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i11 = iB2 + f62765c[sA4];
                        if (i11 <= 4) {
                            int i12 = iA + 8;
                            if (i12 >= 0 && i12 <= aVar.c()) {
                                if (i11 >= 0 && i11 + i12 <= aVar.c()) {
                                    return aVar.a(i12);
                                }
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    Log.d("ImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                }
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) sA3));
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Got invalid format code = " + ((int) sA4));
                }
            }
        }
        return -1;
    }

    public final boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f62764b.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f62764b;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[SYNTHETIC] */
    @RequiresApi(21)
    public static void b(Context context, int i10, int i11, Uri uri, Uri uri2) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        InputStream inputStream = null;
        parcelFileDescriptorOpenFileDescriptor = null;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    ExifInterface exifInterface = new ExifInterface(inputStreamOpenInputStream);
                    parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri2, "rw");
                    f(exifInterface, new ExifInterface(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i10, i11);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e10) {
                            Log.d("ImageHeaderParser", e10.getMessage(), e10);
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e11) {
                    e = e11;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    inputStream = inputStreamOpenInputStream;
                    try {
                        Log.d("ImageHeaderParser", e.getMessage(), e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e12) {
                                Log.d("ImageHeaderParser", e12.getMessage(), e12);
                            }
                        }
                        if (parcelFileDescriptor == null) {
                        } else {
                            parcelFileDescriptor.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e13) {
                                Log.d("ImageHeaderParser", e13.getMessage(), e13);
                            }
                        }
                        if (parcelFileDescriptor != null) {
                            throw th;
                        }
                        try {
                            parcelFileDescriptor.close();
                            throw th;
                        } catch (IOException e14) {
                            Log.d("ImageHeaderParser", e14.getMessage(), e14);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                    inputStream = inputStreamOpenInputStream;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (parcelFileDescriptor != null) {
                        throw th;
                    }
                    parcelFileDescriptor.close();
                    throw th;
                }
            } catch (IOException e15) {
                Log.d("ImageHeaderParser", e15.getMessage(), e15);
            }
        } catch (IOException e16) {
            e = e16;
            parcelFileDescriptor = null;
        } catch (Throwable th4) {
            th = th4;
            parcelFileDescriptor = null;
        }
    }

    public static void c(Context context, int i10, int i11, Uri uri, String str) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        InputStream inputStreamOpenInputStream = null;
        try {
            try {
                try {
                    inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    f(new ExifInterface(inputStreamOpenInputStream), new ExifInterface(str), i10, i11);
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                } catch (IOException e10) {
                    Log.d("ImageHeaderParser", e10.getMessage(), e10);
                    if (inputStreamOpenInputStream == null) {
                    } else {
                        inputStreamOpenInputStream.close();
                    }
                }
            } catch (IOException e11) {
                Log.d("ImageHeaderParser", e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e12) {
                    Log.d("ImageHeaderParser", e12.getMessage(), e12);
                }
            }
            throw th2;
        }
    }

    @RequiresApi(21)
    public static void d(Context context, ExifInterface exifInterface, int i10, int i11, Uri uri) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    f(exifInterface, new ExifInterface(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), i10, i11);
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e10) {
                    Log.d("ImageHeaderParser", e10.getMessage());
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                    } else {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                }
            } catch (IOException e11) {
                Log.d("ImageHeaderParser", e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e12) {
                    Log.d("ImageHeaderParser", e12.getMessage(), e12);
                }
            }
            throw th2;
        }
    }

    public static void e(ExifInterface exifInterface, int i10, int i11, String str) throws Throwable {
        try {
            f(exifInterface, new ExifInterface(str), i10, i11);
        } catch (IOException e10) {
            Log.d("ImageHeaderParser", e10.getMessage());
        }
    }

    public static void f(ExifInterface exifInterface, ExifInterface exifInterface2, int i10, int i11) throws Throwable {
        String[] strArr = {ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_FLASH, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, ExifInterface.TAG_MAKE, ExifInterface.TAG_MODEL, ExifInterface.TAG_SUBSEC_TIME, ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, ExifInterface.TAG_WHITE_BALANCE};
        for (int i12 = 0; i12 < 22; i12++) {
            String str = strArr[i12];
            String attribute = exifInterface.getAttribute(str);
            if (!TextUtils.isEmpty(attribute)) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i10));
        exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i11));
        exifInterface2.setAttribute(ExifInterface.TAG_ORIENTATION, "0");
        exifInterface2.saveAttributes();
    }

    public int g() throws IOException {
        int uInt16 = this.f62766a.getUInt16();
        if (h(uInt16)) {
            int iJ = j();
            if (iJ != -1) {
                return l(new byte[iJ], iJ);
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + uInt16);
        }
        return -1;
    }

    public final int j() throws IOException {
        short uInt8;
        int uInt16;
        long j10;
        long jSkip;
        do {
            short uInt9 = this.f62766a.getUInt8();
            if (uInt9 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) uInt9));
                }
                return -1;
            }
            uInt8 = this.f62766a.getUInt8();
            if (uInt8 == 218) {
                return -1;
            }
            if (uInt8 == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            uInt16 = this.f62766a.getUInt16() - 2;
            if (uInt8 == 225) {
                return uInt16;
            }
            j10 = uInt16;
            jSkip = this.f62766a.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) uInt8) + ", wanted to skip: " + uInt16 + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    public final int l(byte[] bArr, int i10) throws IOException {
        int i11 = this.f62766a.read(bArr, i10);
        if (i11 == i10) {
            if (i(bArr, i10)) {
                return k(new a(bArr, i10));
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + i11);
        }
        return -1;
    }

    public f(InputStream inputStream) {
        this.f62766a = new c(inputStream);
    }
}
