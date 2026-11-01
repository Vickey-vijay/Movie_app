package com.yandex.div2;

/* JADX INFO: compiled from: DivContentAlignmentHorizontal.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum DivContentAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivContentAlignmentHorizontal, String> TO_STRING = new bk.l<DivContentAlignmentHorizontal, String>() { // from class: com.yandex.div2.DivContentAlignmentHorizontal$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
            return DivContentAlignmentHorizontal.Converter.b(divContentAlignmentHorizontal);
        }
    };
    public static final bk.l<String, DivContentAlignmentHorizontal> FROM_STRING = new bk.l<String, DivContentAlignmentHorizontal>() { // from class: com.yandex.div2.DivContentAlignmentHorizontal$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivContentAlignmentHorizontal invoke(String str) {
            return DivContentAlignmentHorizontal.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivContentAlignmentHorizontal.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivContentAlignmentHorizontal a(String str) {
            DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.LEFT;
            if (ck.p.e(str, divContentAlignmentHorizontal.value)) {
                return divContentAlignmentHorizontal;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal2 = DivContentAlignmentHorizontal.CENTER;
            if (ck.p.e(str, divContentAlignmentHorizontal2.value)) {
                return divContentAlignmentHorizontal2;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal3 = DivContentAlignmentHorizontal.RIGHT;
            if (ck.p.e(str, divContentAlignmentHorizontal3.value)) {
                return divContentAlignmentHorizontal3;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal4 = DivContentAlignmentHorizontal.START;
            if (ck.p.e(str, divContentAlignmentHorizontal4.value)) {
                return divContentAlignmentHorizontal4;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal5 = DivContentAlignmentHorizontal.END;
            if (ck.p.e(str, divContentAlignmentHorizontal5.value)) {
                return divContentAlignmentHorizontal5;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal6 = DivContentAlignmentHorizontal.SPACE_BETWEEN;
            if (ck.p.e(str, divContentAlignmentHorizontal6.value)) {
                return divContentAlignmentHorizontal6;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal7 = DivContentAlignmentHorizontal.SPACE_AROUND;
            if (ck.p.e(str, divContentAlignmentHorizontal7.value)) {
                return divContentAlignmentHorizontal7;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal8 = DivContentAlignmentHorizontal.SPACE_EVENLY;
            if (ck.p.e(str, divContentAlignmentHorizontal8.value)) {
                return divContentAlignmentHorizontal8;
            }
            return null;
        }

        public final String b(DivContentAlignmentHorizontal divContentAlignmentHorizontal) {
            return divContentAlignmentHorizontal.value;
        }
    }

    DivContentAlignmentHorizontal(String str) {
        this.value = str;
    }
}
