package com.yandex.div2;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: DivImageScale.kt */
/* JADX INFO: loaded from: classes.dex */
public enum DivImageScale {
    FILL(VastAttributes.FILL_COLOR),
    NO_SCALE("no_scale"),
    FIT("fit"),
    STRETCH("stretch");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivImageScale, String> TO_STRING = new bk.l<DivImageScale, String>() { // from class: com.yandex.div2.DivImageScale$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivImageScale divImageScale) {
            return DivImageScale.Converter.b(divImageScale);
        }
    };
    public static final bk.l<String, DivImageScale> FROM_STRING = new bk.l<String, DivImageScale>() { // from class: com.yandex.div2.DivImageScale$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivImageScale invoke(String str) {
            return DivImageScale.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivImageScale.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivImageScale a(String str) {
            DivImageScale divImageScale = DivImageScale.FILL;
            if (ck.p.e(str, divImageScale.value)) {
                return divImageScale;
            }
            DivImageScale divImageScale2 = DivImageScale.NO_SCALE;
            if (ck.p.e(str, divImageScale2.value)) {
                return divImageScale2;
            }
            DivImageScale divImageScale3 = DivImageScale.FIT;
            if (ck.p.e(str, divImageScale3.value)) {
                return divImageScale3;
            }
            DivImageScale divImageScale4 = DivImageScale.STRETCH;
            if (ck.p.e(str, divImageScale4.value)) {
                return divImageScale4;
            }
            return null;
        }

        public final String b(DivImageScale divImageScale) {
            return divImageScale.value;
        }
    }

    DivImageScale(String str) {
        this.value = str;
    }
}
