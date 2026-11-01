package u;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import e5.q;
import k4.l;
import k4.r;
import q.b;
import s.e;
import t.c;

/* JADX INFO: compiled from: WholeMediaSource.java */
/* JADX INFO: loaded from: classes10.dex */
public class a extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f72508g = 0;

    public a(@NonNull Context context) {
        super(context);
    }

    public a(@NonNull Context context, @Nullable b bVar) {
        super(context, bVar);
    }

    @Override // t.c
    public r f(@NonNull Uri uri) {
        int iH = e.h(uri);
        if (iH != 0) {
            if (iH != 1) {
                if (iH != 2) {
                    if (iH == 3) {
                        l.b bVarC = new l.b(b()).c(new q3.e());
                        String string = this.f72079f;
                        if (string == null) {
                            string = uri.toString();
                        }
                        return bVarC.b(string).e(5).a(uri);
                    }
                    throw new IllegalStateException(":Unsupported type: " + iH);
                }
                return new HlsMediaSource.Factory(new p4.b(b())).b(true).d(5).c(new p4.c()).a(uri);
            }
            return new SsMediaSource.Factory(new com.google.android.exoplayer2.source.smoothstreaming.a.C0184a(b()), new com.google.android.exoplayer2.upstream.c(this.f72074a, (q) null, b())).d(5).b(10000L).a(uri);
        }
        return new DashMediaSource.Factory(new com.google.android.exoplayer2.source.dash.c.a(b()), new com.google.android.exoplayer2.upstream.c(this.f72074a, (q) null, b())).e(5).b(10000L).a(uri);
    }
}
