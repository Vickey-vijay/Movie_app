package sg.bigo.ads.ad.interstitial;

import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f68410d;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'a' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f68411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f68412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f68413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f68414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f68415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f68416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f68417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f68418h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f68419i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f68420j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f68421k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f68422l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f68423m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f68424n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f68425o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f68426p;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ a[] f68427v;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f68428q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f68429r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f68430s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f68431t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final int f68432u;

        static {
            int i10 = R.string.bigo_ad_ic_blank;
            int i11 = R.drawable.bigo_ad_ic_star;
            int i12 = R.string.bigo_ad_comment_num_text;
            a aVar = new a("STAR", 0, 0, i10, i11, i12, 0);
            f68411a = aVar;
            int i13 = R.string.bigo_ad_download_num_text;
            a aVar2 = new a("DOWNLOAD_NUM", 1, 0, i10, 0, i13, 0);
            f68412b = aVar2;
            int i14 = R.drawable.bigo_ad_ic_everyone;
            int i15 = R.string.bigo_ad_ic_everyone;
            a aVar3 = new a("Everyone", 2, 0, 0, i14, i15, R.drawable.bigo_ad_ic_everyone_ic_info);
            f68413c = aVar3;
            int i16 = R.drawable.bigo_ad_ic_web;
            int i17 = R.string.bigo_ad_ic_web;
            a aVar4 = new a("WEB", 3, 1, 0, i16, i17, 0);
            f68414d = aVar4;
            int i18 = R.drawable.bigo_ad_ic_recommend;
            int i19 = R.string.bigo_ad_ic_recommended;
            a aVar5 = new a("RECOMMENDED", 4, 1, 0, i18, i19, 0);
            f68415e = aVar5;
            a aVar6 = new a("REVIEWS", 5, 3, 0, R.drawable.bigo_ad_ic_star2, i12, 0);
            f68416f = aVar6;
            int i20 = R.drawable.bigo_ad_ic_phone;
            int i21 = R.string.bigo_ad_ic_application;
            a aVar7 = new a("APPLICATION", 6, 2, 0, i20, i21, 0);
            f68417g = aVar7;
            a aVar8 = new a("DOWNLOAD", 7, 2, 0, R.drawable.bigo_ad_ic_download_box, i13, 0);
            f68418h = aVar8;
            a aVar9 = new a("STAR_WHITE", 8, 0, i10, R.drawable.bigo_ad_ic_star_white, i12, 0);
            f68419i = aVar9;
            a aVar10 = new a("DOWNLOAD_NUM_WHITE", 9, 0, i10, 0, i13, 0);
            f68420j = aVar10;
            a aVar11 = new a("Everyone_WHITE", 10, 0, 0, R.drawable.bigo_ad_ic_everyone_white, i15, R.drawable.bigo_ad_ic_info_white);
            f68421k = aVar11;
            a aVar12 = new a("WEB_WHITE", 11, 4, 0, R.drawable.bigo_ad_ic_web_white, i17, 0);
            f68422l = aVar12;
            a aVar13 = new a("RECOMMENDED_WHITE", 12, 4, 0, R.drawable.bigo_ad_ic_recommend_white, i19, 0);
            f68423m = aVar13;
            a aVar14 = new a("REVIEWS_WHITE", 13, 12, 0, R.drawable.bigo_ad_ic_star2_white, i12, 0);
            f68424n = aVar14;
            a aVar15 = new a("APPLICATION_WHITE", 14, 8, 0, R.drawable.bigo_ad_ic_phone_white, i21, 0);
            f68425o = aVar15;
            a aVar16 = new a("DOWNLOAD_WHITE", 15, 8, 0, R.drawable.bigo_ad_ic_download_box_white, i13, 0);
            f68426p = aVar16;
            f68427v = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16};
        }

        private a(String str, int i10, int i11, int i12, int i13, int i14, int i15) {
            super(str, i10);
            this.f68428q = i11;
            this.f68429r = i12;
            this.f68430s = i13;
            this.f68431t = i14;
            this.f68432u = i15;
        }

        public static List<a> a(int i10) {
            a[] aVarArrValues = values();
            ArrayList arrayList = new ArrayList();
            for (a aVar : aVarArrValues) {
                int i11 = aVar.f68428q;
                if ((i11 & i10) > 0 || i11 == i10) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f68427v.clone();
        }
    }

    public f(int i10, int i11, String str) {
        this.f68407a = i10;
        this.f68408b = i11;
        this.f68409c = str;
        this.f68410d = !sg.bigo.ads.common.utils.q.a((CharSequence) str);
    }
}
