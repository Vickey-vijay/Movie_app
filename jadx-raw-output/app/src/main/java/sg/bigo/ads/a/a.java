package sg.bigo.ads.a;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColorInt
    private final int f67262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColorInt
    private final int f67263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f67264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f67265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f67266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f67267g;

    /* JADX INFO: renamed from: sg.bigo.ads.a.a$a, reason: collision with other inner class name */
    public static class C0646a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f67268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f67269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f67270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ColorInt
        private int f67271d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ColorInt
        private int f67272e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f67273f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bitmap f67274g;

        public final a a() {
            return new a(this.f67268a, this.f67271d, this.f67272e, this.f67273f, this.f67274g, this.f67269b, this.f67270c);
        }
    }

    public interface b {
        void a(Context context, String str, int i10, @Nullable String str2);

        void a(String str, String str2, String str3);
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();
    }

    public a(String str, int i10, int i11, boolean z10, Bitmap bitmap, c cVar, b bVar) {
        this.f67261a = str;
        this.f67262b = i10;
        this.f67263c = i11;
        this.f67264d = z10;
        this.f67265e = bitmap;
        this.f67266f = cVar;
        this.f67267g = bVar;
    }

    public final void a(Context context) {
        sg.bigo.ads.a.c.a(context, this.f67261a, this.f67262b, this.f67263c, this.f67264d, this.f67265e, this.f67266f, this.f67267g);
    }
}
