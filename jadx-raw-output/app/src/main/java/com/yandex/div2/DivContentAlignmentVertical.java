package com.yandex.div2;

/* JADX INFO: compiled from: DivContentAlignmentVertical.kt */
/* JADX INFO: loaded from: classes7.dex */
public enum DivContentAlignmentVertical {
    TOP("top"),
    CENTER("center"),
    BOTTOM("bottom"),
    BASELINE("baseline"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivContentAlignmentVertical, String> TO_STRING = new bk.l<DivContentAlignmentVertical, String>() { // from class: com.yandex.div2.DivContentAlignmentVertical$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivContentAlignmentVertical divContentAlignmentVertical) {
            return DivContentAlignmentVertical.Converter.b(divContentAlignmentVertical);
        }
    };
    public static final bk.l<String, DivContentAlignmentVertical> FROM_STRING = new bk.l<String, DivContentAlignmentVertical>() { // from class: com.yandex.div2.DivContentAlignmentVertical$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivContentAlignmentVertical invoke(String str) {
            return DivContentAlignmentVertical.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivContentAlignmentVertical.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivContentAlignmentVertical a(String str) {
            DivContentAlignmentVertical divContentAlignmentVertical = DivContentAlignmentVertical.TOP;
            if (ck.p.e(str, divContentAlignmentVertical.value)) {
                return divContentAlignmentVertical;
            }
            DivContentAlignmentVertical divContentAlignmentVertical2 = DivContentAlignmentVertical.CENTER;
            if (ck.p.e(str, divContentAlignmentVertical2.value)) {
                return divContentAlignmentVertical2;
            }
            DivContentAlignmentVertical divContentAlignmentVertical3 = DivContentAlignmentVertical.BOTTOM;
            if (ck.p.e(str, divContentAlignmentVertical3.value)) {
                return divContentAlignmentVertical3;
            }
            DivContentAlignmentVertical divContentAlignmentVertical4 = DivContentAlignmentVertical.BASELINE;
            if (ck.p.e(str, divContentAlignmentVertical4.value)) {
                return divContentAlignmentVertical4;
            }
            DivContentAlignmentVertical divContentAlignmentVertical5 = DivContentAlignmentVertical.SPACE_BETWEEN;
            if (ck.p.e(str, divContentAlignmentVertical5.value)) {
                return divContentAlignmentVertical5;
            }
            DivContentAlignmentVertical divContentAlignmentVertical6 = DivContentAlignmentVertical.SPACE_AROUND;
            if (ck.p.e(str, divContentAlignmentVertical6.value)) {
                return divContentAlignmentVertical6;
            }
            DivContentAlignmentVertical divContentAlignmentVertical7 = DivContentAlignmentVertical.SPACE_EVENLY;
            if (ck.p.e(str, divContentAlignmentVertical7.value)) {
                return divContentAlignmentVertical7;
            }
            return null;
        }

        public final String b(DivContentAlignmentVertical divContentAlignmentVertical) {
            return divContentAlignmentVertical.value;
        }
    }

    DivContentAlignmentVertical(String str) {
        this.value = str;
    }
}
