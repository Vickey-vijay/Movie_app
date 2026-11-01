package sg.bigo.ads.common.w;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(api = 19)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f70298b = new b() { // from class: sg.bigo.ads.common.w.c.1
        @Override // sg.bigo.ads.common.w.c.b
        public final boolean a(float[] fArr) {
            float f10 = fArr[2];
            if (!(f10 >= 0.95f)) {
                if (!(f10 <= 0.05f)) {
                    float f11 = fArr[1];
                    if (!((f11 <= 0.1f && f10 >= 0.55f) || (f11 <= 0.5f && f10 >= 0.75f) || (f11 <= 0.2f && f10 >= 0.7f))) {
                        float f12 = fArr[0];
                        if (!(f12 >= 10.0f && f12 <= 37.0f && f11 <= 0.82f)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<C0722c> f70300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<d> f70301d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseBooleanArray f70303f = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<d, C0722c> f70302e = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C0722c f70299a = b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Bitmap f70304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<d> f70305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f70306c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f70307d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f70308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f70309f;

        public a(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f70305b = arrayList;
            this.f70306c = 16;
            this.f70307d = 12544;
            this.f70308e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f70309f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(c.f70298b);
            this.f70304a = bitmap;
            arrayList.add(d.f70316a);
        }
    }

    public interface b {
        boolean a(@NonNull float[] fArr);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.c$c, reason: collision with other inner class name */
    public static final class C0722c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f70311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f70312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f70313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f70314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private float[] f70315f;

        public C0722c(@ColorInt int i10, int i11) {
            this.f70312c = Color.red(i10);
            this.f70313d = Color.green(i10);
            this.f70314e = Color.blue(i10);
            this.f70310a = i10;
            this.f70311b = i11;
        }

        @NonNull
        public final float[] a() {
            if (this.f70315f == null) {
                this.f70315f = new float[3];
            }
            sg.bigo.ads.common.w.b.a(this.f70312c, this.f70313d, this.f70314e, this.f70315f);
            return this.f70315f;
        }
    }

    public c(List<C0722c> list, List<d> list2) {
        this.f70300c = list;
        this.f70301d = list2;
    }

    @NonNull
    public static a a(@NonNull Bitmap bitmap) {
        return new a(bitmap);
    }

    @Nullable
    private C0722c b() {
        int size = this.f70300c.size();
        int i10 = Integer.MIN_VALUE;
        C0722c c0722c = null;
        for (int i11 = 0; i11 < size; i11++) {
            C0722c c0722c2 = this.f70300c.get(i11);
            int i12 = c0722c2.f70311b;
            if (i12 > i10) {
                c0722c = c0722c2;
                i10 = i12;
            }
        }
        return c0722c;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    public final void a() {
        int i10;
        float f10;
        int size = this.f70301d.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            d dVar = this.f70301d.get(i12);
            int length = dVar.f70319d.length;
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i13 = i11; i13 < length; i13++) {
                float f13 = dVar.f70319d[i13];
                if (f13 > 0.0f) {
                    f12 += f13;
                }
            }
            if (f12 != 0.0f) {
                int length2 = dVar.f70319d.length;
                for (int i14 = i11; i14 < length2; i14++) {
                    float[] fArr = dVar.f70319d;
                    float f14 = fArr[i14];
                    if (f14 > 0.0f) {
                        fArr[i14] = f14 / f12;
                    }
                }
            }
            Map<d, C0722c> map = this.f70302e;
            C0722c c0722c = null;
            int size2 = this.f70300c.size();
            int i15 = i11;
            float f15 = 0.0f;
            while (i15 < size2) {
                C0722c c0722c2 = this.f70300c.get(i15);
                float[] fArrA = c0722c2.a();
                float f16 = fArrA[1];
                float[] fArr2 = dVar.f70317b;
                if (f16 < fArr2[i11] || f16 > fArr2[2]) {
                    i10 = i11;
                } else {
                    float f17 = fArrA[2];
                    float[] fArr3 = dVar.f70318c;
                    if (f17 < fArr3[i11] || f17 > fArr3[2] || this.f70303f.get(c0722c2.f70310a)) {
                        i10 = i11;
                    } else {
                        i10 = 1;
                    }
                }
                if (i10 != 0) {
                    float[] fArrA2 = c0722c2.a();
                    C0722c c0722c3 = this.f70299a;
                    int i16 = c0722c3 != null ? c0722c3.f70311b : 1;
                    float f18 = dVar.f70319d[i11];
                    float fAbs = f18 > f11 ? f18 * (1.0f - Math.abs(fArrA2[1] - dVar.f70317b[1])) : f11;
                    float f19 = dVar.f70319d[1];
                    float fAbs2 = f19 > f11 ? f19 * (1.0f - Math.abs(fArrA2[2] - dVar.f70318c[1])) : 0.0f;
                    float f20 = dVar.f70319d[2];
                    f10 = 0.0f;
                    float f21 = fAbs + fAbs2 + (f20 > 0.0f ? f20 * (c0722c2.f70311b / i16) : 0.0f);
                    if (c0722c == null || f21 > f15) {
                        c0722c = c0722c2;
                        f15 = f21;
                    }
                } else {
                    f10 = f11;
                }
                i15++;
                f11 = f10;
                i11 = 0;
            }
            if (c0722c != null && dVar.f70320e) {
                this.f70303f.append(c0722c.f70310a, true);
            }
            map.put(dVar, c0722c);
            i12++;
            i11 = 0;
        }
        this.f70303f.clear();
    }
}
