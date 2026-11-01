package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivStrokeStyleTemplate implements JSONSerializable, JsonTemplate<DivStrokeStyle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f49160a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleTemplate> f49161b = new bk.p<ParsingEnvironment, JSONObject, DivStrokeStyleTemplate>() { // from class: com.yandex.div2.DivStrokeStyleTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivStrokeStyleTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivStrokeStyleTemplate.a.b(DivStrokeStyleTemplate.f49160a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivStrokeStyleTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivStrokeStyleTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivStrokeStyleTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().J7().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivStrokeStyleTemplate.kt */
    public static final class b extends DivStrokeStyleTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivStrokeStyleDashedTemplate f49162c;

        public b(DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate) {
            super(null);
            this.f49162c = divStrokeStyleDashedTemplate;
        }

        public final DivStrokeStyleDashedTemplate b() {
            return this.f49162c;
        }
    }

    /* JADX INFO: compiled from: DivStrokeStyleTemplate.kt */
    public static final class c extends DivStrokeStyleTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivStrokeStyleSolidTemplate f49163c;

        public c(DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate) {
            super(null);
            this.f49163c = divStrokeStyleSolidTemplate;
        }

        public final DivStrokeStyleSolidTemplate b() {
            return this.f49163c;
        }
    }

    public DivStrokeStyleTemplate() {
    }

    public /* synthetic */ DivStrokeStyleTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "solid";
        }
        if (this instanceof b) {
            return "dashed";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J7().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
