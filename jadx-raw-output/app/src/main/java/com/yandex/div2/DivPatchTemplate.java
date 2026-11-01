package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatchTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPatchTemplate implements JSONSerializable, JsonTemplate<DivPatch> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48358e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<DivPatch.Mode> f48359f = Expression.Companion.constant$default(Expression.Companion, DivPatch.Mode.PARTIAL, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPatchTemplate> f48360g = new bk.p<ParsingEnvironment, JSONObject, DivPatchTemplate>() { // from class: com.yandex.div2.DivPatchTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPatchTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivPatchTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<List<ChangeTemplate>> f48361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivPatch.Mode>> f48362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f48364d;

    /* JADX INFO: compiled from: DivPatchTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivPatchTemplate(Field<List<ChangeTemplate>> field, Field<Expression<DivPatch.Mode>> field2, Field<List<DivActionTemplate>> field3, Field<List<DivActionTemplate>> field4) {
        this.f48361a = field;
        this.f48362b = field2;
        this.f48363c = field3;
        this.f48364d = field4;
    }

    /* JADX INFO: compiled from: DivPatchTemplate.kt */
    public static final class ChangeTemplate implements JSONSerializable, JsonTemplate<DivPatch.Change> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f48365c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final bk.p<ParsingEnvironment, JSONObject, ChangeTemplate> f48366d = new bk.p<ParsingEnvironment, JSONObject, ChangeTemplate>() { // from class: com.yandex.div2.DivPatchTemplate$ChangeTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPatchTemplate.ChangeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivPatchTemplate.ChangeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Field<String> f48367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Field<List<DivTemplate>> f48368b;

        /* JADX INFO: compiled from: DivPatchTemplate.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(ck.i iVar) {
                this();
            }
        }

        public ChangeTemplate(Field<String> field, Field<List<DivTemplate>> field2) {
            this.f48367a = field;
            this.f48368b = field2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().G5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        public /* synthetic */ ChangeTemplate(ParsingEnvironment parsingEnvironment, ChangeTemplate changeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
            this(parsingEnvironment, (i10 & 2) != 0 ? null : changeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ChangeTemplate(ParsingEnvironment parsingEnvironment, ChangeTemplate changeTemplate, boolean z10, JSONObject jSONObject) {
            Field.Companion companion = Field.Companion;
            this(companion.nullField(false), companion.nullField(false));
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivPatchTemplate(ParsingEnvironment parsingEnvironment, DivPatchTemplate divPatchTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPatchTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivPatchTemplate(ParsingEnvironment parsingEnvironment, DivPatchTemplate divPatchTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<List<ChangeTemplate>>) companion.nullField(false), (Field<Expression<DivPatch.Mode>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
