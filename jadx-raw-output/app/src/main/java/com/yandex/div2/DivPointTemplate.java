package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPointTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPointTemplate implements JSONSerializable, JsonTemplate<DivPoint> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48421c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPointTemplate> f48422d = new bk.p<ParsingEnvironment, JSONObject, DivPointTemplate>() { // from class: com.yandex.div2.DivPointTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPointTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivPointTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<DivDimensionTemplate> f48423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivDimensionTemplate> f48424b;

    /* JADX INFO: compiled from: DivPointTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivPointTemplate(Field<DivDimensionTemplate> field, Field<DivDimensionTemplate> field2) {
        this.f48423a = field;
        this.f48424b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().a6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivPointTemplate(ParsingEnvironment parsingEnvironment, DivPointTemplate divPointTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPointTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPointTemplate(ParsingEnvironment parsingEnvironment, DivPointTemplate divPointTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
