package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeDrawableTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivShapeDrawableTemplate implements JSONSerializable, JsonTemplate<DivShapeDrawable> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48792d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivShapeDrawableTemplate> f48793e = new bk.p<ParsingEnvironment, JSONObject, DivShapeDrawableTemplate>() { // from class: com.yandex.div2.DivShapeDrawableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivShapeDrawableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivShapeDrawableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Integer>> f48794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivShapeTemplate> f48795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivStrokeTemplate> f48796c;

    /* JADX INFO: compiled from: DivShapeDrawableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivShapeDrawableTemplate(Field<Expression<Integer>> field, Field<DivShapeTemplate> field2, Field<DivStrokeTemplate> field3) {
        this.f48794a = field;
        this.f48795b = field2;
        this.f48796c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().T6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivShapeDrawableTemplate(ParsingEnvironment parsingEnvironment, DivShapeDrawableTemplate divShapeDrawableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divShapeDrawableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivShapeDrawableTemplate(ParsingEnvironment parsingEnvironment, DivShapeDrawableTemplate divShapeDrawableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
