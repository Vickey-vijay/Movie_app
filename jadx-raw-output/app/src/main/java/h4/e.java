package h4;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.g;
import h4.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: FilteringManifestParser.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e<T extends d<T>> implements g.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a<? extends T> f53701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<StreamKey> f53702b;

    @Override // com.google.android.exoplayer2.upstream.g.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T t10 = this.f53701a.parse(uri, inputStream);
        List<StreamKey> list = this.f53702b;
        return (list == null || list.isEmpty()) ? t10 : (T) t10.copy(this.f53702b);
    }

    public e(g.a<? extends T> aVar, @Nullable List<StreamKey> list) {
        this.f53701a = aVar;
        this.f53702b = list;
    }
}
