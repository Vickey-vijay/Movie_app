package android.media;

import android.annotation.NonNull;
import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class MediaParser {

    /* JADX INFO: loaded from: classes5.dex */
    public /* synthetic */ interface InputReader {
        static {
            throw new NoClassDefFoundError();
        }

        /* synthetic */ long getLength();

        /* synthetic */ int read(@NonNull byte[] bArr, int i10, int i11) throws IOException;
    }

    /* JADX INFO: loaded from: classes7.dex */
    public /* synthetic */ interface OutputConsumer {
        static {
            throw new NoClassDefFoundError();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class SeekMap {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ long getDurationMicros();

        @NonNull
        public native /* synthetic */ Pair<SeekPoint, SeekPoint> getSeekPoints(long j10);

        public native /* synthetic */ boolean isSeekable();
    }

    /* JADX INFO: loaded from: classes6.dex */
    public final /* synthetic */ class SeekPoint {
        static {
            throw new NoClassDefFoundError();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public /* synthetic */ interface SeekableInputReader extends InputReader {
        static {
            throw new NoClassDefFoundError();
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public static native /* synthetic */ MediaParser create(@NonNull OutputConsumer outputConsumer, @NonNull String... strArr);

    @NonNull
    public static native /* synthetic */ MediaParser createByName(@NonNull String str, @NonNull OutputConsumer outputConsumer);

    public native /* synthetic */ boolean advance(@NonNull SeekableInputReader seekableInputReader) throws IOException;

    @NonNull
    public native /* synthetic */ String getParserName();

    public native /* synthetic */ void release();

    public native /* synthetic */ void seek(@NonNull SeekPoint seekPoint);

    @NonNull
    public native /* synthetic */ MediaParser setParameter(@NonNull String str, @NonNull Object obj);
}
