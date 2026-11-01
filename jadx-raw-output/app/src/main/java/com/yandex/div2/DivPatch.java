package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatch.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivPatch implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48336f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Mode> f48337g = Expression.Companion.constant$default(Expression.Companion, Mode.PARTIAL, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPatch> f48338h = new bk.p<ParsingEnvironment, JSONObject, DivPatch>() { // from class: com.yandex.div2.DivPatch$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPatch mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivPatch.f48336f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Change> f48339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression<Mode> f48340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<DivAction> f48341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<DivAction> f48342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f48343e;

    /* JADX INFO: compiled from: DivPatch.kt */
    public static final class Change implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f48344e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, Change> f48345f = new bk.p<ParsingEnvironment, JSONObject, Change>() { // from class: com.yandex.div2.DivPatch$Change$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPatch.Change mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return DivPatch.Change.f48344e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Div> f48347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f48348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f48349d;

        /* JADX INFO: compiled from: DivPatch.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Change a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().F5().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f48349d;
            if (num != null) {
                return num.intValue();
            }
            int iPropertiesHash = propertiesHash();
            List<Div> list = this.f48347b;
            int iHash = 0;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((Div) it.next()).hash();
                }
            }
            int i10 = iPropertiesHash + iHash;
            this.f48349d = Integer.valueOf(i10);
            return i10;
        }

        @Override // com.yandex.div.data.Hashable
        public int propertiesHash() {
            Integer num = this.f48348c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = ck.s.b(Change.class).hashCode() + this.f48346a.hashCode();
            this.f48348c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Change(String str, List<? extends Div> list) {
            this.f48346a = str;
            this.f48347b = list;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().F5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivPatch.kt */
    public enum Mode {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");

        private final String value;
        public static final a Converter = new a(null);
        public static final bk.l<Mode, String> TO_STRING = new bk.l<Mode, String>() { // from class: com.yandex.div2.DivPatch$Mode$Converter$TO_STRING$1
            @Override // bk.l
            public final String invoke(DivPatch.Mode mode) {
                return DivPatch.Mode.Converter.b(mode);
            }
        };
        public static final bk.l<String, Mode> FROM_STRING = new bk.l<String, Mode>() { // from class: com.yandex.div2.DivPatch$Mode$Converter$FROM_STRING$1
            @Override // bk.l
            public final DivPatch.Mode invoke(String str) {
                return DivPatch.Mode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivPatch.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }

            public final Mode a(String str) {
                Mode mode = Mode.TRANSACTIONAL;
                if (ck.p.e(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.PARTIAL;
                if (ck.p.e(str, mode2.value)) {
                    return mode2;
                }
                return null;
            }

            public final String b(Mode mode) {
                return mode.value;
            }
        }

        Mode(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivPatch.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivPatch a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().I5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f48343e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivPatch.class).hashCode();
        Iterator<T> it = this.f48339a.iterator();
        int iHash2 = 0;
        int iHash3 = 0;
        while (it.hasNext()) {
            iHash3 += ((Change) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash3 + this.f48340b.hashCode();
        List<DivAction> list = this.f48341c;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            iHash = 0;
            while (it2.hasNext()) {
                iHash += ((DivAction) it2.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode2 + iHash;
        List<DivAction> list2 = this.f48342d;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                iHash2 += ((DivAction) it3.next()).hash();
            }
        }
        int i11 = i10 + iHash2;
        this.f48343e = Integer.valueOf(i11);
        return i11;
    }

    public DivPatch(List<Change> list, Expression<Mode> expression, List<DivAction> list2, List<DivAction> list3) {
        this.f48339a = list;
        this.f48340b = expression;
        this.f48341c = list2;
        this.f48342d = list3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
