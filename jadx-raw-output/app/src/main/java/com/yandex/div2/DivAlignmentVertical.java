package com.yandex.div2;

/* JADX INFO: compiled from: DivAlignmentVertical.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum DivAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivAlignmentVertical, String> TO_STRING = new bk.l<DivAlignmentVertical, String>() { // from class: com.yandex.div2.DivAlignmentVertical$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivAlignmentVertical divAlignmentVertical) {
            return DivAlignmentVertical.Converter.b(divAlignmentVertical);
        }
    };
    public static final bk.l<String, DivAlignmentVertical> FROM_STRING = new bk.l<String, DivAlignmentVertical>() { // from class: com.yandex.div2.DivAlignmentVertical$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivAlignmentVertical invoke(String str) {
            return DivAlignmentVertical.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivAlignmentVertical.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAlignmentVertical a(String str) {
            DivAlignmentVertical divAlignmentVertical = DivAlignmentVertical.TOP;
            if (ck.p.e(str, divAlignmentVertical.value)) {
                return divAlignmentVertical;
            }
            DivAlignmentVertical divAlignmentVertical2 = DivAlignmentVertical.CENTER;
            if (ck.p.e(str, divAlignmentVertical2.value)) {
                return divAlignmentVertical2;
            }
            DivAlignmentVertical divAlignmentVertical3 = DivAlignmentVertical.BOTTOM;
            if (ck.p.e(str, divAlignmentVertical3.value)) {
                return divAlignmentVertical3;
            }
            DivAlignmentVertical divAlignmentVertical4 = DivAlignmentVertical.BASELINE;
            if (ck.p.e(str, divAlignmentVertical4.value)) {
                return divAlignmentVertical4;
            }
            return null;
        }

        public final String b(DivAlignmentVertical divAlignmentVertical) {
            return divAlignmentVertical.value;
        }
    }

    DivAlignmentVertical(String str) {
        this.value = str;
    }
}
