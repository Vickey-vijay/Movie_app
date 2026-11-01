package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.api.b;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b<T extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f69324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f69325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final a f69326h = new a(0);

    public static class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f69327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f69328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f69329c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f69330d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f69331e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f69332f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f69333g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f69334h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f69335i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f69336j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f69337k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f69338l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f69339m;

        private a() {
            this.f69328b = UUID.randomUUID().toString();
            this.f69327a = "";
            this.f69329c = "";
            this.f69330d = "";
            this.f69331e = "";
            this.f69333g = 0;
            this.f69335i = 0;
            this.f69334h = "";
            this.f69336j = 0L;
            this.f69337k = 0L;
            this.f69338l = 0L;
            this.f69339m = 0L;
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public final void a() {
            if (this.f69338l == 0) {
                this.f69338l = System.currentTimeMillis();
            }
        }

        public final void b() {
            if (this.f69339m == 0) {
                this.f69339m = System.currentTimeMillis();
            }
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String c() {
            return this.f69328b;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String d() {
            return this.f69329c;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String e() {
            return this.f69330d;
        }

        @Override // sg.bigo.ads.api.core.g
        @Nullable
        public final String f() {
            return this.f69331e;
        }

        @Override // sg.bigo.ads.api.core.g
        public final String g() {
            return this.f69327a;
        }

        @Override // sg.bigo.ads.api.core.g
        public final int h() {
            return this.f69333g;
        }

        @Override // sg.bigo.ads.api.core.g
        public final String i() {
            return this.f69334h;
        }

        @Override // sg.bigo.ads.api.core.g
        public final int j() {
            return this.f69335i;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long k() {
            return this.f69332f;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long l() {
            return this.f69336j;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long m() {
            return this.f69337k;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long n() {
            return this.f69338l;
        }

        @Override // sg.bigo.ads.api.core.g
        public final long o() {
            return this.f69339m;
        }
    }

    public b(String str, @Nullable String str2) {
        this.f69319a = str;
        this.f69320b = str2;
    }

    @Nullable
    public T a() {
        return null;
    }

    public final void a(String str) {
        this.f69326h.f69327a = str;
    }

    public final void a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        a aVar = this.f69326h;
        aVar.f69329c = str;
        aVar.f69330d = str2;
        aVar.f69331e = str3;
    }

    public boolean a(int i10) {
        return i10 != c();
    }

    @Nullable
    public sg.bigo.ads.api.core.c b() {
        if (q.a((CharSequence) this.f69319a)) {
            return new sg.bigo.ads.api.core.c(1019, 10001, "Please pass slot id when constructing an ad request");
        }
        return null;
    }

    public final void b(int i10) {
        a aVar = this.f69326h;
        if (aVar.f69336j == 0) {
            aVar.f69335i = i10;
            aVar.f69336j = System.currentTimeMillis();
        }
    }

    public final void b(String str) {
        a aVar = this.f69326h;
        if (aVar != null) {
            aVar.f69334h = str;
        }
    }

    public abstract int c();

    public final void c(int i10) {
        this.f69326h.f69333g = i10;
    }

    @Nullable
    public Map<String, Object> d() {
        return null;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public l h() {
        return null;
    }
}
