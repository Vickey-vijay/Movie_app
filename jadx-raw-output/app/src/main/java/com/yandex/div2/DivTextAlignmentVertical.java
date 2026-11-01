package com.yandex.div2;

/* JADX INFO: compiled from: DivTextAlignmentVertical.kt */
/* JADX INFO: loaded from: classes7.dex */
public enum DivTextAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivTextAlignmentVertical, String> TO_STRING = new bk.l<DivTextAlignmentVertical, String>() { // from class: com.yandex.div2.DivTextAlignmentVertical$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivTextAlignmentVertical divTextAlignmentVertical) {
            return DivTextAlignmentVertical.Converter.b(divTextAlignmentVertical);
        }
    };
    public static final bk.l<String, DivTextAlignmentVertical> FROM_STRING = new bk.l<String, DivTextAlignmentVertical>() { // from class: com.yandex.div2.DivTextAlignmentVertical$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivTextAlignmentVertical invoke(String str) {
            return DivTextAlignmentVertical.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivTextAlignmentVertical.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTextAlignmentVertical a(String str) {
            DivTextAlignmentVertical divTextAlignmentVertical = DivTextAlignmentVertical.TOP;
            if (ck.p.e(str, divTextAlignmentVertical.value)) {
                return divTextAlignmentVertical;
            }
            DivTextAlignmentVertical divTextAlignmentVertical2 = DivTextAlignmentVertical.CENTER;
            if (ck.p.e(str, divTextAlignmentVertical2.value)) {
                return divTextAlignmentVertical2;
            }
            DivTextAlignmentVertical divTextAlignmentVertical3 = DivTextAlignmentVertical.BOTTOM;
            if (ck.p.e(str, divTextAlignmentVertical3.value)) {
                return divTextAlignmentVertical3;
            }
            DivTextAlignmentVertical divTextAlignmentVertical4 = DivTextAlignmentVertical.BASELINE;
            if (ck.p.e(str, divTextAlignmentVertical4.value)) {
                return divTextAlignmentVertical4;
            }
            return null;
        }

        public final String b(DivTextAlignmentVertical divTextAlignmentVertical) {
            return divTextAlignmentVertical.value;
        }
    }

    DivTextAlignmentVertical(String str) {
        this.value = str;
    }
}
