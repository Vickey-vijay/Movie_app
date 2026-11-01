package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<C0736a> f71387a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<C0736a> f71388b = new ArrayList();

    /* JADX INFO: renamed from: sg.bigo.ads.core.f.a.a$a, reason: collision with other inner class name */
    public static final class C0736a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f71391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f71392d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f71393e;

        public C0736a(String str, int i10, int i11, @Nullable String str2, String str3) {
            this.f71390b = str;
            this.f71391c = i10;
            this.f71392d = i11;
            this.f71393e = str2;
            this.f71389a = str3;
        }

        public final boolean a() {
            return !TextUtils.isEmpty(this.f71390b);
        }

        public final boolean b() {
            return "image/jpeg".equalsIgnoreCase(this.f71393e) || "image/png".equalsIgnoreCase(this.f71393e);
        }

        public final boolean c() {
            return "image/gif".equalsIgnoreCase(this.f71393e);
        }
    }

    public static C0736a a(List<C0736a> list) {
        if (list == null) {
            return null;
        }
        for (C0736a c0736a : list) {
            if (c0736a != null) {
                return c0736a;
            }
        }
        return null;
    }

    @Nullable
    public final C0736a a() {
        return a(this.f71387a);
    }
}
