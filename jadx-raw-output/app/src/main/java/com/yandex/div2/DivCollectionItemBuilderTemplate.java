package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCollectionItemBuilderTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivCollectionItemBuilderTemplate implements JSONSerializable, JsonTemplate<DivCollectionItemBuilder> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46633d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f46634e = "it";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCollectionItemBuilderTemplate> f46635f = new bk.p<ParsingEnvironment, JSONObject, DivCollectionItemBuilderTemplate>() { // from class: com.yandex.div2.DivCollectionItemBuilderTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCollectionItemBuilderTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivCollectionItemBuilderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<JSONArray>> f46636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<String> f46637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<List<PrototypeTemplate>> f46638c;

    /* JADX INFO: compiled from: DivCollectionItemBuilderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivCollectionItemBuilderTemplate(Field<Expression<JSONArray>> field, Field<String> field2, Field<List<PrototypeTemplate>> field3) {
        this.f46636a = field;
        this.f46637b = field2;
        this.f46638c = field3;
    }

    /* JADX INFO: compiled from: DivCollectionItemBuilderTemplate.kt */
    public static final class PrototypeTemplate implements JSONSerializable, JsonTemplate<DivCollectionItemBuilder.Prototype> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f46639d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Expression<Boolean> f46640e = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, PrototypeTemplate> f46641f = new bk.p<ParsingEnvironment, JSONObject, PrototypeTemplate>() { // from class: com.yandex.div2.DivCollectionItemBuilderTemplate$PrototypeTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivCollectionItemBuilderTemplate.PrototypeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivCollectionItemBuilderTemplate.PrototypeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<DivTemplate> f46642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<Expression<String>> f46643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Field<Expression<Boolean>> f46644c;

        /* JADX INFO: compiled from: DivCollectionItemBuilderTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public PrototypeTemplate(Field<DivTemplate> field, Field<Expression<String>> field2, Field<Expression<Boolean>> field3) {
            this.f46642a = field;
            this.f46643b = field2;
            this.f46644c = field3;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().h2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ PrototypeTemplate(ParsingEnvironment parsingEnvironment, PrototypeTemplate prototypeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : prototypeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PrototypeTemplate(ParsingEnvironment parsingEnvironment, PrototypeTemplate prototypeTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivCollectionItemBuilderTemplate(ParsingEnvironment parsingEnvironment, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCollectionItemBuilderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCollectionItemBuilderTemplate(ParsingEnvironment parsingEnvironment, DivCollectionItemBuilderTemplate divCollectionItemBuilderTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
