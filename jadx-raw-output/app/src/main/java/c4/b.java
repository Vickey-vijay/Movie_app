package c4;

import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: MetadataDecoderFactory.java */
/* JADX INFO: loaded from: classes10.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5635a = new a();

    /* JADX INFO: compiled from: MetadataDecoderFactory.java */
    public class a implements b {
        @Override // c4.b
        public boolean a(Format format) {
            String str = format.f18970j;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str);
        }

        @Override // c4.b
        public c4.a b(Format format) {
            String str = format.f18970j;
            if (str != null) {
                switch (str) {
                    case "application/x-icy":
                        return new e4.a();
                    case "application/id3":
                        return new f4.b();
                    case "application/x-emsg":
                        return new d4.a();
                    case "application/x-scte35":
                        return new g4.a();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(Format format);

    c4.a b(Format format);
}
