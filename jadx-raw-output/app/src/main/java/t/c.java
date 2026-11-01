package t;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.R$string;
import java.io.IOException;
import java.util.List;
import k4.i;
import k4.l;
import k4.r;

/* JADX INFO: compiled from: MediaSourceBuilder.java */
/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f72074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f72075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q.b f72076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<String> f72078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f72079f;

    public c(@NonNull Context context) {
        this(context, null);
    }

    public c(@NonNull Context context, @Nullable q.b bVar) {
        this.f72077d = -1;
        this.f72076c = bVar;
        this.f72074a = context.getApplicationContext();
    }

    public void a() {
        q.b bVar = this.f72076c;
        if (bVar != null) {
            com.google.android.exoplayer2.upstream.a aVarCreateDataSource = bVar.a().createDataSource();
            if (aVarCreateDataSource instanceof com.google.android.exoplayer2.upstream.cache.a) {
                try {
                    ((com.google.android.exoplayer2.upstream.cache.a) aVarCreateDataSource).close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            this.f72076c = null;
        }
        this.f72077d = -1;
        this.f72078e = null;
    }

    public com.google.android.exoplayer2.upstream.a.InterfaceC0188a b() {
        q.b bVar = this.f72076c;
        return bVar != null ? bVar.a() : new p.a(this.f72074a);
    }

    public int c() {
        return this.f72077d;
    }

    public r d() {
        return this.f72075b;
    }

    public List<String> e() {
        return this.f72078e;
    }

    public r f(Uri uri) {
        q3.e eVar = new q3.e();
        eVar.a(1);
        if (s.e.h(uri) != 3) {
            throw new IllegalStateException(this.f72074a.getString(R$string.media_error));
        }
        l.b bVarE = new l.b(b()).c(eVar).e(5);
        String string = this.f72079f;
        if (string == null) {
            string = uri.toString();
        }
        return bVarE.b(string).a(uri);
    }

    public void g(int i10) {
        r rVar = this.f72075b;
        if (rVar instanceof i) {
            i iVar = (i) rVar;
            iVar.T(i10).b(null);
            iVar.d0(i10);
        }
    }

    public void h(@NonNull Uri uri) {
        this.f72075b = f(uri);
    }
}
