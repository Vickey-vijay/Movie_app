package t4;

import com.google.android.exoplayer2.Format;

/* JADX INFO: compiled from: SubtitleDecoderFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f72236a = new a();

    /* JADX INFO: compiled from: SubtitleDecoderFactory.java */
    public class a implements g {
        @Override // t4.g
        public boolean a(Format format) {
            String str = format.f18970j;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        @Override // t4.g
        public f b(Format format) {
            String str = format.f18970j;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new v4.a(format.f18972l);
                    case "application/pgs":
                        return new w4.a();
                    case "application/x-mp4-vtt":
                        return new b5.b();
                    case "text/vtt":
                        return new b5.g();
                    case "application/x-quicktime-tx3g":
                        return new a5.a(format.f18972l);
                    case "text/x-ssa":
                        return new x4.a(format.f18972l);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new u4.a(str, format.C);
                    case "application/cea-708":
                        return new u4.c(format.C, format.f18972l);
                    case "application/x-subrip":
                        return new y4.a();
                    case "application/ttml+xml":
                        return new z4.a();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(Format format);

    f b(Format format);
}
