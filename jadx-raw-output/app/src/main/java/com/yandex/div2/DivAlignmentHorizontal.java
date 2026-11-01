package com.yandex.div2;

/* JADX INFO: compiled from: DivAlignmentHorizontal.kt */
/* JADX INFO: loaded from: classes6.dex */
public enum DivAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    START("start"),
    END("end");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivAlignmentHorizontal, String> TO_STRING = new bk.l<DivAlignmentHorizontal, String>() { // from class: com.yandex.div2.DivAlignmentHorizontal$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivAlignmentHorizontal divAlignmentHorizontal) {
            return DivAlignmentHorizontal.Converter.b(divAlignmentHorizontal);
        }
    };
    public static final bk.l<String, DivAlignmentHorizontal> FROM_STRING = new bk.l<String, DivAlignmentHorizontal>() { // from class: com.yandex.div2.DivAlignmentHorizontal$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivAlignmentHorizontal invoke(String str) {
            return DivAlignmentHorizontal.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivAlignmentHorizontal.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivAlignmentHorizontal a(String str) {
            DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
            if (ck.p.e(str, divAlignmentHorizontal.value)) {
                return divAlignmentHorizontal;
            }
            DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
            if (ck.p.e(str, divAlignmentHorizontal2.value)) {
                return divAlignmentHorizontal2;
            }
            DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
            if (ck.p.e(str, divAlignmentHorizontal3.value)) {
                return divAlignmentHorizontal3;
            }
            DivAlignmentHorizontal divAlignmentHorizontal4 = DivAlignmentHorizontal.START;
            if (ck.p.e(str, divAlignmentHorizontal4.value)) {
                return divAlignmentHorizontal4;
            }
            DivAlignmentHorizontal divAlignmentHorizontal5 = DivAlignmentHorizontal.END;
            if (ck.p.e(str, divAlignmentHorizontal5.value)) {
                return divAlignmentHorizontal5;
            }
            return null;
        }

        public final String b(DivAlignmentHorizontal divAlignmentHorizontal) {
            return divAlignmentHorizontal.value;
        }
    }

    DivAlignmentHorizontal(String str) {
        this.value = str;
    }
}
