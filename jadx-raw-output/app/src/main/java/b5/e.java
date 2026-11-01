package b5;

import android.text.Layout;
import androidx.annotation.Nullable;
import g5.m;

/* JADX INFO: compiled from: WebvttCue.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e extends t4.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f4780q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f4781r;

    /* JADX INFO: compiled from: WebvttCue.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f4782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f4783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public CharSequence f4784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f4787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f4788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f4789h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4790i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f4791j;

        public static float b(float f10, int i10) {
            if (f10 != -3.4028235E38f && i10 == 0 && (f10 < 0.0f || f10 > 1.0f)) {
                return 1.0f;
            }
            if (f10 != -3.4028235E38f) {
                return f10;
            }
            return i10 == 0 ? 1.0f : -3.4028235E38f;
        }

        @Nullable
        public static Layout.Alignment c(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            m.h("WebvttCueBuilder", "Unknown textAlignment: " + i10);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float e(int i10) {
            if (i10 != 4) {
                return i10 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 != 4) {
                return i10 != 5 ? 1 : 2;
            }
            return 0;
        }

        public static float d(int i10, float f10) {
            if (i10 == 0) {
                return 1.0f - f10;
            }
            if (i10 == 1) {
                return f10 <= 0.5f ? f10 * 2.0f : (1.0f - f10) * 2.0f;
            }
            if (i10 == 2) {
                return f10;
            }
            throw new IllegalStateException(String.valueOf(i10));
        }

        public e a() {
            this.f4786e = b(this.f4786e, this.f4787f);
            if (this.f4789h == -3.4028235E38f) {
                this.f4789h = e(this.f4785d);
            }
            if (this.f4790i == Integer.MIN_VALUE) {
                this.f4790i = f(this.f4785d);
            }
            this.f4791j = Math.min(this.f4791j, d(this.f4790i, this.f4789h));
            return new e(this.f4782a, this.f4783b, (CharSequence) g5.a.e(this.f4784c), c(this.f4785d), this.f4786e, this.f4787f, this.f4788g, this.f4789h, this.f4790i, this.f4791j);
        }

        public void g() {
            this.f4782a = 0L;
            this.f4783b = 0L;
            this.f4784c = null;
            this.f4785d = 2;
            this.f4786e = -3.4028235E38f;
            this.f4787f = 1;
            this.f4788g = 0;
            this.f4789h = -3.4028235E38f;
            this.f4790i = Integer.MIN_VALUE;
            this.f4791j = 1.0f;
        }

        public b h(long j10) {
            this.f4783b = j10;
            return this;
        }

        public b i(float f10) {
            this.f4786e = f10;
            return this;
        }

        public b j(int i10) {
            this.f4788g = i10;
            return this;
        }

        public b k(int i10) {
            this.f4787f = i10;
            return this;
        }

        public b l(float f10) {
            this.f4789h = f10;
            return this;
        }

        public b m(int i10) {
            this.f4790i = i10;
            return this;
        }

        public b n(long j10) {
            this.f4782a = j10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f4784c = charSequence;
            return this;
        }

        public b p(int i10) {
            this.f4785d = i10;
            return this;
        }

        public b q(float f10) {
            this.f4791j = f10;
            return this;
        }

        public b() {
            g();
        }
    }

    public e(long j10, long j11, CharSequence charSequence, @Nullable Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12);
        this.f4780q = j10;
        this.f4781r = j11;
    }

    public boolean a() {
        return this.f72223e == -3.4028235E38f && this.f72226h == 0.5f;
    }
}
