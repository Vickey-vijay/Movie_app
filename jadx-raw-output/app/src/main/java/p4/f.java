package p4;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import g5.g0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HlsExtractorFactory.java */
/* JADX INFO: loaded from: classes7.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f65914a = new c();

    a a(@Nullable q3.g gVar, Uri uri, Format format, @Nullable List<Format> list, g0 g0Var, Map<String, List<String>> map, q3.h hVar) throws InterruptedException, IOException;

    /* JADX INFO: compiled from: HlsExtractorFactory.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q3.g f65915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65917c;

        public a(q3.g gVar, boolean z10, boolean z11) {
            this.f65915a = gVar;
            this.f65916b = z10;
            this.f65917c = z11;
        }
    }
}
