package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: PropertyVariableTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class PropertyVariableTemplate implements JSONSerializable, JsonTemplate<PropertyVariable> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f50505f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f50506g = "new_value";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, PropertyVariableTemplate> f50507h = new bk.p<ParsingEnvironment, JSONObject, PropertyVariableTemplate>() { // from class: com.yandex.div2.PropertyVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final PropertyVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new PropertyVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f50508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<String> f50509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<String> f50510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f50511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivEvaluableType>> f50512e;

    /* JADX INFO: compiled from: PropertyVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public PropertyVariableTemplate(Field<Expression<String>> field, Field<String> field2, Field<String> field3, Field<List<DivActionTemplate>> field4, Field<Expression<DivEvaluableType>> field5) {
        this.f50508a = field;
        this.f50509b = field2;
        this.f50510c = field3;
        this.f50511d = field4;
        this.f50512e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ PropertyVariableTemplate(ParsingEnvironment parsingEnvironment, PropertyVariableTemplate propertyVariableTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : propertyVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PropertyVariableTemplate(ParsingEnvironment parsingEnvironment, PropertyVariableTemplate propertyVariableTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
