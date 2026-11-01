package com.yandex.div2;

/* JADX INFO: compiled from: DivTransitionSelector.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum DivTransitionSelector {
    NONE("none"),
    DATA_CHANGE("data_change"),
    STATE_CHANGE("state_change"),
    ANY_CHANGE("any_change");

    private final String value;
    public static final a Converter = new a(null);
    public static final bk.l<DivTransitionSelector, String> TO_STRING = new bk.l<DivTransitionSelector, String>() { // from class: com.yandex.div2.DivTransitionSelector$Converter$TO_STRING$1
        @Override // bk.l
        public final String invoke(DivTransitionSelector divTransitionSelector) {
            return DivTransitionSelector.Converter.b(divTransitionSelector);
        }
    };
    public static final bk.l<String, DivTransitionSelector> FROM_STRING = new bk.l<String, DivTransitionSelector>() { // from class: com.yandex.div2.DivTransitionSelector$Converter$FROM_STRING$1
        @Override // bk.l
        public final DivTransitionSelector invoke(String str) {
            return DivTransitionSelector.Converter.a(str);
        }
    };

    /* JADX INFO: compiled from: DivTransitionSelector.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTransitionSelector a(String str) {
            DivTransitionSelector divTransitionSelector = DivTransitionSelector.NONE;
            if (ck.p.e(str, divTransitionSelector.value)) {
                return divTransitionSelector;
            }
            DivTransitionSelector divTransitionSelector2 = DivTransitionSelector.DATA_CHANGE;
            if (ck.p.e(str, divTransitionSelector2.value)) {
                return divTransitionSelector2;
            }
            DivTransitionSelector divTransitionSelector3 = DivTransitionSelector.STATE_CHANGE;
            if (ck.p.e(str, divTransitionSelector3.value)) {
                return divTransitionSelector3;
            }
            DivTransitionSelector divTransitionSelector4 = DivTransitionSelector.ANY_CHANGE;
            if (ck.p.e(str, divTransitionSelector4.value)) {
                return divTransitionSelector4;
            }
            return null;
        }

        public final String b(DivTransitionSelector divTransitionSelector) {
            return divTransitionSelector.value;
        }
    }

    DivTransitionSelector(String str) {
        this.value = str;
    }
}
