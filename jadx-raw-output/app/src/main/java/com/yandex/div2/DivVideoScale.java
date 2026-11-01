package com.yandex.div2;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: DivVideoScale.kt */
/* JADX INFO: loaded from: classes7.dex */
public enum DivVideoScale {
    FILL(VastAttributes.FILL_COLOR),
    NO_SCALE("no_scale"),
    FIT("fit");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivVideoScale, String> TO_STRING = new bk.l<DivVideoScale, String>() { // from class: com.yandex.div2.DivVideoScale$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivVideoScale divVideoScale) {
            return DivVideoScale.Converter.b(divVideoScale);
        }
    };
    public static final bk.l<String, DivVideoScale> FROM_STRING = new bk.l<String, DivVideoScale>() { // from class: com.yandex.div2.DivVideoScale$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivVideoScale invoke(String str) {
            return DivVideoScale.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivVideoScale.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivVideoScale a(String str) {
            DivVideoScale divVideoScale = DivVideoScale.FILL;
            if (ck.p.e(str, divVideoScale.value)) {
                return divVideoScale;
            }
            DivVideoScale divVideoScale2 = DivVideoScale.NO_SCALE;
            if (ck.p.e(str, divVideoScale2.value)) {
                return divVideoScale2;
            }
            DivVideoScale divVideoScale3 = DivVideoScale.FIT;
            if (ck.p.e(str, divVideoScale3.value)) {
                return divVideoScale3;
            }
            return null;
        }

        public final String b(DivVideoScale divVideoScale) {
            return divVideoScale.value;
        }
    }

    DivVideoScale(String str) {
        this.value = str;
    }
}
